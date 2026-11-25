import test from 'node:test';
import assert from 'node:assert/strict';
import { UnoMatch, COLOR_RED, COLOR_BLUE } from '../uno-rules.js';
import {
  MultiplayerClient, generateRoomCode, normalizeRoomCode, parseMpUrlParam, buildInviteUrl,
  mqttConnectPacket, mqttSubscribePacket, mqttPublishPacket,
} from '../multiplayer.js';
import { isInputFocused } from '../game.js';

test('Room codes use UFxxxx prefix and URL ?mp= helper parses cleanly', () => {
  const code = generateRoomCode();
  assert.match(code, /^UF\d{4}$/);
  assert.equal(normalizeRoomCode(' uf-1234! '), 'UF1234');
  assert.equal(parseMpUrlParam('?mp=uf4821'), 'UF4821');
  assert.equal(parseMpUrlParam(''), '');
  assert.equal(buildInviteUrl('UF4821', { href: 'http://127.0.0.1:8080/uno/' }), 'http://127.0.0.1:8080/uno/?mp=UF4821');
});

test('isInputFocused prevents canvas keyboard hijacking when typing in lobby inputs', () => {
  assert.equal(isInputFocused({ tagName: 'INPUT' }), true);
  assert.equal(isInputFocused({ tagName: 'textarea' }), true);
  assert.equal(isInputFocused({ tagName: 'SELECT' }), true);
  assert.equal(isInputFocused({ tagName: 'CANVAS' }), false);
  assert.equal(isInputFocused(null), false);
});

test('2-4P MultiplayerClient join, ready, private hand sync, and turn action work over BroadcastChannel', async () => {
  // Node 22 supports BroadcastChannel globally on same worker!
  let hostMatch = null;
  let guestView = null;
  let guestSeat = -1;

  const host = new MultiplayerClient({
    onChatOrEvent: ({ seat, action }) => {
      if (action.type === 'play') hostMatch.playCard(seat, action.cardId, action.color || 0);
      host.broadcastMatchSnapshot(hostMatch);
    },
  });
  const guest = new MultiplayerClient({
    onGameState: (view, mySeat) => {
      guestView = view;
      guestSeat = mySeat;
    },
  });

  const code = host.hostRoom('HostUser', 0, 0);
  assert.ok(code.startsWith('UF'));
  assert.equal(guest.joinRoom(code, 'GuestUser', 1, 1), true);

  await new Promise((r) => setTimeout(r, 80));
  assert.equal(host.getConnectedCount(), 2);
  assert.equal(guest.getMySeat(), 1);

  guest.setReady(true);
  await new Promise((r) => setTimeout(r, 50));
  assert.equal(host.seats[1].ready, true);

  // Start match & verify private hand isolation between Seat 0 & Seat 1
  hostMatch = new UnoMatch({
    mode: 'multiplayer',
    targetScore: 0,
    seats: [
      { seat: 0, name: 'HostUser', isHuman: true, active: true },
      { seat: 1, name: 'GuestUser', isHuman: true, active: true },
      { seat: 2, name: 'Bot2', isHuman: false, active: true },
      { seat: 3, name: 'Bot3', isHuman: false, active: true },
    ],
  });
  hostMatch.turnSeat = 1;
  hostMatch.topCard = { id: 999, rank: 4, color: COLOR_BLUE };
  hostMatch.currentColor = COLOR_BLUE;
  hostMatch.players[1].hand = [{ id: 500, rank: 4, color: COLOR_RED }, { id: 501, rank: 8, color: COLOR_RED }];

  host.broadcastMatchSnapshot(hostMatch);
  await new Promise((r) => setTimeout(r, 60));

  assert.ok(guestView !== null);
  assert.equal(guestSeat, 1);
  assert.equal(guestView.players[0].hand, null); // Guest must NOT see Host hand
  assert.equal(guestView.players[1].hand.length, 2); // Guest sees own hand

  // Guest plays card 500 -> Host processes and broadcasts update
  guest.sendMatchAction({ type: 'play', cardId: 500 });
  await new Promise((r) => setTimeout(r, 80));

  assert.equal(guestView.topCard.id, 500);
  assert.equal(guestView.currentColor, COLOR_RED);
  assert.equal(guestView.players[1].hand.length, 1);

  host.leaveRoom();
  guest.leaveRoom();
});

test('Out-of-order stale lobby_state and match_snap packets never regress state', () => {
  let latestView = null;
  let resolvedSeat = -1;
  const guest = new MultiplayerClient({
    onGameState: (v, seat) => {
      latestView = v;
      resolvedSeat = seat;
    },
  });
  guest.roomCode = 'UF9999';
  guest.isHost = false;

  // Newer lobby_state #2 arrives first (guest seated at seat 1)
  guest._handleIncoming({
    dir: 'h2c',
    packet: {
      type: 'lobby_state',
      from: 'host1',
      _mid: 'host1_2',
      lobbySeq: 2,
      seats: [
        { id: 'host1', name: 'Host', seat: 0, ready: true },
        { id: guest.clientId, name: 'Guest', seat: 1, ready: false },
        null,
        null,
      ],
    },
  });
  assert.equal(guest.getMySeat(), 1);

  // Older polled lobby_state #1 arrives late (must be ignored!)
  guest._handleIncoming({
    dir: 'h2c',
    packet: {
      type: 'lobby_state',
      from: 'host1',
      _mid: 'host1_1',
      lobbySeq: 1,
      seats: [{ id: 'host1', name: 'Host', seat: 0, ready: true }, null, null, null],
    },
  });
  assert.equal(guest.getMySeat(), 1);

  // Newer match_snap #3 arrives before stale #1
  guest._handleIncoming({
    dir: 'h2c',
    packet: {
      type: 'match_snap',
      from: 'host1',
      _mid: 'host1_5',
      snapSeq: 3,
      seatIds: ['host1', guest.clientId, null, null],
      views: { 1: { topCard: { id: 777 }, players: [] } },
    },
  });
  guest._handleIncoming({
    dir: 'h2c',
    packet: {
      type: 'match_snap',
      from: 'host1',
      _mid: 'host1_4',
      snapSeq: 1,
      seatIds: ['host1', guest.clientId, null, null],
      views: { 1: { topCard: { id: 111 }, players: [] } },
    },
  });
  assert.equal(resolvedSeat, 1);
  assert.equal(latestView?.topCard?.id, 777);
});

test('MQTT 3.1.1 WSS binary packet builders encode CONNECT/SUBSCRIBE/PUBLISH correctly', () => {
  const conn = mqttConnectPacket('uf_test_1');
  assert.equal(conn[0], 0x10);
  const sub = mqttSubscribePacket(1, 'bltts/mp/v2/UF1234/h2c');
  assert.equal(sub[0], 0x82);
  const pub = mqttPublishPacket('bltts/mp/v2/UF1234/c2h', '{"type":"ping"}');
  assert.equal(pub[0], 0x30);
  assert.ok(Buffer.from(pub).toString('utf8').includes('{"type":"ping"}'));
});

test('Live In-Game & Lobby Chat syncs bidirectionally between Host and Guest', async () => {
  const hostMsgs = [];
  const guestMsgs = [];
  const host = new MultiplayerClient({ onChatMessage: (m) => hostMsgs.push(m) });
  const guest = new MultiplayerClient({ onChatMessage: (m) => guestMsgs.push(m) });

  const code = host.hostRoom('ChuPhong', 0, 0);
  guest.joinRoom(code, 'Khach4G', 1, 0);
  await new Promise((r) => setTimeout(r, 80));

  host.sendChat('Chao ca phong!', false);
  guest.sendChat('UNO! Hay lam!', true);
  await new Promise((r) => setTimeout(r, 90));

  assert.equal(hostMsgs.length, 2);
  assert.equal(guestMsgs.length, 2);
  assert.equal(guestMsgs[0].name, 'ChuPhong');
  assert.equal(guestMsgs[0].text, 'Chao ca phong!');
  assert.equal(hostMsgs[1].name, 'Khach4G');
  assert.equal(hostMsgs[1].seat, 1);
  assert.equal(hostMsgs[1].text, 'UNO! Hay lam!');

  host.leaveRoom();
  guest.leaveRoom();
});
