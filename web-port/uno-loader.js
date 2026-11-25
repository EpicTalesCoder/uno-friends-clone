// Port of a.java:1043-1168, 15715-16395 & j.java:620-1650
// Loads binary JAR packs (/1, /2, /3.bin, /5, /6, /7, /8, /EN) cleanly in Browser or Node.

import { BSprite, parseSplitPack } from './bsprite-loader.js';
import { loadFontsFromPackBuffer, readSerializedArray } from './font-original.js';
import { u8, s16LE, u16LE, u32LE } from './midp-graphics.js';

async function fetchBinary(url, nodeBaseDir = null) {
  if (nodeBaseDir && typeof process !== 'undefined' && process.versions?.node) {
    const fs = await import('fs/promises');
    const path = await import('path');
    return new Uint8Array(await fs.readFile(path.join(nodeBaseDir, url)));
  }
  const res = await fetch(url);
  if (!res.ok) throw new Error(`Failed to fetch asset ${url}: ${res.status}`);
  return new Uint8Array(await res.arrayBuffer());
}

// Port of j.d(InputStream) ISO-8859-1 string banks (/EN[0..6])
export function parseTextPack(packBytes) {
  const blocks = parseSplitPack(packBytes);
  const banks = [];
  for (const blk of blocks) {
    const bankId = blk[1] & 0xff;
    const cnt = u32LE(blk, 2);
    const strs = new Array(cnt);
    let prevOff = 0;
    const rawStart = 6 + cnt * 4;
    for (let i = 0; i < cnt; i++) {
      const endOff = u32LE(blk, 6 + i * 4);
      let s = '';
      for (let p = rawStart + prevOff; p < rawStart + endOff; p++) {
        s += String.fromCharCode(blk[p] & 0xff);
      }
      strs[i] = s;
      prevOff = endOff;
    }
    banks[bankId] = strs;
  }
  return banks;
}

// Port of a.java:1043-1168 & bD() (/6 packed arrays)
export function parseDataTables(pack6Bytes) {
  const items = parseSplitPack(pack6Bytes);
  const decoded = items.map((blk) => readSerializedArray(blk, 1));
  return {
    raw: decoded,
    characters: decoded[0],      // 28 rows (avatar definitions & stats)
    cutscenes: decoded[1],       // career cutscene timelines
    careerStages: decoded[2],    // 38 rows (6 venues x 5 stages + specials)
    venues: decoded[3],          // 12 rows (venue unlock requirements & stage ids)
    tutorialSteps: decoded[4],   // scripted tutorial turns
    tutorialCards: decoded[5],   // starting deck for tutorial
    shop: decoded.slice(6, 16),  // 10 shop category tables (clothing, hats, glasses, skins, hair, eyes, powers, packs, themes, decks)
    xpLevels: decoded[16],       // XP curve [62]
    quickPlayParams: decoded[17],
    memoryMinigame: decoded[18],
    connectMinigame: decoded[19],
    bonusParams: decoded[20],
    tweaks: decoded[21],
    powerParams: decoded[22],
    extra23: decoded[23],
    stackMinigame: decoded[24],
    achievements0: decoded[25],
    achievements1: decoded[26],
  };
}

// Port of aW() /7 68 UI layer item decoder (a.javap.txt:62164-62435)
export function parseUILayers(pack7Bytes) {
  const blocks = parseSplitPack(pack7Bytes);
  return blocks.map((blk) => {
    const payload = blk.subarray(1); // skip pack flag 0x02
    const items = [];
    let p = 0;
    while (p + 10 <= payload.length) {
      const nExtra = s16LE(payload, p + 8);
      const totalShorts = 5 + nExtra;
      const arr = new Int16Array(totalShorts);
      for (let i = 0; i < totalShorts; i++) {
        arr[i] = s16LE(payload, p + i * 2);
      }
      // Port of a.javap.txt:62333-62370: sprite anim encode when type==1 && s[7]>=0
      if (arr[0] === 1 && arr[7] >= 0) {
        if (arr[6] === -2) arr[7] |= 512;
        else if (arr[6] === -3) arr[7] |= 1024;
        if (arr[6] < 0) arr[6] = 0;
      }
      items.push(arr);
      p += totalShorts * 2;
    }
    return items;
  });
}

// Port of /3 split pack sprite header array (lazy-decodes BSprites on demand + supports preload subset)
export function parseSpritePack(pack3Bytes) {
  const blocks = parseSplitPack(pack3Bytes);
  return blocks.map((blk, i) => (blk.length > 2 ? new BSprite(blk, i, { hasPackFlag: true }) : null));
}

export class UnoResources {
  constructor() {
    this.texts = [];
    this.tables = null;
    this.layerTemplates = [];
    this.layers = [];       // mutable layer instances (arrays of Int16Array)
    this.layerFlags = [];   // Uint8Array per layer (bit 0=focus, 1=pressed, 2=disabled, 3=dimmed, 4=alpha64, 5=active, 6=animDone)
    this.layerVisible = []; // boolean[] visibility per item
    this.layerStrings = []; // String[] dynamic text overrides
    this.sprites = [];
    this.fonts = [];
    this.miscImages = [];
    this.sinCosLut = null;
    this.loaded = false;
  }

  getString(packedId, bankOverride = null) {
    if (packedId < 0) return '';
    const bank = bankOverride !== null ? bankOverride : (packedId >> 11);
    const idx = packedId & 2047;
    return (this.texts[bank] && this.texts[bank][idx]) || '';
  }

  resetLayer(layerId) {
    const tpl = this.layerTemplates[layerId];
    if (!tpl) return;
    const count = tpl.length;
    this.layers[layerId] = tpl.map((arr) => new Int16Array(arr));
    this.layerFlags[layerId] = new Uint8Array(count);
    this.layerVisible[layerId] = new Array(count).fill(true);
    this.layerStrings[layerId] = new Array(count).fill(null);

    for (let i = 0; i < count; i++) {
      const s = this.layers[layerId][i];
      if (s[0] === 2) {
        if (s[17] >= 0) this.layerStrings[layerId][i] = this.getString(s[17], 0);
        this.layerVisible[layerId][i] = s[18] !== 0;
      } else if (s[0] === 6) {
        if (s[24] >= 0) this.layerStrings[layerId][i] = this.getString(s[24], 0);
        this.layerVisible[layerId][i] = s[14] !== 0;
      } else if (s[0] === 1) {
        this.layerVisible[layerId][i] = s[10] !== 0;
      } else if (s[0] === 4) {
        this.layerVisible[layerId][i] = s[11] === 0;
      } else if (s[0] === 5 || s[0] === 101) {
        this.layerVisible[layerId][i] = s[7] !== 0;
      }
    }
  }

  resetAllLayers() {
    for (let i = 0; i < this.layerTemplates.length; i++) {
      this.resetLayer(i);
    }
  }

  setLayerItemVisible(layerId, idx, visible) {
    if (this.layerVisible[layerId] && idx >= 0 && idx < this.layerVisible[layerId].length) {
      this.layerVisible[layerId][idx] = !!visible;
    }
  }

  setLayerItemText(layerId, idx, text) {
    if (this.layerStrings[layerId] && idx >= 0 && idx < this.layerStrings[layerId].length) {
      this.layerStrings[layerId][idx] = text;
    }
  }

  setLayerItemFlag(layerId, idx, mask, on) {
    const arr = this.layerFlags[layerId];
    if (!arr || idx < 0 || idx >= arr.length) return;
    if (on) arr[idx] |= mask;
    else arr[idx] &= ~mask;
  }

  setLayerItemVal(layerId, idx, fieldIdx, val) {
    const s = this.layers[layerId]?.[idx];
    if (s && fieldIdx >= 0 && fieldIdx < s.length) s[fieldIdx] = val;
  }

  getLayerItemVal(layerId, idx, fieldIdx) {
    const s = this.layers[layerId]?.[idx];
    return s && fieldIdx >= 0 && fieldIdx < s.length ? s[fieldIdx] : 0;
  }

  async ensureSpriteImages(ids) {
    const tasks = [];
    for (const id of ids) {
      const sp = this.sprites[id];
      if (sp) tasks.push(sp.preloadImages());
    }
    await Promise.all(tasks);
  }

  async loadAll(baseAssetPath = './assets/packs', nodeBaseDir = null) {
    const [b1, b2, b3, b6, b7, bEN] = await Promise.all([
      fetchBinary(`${baseAssetPath}/1`, nodeBaseDir),
      fetchBinary(`${baseAssetPath}/2`, nodeBaseDir),
      fetchBinary(`${baseAssetPath}/3.bin`, nodeBaseDir),
      fetchBinary(`${baseAssetPath}/6`, nodeBaseDir),
      fetchBinary(`${baseAssetPath}/7`, nodeBaseDir),
      fetchBinary(`${baseAssetPath}/EN`, nodeBaseDir),
    ]);

    const p1 = parseSplitPack(b1);
    this.sinCosLut = readSerializedArray(p1[1], 1);
    this.texts = parseTextPack(bEN);
    this.tables = parseDataTables(b6);
    this.layerTemplates = parseUILayers(b7);
    this.resetAllLayers();
    this.fonts = await loadFontsFromPackBuffer(b2);
    this.sprites = parseSpritePack(b3);

    // Preload all embedded PNG sheets in browser (111 sprites total ~1.5MB in parallel, <100ms locally)
    if (typeof Image !== 'undefined') {
      await Promise.all(this.sprites.map((sp) => (sp ? sp.preloadImages() : null)));
    }
    this.loaded = true;
    return this;
  }
}
