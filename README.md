# UNO & Friends (`UNO & Friends`) — Standalone Clone

- **Vendor**: Gameloft
- **Resolution**: `640×360`
- **Genre**: Card & Strategy · J2ME Port

- 1:1 J2ME 640×360 BSprite v5 + bitmap font (VI/EN) port from GloftUNO3
- Quick Play, Career World Tour (6 venues × 5 stages), 2v2 Partners, Elimination & Custom 7-0/Stacking rules
- Genuine /4 WAV SFX & MIDI BGM + Avatar & Table Shop + Special Powers
- Online 2–4P Multiplayer qua 4G/5G/WiFi (MQTT-WSS, ntfy HTTPS, /api/mp, BroadcastChannel) + Live Chat & Quick Emote

## Project Layout

- `original/` — Original untouched J2ME `.jar`
- `analysis/` — Decompiled Java sources, `javap` bytecode dumps, and decoded binary tables/assets
- `web-port/` — HTML5 Canvas/WebGL + ES Modules web port & Node unit tests
- `api/mp.mjs` — Same-origin multiplayer relay (`/api/mp`) for Vercel & Discord Activity
- `tools/build-dist.py` — Packages `web-port/` to `dist/` with cache-busting `?v=<timestamp>`
- `tools/verify-port-parity.py` — Runs syntax, unit tests, and decompilation parity checks


## Run, Test & Deploy

```bash
# Run unit tests
npm test

# Run parity checks
python3 tools/verify-port-parity.py

# Build dist/ and preview locally
npm run build
npm start
```
