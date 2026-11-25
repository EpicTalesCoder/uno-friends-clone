// Port of c.java:1-6, j.java:1-1650 & e.java:2881-3018 (MIDP logical viewport, fixed-point helpers & transforms)

export const VIEW_W = 640;
export const VIEW_H = 360;

// J2ME Graphics anchor bitmasks
export const TOP = 16;
export const LEFT = 4;
export const HCENTER = 1;
export const VCENTER = 2;
export const BOTTOM = 32;
export const RIGHT = 8;

// J2ME Sprite transform constants (e.java:3006-3009)
export const TRANS_NONE = 0;
export const TRANS_MIRROR_ROT180 = 1;
export const TRANS_MIRROR = 2;
export const TRANS_ROT180 = 3;
export const TRANS_MIRROR_ROT270 = 4;
export const TRANS_ROT90 = 5;
export const TRANS_ROT270 = 6;
export const TRANS_MIRROR_ROT90 = 7;

export function s8(v) {
  return (v << 24) >> 24;
}

export function u8(buf, pos) {
  return buf[pos] & 0xff;
}

export function u16LE(buf, pos) {
  return (buf[pos] & 0xff) | ((buf[pos + 1] & 0xff) << 8);
}

export function s16LE(buf, pos) {
  const v = u16LE(buf, pos);
  return v >= 0x8000 ? v - 0x10000 : v;
}

export function u32LE(buf, pos) {
  return (
    (buf[pos] & 0xff) |
    ((buf[pos + 1] & 0xff) << 8) |
    ((buf[pos + 2] & 0xff) << 16) |
    ((buf[pos + 3] & 0xff) << 24)
  ) >>> 0;
}

export function s32LE(buf, pos) {
  return u32LE(buf, pos) | 0;
}

export function idiv(a, b) {
  return (a / b) | 0;
}

// Port of CRC-32 table in e.java:2977-2989 for PNG PLTE/tRNS patching
const CRC_TABLE = new Uint32Array(256);
for (let i = 0; i < 256; i++) {
  let c = i;
  for (let k = 8; k > 0; k--) {
    c = (c & 1) !== 0 ? (c >>> 1) ^ 0xedb88320 : c >>> 1;
  }
  CRC_TABLE[i] = c >>> 0;
}

export function crc32(bytes, start = 0, length = bytes.length - start) {
  let c = 0xffffffff;
  const end = start + length;
  for (let i = start; i < end; i++) {
    c = CRC_TABLE[(c ^ bytes[i]) & 0xff] ^ (c >>> 8);
  }
  return (c ^ 0xffffffff) >>> 0;
}

export function applyAnchor(x, y, w, h, anchor = LEFT | TOP) {
  let dx = x | 0;
  let dy = y | 0;
  if (anchor & HCENTER) dx -= w >> 1;
  else if (anchor & RIGHT) dx -= w;
  if (anchor & VCENTER) dy -= h >> 1;
  else if (anchor & BOTTOM) dy -= h;
  return { x: dx, y: dy };
}

export function drawRectMIDP(ctx, x, y, w, h, stroke = true, fill = false, borderPx = 1) {
  const px = Math.floor(x);
  const py = Math.floor(y);
  const pw = Math.floor(w);
  const ph = Math.floor(h);
  if (fill) {
    ctx.fillRect(px, py, pw, ph);
  }
  if (stroke && pw > 0 && ph > 0) {
    const prevFill = ctx.fillStyle;
    ctx.fillStyle = ctx.strokeStyle || prevFill;
    const t = Math.max(1, Math.floor(borderPx));
    ctx.fillRect(px, py, pw, t);
    ctx.fillRect(px, py + ph - t, pw, t);
    ctx.fillRect(px, py, t, ph);
    ctx.fillRect(px + pw - t, py, t, ph);
    ctx.fillStyle = prevFill;
  }
}

export function drawLineMIDP(ctx, x1, y1, x2, y2) {
  ctx.beginPath();
  ctx.moveTo(Math.floor(x1) + 0.5, Math.floor(y1) + 0.5);
  ctx.lineTo(Math.floor(x2) + 0.5, Math.floor(y2) + 0.5);
  ctx.stroke();
}

export function drawRegionMIDP(ctx, img, sx, sy, sw, sh, transform, dx, dy, anchor = LEFT | TOP) {
  if (!img || sw <= 0 || sh <= 0) return;
  const swapped = (transform & 4) !== 0;
  const dw = swapped ? sh : sw;
  const dh = swapped ? sw : sh;
  const pt = applyAnchor(dx, dy, dw, dh, anchor);

  if (transform === 0) {
    ctx.drawImage(img, sx | 0, sy | 0, sw | 0, sh | 0, pt.x, pt.y, sw | 0, sh | 0);
    return;
  }

  ctx.save();
  ctx.translate(pt.x + dw / 2, pt.y + dh / 2);
  // Port of J2ME Sprite transform matrix (e.java:2894-2967, flags bit0=FLIP_X? wait let us match exact cases):
  // J2ME cases:
  // 0: none
  // 1: TRANS_MIRROR_ROT180 (flip vertical: row y -> h-1-y)
  // 2: TRANS_MIRROR (flip horizontal: col x -> w-1-x)
  // 3: TRANS_ROT180 (180 deg)
  // 4: TRANS_MIRROR_ROT270 (transpose)
  // 5: TRANS_ROT90 (90 deg CW)
  // 6: TRANS_ROT270 (270 deg CW / 90 CCW)
  // 7: TRANS_MIRROR_ROT90 (anti-transpose)
  switch (transform & 7) {
    case 1:
      ctx.scale(1, -1);
      break;
    case 2:
      ctx.scale(-1, 1);
      break;
    case 3:
      ctx.scale(-1, -1);
      break;
    case 4:
      ctx.rotate(-Math.PI / 2);
      ctx.scale(1, -1);
      break;
    case 5:
      ctx.rotate(Math.PI / 2);
      break;
    case 6:
      ctx.rotate(-Math.PI / 2);
      break;
    case 7:
      ctx.rotate(Math.PI / 2);
      ctx.scale(1, -1);
      break;
    default:
      break;
  }
  ctx.drawImage(img, sx | 0, sy | 0, sw | 0, sh | 0, -sw / 2, -sh / 2, sw | 0, sh | 0);
  ctx.restore();
}

export function argbIntToCanvas(argbArray, w, h) {
  if (typeof document === 'undefined' || !argbArray || w <= 0 || h <= 0) return null;
  const canvas = document.createElement('canvas');
  canvas.width = w;
  canvas.height = h;
  const c2d = canvas.getContext('2d');
  c2d.imageSmoothingEnabled = false;
  const imgData = c2d.createImageData(w, h);
  const dst = imgData.data;
  const total = w * h;
  for (let i = 0; i < total; i++) {
    const px = argbArray[i] >>> 0;
    const o = i << 2;
    dst[o] = (px >>> 16) & 0xff;
    dst[o + 1] = (px >>> 8) & 0xff;
    dst[o + 2] = px & 0xff;
    dst[o + 3] = (px >>> 24) & 0xff;
  }
  c2d.putImageData(imgData, 0, 0);
  return canvas;
}
