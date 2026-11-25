// Port of e.java:2501-2808 + e.javap.txt:9991-10390 (Gameloft bitmap font renderer + NFD Vietnamese diacritics)
// Loads /2[0] hash LUT + /2[1] Font0 (large) & /2[3] Font1 (small), no fillText blurry fallback.

import { BSprite, parseSplitPack } from './bsprite-loader.js';
import { u16LE, TOP, LEFT, HCENTER, VCENTER, RIGHT, BOTTOM } from './midp-graphics.js';

// Ink/outline palette table extracted directly from /2[1] & /2[3] PNG PLTE palettes (pal 0..3)
const FONT_PAL_COLORS = [
  { fill: '#ffffff', outline: '#005580' }, // 0: White ink, Blue outline
  { fill: '#ffffff', outline: '#8c2800' }, // 1: White ink, Orange/Brown outline
  { fill: '#ffffff', outline: '#127a0d' }, // 2: White ink, Green outline
  { fill: '#fdf830', outline: '#8c2800' }, // 3: Yellow ink, Brown outline
];

// Vietnamese / Unicode NFD base mapping for Latin-1 bitmap fonts
const SPECIAL_BASE_CHAR = {
  '\u0110': 'D', // Đ
  '\u0111': 'd', // đ
  '\u2014': '-',
  '\u2013': '-',
  '\u2018': "'",
  '\u2019': "'",
  '\u201c': '"',
  '\u201d': '"',
  '\u2026': '...',
};

export function buildFontGlyphMap(shortLut) {
  // Port of e.java:a(short[]) -> e.javap.txt:9991-10118
  const nBuckets = shortLut[0];
  const table = new Array(nBuckets);
  let pos = 1;
  for (let i = 0; i < nBuckets; i++) {
    table[i] = [shortLut[pos++], shortLut[pos++]];
  }
  while (pos < shortLut.length) {
    const bucketIdx = shortLut[pos++];
    const overflowPairs = shortLut[pos++];
    const cur = table[bucketIdx];
    const next = new Array(2 + overflowPairs * 2);
    next[0] = cur[0];
    next[1] = cur[1];
    for (let k = 0; k < overflowPairs; k++) {
      next[2 + k * 2] = shortLut[pos++];
      next[3 + k * 2] = shortLut[pos++];
    }
    table[bucketIdx] = next;
  }
  // Flatten into fast Map(charCode -> glyphFrameIdx) matching e.k(int)
  const map = new Map();
  for (let b = 0; b < nBuckets; b++) {
    const arr = table[b];
    for (let i = 0; i < arr.length; i += 2) {
      map.set(arr[i] & 0xffff, arr[i + 1]);
    }
  }
  return map;
}

export class BitmapFont {
  constructor(sprite, glyphMap, charSpacing = 0) {
    this.sprite = sprite;
    this.glyphMap = glyphMap;
    this.charSpacing = charSpacing;
    this.curPal = 0;
    this.underline = false;
    this.bold = false;

    // Port of e.javap.txt:10118-10161: derive baseline/height/lineSpacing/spaceWidth from Frame 0 & Space glyph
    const fr0 = sprite.frames[0];
    const fm0 = fr0 && sprite.fmodules[fr0.firstFm];
    const fm1 = fr0 && sprite.fmodules[fr0.firstFm + 1];
    const fm2 = fr0 && sprite.fmodules[fr0.firstFm + 2];
    const oy0 = fm0 ? fm0.oy : -16;
    const oy1 = fm1 ? fm1.oy : 2;
    const oy2 = fm2 ? fm2.oy : 4;
    this.offsetY = -oy0;
    this.lineHeight = Math.max(10, this.offsetY + oy1);
    this.lineSpacing = Math.max(1, oy2 - oy1);
    const spaceGlyph = this.lookupGlyph(32);
    const spaceFm = this._getGlyphFirstFm(spaceGlyph);
    this.spaceWidth = spaceFm ? Math.max(4, Math.abs(spaceFm.ox)) : 6;
    // Also probe actual 'A' advance
    const aGlyph = this.lookupGlyph(65);
    const aAdv = this._glyphAdvance(aGlyph);
    if (aAdv > 0 && this.spaceWidth > aAdv * 2) {
      this.spaceWidth = Math.max(5, Math.round(aAdv * 0.55));
    }
  }

  _getGlyphFirstFm(glyphIdx) {
    if (glyphIdx < 0 || glyphIdx >= this.sprite.frames.length) return null;
    const fr = this.sprite.frames[glyphIdx];
    return fr && fr.fmCount > 0 ? this.sprite.fmodules[fr.firstFm] : null;
  }

  lookupGlyph(codePoint) {
    const g = this.glyphMap.get(codePoint & 0xffff);
    return g !== undefined ? g : -1;
  }

  _glyphAdvance(glyphIdx) {
    const fr = this.sprite.frames[glyphIdx];
    if (!fr || fr.fmCount <= 0) return 0;
    // Module 0 width marker encodes advance in fm0.ox in e.java:2799 (f(glyph, 0))
    const fm0 = this.sprite.fmodules[fr.firstFm];
    if (fm0 && fm0.ox > 0) return fm0.ox;
    // Fallback to visual bounds width
    const b = this.sprite.getFrameBounds(glyphIdx);
    return Math.max(1, b.w);
  }

  // Decompose string into renderable tokens, splitting NFD Vietnamese marks onto base glyphs
  _tokenize(str) {
    const tokens = [];
    if (!str) return tokens;
    let i = 0;
    while (i < str.length) {
      const ch = str[i];
      const code = ch.charCodeAt(0);
      if (ch === '\\' && i + 1 < str.length) {
        const next = str[i + 1];
        if (next === '_') {
          tokens.push({ type: 'underline' });
        } else if (next === '^') {
          tokens.push({ type: 'bold' });
        } else {
          tokens.push({ type: 'pal', val: next.charCodeAt(0) - 48 });
        }
        i += 2;
        continue;
      }
      if (code === 1 && i + 1 < str.length) {
        const pal = str.charCodeAt(i + 1);
        tokens.push({ type: 'pal', val: pal === 255 ? -1 : pal });
        i += 2;
        continue;
      }
      if (code === 2 && i + 1 < str.length) {
        tokens.push({ type: 'glyph', glyph: str.charCodeAt(i + 1), marks: [], bar: false });
        i += 2;
        continue;
      }
      if (ch === '\n') {
        tokens.push({ type: 'nl' });
        i++;
        continue;
      }
      if (ch === ' ') {
        tokens.push({ type: 'space' });
        i++;
        continue;
      }
      if (ch === '|') {
        i++;
        continue;
      }

      // Direct lookup in bitmap font
      if (code <= 0xff) {
        const g = this.lookupGlyph(code);
        if (g >= 0) {
          tokens.push({ type: 'glyph', glyph: g, marks: [], bar: false, isLower: ch >= 'a' && ch <= 'z' });
          i++;
          continue;
        }
      }

      // Check special non-NFD base chars (e.g., Đ / đ) + NFD decomposition for Vietnamese
      let work = SPECIAL_BASE_CHAR[ch] || ch.normalize('NFD');
      if (SPECIAL_BASE_CHAR[work[0]]) {
        work = SPECIAL_BASE_CHAR[work[0]] + work.slice(1);
      }
      const isBarD = ch === '\u0110' || ch === '\u0111';
      let baseCode = work.charCodeAt(0);
      const marks = [];
      for (let m = 1; m < work.length; m++) {
        marks.push(work.charCodeAt(m));
      }
      // Consume trailing combining marks in original string if already NFD
      while (i + 1 < str.length) {
        const nc = str.charCodeAt(i + 1);
        if (nc >= 0x0300 && nc <= 0x036f) {
          marks.push(nc);
          i++;
        } else {
          break;
        }
      }
      let g = this.lookupGlyph(baseCode);
      if (g < 0) {
        g = this.lookupGlyph(String.fromCharCode(baseCode).toUpperCase().charCodeAt(0));
      }
      if (g >= 0) {
        tokens.push({
          type: 'glyph',
          glyph: g,
          marks,
          bar: isBarD,
          isLower: ch >= 'a' && ch <= 'z' || (work[0] >= 'a' && work[0] <= 'z'),
        });
      }
      i++;
    }
    return tokens;
  }

  measureLineTokens(tokens, start = 0, end = tokens.length) {
    let w = 0;
    let isBold = this.bold;
    let hasChar = false;
    for (let i = start; i < end; i++) {
      const t = tokens[i];
      if (t.type === 'bold') isBold = !isBold;
      else if (t.type === 'space') {
        w += this.spaceWidth;
        hasChar = true;
      } else if (t.type === 'glyph') {
        w += this._glyphAdvance(t.glyph) + this.charSpacing + (isBold ? 1 : 0);
        hasChar = true;
      }
    }
    if (hasChar && w > 0) w -= this.charSpacing;
    return w;
  }

  measureString(str) {
    if (!str) return { w: 0, h: this.lineHeight };
    const tokens = this._tokenize(str);
    let maxW = 0;
    let curW = 0;
    let lines = 1;
    let isBold = this.bold;
    for (const t of tokens) {
      if (t.type === 'nl') {
        if (curW > maxW) maxW = curW;
        curW = 0;
        lines++;
      } else if (t.type === 'bold') {
        isBold = !isBold;
      } else if (t.type === 'space') {
        curW += this.spaceWidth;
      } else if (t.type === 'glyph') {
        curW += this._glyphAdvance(t.glyph) + this.charSpacing + (isBold ? 1 : 0);
      }
    }
    if (curW > maxW) maxW = curW;
    return {
      w: Math.max(0, maxW - (maxW > 0 ? this.charSpacing : 0)),
      h: lines * this.lineHeight + (lines - 1) * this.lineSpacing,
    };
  }

  wrapText(str, maxWidth) {
    if (!str || maxWidth <= 0) return [str || ''];
    const rawLines = String(str).split('\n');
    const out = [];
    for (const raw of rawLines) {
      const words = raw.split(' ');
      let cur = '';
      for (const word of words) {
        const cand = cur ? `${cur} ${word}` : word;
        if (cur && this.measureString(cand).w > maxWidth) {
          out.push(cur);
          cur = word;
        } else {
          cur = cand;
        }
      }
      if (cur || raw === '') out.push(cur);
    }
    return out;
  }

  _drawNfdDiacritics(ctx, x, baseLineY, adv, token, palIdx) {
    const palStyle = FONT_PAL_COLORS[palIdx] || FONT_PAL_COLORS[0];
    const k = (this.offsetY || 26) / 31;
    const scale = k;
    const midX = Math.round(x + adv * 0.45);
    const topY = Math.round(baseLineY - (token.isLower ? 16 : 22) * k);
    const botY = Math.round(baseLineY + 5 * k);

    const drawPixel = (px, py, w = 2, h = 2) => {
      ctx.fillStyle = palStyle.outline;
      ctx.fillRect(px - 1, py - 1, w + 2, h + 2);
      ctx.fillStyle = palStyle.fill;
      ctx.fillRect(px, py, w, h);
    };

    if (token.bar) {
      // Đ / đ crossbar (d has ascender stem at -15*k; Đ mid-stem at -9*k)
      const barY = Math.round(baseLineY - (token.isLower ? 15 : 9) * k);
      drawPixel(Math.round(x + 1), barY, Math.max(4, Math.round(6 * scale)), Math.max(1, Math.round(2 * scale)));
    }

    let stackedTop = topY;
    for (const mk of token.marks) {
      switch (mk) {
        case 0x0302: // Circumflex (^)
          drawPixel(midX - 2, stackedTop, 2, 1);
          drawPixel(midX - 1, stackedTop - 1, 2, 1);
          drawPixel(midX + 1, stackedTop, 2, 1);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x0306: // Breve (u)
          drawPixel(midX - 2, stackedTop - 1, 1, 2);
          drawPixel(midX - 1, stackedTop, 3, 1);
          drawPixel(midX + 2, stackedTop - 1, 1, 2);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x031b: { // Horn (ơ, ư) sits at top-right shoulder
          const hornY = Math.round(baseLineY - (token.isLower ? 12 : 18) * k);
          drawPixel(Math.round(x + adv - 3), hornY, 2, 2);
          drawPixel(Math.round(x + adv - 2), hornY - 1, 1, 2);
          break;
        }
        case 0x0301: // Acute (sắc)
          drawPixel(midX, stackedTop - 1, 2, 1);
          drawPixel(midX - 1, stackedTop, 2, 1);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x0300: // Grave (huyền)
          drawPixel(midX - 2, stackedTop - 1, 2, 1);
          drawPixel(midX - 1, stackedTop, 2, 1);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x0309: // Hook above (hỏi)
          drawPixel(midX - 1, stackedTop - 2, 2, 1);
          drawPixel(midX + 1, stackedTop - 1, 1, 2);
          drawPixel(midX, stackedTop, 1, 1);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x0303: // Tilde (ngã)
          drawPixel(midX - 2, stackedTop, 2, 1);
          drawPixel(midX, stackedTop - 1, 2, 1);
          stackedTop -= Math.round(4 * k);
          break;
        case 0x0323: // Dot below (nặng)
          drawPixel(midX - 1, botY, 2, 2);
          break;
        default:
          break;
      }
    }
  }

  drawString(ctx, str, x, y, anchor = LEFT | TOP, pal = this.curPal) {
    if (!str || !ctx) return;
    const savedPal = pal >= 0 && pal < this.sprite.getPaletteCount() ? pal : 0;
    const tokens = this._tokenize(str);
    // Split into lines at '\n'
    const lines = [];
    let start = 0;
    for (let i = 0; i <= tokens.length; i++) {
      if (i === tokens.length || tokens[i].type === 'nl') {
        lines.push([start, i]);
        start = i + 1;
      }
    }

    const totalH = lines.length * this.lineHeight + Math.max(0, lines.length - 1) * this.lineSpacing;
    let drawY = Math.round(y);
    if (anchor & VCENTER) drawY -= totalH >> 1;
    else if (anchor & BOTTOM) drawY -= totalH;
    drawY += this.offsetY;

    let activePal = savedPal;
    let isUnderline = this.underline;
    let isBold = this.bold;
    const underlineGlyph = this.lookupGlyph(95);

    for (let li = 0; li < lines.length; li++) {
      const [s, e] = lines[li];
      const lineW = this.measureLineTokens(tokens, s, e);
      let drawX = Math.round(x);
      if (anchor & HCENTER) drawX -= lineW >> 1;
      else if (anchor & RIGHT) drawX -= lineW;

      for (let ti = s; ti < e; ti++) {
        const tok = tokens[ti];
        if (tok.type === 'pal') {
          if (tok.val === -1) activePal = savedPal;
          else if (tok.val >= 0 && tok.val < this.sprite.getPaletteCount()) activePal = tok.val;
        } else if (tok.type === 'underline') {
          isUnderline = !isUnderline;
        } else if (tok.type === 'bold') {
          isBold = !isBold;
        } else if (tok.type === 'space') {
          if (isUnderline && underlineGlyph >= 0) {
            this.sprite.drawFrame(ctx, underlineGlyph, drawX, drawY, 0, activePal);
          }
          drawX += this.spaceWidth;
        } else if (tok.type === 'glyph') {
          this.sprite.drawFrame(ctx, tok.glyph, drawX, drawY, 0, activePal);
          if (isUnderline && underlineGlyph >= 0) {
            const ugW = this._glyphAdvance(underlineGlyph);
            const adv = this._glyphAdvance(tok.glyph);
            this.sprite.drawFrame(ctx, underlineGlyph, drawX + ((adv - ugW) >> 1), drawY, 0, activePal);
          }
          if (isBold) {
            this.sprite.drawFrame(ctx, tok.glyph, ++drawX, drawY, 0, activePal);
          }
          const adv = this._glyphAdvance(tok.glyph);
          if (tok.bar || tok.marks.length > 0) {
            this._drawNfdDiacritics(ctx, drawX, drawY, adv, tok, activePal);
          }
          drawX += adv + this.charSpacing;
        }
      }
      drawY += this.lineHeight + this.lineSpacing;
    }
  }

  drawWrappedText(ctx, str, x, y, maxW, anchor = LEFT | TOP, pal = this.curPal) {
    const lines = this.wrapText(str, maxW);
    this.drawString(ctx, lines.join('\n'), x, y, anchor, pal);
  }
}

export async function loadFontsFromPackBuffer(pack2Bytes) {
  const items = parseSplitPack(pack2Bytes);
  // /2[0]: packed short[] LUT via j.a(InputStream) (offset 1 skips pack flag byte 0x02)
  const lut = readSerializedArray(items[0], 1);
  const glyphMap = buildFontGlyphMap(lut);
  const sprite0 = new BSprite(items[1], -1, { hasPackFlag: true }); // Large font
  const sprite1 = new BSprite(items[3], -2, { hasPackFlag: true }); // Small font
  await Promise.all([sprite0.preloadImages(), sprite1.preloadImages()]);
  return [
    new BitmapFont(sprite0, glyphMap, 1), // a.java:8869: b[0].d(1)
    new BitmapFont(sprite1, glyphMap, 0),
  ];
}

// Inline j.a(InputStream) deserializer shared with uno-loader.js
export function readSerializedArray(bytes, startPos = 1) {
  let p = startPos;
  function readRec() {
    const tag = bytes[p++] & 0xff;
    const wf = tag >> 4;
    const tp = tag & 7;
    const ln = (tag & 8) ? u16LE(bytes, (p += 2) - 2) : (bytes[p++] & 0xff);
    if (tp === 0) {
      const out = new Int8Array(ln);
      for (let i = 0; i < ln; i++) out[i] = (bytes[p++] << 24) >> 24;
      return Array.from(out);
    }
    if (tp === 1) {
      const out = new Int16Array(ln);
      if (wf === 0) {
        for (let i = 0; i < ln; i++) out[i] = (bytes[p++] << 24) >> 24;
      } else {
        for (let i = 0; i < ln; i++) {
          const v = u16LE(bytes, p);
          p += 2;
          out[i] = v >= 0x8000 ? v - 0x10000 : v;
        }
      }
      return Array.from(out);
    }
    if (tp === 2) {
      const out = new Int32Array(ln);
      if (wf === 0) {
        for (let i = 0; i < ln; i++) out[i] = (bytes[p++] << 24) >> 24;
      } else if (wf === 1) {
        for (let i = 0; i < ln; i++) {
          const v = u16LE(bytes, p);
          p += 2;
          out[i] = v >= 0x8000 ? v - 0x10000 : v;
        }
      } else {
        for (let i = 0; i < ln; i++) {
          out[i] =
            ((bytes[p] & 0xff) |
              ((bytes[p + 1] & 0xff) << 8) |
              ((bytes[p + 2] & 0xff) << 16) |
              ((bytes[p + 3] & 0xff) << 24)) | 0;
          p += 4;
        }
      }
      return Array.from(out);
    }
    const nested = new Array(ln);
    for (let i = 0; i < ln; i++) nested[i] = readRec();
    return nested;
  }
  return readRec();
}
