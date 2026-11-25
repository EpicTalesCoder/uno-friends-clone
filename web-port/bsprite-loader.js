// Port of e.java:1-2500 + e.javap.txt:1258-9650 (Gameloft BSprite v5 0x05df decoder)
// Supports split packs, indexed pixel codecs (25840/10225/22258/5632/1024/512),
// embedded PNGs (0x20000000 / 0x40000000) with PLTE+tRNS palette swapping,
// shapes (rect/line/round/marker), frame transforms, and headless Node tests.

import {
  u8, s8, u16LE, s16LE, u32LE, s32LE,
  drawRegionMIDP, drawRectMIDP, drawLineMIDP, argbIntToCanvas,
} from './midp-graphics.js';

// Port of e.java:3006 BSprite flag bits -> MIDP Sprite transform
export const BS_TO_MIDP_TRANS = [0, 2, 1, 3, 5, 7, 4, 6];

export function parseSplitPack(buffer) {
  const bytes = buffer instanceof Uint8Array ? buffer : new Uint8Array(buffer);
  const cnt = u16LE(bytes, 0);
  const items = [];
  for (let i = 0; i < cnt - 1; i++) {
    const start = u32LE(bytes, 2 + i * 4);
    const end = u32LE(bytes, 2 + (i + 1) * 4);
    items.push(bytes.subarray(start, end));
  }
  return items;
}

export function patchPngPalette(basePng, palEntries, palBytes, trnsBytes) {
  // Port of e.java:4493-4602 & 8371-8460: splice replacement PLTE & tRNS data+CRC at PNG byte 41
  const out = new Uint8Array(basePng.length);
  out.set(basePng);
  const plteLen = palEntries * 3 + 4;
  const trnsLen = palEntries + 4;
  out.set(palBytes.subarray(0, plteLen), 41);
  const trnsDataStart = 41 + plteLen + 8;
  out.set(trnsBytes.subarray(0, trnsLen), trnsDataStart);
  return out;
}

function decodePalette(bytes, pos, palFmt, nColors) {
  // Port of e.java:2900-3563 & e.javap.txt:2900-3563
  const pal = new Uint32Array(nColors);
  let hasAlpha = false;
  let hasTranslucent = false;

  if (palFmt === -30584) {
    // 0x8888 ARGB32
    for (let i = 0; i < nColors; i++) {
      const c = u32LE(bytes, pos);
      pos += 4;
      const a = c >>> 24;
      if (a !== 0xff) {
        hasAlpha = true;
        if (a !== 0) hasTranslucent = true;
      }
      pal[i] = c >>> 0;
    }
  } else if (palFmt === 17476) {
    // 0x4444 ARGB4444
    for (let i = 0; i < nColors; i++) {
      const v = u16LE(bytes, pos);
      pos += 2;
      const a = (v & 0xf000) >>> 12;
      if (a !== 0x0f) {
        hasAlpha = true;
        if (a !== 0) hasTranslucent = true;
      }
      const c =
        ((v & 0xf000) << 16) | ((v & 0xf000) << 12) |
        ((v & 0x0f00) << 12) | ((v & 0x0f00) << 8) |
        ((v & 0x00f0) << 8) | ((v & 0x00f0) << 4) |
        ((v & 0x000f) << 4) | (v & 0x000f);
      pal[i] = c >>> 0;
    }
  } else if (palFmt === 21781) {
    // 0x5515 ARGB1555 (0xF800F8 chroma-key handled identically to e.java:3414)
    for (let i = 0; i < nColors; i++) {
      const v = u16LE(bytes, pos);
      pos += 2;
      let a = 0xff000000;
      if ((v & 0x8000) === 0) {
        a = 0;
        hasAlpha = true;
      }
      let rgb = ((v & 0x7c00) << 9) | ((v & 0x03e0) << 6) | ((v & 0x001f) << 3);
      if (rgb === 0xf800f8) rgb = 0xff00ff;
      pal[i] = (a | rgb) >>> 0;
    }
  } else if (palFmt === 25861) {
    // 0x6505 RGB565 with 0xF81F transparent sentinel
    for (let i = 0; i < nColors; i++) {
      const v = u16LE(bytes, pos);
      pos += 2;
      let a = 0xff000000;
      if (v === 63519) {
        a = 0;
        hasAlpha = true;
      }
      let rgb = ((v & 0xf800) << 8) | ((v & 0x07e0) << 5) | ((v & 0x001f) << 3);
      if (rgb === 0xf800f8) rgb = 0xff00ff;
      pal[i] = (a | rgb) >>> 0;
    }
  } else {
    throw new Error(`Unsupported BSprite palFmt 0x${(palFmt & 0xffff).toString(16)}`);
  }

  return { pal, pos, hasAlpha, hasTranslucent };
}

export function decodeIndexedPixels(pixFmt, data, pal, w, h, maskI64, shiftI64) {
  // Port of e.javap.txt:9348-9650 (25840, 10225, 22258, 5632, 1024, 512)
  const total = w * h;
  const out = new Uint32Array(total);
  let di = 0;
  let si = 0;

  if (pixFmt === 25840) {
    while (di < total && si < data.length) {
      const b = data[si++] & 0xff;
      const col = pal[b & maskI64];
      let run = b >> shiftI64;
      while (run-- >= 0 && di < total) {
        out[di++] = col;
      }
    }
  } else if (pixFmt === 10225) {
    while (di < total && si < data.length) {
      let b = data[si++] & 0xff;
      if (b > 127) {
        const col = pal[data[si++] & 0xff];
        let run = b - 128;
        while (run-- > 0 && di < total) {
          out[di++] = col;
        }
      } else {
        out[di++] = pal[b];
      }
    }
  } else if (pixFmt === 22258) {
    while (di < total && si < data.length) {
      let c = s8(data[si++]);
      if (c < 0) {
        c += 128;
        do {
          out[di++] = pal[data[si++] & 0xff];
        } while (--c > 0 && di < total);
      } else {
        const col = pal[data[si++] & 0xff];
        do {
          out[di++] = col;
        } while (--c > 0 && di < total);
      }
    }
  } else if (pixFmt === 5632) {
    let nBytes = (total + ((total & 1) ? 2 : 0)) >> 1;
    while (nBytes-- > 0 && si < data.length) {
      const b = data[si++] & 0xff;
      if (di < total) out[di++] = pal[(b >> 4) & 15];
      if (di < total) out[di++] = pal[b & 15];
    }
  } else if (pixFmt === 1024) {
    let nBytes = (total + ((total & 3) ? 4 : 0)) >> 2;
    while (nBytes-- > 0 && si < data.length) {
      const b = data[si++] & 0xff;
      if (di < total) out[di++] = pal[(b >> 6) & 3];
      if (di < total) out[di++] = pal[(b >> 4) & 3];
      if (di < total) out[di++] = pal[(b >> 2) & 3];
      if (di < total) out[di++] = pal[b & 3];
    }
  } else if (pixFmt === 512) {
    let nBytes = (total + ((total & 7) ? 8 : 0)) >> 3;
    while (nBytes-- > 0 && si < data.length) {
      const b = data[si++] & 0xff;
      for (let bit = 7; bit >= 0 && di < total; bit--) {
        out[di++] = pal[(b >> bit) & 1];
      }
    }
  } else {
    throw new Error(`Unsupported BSprite pixFmt ${pixFmt}`);
  }
  return out;
}

export class BSprite {
  constructor(data, spriteId = -1, { hasPackFlag = true } = {}) {
    this.spriteId = spriteId;
    this.curPal = 0;
    this.flags = 0;
    this.modules = [];
    this.fmodules = [];
    this.bounds = [];
    this.frames = [];
    this.aframes = [];
    this.anims = [];
    this.numPalettes = 0;
    this.palettes = null; // Array<Uint32Array> when indexed
    this.palFmt = 0;
    this.pixFmt = 0;
    this.maskI64 = 1;
    this.shiftI64 = 0;
    this.pngSheets = null; // Array<Array<Uint8Array>> -> [sheet][pal]
    this.moduleBuffers = null;
    this._canvasCache = new Map();
    this._pngImages = new Map();
    this._parse(data instanceof Uint8Array ? data : new Uint8Array(data), hasPackFlag ? 1 : 0);
  }

  _parse(bytes, startPos) {
    let pos = startPos;
    const version = u16LE(bytes, pos);
    pos += 2;
    if (version !== 0x05df) {
      throw new Error(`BSprite[${this.spriteId}]: unexpected version 0x${version.toString(16)}`);
    }
    const flags = u32LE(bytes, pos);
    this.flags = flags;
    pos += 4;

    // 1. Modules
    const nMod = s16LE(bytes, pos);
    pos += 2;
    for (let i = 0; i < nMod; i++) {
      const tag = bytes[pos] & 0xff;
      const mod = {
        kind: 0, // 0 bitmap, 1/2/3/4/5/6/7/8/9 shape/marker
        sheet: 0,
        color: 0,
        x: 0,
        y: 0,
        w: 0,
        h: 0,
        extra: null,
      };
      let hasColor = false;
      let hasXY = false;
      let hasWH = false;
      let hasRound = false;
      let hasLine = false;
      let has9Slice = false;

      if (tag === 0) {
        pos++;
        hasXY = true;
        hasWH = true;
        if (flags & 4) mod.sheet = bytes[pos++] & 0xff;
      } else if (tag === 255 || tag === 254 || tag === 248) {
        pos++;
        mod.kind = tag === 255 ? 1 : tag === 254 ? 2 : 8;
        hasColor = true;
        hasWH = true;
      } else if (tag === 253) {
        pos++;
        mod.kind = 5;
        hasWH = true;
      } else if (tag === 252 || tag === 251) {
        pos++;
        mod.kind = tag === 252 ? 3 : 4;
        hasColor = true;
        hasWH = true;
        hasRound = true;
      } else if (tag === 250 || tag === 249) {
        pos++;
        mod.kind = tag === 250 ? 6 : 7;
        hasColor = true;
        hasLine = true;
      } else if (tag === 247) {
        pos++;
        mod.kind = 9;
        hasColor = true;
        hasWH = true;
        has9Slice = true;
      } else {
        throw new Error(`BSprite[${this.spriteId}]: unknown module tag ${tag}`);
      }

      if (hasColor) {
        mod.color = u32LE(bytes, pos);
        pos += 4;
      }
      if (has9Slice) {
        const packed = u32LE(bytes, pos);
        const pad = s8(bytes[pos + 4]);
        pos += 5;
        mod.extra = [packed & 0xffff, packed >>> 16, pad];
      }
      if (hasXY && (flags & 0x20)) {
        mod.x = u16LE(bytes, pos);
        mod.y = u16LE(bytes, pos + 2);
        pos += 4;
      }
      if (hasWH) {
        if (flags & 0x10) {
          mod.w = u16LE(bytes, pos);
          mod.h = u16LE(bytes, pos + 2);
          pos += 4;
        } else {
          mod.w = bytes[pos] & 0xff;
          mod.h = bytes[pos + 1] & 0xff;
          pos += 2;
        }
      }
      if (hasRound) {
        mod.extra = [u16LE(bytes, pos), u16LE(bytes, pos + 2)];
        pos += 4;
      }
      if (hasLine) {
        mod.extra = [s16LE(bytes, pos), s16LE(bytes, pos + 2), s16LE(bytes, pos + 4), s16LE(bytes, pos + 6)];
        pos += 8;
      }
      this.modules.push(mod);
    }

    // 2. Frame modules
    const nFM = s16LE(bytes, pos);
    pos += 2;
    for (let i = 0; i < nFM; i++) {
      const modIdx = bytes[pos++] & 0xff;
      let ox, oy;
      if (flags & 0x400) {
        ox = s16LE(bytes, pos);
        oy = s16LE(bytes, pos + 2);
        pos += 4;
      } else {
        ox = s8(bytes[pos++]);
        oy = s8(bytes[pos++]);
      }
      let extraFlags = 0;
      if (flags & 0x4000) {
        extraFlags = bytes[pos++] & 0xff;
      }
      const fmFlags = (bytes[pos++] & 0xff) | (extraFlags << 8);
      this.fmodules.push({ modIdx, ox, oy, flags: fmFlags });
    }

    // 3. Extra frame bounds table (flags & 0x8000)
    if (flags & 0x8000) {
      const nBounds = s16LE(bytes, pos);
      pos += 2;
      for (let i = 0; i < nBounds; i++) {
        if (flags & 0x400) {
          this.bounds.push([s16LE(bytes, pos), s16LE(bytes, pos + 2), s16LE(bytes, pos + 4), s16LE(bytes, pos + 6)]);
          pos += 8;
        } else {
          this.bounds.push([s8(bytes[pos]), s8(bytes[pos + 1]), s8(bytes[pos + 2]), s8(bytes[pos + 3])]);
          pos += 4;
        }
      }
    }

    // 4. Frames
    const nFrames = s16LE(bytes, pos);
    pos += 2;
    let boundOffsetSum = 0;
    for (let i = 0; i < nFrames; i++) {
      let fmCount;
      if (flags & 0x800) {
        fmCount = u16LE(bytes, pos);
        pos += 2;
      } else {
        fmCount = bytes[pos++] & 0xff;
      }
      const firstFm = s16LE(bytes, pos);
      pos += 2;
      let boundIdx = -1;
      if (flags & 0x8000) {
        boundIdx = boundOffsetSum;
        boundOffsetSum += s8(bytes[pos++]);
      }
      this.frames.push({ fmCount, firstFm, boundIdx, rect: null });
    }
    if (nFrames > 0 && !(flags & 0x1000)) {
      for (let i = 0; i < nFrames; i++) {
        if (flags & 0x400) {
          this.frames[i].rect = [s16LE(bytes, pos), s16LE(bytes, pos + 2), s16LE(bytes, pos + 4), s16LE(bytes, pos + 6)];
          pos += 8;
        } else {
          this.frames[i].rect = [s8(bytes[pos]), s8(bytes[pos + 1]), s8(bytes[pos + 2]), s8(bytes[pos + 3])];
          pos += 4;
        }
      }
    }

    // 5. AFrames
    const nAF = s16LE(bytes, pos);
    pos += 2;
    for (let i = 0; i < nAF; i++) {
      const frame = bytes[pos++] & 0xff;
      const duration = bytes[pos++] & 0xff;
      const ox = s8(bytes[pos++]);
      const oy = s8(bytes[pos++]);
      const afFlags = bytes[pos++] & 0xff;
      this.aframes.push({ frame, duration, ox, oy, flags: afFlags });
    }

    // 6. Anims
    const nAnims = s16LE(bytes, pos);
    pos += 2;
    for (let i = 0; i < nAnims; i++) {
      const count = bytes[pos++] & 0xff;
      const first = s16LE(bytes, pos);
      pos += 2;
      this.anims.push({ count, first });
    }

    if (nMod <= 0) return;

    // 7. Image payloads
    if (flags & 0x01000000) {
      if (pos < bytes.length) {
        this.palFmt = s16LE(bytes, pos);
        pos += 2;
        const nSheets = (flags & 0x40000000) ? s8(bytes[pos++]) : 1;
        this.palettes = [];
        for (let s = 0; s < nSheets; s++) {
          const nPals = bytes[pos++] & 0xff;
          let nCols = bytes[pos++] & 0xff;
          if (nCols === 0) nCols = 256;
          this.numPalettes = nPals;
          const sheetPals = [];
          for (let p = 0; p < nPals; p++) {
            const res = decodePalette(bytes, pos, this.palFmt, nCols);
            pos = res.pos;
            sheetPals.push({ colors: res.pal, hasAlpha: res.hasAlpha });
          }
          this.palettes.push(sheetPals);
        }
        this.pixFmt = s16LE(bytes, pos);
        pos += 2;
        if (this.pixFmt === 25840 || this.pixFmt === -22976) {
          let nCols = this.palettes[0][0].colors.length - 1;
          let mask = 1;
          let shift = 0;
          while (nCols !== 0) {
            nCols >>= 1;
            mask <<= 1;
            shift++;
          }
          this.maskI64 = mask - 1;
          this.shiftI64 = shift;
        }
        this.moduleBuffers = [];
        for (let m = 0; m < nMod; m++) {
          const sz = (flags & 0x80) ? u32LE(bytes, pos) : u16LE(bytes, pos);
          pos += (flags & 0x80) ? 4 : 2;
          this.moduleBuffers.push(bytes.subarray(pos, pos + sz));
          pos += sz;
        }
      }
    } else if (flags & 0x20000000) {
      const nSheets = (flags & 0x40000000) ? s8(bytes[pos++]) : 1;
      this.pngSheets = [];
      for (let s = 0; s < nSheets; s++) {
        if (flags & 0x40000000) pos += 4; // sheetW, sheetH
        const pngLen = (flags & 0x80) ? s32LE(bytes, pos) : u16LE(bytes, pos);
        pos += (flags & 0x80) ? 4 : 2;
        const basePng = bytes.slice(pos, pos + pngLen);
        pos += pngLen;
        const nPals = bytes[pos++] & 0xff;
        this.numPalettes = Math.max(this.numPalettes, nPals);
        let nCols = bytes[pos++] & 0xff;
        if (nCols === 0) nCols = 256;
        const plteLen = nCols * 3 + 4;
        const trnsLen = nCols + 4;
        const variants = [basePng];
        for (let p = 1; p < nPals; p++) {
          const palData = bytes.subarray(pos, pos + plteLen);
          pos += plteLen;
          const trnsData = bytes.subarray(pos, pos + trnsLen);
          pos += trnsLen;
          variants.push(patchPngPalette(basePng, nCols, palData, trnsData));
        }
        this.pngSheets.push(variants);
      }
    }
  }

  getModuleWidth(m) {
    return m >= 0 && m < this.modules.length ? this.modules[m].w : 0;
  }

  getModuleHeight(m) {
    return m >= 0 && m < this.modules.length ? this.modules[m].h : 0;
  }

  // Approximate c(frame) / d(frame) used throughout a.java & q.java for frame width & height
  getFrameBounds(frameIdx) {
    if (frameIdx < 0 || frameIdx >= this.frames.length) return { x: 0, y: 0, w: 0, h: 0 };
    const f = this.frames[frameIdx];
    if (f.rect) {
      return { x: f.rect[0], y: f.rect[1], w: f.rect[2], h: f.rect[3] };
    }
    if (f.boundIdx >= 0 && f.boundIdx < this.bounds.length) {
      const b = this.bounds[f.boundIdx];
      return { x: b[0], y: b[1], w: b[2], h: b[3] };
    }
    let minX = 99999, minY = 99999, maxX = -99999, maxY = -99999;
    for (let i = 0; i < f.fmCount; i++) {
      const fm = this.fmodules[f.firstFm + i];
      if (!fm) continue;
      if (fm.flags & 0x10) {
        const sub = this.getFrameBounds(fm.modIdx);
        minX = Math.min(minX, fm.ox + sub.x);
        minY = Math.min(minY, fm.oy + sub.y);
        maxX = Math.max(maxX, fm.ox + sub.x + sub.w);
        maxY = Math.max(maxY, fm.oy + sub.y + sub.h);
      } else {
        const mod = this.modules[fm.modIdx];
        if (!mod || mod.kind === 5) continue;
        const swapped = (fm.flags & 4) !== 0;
        const mw = swapped ? mod.h : mod.w;
        const mh = swapped ? mod.w : mod.h;
        minX = Math.min(minX, fm.ox);
        minY = Math.min(minY, fm.oy);
        maxX = Math.max(maxX, fm.ox + mw);
        maxY = Math.max(maxY, fm.oy + mh);
      }
    }
    if (minX > maxX) return { x: 0, y: 0, w: 0, h: 0 };
    return { x: minX, y: minY, w: maxX - minX, h: maxY - minY };
  }

  getAnimLength(animIdx) {
    return animIdx >= 0 && animIdx < this.anims.length ? this.anims[animIdx].count : 0;
  }

  getAnimFrameDuration(animIdx, aframeSlot) {
    if (animIdx < 0 || animIdx >= this.anims.length) return 1;
    const a = this.anims[animIdx];
    const af = this.aframes[a.first + aframeSlot];
    return af ? Math.max(1, af.duration) : 1;
  }

  setPalette(p) {
    if (p >= 0 && p < Math.max(1, this.numPalettes)) {
      this.curPal = p;
    }
  }

  getPaletteCount() {
    return Math.max(1, this.numPalettes);
  }

  decodeModuleARGB(modIdx, palIdx = this.curPal) {
    const mod = this.modules[modIdx];
    if (!mod || mod.kind !== 0 || !this.moduleBuffers || !this.palettes) return null;
    const raw = this.moduleBuffers[modIdx];
    const palObj = this.palettes[0][palIdx] || this.palettes[0][0];
    return decodeIndexedPixels(this.pixFmt, raw, palObj.colors, mod.w, mod.h, this.maskI64, this.shiftI64);
  }

  _getModuleCanvas(modIdx, palIdx) {
    const key = `${palIdx}:${modIdx}`;
    let c = this._canvasCache.get(key);
    if (c !== undefined) return c;
    const mod = this.modules[modIdx];
    if (!mod || mod.w <= 0 || mod.h <= 0) {
      this._canvasCache.set(key, null);
      return null;
    }
    const argb = this.decodeModuleARGB(modIdx, palIdx);
    c = argb ? argbIntToCanvas(argb, mod.w, mod.h) : null;
    this._canvasCache.set(key, c);
    return c;
  }

  async preloadImages() {
    if (!this.pngSheets || typeof Image === 'undefined') return;
    const promises = [];
    for (let s = 0; s < this.pngSheets.length; s++) {
      for (let p = 0; p < this.pngSheets[s].length; p++) {
        const key = `${s}:${p}`;
        if (this._pngImages.has(key)) continue;
        const pngBytes = this.pngSheets[s][p];
        const blob = new Blob([pngBytes], { type: 'image/png' });
        const url = URL.createObjectURL(blob);
        const prom = new Promise((resolve) => {
          const img = new Image();
          img.onload = () => {
            URL.revokeObjectURL(url);
            this._pngImages.set(key, img);
            resolve(img);
          };
          img.onerror = () => {
            URL.revokeObjectURL(url);
            this._pngImages.set(key, null);
            resolve(null);
          };
          img.src = url;
        });
        promises.push(prom);
      }
    }
    await Promise.all(promises);
  }

  // Port of e.java:drawModule
  drawModule(ctx, modIdx, x, y, fmFlags = 0, palIdx = this.curPal) {
    if (modIdx < 0 || modIdx >= this.modules.length) return;
    const mod = this.modules[modIdx];
    if (mod.kind === 5) return; // Anchor marker only

    if (mod.kind !== 0) {
      // Primitive shape module (1/2 rect, 3/4 roundRect, 6/7 line, 8 clip)
      const a = (mod.color >>> 24) & 0xff;
      const r = (mod.color >>> 16) & 0xff;
      const g = (mod.color >>> 8) & 0xff;
      const b = mod.color & 0xff;
      const rgba = `rgba(${r},${g},${b},${(a / 255).toFixed(3)})`;
      ctx.save();
      if (mod.kind === 1) {
        ctx.strokeStyle = rgba;
        drawRectMIDP(ctx, x, y, mod.w, mod.h, true, false);
      } else if (mod.kind === 2) {
        ctx.fillStyle = rgba;
        ctx.fillRect(Math.floor(x), Math.floor(y), mod.w, mod.h);
      } else if (mod.kind === 6 || mod.kind === 7) {
        ctx.strokeStyle = rgba;
        drawLineMIDP(ctx, x + mod.extra[0], y + mod.extra[1], x + mod.extra[2], y + mod.extra[3]);
      } else if (mod.kind === 3 || mod.kind === 4) {
        ctx.fillStyle = rgba;
        ctx.strokeStyle = rgba;
        const rw = mod.extra ? mod.extra[0] : 4;
        const rh = mod.extra ? mod.extra[1] : 4;
        ctx.beginPath();
        if (ctx.roundRect) {
          ctx.roundRect(Math.floor(x), Math.floor(y), mod.w, mod.h, Math.min(rw, rh));
        } else {
          ctx.rect(Math.floor(x), Math.floor(y), mod.w, mod.h);
        }
        if (mod.kind === 4) ctx.fill();
        else ctx.stroke();
      }
      ctx.restore();
      return;
    }

    const trans = BS_TO_MIDP_TRANS[fmFlags & 7];
    if (this.pngSheets) {
      const sheetIdx = mod.sheet < this.pngSheets.length ? mod.sheet : 0;
      const safePal = palIdx < this.pngSheets[sheetIdx].length ? palIdx : 0;
      const img = this._pngImages.get(`${sheetIdx}:${safePal}`) || this._pngImages.get(`${sheetIdx}:0`);
      if (!img) return;
      drawRegionMIDP(ctx, img, mod.x, mod.y, mod.w, mod.h, trans, x, y, 0);
      return;
    }

    const canvas = this._getModuleCanvas(modIdx, palIdx < this.numPalettes ? palIdx : 0);
    if (!canvas) return;
    drawRegionMIDP(ctx, canvas, 0, 0, mod.w, mod.h, trans, x, y, 0);
  }

  // Port of e.java:drawFrame (e.a(g, frame, x, y, flags, hx, hy))
  drawFrame(ctx, frameIdx, x, y, fmFlags = 0, palIdx = this.curPal) {
    if (frameIdx < 0 || frameIdx >= this.frames.length) return;
    const f = this.frames[frameIdx];
    for (let i = 0; i < f.fmCount; i++) {
      const fm = this.fmodules[f.firstFm + i];
      if (!fm) continue;
      let dx = fm.ox;
      let dy = fm.oy;
      if (fmFlags & 1) dx = -dx;
      if (fmFlags & 2) dy = -dy;
      const combFlags = (fmFlags ^ fm.flags) & 7;
      if (fm.flags & 0x10) {
        this.drawFrame(ctx, fm.modIdx, x + dx, y + dy, combFlags, palIdx);
      } else {
        const mod = this.modules[fm.modIdx];
        if (!mod || mod.kind === 5) continue;
        const swapped = (fm.flags & 4) !== 0;
        const mw = swapped ? mod.h : mod.w;
        const mh = swapped ? mod.w : mod.h;
        if (fmFlags & 1) dx -= mw;
        if (fmFlags & 2) dy -= mh;
        this.drawModule(ctx, fm.modIdx, x + dx, y + dy, combFlags, palIdx);
      }
    }
  }

  // Return attachment offset marker (mod.kind === 5) stored in frame modules (used for hats/glasses in i.java)
  getFrameMarker(frameIdx, index = 0) {
    if (frameIdx < 0 || frameIdx >= this.frames.length) return { ox: 0, oy: 0 };
    const f = this.frames[frameIdx];
    let seen = 0;
    for (let i = 0; i < f.fmCount; i++) {
      const fm = this.fmodules[f.firstFm + i];
      if (!fm) continue;
      const m = this.modules[fm.modIdx];
      if (m && m.kind === 5) {
        if (seen === index) return { ox: fm.ox, oy: fm.oy };
        seen++;
      }
    }
    return { ox: 0, oy: 0 };
  }

  getAnimMarker(animIdx, aframeSlot = 0, index = 0) {
    if (animIdx < 0 || animIdx >= this.anims.length) return this.getFrameMarker(0, index);
    const a = this.anims[animIdx];
    const af = this.aframes[a.first + (aframeSlot % Math.max(1, a.count))];
    if (!af) return { ox: 0, oy: 0 };
    const mk = this.getFrameMarker(af.frame, index);
    return { ox: af.ox + mk.ox, oy: af.oy + mk.oy };
  }

  // Port of e.java:drawAnimFrame
  drawAnimFrame(ctx, animIdx, aframeSlot, x, y, flags = 0, palIdx = this.curPal) {
    if (animIdx < 0 || animIdx >= this.anims.length) return;
    const a = this.anims[animIdx];
    const af = this.aframes[a.first + (aframeSlot % Math.max(1, a.count))];
    if (!af) return;
    let dx = af.ox;
    let dy = af.oy;
    if (flags & 1) dx = -dx;
    if (flags & 2) dy = -dy;
    this.drawFrame(ctx, af.frame, x + dx, y + dy, flags ^ af.flags, palIdx);
  }
}
