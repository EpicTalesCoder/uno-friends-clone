// Port of p.java:1-537 & a.java:14823-14845 (J2ME Manager audio slots /4[0..30])
// Plays genuine extracted WAV SFX (slots 6..30) and genuine extracted MIDI sequence JSONs (slots 0..5).

export class UnoAudioEngine {
  constructor(basePath = './assets/audio') {
    this.basePath = basePath;
    this.ctx = null;
    this.sfxEnabled = true;
    this.musicEnabled = true;
    this.manifest = null;
    this.wavBuffers = new Map();
    this.bgmData = new Map();
    this.activeBgmId = -1;
    this.bgmTimer = null;
    this.bgmStartCtxTime = 0;
    this.bgmCursor = 0;
    this.bgmOscs = new Set();
  }

  _ensureCtx() {
    if (typeof window === 'undefined') return null;
    const Ctor = window.AudioContext || window.webkitAudioContext;
    if (!Ctor) return null;
    if (!this.ctx) this.ctx = new Ctor();
    if (this.ctx.state === 'suspended') {
      this.ctx.resume().catch(() => {});
    }
    return this.ctx;
  }

  unlock() {
    this._ensureCtx();
  }

  async init() {
    if (typeof fetch === 'undefined') return;
    try {
      const res = await fetch(`${this.basePath}/manifest.json`);
      if (res.ok) this.manifest = await res.json();
    } catch {
      this.manifest = null;
    }
  }

  setSfxEnabled(v) {
    this.sfxEnabled = !!v;
  }

  setMusicEnabled(v) {
    this.musicEnabled = !!v;
    if (!this.musicEnabled) {
      this.stopBgm();
    } else if (this.activeBgmId >= 0) {
      const id = this.activeBgmId;
      this.activeBgmId = -1;
      this.playBgm(id);
    }
  }

  async playSfx(slotId) {
    if (!this.sfxEnabled || typeof fetch === 'undefined') return;
    const ctx = this._ensureCtx();
    if (!ctx) return;

    const key = String(slotId);
    const meta = this.manifest?.sfx?.[key];
    const file = meta?.file || `sfx_${String(slotId).padStart(2, '0')}.wav`;
    if (meta?.empty) return;

    try {
      let buf = this.wavBuffers.get(key);
      if (!buf) {
        const res = await fetch(`${this.basePath}/${file}`);
        if (!res.ok) return;
        const arr = await res.arrayBuffer();
        buf = await ctx.decodeAudioData(arr);
        this.wavBuffers.set(key, buf);
      }
      const src = ctx.createBufferSource();
      const gain = ctx.createGain();
      gain.gain.value = 0.55;
      src.buffer = buf;
      src.connect(gain);
      gain.connect(ctx.destination);
      src.start();
    } catch {
      // ignore decode failures in restricted headless environments
    }
  }

  stopBgm() {
    if (this.bgmTimer) {
      clearInterval(this.bgmTimer);
      this.bgmTimer = null;
    }
    for (const node of this.bgmOscs) {
      try { node.stop(); } catch {}
    }
    this.bgmOscs.clear();
  }

  async playBgm(slotId) {
    if (this.activeBgmId === slotId && this.bgmTimer) return;
    this.activeBgmId = slotId;
    this.stopBgm();
    if (!this.musicEnabled || typeof fetch === 'undefined') return;

    const key = String(slotId);
    const meta = this.manifest?.bgm?.[key];
    const file = meta?.file || `bgm_${String(slotId).padStart(2, '0')}.json`;

    try {
      let seq = this.bgmData.get(key);
      if (!seq) {
        const res = await fetch(`${this.basePath}/${file}`);
        if (!res.ok) return;
        seq = await res.json();
        this.bgmData.set(key, seq);
      }
      if (!this.musicEnabled || this.activeBgmId !== slotId) return;
      this._startSequencer(seq, slotId);
    } catch {
      // ignore fetch failures
    }
  }

  _startSequencer(seq, slotId) {
    const ctx = this._ensureCtx();
    if (!ctx || !seq.notes || seq.notes.length === 0) return;

    const notes = seq.notes;
    const loopDur = Math.max(2.0, seq.duration || 10.0);
    this.bgmStartCtxTime = ctx.currentTime + 0.05;
    this.bgmCursor = 0;

    const scheduleAhead = () => {
      if (!this.musicEnabled || this.activeBgmId !== slotId) return;
      const now = ctx.currentTime;
      const elapsed = now - this.bgmStartCtxTime;
      if (elapsed >= loopDur) {
        this.bgmStartCtxTime += Math.floor(elapsed / loopDur) * loopDur;
        this.bgmCursor = 0;
      }

      const windowEnd = (now - this.bgmStartCtxTime) + 0.35;
      while (this.bgmCursor < notes.length) {
        const [t0, dur, midi, vel, ch] = notes[this.bgmCursor];
        if (t0 > windowEnd) break;
        const when = this.bgmStartCtxTime + t0;
        if (when >= now - 0.05) {
          this._triggerMidiNote(ctx, when, Math.min(dur, 1.5), midi, vel, ch);
        }
        this.bgmCursor++;
      }
    };

    scheduleAhead();
    this.bgmTimer = setInterval(scheduleAhead, 120);
  }

  _triggerMidiNote(ctx, when, dur, midi, vel, ch) {
    if (ch === 9) return; // keep light & clean without noisy white-noise drums
    const freq = 440 * Math.pow(2, (midi - 69) / 12);
    if (!Number.isFinite(freq) || freq < 35 || freq > 4500) return;

    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    osc.type = ch % 2 === 0 ? 'triangle' : 'sine';
    osc.frequency.setValueAtTime(freq, when);

    const peak = Math.min(0.06, ((vel || 64) / 127) * 0.05);
    gain.gain.setValueAtTime(0.0001, when);
    gain.gain.linearRampToValueAtTime(peak, when + 0.015);
    gain.gain.exponentialRampToValueAtTime(0.0001, when + Math.max(0.06, dur));

    osc.connect(gain);
    gain.connect(ctx.destination);
    this.bgmOscs.add(osc);
    osc.onended = () => this.bgmOscs.delete(osc);
    osc.start(when);
    osc.stop(when + Math.max(0.07, dur) + 0.02);
  }
}
