// Port of a.java:15043-16395 (UI layers), q.java (card sprites), n.java (curved fan layout),
// i.java (customizable avatar composer), l.java (particles), and e.java (bitmap fonts + BSprites).
// Renders the authentic 640x360 J2ME viewport using only decoded binary JAR sprites & bitmap fonts.

import { VIEW_W, VIEW_H, TOP, LEFT, HCENTER, VCENTER, RIGHT, BOTTOM, drawRectMIDP } from './midp-graphics.js';
import { t, VENUE_KEYS, getTotalStars } from './storage-i18n.js';
import {
  COLOR_WILD, COLOR_BLUE, COLOR_GREEN, COLOR_RED, COLOR_YELLOW,
  RANK_WILD, RANK_WILD4, isCardPlayable,
  PHASE_PLAY, PHASE_PICK_COLOR, PHASE_PICK_SWAP,
  PHASE_CHALLENGE_PLUS4, PHASE_DRAW_CHOICE, PHASE_ROUND_END, PHASE_MATCH_END,
} from './uno-rules.js';

const COLOR_HEX = ['#ffffff', '#2277ff', '#22b14c', '#e62e25', '#f2bd1d'];
const COLOR_DARK = ['#333333', '#0e3c8a', '#105824', '#7e120d', '#876308'];

// Seat anchor positions derived directly from /7 UI Layer 10 (L[10]: 5..8, 13..15)
const SEAT_PODS = [
  { seat: 0, x: 109, y: 311, labelY: 325, nameAlign: LEFT | TOP },  // South (Bottom-left pod)
  { seat: 1, x: 64,  y: 80,  labelY: 94,  nameAlign: LEFT | TOP },  // West
  { seat: 2, x: 493, y: 80,  labelY: 94,  nameAlign: RIGHT | TOP }, // North
  { seat: 3, x: 562, y: 295, labelY: 309, nameAlign: RIGHT | TOP }, // East
];

export class UnoRenderer {
  constructor(resources) {
    this.res = resources;
    this.hitRects = [];
    this.particles = [];
    this.cardFlights = [];
    this.shockwaves = [];
    this.timeMs = 0;

    // Gameplay smooth state tracking (works for Solo, Career, Hotseat & Live MP)
    this._handCoordCache = new Map();
    this._cardLiftMap = new Map();
    this._handFocusTargets = new Set();
    this._lastSeenEvSeq = -1;
    this._trackedRound = -1;
    this._trackedTopCardId = -1;
    this._trackedColor = -1;
    this._prevRenderedTopCard = null;
    this._underDiscardCard = null;
    this._discardBounceMs = 0;
    this._discardAngle = 0;
    this._dirHaloAngle = 0;
    this._currentDirection = 1;
    this._lastDtMs = 16;
  }

  _fontLarge() {
    return this.res.fonts[0];
  }

  _fontSmall() {
    return this.res.fonts[1] || this.res.fonts[0];
  }

  _regHit(id, x, y, w, h, payload = null) {
    this.hitRects.push({ id, x, y, w, h, payload });
  }

  hitTest(x, y) {
    // Top-most hit wins
    for (let i = this.hitRects.length - 1; i >= 0; i--) {
      const r = this.hitRects[i];
      if (x >= r.x && x <= r.x + r.w && y >= r.y && y <= r.y + r.h) {
        return r;
      }
    }
    return null;
  }

  spawnConfettiBurst(cx, cy, count = 14) {
    const palette = ['#ffe066', '#4fc3f7', '#69f0ae', '#ff5252', '#ffffff'];
    for (let i = 0; i < count; i++) {
      const ang = (Math.PI * 2 * i) / count + (Math.random() - 0.5) * 0.35;
      const spd = 65 + Math.random() * 140;
      this.particles.push({
        x: cx,
        y: cy,
        vx: Math.cos(ang) * spd,
        vy: Math.sin(ang) * spd - 45,
        ttl: 650 + Math.random() * 400,
        maxTtl: 1050,
        size: 3 + (i % 3),
        rot: Math.random() * Math.PI,
        vRot: (Math.random() - 0.5) * 8,
        color: palette[i % palette.length],
      });
    }
  }

  update(dtMs) {
    this.timeMs += dtMs;
    this._lastDtMs = dtMs;
    this._dirHaloAngle += (this._currentDirection || 1) * (dtMs / 1000) * 1.15;
    if (this._discardBounceMs > 0) {
      this._discardBounceMs = Math.max(0, this._discardBounceMs - dtMs);
    }

    // Smoothly interpolate hover/focus lift of each card on South hand
    const alpha = 1 - Math.exp(-Math.max(1, dtMs) / 42);
    for (const [id, cur] of this._cardLiftMap.entries()) {
      const target = this._handFocusTargets.has(id) ? 18 : 0;
      const next = cur + (target - cur) * alpha;
      if (Math.abs(target - next) < 0.15) this._cardLiftMap.set(id, target);
      else this._cardLiftMap.set(id, next);
    }

    // Advance card play & draw flight trajectories
    for (let i = this.cardFlights.length - 1; i >= 0; i--) {
      const f = this.cardFlights[i];
      if (f.delayMs > 0) {
        f.delayMs -= dtMs;
        continue;
      }
      f.elapsedMs += dtMs;
      if (f.elapsedMs >= f.durationMs) {
        if (f.kind === 'play') {
          this._discardAngle = f.endAngle || 0;
          this._discardBounceMs = 200;
          this.shockwaves.push({
            x: 336,
            y: 172,
            color: COLOR_HEX[f.color] || '#ffffff',
            elapsedMs: 0,
            durationMs: 360,
            maxRadius: 94,
          });
          if (f.card && f.card.rank >= 10) {
            this.spawnConfettiBurst(336, 172, 8);
          }
        }
        this.cardFlights.splice(i, 1);
      }
    }

    // Advance shockwave rings
    for (let i = this.shockwaves.length - 1; i >= 0; i--) {
      const sw = this.shockwaves[i];
      sw.elapsedMs += dtMs;
      if (sw.elapsedMs >= sw.durationMs) {
        this.shockwaves.splice(i, 1);
      }
    }

    for (let i = this.particles.length - 1; i >= 0; i--) {
      const p = this.particles[i];
      p.ttl -= dtMs;
      if (p.ttl <= 0) {
        this.particles.splice(i, 1);
        continue;
      }
      const sec = dtMs / 1000;
      p.vy += 240 * sec;
      p.x += p.vx * sec;
      p.y += p.vy * sec;
      p.rot = (p.rot || 0) + (p.vRot || 0) * sec;
    }
  }

  // Draw a sprite safely with frame fallback
  _drawSprite(ctx, spriteId, frameIdx, x, y, flags = 0, pal = 0) {
    const sp = this.res.sprites[spriteId];
    if (!sp || sp.frames.length === 0) return;
    const f = ((frameIdx % sp.frames.length) + sp.frames.length) % sp.frames.length;
    sp.drawFrame(ctx, f, Math.round(x), Math.round(y), flags, pal);
  }

  // Draw a sprite animation at timeMs
  _drawSpriteAnim(ctx, spriteId, animIdx, x, y, flags = 0, pal = 0) {
    const sp = this.res.sprites[spriteId];
    if (!sp) return;
    if (animIdx >= 0 && animIdx < sp.anims.length && sp.anims[animIdx].count > 0) {
      const slot = Math.floor(this.timeMs / 90) % sp.anims[animIdx].count;
      sp.drawAnimFrame(ctx, animIdx, slot, Math.round(x), Math.round(y), flags, pal);
    } else if (sp.frames.length > 0) {
      sp.drawFrame(ctx, 0, Math.round(x), Math.round(y), flags, pal);
    }
  }

  // Draw beveled J2ME pill button using authentic sp[9] sprite + bitmap font label
  _drawPillButton(ctx, id, label, cx, cy, frameIdx = 2, {
    focused = false,
    disabled = false,
    pal = 0,
    font = null,
    textPal = 0,
    subLabel = null,
    payload = null,
  } = {}) {
    const sp = this.res.sprites[9];
    const b = sp ? sp.getFrameBounds(frameIdx) : { x: -88, y: -25, w: 177, h: 50 };
    const drawPal = disabled ? 2 : (focused ? 1 : pal);

    ctx.save();
    if (disabled) ctx.globalAlpha = 0.52;
    this._drawSprite(ctx, 9, frameIdx, cx, cy, 0, Math.min(drawPal, sp ? sp.getPaletteCount() - 1 : 0));
    if (focused && !disabled) {
      ctx.strokeStyle = '#ffe94d';
      ctx.lineWidth = 2;
      drawRectMIDP(ctx, cx + b.x - 2, cy + b.y - 2, b.w + 4, b.h + 4, true, false);
    }
    const fnt = font || (label.length > 14 ? this._fontSmall() : this._fontLarge());
    if (label) {
      fnt.drawString(ctx, label, cx, cy + (subLabel ? -6 : -1), HCENTER | VCENTER, focused ? 3 : textPal);
    }
    if (subLabel) {
      this._fontSmall().drawString(ctx, subLabel, cx, cy + 12, HCENTER | VCENTER, 3);
    }
    ctx.restore();

    if (!disabled && id) {
      this._regHit(id, cx + b.x, cy + b.y, b.w, b.h, payload);
    }
  }

  _traceCardPath(ctx, rx, ry, rw, rh, radius = 6) {
    ctx.beginPath();
    if (typeof ctx.roundRect === 'function') {
      ctx.roundRect(rx, ry, rw, rh, radius);
    } else {
      const r = Math.min(radius, rw / 2, rh / 2);
      ctx.moveTo(rx + r, ry);
      ctx.arcTo(rx + rw, ry, rx + rw, ry + rh, r);
      ctx.arcTo(rx + rw, ry + rh, rx, ry + rh, r);
      ctx.arcTo(rx, ry + rh, rx, ry, r);
      ctx.arcTo(rx, ry, rx + rw, ry, r);
      ctx.closePath();
    }
  }

  // Draw UNO Card Face (port of q.java:a(int) using authentic sp[54] Wild & sp[56] Colored sprites with clean rounded corners!)
  drawCardFront(ctx, card, x, y, {
    deckPal = 0,
    playable = true,
    selected = false,
    dimUnplayable = true,
  } = {}) {
    if (selected) {
      // Soft rounded golden outer glow matching exact card silhouette
      ctx.save();
      this._traceCardPath(ctx, x - 2, y - 2, 64, 94, 9);
      ctx.fillStyle = 'rgba(255, 235, 59, 0.35)';
      ctx.fill();
      ctx.restore();
    }

    ctx.save();
    // Clip cleanly to true inner rounded UNO card contour (eliminates jagged/grey corner pixels from 60x90 sheet)
    this._traceCardPath(ctx, x + 1.5, y + 1.5, 57, 87, 7);
    ctx.clip();
    if (dimUnplayable && !playable) {
      ctx.filter = 'brightness(0.62)';
    }
    if (!card || card.color === 0 && card.rank >= RANK_WILD) {
      // Uncolored Wild (0) or Wild+4 (1) -> sp[54]
      const wAnim = card && card.rank === RANK_WILD4 ? 1 : 0;
      const sp54 = this.res.sprites[54];
      const frame = sp54 && sp54.anims[wAnim] ? sp54.aframes[sp54.anims[wAnim].first]?.frame ?? wAnim : wAnim;
      this._drawSprite(ctx, 54, frame, x, y, 0, 0);
    } else {
      // Colored card (1=Blue, 2=Green, 3=Red, 4=Yellow) -> sp[56] pal = (color - 1)
      const sp56 = this.res.sprites[56];
      const pal = Math.max(0, Math.min(3, (card.color || 1) - 1));
      let frame = card.rank;
      if (sp56 && card.rank < sp56.anims.length && sp56.anims[card.rank].count > 0) {
        frame = sp56.aframes[sp56.anims[card.rank].first].frame;
      }
      this._drawSprite(ctx, 56, frame, x, y, 0, pal);
    }
    ctx.restore();

    // Smooth crisp rounded card rim (golden when selected, clean white rim otherwise)
    ctx.save();
    this._traceCardPath(ctx, x + 1.5, y + 1.5, 57, 87, 7);
    ctx.strokeStyle = selected ? '#ffeb3b' : (dimUnplayable && !playable ? 'rgba(180,190,210,0.65)' : 'rgba(255,255,255,0.92)');
    ctx.lineWidth = selected ? 2.2 : 1.2;
    ctx.stroke();
    ctx.restore();
  }

  // Draw first frame of a sprite animation slot (keeps skeleton assembly parts exact without wild frame cycling)
  _drawSpriteAnimSlot(ctx, spriteId, animIdx, x, y, flags = 0, pal = 0) {
    const sp = this.res.sprites[spriteId];
    if (!sp) return;
    if (sp.anims.length > 0) {
      const safeAnim = ((animIdx % sp.anims.length) + sp.anims.length) % sp.anims.length;
      if (sp.anims[safeAnim].count > 0) {
        sp.drawAnimFrame(ctx, safeAnim, 0, Math.round(x), Math.round(y), flags, pal);
        return;
      }
    }
    if (sp.frames.length > 0) {
      sp.drawFrame(ctx, 0, Math.round(x), Math.round(y), flags, pal);
    }
  }

  // Resolve exact JAR preset row from /6[0] (`characters`) + player overrides
  _resolveAvatarPreset(player) {
    const chars = this.res.tables?.characters;
    const avId = Math.max(0, player.avatarId || 0);
    const row = Array.isArray(chars) && chars.length > 0 ? chars[avId % chars.length] : null;
    const skinPal = row ? (row[2] ?? (avId % 3)) : (avId % 3);
    const eyeIdx = row ? (row[7] ?? 0) : (avId % 12);
    const eyePal = row ? (row[8] ?? 0) : 0;
    const mouthIdx = row ? (row[9] ?? 0) : (avId % 7);
    const mouthPal = row ? (row[10] ?? skinPal) : skinPal;
    const hairIdx = row ? (row[11] ?? 1) : (avId % 16);
    const hairPal = row ? (row[12] ?? 0) : (avId % 4);
    const shirtIdx = row ? (row[25] ?? 2) : (avId % 16);
    const shirtPal = row ? (row[26] ?? 0) : (avId % 3);
    const glassIdx = player.glassesIdx > 0 ? (player.glassesIdx - 1) % 12 : (row && row[35] >= 0 ? row[35] : -1);
    const glassPal = player.glassesIdx > 0 ? 0 : (row?.[36] ?? 0);
    const hatIdx = player.hatIdx > 0 ? (player.hatIdx - 1) % 13 : (row && row[37] >= 0 ? row[37] : -1);
    const hatPal = player.hatIdx > 0 ? 0 : (row?.[38] ?? 0);
    return { skinPal, eyeIdx, eyePal, mouthIdx, mouthPal, hairIdx, hairPal, shirtIdx, shirtPal, glassIdx, glassPal, hatIdx, hatPal };
  }

  // Draw customizable Avatar Pod (1:1 port of i.java:case 42 using /8[1] Anim 1 bone offsets & /6[0] character presets)
  drawAvatarPod(ctx, cx, cy, player, { isTurn = false, lang = 'en', scoreMode = true, hasHostBadge = false } = {}) {
    const pIdx = Math.max(0, Math.min(5, player.avatarId || 0));
    if (isTurn) {
      const pulse = 0.55 + 0.45 * Math.sin(this.timeMs / 160);
      ctx.save();
      ctx.strokeStyle = `rgba(255, 232, 64, ${pulse.toFixed(2)})`;
      ctx.lineWidth = 3;
      ctx.beginPath();
      ctx.arc(cx, cy - 34, 41, 0, Math.PI * 2);
      ctx.stroke();
      ctx.restore();
    }

    // Compute authoritative remaining card count (live seat has `.hand`, guest snapshot has `.handCount`)
    const handCount = Array.isArray(player.hand) ? player.hand.length : (player.handCount ?? 0);

    // Pod backdrop sp[26] (palettes 0..5)
    this._drawSprite(ctx, 26, isTurn ? 1 : 0, cx, cy, 0, pIdx);

    // Character bust clipped neatly inside circular pod frame (cx, cy - 34, radius 30)
    // Exact /8[1] Anim 1 track order & bone coordinates:
    //   Base body/shirt (-2, -9), Rear head/ears (-4, -53), Head (-5, -53),
    //   Nose/Mouth sp[153+] (0, -46), Eyes/Brows sp[110+] (0, -52), Hair sp[129+] (-4, -44)
    const av = this._resolveAvatarPreset(player);
    const bobY = isTurn ? Math.round(Math.sin(this.timeMs / 240) * 1.2) : 0;
    const ax = cx + 3;
    const ay = cy + 19 + bobY;
    const shirtId = 160 + (av.shirtIdx % 17);
    const eyeSpId = 110 + (av.eyeIdx % 19);
    const mouthSpId = 153 + (av.mouthIdx % 7);
    const hairSpId = 129 + (av.hairIdx % 22);

    ctx.save();
    ctx.beginPath();
    ctx.arc(cx, cy - 34, 30, 0, Math.PI * 2);
    ctx.clip();

    // Rear arm + sleeve
    this._drawSpriteAnimSlot(ctx, 109, 59, ax + 6, ay - 26, 0, av.skinPal);
    this._drawSpriteAnimSlot(ctx, shirtId, 59, ax + 6, ay - 26, 0, av.shirtPal);
    // Base torso skin & shirt
    this._drawSpriteAnimSlot(ctx, 109, 0, ax - 2, ay - 9, 0, av.skinPal);
    this._drawSpriteAnimSlot(ctx, shirtId, 0, ax - 2, ay - 9, 0, av.shirtPal);
    // Ear/back-of-head shadow + Front head skin
    this._drawSpriteAnimSlot(ctx, 152, 1, ax - 4, ay - 53, 0, av.skinPal);
    this._drawSpriteAnimSlot(ctx, 152, 0, ax - 5, ay - 53, 0, av.skinPal);
    // Nose & Mouth sp[153+] at (0, -46)
    this._drawSpriteAnimSlot(ctx, mouthSpId, 0, ax, ay - 46, 0, av.mouthPal);
    // Pair of Eyes & Brows sp[110+] at (0, -52)
    this._drawSpriteAnimSlot(ctx, eyeSpId, 1, ax, ay - 52, 0, av.eyePal);
    // Hair sp[129+] at (-4, -44)
    this._drawSpriteAnimSlot(ctx, hairSpId, 0, ax - 4, ay - 44, 0, av.hairPal);
    // Optional Glasses anchored at eye marker (i.java:278-290)
    if (av.glassIdx >= 0) {
      const spEye = this.res.sprites[eyeSpId];
      const mkEye = spEye ? spEye.getAnimMarker(1, 0, 0) : { ox: 0, oy: -7 };
      this._drawSpriteAnimSlot(ctx, 84 + (av.glassIdx % 12), 0, ax + mkEye.ox, ay - 52 + mkEye.oy, 0, av.glassPal);
    }
    // Optional Hat anchored at head crown marker (i.java:292-304)
    if (av.hatIdx >= 0) {
      const spHead = this.res.sprites[152];
      const mkHead = spHead ? spHead.getAnimMarker(0, 0, 0) : { ox: 1, oy: -15 };
      this._drawSpriteAnimSlot(ctx, 96 + (av.hatIdx % 13), 0, ax - 5 + mkHead.ox, ay - 53 + mkHead.oy, 0, av.hatPal);
    }
    // Front arm + sleeve
    this._drawSpriteAnimSlot(ctx, 109, 11, ax - 17, ay - 24, 0, av.skinPal);
    this._drawSpriteAnimSlot(ctx, shirtId, 11, ax - 17, ay - 24, 0, av.shirtPal);
    this._drawSpriteAnimSlot(ctx, 109, 35, ax - 19, ay - 4, 0, av.skinPal);
    this._drawSpriteAnimSlot(ctx, shirtId, 35, ax - 19, ay - 4, 0, av.shirtPal);
    ctx.restore();

    // Card count pill
    const badgeX = cx + 28;
    const badgeY = cy - 16;
    ctx.fillStyle = handCount === 1 ? '#e62e25' : '#0f2848';
    ctx.strokeStyle = '#ffe96b';
    drawRectMIDP(ctx, badgeX - 13, badgeY - 11, 26, 20, true, true, 1);
    this._fontSmall().drawString(ctx, String(handCount), badgeX, badgeY - 2, HCENTER | VCENTER, handCount === 1 ? 3 : 0);

    // Shield badge if Special Power Shield active
    if (player.shieldActive) {
      ctx.fillStyle = 'rgba(40, 210, 255, 0.85)';
      ctx.fillRect(cx - 42, cy - 68, 22, 16);
      this._fontSmall().drawString(ctx, 'SH', cx - 31, cy - 60, HCENTER | VCENTER, 0);
    }

    // Player Name & Score
    const fSmall = this._fontSmall();
    const shortName = (player.name || 'P').slice(0, 10);
    fSmall.drawString(ctx, shortName, cx, cy + 3, HCENTER | TOP, isTurn ? 3 : 0);
    if (scoreMode && player.score > 0) {
      fSmall.drawString(ctx, `${player.score}`, cx, cy + 20, HCENTER | TOP, 2);
    }

    // Speech bubble (UNO!, +2!, SHIELD!, Chat message - auto-sized and avoids HOST badge)
    if (player.speech && player.speech.text) {
      const txtW = fSmall.measureString(player.speech.text).w;
      const bw = Math.max(82, Math.min(152, txtW + 20));
      const bx = Math.max(bw / 2 + 6, Math.min(VIEW_W - bw / 2 - 6, cx));
      const by = cy < 180 ? cy + 36 : (hasHostBadge ? cy - 104 : cy - 84);
      ctx.save();
      ctx.fillStyle = 'rgba(16, 22, 48, 0.94)';
      ctx.strokeStyle = '#ffd54f';
      ctx.lineWidth = 2;
      this._traceCardPath(ctx, bx - bw / 2, by - 13, bw, 26, 7);
      ctx.fill();
      ctx.stroke();
      ctx.restore();
      fSmall.drawString(ctx, player.speech.text, bx, by - 1, HCENTER | VCENTER, 3);
    }
  }

  // Topbar HUD matching L[14] (Coin count, Stars, Level, Name, Menu Back/Options/Lang)
  _drawTopBar(ctx, save, lang, { showBack = true, title = '' } = {}) {
    ctx.fillStyle = 'rgba(10, 24, 52, 0.82)';
    ctx.fillRect(0, 0, VIEW_W, 44);
    ctx.fillStyle = 'rgba(255, 215, 70, 0.35)';
    ctx.fillRect(0, 43, VIEW_W, 2);

    const fSmall = this._fontSmall();

    // Coins sp[10] token icon
    this._drawSprite(ctx, 10, 3, 142, 22, 0, 0);
    fSmall.drawString(ctx, `${save.coins}`, 164, 22, LEFT | VCENTER, 3);

    // Stars
    this._drawSprite(ctx, 10, 2, 240, 22, 0, 0);
    fSmall.drawString(ctx, `${getTotalStars(save)}/90`, 260, 22, LEFT | VCENTER, 0);

    // Title (right-aligned so long titles never collide with Stars badge)
    if (title) {
      fSmall.drawString(ctx, title, 626, 22, RIGHT | VCENTER, 0);
    }

    if (showBack) {
      this._drawPillButton(ctx, 'nav_back', t(lang, 'back'), 54, 22, 6, { font: fSmall });
    }
  }

  // Render active frame based on Game state
  render(ctx, viewModel) {
    this.hitRects = [];
    ctx.imageSmoothingEnabled = false;
    ctx.clearRect(0, 0, VIEW_W, VIEW_H);

    const { screen, save, lang, focusIdx } = viewModel;

    if (screen !== 'gameplay' && screen !== 'pause' && (this._trackedRound !== -1 || this.cardFlights.length > 0)) {
      this.cardFlights = [];
      this.shockwaves = [];
      this._handCoordCache.clear();
      this._cardLiftMap.clear();
      this._handFocusTargets.clear();
      this._trackedRound = -1;
      this._trackedTopCardId = -1;
      this._trackedColor = -1;
      this._prevRenderedTopCard = null;
      this._underDiscardCard = null;
      this._discardAngle = 0;
    }

    switch (screen) {
      case 'logo':
        this._renderLogo(ctx, lang);
        break;
      case 'splash':
        this._renderSplash(ctx, lang);
        break;
      case 'menu_main':
        this._renderMainMenu(ctx, save, lang, focusIdx);
        break;
      case 'quick_setup':
        this._renderQuickSetup(ctx, viewModel);
        break;
      case 'career_venues':
        this._renderCareerVenues(ctx, viewModel);
        break;
      case 'career_stages':
        this._renderCareerStages(ctx, viewModel);
        break;
      case 'shop':
        this._renderShop(ctx, viewModel);
        break;
      case 'profile':
        this._renderProfile(ctx, viewModel);
        break;
      case 'options':
        this._renderOptions(ctx, viewModel);
        break;
      case 'help':
        this._renderHelp(ctx, viewModel);
        break;
      case 'gameplay':
        this._renderGameplay(ctx, viewModel);
        break;
      case 'pause':
        this._renderGameplay(ctx, viewModel);
        this._renderPauseModal(ctx, lang, focusIdx);
        break;
      case 'debriefing':
        this._renderDebriefing(ctx, viewModel);
        break;
      default:
        this._renderMainMenu(ctx, save, lang, focusIdx);
        break;
    }

    // Floating sparkle/confetti particles on top
    for (const p of this.particles) {
      const alpha = Math.max(0.08, Math.min(1, p.ttl / 350));
      const sz = p.size || 4;
      ctx.save();
      ctx.globalAlpha = alpha;
      ctx.translate(p.x, p.y);
      ctx.rotate(p.rot || 0);
      ctx.fillStyle = p.color || '#ffe066';
      ctx.fillRect(-sz, -1.5, sz * 2, 3);
      ctx.fillRect(-1.5, -sz, 3, sz * 2);
      ctx.restore();
    }
  }

  _renderLogo(ctx, lang) {
    this._drawSprite(ctx, 0, 0, 0, 0, 0, 0);
    this._regHit('skip_intro', 0, 0, VIEW_W, VIEW_H);
  }

  _renderSplash(ctx, lang) {
    this._drawSprite(ctx, 4, 0, 0, 0, 0, 0);
    // Decorative fanned cards on splash
    this.drawCardFront(ctx, { rank: 7, color: COLOR_RED }, 208, 120);
    this.drawCardFront(ctx, { rank: RANK_WILD4, color: COLOR_WILD }, 290, 106);
    this.drawCardFront(ctx, { rank: 9, color: COLOR_BLUE }, 372, 120);

    this._fontLarge().drawString(ctx, t(lang, 'gameTitle'), VIEW_W / 2, 50, HCENTER | VCENTER, 3);
    this._fontSmall().drawString(ctx, t(lang, 'subtitle'), VIEW_W / 2, 78, HCENTER | VCENTER, 0);

    const pulse = Math.sin(this.timeMs / 240) > -0.2;
    this._drawPillButton(ctx, 'splash_start', t(lang, 'play'), VIEW_W / 2, 284, 17, {
      focused: pulse,
      font: this._fontLarge(),
      textPal: 3,
    });
    this._fontSmall().drawString(ctx, t(lang, 'pressStart'), VIEW_W / 2, 330, HCENTER | VCENTER, 0);
    this._regHit('splash_start', 0, 0, VIEW_W, VIEW_H);
  }

  _renderMainMenu(ctx, save, lang, focusIdx) {
    this._drawSprite(ctx, 79, 0, 2, 0, 0, save.themeIdx % 6);
    ctx.fillStyle = 'rgba(6, 16, 38, 0.36)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { showBack: false, title: `${t(lang, 'level')} ${save.level + 1} · ${save.playerName}` });

    // Left hero title + fanned preview cards (bounded inside x < 276)
    this._fontLarge().drawString(ctx, t(lang, 'gameTitle'), 142, 74, HCENTER | VCENTER, 3);
    this._fontSmall().drawString(ctx, t(lang, 'subtitle'), 142, 100, HCENTER | VCENTER, 0);
    this.drawCardFront(ctx, { rank: 12, color: COLOR_RED }, 54, 134);
    this.drawCardFront(ctx, { rank: RANK_WILD, color: COLOR_WILD }, 112, 122);
    this.drawCardFront(ctx, { rank: 10, color: COLOR_GREEN }, 170, 134);

    // Mini avatar badge on bottom-left
    this.drawAvatarPod(ctx, 88, 314, {
      name: save.playerName,
      avatarId: save.avatarId,
      hatIdx: save.hatIdx,
      glassesIdx: save.glassesIdx,
      handCount: save.stats.wins,
      score: 0,
    }, { isTurn: false, lang, scoreMode: false });

    // Right column primary menu pills (4 rows x 2 cols crisp J2ME buttons, 12px gap)
    const fS = this._fontSmall();
    const buttons = [
      { id: 'menu_quick', label: t(lang, 'quickPlay'), x: 374, y: 98 },
      { id: 'menu_career', label: t(lang, 'career'), x: 548, y: 98 },
      { id: 'menu_mp', label: t(lang, 'multiplayer'), x: 374, y: 162, pal: 1 },
      { id: 'menu_hotseat', label: t(lang, 'hotseat'), x: 548, y: 162 },
      { id: 'menu_shop', label: t(lang, 'shop'), x: 374, y: 226 },
      { id: 'menu_profile', label: t(lang, 'profile'), x: 548, y: 226 },
      { id: 'menu_options', label: t(lang, 'options'), x: 374, y: 290 },
      { id: 'menu_help', label: t(lang, 'help'), x: 548, y: 290 },
    ];
    buttons.forEach((b, i) => {
      this._drawPillButton(ctx, b.id, b.label, b.x, b.y, 17, {
        focused: focusIdx === i,
        font: fS,
        pal: b.pal || 0,
        textPal: b.pal === 1 ? 3 : 0,
      });
    });
  }

  _renderQuickSetup(ctx, vm) {
    const { lang, save, quickCfg, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, save.themeIdx % 6);
    ctx.fillStyle = 'rgba(8, 18, 42, 0.72)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: quickCfg.isHotseat ? t(lang, 'hotseat') : t(lang, 'quickPlay') });

    this._drawSprite(ctx, 27, 7, 320, 198, 0, 0);
    const fS = this._fontSmall();

    const rows = [
      { id: 'cfg_players', label: `${t(lang, 'playersLabel')}: ${quickCfg.numPlayers}`, x: 222, y: 108 },
      { id: 'cfg_mode', label: `${t(lang, 'modeLabel')}: ${t(lang, quickCfg.mode === 'team2v2' ? 'modeTeam2v2' : quickCfg.mode === 'elimination' ? 'modeElim' : 'modeClassic')}`, x: 418, y: 108 },
      { id: 'cfg_target', label: `${t(lang, 'targetScoreLabel')}: ${quickCfg.targetScore === 0 ? '1R' : quickCfg.targetScore}`, x: 222, y: 160 },
      { id: 'cfg_diff', label: `${t(lang, 'difficultyLabel')}: ${['Easy', 'Normal', 'Hard'][quickCfg.difficulty]}`, x: 418, y: 160 },
      { id: 'cfg_stack', label: `${t(lang, 'ruleStack')}: ${quickCfg.stacking ? 'ON' : 'OFF'}`, x: 222, y: 212 },
      { id: 'cfg_70', label: `${t(lang, 'rule70')}: ${quickCfg.sevenZero ? 'ON' : 'OFF'}`, x: 418, y: 212 },
      { id: 'cfg_challenge', label: `${t(lang, 'ruleChallenge')}: ${quickCfg.challengePlus4 ? 'ON' : 'OFF'}`, x: 222, y: 264 },
      { id: 'cfg_powers', label: `${t(lang, 'rulePowers')}: ${quickCfg.specialPowers ? 'ON' : 'OFF'}`, x: 418, y: 264 },
    ];
    rows.forEach((r, idx) => {
      this._drawPillButton(ctx, r.id, r.label, r.x, r.y, 3, { focused: focusIdx === idx, font: fS });
    });
    this._drawPillButton(ctx, 'cfg_start', t(lang, 'startMatch'), 320, 326, 2, {
      focused: focusIdx === rows.length,
      textPal: 3,
      font: this._fontLarge(),
    });
  }

  _renderCareerVenues(ctx, vm) {
    const { lang, save, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, 1);
    ctx.fillStyle = 'rgba(6, 14, 34, 0.72)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: t(lang, 'career') });

    const venuesTable = this.res.tables?.venues || [];
    const totalStars = getTotalStars(save);
    const fS = this._fontSmall();

    for (let v = 0; v < 6; v++) {
      const col = v % 3;
      const row = Math.floor(v / 3);
      const cx = 114 + col * 206;
      const cy = 128 + row * 124;
      const reqStars = venuesTable[v] ? venuesTable[v][5] : v * 5;
      const unlocked = save.unlockedVenues[v] || totalStars >= reqStars;
      const vStars = save.stageStars[v].reduce((a, b) => a + b, 0);

      ctx.save();
      ctx.fillStyle = unlocked ? 'rgba(16, 46, 86, 0.92)' : 'rgba(28, 30, 44, 0.85)';
      ctx.strokeStyle = focusIdx === v ? '#ffe94d' : (unlocked ? '#4fc3f7' : '#666');
      drawRectMIDP(ctx, cx - 88, cy - 54, 176, 108, true, true, focusIdx === v ? 3 : 2);

      // Unique venue illustration sp[28..33] clipped neatly inside card bounds
      ctx.save();
      ctx.beginPath();
      ctx.rect(cx - 86, cy - 52, 172, 104);
      ctx.clip();
      this._drawSprite(ctx, 28 + v, 0, cx, cy - 4, 0, 0);
      ctx.fillStyle = 'rgba(6, 14, 34, 0.72)';
      ctx.fillRect(cx - 86, cy - 52, 172, 24);
      ctx.fillRect(cx - 86, cy + 24, 172, 28);
      ctx.restore();

      fS.drawString(ctx, `${v + 1}. ${VENUE_KEYS[v]}`, cx, cy - 40, HCENTER | VCENTER, unlocked ? 3 : 0);
      const statusTxt = unlocked ? `${vStars}/15 ${t(lang, 'stars')}` : `${t(lang, 'locked')} (${reqStars}*)`;
      fS.drawString(ctx, statusTxt, cx, cy + 37, HCENTER | VCENTER, unlocked ? 2 : 1);
      ctx.restore();

      this._regHit(`venue_${v}`, cx - 88, cy - 52, 176, 104, { venue: v, unlocked, reqStars });
    }
  }

  _renderCareerStages(ctx, vm) {
    const { lang, save, selectedVenue, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, selectedVenue % 6);
    ctx.fillStyle = 'rgba(6, 14, 34, 0.78)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: `${VENUE_KEYS[selectedVenue]} (${t(lang, 'career')})` });

    const stages = this.res.tables?.careerStages || [];
    const fS = this._fontSmall();
    for (let s = 0; s < 5; s++) {
      const cx = 76 + s * 122;
      const cy = 190;
      const stageRow = stages[selectedVenue * 5 + s] || [];
      const unlocked = save.stageUnlocked[selectedVenue]?.[s] || s === 0;
      const stars = save.stageStars[selectedVenue]?.[s] || 0;
      const fee = stageRow[12] || 50;

      ctx.fillStyle = unlocked ? 'rgba(20, 56, 102, 0.94)' : 'rgba(30, 32, 42, 0.85)';
      ctx.strokeStyle = focusIdx === s ? '#ffe94d' : '#58a6ff';
      drawRectMIDP(ctx, cx - 52, cy - 92, 104, 184, true, true, focusIdx === s ? 3 : 2);

      fS.drawString(ctx, `${t(lang, 'careerStageGoal')} ${s + 1}`, cx, cy - 72, HCENTER | VCENTER, 3);
      fS.drawString(ctx, `${stars}/3 *`, cx, cy - 44, HCENTER | VCENTER, 2);
      const modeName = stageRow[3] === 1 ? '2v2' : stageRow[3] === 2 ? 'Elim' : `${stageRow[2] || 4}P`;
      fS.drawString(ctx, modeName, cx, cy - 12, HCENTER | VCENTER, 0);
      fS.drawString(ctx, `${t(lang, 'fee')}: ${fee}`, cx, cy + 16, HCENTER | VCENTER, 1);

      if (unlocked) {
        this._drawPillButton(ctx, `stage_${s}`, t(lang, 'play'), cx, cy + 62, 6, { font: fS, payload: { venue: selectedVenue, stage: s } });
      } else {
        fS.drawString(ctx, t(lang, 'locked'), cx, cy + 62, HCENTER | VCENTER, 1);
      }
    }
  }

  _renderShop(ctx, vm) {
    const { lang, save, shopTab, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, 2);
    ctx.fillStyle = 'rgba(8, 18, 42, 0.80)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: t(lang, 'shop') });

    const fS = this._fontSmall();
    // Avatar live preview on left
    this.drawAvatarPod(ctx, 84, 182, {
      name: save.playerName,
      avatarId: save.avatarId,
      hatIdx: save.hatIdx,
      glassesIdx: save.glassesIdx,
      handCount: save.stats.wins,
      score: 0,
    }, { isTurn: true, lang, scoreMode: false });

    // Category tabs
    const tabs = [
      { id: 'shop_tab_0', label: 'Themes' },
      { id: 'shop_tab_1', label: 'Decks' },
      { id: 'shop_tab_2', label: 'Powers' },
      { id: 'shop_tab_3', label: 'Avatars' },
    ];
    tabs.forEach((tb, idx) => {
      this._drawPillButton(ctx, tb.id, tb.label, 224 + idx * 106, 74, 6, {
        focused: shopTab === idx,
        font: fS,
        payload: idx,
      });
    });

    // Items grid (using wide sp[9] f1 pills)
    const items = this._getShopItems(shopTab, save, lang);
    items.forEach((it, idx) => {
      const col = idx % 2;
      const row = Math.floor(idx / 2);
      const cx = 276 + col * 234;
      const cy = 136 + row * 60;
      const stateLabel = it.equipped ? t(lang, 'equipped') : (it.owned ? t(lang, 'equip') : `${it.price}`);
      this._drawPillButton(ctx, `shop_buy_${idx}`, `${it.name} (${stateLabel})`, cx, cy, 1, {
        focused: focusIdx === idx,
        font: fS,
        textPal: it.equipped ? 2 : (it.owned ? 0 : 3),
        payload: { tab: shopTab, idx, item: it },
      });
    });
  }

  _getShopItems(tab, save, lang) {
    if (tab === 0) {
      const names = ['Classic', 'Brazil', 'USA', 'France', 'China', 'Egypt'];
      return names.map((nm, i) => ({
        name: nm,
        price: i === 0 ? 0 : i * 200,
        owned: save.ownedThemes.includes(i),
        equipped: save.themeIdx === i,
      }));
    }
    if (tab === 1) {
      const names = ['Standard', 'Royal', 'Neon', 'Gold', 'Midnight', 'Retro'];
      return names.map((nm, i) => ({
        name: nm,
        price: i === 0 ? 0 : i * 180,
        owned: save.ownedDecks.includes(i),
        equipped: save.deckIdx === i,
      }));
    }
    if (tab === 2) {
      return t(lang, 'powerNames').map((nm, i) => ({
        name: nm,
        price: i < 2 ? 0 : i * 250,
        owned: !!save.ownedPowers[i],
        equipped: save.powerIdx === i,
      }));
    }
    const chars = ['Player', 'Marcos', 'Cezar', 'Marisa', 'Finn', 'Alison'];
    return chars.map((nm, i) => ({
      name: nm,
      price: i === 0 ? 0 : i * 150,
      owned: i === 0 || save.ownedHats.includes(i),
      equipped: save.avatarId === i,
    }));
  }

  _renderProfile(ctx, vm) {
    const { lang, save, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, 0);
    ctx.fillStyle = 'rgba(8, 18, 42, 0.80)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: t(lang, 'profile') });

    this._drawSprite(ctx, 27, 7, 320, 200, 0, 0);
    const fS = this._fontSmall();
    this.drawAvatarPod(ctx, 168, 184, {
      name: save.playerName,
      avatarId: save.avatarId,
      hatIdx: save.hatIdx,
      glassesIdx: save.glassesIdx,
      handCount: save.stats.wins,
      score: save.xp,
    }, { isTurn: false, lang });

    fS.drawString(ctx, `${t(lang, 'level')} ${save.level + 1} (${save.xp} XP)`, 380, 122, HCENTER | VCENTER, 3);
    fS.drawString(ctx, `Games: ${save.stats.gamesPlayed}  -  Wins: ${save.stats.wins}`, 380, 152, HCENTER | VCENTER, 0);
    fS.drawString(ctx, `UNO Calls: ${save.stats.unoCalls}  -  Powers: ${save.stats.powersUsed}`, 380, 180, HCENTER | VCENTER, 0);
    const achCount = save.achievements.filter(Boolean).length;
    fS.drawString(ctx, `Achievements: ${achCount} / 30`, 380, 208, HCENTER | VCENTER, 2);

    this._drawPillButton(ctx, 'prof_lottery', 'Daily Scratch (+Coins)', 380, 274, 3, { focused: focusIdx === 0, font: fS, textPal: 3 });
  }

  _renderOptions(ctx, vm) {
    const { lang, save, focusIdx } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, save.themeIdx % 6);
    ctx.fillStyle = 'rgba(8, 18, 42, 0.80)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: t(lang, 'options') });

    this._drawSprite(ctx, 27, 7, 320, 200, 0, 0);
    const fS = this._fontSmall();
    const btns = [
      { id: 'opt_sfx', label: t(lang, save.sfx ? 'soundOn' : 'soundOff'), x: 320, y: 122 },
      { id: 'opt_music', label: t(lang, save.music ? 'musicOn' : 'musicOff'), x: 320, y: 180 },
      { id: 'opt_lang', label: t(lang, 'langToggle'), x: 320, y: 238 },
      { id: 'opt_reset', label: 'Reset Save', x: 320, y: 296 },
    ];
    btns.forEach((b, i) => {
      this._drawPillButton(ctx, b.id, b.label, b.x, b.y, 2, { focused: focusIdx === i, font: fS });
    });
  }

  _renderHelp(ctx, vm) {
    const { lang, save, helpPage } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, 0);
    ctx.fillStyle = 'rgba(8, 18, 42, 0.84)';
    ctx.fillRect(0, 44, VIEW_W, VIEW_H - 44);
    this._drawTopBar(ctx, save, lang, { title: t(lang, 'help') });

    this._drawSprite(ctx, 27, 7, 320, 198, 0, 0);
    const fS = this._fontSmall();
    const pages = lang === 'vi'
      ? [
          '1. Đánh bài cùng Màu, cùng Số hoặc Ký Hiệu với lá trên cùng.\nRút 1 lá khi không có bài hợp lệ.\nKhi còn 1 lá, hãy nhấn ngay nút UNO! để không bị phạt +2 lá.',
          '2. Lá Đặc Biệt:\n- Đảo Chiều: Đổi vòng chơi.\n- Cấm Lượt: Người kế mất lượt.\n- +2 / Đổi Màu +4: Ép rút bài hoặc Cộng dồn nếu bật luật Stack.',
          '3. Luật Nâng Cao & Kỹ Năng:\n- 7-0: Đánh 7 đổi bài với 1 người, đánh 0 xoay cả bàn.\n- Kỹ năng: Khiên, Xáo Bài, Đòn +4, Cả Bàn +2, Xả Chức Năng.',
        ]
      : [
          '1. Match the top discard card by Color, Number, or Action symbol.\nDraw 1 card if you cannot play.\nPress UNO! when playing down to 1 card so opponents cannot catch you (+2).',
          '2. Action & Wild Cards:\n- Reverse flips direction (acts as Skip in 2P).\n- Skip skips next seat.\n- +2 / Wild +4 can stack when Stacking rule is enabled!',
          '3. House Rules & Powers:\n- 7-0 Swap: 7 swaps hands; 0 rotates all hands.\n- Special Powers charge +20% per play and trigger Shields, Strikes, or +2.',
        ];
    const safePage = ((helpPage % pages.length) + pages.length) % pages.length;
    fS.drawWrappedText(ctx, pages[safePage], 130, 96, 380, LEFT | TOP, 0);
    this._drawPillButton(ctx, 'help_prev', '< Prev', 220, 294, 6, { font: fS });
    fS.drawString(ctx, `${safePage + 1}/${pages.length}`, 320, 294, HCENTER | VCENTER, 3);
    this._drawPillButton(ctx, 'help_next', 'Next >', 420, 294, 6, { font: fS });
  }

  _seatFlightOrigin(relSeat, handCardId = null, forDrawDest = false) {
    if (relSeat === 0) {
      if (!forDrawDest && handCardId != null && this._handCoordCache.has(handCardId)) {
        const pos = this._handCoordCache.get(handCardId);
        return { x: pos.x, y: pos.y, angle: 0, scale: 1 };
      }
      return { x: 300, y: 264, angle: 0, scale: 1 };
    }
    if (relSeat === 1) return { x: 24, y: 148, angle: -0.32, scale: 0.72 };
    if (relSeat === 2) return { x: 286, y: 12, angle: 0.16, scale: 0.72 };
    return { x: 564, y: 122, angle: 0.32, scale: 0.72 };
  }

  _syncGameplayTransitions(match, localSeat, deckIdx) {
    this._currentDirection = match.direction || 1;
    const ev = match.lastEvent;

    if (this._trackedRound !== match.round) {
      this._trackedRound = match.round;
      this.cardFlights = [];
      this.shockwaves = [];
      this._trackedTopCardId = match.topCard?.id ?? -1;
      this._trackedColor = match.currentColor;
      this._prevRenderedTopCard = match.topCard ? { ...match.topCard, color: match.currentColor } : null;
      this._underDiscardCard = this._prevRenderedTopCard;
      this._lastSeenEvSeq = ev?.seq ?? 0;
      this._discardAngle = 0;
      this._discardBounceMs = 200;
      return;
    }

    // Track draw events (works for Solo, Hotseat & Live MP Host/Guest!)
    if (ev && ev.seq !== this._lastSeenEvSeq) {
      this._lastSeenEvSeq = ev.seq;
      const drawEvents = new Set([
        'drew_card', 'draw_playable', 'drew_penalty',
        'challenge_won', 'challenge_lost', 'challenge_declined', 'uno_caught',
      ]);
      if (drawEvents.has(ev.type)) {
        const targetSeat = ev.type === 'challenge_won' ? (ev.offenderSeat ?? ev.seat) : ev.seat;
        const relTarget = ((targetSeat - localSeat) % 4 + 4) % 4;
        const dest = this._seatFlightOrigin(relTarget, null, true);
        const count = Math.min(4, Math.max(1, ev.count || ev.drew || 1));
        for (let k = 0; k < count; k++) {
          this.cardFlights.push({
            kind: 'draw',
            fromX: 248,
            fromY: 174,
            toX: dest.x + 30,
            toY: dest.y + 45,
            delayMs: k * 65,
            elapsedMs: 0,
            durationMs: 260,
            arcHeight: 20,
            startAngle: -0.18,
            endAngle: relTarget === 0 ? 0 : (relTarget === 1 ? -0.45 : relTarget === 3 ? 0.45 : 0.15),
            startScale: 0.72,
            endScale: 0.62,
            deckIdx,
          });
        }
      }
    }

    // Track card played onto Discard pile (any change of topCard.id)
    if (match.topCard && match.topCard.id !== this._trackedTopCardId) {
      const prev = this._prevRenderedTopCard;
      if (prev) this._underDiscardCard = prev;
      this._trackedTopCardId = match.topCard.id;
      this._trackedColor = match.currentColor;

      let fromSeat = match.turnSeat;
      if (ev) {
        if (ev.type === 'challenge_prompt') fromSeat = match.plus4Context?.offenderSeat ?? ev.seat;
        else if (ev.type === 'card_played' || ev.type === 'pick_color' || ev.type === 'round_end' || ev.type === 'match_end') {
          fromSeat = ev.seat;
        }
      }
      const relFrom = ((fromSeat - localSeat) % 4 + 4) % 4;
      const origin = this._seatFlightOrigin(relFrom, match.topCard.id, false);
      const tilt = ((match.topCard.id % 5) - 2) * 0.025;

      this.cardFlights.push({
        kind: 'play',
        card: { ...match.topCard },
        color: match.currentColor,
        fromX: origin.x,
        fromY: origin.y,
        toX: 336 - 30,
        toY: 172 - 45,
        delayMs: 0,
        elapsedMs: 0,
        durationMs: 280,
        arcHeight: relFrom === 0 ? 20 : 30,
        startAngle: origin.angle,
        endAngle: tilt,
        startScale: origin.scale,
        endScale: 1,
        deckIdx,
      });
    } else if (match.topCard && this._trackedColor !== match.currentColor) {
      // Wild color picked after card landed -> smooth color ring pulse + shockwave
      this._trackedColor = match.currentColor;
      this._discardBounceMs = 170;
      this.shockwaves.push({
        x: 336,
        y: 172,
        color: COLOR_HEX[match.currentColor] || '#ffffff',
        elapsedMs: 0,
        durationMs: 320,
        maxRadius: 90,
      });
    }

    if (match.topCard) {
      this._prevRenderedTopCard = { ...match.topCard, color: match.currentColor };
    }
  }

  _renderCardFlights(ctx, deckIdx) {
    // Shockwave rings around Discard pile when card impacts
    for (const sw of this.shockwaves) {
      const tNorm = Math.min(1, sw.elapsedMs / sw.durationMs);
      const ease = 1 - Math.pow(1 - tNorm, 2);
      const r = 42 + (sw.maxRadius - 42) * ease;
      const alpha = Math.max(0, 0.72 * (1 - tNorm));
      ctx.save();
      ctx.strokeStyle = sw.color;
      ctx.globalAlpha = alpha;
      ctx.lineWidth = Math.max(1, 5 * (1 - tNorm));
      ctx.beginPath();
      ctx.arc(sw.x, sw.y, r, 0, Math.PI * 2);
      ctx.stroke();
      ctx.restore();
    }

    for (const f of this.cardFlights) {
      if (f.delayMs > 0) continue;
      const tNorm = Math.min(1, f.elapsedMs / Math.max(1, f.durationMs));
      const ease = 1 - Math.pow(1 - tNorm, 3);
      const liftY = f.arcHeight * Math.sin(tNorm * Math.PI);
      const x = f.fromX + (f.toX - f.fromX) * ease;
      const y = f.fromY + (f.toY - f.fromY) * ease - liftY;
      const ang = f.startAngle + (f.endAngle - f.startAngle) * ease;
      const sc = f.startScale + (f.endScale - f.startScale) * ease + (f.kind === 'play' ? 0.14 * Math.sin(tNorm * Math.PI) : 0);

      if (f.kind === 'play') {
        // Soft rounded drop shadow beneath airborne card (matches 6px card corners cleanly)
        ctx.save();
        ctx.fillStyle = `rgba(0, 0, 0, ${(0.26 + 0.14 * Math.sin(tNorm * Math.PI)).toFixed(2)})`;
        ctx.translate(x + 30 + liftY * 0.28, y + 45 + liftY * 0.42);
        ctx.rotate(ang);
        ctx.scale(sc, sc);
        this._traceCardPath(ctx, -29, -44, 58, 88, 6);
        ctx.fill();
        ctx.restore();

        ctx.save();
        ctx.translate(x + 30, y + 45);
        ctx.rotate(ang);
        ctx.scale(sc, sc);
        this.drawCardFront(ctx, { ...f.card, color: f.color }, -30, -45, {
          playable: true,
          dimUnplayable: false,
        });
        ctx.restore();
      } else {
        ctx.save();
        ctx.translate(x, y);
        ctx.rotate(ang);
        ctx.scale(sc, sc);
        this._drawSprite(ctx, 51, 0, 0, 0, 0, deckIdx % 6);
        ctx.restore();
      }
    }
  }

  _renderGameplay(ctx, vm) {
    const { save, lang, match, selectedCardIdx, hoverCardIdx, localSeat = 0, isMp = false } = vm;
    if (!match) return;

    const themeIdx = save.themeIdx % 6;
    const deckIdx = save.deckIdx % 6;

    this._syncGameplayTransitions(match, localSeat, deckIdx);

    // 1. Authentic Tabletop surface sp[79] + subtle vignette
    this._drawSprite(ctx, 79, 0, 2, 0, 0, themeIdx);

    // Pause / Rules HUD Top-right & clear open-felt Round indicator above Power button
    const fS = this._fontSmall();
    this._drawPillButton(ctx, 'match_pause', 'II', 606, 24, 4, { font: fS });
    fS.drawString(ctx, `R${match.round}${match.rules.targetScore > 0 ? ` / ${match.rules.targetScore}pts` : ''}`, 148, 132, HCENTER | VCENTER, 0);

    // 2. Active UNO Color ring + spinning clockwise/CCW direction halo around center discard pile
    const centerX = 336;
    const centerY = 172;
    ctx.save();
    ctx.strokeStyle = COLOR_HEX[match.currentColor] || '#ffffff';
    ctx.lineWidth = this._discardBounceMs > 0 ? 5 : 4;
    ctx.beginPath();
    ctx.arc(centerX, centerY, 64, 0, Math.PI * 2);
    ctx.stroke();

    ctx.translate(centerX, centerY);
    ctx.rotate(this._dirHaloAngle);
    ctx.strokeStyle = 'rgba(255,255,255,0.48)';
    ctx.lineWidth = 2;
    ctx.setLineDash([10, 7]);
    ctx.beginPath();
    ctx.arc(0, 0, 74, 0, Math.PI * 2);
    ctx.stroke();
    ctx.restore();

    fS.drawString(
      ctx,
      match.direction === 1 ? `>>> ${t(lang, 'directionCW')} >>>` : `<<< ${t(lang, 'directionCCW')} <<<`,
      centerX,
      98,
      HCENTER | BOTTOM,
      0
    );

    // 3. Draw Deck (sp[51]) & Discard Pile (sp[81] + topCard / in-flight underCard)
    const deckX = 248;
    const deckY = 174;
    const canLocalAct = match.turnSeat === localSeat && (match.phase === PHASE_PLAY || match.phase === PHASE_DRAW_CHOICE);
    const anyPlayable = match.players[localSeat]?.hand?.some((c) => isCardPlayable(c, match));
    const drawHighlight = canLocalAct && match.phase === PHASE_PLAY && (!anyPlayable || match.pendingDraw > 0);
    this._drawSprite(ctx, 51, drawHighlight ? 1 : 0, deckX, deckY, 0, deckIdx % 6);
    fS.drawString(ctx, `${match.deckCount ?? match.deck?.length ?? 0}`, deckX, deckY + 26, HCENTER | VCENTER, 0);
    if (match.turnSeat === localSeat && match.phase === PHASE_PLAY) {
      this._regHit('deck_draw', deckX - 38, deckY - 46, 76, 92);
    }

    // Discard pile top card: keeps previous card intact for the entire flight until landing at 100%, then pops seamlessly at the matching landing angle
    this._drawSprite(ctx, 81, 0, centerX - 34, centerY - 46, 0, deckIdx % 6);
    const activePlayFlight = this.cardFlights.some((fl) => fl.kind === 'play' && fl.delayMs <= 0);
    const shownTopCard = activePlayFlight && this._underDiscardCard
      ? this._underDiscardCard
      : (match.topCard ? { ...match.topCard, color: match.currentColor } : null);
    if (shownTopCard) {
      const rem = this._discardBounceMs > 0 ? (this._discardBounceMs / 200) : 0;
      const bounceScale = rem > 0 ? 1 + 0.06 * Math.sin((1 - rem) * Math.PI) : 1;
      const drawAngle = activePlayFlight ? 0 : (this._discardAngle || 0);
      ctx.save();
      ctx.translate(centerX, centerY);
      if (drawAngle) ctx.rotate(drawAngle);
      if (bounceScale !== 1) ctx.scale(bounceScale, bounceScale);
      this.drawCardFront(ctx, shownTopCard, -30, -45, {
        playable: true,
        dimUnplayable: false,
      });
      ctx.restore();
    }
    if (match.pendingDraw > 0) {
      ctx.fillStyle = '#d32f2f';
      ctx.fillRect(centerX + 18, centerY - 56, 38, 22);
      fS.drawString(ctx, `+${match.pendingDraw}`, centerX + 37, centerY - 45, HCENTER | VCENTER, 3);
    }

    // 4. Relative seats mapped so viewer `localSeat` is ALWAYS South (bottom)!
    for (let rel = 0; rel < 4; rel++) {
      const actualSeat = (localSeat + rel) % 4;
      const player = match.players[actualSeat];
      if (!player || !player.active || player.eliminated) continue;
      const pod = SEAT_PODS[rel];
      const isTurn = match.turnSeat === actualSeat;
      const pCount = Array.isArray(player.hand) ? player.hand.length : (player.handCount ?? 0);

      // Render opponent curved fanned backs sp[80] before avatar pod
      if (rel !== 0) {
        this._renderOpponentFan(ctx, rel, pCount, deckIdx);
      }

      this.drawAvatarPod(ctx, pod.x, pod.y, player, {
        isTurn,
        lang,
        scoreMode: true,
        hasHostBadge: isMp && actualSeat === 0,
      });

      if (isMp && actualSeat === 0) {
        fS.drawString(ctx, 'HOST', pod.x, pod.y - 76, HCENTER | BOTTOM, 3);
      }
      if (match.phase === PHASE_PICK_SWAP && match.turnSeat === localSeat && rel !== 0) {
        this._regHit(`swap_seat_${actualSeat}`, pod.x - 42, pod.y - 72, 84, 96, actualSeat);
      }
    }

    // 5. South (viewerSeat) fanned hand cards
    const me = match.players[localSeat];
    if (me && Array.isArray(me.hand)) {
      this._renderBottomHand(ctx, me.hand, match, localSeat, selectedCardIdx, hoverCardIdx, deckIdx);
    }

    // 6. Special Power button (positioned cleanly in open left-mid felt between West/Deck/South) + UNO button
    if (match.rules.specialPowers && me) {
      const ready = me.powerCharge >= 100 && match.turnSeat === localSeat && match.phase === PHASE_PLAY;
      const pName = t(lang, 'powerShort')[me.powerIdx % 5];
      this._drawPillButton(ctx, 'btn_power', `${pName} ${me.powerCharge}%`, 148, 172, 6, {
        disabled: !ready,
        focused: ready,
        font: fS,
        textPal: ready ? 3 : 0,
      });
    }

    const canUno = this._canShowUno(match, localSeat);
    const canCatch = match.unoVulnerableSeat >= 0 && match.unoVulnerableSeat !== localSeat;
    if (canUno || canCatch) {
      const btnId = canCatch ? 'btn_catch_uno' : 'btn_uno';
      const pulse = 1 + 0.06 * Math.sin(this.timeMs / 110);
      ctx.save();
      ctx.translate(489, 192);
      ctx.scale(pulse, pulse);
      this._drawSprite(ctx, 23, canCatch ? 1 : 0, 0, 0, 0, 0);
      fS.drawString(ctx, canCatch ? t(lang, 'catchUno') : 'UNO!', 0, -2, HCENTER | VCENTER, 3);
      ctx.restore();
      this._regHit(btnId, 444, 144, 90, 96);
    }

    // Flying card play/draw trajectories & impact shockwaves (rendered above table & hands, below modals)
    this._renderCardFlights(ctx, deckIdx);

    // 7. Turn & Action Banners / Modals inside Gameplay (wait until airborne card reaches 75% so player sees Wild/+4 land!)
    const waitFlightForModal = this.cardFlights.some((fl) => fl.kind === 'play' && fl.elapsedMs / Math.max(1, fl.durationMs) < 0.75);
    if (!waitFlightForModal) {
      if (match.phase === PHASE_PICK_COLOR && match.turnSeat === localSeat) {
        this._renderColorPicker(ctx, lang);
      } else if (match.phase === PHASE_CHALLENGE_PLUS4 && match.plus4Context?.victimSeat === localSeat) {
        this._renderChallengeModal(ctx, lang, match.plus4Context.drawAmount);
      } else if (match.phase === PHASE_DRAW_CHOICE && match.turnSeat === localSeat && Array.isArray(me?.hand)) {
        const drawn = me.hand.find((c) => c.id === (match.drawnCardId ?? match.drawnCard?.id));
        this._renderDrawChoiceModal(ctx, lang, drawn);
      } else if (match.phase === PHASE_PICK_SWAP && match.turnSeat === localSeat) {
        ctx.fillStyle = 'rgba(10, 20, 44, 0.88)';
        ctx.fillRect(190, 56, 260, 34);
        fS.drawString(ctx, t(lang, 'pickPowerTarget'), 320, 73, HCENTER | VCENTER, 3);
      }
    }

    // Turn status banner cleanly below North fan (y <= 49) & above Direction label (y = 98)
    const activePlayer = match.players[match.turnSeat];
    const turnStr = match.turnSeat === localSeat
      ? t(lang, 'yourTurn')
      : `${t(lang, 'waitingFor')} ${activePlayer?.name || ''}`;
    fS.drawString(ctx, turnStr, centerX, 56, HCENTER | TOP, match.turnSeat === localSeat ? 3 : 0);
  }

  _canShowUno(match, seat) {
    const p = match.players[seat];
    if (!p || p.unoCalled) return false;
    const count = Array.isArray(p.hand) ? p.hand.length : (p.handCount ?? 0);
    if (count === 1) return true;
    if (match.turnSeat === seat && count === 2 && match.phase === PHASE_PLAY) {
      return Array.isArray(p.hand) ? p.hand.some((c) => isCardPlayable(c, match)) : true;
    }
    return false;
  }

  _renderOpponentFan(ctx, relSeat, count, deckIdx) {
    const shown = Math.min(8, Math.max(0, count | 0));
    if (shown <= 0) return;
    // sp[80] directional card backs: f30 points right (West), f15 points down (North), f0 points left (East)
    const pal = deckIdx % 6;
    if (relSeat === 1) {
      // West side vertical stack (x: -36 -> peeks +59px from left edge; clear of West & South pods)
      const step = 10;
      const startY = Math.round(176 - ((shown - 1) * step) / 2);
      for (let i = 0; i < shown; i++) {
        this._drawSprite(ctx, 80, 30, -36, startY + i * step, 0, pal);
      }
    } else if (relSeat === 2) {
      // North top horizontal stack (y: -46 -> hangs down to +49px; clear of North pod & Turn banner)
      const step = 18;
      const startX = Math.round(286 - ((shown - 1) * step) / 2);
      for (let i = 0; i < shown; i++) {
        this._drawSprite(ctx, 80, 15, startX + i * step, -46, 0, pal);
      }
    } else if (relSeat === 3) {
      // East side vertical stack (x: VIEW_W + 34 -> peeks -59px from right edge; above East pod)
      const step = 9;
      const startY = Math.round(148 - ((shown - 1) * step) / 2);
      for (let i = 0; i < shown; i++) {
        this._drawSprite(ctx, 80, 0, VIEW_W + 34, startY + i * step, 0, pal);
      }
    }
  }

  _renderBottomHand(ctx, hand, match, localSeat, selectedIdx, hoverIdx, deckIdx) {
    const n = hand.length;
    this._handFocusTargets.clear();
    if (n === 0) return;
    const isMyTurn = match.turnSeat === localSeat && (match.phase === PHASE_PLAY || match.phase === PHASE_DRAW_CHOICE);
    const maxSpan = 350;
    const step = n > 1 ? Math.min(34, Math.floor(maxSpan / (n - 1))) : 0;
    const totalW = (n - 1) * step + 60;
    const startX = Math.round(330 - totalW / 2);
    const baseY = 264;

    for (let i = 0; i < n; i++) {
      const c = hand[i];
      const cx = startX + i * step;
      const isFocused = i === selectedIdx || i === hoverIdx;
      const canPlay = isMyTurn && isCardPlayable(c, match) &&
        (match.phase !== PHASE_DRAW_CHOICE || c.id === (match.drawnCardId ?? match.drawnCard?.id));
      if (isFocused) this._handFocusTargets.add(c.id);
      if (!this._cardLiftMap.has(c.id)) this._cardLiftMap.set(c.id, isFocused ? 18 : 0);
      const lift = Math.round(this._cardLiftMap.get(c.id) || 0);
      const cy = baseY - lift - Math.round(Math.abs(i - (n - 1) / 2) * -1.2);

      // Record rendered pixel coords so played card lifts seamlessly from this exact position
      this._handCoordCache.set(c.id, { x: cx, y: cy });

      this.drawCardFront(ctx, c, cx, cy, {
        deckPal: deckIdx,
        playable: canPlay,
        selected: isFocused,
        dimUnplayable: isMyTurn,
      });

      const hitW = i === n - 1 ? 60 : Math.max(step, 26);
      this._regHit(`card_${i}`, cx, cy, hitW, 92, { index: i, card: c, canPlay });
    }
  }

  _renderColorPicker(ctx, lang) {
    ctx.fillStyle = 'rgba(8, 14, 34, 0.72)';
    ctx.fillRect(0, 0, VIEW_W, VIEW_H);
    this._drawSprite(ctx, 27, 28, 320, 178, 0, 0);
    this._fontSmall().drawString(ctx, t(lang, 'pickColor'), 320, 92, HCENTER | VCENTER, 3);

    const quadrants = [
      { color: COLOR_BLUE, label: t(lang, 'colorNames')[1], x: 244, y: 146 },
      { color: COLOR_GREEN, label: t(lang, 'colorNames')[2], x: 396, y: 146 },
      { color: COLOR_RED, label: t(lang, 'colorNames')[3], x: 244, y: 214 },
      { color: COLOR_YELLOW, label: t(lang, 'colorNames')[4], x: 396, y: 214 },
    ];
    for (const q of quadrants) {
      ctx.fillStyle = COLOR_HEX[q.color];
      ctx.strokeStyle = '#ffffff';
      drawRectMIDP(ctx, q.x - 62, q.y - 24, 124, 48, true, true, 2);
      this._fontSmall().drawString(ctx, q.label, q.x, q.y, HCENTER | VCENTER, 0);
      this._regHit(`pick_color_${q.color}`, q.x - 62, q.y - 24, 124, 48, q.color);
    }
  }

  _renderChallengeModal(ctx, lang, amt) {
    ctx.fillStyle = 'rgba(8, 14, 34, 0.72)';
    ctx.fillRect(0, 0, VIEW_W, VIEW_H);
    this._drawSprite(ctx, 27, 29, 320, 175, 0, 0);
    const fS = this._fontSmall();
    fS.drawWrappedText(ctx, `Wild +${amt}! ${t(lang, 'challenge')}`, 140, 122, 360, LEFT | TOP, 3);
    this._drawPillButton(ctx, 'chal_yes', t(lang, 'challenge'), 224, 214, 2, { font: fS, textPal: 3 });
    this._drawPillButton(ctx, 'chal_no', `${t(lang, 'acceptDraw')} (+${amt})`, 416, 214, 2, { font: fS });
  }

  _renderDrawChoiceModal(ctx, lang, drawnCard) {
    ctx.fillStyle = 'rgba(10, 18, 42, 0.90)';
    ctx.strokeStyle = '#ffe066';
    drawRectMIDP(ctx, 190, 210, 260, 44, true, true, 2);
    const fS = this._fontSmall();
    this._drawPillButton(ctx, 'drawn_play', t(lang, 'playDrawn'), 256, 232, 6, { font: fS, textPal: 3, payload: drawnCard?.id });
    this._drawPillButton(ctx, 'drawn_keep', t(lang, 'keepCard'), 384, 232, 6, { font: fS });
  }

  _renderPauseModal(ctx, lang, focusIdx) {
    ctx.fillStyle = 'rgba(6, 12, 28, 0.72)';
    ctx.fillRect(0, 0, VIEW_W, VIEW_H);
    this._drawSprite(ctx, 27, 7, 320, 180, 0, 0);
    this._fontLarge().drawString(ctx, t(lang, 'pause'), 320, 82, HCENTER | VCENTER, 3);
    const fS = this._fontSmall();
    const btns = [
      { id: 'pause_resume', label: t(lang, 'resume'), y: 134 },
      { id: 'pause_sfx', label: 'Toggle Sound', y: 186 },
      { id: 'pause_restart', label: t(lang, 'restart'), y: 238 },
      { id: 'pause_quit', label: t(lang, 'mainMenu'), y: 290 },
    ];
    btns.forEach((b, i) => {
      this._drawPillButton(ctx, b.id, b.label, 320, b.y, 2, { focused: focusIdx === i, font: fS });
    });
  }

  _renderDebriefing(ctx, vm) {
    const { lang, save, match, lastRewards, localSeat = 0 } = vm;
    this._drawSprite(ctx, 79, 0, 2, 0, 0, save.themeIdx % 6);
    ctx.fillStyle = 'rgba(6, 12, 30, 0.78)';
    ctx.fillRect(0, 0, VIEW_W, VIEW_H);
    this._drawSprite(ctx, 27, 7, 320, 178, 0, 0);

    const isMatchEnd = match.phase === PHASE_MATCH_END;
    const winner = match.players[isMatchEnd ? match.matchWinner : match.roundWinner];
    const fL = this._fontLarge();
    const fS = this._fontSmall();

    fL.drawString(ctx, isMatchEnd ? t(lang, 'matchWin') : t(lang, 'roundWin'), 320, 68, HCENTER | VCENTER, 3);
    fS.drawString(ctx, `${winner?.name || 'Player'} (+${winner?.roundPointsEarned || 0} pts)`, 320, 96, HCENTER | VCENTER, 2);

    const active = match.players.filter((p) => p.active);
    active.sort((a, b) => b.score - a.score);
    active.forEach((p, idx) => {
      const ry = 132 + idx * 30;
      fS.drawString(ctx, `${idx + 1}. ${p.name}`, 160, ry, LEFT | VCENTER, p.seat === localSeat ? 3 : 0);
      fS.drawString(ctx, `${p.score} pts`, 480, ry, RIGHT | VCENTER, 0);
    });

    if (lastRewards) {
      fS.drawString(
        ctx,
        `+${lastRewards.coins} ${t(lang, 'coins')}  +${lastRewards.xp} XP${lastRewards.stars ? `  ${lastRewards.stars}/3 *` : ''}`,
        320,
        258,
        HCENTER | VCENTER,
        3
      );
    }

    if (isMatchEnd) {
      this._drawPillButton(ctx, 'debrief_replay', t(lang, 'playAgain'), 228, 304, 2, { font: fS, textPal: 3 });
      this._drawPillButton(ctx, 'debrief_menu', t(lang, 'mainMenu'), 412, 304, 2, { font: fS });
    } else {
      this._drawPillButton(ctx, 'debrief_next', t(lang, 'nextRound'), 320, 304, 2, { font: fS, textPal: 3 });
    }
  }
}
