// Live 2-4 Player Online Multiplayer + Cross-Network 4G/5G/WiFi Quad Transport + In-Game Chat
// Transports:
//  1) BroadcastChannel (0-latency instant sync across tabs on same device/browser)
//  2) Same-Origin /api/mp Serverless Relay (matches /api/mp.mjs msgs/snap schema + EMQX bridge)
//  3) Cloud MQTT-over-WSS (TLS port 443 via EMQX & HiveMQ - works directly on 4G/5G CGNAT & any WiFi)
//  4) Cloud ntfy HTTPS/WSS Relay (independent Port-443 HTTPS/WSS fallback across firewalls)

const WSS_BROKERS = [
  'wss://broker.emqx.io:8084/mqtt',
  'wss://broker.hivemq.com:8884/mqtt',
];

function isDiscordActivity() {
  if (typeof window === 'undefined' || !window.location) return false;
  const host = window.location.hostname || '';
  return host.endsWith('.discordsays.com') || (window.location.search || '').includes('frame_id=');
}

function getMqttBrokers() {
  if (isDiscordActivity()) {
    const host = window.location.host;
    return [
      `wss://${host}/emqx/mqtt`,
      `wss://${host}/.proxy/emqx/mqtt`,
      `wss://${host}/hivemq/mqtt`,
    ];
  }
  return WSS_BROKERS;
}

function getNtfyEndpoints() {
  if (isDiscordActivity()) {
    const origin = window.location.origin;
    const host = window.location.host;
    return {
      httpBase: `${origin}/ntfy`,
      wsBase: `wss://${host}/ntfy`,
      discordProxy: true,
    };
  }
  return {
    httpBase: 'https://ntfy.sh',
    wsBase: 'wss://ntfy.sh',
    discordProxy: false,
  };
}

export function generateRoomCode() {
  const num = 1000 + Math.floor(Math.random() * 9000);
  return `UF${num}`;
}

export function normalizeRoomCode(raw) {
  return String(raw || '').toUpperCase().replace(/[^A-Z0-9]/g, '').slice(0, 8);
}

export function parseMpUrlParam(searchStr = (typeof window !== 'undefined' ? window.location.search : '')) {
  try {
    const params = new URLSearchParams(searchStr);
    const code = normalizeRoomCode(params.get('mp'));
    return code.length >= 4 ? code : '';
  } catch {
    return '';
  }
}

export function buildInviteUrl(roomCode, loc = (typeof window !== 'undefined' ? window.location : null)) {
  if (!loc) return `?mp=${roomCode}`;
  const url = new URL(loc.href);
  url.searchParams.set('mp', roomCode);
  return url.toString();
}

export function createClientId() {
  return `u_${Math.random().toString(36).slice(2, 8)}${Date.now().toString(36).slice(-4)}`;
}

// --- Binary MQTT 3.1.1 Packet Helpers (for TLS Port-443 WSS Relay on 4G/WiFi) ---
export function mqttEncodeRemLen(len) {
  const out = [];
  do {
    let b = len % 128;
    len = Math.floor(len / 128);
    if (len > 0) b |= 0x80;
    out.push(b);
  } while (len > 0);
  return out;
}

export function mqttEncodeStr(str) {
  const bytes = new TextEncoder().encode(str);
  return [(bytes.length >> 8) & 0xff, bytes.length & 0xff, ...bytes];
}

export function mqttConnectPacket(clientId) {
  const vh = [...mqttEncodeStr('MQTT'), 4, 0x02, 0, 45];
  const pl = mqttEncodeStr(clientId);
  return new Uint8Array([0x10, ...mqttEncodeRemLen(vh.length + pl.length), ...vh, ...pl]);
}

export function mqttSubscribePacket(pid, topic) {
  const vh = [(pid >> 8) & 0xff, pid & 0xff];
  const pl = [...mqttEncodeStr(topic), 0];
  return new Uint8Array([0x82, ...mqttEncodeRemLen(vh.length + pl.length), ...vh, ...pl]);
}

export function mqttPublishPacket(topic, text) {
  const t = mqttEncodeStr(topic);
  const p = Array.from(new TextEncoder().encode(text));
  return new Uint8Array([0x30, ...mqttEncodeRemLen(t.length + p.length), ...t, ...p]);
}

// 1) BroadcastChannel transport (same-device instant sync)
class BroadcastTransport {
  constructor(room, onMsg, onReady) {
    this.room = room;
    this.onMsg = onMsg;
    this.ch = typeof BroadcastChannel !== 'undefined' ? new BroadcastChannel(`uf_mp_v1_${room}`) : null;
    if (this.ch) {
      this.ch.onmessage = (e) => {
        if (e.data) this.onMsg(e.data);
      };
      onReady?.('bc');
    }
  }
  send(dir, packet) {
    if (this.ch) {
      try { this.ch.postMessage({ dir, packet }); } catch {}
    }
  }
  close() {
    if (this.ch) {
      try { this.ch.close(); } catch {}
      this.ch = null;
    }
  }
}

// 2) Same-origin /api/mp HTTP Polling & Snapshot Relay (compatible with both /api/mp.mjs `msgs` and local `packets`)
class HttpApiTransport {
  constructor(room, clientId, listenDir, onMsg, onReady) {
    this.room = room;
    this.clientId = clientId;
    this.listenDir = listenDir;
    this.onMsg = onMsg;
    this.onReady = onReady;
    this.closed = false;
    this.ready = false;
    this.after = 0;
    this.afterSnap = 0;
    this.timer = null;
    this.disabled = false;
  }
  start() {
    if (typeof fetch === 'undefined' || this.closed || typeof window === 'undefined') return;
    if (!window.location?.origin?.startsWith('http')) return;
    const poll = async () => {
      if (this.closed || this.disabled) return;
      let delayMs = 240;
      try {
        const q = `room=${encodeURIComponent(this.room)}&dir=${this.listenDir}&after=${this.after}&afterSnap=${this.afterSnap}&from=${encodeURIComponent(this.clientId)}`;
        const res = await fetch(`/api/mp?${q}`, { cache: 'no-store' });
        if (res.status === 404 || res.status === 405 || res.status === 501) {
          this.disabled = true;
          return;
        }
        if (res.ok) {
          if (!this.ready) {
            this.ready = true;
            this.onReady?.('http');
          }
          const data = await res.json();
          const list = Array.isArray(data.msgs) ? data.msgs : (Array.isArray(data.packets) ? data.packets : []);
          if (typeof data.seq === 'number' && data.seq > this.after) {
            this.after = data.seq;
          }
          for (const item of list) {
            if (item?.seq && item.seq > this.after) this.after = item.seq;
            this.onMsg({ dir: this.listenDir, packet: item?.packet ?? item });
          }
          const snapObj = data.snap?.packet ?? data.snap;
          if (snapObj && (data.snapSeq || 0) > this.afterSnap) {
            this.afterSnap = data.snapSeq;
            this.onMsg({ dir: 'h2c', packet: snapObj });
          }
          delayMs = snapObj ? 160 : 220;
        } else {
          delayMs = 1500;
        }
      } catch {
        delayMs = 1200;
      }
      if (!this.closed && !this.disabled) {
        this.timer = setTimeout(poll, delayMs);
      }
    };
    this.timer = setTimeout(poll, 45);
  }
  async send(dir, packet) {
    if (typeof fetch === 'undefined' || this.disabled || this.closed || typeof window === 'undefined') return;
    if (!window.location?.origin?.startsWith('http')) return;
    try {
      await fetch('/api/mp', {
        method: 'POST',
        headers: { 'content-type': 'application/json' },
        body: JSON.stringify({ room: this.room, dir, from: this.clientId, packet }),
      });
    } catch {}
  }
  close() {
    this.closed = true;
    this.ready = false;
    if (this.timer) clearTimeout(this.timer);
  }
}

// 3) Cloud MQTT-over-WSS Broker Connection (TLS Port 443 - works over 4G/5G CGNAT & public/home WiFi)
class MqttSingleBroker {
  constructor(url, subTopic, pubTopic, listenDir, { onReady, onMsg } = {}) {
    this.url = url;
    this.subTopic = subTopic;
    this.pubTopic = pubTopic;
    this.listenDir = listenDir;
    this.onReady = onReady;
    this.onMsg = onMsg;
    this.ws = null;
    this.ready = false;
    this.closed = false;
    this.pingTimer = null;
    this.retryTimer = null;
    this._decoder = typeof TextDecoder !== 'undefined' ? new TextDecoder() : null;
    this._connect();
  }

  _connect() {
    if (this.closed || typeof WebSocket === 'undefined') return;
    this.ready = false;
    let ws;
    try {
      ws = new WebSocket(this.url, 'mqtt');
      ws.binaryType = 'arraybuffer';
    } catch {
      this._scheduleRetry();
      return;
    }
    this.ws = ws;
    const mqttCid = `uf_${Math.random().toString(36).slice(2, 10)}_${Date.now().toString(36).slice(-4)}`;

    ws.onopen = () => {
      if (this.closed || this.ws !== ws) return;
      try {
        ws.send(mqttConnectPacket(mqttCid));
      } catch {}
    };

    ws.onmessage = (ev) => {
      if (this.closed || this.ws !== ws || !this._decoder) return;
      const u8 = ev.data instanceof ArrayBuffer ? new Uint8Array(ev.data) : null;
      if (!u8 || u8.length < 2) return;
      let offset = 0;
      while (offset + 2 <= u8.length) {
        const header = u8[offset];
        const pktType = header >> 4;
        let mult = 1;
        let rem = 0;
        let idx = offset + 1;
        let lenDone = false;
        while (idx < u8.length) {
          const b = u8[idx++];
          rem += (b & 127) * mult;
          if ((b & 128) === 0) {
            lenDone = true;
            break;
          }
          mult *= 128;
        }
        if (!lenDone || idx + rem > u8.length) break;

        if (pktType === 2) {
          try {
            ws.send(mqttSubscribePacket(1, this.subTopic));
          } catch {}
        } else if (pktType === 9) {
          if (!this.ready) {
            this.ready = true;
            this._startPing();
            this.onReady?.();
          }
        } else if (pktType === 3) {
          const tLen = (u8[idx] << 8) | u8[idx + 1];
          const qos = (header >> 1) & 3;
          const pStart = idx + 2 + tLen + (qos > 0 ? 2 : 0);
          const pEnd = idx + rem;
          if (pStart <= pEnd) {
            const text = this._decoder.decode(u8.subarray(pStart, pEnd));
            try {
              const parsed = JSON.parse(text);
              this.onMsg?.({ dir: this.listenDir, packet: parsed });
            } catch {}
          }
        }
        offset = idx + rem;
      }
    };

    ws.onerror = () => {};
    ws.onclose = () => {
      this._stopPing();
      this.ready = false;
      if (!this.closed && this.ws === ws) this._scheduleRetry();
    };
  }

  _startPing() {
    this._stopPing();
    this.pingTimer = setInterval(() => {
      if (this.ws && this.ws.readyState === WebSocket.OPEN) {
        try { this.ws.send(new Uint8Array([0xc0, 0x00])); } catch {}
      }
    }, 20000);
  }

  _stopPing() {
    if (this.pingTimer) {
      clearInterval(this.pingTimer);
      this.pingTimer = null;
    }
  }

  _scheduleRetry() {
    if (this.closed) return;
    if (this.retryTimer) clearTimeout(this.retryTimer);
    this.retryTimer = setTimeout(() => this._connect(), 2600);
  }

  send(text) {
    if (!this.ready || !this.ws || this.ws.readyState !== WebSocket.OPEN) return false;
    try {
      this.ws.send(mqttPublishPacket(this.pubTopic, text));
      return true;
    } catch {
      return false;
    }
  }

  close() {
    this.closed = true;
    this.ready = false;
    this._stopPing();
    if (this.retryTimer) { clearTimeout(this.retryTimer); this.retryTimer = null; }
    try {
      if (this.ws && this.ws.readyState === WebSocket.OPEN) {
        this.ws.send(new Uint8Array([0xe0, 0x00]));
      }
      this.ws?.close();
    } catch {}
    this.ws = null;
  }
}

class MqttWssRelay {
  constructor(roomCode, listenDir, onMsg, onReady) {
    const pubDir = listenDir === 'c2h' ? 'h2c' : 'c2h';
    // Shared topic prefix bridges seamlessly with /api/mp.mjs EMQX cross-instance bridge as well!
    const subTopic = `bltts/mp/v2/${roomCode}/${listenDir}`;
    const pubTopic = `bltts/mp/v2/${roomCode}/${pubDir}`;
    this.pubDir = pubDir;
    this.ready = false;
    this.brokers = [];
    if (typeof WebSocket === 'undefined' || typeof window === 'undefined') return;
    this.brokers = getMqttBrokers().map(
      (url) =>
        new MqttSingleBroker(url, subTopic, pubTopic, listenDir, {
          onReady: () => {
            if (!this.ready) {
              this.ready = true;
              onReady?.('wss');
            }
          },
          onMsg,
        })
    );
  }

  send(dir, packet) {
    if (!this.brokers.length || dir !== this.pubDir) return false;
    const text = JSON.stringify(packet);
    let sent = false;
    for (const b of this.brokers) {
      if (b.send(text)) sent = true;
    }
    return sent;
  }

  close() {
    this.ready = false;
    for (const b of this.brokers) b.close();
    this.brokers = [];
  }
}

// 4) Independent Port-443 HTTPS/WSS Relay via ntfy.sh (resilient fallback on strict 4G/campus firewalls)
class NtfyHttpsRelay {
  constructor(roomCode, listenDir, onMsg, onReady) {
    this.listenDir = listenDir;
    this.pubDir = listenDir === 'c2h' ? 'h2c' : 'c2h';
    this.subTopic = `uno-friends-v1-${roomCode}-${listenDir}`;
    this.pubTopic = `uno-friends-v1-${roomCode}-${this.pubDir}`;
    this.onMsg = onMsg;
    this.onReady = onReady;
    this.endpoints = getNtfyEndpoints();
    this.ws = null;
    this.ready = false;
    this.closed = false;
    this.retryTimer = null;
    if (typeof WebSocket !== 'undefined' && typeof window !== 'undefined' && window.location?.origin?.startsWith('http')) {
      this._connect();
    }
  }

  _connect() {
    if (this.closed || typeof WebSocket === 'undefined') return;
    this.ready = false;
    let ws;
    try {
      ws = new WebSocket(`${this.endpoints.wsBase}/${encodeURIComponent(this.subTopic)}/ws`);
    } catch {
      this._scheduleRetry();
      return;
    }
    this.ws = ws;
    ws.onopen = () => {
      if (this.closed || this.ws !== ws) return;
      this.ready = true;
      this.onReady?.('ntfy');
    };
    ws.onmessage = (ev) => {
      if (this.closed || this.ws !== ws) return;
      try {
        const frame = JSON.parse(String(ev.data || ''));
        if (frame?.event === 'message' && typeof frame.message === 'string') {
          const parsed = JSON.parse(frame.message);
          this.onMsg?.({ dir: this.listenDir, packet: parsed });
        }
      } catch {}
    };
    ws.onerror = () => {};
    ws.onclose = () => {
      this.ready = false;
      if (!this.closed && this.ws === ws) this._scheduleRetry();
    };
  }

  _scheduleRetry() {
    if (this.closed) return;
    if (this.retryTimer) clearTimeout(this.retryTimer);
    this.retryTimer = setTimeout(() => this._connect(), 3000);
  }

  send(dir, packet) {
    if (this.closed || dir !== this.pubDir || typeof fetch === 'undefined' || !this.ready) return false;
    try {
      fetch(`${this.endpoints.httpBase}/${encodeURIComponent(this.pubTopic)}`, {
        method: 'POST',
        body: JSON.stringify(packet),
      }).catch(() => {});
      return true;
    } catch {
      return false;
    }
  }

  close() {
    this.closed = true;
    this.ready = false;
    if (this.retryTimer) { clearTimeout(this.retryTimer); this.retryTimer = null; }
    try { this.ws?.close(); } catch {}
    this.ws = null;
  }
}

// Inline Blob Web Worker ticker so Host continues running AI turns even if tab is backgrounded
export function startHostBlobWorker(onTick, intervalMs = 100) {
  if (typeof Worker === 'undefined' || typeof Blob === 'undefined') {
    const id = setInterval(onTick, intervalMs);
    return () => clearInterval(id);
  }
  try {
    const code = `setInterval(() => postMessage(1), ${Math.max(40, intervalMs | 0)});`;
    const blob = new Blob([code], { type: 'application/javascript' });
    const url = URL.createObjectURL(blob);
    const worker = new Worker(url);
    worker.onmessage = () => onTick();
    return () => {
      try { worker.terminate(); } catch {}
      try { URL.revokeObjectURL(url); } catch {}
    };
  } catch {
    const id = setInterval(onTick, intervalMs);
    return () => clearInterval(id);
  }
}

export class MultiplayerClient {
  constructor({ onRoomUpdate, onGameState, onChatOrEvent, onChatMessage, onTransportChange, onError } = {}) {
    this.clientId = createClientId();
    this.roomCode = '';
    this.isHost = false;
    this.playerName = 'Player';
    this.avatarId = 0;
    this.powerIdx = 0;

    this.onRoomUpdate = onRoomUpdate || (() => {});
    this.onGameState = onGameState || (() => {});
    this.onChatOrEvent = onChatOrEvent || (() => {});
    this.onChatMessage = onChatMessage || (() => {});
    this.onTransportChange = onTransportChange || (() => {});
    this.onError = onError || (() => {});

    this.seats = [null, null, null, null];
    this.fillBots = true;
    this.roomConfig = {
      targetScore: 250,
      stacking: true,
      sevenZero: false,
      challengePlus4: true,
      specialPowers: true,
    };
    this.inMatch = false;

    this.seenMsgs = new Set();
    this.outSeq = 1;
    this.hostLobbySeq = 0;
    this.hostSnapSeq = 0;
    this.lastLobbySeq = -1;
    this.lastMatchSeq = -1;
    this.activeTransports = new Set();

    this.bc = null;
    this.http = null;
    this.mqtt = null;
    this.ntfy = null;
    this.heartbeatTimer = null;
  }

  _resetRoomState() {
    this.seats = [null, null, null, null];
    this.inMatch = false;
    this.seenMsgs.clear();
    this.hostLobbySeq = 0;
    this.hostSnapSeq = 0;
    this.lastLobbySeq = -1;
    this.lastMatchSeq = -1;
  }

  hostRoom(playerName, avatarId = 0, powerIdx = 0) {
    this.leaveRoom();
    this.roomCode = generateRoomCode();
    this.isHost = true;
    this.playerName = playerName || 'Host';
    this.avatarId = avatarId;
    this.powerIdx = powerIdx;
    this._resetRoomState();
    this.seats[0] = {
      id: this.clientId,
      name: this.playerName,
      seat: 0,
      avatarId,
      powerIdx,
      ready: true,
    };
    this._connectTransports('c2h');
    this._broadcastLobby();
    // Periodic gentle lobby refresh helps slow 4G guests pick up room state quickly
    this.heartbeatTimer = setInterval(() => {
      if (this.roomCode && this.isHost && !this.inMatch) {
        this._broadcastLobby();
      }
    }, 3500);
    this.onRoomUpdate(this.getRoomSnapshot());
    return this.roomCode;
  }

  joinRoom(code, playerName, avatarId = 0, powerIdx = 0) {
    const clean = normalizeRoomCode(code);
    if (!clean) {
      this.onError('Invalid room code');
      return false;
    }
    this.leaveRoom();
    this.roomCode = clean;
    this.isHost = false;
    this.playerName = playerName || 'Guest';
    this.avatarId = avatarId;
    this.powerIdx = powerIdx;
    this._resetRoomState();
    this._connectTransports('h2c');

    const sendJoin = () => {
      this.sendToHost({
        type: 'join_req',
        from: this.clientId,
        name: this.playerName,
        avatarId: this.avatarId,
        powerIdx: this.powerIdx,
      });
    };
    sendJoin();
    this.heartbeatTimer = setInterval(() => {
      if (!this.roomCode || this.isHost) return;
      if (this.getMySeat() < 0) sendJoin();
    }, 1300);
    this.onRoomUpdate(this.getRoomSnapshot());
    return true;
  }

  leaveRoom() {
    if (this.roomCode) {
      if (this.isHost) {
        this._send('h2c', { type: 'room_closed', from: this.clientId });
      } else {
        this.sendToHost({ type: 'leave', from: this.clientId });
      }
    }
    if (this.bc) { this.bc.close(); this.bc = null; }
    if (this.http) { this.http.close(); this.http = null; }
    if (this.mqtt) { this.mqtt.close(); this.mqtt = null; }
    if (this.ntfy) { this.ntfy.close(); this.ntfy = null; }
    if (this.heartbeatTimer) { clearInterval(this.heartbeatTimer); this.heartbeatTimer = null; }
    this.activeTransports.clear();
    this.roomCode = '';
    this.isHost = false;
    this._resetRoomState();
    this.onTransportChange(this.getTransportSummary());
    this.onRoomUpdate(this.getRoomSnapshot());
  }

  _connectTransports(listenDir) {
    const handler = (ev) => this._handleIncoming(ev);
    const markReady = (kind) => {
      if (!this.activeTransports.has(kind)) {
        this.activeTransports.add(kind);
        this.onTransportChange(this.getTransportSummary());
        // Once an online relay connects over 4G/WiFi, re-announce join/lobby immediately!
        if (kind === 'wss' || kind === 'ntfy' || kind === 'http') {
          if (this.isHost && !this.inMatch) {
            this._broadcastLobby();
          } else if (!this.isHost && this.getMySeat() < 0) {
            this.sendToHost({
              type: 'join_req',
              from: this.clientId,
              name: this.playerName,
              avatarId: this.avatarId,
              powerIdx: this.powerIdx,
            });
          }
        }
      }
    };

    this.bc = new BroadcastTransport(this.roomCode, handler, markReady);
    this.http = new HttpApiTransport(this.roomCode, this.clientId, listenDir, handler, markReady);
    this.http.start();
    this.mqtt = new MqttWssRelay(this.roomCode, listenDir, handler, markReady);
    this.ntfy = new NtfyHttpsRelay(this.roomCode, listenDir, handler, markReady);
    this.onTransportChange(this.getTransportSummary());
  }

  getTransportSummary() {
    const online = this.activeTransports.has('wss') || this.activeTransports.has('ntfy') || this.activeTransports.has('http');
    const parts = [];
    if (this.activeTransports.has('wss')) parts.push('WSS');
    if (this.activeTransports.has('ntfy')) parts.push('HTTPS');
    if (this.activeTransports.has('http')) parts.push('Relay');
    if (this.activeTransports.has('bc')) parts.push('Local');
    return {
      online,
      channels: parts,
      connected: !!this.roomCode,
    };
  }

  _send(dir, packet) {
    if (!this.roomCode) return;
    const seqNum = this.outSeq++;
    const envelope = {
      ...packet,
      _mid: `${this.clientId}_${seqNum}`,
      _from: this.clientId,
      _seq: seqNum,
    };
    this.bc?.send(dir, envelope);
    this.http?.send(dir, envelope);
    this.mqtt?.send(dir, envelope);
    this.ntfy?.send(dir, envelope);
  }

  sendToHost(packet) {
    this._send('c2h', { ...packet, from: this.clientId });
  }

  broadcastFromHost(packet) {
    if (!this.isHost) return;
    this._send('h2c', { ...packet, from: this.clientId });
  }

  sendChat(rawText, isEmote = false) {
    const text = String(rawText || '').trim().slice(0, 100);
    if (!text) return false;
    if (!this.roomCode) return false;
    if (this.isHost) {
      const chatPkt = {
        type: 'chat_msg',
        id: `c_${this.clientId}_${this.outSeq}`,
        from: this.clientId,
        seat: 0,
        name: this.playerName,
        avatarId: this.avatarId,
        text,
        isEmote: !!isEmote,
        ts: Date.now(),
      };
      this.onChatMessage(chatPkt);
      this.broadcastFromHost(chatPkt);
      return true;
    }
    this.sendToHost({ type: 'chat_req', text, isEmote: !!isEmote });
    return true;
  }

  _handleIncoming({ dir, packet }) {
    if (!packet || packet.from === this.clientId) return;
    if (packet._mid) {
      if (this.seenMsgs.has(packet._mid)) return;
      this.seenMsgs.add(packet._mid);
      if (this.seenMsgs.size > 500) {
        const first = this.seenMsgs.values().next().value;
        this.seenMsgs.delete(first);
      }
    }

    if (this.isHost && dir === 'c2h') {
      this._handleClientPacket(packet);
    } else if (!this.isHost && dir === 'h2c') {
      this._handleHostPacket(packet);
    }
  }

  _handleClientPacket(pkt) {
    if (pkt.type === 'join_req') {
      let idx = this.seats.findIndex((s) => s && s.id === pkt.from);
      if (idx < 0) {
        idx = this.seats.findIndex((s) => s === null);
      }
      if (idx >= 0) {
        this.seats[idx] = {
          id: pkt.from,
          name: String(pkt.name || `Player ${idx + 1}`).slice(0, 14),
          seat: idx,
          avatarId: pkt.avatarId || idx,
          powerIdx: pkt.powerIdx || 0,
          ready: false,
        };
        this._broadcastLobby();
        this.onRoomUpdate(this.getRoomSnapshot());
      } else {
        this.broadcastFromHost({ type: 'room_full', target: pkt.from });
      }
    } else if (pkt.type === 'leave') {
      const idx = this.seats.findIndex((s) => s && s.id === pkt.from);
      if (idx > 0) {
        this.seats[idx] = null;
        this._broadcastLobby();
        this.onRoomUpdate(this.getRoomSnapshot());
      }
    } else if (pkt.type === 'set_ready') {
      const idx = this.seats.findIndex((s) => s && s.id === pkt.from);
      if (idx > 0) {
        this.seats[idx].ready = !!pkt.ready;
        this._broadcastLobby();
        this.onRoomUpdate(this.getRoomSnapshot());
      }
    } else if (pkt.type === 'action') {
      const idx = this.seats.findIndex((s) => s && s.id === pkt.from);
      if (idx >= 0) {
        this.onChatOrEvent({ type: 'remote_action', seat: idx, action: pkt.action });
      }
    } else if (pkt.type === 'chat_req') {
      const idx = this.seats.findIndex((s) => s && s.id === pkt.from);
      const occ = idx >= 0 ? this.seats[idx] : null;
      const text = String(pkt.text || '').trim().slice(0, 100);
      if (!text) return;
      const chatPkt = {
        type: 'chat_msg',
        id: pkt._mid || `c_${pkt.from}_${Date.now()}`,
        from: pkt.from,
        seat: idx >= 0 ? idx : 1,
        name: occ?.name || 'Player',
        avatarId: occ?.avatarId ?? 1,
        text,
        isEmote: !!pkt.isEmote,
        ts: Date.now(),
      };
      this.onChatMessage(chatPkt);
      this.broadcastFromHost(chatPkt);
    }
  }

  _handleHostPacket(pkt) {
    if (pkt.type === 'lobby_state') {
      const seq = Number(pkt.lobbySeq ?? 0);
      if (seq > 0 && seq <= this.lastLobbySeq) return;
      if (seq > 0) this.lastLobbySeq = seq;
      this.seats = pkt.seats;
      this.fillBots = !!pkt.fillBots;
      this.roomConfig = { ...this.roomConfig, ...(pkt.roomConfig || {}) };
      this.inMatch = !!pkt.inMatch;
      this.onRoomUpdate(this.getRoomSnapshot());
    } else if (pkt.type === 'room_closed') {
      this.leaveRoom();
      this.onError('Host closed room');
    } else if (pkt.type === 'room_full' && pkt.target === this.clientId) {
      this.onError('Room is full (4 players max)');
      this.leaveRoom();
    } else if (pkt.type === 'match_snap') {
      const seq = Number(pkt.snapSeq ?? 0);
      if (seq > 0 && seq < this.lastMatchSeq) return;
      if (seq > 0) this.lastMatchSeq = seq;
      this.inMatch = true;
      let mySeat = Array.isArray(pkt.seatIds) ? pkt.seatIds.indexOf(this.clientId) : -1;
      if (mySeat < 0) mySeat = this.getMySeat();
      if (mySeat >= 0 && pkt.views && pkt.views[mySeat]) {
        this.onGameState(pkt.views[mySeat], mySeat);
      }
    } else if (pkt.type === 'chat_msg') {
      this.onChatMessage(pkt);
    }
  }

  _broadcastLobby() {
    this.hostLobbySeq += 1;
    this.broadcastFromHost({
      type: 'lobby_state',
      lobbySeq: this.hostLobbySeq,
      seats: this.seats,
      fillBots: this.fillBots,
      roomConfig: this.roomConfig,
      inMatch: this.inMatch,
    });
  }

  setReady(ready) {
    if (this.isHost) return;
    this.sendToHost({ type: 'set_ready', ready: !!ready });
  }

  updateHostSettings({ fillBots, roomConfig } = {}) {
    if (!this.isHost) return;
    if (fillBots !== undefined) this.fillBots = !!fillBots;
    if (roomConfig) this.roomConfig = { ...this.roomConfig, ...roomConfig };
    this._broadcastLobby();
    this.onRoomUpdate(this.getRoomSnapshot());
  }

  sendMatchAction(action) {
    if (this.isHost) {
      this.onChatOrEvent({ type: 'remote_action', seat: 0, action });
    } else {
      this.sendToHost({ type: 'action', action });
    }
  }

  broadcastMatchSnapshot(matchObj) {
    if (!this.isHost || !matchObj) return;
    this.hostSnapSeq += 1;
    const views = {};
    const seatIds = [null, null, null, null];
    for (let s = 0; s < 4; s++) {
      if (this.seats[s]) {
        seatIds[s] = this.seats[s].id;
        views[s] = matchObj.serializeStateForSeat(s);
      }
    }
    this.broadcastFromHost({
      type: 'match_snap',
      snapSeq: this.hostSnapSeq,
      seatIds,
      views,
    });
  }

  getMySeat() {
    return this.seats.findIndex((s) => s && s.id === this.clientId);
  }

  getConnectedCount() {
    return this.seats.filter(Boolean).length;
  }

  getRoomSnapshot() {
    return {
      connected: !!this.roomCode,
      roomCode: this.roomCode,
      isHost: this.isHost,
      mySeat: this.getMySeat(),
      myId: this.clientId,
      seats: this.seats.map((s) => (s ? { ...s } : null)),
      fillBots: this.fillBots,
      roomConfig: { ...this.roomConfig },
      inMatch: this.inMatch,
      transport: this.getTransportSummary(),
    };
  }
}
