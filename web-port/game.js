// Port of GloftUNO3.java & a.java: Master game controller, state machine (0..52),
// input loop (40ms sim tick), Career/Shop/Rewards, and Live 2-4P Multiplayer orchestration.

import { VIEW_W, VIEW_H } from './midp-graphics.js';
import { UnoResources } from './uno-loader.js';
import { UnoRenderer } from './render-original.js';
import { UnoAudioEngine } from './uno-audio.js';
import {
  loadSaveState, persistSaveState, resetSaveState, t, getTotalStars, VENUE_KEYS,
} from './storage-i18n.js';
import {
  UnoMatch,
  PHASE_PLAY, PHASE_PICK_COLOR, PHASE_PICK_SWAP,
  PHASE_CHALLENGE_PLUS4, PHASE_DRAW_CHOICE, PHASE_ROUND_END, PHASE_MATCH_END,
} from './uno-rules.js';
import {
  MultiplayerClient, parseMpUrlParam, buildInviteUrl, startHostBlobWorker, normalizeRoomCode,
} from './multiplayer.js';

const SIM_STEP_MS = 40; // m.java: 25 FPS fixed sim tick (1000 / 25 = 40ms)

export function isInputFocused(target) {
  if (!target || !target.tagName) return false;
  const tag = target.tagName.toUpperCase();
  return tag === 'INPUT' || tag === 'TEXTAREA' || tag === 'SELECT';
}

export class UnoFriendsApp {
  constructor() {
    this.canvas = document.getElementById('uno-canvas');
    this.ctx = this.canvas.getContext('2d');
    this.ctx.imageSmoothingEnabled = false;

    this.save = loadSaveState();
    this.lang = this.save.lang === 'vi' ? 'vi' : 'en';

    this.resources = new UnoResources();
    this.renderer = new UnoRenderer(this.resources);
    this.audio = new UnoAudioEngine('./assets/audio');

    this.screen = 'logo';
    this.introTimerMs = 0;
    this.focusIdx = 0;
    this.selectedVenue = 0;
    this.shopTab = 0;
    this.helpPage = 0;
    this.returnScreen = 'menu_main';

    this.quickCfg = {
      isHotseat: false,
      numPlayers: 4,
      mode: 'classic',
      targetScore: 250,
      difficulty: 1,
      stacking: true,
      sevenZero: false,
      drawToPlay: true,
      challengePlus4: true,
      specialPowers: true,
    };

    this.match = null;
    this.mpView = null;
    this.isMpMatch = false;
    this.localSeat = 0;
    this.selectedCardIdx = 0;
    this.hoverCardIdx = -1;
    this.lastRewards = null;
    this.lastSeqSeen = 0;
    this.stopHostWorker = null;
    this.chatHistory = [];
    this.unreadChat = 0;
    this._chatToastTimer = null;
    this._debriefDelayMs = 0;

    this.mp = new MultiplayerClient({
      onRoomUpdate: (room) => this._renderMpModal(room),
      onGameState: (view, mySeat) => this._onRemoteMatchState(view, mySeat),
      onChatOrEvent: (ev) => this._onHostClientAction(ev),
      onChatMessage: (msg) => this._onChatReceived(msg),
      onTransportChange: (summary) => this._syncTransportBadge(summary),
      onError: (msg) => this._setMpStatus(msg),
    });

    this.accumMs = 0;
    this.lastRafMs = 0;
  }

  async boot() {
    await Promise.all([this.resources.loadAll('./assets/packs'), this.audio.init()]);
    this.audio.setSfxEnabled(this.save.sfx);
    this.audio.setMusicEnabled(this.save.music);
    this._bindDomControls();
    this._bindCanvasInput();
    this._syncToolbarLabels();

    // Auto-join URL ?mp=UFxxxx if invited
    const mpCode = parseMpUrlParam();
    if (mpCode) {
      this.screen = 'menu_main';
      this._openMpLobby();
      const inp = document.getElementById('mp-room-input');
      if (inp) inp.value = mpCode;
      this.mp.joinRoom(mpCode, this.save.playerName, this.save.avatarId, this.save.powerIdx);
    }

    this.lastRafMs = performance.now();
    const loop = (now) => {
      const dt = Math.min(120, Math.max(0, now - this.lastRafMs));
      this.lastRafMs = now;
      this._frame(dt);
      requestAnimationFrame(loop);
    };
    requestAnimationFrame(loop);
  }

  _frame(dt) {
    this.accumMs += dt;
    while (this.accumMs >= SIM_STEP_MS) {
      this._tick(SIM_STEP_MS);
      this.accumMs -= SIM_STEP_MS;
    }
    const activeMatch = this.isMpMatch ? (this.mp.isHost ? this.match : this.mpView) : this.match;
    this.renderer.render(this.ctx, {
      screen: this.screen,
      save: this.save,
      lang: this.lang,
      focusIdx: this.focusIdx,
      quickCfg: this.quickCfg,
      selectedVenue: this.selectedVenue,
      shopTab: this.shopTab,
      helpPage: this.helpPage,
      match: activeMatch,
      selectedCardIdx: this.selectedCardIdx,
      hoverCardIdx: this.hoverCardIdx,
      localSeat: this.localSeat,
      isMp: this.isMpMatch,
      lastRewards: this.lastRewards,
    });
  }

  _tick(dtMs) {
    this.renderer.update(dtMs);
    if (this.screen === 'logo') {
      this.introTimerMs += dtMs;
      if (this.introTimerMs >= 900) {
        this.screen = 'splash';
        this.audio.playBgm(0);
      }
      return;
    }
    if (this.screen === 'gameplay') {
      if (this._debriefDelayMs > 0) {
        this._debriefDelayMs = Math.max(0, this._debriefDelayMs - dtMs);
        if (this._debriefDelayMs === 0) {
          this.screen = 'debriefing';
          return;
        }
      }
      if (!this.isMpMatch && this.match) {
        this.match.step(dtMs);
        this._checkMatchEvents(this.match);
      } else if (this.isMpMatch && this.mp.isHost && this.match) {
        this.match.step(dtMs);
        if (this.match.eventSeq !== this.lastSeqSeen) {
          this.lastSeqSeen = this.match.eventSeq;
          this.mp.broadcastMatchSnapshot(this.match);
          this._checkMatchEvents(this.match);
        }
      }
    }
  }

  _checkMatchEvents(match, { skipDebriefRedirect = false } = {}) {
    const ev = match.lastEvent;
    if (ev && ev.seq !== this._playedEvSeq) {
      this._playedEvSeq = ev.seq;
      if (ev.type === 'card_played') this.audio.playSfx(10);
      else if (ev.type === 'drew_card' || ev.type === 'drew_penalty') this.audio.playSfx(11);
      else if (ev.type === 'uno_called') {
        this.audio.playSfx(15);
        this.renderer.spawnConfettiBurst(489, 192, 10);
      } else if (ev.type === 'uno_caught' || ev.type === 'challenge_lost') {
        this.audio.playSfx(13);
      } else if (ev.type === 'round_end' || ev.type === 'match_end') {
        this.audio.playSfx(ev.seat === this.localSeat ? 30 : 13);
        if (ev.seat === this.localSeat) {
          this.renderer.spawnConfettiBurst(320, 160, 26);
        }
        if (!skipDebriefRedirect && this.screen === 'gameplay' && this._debriefDelayMs === 0) {
          this._awardMatchResults(match);
          // Let final card land cleanly onto discard pile (~380ms) before showing debriefing panel
          this._debriefDelayMs = 380;
        }
      }
    }
  }

  _awardMatchResults(match) {
    if (match.phase !== PHASE_MATCH_END && match.phase !== PHASE_ROUND_END) return;
    if (match.phase === PHASE_ROUND_END) {
      this.lastRewards = null;
      return;
    }
    const won = match.matchWinner === this.localSeat ||
      (match.rules.mode === 'team2v2' && (match.matchWinner % 2) === (this.localSeat % 2));
    const coins = won ? 120 + Math.round((match.players[this.localSeat]?.score || 100) * 0.2) : 25;
    const xp = won ? 85 : 30;
    this.save.coins += coins;
    this.save.xp += xp;
    this.save.stats.gamesPlayed++;
    if (won) this.save.stats.wins++;

    // XP Level progression from /6[16] or fallback curve
    const xpCurve = this.resources.tables?.xpLevels;
    let newLvl = this.save.level;
    while (newLvl < 59 && this.save.xp >= (xpCurve?.[newLvl + 1]?.[0] || (newLvl + 1) * 150)) {
      newLvl++;
    }
    this.save.level = newLvl;

    let stars = 0;
    if (won && match.careerMeta) {
      const { venue, stage } = match.careerMeta;
      const myScore = match.players[this.localSeat]?.score || 0;
      stars = myScore >= 400 ? 3 : myScore >= 200 ? 2 : 1;
      if (stars > this.save.stageStars[venue][stage]) {
        this.save.stageStars[venue][stage] = stars;
      }
      if (myScore > this.save.stageScores[venue][stage]) {
        this.save.stageScores[venue][stage] = myScore;
      }
      if (stage < 4) this.save.stageUnlocked[venue][stage + 1] = true;
      else if (venue < 5) {
        this.save.unlockedVenues[venue + 1] = true;
        this.save.stageUnlocked[venue + 1][0] = true;
      }
    }

    if (won) this.save.achievements[5] = true;
    if (this.save.coins >= 3000) this.save.achievements[15] = true;
    persistSaveState(this.save);
    this.lastRewards = { coins, xp, stars };
  }

  _startSoloMatch(configOverride = null) {
    this._stopHostWorker();
    this.isMpMatch = false;
    this.localSeat = 0;
    const cfg = configOverride || this.quickCfg;
    const names = this.resources.texts[1] || ['Player', 'Marcos', 'Alison', 'Cezar'];
    const seats = [];
    for (let s = 0; s < 4; s++) {
      const active = cfg.numPlayers === 2 ? (s === 0 || s === 2) : (s < cfg.numPlayers);
      seats.push({
        seat: s,
        name: s === 0 ? this.save.playerName : (names[s + 1] || `CPU ${s}`),
        isHuman: s === 0 || (cfg.isHotseat && active && !cfg.careerMeta),
        active,
        avatarId: s === 0 ? this.save.avatarId : s,
        hatIdx: s === 0 ? this.save.hatIdx : 0,
        glassesIdx: s === 0 ? this.save.glassesIdx : 0,
        powerIdx: s === 0 ? this.save.powerIdx : (s % 5),
      });
    }
    this.match = new UnoMatch({ ...cfg, seats });
    this.selectedCardIdx = 0;
    this.lastRewards = null;
    this._playedEvSeq = 0;
    this._debriefDelayMs = 0;
    this.screen = 'gameplay';
    this.audio.playBgm(2);
  }

  _startMultiplayerMatch() {
    if (!this.mp.isHost) return;
    this._stopHostWorker();
    this.isMpMatch = true;
    this.localSeat = 0;
    const room = this.mp.getRoomSnapshot();
    const botNames = this.resources.texts[1] || ['Player', 'Marcos', 'Alison', 'Cezar'];
    const seats = [];
    for (let s = 0; s < 4; s++) {
      const occupant = room.seats[s];
      const active = !!occupant || room.fillBots;
      seats.push({
        seat: s,
        name: occupant ? occupant.name : `${botNames[s + 1] || 'Bot'} (AI)`,
        isHuman: !!occupant,
        active,
        avatarId: occupant ? occupant.avatarId : s,
        powerIdx: occupant ? occupant.powerIdx : (s % 5),
        netId: occupant ? occupant.id : null,
      });
    }
    this.match = new UnoMatch({
      mode: 'multiplayer',
      targetScore: room.roomConfig.targetScore ?? 250,
      stacking: !!room.roomConfig.stacking,
      sevenZero: !!room.roomConfig.sevenZero,
      challengePlus4: !!room.roomConfig.challengePlus4,
      specialPowers: !!room.roomConfig.specialPowers,
      seats,
    });
    this.mp.inMatch = true;
    this.lastSeqSeen = 0;
    this._playedEvSeq = 0;
    this._debriefDelayMs = 0;
    this.lastRewards = null;
    this.selectedCardIdx = 0;
    this.screen = 'gameplay';
    this._closeMpLobby();
    this.audio.playBgm(2);
    this.mp.broadcastMatchSnapshot(this.match);

    this.stopHostWorker = startHostBlobWorker(() => {
      if (this.isMpMatch && this.mp.isHost && this.match && this.screen === 'gameplay') {
        this.match.step(100);
        if (this.match.eventSeq !== this.lastSeqSeen) {
          this.lastSeqSeen = this.match.eventSeq;
          this.mp.broadcastMatchSnapshot(this.match);
          this._checkMatchEvents(this.match);
        }
      }
    }, 100);
  }

  _stopHostWorker() {
    if (this.stopHostWorker) {
      this.stopHostWorker();
      this.stopHostWorker = null;
    }
  }

  _onRemoteMatchState(view, mySeat) {
    this.isMpMatch = true;
    this.localSeat = mySeat;
    this.mpView = view;
    if (this.screen !== 'gameplay' && this.screen !== 'debriefing' && this.screen !== 'pause') {
      this.screen = 'gameplay';
      this._closeMpLobby();
      this.audio.playBgm(2);
    }
    if ((view.phase === PHASE_MATCH_END || view.phase === PHASE_ROUND_END) && this.screen === 'gameplay') {
      if (this._debriefDelayMs === 0) this._debriefDelayMs = 380;
    } else if (view.phase === PHASE_PLAY && this.screen === 'debriefing') {
      this._debriefDelayMs = 0;
      this.screen = 'gameplay';
    }
    const myHandLen = view.players?.[mySeat]?.hand?.length || 0;
    if (this.selectedCardIdx >= myHandLen) {
      this.selectedCardIdx = Math.max(0, myHandLen - 1);
    }
    this._checkMatchEvents(view, { skipDebriefRedirect: true });
  }

  _onHostClientAction({ seat, action }) {
    if (!this.mp.isHost || !this.match || !action) return;
    this._applySeatAction(this.match, seat, action);
    this.mp.broadcastMatchSnapshot(this.match);
    this._checkMatchEvents(this.match);
  }

  _dispatchLocalAction(action) {
    if (this.isMpMatch) {
      if (this.mp.isHost) {
        this._applySeatAction(this.match, this.localSeat, action);
        this.mp.broadcastMatchSnapshot(this.match);
        this._checkMatchEvents(this.match);
      } else {
        this.mp.sendMatchAction(action);
      }
    } else if (this.match) {
      // Support hotseat human seats seamlessly
      const seat = this.match.players[this.match.turnSeat]?.isHuman ? this.match.turnSeat : this.localSeat;
      if (action.type === 'catch') {
        this.match.catchUno(this.localSeat);
      } else if (action.type === 'uno') {
        const unoSeat = this.match.unoVulnerableSeat === seat || this.match.canCallUno(seat) ? seat : this.localSeat;
        this.match.callUno(unoSeat);
      } else {
        this._applySeatAction(this.match, seat, action);
      }
      this._checkMatchEvents(this.match);
    }
  }

  _applySeatAction(match, seat, action) {
    switch (action.type) {
      case 'play':
        match.playCard(seat, action.cardId, action.color || 0, action.swapTarget ?? -1);
        break;
      case 'draw':
        match.drawCard(seat);
        break;
      case 'keep':
        match.keepDrawnCard(seat);
        break;
      case 'color':
        match.pickWildColor(seat, action.color);
        break;
      case 'swap':
        match.pickSwapTarget(seat, action.targetSeat);
        break;
      case 'challenge':
        match.resolvePlus4Challenge(seat, !!action.acceptChallenge);
        break;
      case 'uno':
        match.callUno(seat);
        this.save.stats.unoCalls++;
        persistSaveState(this.save);
        break;
      case 'catch':
        match.catchUno(seat);
        break;
      case 'power':
        match.activatePower(seat, action.targetSeat ?? -1);
        this.save.stats.powersUsed++;
        persistSaveState(this.save);
        break;
      case 'next_round':
        if (match.phase === PHASE_ROUND_END) match.startRound(match.round + 1);
        break;
      default:
        break;
    }
  }

  _handleHitAction(hit) {
    if (!hit) return;
    this.audio.unlock();
    const id = hit.id;

    if (id === 'skip_intro' || id === 'splash_start') {
      this.audio.playSfx(16);
      this.screen = 'menu_main';
      this.focusIdx = 0;
      this.audio.playBgm(0);
      return;
    }
    if (id === 'nav_back') {
      this.audio.playSfx(14);
      if (this.screen === 'career_stages') this.screen = 'career_venues';
      else this.screen = 'menu_main';
      this.focusIdx = 0;
      return;
    }

    // Main Menu
    if (id === 'menu_quick') {
      this.audio.playSfx(15);
      this.quickCfg.isHotseat = false;
      this.screen = 'quick_setup';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_hotseat') {
      this.audio.playSfx(15);
      this.quickCfg.isHotseat = true;
      this.screen = 'quick_setup';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_career') {
      this.audio.playSfx(15);
      this.screen = 'career_venues';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_mp') {
      this.audio.playSfx(15);
      this._openMpLobby();
      return;
    }
    if (id === 'menu_shop') {
      this.audio.playSfx(15);
      this.screen = 'shop';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_profile') {
      this.audio.playSfx(15);
      this.screen = 'profile';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_options') {
      this.audio.playSfx(15);
      this.screen = 'options';
      this.focusIdx = 0;
      return;
    }
    if (id === 'menu_help') {
      this.audio.playSfx(15);
      this.screen = 'help';
      this.helpPage = 0;
      return;
    }

    // Quick Setup
    if (id === 'cfg_players') {
      this.quickCfg.numPlayers = this.quickCfg.numPlayers === 4 ? 2 : this.quickCfg.numPlayers + 1;
      if (this.quickCfg.numPlayers !== 4 && this.quickCfg.mode === 'team2v2') this.quickCfg.mode = 'classic';
      this.audio.playSfx(16);
      return;
    }
    if (id === 'cfg_mode') {
      const modes = ['classic', 'team2v2', 'elimination'];
      const nxt = modes[(modes.indexOf(this.quickCfg.mode) + 1) % modes.length];
      this.quickCfg.mode = nxt;
      if (nxt === 'team2v2') this.quickCfg.numPlayers = 4;
      this.audio.playSfx(16);
      return;
    }
    if (id === 'cfg_target') {
      const opts = [0, 250, 500];
      this.quickCfg.targetScore = opts[(opts.indexOf(this.quickCfg.targetScore) + 1) % opts.length];
      this.audio.playSfx(16);
      return;
    }
    if (id === 'cfg_diff') {
      this.quickCfg.difficulty = (this.quickCfg.difficulty + 1) % 3;
      this.audio.playSfx(16);
      return;
    }
    if (id === 'cfg_stack') { this.quickCfg.stacking = !this.quickCfg.stacking; this.audio.playSfx(16); return; }
    if (id === 'cfg_70') { this.quickCfg.sevenZero = !this.quickCfg.sevenZero; this.audio.playSfx(16); return; }
    if (id === 'cfg_challenge') { this.quickCfg.challengePlus4 = !this.quickCfg.challengePlus4; this.audio.playSfx(16); return; }
    if (id === 'cfg_powers') { this.quickCfg.specialPowers = !this.quickCfg.specialPowers; this.audio.playSfx(16); return; }
    if (id === 'cfg_start') {
      this.audio.playSfx(15);
      this._startSoloMatch();
      return;
    }

    // Career Venues & Stages
    if (id.startsWith('venue_')) {
      const { venue, unlocked, reqStars } = hit.payload;
      if (unlocked) {
        this.audio.playSfx(15);
        this.selectedVenue = venue;
        this.screen = 'career_stages';
        this.focusIdx = 0;
      } else if (this.save.coins >= 400 && getTotalStars(this.save) >= Math.max(0, reqStars - 2)) {
        this.audio.playSfx(15);
        this.save.coins -= 400;
        this.save.unlockedVenues[venue] = true;
        this.save.stageUnlocked[venue][0] = true;
        persistSaveState(this.save);
      } else {
        this.audio.playSfx(13);
      }
      return;
    }
    if (id.startsWith('stage_')) {
      const { venue, stage } = hit.payload;
      const stageRow = this.resources.tables?.careerStages?.[venue * 5 + stage] || [];
      const fee = stageRow[12] || 50;
      if (this.save.coins >= fee) {
        this.save.coins -= fee;
        persistSaveState(this.save);
      }
      this.audio.playSfx(15);
      this._startSoloMatch({
        mode: stageRow[3] === 1 ? 'team2v2' : stageRow[3] === 2 ? 'elimination' : 'career',
        numPlayers: Math.max(2, Math.min(4, stageRow[2] || 4)),
        targetScore: stageRow[4] > 0 ? 250 : 0,
        difficulty: Math.min(2, Math.floor(venue / 2)),
        stacking: true,
        sevenZero: venue >= 2,
        drawToPlay: true,
        challengePlus4: true,
        specialPowers: true,
        careerMeta: { venue, stage, fee },
      });
      return;
    }

    // Shop
    if (id.startsWith('shop_tab_')) {
      this.shopTab = hit.payload;
      this.focusIdx = 0;
      this.audio.playSfx(16);
      return;
    }
    if (id.startsWith('shop_buy_')) {
      const { tab, idx, item } = hit.payload;
      if (item.owned) {
        if (tab === 0) this.save.themeIdx = idx;
        else if (tab === 1) this.save.deckIdx = idx;
        else if (tab === 2) this.save.powerIdx = idx;
        else if (tab === 3) this.save.avatarId = idx;
        persistSaveState(this.save);
        this.audio.playSfx(15);
      } else if (this.save.coins >= item.price) {
        this.save.coins -= item.price;
        if (tab === 0) { this.save.ownedThemes.push(idx); this.save.themeIdx = idx; }
        else if (tab === 1) { this.save.ownedDecks.push(idx); this.save.deckIdx = idx; }
        else if (tab === 2) { this.save.ownedPowers[idx] = true; this.save.powerIdx = idx; }
        else if (tab === 3) { this.save.ownedHats.push(idx); this.save.avatarId = idx; }
        persistSaveState(this.save);
        this.renderer.spawnConfettiBurst(320, 160, 14);
        this.audio.playSfx(30);
      } else {
        this.audio.playSfx(13);
      }
      return;
    }

    // Profile Lottery
    if (id === 'prof_lottery') {
      const prize = 50 + Math.floor(Math.random() * 4) * 50;
      this.save.coins += prize;
      this.save.stats.lotteriesPlayed++;
      persistSaveState(this.save);
      this.renderer.spawnConfettiBurst(380, 250, 14);
      this.audio.playSfx(30);
      return;
    }

    // Options & Help
    if (id === 'opt_sfx') { this.save.sfx = !this.save.sfx; this.audio.setSfxEnabled(this.save.sfx); persistSaveState(this.save); this.audio.playSfx(16); return; }
    if (id === 'opt_music') { this.save.music = !this.save.music; this.audio.setMusicEnabled(this.save.music); persistSaveState(this.save); this.audio.playSfx(16); return; }
    if (id === 'opt_lang') { this._toggleLanguage(); return; }
    if (id === 'opt_reset') { this.save = resetSaveState(); this.lang = this.save.lang; this._syncToolbarLabels(); this.audio.playSfx(14); return; }
    if (id === 'help_prev') { this.helpPage = Math.max(0, this.helpPage - 1); this.audio.playSfx(16); return; }
    if (id === 'help_next') { this.helpPage = (this.helpPage + 1) % 3; this.audio.playSfx(16); return; }

    // Gameplay Controls
    if (id === 'match_pause') {
      this.audio.playSfx(14);
      this.screen = 'pause';
      this.focusIdx = 0;
      return;
    }
    if (id === 'pause_resume') { this.screen = 'gameplay'; this.audio.playSfx(15); return; }
    if (id === 'pause_sfx') { this.save.sfx = !this.save.sfx; this.audio.setSfxEnabled(this.save.sfx); persistSaveState(this.save); return; }
    if (id === 'pause_restart') {
      if (!this.isMpMatch) this._startSoloMatch();
      else this.screen = 'gameplay';
      return;
    }
    if (id === 'pause_quit') {
      this._stopHostWorker();
      this.isMpMatch = false;
      this.screen = 'menu_main';
      this.audio.playBgm(0);
      return;
    }

    if (id.startsWith('card_')) {
      const { index, card, canPlay } = hit.payload;
      if (this.selectedCardIdx === index && canPlay) {
        this._dispatchLocalAction({ type: 'play', cardId: card.id });
      } else {
        this.selectedCardIdx = index;
        this.audio.playSfx(16);
      }
      return;
    }
    if (id === 'deck_draw') {
      this._dispatchLocalAction({ type: 'draw' });
      return;
    }
    if (id === 'drawn_play' && hit.payload) {
      this._dispatchLocalAction({ type: 'play', cardId: hit.payload });
      return;
    }
    if (id === 'drawn_keep') {
      this._dispatchLocalAction({ type: 'keep' });
      return;
    }
    if (id.startsWith('pick_color_')) {
      this._dispatchLocalAction({ type: 'color', color: hit.payload });
      return;
    }
    if (id.startsWith('swap_seat_')) {
      this._dispatchLocalAction({ type: 'swap', targetSeat: hit.payload });
      return;
    }
    if (id === 'chal_yes') {
      this._dispatchLocalAction({ type: 'challenge', acceptChallenge: true });
      return;
    }
    if (id === 'chal_no') {
      this._dispatchLocalAction({ type: 'challenge', acceptChallenge: false });
      return;
    }
    if (id === 'btn_uno') {
      this._dispatchLocalAction({ type: 'uno' });
      return;
    }
    if (id === 'btn_catch_uno') {
      this._dispatchLocalAction({ type: 'catch' });
      return;
    }
    if (id === 'btn_power') {
      this._dispatchLocalAction({ type: 'power' });
      return;
    }

    // Debriefing
    if (id === 'debrief_next') {
      this._dispatchLocalAction({ type: 'next_round' });
      this.screen = 'gameplay';
      return;
    }
    if (id === 'debrief_replay') {
      if (this.isMpMatch && this.mp.isHost) this._startMultiplayerMatch();
      else if (!this.isMpMatch) this._startSoloMatch();
      return;
    }
    if (id === 'debrief_menu') {
      this._stopHostWorker();
      this.isMpMatch = false;
      this.screen = 'menu_main';
      this.audio.playBgm(0);
    }
  }

  _bindCanvasInput() {
    const toCanvasCoords = (ev) => {
      const rect = this.canvas.getBoundingClientRect();
      return {
        x: ((ev.clientX - rect.left) / Math.max(1, rect.width)) * VIEW_W,
        y: ((ev.clientY - rect.top) / Math.max(1, rect.height)) * VIEW_H,
      };
    };

    this.canvas.addEventListener('pointermove', (ev) => {
      const { x, y } = toCanvasCoords(ev);
      const hit = this.renderer.hitTest(x, y);
      if (hit && hit.id.startsWith('card_')) {
        this.hoverCardIdx = hit.payload.index;
      } else {
        this.hoverCardIdx = -1;
      }
    });

    this.canvas.addEventListener('pointerdown', (ev) => {
      const { x, y } = toCanvasCoords(ev);
      const hit = this.renderer.hitTest(x, y);
      this._handleHitAction(hit);
    });

    window.addEventListener('keydown', (e) => {
      if (isInputFocused(e.target)) return;
      this.audio.unlock();
      if (['ArrowLeft', 'ArrowRight', 'ArrowUp', 'ArrowDown', ' ', 'Enter'].includes(e.key)) {
        e.preventDefault();
      }
      this._handleKey(e.key);
    });
  }

  _handleKey(key) {
    const k = key.toLowerCase();
    if (this.screen === 'logo' || this.screen === 'splash') {
      if (k === 'enter' || k === ' ') {
        this._handleHitAction({ id: 'splash_start' });
      }
      return;
    }

    if (this.screen === 'menu_main') {
      const order = ['menu_quick', 'menu_career', 'menu_mp', 'menu_hotseat', 'menu_shop', 'menu_profile', 'menu_options', 'menu_help'];
      if (k === 'arrowright' || k === 'd') this.focusIdx = (this.focusIdx + 1) % order.length;
      else if (k === 'arrowleft' || k === 'a') this.focusIdx = (this.focusIdx - 1 + order.length) % order.length;
      else if (k === 'arrowdown' || k === 's') this.focusIdx = (this.focusIdx + 2) % order.length;
      else if (k === 'arrowup' || k === 'w') this.focusIdx = (this.focusIdx - 2 + order.length) % order.length;
      else if (k === 'enter' || k === ' ') this._handleHitAction({ id: order[this.focusIdx] });
      return;
    }

    if (this.screen === 'gameplay') {
      const m = this.isMpMatch ? (this.mp.isHost ? this.match : this.mpView) : this.match;
      const myHand = m?.players?.[this.localSeat]?.hand || [];
      if (k === 't') {
        this._toggleChatDrawer();
        return;
      }
      if (k === 'escape' || k === 'p' || k === 'e') {
        const drawer = document.getElementById('chat-drawer');
        if (k === 'escape' && drawer && !drawer.classList.contains('hidden')) {
          drawer.classList.add('hidden');
          return;
        }
        this._handleHitAction({ id: 'match_pause' });
        return;
      }
      if (k === 'u' || k === 'q') {
        if (m && m.unoVulnerableSeat >= 0 && m.unoVulnerableSeat !== this.localSeat) {
          this._dispatchLocalAction({ type: 'catch' });
        } else {
          this._dispatchLocalAction({ type: 'uno' });
        }
        return;
      }
      if (k === ' ') {
        this._dispatchLocalAction({ type: 'draw' });
        return;
      }
      if (m && m.phase === PHASE_PICK_COLOR && m.turnSeat === this.localSeat) {
        if (['1', '2', '3', '4'].includes(k)) {
          this._dispatchLocalAction({ type: 'color', color: Number(k) });
        }
        return;
      }
      if (myHand.length > 0) {
        if (k === 'arrowright' || k === 'd') {
          this.selectedCardIdx = (this.selectedCardIdx + 1) % myHand.length;
        } else if (k === 'arrowleft' || k === 'a') {
          this.selectedCardIdx = (this.selectedCardIdx - 1 + myHand.length) % myHand.length;
        } else if (k === 'enter' || k === 'arrowup' || k === 'w') {
          const card = myHand[this.selectedCardIdx];
          if (card) this._dispatchLocalAction({ type: 'play', cardId: card.id });
        }
      }
      return;
    }

    if (this.screen === 'pause') {
      const ids = ['pause_resume', 'pause_sfx', 'pause_restart', 'pause_quit'];
      if (k === 'escape' || k === 'p') { this._handleHitAction({ id: 'pause_resume' }); return; }
      if (k === 'arrowdown' || k === 's') this.focusIdx = (this.focusIdx + 1) % ids.length;
      else if (k === 'arrowup' || k === 'w') this.focusIdx = (this.focusIdx - 1 + ids.length) % ids.length;
      else if (k === 'enter' || k === ' ') this._handleHitAction({ id: ids[this.focusIdx] });
      return;
    }

    if (k === 'escape' || k === 'backspace' || k === 'e') {
      this._handleHitAction({ id: 'nav_back' });
    }
  }

  _toggleLanguage() {
    this.lang = this.lang === 'vi' ? 'en' : 'vi';
    this.save.lang = this.lang;
    persistSaveState(this.save);
    this._syncToolbarLabels();
    this._renderMpModal(this.mp.getRoomSnapshot());
  }

  _syncToolbarLabels() {
    const langBtn = document.getElementById('btn-lang');
    const mpBtn = document.getElementById('btn-mp-lobby');
    const audioBtn = document.getElementById('btn-audio');
    if (langBtn) langBtn.textContent = this.lang === 'vi' ? 'VI' : 'EN';
    if (mpBtn) mpBtn.textContent = `🌐 ${t(this.lang, 'mpButton')}`;
    if (audioBtn) audioBtn.textContent = this.save.sfx || this.save.music ? '🔊' : '🔇';

    const mpTitle = document.getElementById('mp-title');
    if (mpTitle) mpTitle.textContent = t(this.lang, 'mpTitle');
    const guideTitle = document.getElementById('guide-title');
    if (guideTitle) guideTitle.textContent = t(this.lang, 'help');
    const guideBody = document.getElementById('guide-body');
    if (guideBody) guideBody.textContent = t(this.lang, 'mpGuideHint');

    // Sync localized Chat UI strings & quick-emote buttons
    const chatTitle = document.getElementById('chat-drawer-title');
    if (chatTitle) chatTitle.textContent = t(this.lang, 'chatTitle');
    const chatInput = document.getElementById('chat-input');
    if (chatInput) chatInput.placeholder = t(this.lang, 'chatPlaceholder');
    const lobbyChatInput = document.getElementById('mp-lobby-chat-input');
    if (lobbyChatInput) lobbyChatInput.placeholder = t(this.lang, 'chatPlaceholder');
    const sendBtn = document.getElementById('btn-chat-send');
    if (sendBtn) sendBtn.textContent = t(this.lang, 'chatSend');
    const lobbySendBtn = document.getElementById('btn-mp-lobby-chat-send');
    if (lobbySendBtn) lobbySendBtn.textContent = t(this.lang, 'chatSend');

    const quickBar = document.getElementById('chat-quick-bar');
    if (quickBar) {
      quickBar.innerHTML = '';
      for (const phrase of t(this.lang, 'chatQuick')) {
        const b = document.createElement('button');
        b.type = 'button';
        b.className = 'chat-quick-btn';
        b.textContent = phrase;
        b.addEventListener('click', () => this._sendGameChat(phrase, true));
        quickBar.appendChild(b);
      }
    }
    this._renderChatHistory();
    this._syncTransportBadge(this.mp.getTransportSummary());
  }

  _bindDomControls() {
    document.getElementById('btn-lang')?.addEventListener('click', () => this._toggleLanguage());
    document.getElementById('btn-audio')?.addEventListener('click', () => {
      const next = !(this.save.sfx || this.save.music);
      this.save.sfx = next;
      this.save.music = next;
      this.audio.setSfxEnabled(next);
      this.audio.setMusicEnabled(next);
      persistSaveState(this.save);
      this._syncToolbarLabels();
    });
    document.getElementById('btn-keypad')?.addEventListener('click', () => {
      document.getElementById('dpad-overlay')?.classList.toggle('hidden');
    });
    document.querySelectorAll('#dpad-overlay button[data-key]').forEach((btn) => {
      btn.addEventListener('click', () => this._handleKey(btn.getAttribute('data-key')));
    });

    // Guide modal
    document.getElementById('btn-guide')?.addEventListener('click', () => {
      document.getElementById('guide-modal')?.classList.remove('hidden');
    });
    document.getElementById('btn-close-guide')?.addEventListener('click', () => {
      document.getElementById('guide-modal')?.classList.add('hidden');
    });
    document.getElementById('btn-ok-guide')?.addEventListener('click', () => {
      document.getElementById('guide-modal')?.classList.add('hidden');
    });
    document.getElementById('btn-reset-save')?.addEventListener('click', () => {
      this.save = resetSaveState();
      this._syncToolbarLabels();
      document.getElementById('guide-modal')?.classList.add('hidden');
    });

    // Multiplayer Lobby modal
    document.getElementById('btn-mp-lobby')?.addEventListener('click', () => this._openMpLobby());
    document.getElementById('btn-close-mp')?.addEventListener('click', () => this._closeMpLobby());
    const nameInput = document.getElementById('mp-player-name');
    if (nameInput) {
      nameInput.value = this.save.playerName;
      nameInput.addEventListener('change', () => {
        this.save.playerName = nameInput.value.trim().slice(0, 14) || 'Player';
        persistSaveState(this.save);
      });
    }

    document.getElementById('btn-mp-host')?.addEventListener('click', () => {
      const nm = document.getElementById('mp-player-name')?.value.trim() || this.save.playerName;
      this.save.playerName = nm;
      persistSaveState(this.save);
      this.mp.hostRoom(nm, this.save.avatarId, this.save.powerIdx);
    });
    document.getElementById('btn-mp-join')?.addEventListener('click', () => {
      const code = normalizeRoomCode(document.getElementById('mp-room-input')?.value);
      const nm = document.getElementById('mp-player-name')?.value.trim() || this.save.playerName;
      this.save.playerName = nm;
      persistSaveState(this.save);
      this.mp.joinRoom(code, nm, this.save.avatarId, this.save.powerIdx);
    });
    document.getElementById('btn-mp-leave')?.addEventListener('click', () => this.mp.leaveRoom());
    document.getElementById('btn-mp-copy')?.addEventListener('click', async () => {
      const url = buildInviteUrl(this.mp.roomCode);
      try { await navigator.clipboard?.writeText(url); } catch {}
      this._setMpStatus(`Link copied: ${url}`);
    });
    document.getElementById('btn-mp-tab2')?.addEventListener('click', () => {
      const url = buildInviteUrl(this.mp.roomCode);
      window.open(url, '_blank');
    });
    document.getElementById('btn-mp-ready')?.addEventListener('click', () => {
      const me = this.mp.seats[this.mp.getMySeat()];
      if (me) this.mp.setReady(!me.ready);
    });
    document.getElementById('btn-mp-start')?.addEventListener('click', () => this._startMultiplayerMatch());

    const syncHostOpts = () => {
      this.mp.updateHostSettings({
        fillBots: document.getElementById('mp-chk-bots')?.checked ?? true,
        roomConfig: {
          stacking: document.getElementById('mp-chk-stack')?.checked ?? true,
          sevenZero: document.getElementById('mp-chk-70')?.checked ?? false,
          specialPowers: document.getElementById('mp-chk-powers')?.checked ?? true,
        },
      });
    };
    ['mp-chk-bots', 'mp-chk-stack', 'mp-chk-70', 'mp-chk-powers'].forEach((elId) => {
      document.getElementById(elId)?.addEventListener('change', syncHostOpts);
    });

    // Live In-Game & Lobby Chat Controls
    document.getElementById('btn-chat')?.addEventListener('click', () => this._toggleChatDrawer());
    document.getElementById('btn-close-chat')?.addEventListener('click', () => {
      document.getElementById('chat-drawer')?.classList.add('hidden');
    });
    document.getElementById('chat-form')?.addEventListener('submit', (e) => {
      e.preventDefault();
      const inp = document.getElementById('chat-input');
      if (!inp) return;
      const val = inp.value.trim();
      if (val) {
        this._sendGameChat(val, false);
        inp.value = '';
      }
    });
    document.getElementById('mp-lobby-chat-form')?.addEventListener('submit', (e) => {
      e.preventDefault();
      const inp = document.getElementById('mp-lobby-chat-input');
      if (!inp) return;
      const val = inp.value.trim();
      if (val) {
        this._sendGameChat(val, false);
        inp.value = '';
      }
    });
  }

  _toggleChatDrawer() {
    const drawer = document.getElementById('chat-drawer');
    if (!drawer) return;
    const willOpen = drawer.classList.contains('hidden');
    drawer.classList.toggle('hidden');
    if (willOpen) {
      this.unreadChat = 0;
      this._syncUnreadBadge();
      document.getElementById('chat-toast')?.classList.add('hidden');
      this._renderChatHistory();
      document.getElementById('chat-input')?.focus();
    }
  }

  _sendGameChat(rawText, isEmote = false) {
    const text = String(rawText || '').trim().slice(0, 80);
    if (!text) return;
    this.audio.playSfx(16);
    if (this.mp.roomCode) {
      this.mp.playerName = this.save.playerName;
      this.mp.sendChat(text, isEmote);
      return;
    }
    this._onChatReceived({
      id: `local_${Date.now()}`,
      from: 'local',
      seat: this.localSeat,
      name: this.save.playerName || 'Player',
      text,
      isEmote: !!isEmote,
      ts: Date.now(),
    });
  }

  _onChatReceived(msg) {
    if (!msg || !msg.text) return;
    this.chatHistory.push(msg);
    if (this.chatHistory.length > 50) {
      this.chatHistory.splice(0, this.chatHistory.length - 50);
    }

    // Pop short speech bubble directly on sender's Avatar Pod in match
    const activeMatch = this.isMpMatch ? (this.mp.isHost ? this.match : this.mpView) : this.match;
    const seat = typeof msg.seat === 'number' ? msg.seat : -1;
    if (activeMatch?.players?.[seat]) {
      activeMatch.players[seat].speech = {
        text: msg.text.length > 12 ? `${msg.text.slice(0, 11)}..` : msg.text,
        ttl: 2200,
      };
    }

    this._renderChatHistory();

    const drawerOpen = !document.getElementById('chat-drawer')?.classList.contains('hidden');
    const lobbyOpen = !document.getElementById('mp-lobby')?.classList.contains('hidden');
    if (!drawerOpen && !lobbyOpen) {
      this.unreadChat += 1;
      this._syncUnreadBadge();
      const toast = document.getElementById('chat-toast');
      if (toast) {
        toast.textContent = `${msg.name}: ${msg.text}`;
        toast.classList.remove('hidden');
        if (this._chatToastTimer) clearTimeout(this._chatToastTimer);
        this._chatToastTimer = setTimeout(() => toast.classList.add('hidden'), 3200);
      }
    }
  }

  _syncUnreadBadge() {
    const badge = document.getElementById('chat-unread-badge');
    if (!badge) return;
    if (this.unreadChat > 0) {
      badge.textContent = this.unreadChat > 9 ? '9+' : String(this.unreadChat);
      badge.classList.remove('hidden');
    } else {
      badge.classList.add('hidden');
    }
  }

  _renderChatHistory() {
    const targets = ['chat-messages', 'mp-lobby-chat-list'];
    for (const id of targets) {
      const box = document.getElementById(id);
      if (!box) continue;
      box.innerHTML = '';
      if (this.chatHistory.length === 0) {
        const empty = document.createElement('div');
        empty.className = 'chat-empty-hint';
        empty.textContent = t(this.lang, 'chatEmpty');
        box.appendChild(empty);
        continue;
      }
      for (const m of this.chatHistory) {
        const row = document.createElement('div');
        const isSelf = m.from === this.mp.clientId || m.from === 'local';
        row.className = `chat-line${isSelf ? ' self' : ''}`;
        const sender = document.createElement('strong');
        sender.textContent = `${m.name}: `;
        const body = document.createElement('span');
        body.textContent = m.text;
        row.appendChild(sender);
        row.appendChild(body);
        box.appendChild(row);
      }
      box.scrollTop = box.scrollHeight;
    }
  }

  _syncTransportBadge(summary) {
    const s = summary || this.mp.getTransportSummary();
    const isOnline = !!s.online;
    const label = isOnline
      ? `${t(this.lang, 'mpNetOnline')} (${s.channels.join('+')})`
      : (s.connected ? `${t(this.lang, 'mpNetLocal')}` : 'Local');
    for (const elId of ['mp-transport-badge', 'chat-net-pill']) {
      const el = document.getElementById(elId);
      if (!el) continue;
      el.textContent = label;
      el.classList.toggle('online', isOnline);
    }
  }

  _openMpLobby() {
    document.getElementById('mp-lobby')?.classList.remove('hidden');
    this._renderMpModal(this.mp.getRoomSnapshot());
  }

  _closeMpLobby() {
    document.getElementById('mp-lobby')?.classList.add('hidden');
  }

  _setMpStatus(msg) {
    const el = document.getElementById('mp-status-text');
    if (el) el.textContent = msg;
  }

  _renderMpModal(room) {
    const disc = document.getElementById('mp-disconnected-panel');
    const conn = document.getElementById('mp-connected-panel');
    if (!disc || !conn) return;

    if (!room.connected) {
      disc.classList.remove('hidden');
      conn.classList.add('hidden');
      return;
    }
    disc.classList.add('hidden');
    conn.classList.remove('hidden');
    document.getElementById('mp-room-code-display').textContent = room.roomCode;
    this._syncTransportBadge(room.transport);
    this._renderChatHistory();

    const seatsEl = document.getElementById('mp-seats-list');
    seatsEl.innerHTML = '';
    for (let i = 0; i < 4; i++) {
      const occ = room.seats[i];
      const div = document.createElement('div');
      div.className = `mp-seat-box${occ ? ' filled' : ''}${occ?.ready ? ' ready' : ''}`;
      if (occ) {
        const badge = i === 0 ? ` [${t(this.lang, 'mpHostBadge')}]` : (occ.id === room.myId ? ` [${t(this.lang, 'mpYouBadge')}]` : '');
        const rdy = occ.ready ? ' ✓' : '';
        div.textContent = `#${i + 1} ${occ.name}${badge}${rdy}`;
      } else {
        div.textContent = `#${i + 1} ${t(this.lang, 'mpEmptySeat')}`;
      }
      seatsEl.appendChild(div);
    }

    const hostOpts = document.getElementById('mp-host-settings');
    hostOpts.style.opacity = room.isHost ? '1' : '0.6';
    ['mp-chk-bots', 'mp-chk-stack', 'mp-chk-70', 'mp-chk-powers'].forEach((id) => {
      const inp = document.getElementById(id);
      if (inp) inp.disabled = !room.isHost;
    });
    document.getElementById('mp-chk-bots').checked = room.fillBots;
    document.getElementById('mp-chk-stack').checked = !!room.roomConfig.stacking;
    document.getElementById('mp-chk-70').checked = !!room.roomConfig.sevenZero;
    document.getElementById('mp-chk-powers').checked = !!room.roomConfig.specialPowers;

    const startBtn = document.getElementById('btn-mp-start');
    const readyBtn = document.getElementById('btn-mp-ready');
    if (room.isHost) {
      startBtn.classList.remove('hidden');
      readyBtn.classList.add('hidden');
      startBtn.textContent = t(this.lang, 'mpStartMatch');
      const canStart = room.seats.filter(Boolean).length >= 2 || room.fillBots;
      startBtn.disabled = !canStart;
      this._setMpStatus('');
    } else {
      startBtn.classList.add('hidden');
      readyBtn.classList.remove('hidden');
      const me = room.mySeat >= 0 ? room.seats[room.mySeat] : null;
      readyBtn.textContent = me?.ready ? t(this.lang, 'mpUnready') : t(this.lang, 'mpReady');
      this._setMpStatus(t(this.lang, 'mpWaitingHost'));
    }
  }
}

if (typeof document !== 'undefined' && document.getElementById('uno-canvas')) {
  const app = new UnoFriendsApp();
  window.__UNO_APP__ = app;
  app.boot().catch((err) => {
    console.error('UNO boot failed:', err);
  });
}
