// Port of o.java (cRules), r.java (cPlayer + AI + Powers), q.java (Card), n.java (Deck/Hand),
// and a.java:9862-9981, 13905-14090 (UNO match engine, scoring & rules).

export const COLOR_WILD = 0;
export const COLOR_BLUE = 1;
export const COLOR_GREEN = 2;
export const COLOR_RED = 3;
export const COLOR_YELLOW = 4;

export const RANK_REVERSE = 10;
export const RANK_SKIP = 11;
export const RANK_DRAW2 = 12;
export const RANK_WILD = 13;
export const RANK_WILD4 = 14;

export const PHASE_DEAL = 'deal';
export const PHASE_PLAY = 'play';
export const PHASE_PICK_COLOR = 'pick_color';
export const PHASE_PICK_SWAP = 'pick_swap';
export const PHASE_CHALLENGE_PLUS4 = 'challenge_plus4';
export const PHASE_DRAW_CHOICE = 'draw_choice';
export const PHASE_ROUND_END = 'round_end';
export const PHASE_MATCH_END = 'match_end';

// Special powers matching r.java & /6[22]
export const POWER_SHIELD = 0;
export const POWER_SCRAMBLE = 1;
export const POWER_TARGET_PLUS4 = 2;
export const POWER_GLOBAL_PLUS2 = 3;
export const POWER_DUMP_ACTIONS = 4;

export function buildUnoDeck(seedRng = Math.random) {
  const deck = [];
  let uid = 1;
  for (let color = COLOR_BLUE; color <= COLOR_YELLOW; color++) {
    deck.push({ id: uid++, rank: 0, color });
    for (let rank = 1; rank <= 12; rank++) {
      deck.push({ id: uid++, rank, color });
      deck.push({ id: uid++, rank, color });
    }
  }
  for (let i = 0; i < 4; i++) {
    deck.push({ id: uid++, rank: RANK_WILD, color: COLOR_WILD });
    deck.push({ id: uid++, rank: RANK_WILD4, color: COLOR_WILD });
  }
  shuffleArray(deck, seedRng);
  return deck;
}

export function shuffleArray(arr, rng = Math.random) {
  for (let i = arr.length - 1; i > 0; i--) {
    const j = Math.floor(rng() * (i + 1));
    const tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
  return arr;
}

export function cardPoints(card) {
  if (!card) return 0;
  if (card.rank <= 9) return card.rank;
  if (card.rank <= RANK_DRAW2) return 20;
  return 50;
}

export function handPoints(hand) {
  let sum = 0;
  for (const c of hand) sum += cardPoints(c);
  return sum;
}

export function isCardPlayable(card, state) {
  if (!card || !state || !state.topCard) return false;
  if (state.pendingDraw > 0) {
    if (!state.rules.stacking) return false;
    // Stack +2 on +2, or +4 on +4 (and optionally +4 on +2 when enabled)
    if (state.topCard.rank === RANK_DRAW2) {
      return card.rank === RANK_DRAW2 || card.rank === RANK_WILD4;
    }
    if (state.topCard.rank === RANK_WILD4) {
      return card.rank === RANK_WILD4;
    }
    return false;
  }
  if (card.rank === RANK_WILD || card.rank === RANK_WILD4) return true;
  if (card.color === state.currentColor) return true;
  if (card.rank === state.topCard.rank && state.topCard.rank !== RANK_WILD && state.topCard.rank !== RANK_WILD4) {
    return true;
  }
  // Wild turned into color: match by currentColor or if top card has same rank (for +4/Wild excluded above)
  return false;
}

export function hasMatchingColorCard(hand, color) {
  return hand.some((c) => c.color === color && c.rank < RANK_WILD);
}

export class UnoMatch {
  constructor(config = {}) {
    this.rules = {
      mode: config.mode || 'classic', // 'classic' | 'team2v2' | 'elimination' | 'career' | 'multiplayer'
      targetScore: config.targetScore !== undefined ? config.targetScore : 250, // 0 = single hand
      initialCards: config.initialCards || (config.mode === 'career' ? 5 : 7),
      stacking: config.stacking !== undefined ? !!config.stacking : true,
      sevenZero: !!config.sevenZero,
      drawToPlay: config.drawToPlay !== undefined ? !!config.drawToPlay : true,
      challengePlus4: config.challengePlus4 !== undefined ? !!config.challengePlus4 : true,
      specialPowers: !!config.specialPowers,
      difficulty: config.difficulty !== undefined ? config.difficulty : 1, // 0=Easy, 1=Normal, 2=Hard
    };

    this.careerMeta = config.careerMeta || null; // { venue, stage, stageFee, starThresholds }
    this.round = 1;
    this.players = this._initPlayers(config.seats);
    this.deck = [];
    this.discard = [];
    this.topCard = null;
    this.currentColor = COLOR_BLUE;
    this.direction = 1; // 1 = CW (0->1->2->3), -1 = CCW
    this.turnSeat = 0;
    this.pendingDraw = 0;
    this.drawnCard = null;
    this.phase = PHASE_PLAY;
    this.wildCardPending = null;
    this.plus4Context = null; // { offenderSeat, victimSeat, prevColor, wasBluff }
    this.unoVulnerableSeat = -1; // seat at 1 card that did not press UNO!
    this.lastEvent = null; // { type, seat, targetSeat, textKey, ts, seq }
    this.eventSeq = 1;
    this.roundWinner = -1;
    this.matchWinner = -1;
    this.aiThinkMs = 0;
    this.phaseTimerMs = 0;
    this.rng = config.rng || Math.random;

    this.startRound(1);
  }

  _initPlayers(seatsConfig) {
    const defaults = [
      { seat: 0, name: 'Player', isHuman: true, active: true, avatarId: 0, powerIdx: 0, netId: 'local' },
      { seat: 1, name: 'Marcos', isHuman: false, active: true, avatarId: 1, powerIdx: 1, netId: null },
      { seat: 2, name: 'Alison', isHuman: false, active: true, avatarId: 9, powerIdx: 2, netId: null },
      { seat: 3, name: 'Cezar', isHuman: false, active: true, avatarId: 2, powerIdx: 3, netId: null },
    ];
    const src = Array.isArray(seatsConfig) && seatsConfig.length === 4 ? seatsConfig : defaults;
    return src.map((s, idx) => ({
      seat: idx,
      name: s.name || defaults[idx].name,
      isHuman: !!s.isHuman,
      active: s.active !== false,
      eliminated: false,
      avatarId: s.avatarId ?? idx,
      hatIdx: s.hatIdx || 0,
      glassesIdx: s.glassesIdx || 0,
      outfitIdx: s.outfitIdx || 0,
      powerIdx: s.powerIdx ?? (idx % 5),
      powerCharge: this.rules.specialPowers ? 50 : 0, // 0..100
      shieldActive: false,
      unoCalled: false,
      score: 0,
      roundPointsEarned: 0,
      hand: [],
      speech: null, // { key, timer }
      netId: s.netId || null,
    }));
  }

  getActiveSeats() {
    return this.players.filter((p) => p.active && !p.eliminated).map((p) => p.seat);
  }

  _nextSeat(fromSeat, steps = 1) {
    const active = this.getActiveSeats();
    if (active.length <= 1) return active[0] ?? 0;
    let cur = fromSeat;
    let remaining = Math.abs(steps);
    const dir = steps >= 0 ? this.direction : -this.direction;
    while (remaining > 0) {
      cur = (cur + dir + 4) % 4;
      if (this.players[cur].active && !this.players[cur].eliminated) {
        remaining--;
      }
    }
    return cur;
  }

  _emitEvent(type, seat = -1, extra = {}) {
    this.lastEvent = {
      type,
      seat,
      ...extra,
      seq: this.eventSeq++,
    };
  }

  _setSpeech(seat, text) {
    if (this.players[seat]) {
      this.players[seat].speech = { text, ttlMs: 1800 };
    }
  }

  startRound(roundNum = this.round) {
    this.round = roundNum;
    this.deck = buildUnoDeck(this.rng);
    this.discard = [];
    this.direction = 1;
    this.pendingDraw = 0;
    this.drawnCard = null;
    this.wildCardPending = null;
    this.plus4Context = null;
    this.unoVulnerableSeat = -1;
    this.roundWinner = -1;

    for (const p of this.players) {
      p.hand = [];
      p.unoCalled = false;
      p.shieldActive = false;
      p.roundPointsEarned = 0;
      p.speech = null;
      if (p.active && !p.eliminated) {
        for (let i = 0; i < this.rules.initialCards; i++) {
          p.hand.push(this._drawRaw());
        }
      }
    }

    // Starting card must be a colored number/action (never Wild+4 per o.java)
    let starter = this._drawRaw();
    let guard = 0;
    while (starter.rank >= RANK_WILD && guard++ < 40) {
      this.deck.unshift(starter);
      starter = this._drawRaw();
    }
    this.discard.push(starter);
    this.topCard = starter;
    this.currentColor = starter.color >= COLOR_BLUE ? starter.color : COLOR_BLUE;

    const active = this.getActiveSeats();
    this.turnSeat = active.includes(0) ? 0 : active[0];
    this.phase = PHASE_PLAY;
    this.aiThinkMs = 850;
    this._emitEvent('round_start', this.turnSeat, { round: this.round });
  }

  _drawRaw() {
    if (this.deck.length === 0) {
      if (this.discard.length > 1) {
        const keepTop = this.discard.pop();
        const recycle = this.discard.splice(0, this.discard.length);
        for (const c of recycle) {
          if (c.rank >= RANK_WILD) c.color = COLOR_WILD;
        }
        shuffleArray(recycle, this.rng);
        this.deck.push(...recycle);
        this.discard.push(keepTop);
      } else {
        // Emergency fresh deck if players hold literally all 108 cards
        this.deck.push(...buildUnoDeck(this.rng).slice(0, 32));
      }
    }
    return this.deck.pop();
  }

  _givePenaltyCards(seat, count) {
    const p = this.players[seat];
    if (!p || !p.active || p.eliminated) return 0;
    if (p.shieldActive && count > 0) {
      p.shieldActive = false;
      this._setSpeech(seat, 'SHIELD!');
      this._emitEvent('shield_block', seat, { blockedCount: count });
      return 0;
    }
    for (let i = 0; i < count; i++) {
      p.hand.push(this._drawRaw());
    }
    p.unoCalled = false;
    if (this.unoVulnerableSeat === seat) this.unoVulnerableSeat = -1;
    this._setSpeech(seat, `+${count}!`);
    return count;
  }

  canCallUno(seat) {
    const p = this.players[seat];
    if (!p || !p.active || p.eliminated) return false;
    if (p.unoCalled) return false;
    if (seat === this.turnSeat && this.phase === PHASE_PLAY && p.hand.length === 2) {
      // Allow pre-calling UNO right before playing down to 1 card
      return p.hand.some((c) => isCardPlayable(c, this));
    }
    return p.hand.length === 1;
  }

  callUno(seat) {
    const p = this.players[seat];
    if (!p || !p.active || p.eliminated) return false;
    if (!this.canCallUno(seat)) return false;
    p.unoCalled = true;
    if (this.unoVulnerableSeat === seat) this.unoVulnerableSeat = -1;
    this._setSpeech(seat, 'UNO!');
    this._emitEvent('uno_called', seat);
    return true;
  }

  canCatchUno(catcherSeat) {
    return (
      this.unoVulnerableSeat >= 0 &&
      this.unoVulnerableSeat !== catcherSeat &&
      this.players[this.unoVulnerableSeat]?.hand.length === 1 &&
      !this.players[this.unoVulnerableSeat].unoCalled
    );
  }

  catchUno(catcherSeat) {
    if (!this.canCatchUno(catcherSeat)) return false;
    const target = this.unoVulnerableSeat;
    this.unoVulnerableSeat = -1;
    const drew = this._givePenaltyCards(target, 2);
    this._emitEvent('uno_caught', catcherSeat, { targetSeat: target, drew });
    return true;
  }

  playCard(seat, cardId, chosenColor = 0, swapTargetSeat = -1) {
    if (seat !== this.turnSeat) return { ok: false, reason: 'not_turn' };
    if (this.phase !== PHASE_PLAY && this.phase !== PHASE_DRAW_CHOICE) {
      return { ok: false, reason: 'bad_phase' };
    }
    const p = this.players[seat];
    const idx = p.hand.findIndex((c) => c.id === cardId);
    if (idx < 0) return { ok: false, reason: 'no_card' };
    const card = p.hand[idx];
    if (this.phase === PHASE_DRAW_CHOICE && this.drawnCard && card.id !== this.drawnCard.id) {
      return { ok: false, reason: 'must_play_drawn' };
    }
    if (!isCardPlayable(card, this)) return { ok: false, reason: 'illegal_card' };

    const prevColor = this.currentColor;
    const wasBluff = card.rank === RANK_WILD4 && hasMatchingColorCard(p.hand.filter((c) => c.id !== card.id), prevColor);

    p.hand.splice(idx, 1);
    this.drawnCard = null;
    if (this.rules.specialPowers) {
      p.powerCharge = Math.min(100, p.powerCharge + 20);
    }

    // Check UNO call state on reaching 1 card
    if (p.hand.length === 1) {
      if (!p.unoCalled) {
        this.unoVulnerableSeat = seat;
      }
    } else {
      p.unoCalled = false;
      if (this.unoVulnerableSeat === seat) this.unoVulnerableSeat = -1;
    }

    // Place card on discard pile
    const played = { ...card };
    this.discard.push(played);
    this.topCard = played;

    // Immediate win check (except need color selection? Per UNO rules winning last card wins immediately!)
    if (p.hand.length === 0) {
      this._finishRound(seat);
      return { ok: true, roundEnded: true };
    }

    // Wild cards need a color if not provided
    if (played.rank === RANK_WILD || played.rank === RANK_WILD4) {
      if (chosenColor >= COLOR_BLUE && chosenColor <= COLOR_YELLOW) {
        played.color = chosenColor;
        this.currentColor = chosenColor;
      } else {
        this.wildCardPending = { seat, card: played, prevColor, wasBluff };
        this.phase = PHASE_PICK_COLOR;
        this._emitEvent('pick_color', seat, { card: played });
        return { ok: true, awaitingColor: true };
      }
    } else {
      this.currentColor = played.color;
    }

    // 7-0 Swap Rule
    if (this.rules.sevenZero && played.rank === 7) {
      const others = this.getActiveSeats().filter((s) => s !== seat);
      if (swapTargetSeat >= 0 && others.includes(swapTargetSeat)) {
        this._performHandSwap(seat, swapTargetSeat);
      } else if (others.length > 0 && p.isHuman) {
        this.phase = PHASE_PICK_SWAP;
        this._emitEvent('pick_swap', seat);
        return { ok: true, awaitingSwap: true };
      } else if (others.length > 0) {
        // AI swaps with player having fewest cards
        others.sort((a, b) => this.players[a].hand.length - this.players[b].hand.length);
        this._performHandSwap(seat, others[0]);
      }
    } else if (this.rules.sevenZero && played.rank === 0) {
      this._rotateAllHands();
    }

    this._resolveCardEffects(seat, played, prevColor, wasBluff);
    return { ok: true };
  }

  pickWildColor(seat, color) {
    if (this.phase !== PHASE_PICK_COLOR || !this.wildCardPending || this.wildCardPending.seat !== seat) {
      return false;
    }
    if (color < COLOR_BLUE || color > COLOR_YELLOW) return false;
    const { card, prevColor, wasBluff } = this.wildCardPending;
    this.wildCardPending = null;
    card.color = color;
    this.currentColor = color;
    this._resolveCardEffects(seat, card, prevColor, wasBluff);
    return true;
  }

  pickSwapTarget(seat, targetSeat) {
    if (this.phase !== PHASE_PICK_SWAP || seat !== this.turnSeat) return false;
    if (targetSeat === seat || !this.players[targetSeat]?.active || this.players[targetSeat].eliminated) return false;
    this._performHandSwap(seat, targetSeat);
    this._advanceTurn(1);
    return true;
  }

  _performHandSwap(seatA, seatB) {
    const tmp = this.players[seatA].hand;
    this.players[seatA].hand = this.players[seatB].hand;
    this.players[seatB].hand = tmp;
    this.players[seatA].unoCalled = this.players[seatA].hand.length === 1;
    this.players[seatB].unoCalled = this.players[seatB].hand.length === 1;
    this._setSpeech(seatA, 'SWAP 7!');
    this._emitEvent('swap7', seatA, { targetSeat: seatB });
  }

  _rotateAllHands() {
    const active = this.getActiveSeats();
    if (active.length <= 1) return;
    // Rotate hands in play direction
    const ordered = [];
    let cur = active[0];
    for (let i = 0; i < active.length; i++) {
      ordered.push(cur);
      cur = this._nextSeat(cur, 1);
    }
    const saved = this.players[ordered[ordered.length - 1]].hand;
    for (let i = ordered.length - 1; i >= 1; i--) {
      this.players[ordered[i]].hand = this.players[ordered[i - 1]].hand;
      this.players[ordered[i]].unoCalled = this.players[ordered[i]].hand.length === 1;
    }
    this.players[ordered[0]].hand = saved;
    this.players[ordered[0]].unoCalled = saved.length === 1;
    this._emitEvent('rotate0', this.turnSeat);
  }

  _resolveCardEffects(seat, played, prevColor, wasBluff) {
    const active = this.getActiveSeats();
    if (played.rank === RANK_REVERSE) {
      this.direction = -this.direction;
      this._setSpeech(seat, 'REVERSE');
      this._emitEvent('card_played', seat, { card: played, reversed: true });
      if (active.length === 2) {
        // In 2-player UNO, Reverse acts like Skip! (o.java)
        this._advanceTurn(2);
      } else {
        this._advanceTurn(1);
      }
      return;
    }

    if (played.rank === RANK_SKIP) {
      const skipped = this._nextSeat(seat, 1);
      this._setSpeech(skipped, 'SKIPPED');
      this._emitEvent('card_played', seat, { card: played, skippedSeat: skipped });
      this._advanceTurn(2);
      return;
    }

    if (played.rank === RANK_DRAW2) {
      if (this.rules.stacking) {
        this.pendingDraw += 2;
        this._emitEvent('card_played', seat, { card: played, pendingDraw: this.pendingDraw });
        this._advanceTurn(1);
      } else {
        const victim = this._nextSeat(seat, 1);
        this._givePenaltyCards(victim, 2);
        this._emitEvent('card_played', seat, { card: played, targetSeat: victim, drew: 2 });
        this._advanceTurn(2);
      }
      return;
    }

    if (played.rank === RANK_WILD4) {
      if (this.rules.stacking && this.pendingDraw > 0) {
        this.pendingDraw += 4;
        this._emitEvent('card_played', seat, { card: played, pendingDraw: this.pendingDraw });
        this._advanceTurn(1);
        return;
      }
      if (this.rules.challengePlus4 && this.pendingDraw === 0) {
        const victim = this._nextSeat(seat, 1);
        this.turnSeat = victim;
        this.plus4Context = { offenderSeat: seat, victimSeat: victim, prevColor, wasBluff, drawAmount: 4 };
        this.phase = PHASE_CHALLENGE_PLUS4;
        this.aiThinkMs = 900;
        this._emitEvent('challenge_prompt', victim, { offenderSeat: seat, drawAmount: 4 });
        return;
      }
      if (this.rules.stacking) {
        this.pendingDraw += 4;
        this._emitEvent('card_played', seat, { card: played, pendingDraw: this.pendingDraw });
        this._advanceTurn(1);
        return;
      }
      const victim = this._nextSeat(seat, 1);
      this._givePenaltyCards(victim, 4);
      this._emitEvent('card_played', seat, { card: played, targetSeat: victim, drew: 4 });
      this._advanceTurn(2);
      return;
    }

    this._emitEvent('card_played', seat, { card: played });
    this._advanceTurn(1);
  }

  resolvePlus4Challenge(victimSeat, doChallenge) {
    if (this.phase !== PHASE_CHALLENGE_PLUS4 || !this.plus4Context || this.plus4Context.victimSeat !== victimSeat) {
      return false;
    }
    const ctx = this.plus4Context;
    this.plus4Context = null;

    if (!doChallenge) {
      this._givePenaltyCards(victimSeat, ctx.drawAmount);
      this._emitEvent('challenge_declined', victimSeat, { offenderSeat: ctx.offenderSeat, drew: ctx.drawAmount });
      this.phase = PHASE_PLAY;
      this.turnSeat = this._nextSeat(victimSeat, 1);
      this.aiThinkMs = 850;
      return true;
    }

    if (ctx.wasBluff) {
      // Challenge WON: Offender draws 4, victim keeps turn! (o.java, a.java:4637)
      this._givePenaltyCards(ctx.offenderSeat, 4);
      this._setSpeech(victimSeat, 'CAUGHT!');
      this._emitEvent('challenge_won', victimSeat, { offenderSeat: ctx.offenderSeat, drew: 4 });
      this.phase = PHASE_PLAY;
      this.turnSeat = victimSeat;
      this.aiThinkMs = 850;
    } else {
      // Challenge LOST: Challenger draws 6, loses turn! (o.java, a.java:4602)
      this._givePenaltyCards(victimSeat, 6);
      this._setSpeech(victimSeat, '+6!');
      this._emitEvent('challenge_lost', victimSeat, { offenderSeat: ctx.offenderSeat, drew: 6 });
      this.phase = PHASE_PLAY;
      this.turnSeat = this._nextSeat(victimSeat, 1);
      this.aiThinkMs = 850;
    }
    return true;
  }

  drawCard(seat) {
    if (seat !== this.turnSeat || this.phase !== PHASE_PLAY) return { ok: false };
    const p = this.players[seat];

    if (this.pendingDraw > 0) {
      const count = this.pendingDraw;
      this.pendingDraw = 0;
      const actual = this._givePenaltyCards(seat, count);
      this._emitEvent('drew_penalty', seat, { count: actual });
      this._advanceTurn(1);
      return { ok: true, count: actual };
    }

    const card = this._drawRaw();
    p.hand.push(card);
    p.unoCalled = false;
    if (this.unoVulnerableSeat === seat) this.unoVulnerableSeat = -1;

    if (this.rules.drawToPlay && isCardPlayable(card, this)) {
      this.drawnCard = card;
      this.phase = PHASE_DRAW_CHOICE;
      this.aiThinkMs = 700;
      this._emitEvent('draw_playable', seat, { card });
      return { ok: true, card, playable: true };
    }

    this._emitEvent('drew_card', seat);
    this._advanceTurn(1);
    return { ok: true, card, playable: false };
  }

  keepDrawnCard(seat) {
    if (seat !== this.turnSeat || this.phase !== PHASE_DRAW_CHOICE) return false;
    this.drawnCard = null;
    this._emitEvent('kept_drawn', seat);
    this._advanceTurn(1);
    return true;
  }

  canUsePower(seat) {
    const p = this.players[seat];
    return (
      this.rules.specialPowers &&
      seat === this.turnSeat &&
      this.phase === PHASE_PLAY &&
      p && p.active && !p.eliminated &&
      p.powerCharge >= 100
    );
  }

  activatePower(seat, targetSeat = -1) {
    if (!this.canUsePower(seat)) return false;
    const p = this.players[seat];
    p.powerCharge = 0;

    switch (p.powerIdx % 5) {
      case POWER_SHIELD:
        p.shieldActive = true;
        this._setSpeech(seat, 'SHIELD!');
        this._emitEvent('power_shield', seat);
        return true;
      case POWER_SCRAMBLE: {
        const tgt = targetSeat >= 0 ? targetSeat : this._nextSeat(seat, 1);
        this._givePenaltyCards(tgt, 1);
        shuffleArray(this.players[tgt].hand, this.rng);
        this._setSpeech(seat, 'SCRAMBLE!');
        this._emitEvent('power_scramble', seat, { targetSeat: tgt });
        return true;
      }
      case POWER_TARGET_PLUS4: {
        const tgt = targetSeat >= 0 ? targetSeat : this._nextSeat(seat, 1);
        this._givePenaltyCards(tgt, 4);
        this._setSpeech(seat, '+4 STRIKE!');
        this._emitEvent('power_target4', seat, { targetSeat: tgt });
        this._advanceTurn(1);
        return true;
      }
      case POWER_GLOBAL_PLUS2: {
        for (const other of this.getActiveSeats()) {
          if (other !== seat) this._givePenaltyCards(other, 2);
        }
        this._setSpeech(seat, 'ALL +2!');
        this._emitEvent('power_global2', seat);
        return true;
      }
      case POWER_DUMP_ACTIONS: {
        const kept = [];
        let dumped = 0;
        for (const c of p.hand) {
          if (c.rank >= RANK_REVERSE && c.rank <= RANK_DRAW2 && p.hand.length - dumped > 1) {
            this.discard.unshift(c);
            dumped++;
          } else {
            kept.push(c);
          }
        }
        p.hand = kept;
        this._setSpeech(seat, dumped > 0 ? `DUMP ${dumped}!` : 'POWER!');
        this._emitEvent('power_dump', seat, { dumped });
        return true;
      }
      default:
        return false;
    }
  }

  _advanceTurn(stepCount = 1) {
    this.phase = PHASE_PLAY;
    this.turnSeat = this._nextSeat(this.turnSeat, stepCount);
    this.aiThinkMs = 820;
  }

  _finishRound(winnerSeat) {
    this.roundWinner = winnerSeat;
    // Tally points from opponents' remaining hands (a.java:9862-9981)
    let pts = 0;
    const isTeam = this.rules.mode === 'team2v2';
    for (const p of this.players) {
      if (!p.active || p.eliminated || p.seat === winnerSeat) continue;
      if (isTeam && (p.seat % 2) === (winnerSeat % 2)) continue;
      pts += handPoints(p.hand);
    }
    this.players[winnerSeat].roundPointsEarned = pts;
    this.players[winnerSeat].score += pts;
    if (isTeam) {
      const partner = (winnerSeat + 2) % 4;
      if (this.players[partner]?.active) {
        this.players[partner].roundPointsEarned = pts;
        this.players[partner].score += pts;
      }
    }

    // Elimination Tournament mode: eliminate highest hand points player (or loser)
    if (this.rules.mode === 'elimination') {
      const active = this.getActiveSeats();
      if (active.length > 2) {
        let worstSeat = -1;
        let worstPts = -1;
        for (const s of active) {
          if (s === winnerSeat) continue;
          const hp = handPoints(this.players[s].hand);
          if (hp > worstPts) {
            worstPts = hp;
            worstSeat = s;
          }
        }
        if (worstSeat >= 0) this.players[worstSeat].eliminated = true;
      }
    }

    const singleRound = this.rules.targetScore <= 0;
    const reachedTarget = !singleRound && this.players[winnerSeat].score >= this.rules.targetScore;
    const lastStanding = this.rules.mode === 'elimination' && this.getActiveSeats().length <= 1;

    if (singleRound || reachedTarget || lastStanding) {
      this.matchWinner = winnerSeat;
      this.phase = PHASE_MATCH_END;
      this._emitEvent('match_end', winnerSeat, { points: pts });
    } else {
      this.phase = PHASE_ROUND_END;
      this._emitEvent('round_end', winnerSeat, { points: pts });
    }
  }

  step(dtMs) {
    for (const p of this.players) {
      if (p.speech) {
        p.speech.ttlMs -= dtMs;
        if (p.speech.ttlMs <= 0) p.speech = null;
      }
    }
    if (this.phase === PHASE_ROUND_END || this.phase === PHASE_MATCH_END || this.phase === PHASE_PICK_SWAP) {
      return;
    }

    // AI reaction to missed UNO from human/opponent
    if (this.unoVulnerableSeat >= 0) {
      const activeSeats = this.getActiveSeats();
      const aiCatcher = activeSeats.find((s) => !this.players[s].isHuman && s !== this.unoVulnerableSeat);
      if (aiCatcher !== undefined && this.aiThinkMs <= 250 && this.rng() < (0.35 + this.rules.difficulty * 0.25)) {
        this.catchUno(aiCatcher);
      }
    }

    const current = this.players[this.turnSeat];
    if (!current || current.isHuman) return;

    this.aiThinkMs -= dtMs;
    if (this.aiThinkMs > 0) return;
    this._runAiStep();
  }

  // Port of r.java:a(n, o) AI decision heuristic
  _runAiStep() {
    const seat = this.turnSeat;
    const p = this.players[seat];

    if (this.phase === PHASE_CHALLENGE_PLUS4) {
      const chance = 0.22 + this.rules.difficulty * 0.14;
      this.resolvePlus4Challenge(seat, this.rng() < chance);
      return;
    }

    if (this.phase === PHASE_PICK_COLOR) {
      const col = this._chooseBestColor(p.hand);
      this.pickWildColor(seat, col);
      return;
    }

    if (this.phase === PHASE_DRAW_CHOICE && this.drawnCard) {
      const bestCol = this._chooseBestColor(p.hand);
      this.playCard(seat, this.drawnCard.id, bestCol);
      return;
    }

    if (this.phase === PHASE_PLAY) {
      if (this.canUsePower(seat) && p.hand.length >= 4 && this.rng() < 0.65) {
        const tgt = this._nextSeat(seat, 1);
        this.activatePower(seat, tgt);
        if (seat !== this.turnSeat) return;
      }

      const playable = p.hand.filter((c) => isCardPlayable(c, this));
      if (playable.length === 0) {
        this.drawCard(seat);
        return;
      }

      // AI UNO call probability (difficulty scaled)
      if (p.hand.length === 2 && this.rng() < (0.62 + this.rules.difficulty * 0.17)) {
        p.unoCalled = true;
        this._setSpeech(seat, 'UNO!');
      }

      // Rank candidates: prioritize non-Wild cards with highest points matching richest color
      const colorCounts = [0, 0, 0, 0, 0];
      for (const c of p.hand) {
        if (c.color >= 1 && c.color <= 4) colorCounts[c.color]++;
      }
      playable.sort((a, b) => {
        const aWild = a.rank >= RANK_WILD ? 1 : 0;
        const bWild = b.rank >= RANK_WILD ? 1 : 0;
        if (aWild !== bWild) return aWild - bWild;
        const aNextUrgent = this.players[this._nextSeat(seat, 1)].hand.length <= 2 ? 1 : 0;
        if (aNextUrgent) {
          const aAtk = a.rank === RANK_DRAW2 || a.rank === RANK_SKIP || a.rank === RANK_REVERSE ? 1 : 0;
          const bAtk = b.rank === RANK_DRAW2 || b.rank === RANK_SKIP || b.rank === RANK_REVERSE ? 1 : 0;
          if (aAtk !== bAtk) return bAtk - aAtk;
        }
        const diffPts = cardPoints(b) - cardPoints(a);
        if (diffPts !== 0) return diffPts;
        return colorCounts[b.color] - colorCounts[a.color];
      });

      const chosen = playable[0];
      const col = chosen.rank >= RANK_WILD ? this._chooseBestColor(p.hand) : chosen.color;
      this.playCard(seat, chosen.id, col);
    }
  }

  _chooseBestColor(hand) {
    const counts = [0, 0, 0, 0, 0];
    for (const c of hand) {
      if (c.color >= 1 && c.color <= 4) counts[c.color]++;
    }
    let best = 1 + Math.floor(this.rng() * 4);
    let max = -1;
    for (let col = 1; col <= 4; col++) {
      if (counts[col] > max) {
        max = counts[col];
        best = col;
      }
    }
    return best;
  }

  serializeStateForSeat(viewerSeat) {
    return {
      rules: this.rules,
      round: this.round,
      topCard: this.topCard,
      currentColor: this.currentColor,
      direction: this.direction,
      turnSeat: this.turnSeat,
      pendingDraw: this.pendingDraw,
      drawnCardId: viewerSeat === this.turnSeat && this.drawnCard ? this.drawnCard.id : null,
      phase: this.phase,
      plus4Context: this.plus4Context
        ? { offenderSeat: this.plus4Context.offenderSeat, victimSeat: this.plus4Context.victimSeat, drawAmount: this.plus4Context.drawAmount }
        : null,
      unoVulnerableSeat: this.unoVulnerableSeat,
      roundWinner: this.roundWinner,
      matchWinner: this.matchWinner,
      deckCount: this.deck.length,
      lastEvent: this.lastEvent,
      players: this.players.map((p) => ({
        seat: p.seat,
        name: p.name,
        isHuman: p.isHuman,
        active: p.active,
        eliminated: p.eliminated,
        avatarId: p.avatarId,
        hatIdx: p.hatIdx,
        glassesIdx: p.glassesIdx,
        outfitIdx: p.outfitIdx,
        powerIdx: p.powerIdx,
        powerCharge: p.powerCharge,
        shieldActive: p.shieldActive,
        unoCalled: p.unoCalled,
        score: p.score,
        roundPointsEarned: p.roundPointsEarned,
        handCount: p.hand.length,
        // Private hand only sent to the owner (or all if debriefing/ended)
        hand:
          p.seat === viewerSeat || this.phase === PHASE_ROUND_END || this.phase === PHASE_MATCH_END
            ? p.hand
            : null,
        speech: p.speech ? { ...p.speech } : null,
      })),
    };
  }
}
