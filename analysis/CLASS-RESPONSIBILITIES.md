# UNO & Friends (`UNO_Friends_360x640.jar`) — Stage 1 Class & Binary Analysis

- **MIDlet**: `GloftUNO3` (`Gameloft SA`, logical display `640×360` landscape via `c.e_ = 640`, `c.f_ = 360`; fixed sim step `25 FPS` / `m.a` / `j.d = 40ms`).
- **Original JAR**: `games/uno-friends/original/UNO_Friends_360x640.jar` (`3,174,897` bytes, SHA-256 `804a325dd19f60ad1bd3f6c8790349ab54fb133bca7e7fb2c07928982224b3d7`).

---

## 1. Complete Class Inventory (21 Classes)

| Class | Role | Keep / Port / Strip | Evidence (`Class.java:lines`) |
| --- | --- | --- | --- |
| `GloftUNO3` | MIDlet entry; instantiates `new a(this, null)`, calls `a.i()`, starts loop | Entry glue | `GloftUNO3.java:1-30` |
| `WapTai.COM.WapTai` | Distributor ad MIDlet opening `https://waptai.com` | **Strip** | `WapTai.java:1-22` |
| `b` | Display font / color index constants | Merge constants into config | `b.java:1-5` |
| `c` | Logical viewport (`e_=640`, `f_=360`, `bA=320`, `bB=180`, `g_=330`, `bz=620`) & UI IDs | Merge constants (`640×360`) | `c.java:1-6` |
| `d` | Seat coords (`{597,434}`, `{48,406}`, `{220,76}`, `{746,84}`) & layout tables | Port table coordinates | `d.java:1-18` |
| `f` | Shared flag/version constants | Merge constants | `f.java:1-3` |
| `g` | Table/color mappings `{643, 13..11}` & visual LUTs | Port color LUTs | `g.java:1-40` |
| `m` | Frame step constant `int a = j.d(j.c(1000) / 25)` (`40ms`) | Fixed timestep `40ms` | `m.java:1-3` |
| `h` | HTTP leaderboard / social submission queue | **Stub / Strip external HTTP** | `h.java:1-110` |
| `s` | Gameloft IGP (`/dataIGP` More Games promo browser) | **Strip** (no external carrier ads) | `s.java:1-400` |
| `j` | GLLib Core: `Canvas`, split-pack loader (`b`/`a`), serialized arrays (`/6`), ISO-8859-1 string banks (`/EN`), XXTEA RMS, `sin/cos`/fixed-point math, key/pointer input, MIDP graphics wrappers | Port to `uno-loader.js`, `midp-graphics.js`, `storage-i18n.js` | `j.java:1-1650` |
| `e` | Gameloft BSprite v5 (`0x05df`) decoder (`f` frames, modules, I64RLE/raw/pixel formats + `0x20000000` embedded PNG w/ swapped `PLTE`/`tRNS`), plus bitmap font parser `a(short[])` & text measurement/drawing (`\0..\9`, `\_`, `\^`, `\x01`, `\x02`) | Port to `bsprite-loader.js` & `font-original.js` | `e.java:1-3019` |
| `p` | Sprite animation player (`e` + anim/frame timer) AND `javax.microedition.media.Manager` audio queue (`31` slots from `/4`) | Port anim helper + `uno-audio.js` | `p.java:1-537` |
| `q` | UNO Card node (`a`=rank `0..14`, `b`=color `0..4`, `a:Z` face-down/locked, `e:Z` playable, coords `(f,g) -> (o,p)`, sprites `51,54..57,70,80,81,186`) | Port in `uno-rules.js` & `render-original.js` | `q.java:1-782`, `q.javap.txt:1-90` |
| `n` | Doubly-linked list of `q` cards (hands `0..3`, draw pile `4`, discard pile `5`; curved fan layout `b()`, card transfer `a(q)`) | Port in `uno-rules.js` & `render-original.js` | `n.java:1-365`, `n.javap.txt:1-90` |
| `o` | `cRules` — game mode (`o.a`: 0=Quick, 1=Career, 2=Custom/Hotseat?, 3=Tutorial), submode `o.d` (`0..11`), custom rules `o.i`, player count `o.f`, turn direction `o.a:Z`, eliminated player `o.k`, Wild+4 challenge `o.m`, UNO catch `o.l`, card effect resolver `b(r)` | Port to `uno-rules.js` | `o.java:1-506`, `o.javap.txt:1-90` |
| `r` | `cPlayer` — seat `b`, kind `a` (`0`=Human, `1`=AI, `2`=Empty), AI probability arrays (`r.a..j`), Special Powers `k` (`0..4`: Shield, Freeze/Scramble, Target +4, Global +2, Power 4), charge `j`, shield `l`, `a(n,o)` AI play/draw, `a(q)` play + power trigger | Port to `uno-rules.js` & `game.js` | `r.java:1-961`, `r.javap.txt:1-90` |
| `k` | Skeletal avatar animation loader (`k.a(1)` from `/8[1]`), opcodes `41` pos/vel, `42` anim, `43/44` flags, `105` body-part sprite swap `0..16`, `106` transition | Port in `uno-loader.js` & `render-original.js` | `k.java:1-137` |
| `l` | Particle emitter system (`a()` fixed-point velocity/gravity, renders via `e.a(..., 0)`) | Port in `render-original.js` | `l.java:1-443` |
| `i` | Entity manager (`case 22` card arc/fade VFX, `case 42` `cActor_Creature` 17-part customizable avatar with sprites `84..176`, `case 43` VFX) | Port in `render-original.js` | `i.java:1-1585` |
| `a` | Master game controller: all `bW` states (`0..52`), match substate `m` (`0..23`), `/6` data table loader (`1043-1168`), `/7` 68-layer UI loader/renderer (`aW`/`b`/`f`), RMS `"UNO"` & `"ACHIEVEMENTS"` persistence, Career, Shop, Lottery, Minigames, Help, Profile, Achievements, Tutorial, Keyboard+Pointer handling | Port modularly across `game.js`, `render-original.js`, `uno-loader.js`, `storage-i18n.js` | `a.java:1-23347` |

---

## 2. State Machines (`a.java`)

### Top-Level States (`bW`, from `g(int)` at `a.java:21559-21669`)
- `0`: `ks_init` — loads `/1` LUT (`a.java:1457`), ISO-8859-1 strings, RMS `"UNO"` (`aK()`), transitions to `2` (`ks_gameloft_logo`) or `51` (language).
- `1`: `ks_loading` (`cd` sub-loads `0..13`) — loads BSprite subsets `a[0..194]` from `/3` (`a.java:1467-1695`, `3501-3592`) and draws loading bar + hint.
- `2`: `ks_gameloft_logo` — Gameloft intro sting -> `18` (`ks_copyRight`) or `3` (`ks_splash`).
- `3`: `ks_splash` — title screen + initial audio prompt (`1022/1023`, `a.java:3011-3060`) -> `4` (`ks_menu_main`).
- `4`: `ks_menu_main` — Quick Play, Career (UNO World Tour), Rules/Custom, Shop, Profile, Options, Help, Exit (`a.java:3231+`). Note: strip `ks_igp` (`12`) promo.
- `8`: `ks_menu_option` — Sound/SFX toggle, Music toggle, Language, Reset RMS, Help, Credits.
- `13`: `ks_gameplay` — active UNO match (4 seats around curved table, `/7` HUD layers `31/32`, match substate `m`).
- `15`: `ks_debriefing` — end-of-round/match player standings (`a.java:5353+`) -> `42` (`ks_debriefing_tally`).
- `17`: `ks_menu_ingame` — in-match pause overlay (Resume, Sound, Rules/Help, Restart, Quit).
- `18`: `ks_copyRight` — copyright notice screen (`a.java:2037`).
- `21`: `ks_stage_select_compact` — Career stage select within chosen Venue `0..5` (`o.g`, 5 stages `0..4`).
- `23`: `ks_lottery` — Daily 3-card scratch lottery (`a.java:6041-6175`).
- `24`: `ks_objectives` — Pre-match Career stage mission/objectives & entry fee confirm (`a.java:2120-2145`).
- `26`: `ks_newShop` — Avatar & Table Theme / Card Deck / Power Booster shop (`a.java:19651-19995`, layer `61/62`).
- `31`: `ks_menu_multiplay` (original Hotseat/Pass-and-Play / Multiplayer stub — adapt cleanly + integrate Web Port Live Multiplayer).
- `34`: `ks_level_up` (popup triggered from `ar()` during `ks_debriefing_tally`).
- `35`: `ks_venue_select_slide` — Career world tour venue carousel (`0..5` venues, `a.java:6468-6660`, layers `24/25`).
- `36`: `ks_minigame_memory` — Card pair memory minigame.
- `37`: `ks_minigame_connect` — Card match/connect minigame (`a.java:7409-7580`).
- `38`: `ks_minigame_stack` — Card stack minigame (`a.java:7641+`).
- `39`: `ks_profile` — Player avatar preview, XP/Level (`fW`), Coins (`fV`), Stars (`y()`), Name change (`49`), Achievements (`50`).
- `42`: `ks_debriefing_tally` — Coin + XP tally animation (`a.java:10157-10350`, layers `22/40/42`).
- `43`: `ks_battleBanner` — VS intro banner before Career/Duel match.
- `44`, `45`: `ks_help`, `ks_help_subScreen` — Illustrated Rules, Card Actions, Custom Rules, Scoring, Powers, Controls, Career guides (`a.java:22324-22450`).
- `47`: `ks_cheat` — Debug/unlock screen (optional/hidden).
- `48`, `50`: `ks_achievement_complete`, `ks_achievements` — 30 Achievements browser (`a.java:21139-21301`).
- `49`: `ks_enter_name` — On-screen keyboard name entry (`a.java:17153-17240`).
- `51`: `ks_language_selection` — Language picker (`a.java:8826-8900`).
- `52`: `ks_hotseat_menu` — Local Hotseat / Custom match setup (2–4 players, rules `o.i`, target score).

### Match Substates (`m`, `a.java:4220-4650, 17519-17554`)
- Deal & intro -> Active turn (`0/1/2`) -> Play/Draw card (`a(r, q)` at `a.java:13905`) -> Card flying/effect animation -> Check UNO missed (`m = 5 / 17`, `rules.h:2787`) -> Wild Color Wheel (`10` layer items `26..29` = Blue `1`, Green `2`, Red `3`, Yellow `4`) -> Wild+4 Challenge (`m = 6`, accept +4 vs challenge bluff: `+4` if valid else `+6` challenger / `+4` culprit) -> Draw-and-Play (`m = 19`) -> Jump-in / Stack / 7-0 swap -> Round End (`t()`, scoring `a.java:9862-9981`) -> `ks_debriefing` (`15`).

---

## 3. Verified Pack Formats (`analysis/recovered/`)

All packs (except `/0`) share the Gameloft split-pack container header:
- `u16LE count` = `numOffsets` -> `numItems = count - 1` (since `offs[numItems]` == total stream length).
- `u32LE offs[count]` relative to concatenated byte stream (e.g., `/3` + `/3.1`..`/3.27`, `/4` + `/4.1`).
- Block `i` spans `[offs[i], offs[i+1])`; first byte is `type/flag`, followed by payload.

| Pack | Chunks | Items | Verified Binary Structure |
| --- | --- | --- | --- |
| `/0` | 1 (24 B) | 2 | Byte count `2`, length-prefixed MIME strings: `[0]="audio/midi"`, `[1]="audio/x-wav"` |
| `/1` | 1 (663 B) | 2 | `[0]`, `[1]`: `j.a("/1", 1, 0)` sin/cos fixed-point LUT (`j.a(InputStream)` serialized `short[]`) |
| `/2` | 1 (40,437 B) | 4 | `[0]` Unicode->glyph LUT (`j.a`: `0x19a1` short[]); `[1]` BSprite Font 0 (large, `palMask=31`); `[2]` extra font data; `[3]` BSprite Font 1 (small, `palMask=15`) |
| `/3` | 28 (`3..3.27`) | 195 | BSprite v5 (`0x05df`) sprites `a[0..194]`. Includes BOTH indexed pixel formats (`25840` I64RLE, `10225`, `22258`, `5632`, `1024`, `512`, `22018`, `-23978`) AND `flags & 0x20000000` embedded PNG chunks with custom `PLTE`/`tRNS` CRC-32 injection (`e.java:192-797, 1798-2167`)! |
| `/4` | 2 (`4, 4.1`) | 31 | `[0..5]` MIDI (`MThd`, flag=0 -> `/0[0]`); `[6..30]` WAV (`RIFF WAVE`, flag=1 -> `/0[1]`) |
| `/5` | 1 (6,128 B) | 2 | 2 standalone PNGs (`flag=2` + `\x89PNG...`) |
| `/6` | 1 (13,754 B) | 27 | Serialized Java primitive arrays (`j.a(InputStream)` `type<<12 | len`): `[0]` CHARACTERS, `[1]` CUTSCENES, `[2]` CAREERSTAGES (`6×5`), `[3]` VENUES, `[4]` TUTORIAL_STEPS, `[5]` TUTORIAL_CARDS, `[6..15]` SHOP (`b[0..9]` via `bG`/`a`), `[16]` XP, `[17]` QUICKPLAYPARAMS, `[18..20]` MEMORY/CONNECT/BONUS, `[21]` Tweaks, `[22]` POWERPARAMS, `[24]` STACK, `[25..26]` ACHIEVEMENTS |
| `/7` | 1 (28,988 B) | 68 | UI Layers `[0..67]` (`flag=2` + `u16 count` items, each item `s16[N]`): `1`=BSprite, `2`=Text (` bank/id`, `font`, `align`, `pal`), `4`=Rect/AlphaRect (`argb`), `5`=Line, `6`=Button/Hitbox, `7`=ClipRect, `100`=MenuZone, `101`=ScrollChildLayer, `102`=LayerSplit (`a.java:15715-16071`) |
| `/8` | 1 (53,241 B) | 2 | `[0]` skeleton/outfit metadata; `[1]` `k.a(1)` 17-part avatar animation timelines |
| `/EN` | 1 (31,269 B) | 7 | Text banks `[0..6]` (`ISO-8859-1`, lookup `id >> 11` bank, `id & 2047` index): `[0]`=670 UI strings, `[1]`=24 Char names, `[2]`=60 Career lines, `[3]`=Tutorial, `[4]`=15 Hints, `[5]`=153 Help strings, `[6]`=7 Cheat strings |
| `/888` | 1 (530 B) | - | 8-bit popcount lookup table (auxiliary/unused in gameplay) |

---

## 4. UNO Rules, Card Mapping & AI (`q`, `n`, `o`, `r`, `a`)

- **Color IDs (`q.b`)**: `0` = Uncolored Wild, `1` = Blue (`#2266EE`, UI layer `10` item `26`), `2` = Green (`#22AA44`, item `27`), `3` = Red (`#EE3322`, item `28`), `4` = Yellow (`#EEBB11`, item `29`) (`a.java:4866-4879`).
- **Rank IDs (`q.a`)**: `0..9` (Number, face value), `10` (Reverse, `20 pts`), `11` (Skip, `20 pts`), `12` (Draw Two `+2`, `20 pts`), `13` (Wild, `50 pts`), `14` (Wild Draw Four `+4`, `50 pts`) (`q.java`, `a.java:9862-9981`).
- **Seats (`0..3`)**: `0`=South (Human in Solo, Host/Player 1 in MP), `1`=West, `2`=North (Teammate in 2v2 `o.d == 2`), `3`=East. `r.a == 2` hides empty seat.
- **Playable Rules & Modes (`o.java`, `a.java`)**:
  - **Quick Play (`o.a=0`)** & **Custom Match (`o.i` bitmask)**: Target score (250/500/1-round), Stacking `+2`/`+4`, 7-0 Swap & Rotate, Jump-In, Draw-to-Match / Force Play, Wild+4 Challenge (`o.m`), UNO Call/Catch (`+2` penalty), 2v2 Team (`o.d=2`), Elimination Tournament (`o.d=3`).
  - **Career / UNO World Tour (`o.a=1`)**: 6 Venues × 5 Stages (`a[6][5]`), coin entry fees & star ratings (`1..3` stars), story cutscenes, Special Powers (`r.k = 0..4`: Shield, Freeze/Scramble, Target +4, Global +2, Discard Action), XP/Level-Up, Coins (`fV`), Shop customization (`17`-part avatar + table themes + card backs), 30 Achievements, Daily Scratch Lottery, Tutorial (`bc`), and 3 Minigames.

---

## 5. Input, RMS Storage & Web Port + Multiplayer Plan

- **Input (`j.java`, `a.java:22693-22798`, `2863+`)**:
  - Mouse / Touch: pointer pressed/dragged/released mapped to `640×360` canvas. Click card once to raise/preview, second click or drag up (`y < 235`) to play; click Draw pile to draw; click UNO / Jump-In / Color Wheel / Layer buttons; wheel/drag scrolls lists.
  - Keyboard + J2ME Keypad: `ArrowKeys`/`WASD` (`-1..-4`), `Enter`/`Space`/`5` (`FIRE`), `Q`/`Tab`/`Soft1` (`LSK`), `E`/`Backspace`/`Esc`/`Soft2` (`RSK`), digits `0..9`, `*`, `#`. All keyboard handlers guard against `INPUT`/`TEXTAREA`/`SELECT` inside `#mp-lobby`.
- **Save Data (`RMS "UNO"`, `"ACHIEVEMENTS"`)**: Persisted in `localStorage` (`uno_friends_save_v1`, `uno_friends_ach_v1`), pre-decoded from `/6` defaults on first run, keeping user coins, XP, unlocked venues/stages, stars, equipped avatar parts/themes/decks, player name, sound flags, and bilingual VI/EN setting (`lang`).
- **Web Port Layout (`640×360` landscape)**:
  - Canvas `640×360` (`imageSmoothingEnabled = false`), scaled smoothly in `flex: 1` Stage container (`max-width: calc((100vh - 54px) * (640 / 360))`).
  - Docked `<div class="floating-toolbar">` directly beneath canvas (never overlapping gameplay!) with: `?` Guide, EN/VI (`#btn-lang`), Audio mute, Save/Reset, `Multiplayer (2-4P)` (`#btn-mp-lobby`), D-Pad toggle.
  - **Mandatory 2–4P Multiplayer (`multiplayer.js` + `#mp-lobby`)**:
    - Room codes `UF` + 4 digits (`UFxxxx`), Quad Transport (`BroadcastChannel` + `/api/mp` + `ntfy.sh` + MQTT-WSS `bltts/mp/v2/UFxxxx/*`), URL `?mp=UFxxxx` auto-join, inline `Blob` Web Worker ticking Host even in background tabs.
    - Host-authoritative UNO match supporting 2–4 human seats + optional AI fill, rule toggles (Target Score, Stacking, 7-0, Challenge, Powers), broadcasting public table state (`topCard`, `currentColor`, `direction`, `turnSeat`, `pendingDraw`, `phase`, `unoCalled`, seat card counts/names/avatars/scores) plus per-seat card arrays so each human client only views and plays their own hand!
