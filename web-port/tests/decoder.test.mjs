import test from 'node:test';
import assert from 'node:assert/strict';
import path from 'node:path';
import fs from 'node:fs/promises';
import { fileURLToPath } from 'node:url';
import { UnoResources } from '../uno-loader.js';
import { patchPngPalette } from '../bsprite-loader.js';
import { crc32 } from '../midp-graphics.js';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const WEB_PORT_DIR = path.resolve(__dirname, '..');

test('UnoResources decodes all real JAR packs cleanly', async () => {
  const res = new UnoResources();
  await res.loadAll('./assets/packs', WEB_PORT_DIR);

  assert.equal(res.sprites.filter(Boolean).length, 195);
  assert.equal(res.fonts.length, 2);
  assert.equal(res.texts.length, 7);
  assert.equal(res.layers.length, 68);
  assert.ok(res.tables.characters.length >= 24);
  assert.ok(res.tables.careerStages.length >= 30);
  assert.ok(res.tables.venues.length >= 6);
  assert.equal(res.getString(0, 0), 'CAREER');
  assert.equal(res.getString(1, 1), 'Marcos');

  // Verify indexed pixel decoding (sp[0] 640x360 splash bg & sp[55] cards)
  const sp0 = res.sprites[0];
  assert.equal(sp0.getFrameBounds(0).w, 640);
  assert.equal(sp0.getFrameBounds(0).h, 360);
  const px0 = sp0.decodeModuleARGB(0, 0);
  assert.ok(px0 && px0.length === sp0.modules[0].w * sp0.modules[0].h);

  // Verify PNG PLTE+tRNS palette splice preserves valid PNG chunks
  const sp7 = res.sprites[7];
  assert.ok(sp7.pngSheets && sp7.pngSheets[0].length > 1);
  const altPng = sp7.pngSheets[0][1];
  assert.equal(altPng[0], 0x89);
  assert.equal(altPng[1], 0x50);
  assert.ok(crc32(altPng.subarray(37, 41 + 61 * 3)) !== 0);
});

test('BitmapFont supports escape tags and Vietnamese NFD diacritics without system fonts', async () => {
  const res = new UnoResources();
  await res.loadAll('./assets/packs', WEB_PORT_DIR);
  const font0 = res.fonts[0];
  const font1 = res.fonts[1];

  const mEn = font0.measureString('\\4UNO World Tour\\7');
  assert.ok(mEn.w > 80 && mEn.h > 15);

  const mVi = font1.measureString('Đảo Chiều · Cộng Dồn +4');
  assert.ok(mVi.w > 90 && mVi.h > 12);

  const wrapped = font1.wrapText('Matching cards by color or symbol in UNO & Friends!', 120);
  assert.ok(wrapped.length >= 2);
});

test('Extracted /4 WAV and MIDI JSON audio manifest exists and parses', async () => {
  const raw = await fs.readFile(path.join(WEB_PORT_DIR, 'assets/audio/manifest.json'), 'utf8');
  const manifest = JSON.parse(raw);
  assert.equal(Object.keys(manifest.bgm).length, 6);
  assert.ok(Object.keys(manifest.sfx).length >= 24);
  const bgm0 = JSON.parse(await fs.readFile(path.join(WEB_PORT_DIR, 'assets/audio/bgm_00.json'), 'utf8'));
  assert.ok(bgm0.duration > 1 && bgm0.notes.length > 10);
});
