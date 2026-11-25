import test from 'node:test';
import assert from 'node:assert/strict';
import {
  UnoMatch, buildUnoDeck,
  COLOR_BLUE, COLOR_GREEN, COLOR_RED, COLOR_YELLOW, COLOR_WILD,
  RANK_REVERSE, RANK_SKIP, RANK_DRAW2, RANK_WILD, RANK_WILD4,
  PHASE_PLAY, PHASE_PICK_COLOR, PHASE_CHALLENGE_PLUS4, PHASE_ROUND_END, PHASE_MATCH_END,
} from '../uno-rules.js';

test('Standard 108-card UNO deck distribution is exact', () => {
  const deck = buildUnoDeck();
  assert.equal(deck.length, 108);
  assert.equal(deck.filter((c) => c.rank === 0).length, 4);
  assert.equal(deck.filter((c) => c.rank === RANK_WILD).length, 4);
  assert.equal(deck.filter((c) => c.rank === RANK_WILD4).length, 4);
  assert.equal(deck.filter((c) => c.color === COLOR_BLUE).length, 25);
});

test('Stacking +2, Wild+4 Challenge bluff vs legal, and UNO Call/Catch work 1:1', () => {
  const match = new UnoMatch({ mode: 'classic', targetScore: 0, stacking: true, challengePlus4: true, specialPowers: true });
  // Deterministic board setup
  match.topCard = { id: 901, rank: 5, color: COLOR_BLUE };
  match.currentColor = COLOR_BLUE;
  match.turnSeat = 0;
  match.pendingDraw = 0;
  match.players[0].hand = [
    { id: 1, rank: RANK_DRAW2, color: COLOR_BLUE },
    { id: 2, rank: 3, color: COLOR_RED },
  ];
  match.players[1].hand = [
    { id: 3, rank: RANK_DRAW2, color: COLOR_GREEN },
    { id: 4, rank: 8, color: COLOR_YELLOW },
  ];

  // Player 0 forgets UNO -> plays down to 1 card -> vulnerable
  const resPlay = match.playCard(0, 1);
  assert.equal(resPlay.ok, true);
  assert.equal(match.pendingDraw, 2);
  assert.equal(match.unoVulnerableSeat, 0);
  assert.equal(match.turnSeat, 1);

  // Player 2 catches Player 0 forgetting UNO -> +2 penalty
  assert.equal(match.catchUno(2), true);
  assert.equal(match.players[0].hand.length, 3);

  // Player 1 stacks +2 onto pendingDraw -> 4 pending for Seat 2
  const resStack = match.playCard(1, 3);
  assert.equal(resStack.ok, true);
  assert.equal(match.pendingDraw, 4);
  assert.equal(match.turnSeat, 2);

  // Seat 2 draws all 4 stacked cards
  const drawRes = match.drawCard(2);
  assert.equal(drawRes.ok, true);
  assert.equal(drawRes.count, 4);
  assert.equal(match.pendingDraw, 0);

  // Wild+4 bluff challenge test
  match.turnSeat = 0;
  match.phase = PHASE_PLAY;
  match.topCard = { id: 902, rank: 6, color: COLOR_BLUE };
  match.currentColor = COLOR_BLUE;
  match.players[0].hand = [
    { id: 10, rank: RANK_WILD4, color: COLOR_WILD },
    { id: 11, rank: 4, color: COLOR_BLUE }, // HAS Blue -> bluffing!
  ];
  match.playCard(0, 10, COLOR_RED);
  assert.equal(match.phase, PHASE_CHALLENGE_PLUS4);
  assert.equal(match.plus4Context.victimSeat, 1);

  const p0Before = match.players[0].hand.length;
  match.resolvePlus4Challenge(1, true); // Challenge succeeds!
  assert.equal(match.players[0].hand.length, p0Before + 4);
  assert.equal(match.turnSeat, 1); // Challenger keeps turn
});

test('Special Powers & 7-0 Swap rules mutate hands accurately', () => {
  const match = new UnoMatch({ mode: 'classic', sevenZero: true, specialPowers: true, targetScore: 0 });
  match.turnSeat = 0;
  match.topCard = { id: 903, rank: 7, color: COLOR_YELLOW };
  match.currentColor = COLOR_YELLOW;
  match.players[0].hand = [{ id: 20, rank: 7, color: COLOR_YELLOW }, { id: 21, rank: 2, color: COLOR_GREEN }];
  match.players[1].hand = [{ id: 22, rank: 9, color: COLOR_BLUE }];
  match.players[0].powerIdx = 3; // Global +2
  match.players[0].powerCharge = 100;

  assert.equal(match.activatePower(0), true);
  assert.equal(match.players[1].hand.length, 3);
  assert.equal(match.players[0].powerCharge, 0);

  // 7 Swap with Seat 2
  const seat2Count = match.players[2].hand.length;
  match.playCard(0, 20, 0, 2);
  assert.equal(match.players[0].hand.length, seat2Count);
  assert.equal(match.players[2].hand.length, 1);
});

test('AI players complete full match loop & serializeStateForSeat protects private hands', () => {
  let seed = 42;
  const detRng = () => {
    seed = (seed * 1664525 + 1013904223) >>> 0;
    return seed / 4294967296;
  };
  const seats = [0, 1, 2, 3].map((s) => ({ seat: s, name: `AI${s}`, isHuman: false, active: true }));
  const match = new UnoMatch({ mode: 'classic', targetScore: 0, seats, rng: detRng });

  const view0 = match.serializeStateForSeat(0);
  assert.ok(Array.isArray(view0.players[0].hand));
  assert.equal(view0.players[1].hand, null);
  assert.equal(view0.players[2].hand, null);

  let steps = 0;
  while (match.phase !== PHASE_MATCH_END && steps < 3000) {
    match.step(200);
    steps++;
  }
  assert.equal(match.phase, PHASE_MATCH_END);
  assert.ok(match.matchWinner >= 0 && match.matchWinner < 4);
});
