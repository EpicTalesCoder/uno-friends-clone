import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class a extends j implements c, d, f {
   public static k a;
   private static long a = 0L;
   private static boolean k;
   private static int bI;
   private static int bJ;
   private static int bK;
   private static int bL;
   private static int bM;
   private static int bN;
   private static int bO;
   private static int bP;
   private static int bQ;
   private static int[] g = new int[15];
   private static int[] h = new int[15];
   private static int[] i = new int[15];
   private static int bR;
   private static int bS;
   private static int bT;
   private static int bU;
   private static int bV;
   private static int bW;
   private static int bX;
   private static int bY;
   private static boolean l = false;
   private static boolean m = false;
   private static boolean n = false;
   private static long b = 0L;
   private static int bZ = -1;
   private static boolean o = false;
   private static String a = "no error";
   private static String b = "no error";
   private static int ca = 0;
   private static int cb;
   private static boolean p;
   private static boolean q = false;
   private static boolean r = false;
   private static boolean s = false;
   private static boolean t = false;
   private static boolean u = false;
   private static boolean v;
   private static boolean w = false;
   private static int cc = -1;
   private static int cd = -1;
   private static int ce;
   private static int cf;
   private static int cg = 0;
   private static int ch;
   private static int ci;
   private static int cj;
   private static boolean x;
   private static int ck;
   public static int a;
   public static int b;
   private static int cl;
   static int[] a = new int[4];
   static int[] b = new int[4];
   private static l a;
   private static int cm = -1;
   private static String c;
   private static int cn = 0;
   private static int co = -1;
   private static int cp = -1;
   private static int cq = 0;
   private static int cr = -1;
   private static int cs = -1;
   private static int ct = 0;
   private static int cu = 0;
   private static String d;
   private static boolean y;
   private static int cv;
   private static int cw;
   private static int cx;
   private static int cy;
   private static int cz;
   private static int cA;
   private static int cB;
   private static int cC;
   private static int cD;
   private static int cE;
   private static int cF;
   static i[] a = new i[4];
   private static int[] j = new int[4];
   private static int cG;
   private static int[] k = new int[4];
   private static int[] l = new int[4];
   private static boolean[] b = new boolean[4];
   private static int[] m = new int[4];
   private static int[] n = new int[4];
   private static int cH;
   private static int cI;
   private static p e = null;
   private static int cJ = 0;
   private static long c;
   private static int cK = 0;
   private static int cL = 0;
   private static int cM = 0;
   private static int cN = 0;
   private static int[] o = new int[4];
   private static int[] p = new int[4];
   private static int[] q = new int[4];
   private static int[] r = new int[4];
   private static int[] s = new int[4];
   private static int[] t = new int[4];
   private static boolean[] c = new boolean[3];
   private static int cO = -1;
   private static int cP = 0;
   private static int cQ = 2;
   private static int cR = 0;
   private static long d = 0L;
   private static l[] a;
   private static boolean z;
   private static boolean A;
   private static boolean B;
   private static int[] u = new int[3];
   private static l b;
   private static l c;
   private static boolean C = false;
   private static p f;
   private static int[] v = new int[]{11, 13};
   private static int cS = -1;
   private static l[] b = new l[2];
   private static boolean D;
   private static l d;
   private static boolean E = false;
   private static p g = null;
   private static int cT = -1;
   private static int cU;
   private static int cV;
   private static int[] w = new int[]{4, 1, 1};
   private static int[][] d;
   private static int cW;
   private static int cX;
   private static int cY;
   private static int cZ;
   private static int da;
   private static int db;
   private static boolean F;
   private static boolean G;
   private static int[] x = new int[]{8, 14, 19};
   private static int[] y = new int[2];
   private static int[] z = null;
   private static l[] c = new l[2];
   private static p[] c = new p[2];
   private static boolean H = false;
   private static int[] A = new int[]{-20, 20};
   private static boolean I = false;
   private static boolean J = false;
   private static int[] B = null;
   private static int[][] e;
   private static int[][] f;
   private static int dc;
   private static int dd;
   private static int de;
   private static int df;
   private static int dg;
   private static int[] C = new int[15];
   private static int[] D;
   private static int dh = 0;
   private static int di = 0;
   private static int dj = 0;
   private static boolean K;
   private static int dk = 0;
   private static int dl = 0;
   private static boolean L;
   private static int dm;
   private static int dn;
   private static int do;
   private static int dp;
   private static int[][] g;
   private static int dq;
   private static int dr;
   private static int[][] h;
   private static int[] E;
   private static int[] F;
   private static int ds;
   private static int dt;
   private static int du;
   private static int dv;
   private static int dw;
   private static int dx;
   private static int dy;
   private static int dz;
   private static boolean M;
   private static boolean N;
   private static int[] G = new int[2];
   private static int[] H = null;
   private static l[] d = new l[2];
   private static p[] d = new p[2];
   private static boolean O = false;
   private static int[] I = new int[]{-20, 20};
   private static boolean P = false;
   private static l e = null;
   private static l f = null;
   private static boolean Q = true;
   private static int dA = -1;
   private static int dB = 0;
   private static p h = null;
   private static i a = null;
   private static i b = null;
   private static boolean R;
   private static boolean S = false;
   private static int dC;
   private static int dD;
   private static e a;
   private static int dE;
   private static int dF;
   private static int dG;
   private static int dH;
   private static int dI;
   private static int dJ;
   private static int dK;
   private static int dL;
   private static boolean T = false;
   private static int dM;
   private static boolean U;
   private static int dN;
   private static int dO = -1;
   private static boolean V = false;
   private static boolean W = false;
   private static boolean X = false;
   private static int dP;
   private static boolean Y;
   private static p i;
   private static p j;
   private static boolean Z;
   private static l g;
   private static boolean aa = false;
   private static boolean ab = false;
   private static boolean ac;
   private static int[] J = new int[4];
   private static int[] K = new int[4];
   private static int[] L = new int[4];
   private static int[][] i = new int[3][4];
   private static int[] M = new int[4];
   private static int[][] j = new int[3][4];
   private static int dQ;
   private static int[] N = new int[3];
   private static boolean ad = true;
   private static boolean ae = true;
   static int c = 250;
   static int[] c = new int[4];
   private static int[] O = new int[4];
   private static int[] P = new int[4];
   private static int[] Q = new int[]{0, 1, 2, 3};
   private static int dR;
   private static int dS;
   private static int dT = 0;
   private static int dU = 0;
   private static int dV = 0;
   private static int dW = 0;
   private static int dX = 0;
   private static int dY = 0;
   private static int[] R = new int[3];
   private static boolean af = false;
   private static int dZ;
   private static int ea = 4;
   private static boolean ag = false;
   private static boolean ah = false;
   private static l h;
   private static i c;
   private static int eb = -1;
   private static l i;
   private static l j;
   private static int ec = 0;
   private static int ed = 0;
   private static int ee;
   private static int ef;
   private static int eg;
   private static int eh;
   private static int ei;
   private static int ej;
   private static int[] S = new int[]{376, 377, 378, 379, 380};
   private static int[] T = new int[]{521, 522, 523, 524, 525};
   private static boolean ai = false;
   private static boolean aj = true;
   private static boolean ak;
   static int d = 0;
   private static boolean al = false;
   static boolean a = false;
   static boolean b = false;
   static byte a = -1;
   private static boolean am = false;
   private static boolean an = true;
   static boolean[] a = new boolean[]{false, false, false, false};
   static int e = 0;
   private static int ek = 0;
   private static int el = 0;
   private static boolean ao = false;
   private static boolean ap = false;
   private static p k;
   public static p a = null;
   private static int em = 0;
   private static boolean aq = false;
   private static int en;
   private static int eo;
   private static int ep = 0;
   private static int eq = -1;
   private static int er = 0;
   public static int f;
   public static int g;
   private static int es;
   private static int et;
   private static int eu;
   public static int h;
   private static int ev;
   public static boolean c = false;
   private static int ew = 0;
   private static int ex;
   private static int ey;
   private static int ez;
   private static int eA;
   private static int eB;
   private static int eC;
   private static int eD;
   private static int eE;
   private static Image a = null;
   public static Graphics a = null;
   private static int eF = c.e_;
   private static int eG = c.f_;
   private static boolean ar = false;
   private static boolean as = false;
   private static int[][] k;
   private static int eH;
   private static p[] e;
   private static int[] U;
   private static int eI;
   private static int[] V;
   private static int eJ;
   private static int eK;
   private static boolean at;
   private static boolean au;
   private static Image[] a;
   public static e[] a;
   private static e[] b;
   private static boolean[] d;
   private static int[] W;
   private static int[] X;
   private static int[] Y = new int[]{1, 1, 1};
   private static int[] Z = new int[]{10, 10};
   private static boolean av = false;
   private static boolean aw = false;
   private static int[][] l = new int[][]{
      {a("/2"), 1, 0, 3},
      {a("/2"), 3, 0, 3},
      {a("/3"), 2, 0, 3},
      {a("/3"), 3, 0, 3},
      {a("/3"), 5, 0, 3},
      {a("/3"), 6, 0, 3},
      {a("/3"), 42, 0, 3},
      {a("/3"), 7, 0, 3},
      {a("/3"), 9, 0, 3},
      {a("/3"), 10, 0, 3},
      {a("/3"), 11, 0, 3},
      {a("/3"), 12, 0, 3},
      {a("/3"), 13, 0, 3},
      {a("/3"), 14, 0, 3},
      {a("/3"), 48, 0, 3},
      {a("/3"), 49, 0, 3},
      {a("/3"), 184, 0, 3},
      {a("/3"), 23, 0, 3},
      {a("/3"), 26, 0, 3},
      {a("/3"), 194, 0, 3},
      {a("/3"), 27, 0, 3},
      {a("/3"), 28, 0, 3},
      {a("/3"), 29, 0, 3},
      {a("/3"), 30, 0, 3},
      {a("/3"), 31, 0, 3},
      {a("/3"), 32, 0, 3},
      {a("/3"), 33, 0, 3},
      {a("/3"), 34, 0, 3},
      {a("/3"), 45, 0, 3},
      {a("/3"), 38, 0, 3},
      {a("/3"), 39, 0, 3},
      {a("/3"), 48, 0, 3},
      {a("/3"), 49, 0, 3},
      {a("/3"), 16, 1, 10},
      {a("/3"), 17, 1, 10},
      {a("/3"), 18, 1, 10},
      {a("/3"), 19, 1, 10},
      {a("/3"), 20, 1, 10},
      {a("/3"), 21, 1, 10},
      {a("/3"), 22, 1, 10},
      {a("/3"), 192, 0, 3},
      {a("/3"), 40, 0, 3},
      {a("/3"), 54, 0, 3},
      {a("/3"), 55, 0, 3},
      {a("/3"), 66, 0, 3},
      {a("/3"), 69, 0, 3},
      {a("/3"), 70, 0, 3},
      {a("/3"), 72, 0, 3},
      {a("/3"), 73, 0, 3},
      {a("/3"), 74, 0, 3},
      {a("/3"), 75, 0, 3},
      {a("/3"), 76, 0, 3},
      {a("/3"), 77, 0, 3},
      {a("/3"), 83, 0, 3},
      {a("/3"), 152, 0, 3},
      {a("/3"), 184, 0, 3},
      {a("/3"), 46, 0, 3}
   };
   private static int eL = -1;
   private static int[][] m;
   public static int i = 0;
   public static int j = 3;
   public static int k = 0;
   private static boolean ax = true;
   public static boolean d = true;
   public static int l = 1;
   public static int m;
   private static int eM;
   public static int n;
   public static int o;
   public static int p;
   static boolean e = true;
   public static int q;
   private static p l;
   private static p m;
   private static p n;
   private static p o;
   private static p p;
   private static int eN = -1;
   private static int eO = -1;
   private static int eP = -1;
   private static int eQ = -1;
   private static int eR = -1;
   public static p[] a = new p[6];
   public static p b;
   private static boolean ay;
   private static boolean az;
   private static boolean aA = false;
   private static boolean aB = false;
   private static boolean aC = false;
   private static boolean aD = false;
   private static boolean aE = false;
   private static int eS = 0;
   private static boolean aF = false;
   private static boolean aG = false;
   private static boolean aH = false;
   static int[][] a = new int[10][4];
   private static int[][] n = new int[10][4];
   public static r a;
   public static boolean f;
   public static boolean g;
   private static boolean aI = false;
   public static String[] a = new String[4];
   private static int[] aa = new int[4];
   private static Random a = new Random();
   public static p c;
   public static p d;
   private static p q;
   private static p r;
   public static p[] b = new p[4];
   private static int eT;
   private static int eU;
   private static int eV;
   private static boolean aJ;
   private static int[] ab = new int[27];
   private static p s;
   public static n[] a = new n[4];
   public static n a;
   public static n b;
   public static q a;
   public static r[] a = new r[4];
   private static boolean[] e = new boolean[]{true, false, true, false};
   public static int[] d = new int[]{0, 0, 0, 0};
   private static boolean aK = false;
   private static int eW = 0;
   private static int eX;
   private static int eY;
   private static int eZ;
   private static int fa;
   private static int[] ac = new int[4];
   private static boolean aL = false;
   private static boolean aM;
   private static int fb = 0;
   private static int fc = 0;
   private static p t;
   private static int fd = -1;
   public static int r = 0;
   static int s;
   private static byte[][] a;
   private static boolean aN = false;
   public static int t = 169;
   public static final int u;
   public static final int v;
   public static final int w;
   public static final int x;
   public static final int y;
   public static final int z;
   public static final int A;
   public static final int B;
   public static final int C;
   public static final int D;
   public static final int E;
   public static final int F;
   public static final int G;
   public static final int H;
   public static final int I;
   public static final int J;
   public static final int K;
   public static final int L;
   public static final int M;
   public static final int N;
   public static final int O;
   public static final int P;
   public static final int Q;
   public static final int R;
   public static final int S;
   public static final int T;
   public static final int U;
   public static final int V;
   public static final int W;
   public static final int X;
   public static final int Y;
   public static final int Z;
   public static final int aa;
   public static final int ab;
   public static final int ac;
   public static final int ad;
   public static final int ae;
   public static final int af;
   public static final int ag;
   public static final int ah;
   public static final int ai;
   public static final int aj;
   public static final int ak;
   public static final int al;
   public static final int am;
   public static final int an;
   public static final int ao;
   public static final int ap;
   public static final int aq;
   public static final int ar;
   public static final int as;
   public static final int at;
   public static final int au;
   public static final int av;
   public static final int aw;
   public static final int ax;
   public static final int ay;
   public static final int az;
   public static final int aA;
   public static final int aB;
   public static final int aC;
   public static final int aD;
   public static final int aE;
   public static final int aF;
   public static final int aG;
   public static final int aH;
   public static final int aI;
   public static final int aJ;
   public static final int aK;
   public static final int aL;
   public static final int aM;
   public static final int aN;
   public static final int aO;
   public static final int aP;
   public static final int aQ;
   public static final int aR;
   public static final int aS;
   public static final int aT;
   public static final int aU;
   public static final int aV;
   public static final int aW;
   public static final int aX;
   public static final int aY;
   public static final int aZ;
   public static final int ba;
   public static final int bb;
   public static final int bc;
   public static final int bd;
   public static final int be;
   public static final int bf;
   public static final int bg;
   public static final int bh;
   public static final int bi;
   public static final int bj;
   public static final int bk;
   public static final int bl;
   public static final int bm;
   public static final int bn;
   public static final int bo;
   public static final int bp;
   private static int fe;
   private static int ff;
   private static int fg;
   private static int fh;
   private static int fi;
   private static int fj;
   private static int fk;
   private static int fl;
   private static int fm;
   private static int fn;
   private static int fo;
   private static int fp;
   private static int fq;
   private static int fr;
   private static int fs;
   private static int ft;
   private static int fu;
   private static int fv;
   private static int fw;
   private static boolean aO;
   private static boolean aP;
   private static boolean aQ;
   private static boolean aR;
   private static boolean aS;
   private static boolean aT = true;
   private static boolean aU = true;
   private static boolean aV = true;
   private static boolean aW = true;
   private static boolean aX = false;
   private static byte[][] b = new byte[][]{
      {4, 1, 1},
      {5, 1, 1},
      {3, 1, 1},
      {1, 1, 1},
      {2, 1, 1},
      {0, 1, 1},
      {14, 0, 4},
      {16, 0, 4},
      {15, 0, 4},
      {17, 0, 2},
      {30, 0, 2},
      {23, 0, 2},
      {6, 0, 2},
      {6, 0, 2},
      {7, 0, 3},
      {9, 0, 2},
      {8, 0, 3},
      {12, 0, 4},
      {13, 0, 2},
      {13, 0, 2},
      {20, 0, 4},
      {29, 0, 3},
      {22, 0, 2},
      {24, 0, 3},
      {26, 0, 2},
      {25, 0, 2},
      {27, 0, 2},
      {18, 0, 2},
      {19, 0, 2},
      {21, 0, 2},
      {28, 0, 2},
      {11, 0, 2},
      {10, 0, 2}
   };
   private static boolean[] f = new boolean[2];
   private static int[] ad = new int[1];
   private static boolean[] g = new boolean[1];
   private static boolean aY = false;
   private static boolean aZ = false;
   private static int[][] o = new int[][]{{0, 7}, {1}, {2, 3}, {4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}};
   private static String e;
   private static String f;
   private static int[] ae = new int[10];
   private static int[] af = new int[10];
   private static String[] b = new String[10];
   private static int[] ag = new int[10];
   private static int[] ah = new int[10];
   private static int[] ai = new int[10];
   private static int fx;
   private static int fy;
   private static int fz = 0;
   private static short[][][] a = null;
   private static short[][][] b = null;
   private static byte[] a = null;
   private static byte[][] c = null;
   private static String[][] a = null;
   private static boolean[] h = null;
   private static int fA = -1;
   private static int fB = -1;
   private static int fC = 62;
   private static int fD;
   private static int fE;
   private static int[] aj = new int[4];
   private static Image b = null;
   private static int fF = -1;
   private static int[] ak;
   private static int fG = (
      ak = new int[]{
         57,
         11,
         12,
         31,
         39,
         42,
         38,
         36,
         0,
         17,
         46,
         48,
         44,
         52,
         43,
         45,
         47,
         49,
         58,
         59,
         1,
         3,
         6,
         7,
         63,
         8,
         9,
         29,
         30,
         28,
         10,
         32,
         13,
         14,
         15,
         61,
         16,
         19,
         20,
         21,
         22,
         40,
         23,
         24,
         27,
         33,
         56,
         35,
         34,
         54,
         55,
         66
      }
   ).length;
   private static boolean[] i = null;
   private static int[] al = null;
   private static int[][] p = null;
   private static int[] am = null;
   private static String[][] b = null;
   private static String[] c = new String[]{"", "", "", "", "", "", "", "", "", ""};
   private static boolean ba = false;
   private static int fH = 0;
   private static byte[][][] a;
   static int[][] b;
   static int[][][] a;
   private static int[][] q;
   private static int[] an;
   private static int[] ao;
   static int[] e;
   private static int[][] r;
   private static boolean[] j = new boolean[6];
   private static int[][] s = new int[6][5];
   private static int fI;
   static int bq;
   private static int[][] t;
   private static String[] d;
   private static String g = null;
   private static int fJ;
   private static int fK;
   private static String[] e = new String[]{
      "FINISH_INITIAL_DEAL",
      "PLAYER_TURN_START",
      "PLAYER_DEAL_CARD",
      "CLOSE_MSG",
      "CLOSE_HELP",
      "PLAYER_COLOR_SELECT_START",
      "PRESS_UNO_BUTTON",
      "PLAYER_WIN",
      "PLAYER_PLAY_CARD",
      "PLAYER_SELECT_COLOR",
      "GAME_END"
   };
   private static String[] f = new String[]{
      "FINISHED_INITIAL_DEAL",
      "PLAYER_TURN_STARTED",
      "PLAYER_DRAWN_DECK",
      "CLOSED_MSG",
      "CLOSED_HELP",
      "PLAYER_COLOR_SELECTED_STARTED",
      "PRESSED_UNO_BUTTON",
      "PLAYER_WON",
      "PLAYER_PLAYED_CARD",
      "PLAYER_SELECTED_COLOR",
      "GAME_ENDED"
   };
   private static boolean bb = false;
   private static boolean bc = false;
   private static int fL = -1;
   private static int[][] u;
   private static int[][] v;
   private static boolean bd = false;
   private static p u = null;
   private static boolean be = false;
   private static int fM = -1;
   private static int fN = 0;
   private static boolean bf = false;
   private static String h = "";
   private static String i = "";
   private static String j = "";
   private static int fO = -1;
   private static int fP = 0;
   private static int fQ = 0;
   private static int fR = 0;
   private static int fS;
   static int br = 0;
   private static int fT = 0;
   private static int[] ap = new int[]{0, 0, 0, 0, 0, 0};
   private static int fU = -1;
   private static int fV = -1;
   private static int fW = 0;
   private static int fX = 0;
   private static int fY = 0;
   private static int fZ = 0;
   private static int ga = 0;
   private static int gb = 0;
   private static int gc = -1;
   private static int gd = -1;
   private static int ge;
   private static int gf;
   private static int gg;
   private static int gh;
   private static int gi = 1;
   private static String k = "";
   private static int gj;
   static int bs = -1;
   static int bt = -1;
   static int[] f = new int[76];
   private static int[][] w = new int[][]{{0, 1, 2}, {3, 4, 5, 6}, {7}, {8}, {9}};
   private static int[][] x = new int[][]{{13, 14, 15}, {13, 14, 15, 16}, {-1}, {-1}, {-1}};
   private static int[][] y = new int[][]{{96, 84, 160}, {129, 184, 110, 153}, {177}, {182}, {183}};
   private static int[][] z = new int[][]{{3, 4, 5}, {6, -1, 7, 8}, {-1}, {-1}, {-1}};
   private static int[][] A = new int[][]{{1, 1, 2}, {1, -1, 1, 1}, {-1}, {-1}, {-1}};
   private static int[][][] b = new int[10][][];
   private static int[][] B = new int[10][];
   private static int[][] C;
   private static int[] aq = new int[2];
   private static int gk;
   private static int gl;
   private static int gm;
   private static int gn;
   private static int go;
   private static String l = "shi";
   private static String m = "del";
   private static String n = "ABC";
   private static String o = "#123";
   private static String p = "ent";
   private static String q = "hid";
   private static String[][] c;
   private static boolean bg = false;
   private static boolean bh = false;
   private static String r = null;
   private static String s = null;
   private static String t = null;
   private static int gp;
   private static int gq;
   private static int gr = -1;
   private static int gs = -1;
   private static int gt = -1;
   private static int[][] D;
   private static int[] ar = new int[3];
   private static boolean bi = false;
   private static int[] as = new int[30];
   private static int[] at = new int[30];
   private static String[] g = new String[30];
   private static int[] au = new int[30];
   private static int[] av = new int[30];
   private static int[] aw = new int[30];
   private static int[] ax = new int[30];
   private static e[] c = new e[30];
   private static int[] ay = new int[30];
   private static int gu = (c.e_ - 50) / 25;
   private static int gv = -1;
   private static int[] az = new int[]{
      11, 12, 13, 14, 15, 10, 32, 30, 28, 31, 29, 33, 18, 21, 24, 20, 19, 17, 23, 22, 39, 38, 37, 25, 26, 27, 0, 1, 2, 3, 8, 6, 7
   };
   private static int[][] E;
   private static int[][] F;
   private static int[] aA = new int[30];
   private static int gw = 0;
   private static int gx = 0;
   private static int gy = 0;
   private static int gz = 0;
   private static int gA = 0;
   private static int gB = 0;
   private static int gC = 0;
   private static int gD = 0;
   private static int gE = 0;
   private static int gF = 0;
   private static int gG = 0;
   private static int gH = 0;
   private static int gI = 0;
   private static int gJ = 0;
   private static int gK = 0;
   private static int gL = 0;
   private static int gM = 0;
   private static int gN = 0;
   private static int gO = 0;
   private static int gP = 0;
   private static int gQ = 0;
   private static int gR = 0;
   private static int gS = 0;
   private static int gT = 0;
   private static int gU = 0;
   private static int gV = 0;
   private static boolean[] k;
   private static int gW = 1;
   private static int gX = 0;
   private static int gY = 0;
   private static boolean bj = false;
   private static boolean bk = false;
   private static int[] aB = new int[]{26, 25, 39, 8};
   private static int gZ = 4;
   private static int ha = 4;
   private static boolean bl = true;
   private static int[] aC;
   private static int hb = 0;
   private static int hc = -1;
   private static int hd = -1;
   private static int he = -1;
   private static int hf = 0;
   private static int hg = j.c(1000);
   private static int hh = 0;
   private static int hi = 0;
   private static String u = "UNO_2012_WEEKLY";
   private static String v = "UNO_2012_DAILY";
   private static String w = "UNO_2012_ALLTIMES";
   private static boolean bm = false;
   private static boolean bn = false;
   private static boolean bo = false;
   private static boolean bp = false;
   private static int hj = -1;
   private static int hk = -1;
   private static int hl = -1;
   private static int hm = -1;
   private static int hn = -1;
   private static int ho = -1;
   private static int hp = -1;
   private static int hq = -1;
   private static int hr = j.c(700);
   private static int hs = -1;
   private static int ht = 0;
   private static int hu = j.c(1800);
   private static int hv = -1;
   private static int hw = 0;
   private static int hx = -1;
   private static int hy;
   private static int hz;
   private static String x;
   private static int hA;
   private static int[][] G;
   private static int[][] H = new int[][]{{0, -1, 54}, {12, 2, 56}, {11, 3, 56}, {10, 1, 56}, {1, -1, 54}, {-1, 1, 56}, {-1, 1, 56}, {-1, 1, 56}, {-1, 1, 56}};
   private static int[][] I = new int[][]{
      {-1, -1, 54}, {-1, 2, 56}, {-1, 3, 56}, {-1, 1, 56}, {-1, -1, 54}, {0, 1, 178}, {0, 1, 180}, {0, 1, 181}, {0, 1, 177}, {0, 1, 179}
   };
   private static int[][] J = new int[][]{{-1, 2, 56}, {-1, 3, 56}, {-1, 1, 56}, {-1, -1, 54}, {-1, 1, 56}};
   private static int[][] K = new int[][]{{-1, -1, 54}, {-1, 2, 56}, {-1, 3, 56}, {-1, 0, 56}, {-1, -1, 54}, {-1, -1, 54}, {-1, 3, 54}};
   private static int[][] L = new int[][]{{-1, -1, 54}, {-1, 2, 56}, {-1, 2, 56}};
   private static int[][] M = new int[][]{{-1, -1, 54}, {-1, -1, 54}, {-1, 2, 56}, {-1, -1, 54}, {-1, -1, 54}};
   private static int[][] N = new int[][]{
      {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}, {-1, -1, 54}
   };
   private static int[][] O = new int[][]{
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54},
      {-1, -1, 54}
   };
   private static long e = 0L;
   private static int hB = 0;
   private static int hC = -256;
   private static int hD = -1;
   private static int hE = -1;
   private static boolean bq = false;
   private static boolean br = false;
   private static long f = 0L;
   private static long g = 0L;
   private static int hF = -1;
   private static int hG = -1;
   private static boolean bs = false;
   private static int hH = -1;
   private static int hI = -1;
   public static int bu = -1;
   public static int bv = -1;
   public static int bw = -1;
   public static int bx = -1;
   private static int hJ = -1;
   private static int hK = -1;
   private static long h = 0L;
   private static long i = 0L;
   private static int hL = -1;
   private static int hM = -1;
   private static boolean bt = false;
   private static int[] aD = new int[4];
   private static int[][] P;
   private static int hN = -1;
   private static int hO = -1;

   a(Object var1, Object var2) {
      super(var1, null);
      j.a(false, 50, 8);
      j.a(false, 52, 10);
      j.a(false, 54, 12);
      j.a(false, 56, 14);
      j.a(false, 53, 11);
      j.a(false, 49, 7);
      j.a(false, 51, 9);
      j.a(false, 55, 13);
      j.a(false, 57, 15);
      bW = 0;
      bX = -1;
      bY = -1;
      m = false;
      n = false;
      b = 0L;
      j.b("/6");
      j.a("Loading CUTSCENES array");
      int[][] var7 = (int[][])j.a(1);
      var1 = 0;
      var2 = 0;

      for (int var3 = 0; var3 < var7.length; var3++) {
         if (var7[var3][0] == 0) {
            var1++;
            var2++;
         } else if (var7[var3][0] == 1) {
            var2--;
         }
      }

      if (var2 == 0) {
         a = new byte[var1][][];
         int var17 = 0;
         int var4 = 0;

         while (var17 != var1) {
            while (var7[var4][0] != 0) {
               var4++;
            }

            var2 = var4;
            int var5 = 0;

            while (var7[var4][0] != 1) {
               if (var7[var4][0] != -1) {
                  var5++;
               }

               var4++;
            }

            a[var17] = new byte[++var5][3];
            var5 = 0;

            for (int var15 = var2; var15 <= var4; var15++) {
               if (var7[var15][0] != -1) {
                  a[var17][var5] = new byte[var7[var15].length];

                  for (int var6 = 0; var6 < var7[var15].length; var6++) {
                     a[var17][var5][var6] = (byte)var7[var15][var6];
                  }

                  var5++;
               }
            }

            var4++;
            var17++;
         }
      }

      j.a("Loading CHARACTERS array");
      b = a(b = (int[][])j.a(0));
      j.a("Loading Tweaks array");
      fO = (r = a(r = (int[][])j.a(21)))[3][0];
      cK = r[4][0];
      cL = r[5][0];
      cM = r[7][0];
      bt = r[8][0];
      bs = r[9][0];
      g();
      j.a("Loading ARRAY_CAREERSTAGES array");
      int[][] var8;
      if ((var8 = a((int[][])j.a(2))).length != 30) {
         new StringBuffer()
            .append("loadDataArray_careerStages() - Incorrect number of entries found (found:")
            .append(var8.length)
            .append("  expected:")
            .append(30)
            .append(")");
      } else {
         a = new int[6][5][30];
         var1 = 0;

         for (int var16 = 0; var16 < 6; var16++) {
            for (int var18 = 0; var18 < 5; var18++) {
               for (int var19 = 0; var19 < 30; var19++) {
                  a[var16][var18][var19] = var8[var1][var19];
               }

               var1++;
            }
         }
      }

      j.a("Loading VENUES array");
      q = a(q = (int[][])j.a(3));
      j.a("Loading TUTORIAL_STEPS array");
      u = a(u = (int[][])j.a(4));
      j.a("Loading TUTORIAL_CARDS array");
      v = a(v = (int[][])j.a(5));
      bc();
      j.a("Loading XP array");
      D = a(D = (int[][])j.a(16));
      j.a("Loading QUICKPLAYPARAMS array");
      an = a((int[][])j.a(17))[0];
      j.a("Loading MEMORYMINIGAME array");
      if (z == null) {
         z = a((int[][])j.a(18))[0];
      }

      j.a("Loading CONNECTMINIGAME array");
      if (B == null) {
         (B = a((int[][])j.a(19))[0])[0] = 3;
         B[1] = 7;
         B[5] = 15;
         B[2] = B[2] + 20000;
         B[3] = B[3] + 20000;
         B[4] = B[4] + 20000;
      }

      j.a("Loading STACKMINIGAME array");
      if (H == null) {
         H = a((int[][])j.a(24))[0];
      }

      j.a("Loading BONUSPARAMS array");
      ao = a((int[][])j.a(20))[0];
      j.a("Loading POWERPARAMS array");
      e = a((int[][])j.a(22))[0];
      j.l();
      bG();
      aS();
      aX();
      if (t == null) {
         t = new int[15][5];
      }

      if (d == null) {
         d = new String[15];
      }

      g = null;
      fJ = 0;
      fK = 0;
      int var9 = fu;
      int var10;
      if ((var10 = i(s, var9)) >= 0) {
         j.a("cGame_Text.h:1161:Saved language found:" + var10);
         ao(var10);
      } else {
         j.a("Only one lang. detected - LANG_NUMBER:1");
         ao(0);
      }

      aW();
      if ((c = GloftUNO3.a.getAppProperty("URL-SUPPORT")) != null) {
         c = c.trim();
      }
   }

   private static void q() {
      bW = -1;
      j.j();
   }

   public final void a() {
      j.a("+++++++++++++ Pause");
      synchronized (this) {
         try {
            super.a();
            System.out.println("Check Game.Pausing...");
            bU();
            bb();
         } catch (Exception var2) {
            j.a("Exception in Game_Pause()");
            j.a(var2.toString());
            j.a("coreEngine.h:95:Exception in Game_Pause()");
         }
      }
   }

   public final void b() {
      j.a("+++++++++++++ Resume");
      synchronized (this) {
         try {
            super.b();
            bU();
            bb();
            if (o) {
               if (s.a()) {
                  s.a(false);
               }
            } else {
               new StringBuffer().append("isIGMButtonVisible() = ").append(a(0, (int)7));
               new StringBuffer().append("s_game_state = ").append(bW);
               if (a(0, (int)7) && bW != 8) {
                  k(5, 6);
               }

               if (bW == 48) {
                  if (bY == 42) {
                     c(j.b);
                  } else {
                     l(bY);
                  }
               }
            }
         } catch (Exception var2) {
            j.a("Exception in Game_Resume()");
            j.a(var2.toString());
            j.a("coreEngine.h:165:Exception in Game_Resume()");
         }
      }
   }

   private static void h(int var0, int var1) {
      if (k(var0, var1) != 100) {
         new StringBuffer()
            .append("menu_InitMenuFromMenuZone() : Elem ")
            .append(var1)
            .append(" of GUI layer ")
            .append(var0)
            .append(" is not a Menu Zone (it's of type ")
            .append(k(var0, var1))
            .append(")");
      }

      bR = var0;
      bS = var1;
      int var2 = 7;
      int var3 = var1;
      var2 = var0;
      k = a[var2][var3][7] == 1;
      bI = 0;
      bK = 0;
      bO = a(var0, var1, 3) + a(var0, var1, 6) / 2;
      bN = a(var0, var1, 2) + a(var0, var1, 5) / 2;
      if (k) {
         bP = a(var0, var1, 8);
      } else {
         bQ = a(var0, var1, 8);
      }

      bV = -1;
      short var9 = a(var0, var1, 9);
      short var5 = a(var0, var1, 10);
      var1 = bR;
      var1 = a[var1].length;
      bT = -1;
      bU = -1;
      bJ = 0;

      for (int var10 = bS + 1; var10 < var1; var10++) {
         if (k(bR, var10) == 6) {
            short var4;
            if ((var4 = a(bR, var10, 1)) == var9) {
               bT = var10;
            } else if (var4 == var5) {
               bU = var10;
            } else {
               h[bJ] = var10;
               a(bR, var10, false);
               bJ++;
            }
         }
      }
   }

   private static void i(int var0, int var1) {
      g[bI] = var0;
      i[bI] = var1;
      bI++;
   }

   private static void a(boolean var0) {
      bJ = bI < bJ ? bI : bJ;
      if (k) {
         bM = a(bR, h[0], 3);
      } else {
         bL = a(bR, h[0], 2);
      }

      var0 = k ? bM : bL;

      for (int var1 = 0; var1 < bJ; var1++) {
         if (k) {
            i(bR, h[var1], 2, bN);
            i(bR, h[var1], 3, var0);
            var0 += bP;
         } else {
            i(bR, h[var1], 2, var0);
            i(bR, h[var1], 3, bO);
            var0 += bQ;
         }

         a(bR, h[var1], true);
      }

      r();
   }

   private static boolean c() {
      return bK <= 0;
   }

   private static boolean d() {
      return bK + bJ >= bI;
   }

   private static void r() {
      int var0 = bK;

      for (int var1 = 0; var1 < bJ; var1++) {
         int var10001 = h[var1];
         int var4 = g[var0];
         int var3 = var10001;
         int var2 = bR;
         i(bR, var3, 24, var4);
         a[var2][var3] = a(a[var2][var3][24], 0);
         if ((i[var0] & 6) != 0) {
            f(bR, h[var1], true);
         } else if ((i[var0] & 1) != 0) {
            c(bR, h[var1], true);
         } else {
            f(bR, h[var1], false);
            c(bR, h[var1], false);
         }

         c(bR, h[var1], (i[var0] & 1) != 0);
         var0++;
      }

      if (bT >= 0) {
         a(bR, bT, !c());
      }

      if (bU >= 0) {
         a(bR, bU, !d());
      }
   }

   private static void k(int var0) {
      j.a("cGame_Menu.h:330:menu_processClick() - _iButtonGuiID:" + var0);
      bV = -1;
      if (var0 == bT) {
         if (!c()) {
            bK--;
            r();
         }
      } else if (var0 == bU) {
         if (!d()) {
            bK++;
            r();
         }
      } else {
         for (int var1 = bK; var1 < bK + bJ; var1++) {
            if (var0 == h[var1 - bK]) {
               j.a("cGame_Menu.h:350:Clicked item " + var1);
               bV = h[var1 - bK];
            }
         }
      }
   }

   private static int b(boolean var0) {
      if (bV == -1) {
         return -1;
      }

      var0 = a(bR, bV, 24);
      bV = -1;
      return var0;
   }

   private static void j(int var0, int var1) {
      for (int var2 = 0; var2 < bI; var2++) {
         if (g[var2] == var0) {
            g[var2] = var1;
            break;
         }
      }

      r();
   }

   private static void l(int var0) {
      l = true;
      bK();
      m(var0);
   }

   private static void m(int var0) {
      bX = var0;
      bK();
      m = true;
      n = false;
      byte var1 = 6;
      k(6, -1);
   }

   private static void n(int var0) {
      bX = 1;
      m = true;
      n = false;
      cd = var0;
   }

   private static void k(int var0, int var1) {
      bZ = var1;
      if (var0 != 5) {
         new StringBuffer().append("game_SendMessage() - Message ").append(var0).append(" expects Param1 to be -1 !!");
      }

      switch (bW) {
         case 0:
            if (var0 == 2) {
               try {
                  bJ();
                  j.a("/1", 1, 0);
                  j.d("ISO-8859-1");
                  aK();
               } catch (Exception var10) {
               }

               m(2);
            }

            return;
         case 1:
            if ((var0 = var0) == 0) {
               j.b("/3");
               t = false;
               al = false;
               if (bY != 3) {
                  c(1);
               }

               cg = 0;
               ce = 0;
               Q();
               c(false);
               ag(5);
               G();
               switch (cd) {
                  case 0:
                     H();
                     A();
                     a(71, 31, false, false);
                     a(78, 31, false, false);
                     a(67, 15, false, false);
                     a(186, 1, false, false);
                     a(25, 31, false, false);
                     a(188, 1, false, false);
                     a(69, 1, false, false);
                     a(190, 0, false, false);
                     a(189, 1, false, false);
                     int var70 = fQ == 0 ? 0 : 1 + (fQ - 1) / 3;
                     int var73 = fQ == 0 ? 0 : (fQ - 1) % 3;
                     int var56 = 52;
                     a = 80 + i(s, var56);
                     var56 = (byte)53;
                     b = i(s, var56);
                     a(a, 1 << b, true, true);
                     a(82, 255, true, true);
                     a(51, 1 << b, true, true);
                     a(var70 + 55, 1 << var73, true, true);
                     a(57 + fQ, 31, true, true);
                     a(81, 15, true, true);
                     a(70, 1, true, true);
                     a(23, 1, true, true);
                     a(187, 1, true, true);
                     a(41, 5, false, false);
                     var56 = (byte)50;
                     var1 = 79 + i(s, var56);
                     var56 = (byte)51;
                     var56 = i(s, var56);
                     a(83, 1 << var56, true, true);
                     a(52, 1 << var56, true, true);
                     a(82, 1 << var56, true, true);
                     a(191, 1, true, true);
                     a(26, 1 << var56, true, true);
                     a(194, 1, true, true);
                     a(var1, 1 << var56, true, true);
                     if (bc) {
                        a(185, 1, true, true);
                        a(16, 1, true, true);
                     }

                     E();
                     a(42, 3, true, true);
                     break;
                  case 1:
                  case 2:
                  case 4:
                  case 5:
                     H();
                     y();
                     if (cd == 4) {
                        J();
                     }
                     break;
                  case 3:
                  case 9:
                  case 11:
                  default:
                     j.a("!!!! ERROR !!! In GameState_Loading(int msg): Invalid loading type !!!!");
                     break;
                  case 6:
                     H();
                     z();
                     D();
                     break;
                  case 7:
                     H();
                     z();
                     D();
                     break;
                  case 8:
                     H();
                     z();
                     D();
                     break;
                  case 10:
                     y();
                     F();
                     I();
                     break;
                  case 12:
                     J();
                     break;
                  case 13:
                     K();
               }

               if (v) {
                  if (bY != 13) {
                     short var61 = 654;
                     b(5, 1, a(654, (int)0));
                  } else {
                     short var62 = 655;
                     b(5, 1, a(655, (int)0));
                     v = false;
                  }
               } else {
                  int var63 = j.b(0, 14);
                  b(5, 1, a(var63 + 8192, (int)4));
               }
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     g(5, 5, true);
                     cl = 1500;
               }
            }

            if (var0 == 2) {
               try {
                  if (p.b(0) && bY != 3) {
                     c(1);
                  }
               } catch (Exception var9) {
                  j.a("gamestate_loading.h:325:coud not dedicated whether the music is playing or not. Exeption " + var9.toString());
               }

               x = true;
               R();
               if (cg == 1) {
                  if (hB == 3) {
                     int var39 = 0;
                     byte var65 = 15;
                     d(15, 1, false);
                     if (cd != 0) {
                        m(cc);
                     } else {
                        if (bc) {
                           m(13);
                        } else {
                           var39 = s();
                           if (o.a == 0 || o.a == 3) {
                              aj = true;
                           } else if (c(0)) {
                              aj = true;
                           }

                           m(var39);
                        }

                        bU();
                     }
                  }
               } else {
                  switch (cd) {
                     case 0:
                        w();
                        break;
                     case 1:
                        x();
                        break;
                     case 2:
                        x();
                        break;
                     case 3:
                     case 9:
                     case 11:
                     default:
                        j.a("!!!! ERROR !!! In GameState_Loading(int msg): Invalid loading type !!!!");
                        break;
                     case 4:
                        x();
                        break;
                     case 5:
                        x();
                        break;
                     case 6:
                        w();
                        break;
                     case 7:
                        w();
                        break;
                     case 8:
                        w();
                        break;
                     case 10:
                        x();
                        break;
                     case 12:
                        x();
                        break;
                     case 13:
                        x();
                  }

                  if (ce >= cf) {
                     cg = 1;
                     byte var64 = 23;
                     b(5, 4, a(23, (int)0));
                     switch (cd) {
                        case 0:
                           cc = s();
                           break;
                        case 1:
                           cc = 4;
                           break;
                        case 2:
                        case 3:
                        case 9:
                        case 11:
                        default:
                           j.a("!!!! ERROR !!! In GameState_Loading(int msg): Invalid loading type !!!!");
                           break;
                        case 4:
                           cc = 21;
                           break;
                        case 5:
                           cc = 35;
                           break;
                        case 6:
                           cc = s();
                           break;
                        case 7:
                           cc = s();
                           break;
                        case 8:
                           cc = s();
                           break;
                        case 10:
                           j.l();
                           System.gc();
                           if (b(1) == 1) {
                              m(4);
                           } else if (e()) {
                              m(4);
                           } else {
                              m(4);
                           }
                           break;
                        case 12:
                           m(21);
                           break;
                        case 13:
                           m(35);
                     }
                  } else if (x) {
                     ce++;
                  }
               }

               i(5, 3, 6, 0 + r());
            }

            if (var0 == 3) {
               c(j.b);
               if (cg == 1) {
                  g(5, 4, (System.currentTimeMillis() & 512L) != 0L);
               }

               ai(5);
            }

            if (var0 == 4) {
               Z(3);
               aL();
               cg = 0;
               ce = 0;
               cf = 0;
               if (bX == 13 || bX == 37 || bX == 36) {
                  t = true;
               }

               j.l();
               System.gc();
            }

            return;
         case 2:
            if ((var0 = var0) == 0) {
               j.b("/3");
               ce = 0;
               cf = 26;
               a = (a = Image.createImage(eF, eG)).getGraphics();
               as = true;
               j.o();
               a(0, 1, true, true);
               m(0, 1);
               a[0].a(a, 0, 0, 0, 0, 0, 0);
               Z(0);
               m(0, 1);
            }

            if (var0 == 2) {
               if (ca > 0) {
                  ca = ca - j.a_;
               } else if (cg == 0) {
                  switch (ce) {
                     case 0:
                        ca = 0;
                        break;
                     case 1:
                        j.a("gamestate_gameloft_logo.h:80:------ Logo case 1 START");
                        a(1, 1, true, true);
                        aL();
                        j.l();
                        j.b("/8");
                        a = k.a(1);
                        j.l();
                        ca = 0;
                        break;
                     case 2:
                        bh();
                        ca = 0;
                        break;
                     case 3:
                        ca = 0;
                        break;
                     case 4:
                        ca = 0;
                        break;
                     case 5:
                        ca = 0;
                        break;
                     case 6:
                        j.l();
                        eL = a("/2");
                        K(fH);
                        ca = 0;
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 21:
                     case 22:
                     case 23:
                     case 25:
                     default:
                        break;
                     case 20:
                        aU();
                        break;
                     case 24:
                        s.a(GloftUNO3.a, j.a, c.e_, c.f_);
                        r = s.b();
                  }

                  if (ce >= cf) {
                     cg = 1;
                  } else {
                     ce++;
                  }
               } else if (b >= 2000L) {
                  m(18);
               }
            }

            if (var0 == 3) {
               j.f(0);
               j.c(0, 0, c.e_, c.f_);
               c(j.b);
            }

            if (var0 == 4) {
               ce = 0;
               cf = 0;
               cg = 0;
            }

            return;
         case 3:
            o(var0);
            return;
         case 4:
            p(var0);
            return;
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 14:
         case 16:
         case 22:
         case 25:
         case 27:
         case 33:
         case 46:
         default:
            j.a("!!!! ERROR !!! In game_SendMessage(int msg): Invalid game state (s_game_state = " + bW + ") !!!!");
            return;
         case 8:
            if ((var0 = var0) == 0) {
               u();
               X(3);
            }

            if (var0 == 1) {
               u();
               X(3);
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     l(G());
                     break;
                  case 422:
                     bj = !bj;
                     a(0, 8, bj);
                     break;
                  case 1024:
                     j.a("gamestate_menu_option.h:117:InputMsg.QUIT_GAME:");
                     q();
                     break;
                  case 1025:
                     a(0, b(138), 3, 12);
                     break;
                  case 1026:
                     v = false;
                     n(1);
                     ai = false;
                     S = false;
                     break;
                  case 1277:
                     i = "";
                     a(s, true, true, false);
                     i = b(65);
                     a(s, i);
                     bC();
                     z(23, fV);
                     z(24, fV);
                     z(25, fV);
                     a(0, b(273), 9);
                     a(4, false);
                     break;
                  case 1278:
                     m(4);
               }
            }

            if (var0 == 2) {
               aY();
            }

            if (var0 == 3) {
               c(j.b);
               ba();
               var1 = -a(6, 2, 17);
               int var55 = -a(6, 2, 13);
               b(gk, gl, var1, var55, bI - 4, 20, false);
            }

            if (var0 == 4 && bX != 44 && bX != 45) {
               w = false;
            }

            return;
         case 12:
            if ((var0 = var0) == 0) {
               c(1);
               o = true;
               if (s) {
                  s.a();
                  s = false;
               } else {
                  s.a(b(21), 0);
               }
            }

            if (var0 == 2) {
               try {
                  if (p.b(1)) {
                     c(1);
                  }
               } catch (Exception var8) {
                  j.a("gamestate_igp.h:89:coud not dedicated whether the music is playing or not. Exeption " + var8.toString());
               }

               var1 = j.c();
               byte var54 = 0;
               switch (var1) {
                  case 1:
                  case 8:
                     var54 = 21;
                     break;
                  case 2:
                  case 14:
                     var54 = 32;
                     break;
                  case 3:
                  case 10:
                     var54 = 23;
                     break;
                  case 4:
                  case 12:
                     var54 = 24;
                     break;
                  case 5:
                  case 11:
                  case 18:
                     var54 = 25;
                  case 6:
                  case 7:
                  case 9:
                  case 13:
                  case 15:
                  case 16:
                  case 17:
                  default:
                     break;
                  case 19:
                     var54 = 26;
               }

               if (s.a(var54)) {
                  j.a("gamestate_igp.h:144:return to lasdt middle layer");
                  m(G());
               }
            }

            if (var0 == 3) {
               s.a(j.b);
            }

            if (var0 == 4) {
               o = false;
               u = true;
            }

            return;
         case 13:
            q(var0);
            return;
         case 15:
            s(var0);
            return;
         case 17:
            r(var0);
            return;
         case 18:
            if ((var0 = var0) == 0) {
               b = 0L;
               String var10001 = b(130);
               int var67 = d.bz;
               String var50 = var10001;
               boolean var30 = true;
               e = b[1].a(var50, var67);
               j.a("gamestate_copyright.h:31:ddddddd:" + b(130));
            }

            if (var0 == 2 && b > 5000L) {
               m(3);
               bU();
               j.k();
            }

            if (var0 == 3) {
               j.f(0);
               j.c(0, 0, c.e_, c.f_);
               byte var51 = 0;
               byte var31 = 3;
               int var71 = c.bB;
               int var68 = c.bA;
               String var52 = e;
               boolean var32 = true;
               byte var7 = 0;
               byte var6 = 3;
               int var5 = var71;
               var71 = var68;
               String var69 = var52;
               var51 = 1;
               Graphics var33 = j.b;
               if (var7 > -1) {
                  p(var51, var7);
               }

               b[var51].b(var33, var69, var71, var5, var6);
            }

            if (var0 == 4) {
               j.b("/3");
            }

            return;
         case 19:
            t(var0);
            return;
         case 20:
            v(var0);
            return;
         case 21:
            O(var0);
            return;
         case 23:
            w(var0);
            return;
         case 24:
            if ((var0 = var0) == 0) {
               c(false);
               al(33);
               al(34);
               a(33, true, false);
               a(34, true, false);
               az(34);
               b(15, 2, b(297 + a[o.g][bq][0]));
               b(15, 4, b(296) + a[o.g][bq][17]);
               b(15, 14, e(a[o.g][bq][18]));
               b(15, 19, e(a[o.g][bq][19]));
               b(15, 20, e(a[o.g][bq][20]));
               b(15, 21, e(a[o.g][bq][21]));
               bI();
            }

            if (var0 == 1) {
               c(false);
               ak(33);
               ak(34);
               az(34);
               bI();
            }

            if (var0 == 2) {
               aY();
               ah(15);
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     j.a("gamestate_objectives.h:140:NO");
                     j.a("gamestate_objectives.h:142:Going to stage selection in venue " + fI);
                     m(21);
                     break;
                  case 5:
                     j.a("gamestate_objectives.h:93:YES");
                     if (fV >= a[o.g][bq][17]) {
                        fV = fV - a[o.g][bq][17];
                        o(fk, fV);
                        bI();
                        j.a("gamestate_objectives.h:100:Proceeding to gameplay: Venue:" + o.g + ", stage " + bq);
                        o.a(o.g, bq);
                        o.a(1);
                        if (a[o.g][bq][0] == 1) {
                           o.f = 2;
                        } else {
                           o.f = 4;
                        }

                        n(0);
                        a(16, false);
                     } else {
                        String var49 = b(269);
                        c(0, var49);
                        j.a("gamestate_objectives.h:133:NOT ENOUGH MONEY!");
                     }
               }
            }

            if (var0 == 3) {
               P(o.g);
               ai(15);
               ba();
            }

            return;
         case 26:
            if ((var0 = var0) == 0) {
               f(5, 1);
               T();
               if (f == null) {
                  f = new p();
               }

               f.a(a[188]);
               f.a(a(61, 4, 2), a(61, 4, 3) - 30);
               c(false);
               al(33);
               al(35);
               a(33, true, false);
               a(35, true, false);
               a(14, 17, false);
               az(2);
               bI();
               d(61, 15, 62);
               bj();
               U();
               if (a[0].b[44] == 0) {
                  c(61, 17, true);
                  c(61, 18, false);
               } else {
                  c(61, 17, false);
                  c(61, 18, true);
               }

               a[0].d = a(61, 4, 2);
               a[0].e = a(61, 4, 3);
               if ((b(1) == 1 || X) && !C) {
                  c(4, b(512));
                  C = true;
               }

               at(a[0].b[44]);
               int[] var41 = a[0].a(18);
               g(0, a(0, var41[0], var41[1]));
               var41 = a[0].a(17);
               g(1, a(1, var41[0], var41[1]));
               var41 = a[0].a(12);
               g(2, a(2, var41[0], var41[1]));
               var41 = a[0].a(5);
               g(3, a(3, var41[0], var41[1]));
               var41 = a[0].a(4);
               g(5, a(5, var41[0], var41[1]));
               var41 = a[0].a(3);
               g(6, a(6, var41[0], var41[1]));
               var41 = a[0].a();
               g(4, a(4, var41[0], var41[1]));
               g(7, a(7, br, 0));
               f(false);
               bi();
               int var66 = b(50);
               int var4 = b(51);
               j.a("cGame_NewShop.h:432:found theme in RMS: Theme:" + var66 + "  Color:" + var4);
               g(9, a(9, var66, var4));
               var1 = b(52);
               int var48 = b(53);
               j.a("cGame_NewShop.h:441:found deck in RMS: Theme:" + var1 + "  Color:" + var48);
               g(8, a(8, var1, var48));
               if (b(1) == 1) {
                  a(61, 7, false);
                  a(61, 8, false);
                  a(61, 9, false);
               }

               ar(1);
            }

            if (var0 == 1) {
               j.a("gamestate_newShop.h:140:SHOP light init!");
               T();
               if (f == null) {
                  f = new p();
               }

               f.a(a[188]);
               c(false);
               ak(33);
               ak(35);
               a(14, 17, false);
               az(2);
               bI();
               a[0].d = a(61, 4, 2);
               a[0].e = a(61, 4, 3);
               if (b(1) == 1) {
                  a(61, 7, false);
                  a(61, 8, false);
                  a(61, 9, false);
               }
            }

            if (var0 == 2) {
               aY();
               ah(61);
               a[0].c();
               if (c != null && c.a() > 0) {
                  c.a(j.a_);
               }
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     if (b(1) == 1) {
                        if (b(1) == 1) {
                           m(4);
                        } else if (e()) {
                           m(G());
                        } else {
                           m(G());
                        }
                     } else if (X) {
                        m(35);
                     } else {
                        l(G());
                     }
                     break;
                  case 1002:
                     bE();
                     break;
                  case 1006:
                     m(8);
                     a(16, false);
                  case 1008:
                  default:
                     break;
                  case 1503:
                  case 1504:
                  case 1505:
                  case 1506:
                  case 1507:
                  case 1508:
                  case 1509:
                  case 1510:
                  case 1511:
                  case 1512:
                  case 1513:
                  case 1514:
                  case 1515:
                  case 1516:
                  case 1517:
                  case 1518:
                  case 1519:
                  case 1520:
                  case 1521:
                  case 1522:
                  case 1523:
                  case 1524:
                  case 1525:
                  case 1526:
                  case 1527:
                  case 1528:
                  case 1529:
                  case 1530:
                  case 1531:
                  case 1532:
                  case 1533:
                  case 1534:
                  case 1535:
                  case 1536:
                  case 1537:
                  case 1538:
                  case 1539:
                  case 1540:
                  case 1541:
                  case 1542:
                  case 1543:
                  case 1544:
                  case 1545:
                  case 1546:
                  case 1547:
                  case 1548:
                  case 1549:
                  case 1550:
                  case 1551:
                  case 1552:
                  case 1553:
                  case 1554:
                  case 1555:
                  case 1556:
                  case 1557:
                  case 1558:
                  case 1559:
                  case 1560:
                  case 1561:
                  case 1562:
                  case 1563:
                  case 1564:
                  case 1565:
                  case 1566:
                  case 1567:
                  case 1568:
                  case 1569:
                  case 1570:
                  case 1571:
                  case 1572:
                  case 1573:
                  case 1574:
                  case 1575:
                  case 1576:
                  case 1577:
                  case 1578:
                     i(var1 - 1503, true);
                     a(16, false);
                     break;
                  case 1603:
                  case 1604:
                  case 1605:
                  case 1606:
                  case 1607:
                  case 1608:
                  case 1609:
                  case 1610:
                  case 1611:
                  case 1612:
                  case 1613:
                  case 1614:
                  case 1615:
                  case 1616:
                  case 1617:
                  case 1618:
                  case 1619:
                  case 1620:
                  case 1621:
                  case 1622:
                  case 1623:
                  case 1624:
                  case 1625:
                  case 1626:
                  case 1627:
                  case 1628:
                  case 1629:
                  case 1630:
                  case 1631:
                  case 1632:
                  case 1633:
                  case 1634:
                  case 1635:
                  case 1636:
                  case 1637:
                  case 1638:
                  case 1639:
                  case 1640:
                  case 1641:
                  case 1642:
                  case 1643:
                  case 1644:
                  case 1645:
                  case 1646:
                  case 1647:
                  case 1648:
                  case 1649:
                  case 1650:
                  case 1651:
                  case 1652:
                  case 1653:
                  case 1654:
                  case 1655:
                  case 1656:
                  case 1657:
                  case 1658:
                  case 1659:
                  case 1660:
                  case 1661:
                  case 1662:
                  case 1663:
                  case 1664:
                  case 1665:
                  case 1666:
                  case 1667:
                  case 1668:
                  case 1669:
                  case 1670:
                  case 1671:
                  case 1672:
                  case 1673:
                  case 1674:
                  case 1675:
                  case 1676:
                  case 1677:
                  case 1678:
                     i(var1 - 1603, false);
                     break;
                  case 1703:
                  case 1704:
                  case 1705:
                  case 1706:
                  case 1707:
                     ar(var1 - 1703);
                     a(16, false);
                     break;
                  case 1713:
                  case 1714:
                  case 1715:
                  case 1716:
                  case 1717:
                     as(var1 - 1713);
                     a(16, false);
                     break;
                  case 1723:
                     a[0].h();
                     a[0].a(1, true);
                     bj();
                     a(16, false);
               }
            }

            if (var0 == 3) {
               c(j.b);
               am(2);
               if (f != null && f.a() >= 0) {
                  if (f.a()) {
                     f.b(-1, -1);
                  } else {
                     f.c();
                     f.b(j.a_);
                  }
               }

               if (c != null && c.a() > 0) {
                  c.a(j.b, a[69], 1, 0, 0, false);
               }

               if (!f(4)) {
                  bE();
               }
            }

            if (var0 == 4) {
               X = false;
               a(14, 17, true);
               f = null;
            }

            return;
         case 28:
            return;
         case 29:
            return;
         case 30:
            return;
         case 31:
            if ((var0 = var0) == 0) {
               c(false);
               aV();
               ag(20);
               if (b(1) != 1) {
                  az(2);
               }

               al(38);
               a(38, true, false);
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     m(G());
                     break;
                  case 1052:
                     m(28);
                     break;
                  case 1053:
                     m(30);
               }

               if (var1 != 1) {
                  a(16, false);
               } else {
                  a(14, false);
               }
            }

            if (var0 == 2) {
               aY();
               aZ();
            }

            if (var0 == 3) {
               s();
               ba();
            }

            return;
         case 32:
            return;
         case 34:
            y(var0);
            return;
         case 35:
            z(var0);
            return;
         case 36:
            B(var0);
            return;
         case 37:
            C(var0);
            return;
         case 38:
            D(var0);
            return;
         case 39:
            if ((var0 = var0) == 0) {
               V();
               c(false);
               al(33);
               al(47);
               a(33, true, false);
               a(47, true, false);
               az(2);
               bI();
               U();
               a[0].d = a(35, 3, 2);
               a[0].e = a(35, 3, 3);
               a[0].a(1, true);
               bm();
               a(35, 7, false);
               a(35, 5, false);
               X(8);
            }

            if (var0 == 1) {
               j.a("gamestate_profile.h:99:PROFILE \tSTART_MESSAGE_HANDLER( StateMsg.k_enter_light )");
               V();
               c(false);
               a(33, true, false);
               a(47, true, false);
               a[0].d = a(35, 3, 2);
               a[0].e = a(35, 3, 3);
               az(2);
               bm();
               a(35, 7, false);
               a(35, 5, false);
               bI();
               X(8);
            }

            if (var0 == 2) {
               aY();
               ah(35);
               a[0].c();
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     j.a("gamestate_profile.h:201:InputMsg.NAV_BACK!");
                     l(G());
                     break;
                  case 1006:
                     m(8);
                     a(16, false);
               }
            }

            if (var0 == 3) {
               c(j.b);
               ba();
            }

            if (var0 == 4) {
               Z(15);
               aL();
               c(false);
            }

            return;
         case 40:
            return;
         case 41:
            return;
         case 42:
            T(var0);
            return;
         case 43:
            if ((var0 = var0) == 0) {
               R = false;
               Q = false;
               a(42, 3, true, true);
               a(192, 1, true, true);
               a(17 + o.g, 1, true, true);
               aL();
               (h = new p(a[192], 0, 0)).a(0, -60);
               E(0);
               a = i.a(-150, c.f_ / 2, 10, 17 + o.g, 0, false, 7, 0, 0, false, -1, -1, false, false, 1, false);
               b = i.a(c.e_ / 4, c.f_ / 2, 10, 42, 1, false, 4, 0, 0, false, -1, -1, false, false, 1, false);
               e = l.a(15, 4200, 3000, -10, 145, 1, 100, j.c(1000), j.c(1000), j.c(0), j.c(0), 0, 0, -1, -1, 0);
               (f = l.a(20, 4200, 3000, -10, 145, 1, 100, j.c(500), j.c(700), j.c(0), j.c(0), 0, 0, -1, -1, 0)).a();
               e.a();
               a(1, false);
               X(17);
            }

            if (var0 == 2) {
               h.b(j.a_);
               switch (dA) {
                  case 0:
                     if ((dB = dB + j.a_) >= 700) {
                        E(1);
                     }
                     break;
                  case 1:
                     dB = dB + j.a_;
                     int[] var2 = new int[2];
                     if (a.b < c.e_ - 130) {
                        a(-150, c.f_ / 2, c.e_ - 130, c.f_ / 2, j.c(dB) / 1000, var2);
                        if (var2[0] < c.e_ - 130) {
                           a.b = var2[0];
                           a.c = var2[1];
                           a.d = var2[0];
                           a.e = var2[1];
                        }
                     } else {
                        a.b = c.e_ - 130;
                        a.d = c.e_ - 130;
                     }

                     if (dB >= 3000) {
                        E(2);
                     }
                     break;
                  case 2:
                     if ((dB = dB + j.a_) >= 500) {
                        a.b();
                        b.b();
                        l(13);
                     }

                     int[] var3 = new int[2];
                     a(c.e_ - 130, c.f_ / 2, c.e_ + 300, c.f_ / 2, j.c(dB) / 500, var3);
                     a.b = var3[0];
                     a.c = var3[1];
                     a.d = var3[0];
                     a.e = var3[1];
               }

               i.a(4);
               i.a(7);
               e.a(j.a_);
               f.a(j.a_);
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     R = true;
               }
            }

            if (var0 == 3) {
               c(j.b);
               h.c();
               if (dA == 1) {
                  e.a(j.b, a[192], 3, 0, 0, false, b.c);
                  f.a(j.b, a[192], 3, 0, 0, false, b.c);
               }

               j.a(0, 0, c.e_, c.f_ / 2 + h.a().c(h.c()) / 2 + 15);
               i.b(7);
               if (dA == 1) {
                  i.b(4);
               }

               j.a(0, 0, c.e_, c.f_);
               if (R) {
                  a(1, b(619), c.e_ / 2, c.f_ / 8, 3, 0);
               }
            }

            if (var0 == 4) {
               Z(17 + o.g);
               Z(192);
               aL();
               i.a();
               c(1);
               a(6, false);
            }

            if (var0 == 6) {
               c(1);
            }

            return;
         case 44:
            if ((var0 = var0) == 0) {
               ai();
               c(false);
               al(49);
               a(49, true, false);
               az(2);
               if (al) {
                  b(54, 0, false);
               }

               X(5);
            }

            if (var0 == 1) {
               ai();
               c(false);
               al(49);
               a(49, true, false);
               az(2);
               if (al) {
                  b(54, 0, false);
               }

               X(5);
            }

            if (var0 == 2) {
               aY();
               ah(54);
            }

            if (var0 == 5) {
               var1 = bZ;
               switch (bZ) {
                  case 1:
                     j.a("gamestate_help.h:115:InputMsg.NAV_BACK! s_isBackToGame is " + S + " s_gameplay_paused" + ai);
                     if (S || ai) {
                        ai = false;
                     }

                     l(G());
                     S = false;
               }
            }

            if (var0 == 3) {
               c(j.b);
               ba();
            }

            if (var0 == 4 && !S) {
               Z(8);
               aL();
            }

            return;
         case 45:
            F(var0);
            return;
         case 47:
            if ((var0 = var0) == 0) {
               j.a("gamestate_cheat.h:13:gamestate ks_cheat k_enter");
               c(false);
               al(0);
               a(0, true, true);
               az(256);
               dM = c(true);
               c(false);
               U = false;
               dO = -1;
               dN = 0;
               aj();
            }

            if (var0 == 1) {
               j.a("gamestate_cheat.h:31:gamestate ks_cheat k_enter");
               c(false);
               al(0);
               a(0, true, true);
               az(256);
               dM = c(true);
               U = false;
               dO = -1;
               dN = 0;
               aj();
            }

            if (var0 == 2) {
               dM = c(true);
               aY();
               ah(57);
               b(57, 4, e(dM));
            }

            if (var0 == 3 && bk) {
               ba();
            }

            return;
         case 48:
            G(var0);
            return;
         case 49:
            H(var0);
            return;
         case 50:
            W(var0);
            return;
         case 51:
            I(var0);
            return;
         case 52:
            L(var0);
      }
   }

   final void c() {
      this = this;
      br = false;
      if (bs && System.currentTimeMillis() - e >= 200L) {
         this.pointerReleased(hH, hI);
      }

      if (bq) {
         if (hB == 0) {
            hB = 1;
         } else if (hB == 1) {
            hB = 2;
         }
      } else if (hB == 3) {
         hB = 0;
      } else if (hB != 0) {
         hB = 3;
      }

      if (bu != -1 && bv != -1) {
         hJ = bu - bw;
         hK = bv - bx;
         bw = bu;
         bx = bv;
      }

      if (n) {
         bY = bW;
         bW = bX;
         bX = -1;
         n = false;
         b = 0L;
         if (l && bW != 46) {
            l = false;
            boolean var6 = true;
            k(1, -1);
         } else {
            boolean var5 = false;
            k(0, -1);
         }

         ar = true;
         bU();
      }

      for (int var7 = 0; var7 < 1; var7++) {
         g[0] = false;
      }

      while (fJ > 0 && !f(t[0][4])) {
         o();
      }

      if (fJ > 0) {
         fK = (fK = fK + j.a_) & 65535;
      }

      if (u) {
         if (!o) {
            boolean var8 = true;
            if (f[1]) {
               boolean var9 = false;
               byte var10 = 4;
               d(4, 1, false);
            }
         }

         u = false;
      }

      byte var11 = 2;
      k(2, -1);
      b = "end update GLOT_Update";
      p.d();
      if (!m) {
         byte var12 = 3;
         k(3, -1);
      }

      if (aN) {
         aN = false;
         ab(s);
         j.a("saveLoad.h:871:RMS_SaveIfPending() - Saving...");
      }

      ar = false;
      if (gV > 0) {
         gV = 0;
         byte[] var13 = new byte[4];
         String var1;
         String var2 = (var1 = GloftUNO3.a.getAppProperty("MIDlet-Version")).substring(0, var1.indexOf(46));
         String var3 = var1.substring(var1.indexOf(46) + 1, var1.lastIndexOf(46));
         var1 = var1.substring(var1.lastIndexOf(46) + 1);
         var13[0] = 0;
         var13[1] = (byte)Integer.parseInt(var2);
         var13[2] = (byte)Integer.parseInt(var3);
         var13[3] = (byte)Integer.parseInt(var1);
         byte[] var47 = var13;
         int var14;
         byte[] var15;
         int var18 = j.a(var15 = new byte[var14 = 104 + (aA.length << 2)], 0, var47[0]);
         int var19 = j.a(var15, var18, var47[1]);
         int var20 = j.a(var15, var19, var47[2]);
         int var21 = j.a(var15, var20, var47[3]);
         int var22 = j.a(var15, var21, (int)gx);
         int var23 = j.a(var15, var22, (int)gy);
         int var24 = j.a(var15, var23, (int)gz);
         int var25 = j.a(var15, var24, (int)gA);
         int var26 = j.a(var15, var25, (int)gB);
         int var27 = j.a(var15, var26, (int)gC);
         int var28 = j.a(var15, var27, (int)gD);
         int var29 = j.a(var15, var28, (int)gE);
         int var30 = j.a(var15, var29, (int)gF);
         int var31 = j.a(var15, var30, (int)gG);
         int var32 = j.a(var15, var31, (int)gH);
         int var33 = j.a(var15, var32, (int)gI);
         int var34 = j.a(var15, var33, (int)gJ);
         int var35 = j.a(var15, var34, (int)gK);
         int var36 = j.a(var15, var35, (int)gL);
         int var37 = j.a(var15, var36, (int)gM);
         int var38 = j.a(var15, var37, (int)gN);
         int var39 = j.a(var15, var38, (int)gO);
         int var40 = j.a(var15, var39, (int)gP);
         int var41 = j.a(var15, var40, (int)gQ);
         int var42 = j.a(var15, var41, (int)gR);
         int var43 = j.a(var15, var42, (int)gS);
         int var44 = j.a(var15, var43, (int)gT);
         int var45 = j.a(var15, var44, (int)gw);
         int var46 = j.a(var15, var45, (int)gU);

         for (int var48 = 0; var48 < aA.length; var48++) {
            var46 = j.a(var15, var46, (int)aA[var48]);
         }

         var2 = "ACHIEVEMENTS";
         j.a("ACHIEVEMENTS", var15);
      }

      if (m) {
         m = false;
         n = true;
         byte var16 = 4;
         k(4, -1);
      }

      b = b + j.a_;
   }

   private static void o(int var0) {
      if (var0 == 0) {
         q = true;
         c(false);
         ag(4);
         X(1);
         cb = 0;
         p = false;
         a(3, 1, true, true);
         m(3, 1);
         Z(1);
         m(1, 1);
         Q(-1);
         A();
         a(4, 1, true, true);
         C();
         I();
         bt = false;
         bj = false;
      }

      if (var0 == 5) {
         int var1 = bZ;
         switch (bZ) {
            case 1022:
               j.a("gamestate_splash.h:91:INITIAL_SOUND_YES");
               d(1, true);
               d(0, true);
               aV = true;
               aW = true;
               byte var3 = 0;
               var3 = 4;
               d(4, 1, false);
               break;
            case 1023:
               d(1, false);
               d(0, false);
               aV = false;
               aW = false;
               p.e();
         }
      }

      if (var0 == 2) {
         aY();
         if (p) {
            if (!p() && hB == 3) {
               byte var6 = 0;
               var6 = 15;
               d(15, 1, false);
               n(10);
            }
         } else {
            int var5 = q();

            int var2;
            do {
               cb = 1 + a(cb, 195 - cb, true, 0);
               var2 = q();
            } while (cb < 195 && var2 == var5);

            if (cb >= 195) {
               p = true;
               h(4, 4, false);
               i(4, 3, 2, 2000);
               k(5, 1022);
            } else {
               i(4, 4, 6, 0 + q());
            }
         }

         aZ();
      }

      if (var0 == 3) {
         c(j.b);
         byte var8 = 4;
         j(4, 0, 0, 0);
         if (!p()) {
            if (p) {
               g(4, 1, (System.currentTimeMillis() & 512L) != 0L);
            } else {
               g(4, 1, false);
            }
         }

         am(0);
      }

      if (var0 == 4) {
         Z(3);
         aL();
      }
   }

   private static int q() {
      return cb * 41 / 195;
   }

   private static void p(int var0) {
      if (var0 == 0) {
         c(false);
         if (a[8] == null) {
            a(8, 1, true, true);
            aL();
         }

         f(1, 0);
         az(4);
         al(20);
         byte var3 = 0;
         boolean var2 = true;
         short var1 = 20;
         a(20, var2, (boolean)var3, 0);
         al(33);
         var3 = (boolean)0;
         var2 = true;
         var1 = (byte)33;
         a(33, var2, var3, 0);
         g(false);
         bc = false;

         for (int var7 = 0; var7 < 4; var7++) {
            d[var7] = 0;
            e[var7] = var7 % 2 == 0;
         }

         U();
         h(14, 2, true);
         a[0].d = a(14, 2, 2);
         a[0].e = a(14, 2, 3) + 42;
         a[0].a(1, true);
         i(14, 0, 25, -50);
         if (s.a()) {
            a(1, 13, true);
         } else {
            a(1, 13, false);
            g(1, 22, false);
            h(1, 6, false);
            h(1, 17, false);
         }

         if (!s.a()) {
            var1 = a(1, 0, 3);
            i(1, 0, 3, var1 + 25);
            var1 = a(1, 1, 3);
            i(1, 1, 3, var1 + 25);
            var1 = a(1, 2, 3);
            i(1, 2, 3, var1 + 25);
            var1 = a(1, 12, 3);
            i(1, 12, 3, var1 + 25);
            var1 = a(1, 10, 3);
            i(1, 10, 3, var1 + 25);
            var1 = a(1, 11, 3);
            i(1, 11, 3, var1 + 25);
            var1 = a(1, 15, 3);
            i(1, 15, 3, var1 + 25);
            var1 = a(1, 18, 3);
            i(1, 18, 3, var1 + 25);
            var1 = a(1, 16, 3);
            i(1, 16, 3, var1 + 25);
            var1 = a(1, 19, 3);
            i(1, 19, 3, var1 + 25);
            var1 = a(1, 20, 3);
            i(1, 20, 3, var1 + 25);
            var1 = a(1, 21, 3);
            i(1, 21, 3, var1 + 25);
         }

         if (T) {
            var1 = 198;
            String var10000 = a(198, (int)0);
            int[] var45 = g.a;
            String var21 = var10000;

            for (byte var59 = 0; var59 < var45.length - 1; var59 += 2) {
               int var10001 = var45[var59];
               int var5 = var45[var59 + 1];
               int var4 = var10001;
               String var22 = var21;
               if (var4 < var22.length()) {
                  StringBuffer var23 = new StringBuffer(var22);

                  while (var5 > 0) {
                     var23.insert(var4, ' ');
                     var5--;
                  }

                  var22 = var23.toString();
               }

               var21 = var22;
            }

            String var24 = var21;
            T = false;
            var3 = 25;
            String var46 = var24;
            boolean var25 = false;
            a(0, var46, var3, 0);
         }

         X(2);
         if (bY != 3) {
            q = false;
         }
      }

      if (var0 == 1) {
         f(1, 0);
         c(false);
         if (a[8] == null) {
            a(8, 1, true, true);
            aL();
         }

         az(4);
         ak(20);
         ak(33);
         g(false);
         j.a("gamestate_menu_main.h:373:State_light****");
         c(1, 13, false);
         h(14, 2, true);
         a[0].d = a(14, 2, 2);
         a[0].e = a(14, 2, 3) + 42;
         a[0].a(1, true);
         i(14, 0, 25, -50);
         X(2);
      }

      if (var0 == 5) {
         int var26 = bZ;
         switch (bZ) {
            case 2:
               boolean var57 = false;
               byte var42 = 16;
               d(16, 1, false);
               var42 = 25;
               a(1, a(25, (int)0), 2, 12);
               break;
            case 1000:
               if (fV < an[0]) {
                  short var38 = 575;
                  String var39 = a(575, (int)0);
                  String var55 = var39;
                  boolean var40 = false;
                  a(0, var55, -1, 0);
               } else {
                  fV = fV - an[0];
                  o(fk, fV);
                  n(0);
                  ad(s);
                  o.a(0);
                  o.b(o.i);
                  boolean var56 = false;
                  byte var41 = 16;
                  d(16, 1, false);
               }
               break;
            case 1001:
               if (!bb) {
                  short var36 = 579;
                  a(4, a(579, (int)0), 0, 4);
               } else {
                  t();
               }

               boolean var54 = false;
               byte var37 = 16;
               d(16, 1, false);
               break;
            case 1002:
               bE();
               break;
            case 1004:
               boolean var53 = false;
               byte var35 = 16;
               d(16, 1, false);
               break;
            case 1006:
               m(8);
               boolean var52 = false;
               byte var34 = 16;
               d(16, 1, false);
               break;
            case 1007:
               m(26);
               boolean var51 = false;
               byte var33 = 16;
               d(16, 1, false);
            case 1009:
            default:
               break;
            case 1010:
               m(12);
               boolean var50 = false;
               byte var32 = 16;
               d(16, 1, false);
               break;
            case 1011:
               m(39);
               boolean var49 = false;
               byte var31 = 16;
               d(16, 1, false);
               break;
            case 1012:
               boolean var47 = false;
               short var27 = 16;
               d(16, 1, false);
               if (fV < an[0]) {
                  var27 = 575;
                  String var29 = a(575, (int)0);
                  String var48 = var29;
                  boolean var30 = false;
                  a(0, var48, -1, 0);
               } else {
                  fV = fV - an[0];
                  o(fk, fV);
                  m(52);
               }
               break;
            case 1024:
               bW = -1;
               j.j();
               break;
            case 1029:
               t();
         }
      }

      if (var0 == 2) {
         a[0].c();
         aY();
         ah(1);
         aZ();
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
      }

      if (var0 == 4) {
         h(14, 2, false);
         c(false);
      }
   }

   private static void s() {
      b(j.b);
   }

   private static void t() {
      byte var0 = 4;
      if (i(s, var0) == 0) {
         W = true;
         m(49);
      } else {
         var0 = 5;
         if (i(s, var0) == 0) {
            X = true;
            m(26);
         } else {
            m(35);
         }
      }
   }

   private static void b(Graphics var0) {
      a[4].a(var0, 0, 0, 0, 0);
   }

   private static void u() {
      if (ha == 42) {
         c(1);
      }

      c(false);
      ag(6);
      ag(67);
      al(22);
      boolean var2 = false;
      boolean var1 = true;
      int var0 = 22;
      a(22, var1, var2, 0);
      d(6, 2, 67);
      var0 = (byte)67;
      s(67, a[var0].length + 14);

      for (int var4 = 1; var4 < 15; var4++) {
         f(67, 1, var4 + 1);
      }

      h(67, 0);
      c(aj, 6, 3);
      gk = aj[2] + aj[0] >> 1;
      gl = aj[3] + aj[1] >> 1;
      int var6 = (var0 = G()) == 4 || var0 == 35 || var0 == 39 || var0 == 21 || var0 == 42;
      az(2);
      i(aV ? 15 : 16, 0);
      i(aW ? 17 : 18, 0);
      i(aT ? 184 : 185, 0);
      i(d ? 123 : 124, 0);
      i(ax ? 121 : 122, 0);
      if (ha == 21 || ha == 35 || ha == 4 || ha == 42 || ha == 39) {
         i(36, 0);
      }

      i(3, 0);
      if (var6 && bY == 4 || w) {
         w = true;
         i(271, 0);
      }

      a(false);
      a(aj, 67, 1, 0, 0);
      var6 = aj[3] - aj[1];
      var6 = (bI - 1) * bP + var6 + 2 * (aj[1] - a(6, 2, 3)) - a(6, 2, 6);
      a(6, 2, 0, -var6, 0, 0);
      i(6, 2, 16, 0);
   }

   private static void v() {
      try {
         GloftUNO3.a.platformRequest(GloftUNO3.a.getAppProperty("URL-SUPPORT"));
      } catch (Exception var0) {
      }
   }

   private static void w() {
      switch (ce) {
         case 0:
            for (int var3 = 0; var3 < a.length; var3++) {
               if (a[var3] != null) {
                  a[var3] = null;
               }
            }

            cf = 5;
            ci = 5 + 195;
            cj = 0;
            break;
         case 1:
            a(0, 195, false, 1);
            j.m();
            break;
         case 2:
            int var2 = r();

            do {
               cj = 1 + a(cj, 195 - cj, true, 0);
               ch = ce + cj;
            } while (cj < 195 && r() == var2);

            if (cj < 195) {
               x = false;
            }
            break;
         case 3:
            Thread.yield();
            j.m();
            break;
         case 4:
            aj = true;
            ak = true;
            eH = -1;
            k = new int[4][];

            for (int var0 = 0; var0 < 4; var0++) {
               k[var0] = a[69].a(var0 + 20);
            }

            eI = k[0].length / 2;
            e = new p[12];

            for (int var1 = 0; var1 < 12; var1++) {
               e[var1] = new p();
               e[var1].a(a[69]);
               e[var1].b(-1, -1);
            }

            U = new int[12];
            V = new int[12];
            at = false;
            au = false;
      }

      ch = ce + cj;
   }

   private static void x() {
      switch (ce) {
         case 0:
            cf = 7;
            ci = 7 + 195;
            cj = 0;
            break;
         case 1:
            o.a = 0;
            o.b(0);
            o.a();
            a[0] = a(s);
            a[0] = a[0].trim();
            break;
         case 2:
            a(0, 195, false, 1);
            j.m();
         case 3:
         default:
            break;
         case 4:
            int var2 = r();

            do {
               cj = 1 + a(cj, 195 - cj, true, 0);
               ch = ce + cj;
            } while (cj < 195 && r() == var2);

            if (cj < 195) {
               x = false;
            }
            break;
         case 5:
            Thread.yield();
            j.m();
            if (k != null) {
               for (int var1 = 0; var1 < 4; var1++) {
                  k[var1] = null;
               }

               k = null;
               e = null;
               U = null;
               V = null;
            }

            j.m();
            break;
         case 6:
            j.m();
            if (cd == 1 || bY == 42) {
               a = new Image[2];
               j.b("/5");
               j.a("== Pack_Open PACK_IMAGE ==");
               byte[] var0 = j.a(1);
               a[1] = Image.createImage(var0, 0, var0.length);
               j.l();
            }

            Thread.yield();
      }

      ch = ce + cj;
   }

   private static void y() {
      Q(-1);
      A();
      C();
      a(28, 3, true, true);
      a(29, 3, true, true);
      a(30, 3, true, true);
      a(31, 3, true, true);
      a(32, 3, true, true);
      a(33, 3, true, true);
      a(45, 1, true, true);
      a(182, 15, false, false);
      a(183, 63, false, false);
      if (e()) {
         a(12, 15, true, true);
         a(14, 1, true, true);
      }

      a(8, 1, true, true);
      a(46, 3, true, true);
      a(53, 1, true, true);
      a(49, 1, true, true);
      a(193, 1, true, true);
      a(50, 1, true, true);
      a(16, 1, true, true);
      j.a("gamestate_loading.h:1068:loading_batchMenuSprites - FINISHED!");
   }

   private static void z() {
      a(10, 1, true, true);
      a(2, 1, true, true);
      B();
      a(37, 1, true, true);
   }

   private static void A() {
      a(10, 1, true, true);
      a(2, 1, true, true);
      B();
   }

   private static void B() {
      a(3, 1, true, true);
      a(34, 1, true, true);
      a(11, 1, true, true);
      a(38, 1, true, true);
      a(36, 1, true, true);
      a(54, 1, false, false);
      a(56, 15, false, false);
      a(188, 1, false, false);
      a(69, 1, false, false);
      a(15, 1, true, true);
      a(179, 1, false, false);
      a(180, 1, false, false);
      a(178, 1, false, false);
      a(177, 1, false, false);
      a(181, 1, false, false);
      a(48, 1, false, false);
      a(184, 7, true, true);
      a(49, 1, true, true);
      a(182, 63, true, true);
      a(183, 63, true, true);
   }

   private static void C() {
      a(4, 1, true, true);
      a(13, 1, false, false);
   }

   private static void D() {
      a(25, 31, false, false);
      a(190, 0, false, false);
      a(189, 1, false, false);
      int var0 = fQ == 0 ? 0 : 1 + (fQ - 1) / 3;
      byte var1 = 52;
      a = 80 + i(s, var1);
      var1 = 53;
      b = i(s, var1);
      a(var0 + 55, 1 << b, true, true);
      a(70, 1, true, true);
      a(23, 1, true, true);
      a(71, 31, false, false);
      if (bc) {
         a(185, 1, true, true);
         a(16, 1, true, true);
      }

      E();
   }

   private static void E() {
      a(35, 1, true, true);
      a(43, 1, true, true);
      a(42, 3, true, true);
      a(23, 1, true, true);
      byte var0 = 53;
      b = i(s, var0);
      a(51, 1 << b, true, true);
   }

   private static void F() {
      a(109, 1, false, false);
      a(110, 1, false, false);
      a(111, 1, false, false);
      a(112, 1, false, false);
      a(113, 1, false, false);
      a(114, 1, false, false);
      a(115, 1, false, false);
      a(116, 1, false, false);
      a(117, 1, false, false);
      a(118, 1, false, false);
      a(119, 1, false, false);
      a(120, 1, false, false);
      a(121, 1, false, false);
      a(122, 1, false, false);
      a(123, 1, false, false);
      a(124, 1, false, false);
      a(125, 1, false, false);
      a(126, 1, false, false);
      a(127, 1, false, false);
      a(128, 1, false, false);
      a(129, 1, false, false);
      a(130, 1, false, false);
      a(131, 1, false, false);
      a(132, 1, false, false);
      a(133, 1, false, false);
      a(134, 1, false, false);
      a(135, 1, false, false);
      a(136, 1, false, false);
      a(137, 1, false, false);
      a(138, 1, false, false);
      a(139, 1, false, false);
      a(140, 1, false, false);
      a(141, 1, false, false);
      a(142, 1, false, false);
      a(143, 1, false, false);
      a(144, 1, false, false);
      a(145, 1, false, false);
      a(146, 1, false, false);
      a(147, 1, false, false);
      a(148, 1, false, false);
      a(149, 1, false, false);
      a(150, 1, false, false);
      a(151, 1, false, false);
      a(152, 1, false, false);
      a(153, 1, false, false);
      a(154, 1, false, false);
      a(155, 1, false, false);
      a(156, 1, false, false);
      a(157, 1, false, false);
      a(158, 1, false, false);
      a(159, 1, false, false);
      a(160, 1, false, false);
      a(161, 1, false, false);
      a(162, 1, false, false);
      a(163, 1, false, false);
      a(164, 1, false, false);
      a(165, 1, false, false);
      a(166, 1, false, false);
      a(167, 1, false, false);
      a(168, 1, false, false);
      a(169, 1, false, false);
      a(170, 1, false, false);
      a(171, 1, false, false);
      a(172, 1, false, false);
      a(173, 1, false, false);
      a(174, 1, false, false);
      a(175, 1, false, false);
      a(176, 1, false, false);
      a(96, 1, false, false);
      a(97, 1, false, false);
      a(98, 1, false, false);
      a(99, 1, false, false);
      a(100, 1, false, false);
      a(101, 1, false, false);
      a(102, 1, false, false);
      a(103, 1, false, false);
      a(104, 1, false, false);
      a(105, 1, false, false);
      a(106, 1, false, false);
      a(107, 1, false, false);
      a(108, 1, false, false);
      a(84, 1, false, false);
      a(85, 1, false, false);
      a(86, 1, false, false);
      a(87, 1, false, false);
      a(88, 1, false, false);
      a(89, 1, false, false);
      a(90, 1, false, false);
      a(91, 1, false, false);
      a(92, 1, false, false);
      a(93, 1, false, false);
      a(94, 1, false, false);
      a(95, 1, false, false);
   }

   private static int r() {
      return ch * 41 / ci;
   }

   private static void G() {
      if (bY == 4) {
         ck = j.b(16, 23);
      } else {
         ck = 16 + o.g + 1;
      }

      i(5, 6, 5, ck);
      a(ck, 1, true, true);
      aL();
      Graphics var0 = j.b;
      j.b = a;

      try {
         b(j.b);
         h(5, 6, true);
         b(5, 6, 0, 0);
      } catch (Exception var2) {
         j.a("gamestate_loading.h:1910:Exception setting loading backbuffer: " + var2.toString() + "  " + var2.getMessage());
      }

      h(5, 6, false);
      j.b = var0;
   }

   private static void H() {
      for (int var0 = 0; var0 < 195; var0++) {
         Z(var0);
      }

      a(3, 1, true, true);
      a(4, 1, true, true);
      if (cd == 6 || cd == 7 || cd == 8 || cd == 4 || cd == 0 && o.a != 0 && !c(0) && !bc) {
         a(72 + o.g, 1, false, false);
      }

      F();
      I();
   }

   private static void I() {
      a(9, 2047, false, false);
      a(27, 1, false, false);
   }

   private static void J() {
      Z(28);
      Z(29);
      Z(30);
      Z(31);
      Z(32);
      Z(33);
      Z(45);

      for (int var0 = 0; var0 < 6; var0++) {
         Z(var0 + 72);
      }

      a(72 + o.g, 1, true, true);
      a(7, 15, true, true);
      a(3, 1, true, true);
   }

   private static void K() {
      for (int var0 = 0; var0 < 6; var0++) {
         Z(var0 + 72);
      }

      Z(7);
      a(28, 3, true, true);
      a(29, 3, true, true);
      a(30, 3, true, true);
      a(31, 3, true, true);
      a(32, 3, true, true);
      a(33, 3, true, true);
      a(45, 1, true, true);
      a(3, 1, true, true);
   }

   private static void q(int var0) {
      if (var0 == 0) {
         Q();
         if (o.a == 1) {
            if ((o.d = a[o.g][bq][0]) == 2) {
               o.b(2);
            } else {
               o.b(0);
            }
         } else if (o.a == 0) {
            o.b(0);
            o.d = 0;
         } else if (o.a == 3) {
            o.b(0);
            o.d = 0;
         }

         if (bc) {
            o.b(0);
            o.d = 0;
         }

         c(false);
         byte var3 = 0;
         boolean var1 = true;
         short var2 = 30;
         a(30, var1, (boolean)var3, 0);
         var3 = (boolean)0;
         var1 = true;
         var2 = (byte)31;
         a(31, var1, var3, 0);
         if (g) {
            az(192);
         } else {
            az(128);
         }

         if (m == 23) {
            var2 = 657;
            String var10001 = a(657, (int)0);
            var3 = 26;
            String var7 = var10001;
            boolean var39 = false;
            a(0, var7, var3, 0);
         }

         b(32, 2, false);
         av();
         a(32, 0, o.b());
         b(32, 0, false);
         a(32, 1, false);
         aw();
         ax();
         a = l.a(15, 200, 1500, c.e_ / 2, c.f_ / 2, 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8);
         if (o.a() == 1 && a[o.g][bq][0] == 1 && Q) {
            m(43);
         }

         if (bY == 1) {
            boolean[] var8;
            (var8 = new boolean[93])[25] = true;
            var8[67] = true;
            var8[68] = true;

            for (int var40 = 0; var40 < 4; var40++) {
               if (a[var40] != null && a[var40].a == 42) {
                  if (a[var40].b[35] > -1) {
                     var8[a[var40].b[35]] = true;
                  }

                  if (a[var40].b[37] > -1) {
                     var8[a[var40].b[37] + 96 - 84] = true;
                  }

                  var8[a[var40].b[7] + 110 - 84] = true;
                  var8[a[var40].b[11] + 129 - 84] = true;
                  var8[a[var40].b[9] + 153 - 84] = true;
                  var8[a[var40].b[25] + 160 - 84] = true;
               }
            }

            for (int var41 = 84; var41 <= 176; var41++) {
               if (!var8[var41 - 84]) {
                  Z(var41);
                  d(var41, 1);
               }
            }
         }
      }

      if (var0 == 1) {
         if (o.a == 1) {
            if ((o.d = a[o.g][bq][0]) == 2) {
               o.b(2);
            } else {
               o.b(0);
            }
         } else if (o.a == 0) {
            o.b(0);
            o.d = 0;
         } else if (o.a == 3) {
            o.b(0);
            o.d = 0;
         }

         c(false);
         ak(30);
         ak(31);
         av();
         if (g) {
            az(192);
         } else {
            az(128);
         }

         if (m == 23) {
            short var42 = 657;
            String var81 = a(657, (int)0);
            byte var66 = 26;
            String var9 = var81;
            boolean var43 = false;
            a(0, var9, var66, 0);
         }

         a = true;
         an = true;
         if (f) {
            b = true;
         }
      }

      if (var0 == 2) {
         i.a(7);
         if (!ai) {
            ao = false;
            if (el > 0) {
               if ((el = el - j.a_) <= 0) {
                  el = -1500;
                  ao = true;
               }
            } else if (el < 0 && (el = el + j.a_) >= 0) {
               el = 0;
            }

            if (eM >= 0) {
               switch (eM) {
                  case 0:
                     fa = p;
                     break;
                  case 1:
                     if (a[p].a == 0) {
                        n var46 = a[p].a;
                        if (a[p].a.a == 2 && a[p].f > 0 && !a[p].a && !o.g()) {
                        }
                     }
                  case 2:
                  case 3:
                  case 7:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 21:
                  default:
                     break;
                  case 4:
                     eU = 0;
                     if (a[p].a == 0) {
                        eT = 0;
                        h(10, 30, true);
                        int var44 = 51;
                        var44 = i(s, var44);
                        i(10, 30, 8, var44);
                        bU();
                        a(10, 26, true);
                        a(10, 27, true);
                        a(10, 28, true);
                        a(10, 29, true);
                        int var67 = !bc ? -1 : fM;

                        for (int var4 = 0; var4 < 4; var4++) {
                           boolean var10 = var67 == -1 || var4 == var67 - 1;
                           b(10, var4 + 26, var10);
                           if (!var10) {
                              i(10, var4 + 26, 13, 4);
                           }
                        }
                     } else {
                        eT = 1;
                     }

                     aJ = true;
                     e(5);
                     break;
                  case 5:
                     aH();
                     fd = 0;
                     break;
                  case 6:
                     eY = 0;
                     if (a[p].a == 0) {
                        a(10, 22, true);
                        a(10, 24, true);
                     }
                     break;
                  case 8:
                     h = 0;
                     ev = 0;
                     break;
                  case 20:
                     if (g) {
                        fc = 0;
                     } else if (d) {
                        fc = 500 + j.b(-125, 125);
                     } else {
                        fc = 1000 + j.b(-250, 250);
                     }
               }

               m = eM;
               eM = -1;
               eX = 0;
            }

            if (bc) {
               while (fL < u.length) {
                  if (bf && !f(3)) {
                     bf = true;
                     j.a("cGame_Tutorial.h:309:## Executing tutorial action SHOW_MSG");
                     boolean var70 = true;
                     boolean var13 = true;
                     byte var50 = 3;
                     a(3, var13, var70, 0);
                     g(31, 4, true);
                     b(31, 4, h);
                     break;
                  }

                  if (fN > 0) {
                     fN = fN - j.a_;
                     j.a("cGame_Tutorial.h:323:## Executing tutorial action delay");
                     j.a("cGame_Tutorial.h:324:## DELAY: " + fN);
                     break;
                  }

                  if (fN < 0) {
                     fN = 0;
                  }

                  if (u[fL][0] != 0) {
                     break;
                  }

                  byte var47 = 0;
                  switch (u[fL][1]) {
                     case 0:
                        bf = true;
                        j.a("cGame_Tutorial.h:343:## Executing tutorial action SHOW_MSG");
                        boolean var69 = true;
                        boolean var12 = true;
                        var47 = 3;
                        a(3, var12, var69, 0);
                        g(31, 4, true);
                        h = a(u[fL][2], (int)3);
                        b(31, 4, h);
                        var47 = 1;
                        break;
                     case 1:
                     case 3:
                        j.a("cGame_Tutorial.h:434:## Executing tutorial action " + u[fL][1]);
                        var47 = 1;
                        break;
                     case 2:
                        j.a("cGame_Tutorial.h:369:## Executing tutorial action HIGHLIGHT_DECK");
                        bd = true;
                        c(aj, 10, 19);
                        k(185, 0, (aj[2] + aj[0]) / 2, (aj[3] + aj[1]) / 2);
                        var47 = 1;
                        break;
                     case 4:
                        j.a("cGame_Tutorial.h:403:## Executing tutorial action FORCE_COLOR_SELECTION");
                        fM = u[fL][2];
                        a(aj, 10, 26 + fM - 1);
                        k(185, 0, a(10, 26 + fM - 1, 2) + 35, a(10, 26 + fM - 1, 3) + -35);
                        var47 = 1;
                        break;
                     case 5:
                        j.a("cGame_Tutorial.h:384:## Executing tutorial action FORCE_UNO_BUTTON_PRESS");
                        a(aj, 32, 2);
                        k(185, 0, a(32, 2, 2), a(32, 2, 3));
                        var47 = 1;
                        break;
                     case 6:
                        j.a("cGame_Tutorial.h:423:## Executing tutorial action SET_WHEEL_COLOR");
                        fM = u[fL][2];
                        var47 = 1;
                        break;
                     case 7:
                        bf = false;
                        j.a("cGame_Tutorial.h:360:## Executing tutorial action HIDE_MSG");
                        boolean var68 = true;
                        boolean var11 = false;
                        var47 = 3;
                        a(3, var11, var68, 0);
                        var47 = 1;
                        break;
                     case 8:
                        j.a("cGame_Tutorial.h:441:## Executing tutorial action DELAY");
                        fN = fN + u[fL][2] * 1000;
                        j.a("cGame_Tutorial.h:443:## DELAY: " + fN);
                        var47 = 1;
                        break;
                     default:
                        new StringBuffer().append("tutorial_Advance() - Unhandled action with ID ").append(u[fL][1]);
                  }

                  if (!var47) {
                     break;
                  }

                  fL++;
               }

               if (fL >= u.length) {
                  bg();
               }
            }

            if (!ai) {
               aJ();

               for (int var14 = 0; var14 < 4; var14++) {
                  if (a[var14].a != 2 && m != 8) {
                     a[var14].c();
                  }
               }

               label755:
               switch (m) {
                  case 0:
                     aP();
                     break;
                  case 1:
                     if (a == null) {
                        for (int var17 = 0; var17 < 4; var17++) {
                           if (a[var17].a != 2) {
                              n var54 = a[var17].a;
                              if (a[var17].a.a == 0) {
                                 a = a[var17];
                                 e(7);
                              }
                           }
                        }

                        if (o.f() && a[0].a == 2) {
                           for (int var18 = 1; var18 < 4; var18++) {
                              if (a[var18].a != 2) {
                                 a = a[var18];
                                 e(7);
                                 break;
                              }
                           }
                        }
                     }

                     b(true);
                     boolean var10000;
                     if (a != null && a.e) {
                        j.a("rules.h:2394:updateMoveCtrl() - RETURNING because: s_movePile != null && s_movePile.m_bMove");
                        var10000 = true;
                     } else if (l.a() >= 0
                        || t.a() >= 0
                        || s.a() >= 0
                        || n.a() >= 0
                        || b[0].a() >= 0
                        || b[1].a() >= 0
                        || b[2].a() >= 0
                        || b[3].a() >= 0
                        || b.a() >= 0) {
                        j.a("rules.h:2400:updateMoveCtrl() - RETURNING because: !isCardEffectOver()");
                        var10000 = true;
                     } else if (a[p].i) {
                        a[p].i = false;
                        if (o.b) {
                           a[o.d()].c = true;
                        }

                        if (f && a[o.d()].a == 0 && a == null) {
                           a(8);
                        } else if (a == null) {
                           if (f && a[o.d()].a != 0) {
                              a[o.d()] = true;
                           }

                           aO();
                           a(eZ);
                           if ((eZ == 1 || eZ == 20) && a[p].a == 0) {
                              e(1);
                           }
                        }

                        j.a("rules.h:2449:updateMoveCtrl() - RETURNING because: s_playerList[s_crtTurn].m_bPlayed");
                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     if (!var10000) {
                        if (q > 0) {
                           if (a[p].a == 0 && !a[o.e()].b && q > 2) {
                              q = 2;
                           }

                           if ((a[p].d || a[p].c) && !a[o.e()].b && q > 2) {
                              q = 2;
                           }

                           boolean var19 = false;
                           j.a("rules.h:2787:match_needCheckUNOMiss() - s_ruleSwitchChallenge:" + l + "  s_frameDelay:" + q);
                           if (l == 1 && q == 5) {
                              j.a("rules.h:2791:Check UNO 2! prev: " + o.e());
                              if (a[o.e()].b) {
                                 j.a("rules.h:2793:Check UNO 2A! prev: " + o.e());
                              }

                              if (!a[o.e()].a) {
                                 j.a("rules.h:2795:Check UNO 2B! prev: " + o.e());
                              }

                              if (a[o.e()].a.a < 2) {
                                 j.a("rules.h:2797:Check UNO 2C! prev: " + o.e());
                              }

                              if (a[0].b) {
                                 j.a("rules.h:2799:Check UNO 2D! need check uno: ");
                              }

                              if (!a[0].a) {
                                 j.a("rules.h:2801:Check UNO 2D! not prev call");
                              }

                              j.a(
                                 "rules.h:2806:PrevPlayer - ID:"
                                    + o.e()
                                    + "    m_bNeedCheckUNO:"
                                    + a[o.e()].b
                                    + "    m_bHasCallUNO:"
                                    + a[o.e()].a
                                    + "    m_cardList.getTurnStartLen():"
                                    + a[o.e()].a.b()
                              );
                              if (a[o.e()].b && !a[o.e()].a && a[o.e()].a.b() < 2 || a[0].b && !a[0].a && a[0].a.b() < 2) {
                                 var19 = true;
                              }
                           }

                           if (var19) {
                              j.a("rules.h:2623:Check UNO 3!");
                              int var55 = o.e();
                              if (a[0].b && !a[0].a && a[0].a.a() < 2) {
                                 var55 = 0;
                                 a[0].b = false;
                              }

                              j.a("rules.h:2662:Check UNO 4!");
                              j.a("rules.h:2665:Check UNO 5!");
                              j.a("rules.h:2671:Performing UNO miss");
                              if (a[var55].b == 0) {
                                 e(141, 1);
                              }

                              a(8, false);
                              af(500);
                              a[var55].a(2);
                              a[var55].d();
                              if (o.d == 2) {
                                 if (a[o.a(var55)].a() > 1) {
                                    a[var55].d(b[var55]);
                                    a[o.a(var55)].d(b[o.a(var55)]);
                                 }

                                 a[p].a(8, false);
                                 a[o.a(p)].a(8, false);
                              } else {
                                 a[var55].d(b[var55]);
                                 a[var55].a(8, false);
                              }

                              n.a(a[78]);
                              n.b(0, 1);
                              n.a(var55 + 1);
                              eP = var55 + 20;
                              h();
                              a[5] = a(n);
                              if (a[p].j) {
                                 a[p].i = true;
                              }

                              a[p].j = false;
                           }

                           if (l == 1 && !f && a[o.e()].a != 0 && a[o.e()].b && !a[o.e()].a && a[o.e()].a.a() < 2) {
                              aM = true;
                              e = true;
                           }

                           q--;
                           var10000 = true;
                        } else {
                           if (aM) {
                              aM = false;
                              e = true;
                           }

                           var10000 = false;
                        }

                        if (!var10000) {
                           if (a != null && !q()) {
                              if (f) {
                                 a(5, false);
                              } else if (o.d != 3 && o.d != 2) {
                                 if (a == a[0]) {
                                    a(5, false);
                                 } else {
                                    a(3, false);
                                 }
                              }

                              a(2);
                              as();
                              eW = 0;
                              az(0);
                              if (o.d == 3) {
                                 j.a("rules.h:3168:cRules.s_matchRound = " + o.c + " s_matchRound s_winner " + a);
                                 if (o.c == 2) {
                                    if (a == a[0]) {
                                       a(5, false);
                                       b(41, 2, b(576));
                                    } else {
                                       a(3, false);
                                       b(41, 2, b(600));
                                    }
                                 } else if (L[3 - o.c] == 0) {
                                    a(3, false);
                                    b(41, 2, b(600));
                                 } else {
                                    a(0, false);
                                    String var56 = a[L[3 - o.c]].toUpperCase();
                                    b(41, 2, var56 + b(407));
                                 }
                              } else if (o.d == 2) {
                                 if (a != a[0] && a != a[2]) {
                                    a(3, false);
                                    b(41, 2, b(578));
                                 } else {
                                    a(5, false);
                                    b(41, 2, b(577));
                                 }
                              } else if (o.a == 3 || f) {
                                 short var73 = a(41, 2, 7);
                                 b[var73].a(b(406));
                                 int var21 = e.a();
                                 String var58 = a[a(a.b)].toUpperCase();
                                 String var77 = b(406);
                                 c[0] = a(var58, var73, a(41, 2, 5) - var21);
                                 var77 = a(var77, c, '#');
                                 b(41, 2, var77);
                              } else if (a == a[0]) {
                                 b(41, 2, b(576));
                              } else {
                                 short var72 = a(41, 2, 7);
                                 b[var72].a(b(406));
                                 int var20 = e.a();
                                 String var57 = a[a.b].toUpperCase();
                                 String var75 = b(406);
                                 c[0] = a(var57, var72, a(41, 2, 5) - var20);
                                 var75 = a(var75, c, '#');
                                 b(41, 2, var75);
                              }

                              a[a(a.b)].d(b[a(a.b)]);
                              j.a(0, 0, c.e_, c.f_);
                              ap();
                              if (o.a() == 1) {
                                 if (m()) {
                                    ae(o.a(true));
                                    e(142, 1);
                                    if (o.b == a[o.g].length - 1 - 1) {
                                       f(96 + o.g, o.b + 1);
                                       f(102 + o.g, 0);
                                       ae(o.a(false));
                                       if (b(108 + o.g) == 0) {
                                          f(108 + o.g, 1);
                                       }
                                    } else {
                                       f(96 + o.g, o.b + 1);
                                       f(102 + o.g, c[0]);
                                    }
                                 } else {
                                    if (o.g != 3 && o.g != 7 && o.g != 11 && o.h + 1 > 4) {
                                       e(143, 1);
                                    }

                                    ak = true;
                                 }
                              } else if (l()) {
                                 if (t() == 0) {
                                    ae(o.a(true));
                                    e(142, 1);
                                    if (o.i != 3 && o.i != 2 && o.i == 4) {
                                    }
                                 } else {
                                    e(143, 1);
                                 }
                              }
                           } else {
                              if (a != null && q()) {
                                 e(10);
                              }

                              a[p].a(n, o);
                              a(a[p], p);
                              if (o.b() && p != 0) {
                                 a(a[0], p);
                              }
                           }
                        }
                     }
                     break;
                  case 2:
                     aE = false;
                     a(32, 0, false);
                     b(32, 0, false);
                     if ((eW = eW + j.a_) > 4000) {
                        label752: {
                           eW = 4000;
                           if (o.d == 3) {
                              if (++o.c != 3 && K[0] < 5 - o.c) {
                                 aj = true;
                                 if (o.c == 1) {
                                    o.f = 3;
                                 } else if (o.c == 2) {
                                    o.f = 2;
                                 }

                                 m(13);
                                 break label752;
                              }

                              o.f = 4;
                           } else if (o.f() && !l()) {
                              ak = true;
                           }

                           aR();
                        }

                        a(22);
                     }
                  case 3:
                  case 7:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 16:
                  case 21:
                  case 22:
                  default:
                     break;
                  case 4:
                     aM();
                     break;
                  case 5:
                     b(false);
                     if (aA) {
                        aA = false;
                        ay = false;
                        if (a[p].a == 0) {
                           if (a[p].a.a() == 1) {
                              a[p].b(a[p].a.a(0));
                           }

                           a[p].g();
                        }

                        a(1);
                     }

                     if ((fd = fd + j.a_) >= 5000 && !q()) {
                        b(32, 2, false);
                        a[p].b = true;
                        ay = false;
                        a(1);
                        e(141, 1);
                     }
                     break;
                  case 6:
                     b(false);
                     switch (eY) {
                        case 0:
                           if (a[p].a == 1) {
                              boolean var53;
                              if (a[o.e()].h) {
                                 var53 = j.b(0, 100) < r.b[a[p].n];
                              } else {
                                 var53 = j.b(0, 100) < r.a[a[p].n];
                              }

                              if (var53) {
                                 m.a(a[78]);
                                 m.b(0, 1);
                                 eO = 0 + (o - 1);
                                 h();
                                 m.a(o);
                                 e = true;
                                 eY = 1;
                                 a(7, false);
                              } else {
                                 a(1);
                              }

                              e = true;
                           } else {
                              if (aB) {
                                 aB = false;
                                 e(154, 1);
                                 m.a(a[78]);
                                 m.b(0, 1);
                                 eO = 0 + (o - 1);
                                 h();
                                 m.a(o);
                                 eY = 1;
                                 n(24, 1);
                                 a(7, false);
                              } else if (aC) {
                                 aC = false;
                                 a(12, false);
                                 a(1);
                              }

                              e = true;
                           }
                           break label755;
                        case 1:
                           if (m.a()) {
                              if (a[o.e()].h) {
                                 j.a("rules.h:2195:challenge failed");
                                 a(8, false);
                                 if (o.d == 2) {
                                    if (a[o.a(p)].a() > 1) {
                                       a[p].d(b[p]);
                                       a[o.a(p)].d(b[o.a(p)]);
                                    }

                                    a[p].a(8, false);
                                    a[o.a(p)].a(8, false);
                                 } else {
                                    a[p].d(b[p]);
                                    a[p].a(8, false);
                                 }

                                 a(b, 0);
                                 a[p].a(r);
                                 a[p].d();
                                 a[p].g = false;
                                 o.a(a[p], false);
                                 a(26, false);
                                 j.a("rules.h:2229:play sound SFX_FAIL");
                                 m.a(a[78]);
                                 m.b(0, 1);
                                 eO = 12 + (o - 1);
                                 h();
                                 m.a(o);
                                 eY = 2;
                                 if (a[o.e()].a.b() == 1) {
                                    a[p].j = true;
                                 } else {
                                    a[p].i = true;
                                    a[p].j = false;
                                 }
                              } else {
                                 j.a("rules.h:2261:challenge success");
                                 a(9, false);
                                 a(b, 1);
                                 a[o.e()].a(r);
                                 a[o.e()].d();
                                 a[p].g = false;
                                 a[p].a(n, o);
                                 o.a(a[p], false);
                                 m.a(a[78]);
                                 m.b(0, 1);
                                 eO = 4 + (o - 1);
                                 h();
                                 m.a(o);
                                 eY = 2;
                                 e(152, 1);
                              }

                              aQ();
                           }
                           break label755;
                        case 2:
                           if (m.a()) {
                              m.b(-1, -1);
                              a(1);
                           }
                        default:
                           break label755;
                     }
                  case 8:
                     aA();
                     break;
                  case 15:
                     b(false);
                     ay();
                     break;
                  case 17:
                     b(false);
                     boolean var16 = false;
                     if (q > 0) {
                        if (q == 5) {
                           a[p].a(2);
                           a[p].d();
                           a[p].d(b[p]);
                           a[p].a(8, false);
                           if (o.d == 2) {
                              a[o.a(p)].a(8, false);
                           }

                           a(8, false);
                           n.a(a[78]);
                           n.b(0, 1);
                           n.a(p + 1);
                           eP = 20 + p;
                           h();
                           var16 = true;
                        }

                        if (var16) {
                           a[p].b = false;
                           q = 0;
                           aM = false;
                           a(1);
                        }

                        q--;
                     } else {
                        var16 = true;
                        aM = false;
                        a[p].b = false;
                        a(1);
                     }

                     if (!var16) {
                        break;
                     }

                     aD = false;
                     if (b.b.a == 13 && !o.g()) {
                        a(4);
                     } else {
                        if (b.b.a == 14 && !o.g()) {
                           a(4);
                           break;
                        }

                        a(1);
                     }
                     break;
                  case 18:
                     if ((eW = eW + j.a_) > 800) {
                        eW = 800;
                        if (o.f() && !l()) {
                           ak = true;
                        }

                        aR();
                     }
                     break;
                  case 19:
                     if (ao) {
                        aF = true;
                        a(10, 23, false);
                        a(10, 25, false);
                        b(b(372), 3000);
                     }

                     a[p].a(n, o);
                     r var52 = a[p];
                     if (aG) {
                        q var71;
                        if ((var71 = var52.a.a(var52.d)).b != 0) {
                           aH();
                        }

                        if (var71.e <= 0 || var71.a || var71.e) {
                           break;
                        }

                        aG = false;
                        if (o.g()) {
                           o.c(0);
                           o.c = true;
                        }

                        o.a(var52);
                        var52.g = false;
                        o.b();
                        var52.e = var52.d;
                        q var15 = var52.a.a(var52.e);
                        a(var52, var15);
                        var52.e = -1;
                        if (ay && eM != 4) {
                           b(32, 2, true);
                           b(32, 0, false);
                           var52.b(var52.a.a(0));
                           a(5);
                        } else {
                           if (var52.d > 0) {
                              var52.b(var52.a.a(var52.d - 1));
                           } else if (var52.a.a() > 0) {
                              var52.b(var52.a.a(0));
                           } else {
                              var52.d = -1;
                           }

                           if (eM != 4) {
                              a(1);
                           }
                        }

                        var52.i = true;
                        var52.k = false;
                     } else if (aF) {
                        aF = false;
                        var52.i = true;
                        var52.k = false;
                        var52.d();
                        a(1);
                        aH();
                     }
                     break;
                  case 20:
                     r var51;
                     switch ((var51 = a[p]).a) {
                        case 1:
                           if ((fb = fb + j.a_) < fc) {
                              break;
                           }

                           fb = 0;
                        case 0:
                        case 2:
                           a(1);
                     }
               }
            }
         }

         if (a.a() > 0) {
            a.a(j.a_);
         }

         aY();
         aZ();
         R();
      }

      if (var0 == 5) {
         int var22 = bZ;
         switch (bZ) {
            case 6:
               if (!ai) {
                  ai = true;
                  S = true;
                  eu = bW;
                  m(17);
                  c(1);
                  c(0);
               }
               break;
            case 1155:
               b(32, 2, false);
               aA = true;
               break;
            case 1158:
               a(16, false);
               aE = true;
               break;
            case 1160:
               a(10, 22, false);
               a(10, 24, false);
               aC = true;
               break;
            case 1161:
               a(10, 22, false);
               a(10, 24, false);
               aB = true;
               break;
            case 1162:
               a(10, 23, false);
               a(10, 25, false);
               aF = true;
               break;
            case 1163:
               a(10, 23, false);
               a(10, 25, false);
               aG = true;
               break;
            case 1164:
               b(10, 26, false);
               eS = 1;
               break;
            case 1165:
               b(10, 27, false);
               eS = 2;
               break;
            case 1166:
               b(10, 28, false);
               eS = 3;
               break;
            case 1167:
               b(10, 29, false);
               eS = 4;
         }
      }

      if (var0 == 3) {
         if (bX == 43) {
            return;
         }

         aL = false;
         b = "start match_paint() and s_matchState == " + m;

         try {
            switch (m) {
               case 0:
               case 1:
               case 2:
               case 4:
               case 5:
               case 6:
               case 17:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
                  aD();
                  aB();
                  b = "drawMatchBg and s_matchState == " + m;
                  aE();
               case 3:
               case 7:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 16:
               default:
                  break;
               case 8:
                  aF();
                  break;
               case 15:
                  aD();
                  aB();
                  aE();
                  aC();
                  j.g(-1207959552);
                  j.e(j.b, 0, 0, c.e_, c.f_);
                  String var30;
                  if ((var30 = b(146)) == null) {
                     var30 = "";
                  }

                  if (o.k == 0) {
                     a(0, b(144) + var30, c.bA, c.bB, 3, 0);
                  } else {
                     a(0, a[o.k] + " " + b(145) + var30, c.bA, c.bB, 3, 0);
                  }
                  break;
               case 18:
                  j.g(255 * eW / 800 << 24 & 0xFF000000);
                  j.e(j.b, 0, 0, c.e_, c.f_);
            }
         } catch (Exception var5) {
            a = var5.toString() + " \n" + b;
            j.f(-16777216);
            j.c(0, 0, 600, 80);
            j.f(-1);
            short[] var23 = a(1, a, 500, 9999);
            boolean var24 = false;
            byte var25 = 3;
            byte var26 = -1;
            boolean var27 = false;
            byte var79 = 25;
            short var28 = 300;
            short[] var74 = var23;
            String var59 = a;
            boolean var29 = true;
            p(1, 0);
            b[1].a(j.b, var59, var74, 300, 25, 0, -1, 3);
            b[1].e(0);
         }

         b = "end paint Match_Paint";
         aL = true;
         ba();
         i.b(7);
         if (bm) {
            if ((hn = hn - j.a_) <= 0) {
               bN();
            }

            int var31 = a[a(0)].d + 130;
            int var60 = a[a(0)].e + -170;
            i(37, 0, 5, 2);
            i(37, 0, 6, 13);
            b(37, 1, b(hj));
            g(37, var31, var60);
         }

         if (bn) {
            if ((ho = ho - j.a_) <= 0) {
               bO();
            }

            int var32 = a[a(2)].d + -250;
            int var61 = a[a(2)].e + 20;
            i(37, 0, 5, 2);
            i(37, 0, 6, 10);
            b(37, 1, b(hk));
            g(37, var32, var61);
         }

         if (bp) {
            if ((hq = hq - j.a_) <= 0) {
               bQ();
            }

            int var33 = a[a(1)].d + 130;
            int var62 = a[a(1)].e + 100;
            i(37, 0, 5, 2);
            i(37, 0, 6, 11);
            b(37, 1, b(hm));
            g(37, var33, var62);
         }

         if (bo) {
            if ((hp = hp - j.a_) <= 0) {
               bP();
            }

            int var34 = a[a(3)].d + -200;
            int var63 = a[a(3)].e;
            i(37, 0, 5, 2);
            i(37, 0, 6, 10);
            b(37, 1, b(hl));
            g(37, var34, var63);
         }

         if (a.a() > 0) {
            a.a(j.b, a[69], 1, 0, 0, false);
         }

         if (m == 2) {
            int var35 = eW - 3000;
            ai(41);
            if (var35 >= 0) {
               j.g(var35 * 255 / 1000 << 24 & 0xFF000000);
               j.e(j.b, 0, 0, c.e_, c.f_);
            }
         }

         S();
      }

      if (var0 == 4) {
         if (bX != 17 && bX != 13 && bX != 43 && bX != 47) {
            int var36 = fQ == 0 ? 0 : 1 + (fQ - 1) / 3;
            Z(25);
            Z(190);
            Z(189);
            Z(51);
            Z(a);
            Z(52);
            Z(82);
            Z(54);
            Z(var36 + 55);
            Z(56);
            Z(57 + fQ);
            Z(81);
            Z(26);
            Z(194);
            Z(70);
            Z(83);
            Z(71);
            Z(78);
            Z(41);
            Z(67);
            Z(186);
            Z(187);
            Z(79);
            Z(185);
            Z(16);
         }

         j.a(0, 0, c.e_, c.f_);
         i.a();
         aL = false;
      }

      if (var0 == 6) {
         aL = false;
      }
   }

   static int a(int var0) {
      for (int var1 = 0; var1 < 4; var1++) {
         if (a[var1].b == var0) {
            return var1;
         }
      }

      return 0;
   }

   private static void r(int var0) {
      if (var0 == 0) {
         L();
         X(10);
         aL = false;
      }

      if (var0 == 1) {
         L();
         X(10);
      }

      if (var0 == 5) {
         int var1 = bZ;
         switch (bZ) {
            case 422:
               bj = !bj;
               a(0, 8, bj);
               break;
            case 1024:
               j.a("gamestate_ingame_menu.h:86:InputMsg.QUIT_GAME:");
               bW = -1;
               j.j();
               break;
            case 1025:
               short var22 = 138;
               a(0, a(138, (int)0), 3, 12);
               break;
            case 1026:
               v = false;
               n(1);
               ai = false;
               S = false;
               break;
            case 1279:
               label132: {
                  j.a("gamestate_ingame_menu.h:92: InputMsg.RESTART_GAME");
                  switch (o.d) {
                     case 6:
                        J = false;
                        G = false;
                        al = true;
                        y[0] = 0;
                        y[1] = 0;
                        da = z[2 + o.e];
                        db = 0;
                        var1 = 2;
                        int var13 = 4;
                        int var19 = o.g * 5 + bq;
                        var19 = fj + var19;
                        if (i(s, var19) > 0 || o.g != 0) {
                           var1 = z[0];
                           var13 = z[1];
                        }

                        var1 *= var13;
                        ab();

                        for (int var14 = 0; var14 < var1; var14++) {
                           x(var14, 8);
                        }

                        da = z[2 + o.e];
                        db = 0;
                        F = false;
                        aa();

                        do {
                           var13 = j.b(0, var1);
                           var19 = j.b(0, var1);
                        } while (var13 == var19 || b(var13, var19));

                        k(5, var13 + 1188);
                        x(var13, 2);
                        k(5, var19 + 1188);
                        x(var19, 2);
                        a[0].a(1, true);
                        break;
                     case 7:
                        int var12 = 0;

                        for (int var7 = 0; var7 < de; var7++) {
                           for (int var18 = 0; var18 < df; var18++) {
                              a(var12, var7, var18, -1, -1);
                              var12++;
                           }
                        }

                        bi = false;
                        br();
                        bB();
                        by();
                        i.c(7);
                        L = false;
                        di = B[2 + o.e];
                        dj = 0;
                        dg = 0;
                        az();
                        K = false;
                        break label132;
                     case 11:
                        M = false;
                        N = false;
                        ae();
                        ad();
                        dv = 0;
                        dw = 0;
                        dx = 0;
                        dy = 0;
                        du = 0;
                        break;
                     default:
                        if (m == 23) {
                           m = 1;
                           boolean var4 = true;

                           while (var4) {
                              var4 = o();
                           }
                        }

                        h(10, 30, false);
                        a(10, 28, false);
                        a(10, 29, false);
                        a(10, 26, false);
                        a(10, 27, false);
                        a(10, 22, false);
                        a(10, 23, false);
                        a(10, 24, false);
                        a(10, 25, false);

                        for (int var2 = 0; var2 < a.length; var2++) {
                           if (a[var2] != null) {
                              a[var2].d(b[var2]);
                           }
                        }

                        if (o.d == 3) {
                           o.f = 4;
                           aj = true;
                           o.d = 3;
                           o.c = 0;
                           av();
                           aw();
                           ax();
                           o.a(o.g, bq);

                           for (int var11 = 0; var11 < 4; var11++) {
                              b(10, var11 + 13, a(a[var11 + 0], a(10, 13, 7), a(10, 13, 5)));
                           }

                           m(eu);
                           c(0);
                           if (aL) {
                              boolean var6 = false;
                              byte var17 = 6;
                              d(6, 1, false);
                           }
                           break label132;
                        }

                        aj = true;
                        av();
                        aw();
                        if (o.a == 3) {
                           aI();
                           g(10, 31, false);
                           h = 0;
                           ev = 0;
                        }

                        c(0);
                        if (aL) {
                           boolean var10001 = true;
                           boolean var5 = false;
                           byte var3 = 6;
                           d(6, 1, false);
                        }
                  }

                  az();
               }
            case 1:
               az();
               S = false;
         }
      }

      if (var0 == 2) {
         aY();
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
         int var10 = -a(7, 3, 17);
         int var16 = -a(7, 3, 13);
         b(gk, gl, var10, var16, bI - 4, 20, false);
      }
   }

   private static void L() {
      c(1);
      c(false);
      ag(7);
      ag(67);
      al(23);
      boolean var2 = false;
      boolean var1 = true;
      int var0 = 23;
      a(23, var1, var2, 0);
      d(7, 3, 67);
      var0 = (byte)67;
      s(67, a[var0].length + 14);

      for (int var4 = 1; var4 < 15; var4++) {
         f(67, 1, var4 + 1);
      }

      h(67, 0);
      c(aj, 7, 4);
      gk = aj[2] + aj[0] >> 1;
      gl = aj[3] + aj[1] >> 1;
      if (c != null && !c.trim().equals("0")) {
         i(620, 0);
      }

      i(58, 0);
      i(59, 0);
      if (!g) {
         i(574, bc ? 1 : 0);
      }

      i(2, 0);
      i(37, 0);
      a(false);
      a(aj, 67, 1, 0, 0);
      var0 = aj[3] - aj[1];
      var0 = (bI - 1) * bP + var0 + 2 * (aj[1] - a(7, 3, 3)) - a(7, 3, 6);
      a(7, 3, 0, -var0, 0, 0);
      i(7, 3, 16, 0);
   }

   private static void s(int var0) {
      if (var0 == 0) {
         c(false);
         int var2 = 0;
         byte var1 = 2;
         d(2, 1, false);
         al(21);
         boolean var3 = false;
         var2 = (boolean)1;
         var1 = 21;
         a(21, var2, var3, 0);
         az(0);
         if (o.c()) {
            dS = 2;
         } else {
            o.d();
            dS = 3;
         }

         if (dS > 3) {
            dS = 3;
         }

         j.a("gamestate_debriefing.h:153:debriefing_iNumPlayers:" + dS);
         if (dS == 2) {
            var2 = 19;
         } else {
            var2 = 4;
         }

         for (int var6 = 0; var6 < dS; var6++) {
            i var15 = a[L[var6]];
            j.a("gamestate_debriefing.h:169:Position " + var6 + " -   iPlayerFirstGUIElem:" + var2 + "s_resultorder:" + L[var6]);
            g(3, var2 + 2, true);
            h(3, var2 + 1, true);
            c(aj, 3, var2 + 4);
            if (a[L[var6]].a != 2) {
               String var4 = a(a[L[var6]], a(3, var2 + 3, 7), a(3, var2 + 3, 5));
               j.a("gamestate_debriefing.h:185:playerFakeName = " + var4);
               b(3, var2 + 3, var4);
               g(3, var2 + 3, true);
               a[L[var6]].d = (aj[2] + aj[0]) / 2;
               if (var6 == 0) {
                  a[L[var6]].e = (aj[3] + aj[1]) / 2 + 20;
               } else {
                  a[L[var6]].e = (aj[3] + aj[1]) / 2;
               }

               if (var6 == 0) {
                  var15.d(var15.a[13]);
                  var15.a(13, true);
               } else {
                  var15.d(var15.a[6]);
                  var15.a(6, true);
               }

               if (var6 < 2) {
                  var15.a(false);
               } else {
                  var15.a(true);
               }
            }

            var2 += 5;
         }

         (h = l.a(15, 20000, 2000, c.bA - 300, c.bB - 150, 600, 300, -j.c(1), j.c(1), -j.c(1), j.c(1), 0, 0, -1, -1, 8)).a();
         b = 0L;
         X(16);
      }

      if (var0 == 2) {
         aY();

         for (int var7 = 0; var7 < dS; var7++) {
            if (a[L[var7]].a != 2) {
               a[L[var7]].c();
            }
         }

         l var8 = h;
         if (h.a > 0) {
            h.a(j.a_);
         }

         if (b > 2000L) {
            g(3, 3, b % 800L >= 300L);
         }

         if (b > 2000L && c(0, 0, c.e_, c.f_)) {
            c(1);
            boolean var13 = false;
            byte var9 = 15;
            d(15, 1, false);
            if (o.a == 3) {
               n(1);
            } else {
               m(42);
            }
         }
      }

      if (var0 == 3) {
         c(j.b);
         byte var10;
         if (dS == 2) {
            var10 = 19;
         } else {
            var10 = 4;
         }

         for (int var14 = 0; var14 < dS; var14++) {
            h(3, var10, true);
            e(3, var10, 0, 0);
            h(3, var10, false);
            if (a[L[var14]].a != 2) {
               j.a(0, 0, c.e_, a[L[var14]].e + 30);
               a[L[var14]].d();
               j.a(0, 0, c.e_, c.f_);
            }

            var10 += 5;
         }

         am(0);
      }

      if (var0 == 4) {
         c(false);
      }
   }

   private static void t(int var0) {
      if (var0 == 0) {
         Q();
         ak = true;
         cn = 0;
         d = "";
         co = -1;
         cp = -1;
         ct = 0;
         cs = -1;
         if (cr == 0) {
            cq = q[o.g][1 + (bq >> 1)];
         } else if (cr == 1) {
            cq = q[o.g][4];
         }

         for (int var1 = 0; var1 < 4; var1++) {
            j[var1] = a(26, 0, 2);
            k[var1] = 0;
            l[var1] = 0;
            m[var1] = 0;
            n[var1] = 0;
            b[var1] = true;
         }

         cG = a(26, 0, 3);
         cx = a(26, 1, 6);
         cy = a(26, 1, 2);
         cz = a(26, 1, 3);
         cA = a[2].c(15);
         cB = a[2].b(15);
         cC = a(26, 2, 2);
         cD = a(26, 2, 3);
         cE = a(26, 2, 5);
         cF = a(26, 2, 6);
         P();
         Q(o.g);
         Graphics var4 = j.b;
         j.b = a;

         try {
            int var2 = o.g;
            a(o.g, j.b);
         } catch (Exception var3) {
            j.a("gamestate_cutscene.h:203:Exception setting loading backbuffer: " + var3.toString() + "  " + var3.getMessage());
         }

         j.b = var4;
         Q(-1);
         M();
         c(false);
         az(8);
         aY = true;
      }

      if (var0 == 1) {
         ak = true;
         cn = 0;
         d = "";
         co = -1;
         cp = -1;
         ct = 0;
         cs = -1;
         cq = q[o.g][1 + (bq >> 1)];

         for (int var5 = 0; var5 < 4; var5++) {
            j[var5] = a(26, 0, 2);
            k[var5] = 0;
            l[var5] = 0;
            m[var5] = 0;
            n[var5] = 0;
            b[var5] = true;
         }

         cG = a(26, 0, 3);
         cx = a(26, 1, 6);
         cx = a(26, 1, 6);
         cy = a(26, 1, 2);
         cz = a(26, 1, 3);
         cA = a[2].c(15);
         cB = a[2].b(15);
         cC = a(26, 2, 2);
         cD = a(26, 2, 3);
         cE = a(26, 2, 5);
         cF = a(26, 2, 6);
         P();
         M();
         c(false);
      }

      if (var0 == 6) {
         c(1);
      }

      if (var0 == 5) {
         int var6 = bZ;
         switch (bZ) {
            case 1:
               cl = 1500;
               break;
            case 3:
               if (cr == 0) {
                  au();
                  O();
               } else {
                  N();
               }
         }
      }

      if (var0 == 2) {
         aY();
         if ((ct = ct + j.a_) > cu) {
            boolean var7 = c(cy - cB / 2, cz - cA / 2, cB, cA);
            ct = cu;
            if (j.a(11) || j.a(5) || a[cq][cn][0] != 9 || var7) {
               if (y) {
                  if (var7) {
                     var7 = false;
                     byte var12 = 16;
                     d(16, 1, false);
                  }

                  cn++;
                  ct = 0;
                  if (cn >= a[cq].length) {
                     cn = a[cq].length - 1;
                     if (cr == 0) {
                        au();
                        O();
                     } else {
                        N();
                     }
                  } else {
                     M();
                  }
               } else {
                  ct = 0;
                  cu = 400;
                  if (d != "") {
                     cw = d.length();
                  } else {
                     cw = 0;
                  }

                  y = true;
                  cv = 0;
               }
            }
         }

         ar = true;
         if (!y) {
            cw = (cv = cv + j.a_) * 120 / 1000;
            if (d != "") {
               if (cw >= d.length()) {
                  cw = d.length();
                  y = true;
                  cv = 0;
                  if (co != -1) {
                  }
               }
            } else {
               cw = 0;
               y = true;
            }
         }

         for (int var9 = 0; var9 < 4; var9++) {
            switch (m[var9]) {
               case 0:
               case 2:
               default:
                  break;
               case 1:
                  n[var9] = n[var9] + j.a_;
                  if (b[var9]) {
                     l[var9] = c.e_ - (c.e_ - j[var9]) * n[var9] / 400;
                     if (l[var9] <= j[var9]) {
                        l[var9] = j[var9];
                        m[var9] = 2;
                     }
                  } else {
                     l[var9] = j[var9] * n[var9] / 400;
                     if (l[var9] >= j[var9]) {
                        l[var9] = j[var9];
                        m[var9] = 2;
                     }
                  }
                  break;
               case 3:
                  n[var9] = n[var9] + j.a_;
                  if (b[cp]) {
                     l[var9] = j[var9] + (c.e_ - j[var9]) * n[var9] / 400;
                     if (l[var9] >= c.e_) {
                        l[var9] = c.e_;
                        m[var9] = 0;
                     } else {
                        a[var9].c();
                     }
                  } else {
                     l[var9] = j[var9] - j[var9] * n[var9] / 400;
                     if (l[var9] <= 0) {
                        l[var9] = 0;
                        m[var9] = 0;
                     } else {
                        a[var9].c();
                     }
                  }
            }
         }

         if (cw == d.length() && cw > 0 && d != "") {
            if (e == null) {
               (e = new p()).a(a[2]);
               e.b(0, -1);
               e.a(a(26, 4, 2), a(26, 4, 3));
            }

            if (e != null) {
               e.b(j.a_);
            }
         }

         R();
      }

      if (var0 == 3) {
         c(j.b);
         if (!ar) {
            j.a(220, 436, 360, 28);
            b(j.b);
            j.a(0, 0, c.e_, c.f_);
         }

         for (int var10 = 3; var10 > 0; var10--) {
            for (int var13 = 0; var13 < 4; var13++) {
               if (k[var13] == var10) {
                  switch (m[var13]) {
                     case 0:
                     default:
                        break;
                     case 1:
                        a[17 + o.g].a(j.b, 0, l[var13], cG, 0);
                        break;
                     case 2:
                        a[17 + o.g].a(j.b, 0, j[var13], cG, 0);
                        break;
                     case 3:
                        a[17 + o.g].a(j.b, 0, l[var13], cG, 0);
                  }
               }
            }
         }

         if (cw > 0 && d != "") {
            a[2].a(j.b, cx, cy, cz, 0);
            short[] var11 = a(1, d, cE, cF);
            a(1, d, var11, cC, cD + (cF >> 1), 0, -1, 2, cw, 0);
         }

         am(0);
         if (cw == d.length() && e != null) {
            e.c();
         }

         S();
      }

      if (var0 == 4) {
         c(false);
         Z(17 + o.g);
         if (o.i != 6 && o.i != 7 && o.i != 11) {
            Z(72 + o.g);
         }

         aL();
         aY = false;
      }
   }

   private static void u(int var0) {
      cr = var0;
      m(19);
   }

   private static void M() {
      j.a("gamestate_cutscene.h:778:cutscene_EnterState() - s_cutscene_id:" + cq + "   s_cutscene_state:" + cn);
      byte var0 = a[cq][cn][0];
      byte var1 = a[cq][cn][1];
      byte var2 = a[cq][cn][2];
      switch (var0) {
         case 0:
            cu = 400;
            d = "";
            return;
         case 1:
            cu = 400;
            d = "";
            if (cr == 0) {
               au();
               O();
               return;
            } else {
               N();
            }
         default:
            return;
         case 2:
            cu = 0;
            d = "";
            return;
         case 3:
            cu = 400;
            d = "";
            return;
         case 4:
            if (var1 != -1) {
               new StringBuffer().append("Anim (").append(var1).append(", ").append(var2).append(")");
               a[var1].d(var2);
            }

            cu = 0;
            d = "";
            return;
         case 5:
            cu = 0;
            d = "";
            cs = o.g;
            return;
         case 6:
            cu = 0;
            d = "";
            return;
         case 7:
            k[var1] = var2;
            cu = 0;
            d = "";
            return;
         case 8:
            if (var2 == 1) {
               if (m[var1] != 2) {
                  m[var1] = 1;
                  n[var1] = 0;
               }
            } else if (m[var1] != 0) {
               m[var1] = 3;
               n[var1] = 0;
            }

            cu = 400;
            d = "";
            return;
         case 9:
            byte var10001 = -1;
            d = "";
            if (a[cq][cn][1] != co) {
               if (co != -1) {
                  cp = co;
               }

               co = a[cq][cn][1];
            }

            d = d + a(var2, 2);
            cu = 400;
            y = false;
            return;
         case 10:
            cu = var2 * 1000;
            d = "";
      }
   }

   private static void N() {
      O();
      bU();
      aj = true;
      if (cr == 1) {
         if (o.g == 5) {
            m(34);
         } else {
            n(5);
         }
      } else {
         m(s());
      }
   }

   private static int s() {
      if (o.i == 6) {
         return 36;
      } else if (o.i == 7) {
         return 37;
      } else {
         return o.i == 11 ? 38 : 13;
      }
   }

   private static boolean c(int var0) {
      int var1 = fg;
      var1 = i(s, var1);
      if (var0 == 1) {
         return (var1 & 1 << (o.g << 2) + 3) > 0;
      } else if (bq <= 1) {
         return (var1 & 1 << (o.g << 2)) > 0;
      } else {
         return bq <= 3 ? (var1 & 1 << (o.g << 2) + 1) > 0 : (var1 & 1 << (o.g << 2) + 2) > 0;
      }
   }

   private static void O() {
      int var0 = fg;
      var0 = i(s, var0);
      if (cr == 1) {
         var0 |= 1 << (o.g << 2) + 3;
      } else if (bq <= 1) {
         var0 |= 1 << (o.g << 2);
      } else if (bq <= 3) {
         var0 |= 1 << (o.g << 2) + 1;
      } else {
         var0 |= 1 << (o.g << 2) + 2;
      }

      o(fg, var0);
   }

   private static void P() {
      a(17 + o.g, 1, true, true);
      aL();
   }

   private static void Q() {
      cl = 0;
      cH = a(26, 5, 2) + a(26, 5, 5) / 2;
      cI = a(26, 5, 3);
   }

   private static void R() {
      if (cl > 1 && (cl = cl - j.a_) <= 0) {
         cl = 0;
      }
   }

   private static void S() {
      if (cl > 1) {
         j.a("gamestate_cutscene.h:1144:s_cantGoBackRecX" + cH);
         short var0 = 619;
         a(1, a(619, (int)0), cH, cI, 3, 0);
      }
   }

   private static void v(int var0) {
      if (var0 == 0) {
         bd();
         fI = -1;
         c(false);
         az(2);
         al(25);
         boolean var3 = false;
         boolean var1 = true;
         byte var2 = 25;
         a(25, var1, var3, 0);
         cJ = y();

         for (int var4 = 0; var4 < 6; var4++) {
            if (q[var4][0] <= cJ) {
               a(8, var4 + 8, true);
            } else {
               a(8, var4 + 8, false);
            }
         }
      }

      if (var0 == 5) {
         int var5 = bZ;
         switch (bZ) {
            case 1:
               m(G());
               break;
            case 1112:
               j.a("gamestate_venue_select.h:130:Going to stage selection in venue " + fI);
               o.g = fI;
               m(21);
               boolean var9 = false;
               byte var12 = 16;
               d(16, 1, false);
               break;
            case 1113:
            case 1114:
            case 1115:
            case 1116:
            case 1117:
            case 1118:
               if ((var5 = var5 - 1113) == fI) {
                  if (h(fI)) {
                     j.a("gamestate_venue_select.h:92:Going to stage selection in venue " + fI);
                     o.g = fI;
                     m(21);
                  }
               } else {
                  fI = var5;
                  j.a("gamestate_venue_select.h:110:Venue " + fI + " selected");
                  var5 = fI;
                  fI = fI;
                  h(8, 2, true);
                  g(8, 6, true);
                  int var10;
                  b(8, 6, a(var10 = var5 + 204, (int)0));
                  g(8, 5, true);
                  b(8, 5, e(n(var5)) + "/" + e(15));
                  a(8, 14, true);
                  g(8, 7, false);
               }

               boolean var8 = false;
               byte var11 = 16;
               d(16, 1, false);
         }
      }

      if (var0 == 2) {
         aY();
         aZ();
      }

      if (var0 == 3) {
         am(0);
      }

      if (var0 == 4) {
         c(false);
      }
   }

   private static void w(int var0) {
      if (var0 == 0) {
         B = false;
         a = new l[2];
         cO = bY;
         z = false;
         A = false;

         for (int var1 = 0; var1 < c.length; var1++) {
            c[var1] = true;
         }

         c(false);
         if (cO == 25) {
            byte var3 = 1;
            if (i(s, var3) != 1) {
               az(2);
            }
         }

         al(32);
         boolean var7 = false;
         boolean var4 = true;
         byte var18 = 32;
         a(32, var4, var7, 0);

         for (int var8 = 0; var8 < 3; var8++) {
            var18 = 1;
            if (i(s, var18) == 1) {
               u[var8] = r[6][0];
            } else {
               u[var8] = j.b(cK, cL) * cM;
            }
         }

         b(13, 8, e(u[0]));
         b(13, 4, e(u[1]));
         b(13, 12, e(u[2]));
         b(o, 13, 9);
         b(p, 13, 5);
         b(q, 13, 13);
         b(r, 13, 9);
         b(s, 13, 5);
         b(t, 13, 13);
         j.a("gamestate_lottery.h:120:s_card_1: 0-" + r[0] + " 1-" + r[1] + " 2-" + r[2] + " 3-" + r[3]);
         j.a("gamestate_lottery.h:121:s_card_2: 0-" + s[0] + " 1-" + s[1] + " 2-" + s[2] + " 3-" + s[3]);
         j.a("gamestate_lottery.h:122:s_card_3: 0-" + t[0] + " 1-" + t[1] + " 2-" + t[2] + " 3-" + t[3]);
         cN = 0;
         cP = 0;
         X(11);
      }

      if (var0 == 2) {
         if (A && c(0, 0, c.e_, c.f_) && c + 2000L < b) {
            boolean var27 = false;
            byte var20 = 15;
            d(15, 1, false);
            m(4);
         }

         if (z) {
            int var9 = j.a_ * cQ;
            switch (cN) {
               case 1:
                  if (r[0] < 199 - o[0] && !c[1] && !c[2]) {
                     r[0] = r[0] + var9 < 199 - o[0] ? r[0] + var9 : 199 - o[0];
                     x(1);
                     if (r[0] == 199 - o[0]) {
                        A = true;
                     }
                  }

                  if (s[0] < j.g()) {
                     if (!c[2]) {
                        s[0] = s[0] + var9;
                        x(2);
                     }
                  } else {
                     c[1] = false;
                  }

                  if (t[0] < j.g()) {
                     t[0] = t[0] + var9;
                     x(3);
                  } else {
                     c[2] = false;
                  }
                  break;
               case 2:
                  A = true;
                  if (r[0] + r[2] > 0) {
                     r[0] = r[0] - var9;
                     x(1);
                  } else {
                     c[1] = false;
                  }

                  if (t[0] < j.g()) {
                     t[0] = t[0] + var9;
                     x(3);
                  } else {
                     c[2] = false;
                  }
                  break;
               case 3:
                  if (r[2] + r[0] > 0) {
                     r[0] = r[0] - var9;
                     x(1);
                  } else {
                     c[0] = false;
                  }

                  if (s[0] + s[2] > 0) {
                     if (!c[0]) {
                        s[0] = s[0] - var9;
                        x(2);
                     }
                  } else {
                     c[1] = false;
                  }

                  if (t[0] > 199 - o[0] && !c[1] && !c[0]) {
                     t[0] = t[0] - var9 > 199 - o[0] ? t[0] - var9 : 199 - o[0];
                     x(3);
                     if (t[0] == 199 - o[0]) {
                        A = true;
                     }
                  }
            }

            if (a[0] == null) {
               int var2 = u[cN - 1] / 25;
               j.a("gamestate_lottery.h:299:" + var2 + " number of stars");
               a[0] = l.a(var2, 300, 1500, c.e_ / 2, c.f_ / 2, 1, 1, -j.c(1000), -j.c(350), -j.c(300), j.c(400), 2, 0, -3, -1, 8);
               a[1] = l.a(var2, 300, 1500, c.e_ / 2, c.f_ / 2, 1, 1, j.c(350), j.c(1000), -j.c(400), j.c(300), 2, 0, -3, -1, 8);

               for (int var10 = 0; var10 < a.length; var10++) {
                  a[var10].a();
               }
            }

            if (z && (!c[0] && !c[1] || !c[0] && !c[2] || !c[1] && !c[2])) {
               for (int var15 = 0; var15 < a.length; var15++) {
                  a[var15].a(j.a_);
               }
            }

            if (z) {
               short var21 = 202;
               String var16 = a(a(202, (int)0), u[cN - 1]);
               b(13, 16, var16);
               g(13, 17, (System.currentTimeMillis() & 512L) != 0L);
            }
         }

         d = (d = hJ * hJ + hK * hK) * j.a_ / 1000L;
         if (cN == 0) {
            if (e(o[0], o[1], o[2] - o[0], o[3] - o[1]) && (cR = (int)(cR + d)) >= 10) {
               cR = 0;
               cN = 1;
               (b = l.a(15, 200, 750, a(13, 7, 2), a(13, 7, 3), 1, 1, -j.c(300), j.c(300), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
               cP++;
               c(13, 9, cP);
            }

            if (e(p[0], p[1], p[2] - p[0], p[3] - p[1]) && (cR = (int)(cR + d)) >= 10) {
               cR = 0;
               cN = 2;
               (b = l.a(15, 200, 750, a(13, 3, 2), a(13, 3, 3), 1, 1, -j.c(300), j.c(300), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
               cP++;
               c(13, 5, cP);
            }

            if (e(q[0], q[1], q[2] - q[0], q[3] - q[1]) && (cR = (int)(cR + d)) >= 10) {
               cR = 0;
               cN = 3;
               (b = l.a(15, 200, 750, a(13, 11, 2), a(13, 11, 3), 1, 1, -j.c(300), j.c(300), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
               cP++;
               c(13, 13, cP);
            }
         } else {
            l var22 = b;
            if (b.a > 0) {
               b.a(j.a_);
            }

            if (cP < 4) {
               int var11 = -1;
               byte var17 = -1;
               if (cN == 1) {
                  if (e(o[0], o[1], o[2] - o[0], o[3] - o[1])) {
                     var11 = 0;
                     var17 = 9;
                  }
               } else if (cN == 2) {
                  if (e(p[0], p[1], p[2] - p[0], p[3] - p[1])) {
                     var11 = 1;
                     var17 = 5;
                  }
               } else if (cN == 3 && e(q[0], q[1], q[2] - q[0], q[3] - q[1])) {
                  var11 = 2;
                  var17 = 13;
               }

               if (var11 != -1) {
                  if ((cR = (int)(cR + d)) >= 500) {
                     cR = 0;
                     cP++;
                     j.a("gamestate_lottery.h:663:s_scratch_state " + cP);
                     if (cP >= 4) {
                        boolean var28 = false;
                        boolean var23 = false;
                        d(0, 1, false);
                        c = b;
                        z(23, fV);
                        z(24, fV);
                        z(25, fV);
                        z = true;
                     }

                     c(13, var17, cP);
                     var22 = b;
                     if (b.a == 0) {
                        b.a();
                     }
                  }

                  j.a("gamestate_lottery.h:687:s_scratch_state " + cP + " s_isLotteryResultsSaved " + B);
                  if (!B && cP >= 1) {
                     B = true;
                     j.a("gamestate_lottery.h:693:Lottery results saved - dates + " + u[var11] + "  points!");
                     fV = fV + u[var11];
                     f(fk, fV);
                     int var10000 = fh;
                     long var5 = System.currentTimeMillis();
                     var11 = var10000;
                     a(s, var11, var5);
                     ab(s);
                  }
               }
            }
         }

         aY();
         ah(13);
      }

      if (var0 == 5) {
         int var13 = bZ;
         switch (bZ) {
            case 5:
               boolean var29 = false;
               byte var25 = 16;
               d(16, 1, false);
               m(4);
               break;
            case 1028:
               j.a("gamestate_lottery.h:731:OK");
               m(4);
         }
      }

      if (var0 == 3) {
         c(j.b);
         am(2);
         if (z && (!c[0] && !c[1] || !c[0] && !c[2] || !c[1] && !c[2])) {
            for (int var14 = 0; var14 < a.length; var14++) {
               a[var14].a(j.b, a[188], 8, 0, 0, false);
            }
         }

         if (cN != 0) {
            l var26 = b;
            if (b.a > 0) {
               if (cP >= 4) {
                  b.a(j.b, a[69], 1, 0, 0, false);
               } else {
                  b.a(j.b, a[188], 5, 0, 0, false);
               }
            }

            switch (cN) {
               case 1:
                  i(13, 11, 8, 3);
                  i(13, 3, 8, 3);
                  break;
               case 2:
                  i(13, 7, 8, 3);
                  i(13, 11, 8, 3);
                  break;
               case 3:
                  i(13, 7, 8, 3);
                  i(13, 3, 8, 3);
            }
         }
      }

      if (var0 == 4) {
         gT++;
         z(30, -1);
         z(31, -1);
         z(32, -1);
         Z(14);
         Z(12);
         aL();
      }
   }

   private static void x(int var0) {
      switch (var0) {
         case 1:
            var0 = r[0] + o[0];
            i(13, 7, 2, var0);
            i(13, 10, 2, var0);
            i(13, 9, 2, var0);
            i(13, 8, 2, var0 - o[0]);
            return;
         case 2:
            var0 = s[0] + o[0];
            i(13, 3, 2, var0);
            i(13, 6, 2, var0);
            i(13, 5, 2, var0);
            i(13, 4, 2, var0 - o[0]);
            return;
         case 3:
            var0 = t[0] + o[0];
            i(13, 11, 2, var0);
            i(13, 14, 2, var0);
            i(13, 13, 2, var0);
            i(13, 12, 2, var0 - o[0]);
      }
   }

   private static boolean e() {
      j.a("gamestate_lottery.h:1020:Checking if showing Lottery...");
      int var0 = fh;
      int var1 = var0;
      var0 = s;
      byte[] var10000 = a[var0];
      var1 <<= 2;
      byte[] var14 = var10000;
      long var11 = var10000[var1 + 7] & 255L
         | (var14[var1 + 6] & 255L) << 8
         | (var14[var1 + 5] & 255L) << 16
         | (var14[var1 + 4] & 255L) << 24
         | (var14[var1 + 3] & 255L) << 32
         | (var14[var1 + 2] & 255L) << 40
         | (var14[var1 + 1] & 255L) << 48
         | (var14[var1] & 255L) << 56;
      j.a("saveLoad.h:790:RMS_GetRecordValue_Long() - Value:" + var11);
      long var15 = var11;
      long var2 = System.currentTimeMillis();
      long var4 = var15 / 86400000L;
      long var6 = var2 / 86400000L;
      j.a("gamestate_lottery.h:1028:lTimeLastRunDay:" + var4 + "    lTimeCurrentDay:" + var6);
      return var4 < var6;
   }

   private static void T() {
      Graphics var0 = j.b;
      j.b = a;

      try {
         b(j.b);
         j(61, 0, 0, 1);
      } catch (Exception var2) {
         j.a("gamestate_newShop.h:657:Exception setting loading backbuffer: " + var2.toString() + "  " + var2.getMessage());
      }

      j.b = var0;
   }

   private static void U() {
      a[0] = new i();
      int[] var0 = new int[]{0};
      a[0].a(42, var0);
      a[0].e();
      a[0].h();
      a[0].d(a[0].a[1]);
   }

   private static void V() {
      a(15, 1, true, true);
      a(11, 1, true, true);
      aL();
   }

   private static void y(int var0) {
      if (var0 == 0) {
         b[0] = l.a(15, 300, 1800, c.e_ / 2, c.f_ / 2, 1, 1, -j.c(1000), -j.c(350), -j.c(350), j.c(350), 3, 0, -1, -1, 8);
         b[1] = l.a(15, 300, 1800, c.e_ / 2, c.f_ / 2, 1, 1, j.c(350), j.c(1000), -j.c(350), j.c(350), 3, 0, -1, -1, 8);

         for (int var1 = 0; var1 < b.length; var1++) {
            b[var1].a();
         }

         cS = bY;
         c(false);
         al(42);
         boolean var3 = false;
         boolean var2 = true;
         byte var4 = 42;
         a(42, var2, var3, 0);
         a[0].d = a(23, 3, 2);
         a[0].e = a(23, 3, 3);
         a[0].d(a[0].a[13]);
         a[0].a(13, true);
         var2 = false;
         var4 = 2;
         d(2, 1, false);
         D = false;
      }

      if (var0 == 5) {
         int var6 = bZ;
         switch (bZ) {
            case 5:
               l(cS);
         }
      }

      if (var0 == 2) {
         if (D) {
            g(23, 7, (System.currentTimeMillis() & 512L) != 0L);
            if (c(0, 0, c.e_, c.f_)) {
               boolean var10 = false;
               byte var7 = 15;
               d(15, 1, false);
               aD(6);
               m(45);
            }
         }

         aY();
         ah(23);
         a[0].a(v);
         a[0].c();
         if (b >= 350L) {
            for (int var8 = 0; var8 < b.length; var8++) {
               b[var8].a(j.a_);
            }
         }

         if (!D && b >= 2000L) {
            D = true;
         }

         aZ();
      }

      if (var0 == 3) {
         b(j.b);
         am(0);
         h(23, 1, true);
         b(23, 1, 0, 0);
         h(23, 1, false);
         a[0].d();
         h(23, 2, true);
         b(23, 2, 0, 0);
         h(23, 2, false);
         g(23, 5, true);
         b(23, 5, 0, 0);
         g(23, 5, false);
      }

      if (var0 == 6) {
         c(1);
         c(0);
      }
   }

   private static void z(int var0) {
      if (var0 == 0) {
         c(false);
         al(33);
         al(43);
         boolean var1 = false;
         boolean var3 = true;
         int var2 = 33;
         a(33, var3, var1, 0);
         var1 = false;
         var3 = true;
         var2 = (byte)43;
         a(43, var3, var1, 0);
         Y();
         b(24, 2, e(y()) + "/" + e(90));
         j.a("gamestate_venue_select_slide.h:75:-------------------------------------SET ANIMATION TO VENUE-------------------------------------------------");
         var2 = fp;
         cT = i(s, var2);
         var2 = fq;
         cU = i(s, var2);
         E = false;
         bd();
         az(2);
         g(false);
         d(24, 8, 25);
         X();
         A(x() - 1);
         b(24, 2, e(y()) + "/" + e(90));
         if (cT > -1 && cT < 6) {
            o(fp, -1);
            W();
            var3 = false;
            byte var14 = 17;
            d(17, 1, false);
            j.a(
               "gamestate_venue_select_slide.h:122:-------------------------------------SET ANIMATION TO VENUE   "
                  + cT
                  + "-------------------------------------------------"
            );
         } else {
            j.a(
               "gamestate_venue_select_slide.h:126:-------------------------------------DONT SET ANIMATION TO VENUE ------------------------------------------------"
            );
         }
      }

      if (var0 == 1) {
         j.a("gamestate_venue_select_slide.h:152:VENUE SELECT SLIDE light init!");
         b(24, 2, e(y()) + "/" + e(90));
         Y();
         c(false);
         ak(33);
         ak(43);
         az(2);
         g(false);
         X();
         A(x() - 1);
         b(24, 2, e(y()) + "/" + e(90));
      }

      if (var0 == 2) {
         if (cT < 0 || cT >= 6) {
            aY();
         }

         ah(24);
         if (cT > -1 && cT < 6 && g != null) {
            if (g.a()) {
               if (cT > cU) {
                  cT = -1;
                  o(fq, -1);
               } else if (++cT <= cU) {
                  W();
               }
            } else {
               g.b(j.a_);
            }

            if (E && d != null) {
               d.a(j.a_);
            }
         }

         if (cT == -1 || cT >= 6) {
            bE();
         }
      }

      if (var0 == 5) {
         int var5 = bZ;
         switch (bZ) {
            case 1:
               m(G());
               break;
            case 1006:
               m(8);
               boolean var34 = false;
               byte var25 = 16;
               d(16, 1, false);
            case 1008:
            default:
               break;
            case 1168:
            case 1169:
            case 1170:
            case 1171:
            case 1172:
            case 1173:
               j.a("gamestate_venue_select_slide.h:311:InputMsg.VENUE_SELECT_CLICKED_LOCATION + xx");
               var5 -= 1168;
               j.a("gamestate_venue_select_slide.h:467:venueselect_processItemClick() - _iVenue:" + var5);
               if (h(var5)) {
                  boolean var32 = false;
                  byte var23 = 16;
                  d(16, 1, false);
                  j.a("gamestate_venue_select_slide.h:478:Going to stage selection in venue " + var5);
                  o.g = var5;
                  n(12);
                  Z();
               } else {
                  boolean var33 = false;
                  byte var24 = 13;
                  d(13, 1, false);
               }
               break;
            case 1178:
            case 1179:
            case 1180:
            case 1181:
            case 1182:
            case 1183:
               j.a("gamestate_venue_select_slide.h:323:InputMsg.VENUE_SELECT_WANT_UNLOCK_LOCATION + xx");
               cV = var5 - 1178;
               int var20 = 518;
               String var10000 = a(a(518, (int)0), o(cV));
               String var22 = a(var20 = 204 + cV, (int)0);
               String var8 = var10000;
               int var31;
               if ((var31 = var10000.indexOf(64)) != -1) {
                  var8 = var8.substring(0, var31) + var22 + var8.substring(var31 + 1);
               }

               String var9 = var8;
               a(0, var9, 14, 4);
               break;
            case 1188:
               c(0);
               if (fV < o(cV)) {
                  boolean var28 = false;
                  short var15 = 8;
                  d(8, 1, false);
                  var15 = 520;
                  String var29 = a(520, (int)0);
                  boolean var17 = false;
                  a(0, var29, -1, 0);
               } else {
                  boolean var30 = false;
                  int var18 = 30;
                  d(30, 1, false);
                  fV = fV - o(cV);
                  o(fk, fV);
                  g(false);
                  var5 = x();
                  ap(cV);
                  var18 = x();
                  cT = var5;
                  cU = var18 - 1;
                  o(fp, var5);
                  o(fq, x());

                  for (int var7 = 0; var7 < 6; var7++) {
                     b(var7, true);
                  }

                  o(fp, -1);
                  W();
               }
         }
      }

      if (var0 == 3) {
         Z();
      }
   }

   private static void A(int var0) {
      j.a("gamestate_venue_select_slide.h:412:venueselect_focusOnVenue - _iVenue:" + var0);
      var0 = a(25, 1 + var0 * 9, 2) - a(25, 1, 2);
      i(24, 8, 16, -var0);
   }

   private static void W() {
      short var0 = a(25, 1, 2);
      short var1 = a(25, 1, 3);

      for (int var2 = 0; var2 < 6; var2++) {
         b(var2, true);
      }

      A(cT);
      (g = new p(a[45], var0, var1)).b(0, 1);
      (d = l.a(6, 300, 700, var0, var1, 1, 1, -j.c(450), j.c(450), -j.c(500), j.c(500), 0, 0, -1, -1, 8)).a();
      E = true;
   }

   private static void X() {
      ag(25);
      b(aj, 25, 1);
      int var0 = aj[0];
      int var1 = aj[2] - var0 + 1;
      j.a("gamestate_venue_select_slide.h:525:iItemLeft:" + var0 + "  iItemWidth:" + var1);
      c(aj, 25, 0);
      int var2 = aj[2] - var0;
      int var4 = 25;
      int var3 = a[var4].length;
      var4 = (byte)25;
      s(25, a[var4].length + 45);
      var0 -= a(24, 8, 2);
      var4 = 0;
      var1 = var0 * 2 + var1;

      for (int var5 = 0; var5 < 6; var5++) {
         if (var5 > 0) {
            for (int var6 = 0; var6 < 9; var6++) {
               f(25, var6 + 1, var3);
               short var8 = a(25, var6 + 1, 2);
               i(25, var3, 2, var8 + var4);
               var3++;
            }

            var1 += var2;
         }

         var4 += var2;
      }

      short var13 = a(24, 8, 5);
      int var14 = var1 - var13;
      a(24, 8, -var14, 0, 0, 0);
      j.a("gamestate_venue_select_slide.h:571:iScrollAreaWidth:" + var14 + "  iItemDistanceX:" + var2);
      i(24, 8, 16, 0);

      for (int var9 = 0; var9 < 6; var9++) {
         b(var9, false);
      }
   }

   private static void b(int var0, boolean var1) {
      int var2 = 1 + var0 * 9;
      if (var1) {
         var1 = h(var0) && var0 <= cT;
      } else {
         var1 = h(var0);
      }

      int var3;
      b(25, var2 + 7, a(var3 = var0 + 204, (int)0));
      i(25, var2, 5, var0 + 28);
      i(25, var2, 6, 0);
      i(25, var2, 8, var1 ? 0 : 1);
      i(25, var2 + 8, 10, var1 ? 0 : 1);
      if (var1) {
         b(25, var2 + 3, "");
         g(25, var2 + 3, false);
         a(25, var2 + 5, false);
         c(25, var2 + 2, false);
         h(25, var2 + 1, false);
      } else {
         b(25, var2 + 3, e(q[var0][0]));
         g(25, var2 + 3, true);
         h(25, var2 + 1, true);
         a(25, var2 + 5, false);
      }

      b(25, var2 + 6, e(n(var0)) + "/" + e(15));
   }

   private static void Y() {
      Graphics var0 = j.b;
      j.b = a;

      try {
         b(j.b);
         j(24, 0, 0, 1);
      } catch (Exception var2) {
         j.a("gamestate_venue_select_slide.h:761:Exception setting loading backbuffer: " + var2.toString() + "  " + var2.getMessage());
      }

      j.b = var0;
   }

   private static void Z() {
      c(j.b);
      c(aj, 24, 4);
      int var0 = aj[2] + aj[0] >> 1;
      int var1 = aj[3] + aj[1] >> 1;
      int var2 = -a(24, 8, 16);
      int var3 = -a(24, 8, 12);
      b(var0, var1, var2, var3, 6, 20, true);
      am(2);
      if (E) {
         if (cT > -1 && cT < 6 && g != null && !g.a()) {
            g.c();
         }

         if (d != null) {
            d.a(j.b, a[188], 3, 0, 0, false);
         }
      }
   }

   private static void B(int var0) {
      if (var0 == 0) {
         Q();
         J = false;
         F = false;
         G = false;
         al = true;
         bq();
         int var1 = 2;
         int var2 = 4;
         int var3 = o.g * 5 + bq;
         int var6 = fj + var3;
         boolean var4;
         if (!(var4 = (var3 = i(s, var6)) <= 0 && o.g == 0)) {
            var1 = z[0];
            var2 = z[1];
         }

         int var5 = var1 * var2;
         o.d = a[o.g][bq][0];
         new StringBuffer()
            .append("minigame_memory - Number of cards (")
            .append(var5)
            .append(" : ")
            .append(var1)
            .append(" rows * ")
            .append(var2)
            .append(" columns) is not a multiple of 2 !!!");
         d = new int[var5][9];
         c(false);
         al(44);
         int var8 = 0;
         int var7 = 1;
         int var33 = 44;
         a(44, (boolean)var7, (boolean)var8, 0);
         az(128);

         for (int var34 = 0; var34 < 2; var34++) {
            if (c[var34] == null) {
               c[var34] = new p();
            }

            c[var34].a(a[188]);
            c[var34].b(-1, -1);
         }

         cW = a[56].b(0);
         cX = a[56].c(0);
         c(aj, 27, 4);
         if (var3 <= 0 && o.g == 0) {
            aj[1] = aj[1] + 60;
            aj[3] = aj[3] + 150;
            aj[3] = aj[3] / 3 << 1;
         }

         var33 = aj[0];
         var3 = aj[1];
         var7 = aj[2] - aj[0] + 1;
         var8 = aj[3] - aj[1] + 1;
         var7 = (var7 - cW) / (var2 - 1);
         var8 = (var8 - cX) / (var1 - 1);
         int var9 = var3 + cX / 2;
         int var10 = 0;

         for (int var11 = 0; var11 < var1; var11++) {
            var3 = var33 + cW / 2;

            for (int var12 = 0; var12 < var2; var12++) {
               int var13 = -1;
               int var15 = -1;
               int var17 = var9;
               int var16 = var3;
               var15 = var12;
               int var14 = var11;
               var13 = var10;
               int[] var92;
               (var92 = d[var13])[0] = var16;
               var92[1] = var17;
               var92[2] = var14;
               var92[3] = var15;
               var92[4] = -1;
               var92[5] = -1;
               var92[8] = 0;
               var92[6] = 0;
               var92[7] = 0;
               var3 += var7;
               var10++;
            }

            var9 += var8;
         }

         ab();
         da = z[2 + o.e];
         db = 0;
         F = false;
         aa();

         int var89;
         int var90;
         do {
            var89 = j.b(0, var5);
            var90 = j.b(0, var5);
         } while (var89 == var90 || b(var89, var90));

         for (int var18 = 0; var18 < var5; var18++) {
            x(var18, 8);
         }

         k(5, var89 + 1188);
         x(var89, 2);
         k(5, var90 + 1188);
         x(var90, 2);
         U();
         a[0].d(4);
         a[0].d = a(27, 7, 2);
         a[0].e = a(27, 7, 3);
         a[0].a(1, true);
         if (var4) {
            if (!J) {
               short var36 = 315;
               String var10001 = a(315, (int)0);
               byte var79 = 12;
               String var65 = var10001;
               boolean var37 = false;
               a(0, var65, var79, 0);
            } else {
               short var38 = 662;
               String var103 = a(662, (int)0);
               byte var80 = 11;
               String var66 = var103;
               boolean var39 = false;
               a(0, var66, var80, 0);
            }
         } else {
            short var40 = 315;
            String var104 = a(315, (int)0);
            byte var81 = 11;
            String var67 = var104;
            boolean var41 = false;
            a(0, var67, var81, 0);
         }
      }

      if (var0 == 1) {
         bq();
         c(false);
         al(44);
         ak(44);
         g(27, 8, true);
         o.d = a[o.g][bq][0];
         az(128);

         for (int var19 = 0; var19 < 2; var19++) {
            if (c[var19] == null) {
               c[var19] = new p();
            }

            c[var19].a(a[188]);
            c[var19].b(-1, -1);
         }

         if (G) {
            if (I) {
               short var42 = 283;
               String var105 = a(283, (int)0);
               byte var82 = 10;
               String var68 = var105;
               boolean var43 = false;
               a(0, var68, var82, 0);
            } else {
               short var44 = 282;
               String var106 = a(282, (int)0);
               byte var83 = 10;
               String var69 = var106;
               boolean var45 = false;
               a(0, var69, var83, 0);
            }
         } else if (!F) {
            int var20 = o.g * 5 + bq;
            int var46 = fj + var20;
            if (i(s, var46) <= 0 && o.g == 0) {
               if (!J) {
                  short var47 = 315;
                  String var107 = a(315, (int)0);
                  byte var84 = 12;
                  String var70 = var107;
                  boolean var48 = false;
                  a(0, var70, var84, 0);
               } else {
                  short var49 = 662;
                  String var108 = a(662, (int)0);
                  byte var85 = 11;
                  String var71 = var108;
                  boolean var50 = false;
                  a(0, var71, var85, 0);
               }
            } else {
               short var51 = 315;
               String var109 = a(315, (int)0);
               byte var86 = 11;
               String var72 = var109;
               boolean var52 = false;
               a(0, var72, var86, 0);
            }
         }
      }

      if (var0 == 5) {
         int var21 = bZ;
         switch (bZ) {
            case 6:
               eu = bW;
               m(17);
               S = true;
               break;
            case 1188:
            case 1189:
            case 1190:
            case 1191:
            case 1192:
            case 1193:
            case 1194:
            case 1195:
            case 1196:
            case 1197:
            case 1198:
            case 1199:
            case 1200:
            case 1201:
            case 1202:
            case 1203:
            case 1204:
            case 1205:
            case 1206:
            case 1207:
               int var24 = var21 - 1188;
               y[cY] = var24;
               cY++;
               break;
            case 1268:
               if (++cZ >= 2) {
                  ac();
               }
               break;
            case 1269:
               cZ++;
               break;
            case 1270:
               if (--cZ <= 0) {
                  if (da <= 0) {
                     I = false;
                     int var93 = o.g * 5 + bq;
                     int var53 = fj + var93;
                     if (i(s, var53) <= 0 && o.g == 0) {
                        db += 2;
                     }

                     M[0] = db * 500;
                     boolean var73 = false;
                     short var54 = 3;
                     d(3, 1, false);
                     G = true;
                     var54 = 282;
                     String var110 = a(282, (int)0);
                     byte var87 = 10;
                     String var74 = var110;
                     boolean var56 = false;
                     a(0, var74, var87, 0);
                  } else if (g()) {
                     I = true;
                     int var94 = o.g * 5 + bq;
                     int var57 = fj + var94;
                     if (i(s, var57) <= 0 && o.g == 0) {
                        db += 2;
                     }

                     M[0] = db * 500;
                     boolean var75 = false;
                     short var58 = 5;
                     d(5, 1, false);
                     G = true;
                     var58 = 283;
                     String var111 = a(283, (int)0);
                     byte var88 = 10;
                     String var76 = var111;
                     boolean var60 = false;
                     a(0, var76, var88, 0);
                  } else {
                     aa();
                  }
               }
               break;
            case 1272:
               byte var23;
               if (db >= z[5]) {
                  var23 = 1;
               } else if (db >= z[6]) {
                  var23 = 2;
               } else if (db >= z[7]) {
                  var23 = 3;
               } else {
                  var23 = 4;
               }

               j.a("gamestate_minigame_memory.h:455:iRank:" + var23);
               K[0] = var23;
               V(K[0]);
               m(42);
               break;
            case 1273:
               c(0);
               F = true;
               g(27, 8, true);
         }
      }

      if (var0 == 2) {
         int var22 = 2;
         int var25 = 4;
         int var29 = o.g * 5 + bq;
         int var61 = fj + var29;
         if (i(s, var61) > 0 || o.g != 0) {
            var22 = z[0];
            var25 = z[1];
         }

         int var30 = var22 * var25;
         aY();
         aZ();
         if (F) {
            a[0].c();

            for (int var31 = 0; var31 < var30; var31++) {
               if (var31 < d.length) {
                  int var95 = var31;
                  int[] var96;
                  int var98 = (var96 = d[var95])[6];
                  boolean var101 = false;
                  boolean var102 = false;
                  switch (var98) {
                     case 0:
                        if (f()) {
                           var98 = hB;
                           if (a(hL, hM, var96[0] - cW / 2, var96[1] - cX / 2, cW, cX)) {
                              if (var98 == 3) {
                                 var102 = true;
                              } else if (var98 == 2 || var98 == 1) {
                                 var101 = true;
                              }
                           }

                           var96[7] = var101 ? 1 : 0;
                           if (var102) {
                              k(5, var95 + 1188);
                              x(var95, 1);
                           }
                        }
                        break;
                     case 1:
                        var96[8] -= j.a_;
                        if (var96[8] < 0) {
                           var96[8] = 0;
                           x(var95, 6);
                           k(5, 1268);
                        }
                        break;
                     case 2:
                        var96[8] -= j.a_;
                        if (var96[8] < 0) {
                           var96[8] = 0;
                           x(var95, 5);
                           k(5, 1269);
                        }
                        break;
                     case 3:
                        var96[8] += j.a_;
                        var98 = g() ? 1500 : 1050;
                        if (var96[8] > var98) {
                           var96[8] = var98;
                           x(var95, 6);
                           k(5, 1270);
                        }
                        break;
                     case 4:
                        var96[8] -= j.a_;
                        if (var96[8] < 0) {
                           var96[8] = 0;
                           x(var95, 7);
                        }
                        break;
                     case 5:
                        var96[8] += j.a_;
                        if (var96[8] > 1500) {
                           var96[8] = 1500;
                           x(var95, 7);
                        }
                     case 6:
                     default:
                        break;
                     case 7:
                        var96[8] += j.a_;
                        if (var96[8] > 500) {
                           var96[8] = 500;
                           x(var95, 0);
                           k(5, 1270);
                        }
                        break;
                     case 8:
                        var96[8] += j.a_;
                        if (var96[8] > 300) {
                           var96[8] = 300;
                           x(var95, 0);
                        }
                  }
               }
            }

            for (int var32 = 0; var32 < 2; var32++) {
               l var62;
               if (c[var32] != null && (var62 = c[var32]).a > 0) {
                  c[var32].a(j.a_);
               }

               if (c[var32] != null && c[var32].a() >= 0 && c[var32].a()) {
                  c[var32].b(-1, -1);
               }
            }
         }

         R();
      }

      if (var0 == 3) {
         a[0].a(w);
         i(27, 3, 6, x[o.e] + da);
         c(j.b);
         am(0);
         S();
      }
   }

   private static boolean f() {
      int var0 = hc * hd;

      for (int var2 = 0; var2 < var0; var2++) {
         int var1;
         if ((var1 = d[var2][6]) == 2 || var1 == 5 || var1 == 7) {
            return false;
         }
      }

      return cY < 2;
   }

   private static boolean g() {
      int var0 = 2;
      int var1 = 4;
      int var2 = o.g * 5 + bq;
      var2 = fj + var2;
      if (i(s, var2) > 0 || o.g != 0) {
         var0 = z[0];
         var1 = z[1];
      }

      var0 *= var1;
      return db >= var0 / 2;
   }

   private static void aa() {
      cY = 0;
      cZ = 0;
   }

   private static void ab() {
      int var0 = 2;
      int var1 = 4;
      int var2 = o.g * 5 + bq;
      var2 = fj + var2;
      if (i(s, var2) > 0 || o.g != 0) {
         var0 = z[0];
         var1 = z[1];
      }

      var0 *= var1;
      int[] var8 = new int[15];

      for (int var10 = 0; var10 < var0; var10++) {
         i(var10, -1, -1);
      }

      for (int var5 = 0; var5 < var0 / 2; var5++) {
         int var3;
         do {
            var2 = j.b(0, 10);
            if (var5 < 4) {
               var3 = var5 + 1;
            } else {
               var3 = j.b(1, 5);
            }
         } while ((var8[var2] & 1 << var3) != 0);

         var8[var2] |= 1 << var3;

         for (int var6 = 0; var6 < 2; var6++) {
            int var4;
            do {
               var4 = j.b(0, var0);
            } while (d[var4][4] != -1);

            i(var4, var2, var3);
         }
      }
   }

   private static boolean b(int var0, int var1) {
      int[] var2 = d[var0];
      int[] var3 = d[var1];
      return var2[4] == var3[4] && var2[5] == var3[5];
   }

   private static void ac() {
      if (!b(y[0], y[1])) {
         j.a("gamestate_minigame_memory.h:788:CARDS DON'T MATCH!");
         x(y[0], 4);
         x(y[1], 4);
         da--;
         a[0].a(7, true);
         byte var3 = 0;
         var3 = 19;
         d(19, 1, false);
      } else {
         j.a("gamestate_minigame_memory.h:732:CARDS MATCH!");
         x(y[0], 3);
         x(y[1], 3);
         if (d[y[0]][1] == d[y[1]][1]) {
            H = true;
         } else {
            H = false;
         }

         db++;

         for (int var0 = 0; var0 < 2; var0++) {
            c[var0] = l.a(15, 200, 1500, d[y[var0]][0], d[y[var0]][1], 1, 1, -j.c(200), j.c(200), -j.c(200), j.c(200), 0, 0, -1, -1, 8);
            c[var0].a();
            c[var0].b(12, 1);
            c[var0].a(d[y[var0]][0], d[y[var0]][1]);
         }

         if (g()) {
            a[0].d(1);
         }

         a[0].a(3, true);
         byte var1 = 0;
         var1 = 24;
         d(24, 1, false);
      }
   }

   private static void C(int var0) {
      if (var0 == 0) {
         Q();
         bi = false;
         K = false;
         al = true;
         L = false;
         bt();
         bB();
         g(33, 3, true);
         g(33, 7, true);
         o.d = a[o.g][bq][0];
         de = B[0];
         df = B[1];
         di = B[2 + o.e];
         dj = 0;
         int var1 = de * df;
         c(false);
         al(45);
         int var4 = 0;
         int var3 = 1;
         int var2 = 45;
         a(45, (boolean)var3, (boolean)var4, 0);
         e = new int[var1][12];
         f = new int[var1][2];
         dc = a[56].b(0);
         dd = a[56].c(0);
         c(new int[4], 33, 2);
         dm = a(33, 2, 2);
         dn = a(33, 2, 3);
         do = a(33, 2, 5);
         dp = a(33, 2, 6);
         var3 = do / df;
         var2 = dp / de;
         int var5 = dn + dd / 2;
         int var6 = 0;

         for (int var7 = 0; var7 < de; var7++) {
            var4 = dm + dc / 2;

            for (int var8 = 0; var8 < df; var8++) {
               a(var6, var7, var8, -1, -1);
               f[var7 * df + var8][0] = var4;
               f[var7 * df + var8][1] = var5;
               var4 += var3;
               var6++;
            }

            var5 += var2;
         }

         br();
         D = new int[var1];
         by();
         dg = 0;
         az(128);
         short var12 = 375;
         String var10001 = a(375, (int)0);
         byte var28 = 21;
         String var21 = var10001;
         boolean var13 = false;
         a(0, var21, var28, 0);
      }

      if (var0 == 1) {
         bt();
         o.d = a[o.g][bq][0];
         c(false);
         al(45);
         ak(45);
         g(33, 7, true);
         az(128);
         b(33, 4, e(dj));
         if (dg == 4) {
            g(33, 3, false);
         }

         if (!K) {
            short var14 = 375;
            String var49 = a(375, (int)0);
            byte var29 = 21;
            String var22 = var49;
            boolean var15 = false;
            a(0, var22, var29, 0);
         }
      }

      if (var0 == 5) {
         int var9 = bZ;
         switch (bZ) {
            case 6:
               eu = bW;
               m(17);
               S = true;
               break;
            case 1273:
               K = true;
         }
      }

      if (var0 == 2) {
         aY();
         aZ();
         if (K) {
            int var10 = de * df;

            for (int var30 = 0; var30 < 30; var30++) {
               if (as[var30] > 0) {
                  if (at[var30] > 0) {
                     at[var30] = at[var30] - j.a_;
                  } else {
                     as[var30] = as[var30] - j.a_;
                     int var37 = aw[var30];
                     int var42 = ax[var30];
                     au[var30] = au[var30] + var37 * j.c(j.a_) / 1000;
                     av[var30] = av[var30] + var42 * j.c(j.a_) / 1000;
                  }
               }
            }

            i.a(7);
            switch (dg) {
               case 0:
                  int var16 = hB;
                  int var23 = 0;

                  for (; var23 < var10; var23++) {
                     int var38 = var16;
                     int var31 = var23;
                     int[] var43;
                     int var45 = (var43 = e[var31])[3];
                     int var47 = var43[2];
                     if (var43[10] == 0
                        && a(hL, hM, f[var47 * df + var45][0] - 2 * dc / 6, f[var47 * df + var45][1] - 3 * dd / 8, 4 * dc / 6, 6 * dd / 8)
                        && (var38 == 2 || var38 == 1)
                        && var43[9] == 0) {
                        var43[7] = 1;
                        var43[9] = 1;
                        var31 = var31;
                        D[dh] = var31;
                        if (dh > 0) {
                           int var10000 = D[dh - 1];
                           var38 = D[dh];
                           var31 = var10000;
                           int[] var34 = e[var31];
                           int[] var40 = e[var38];
                           boolean var44 = var34[5] == var40[5] || var34[4] == var40[4];
                           var45 = var34[2];
                           var47 = var40[2];
                           var31 = var34[3];
                           var38 = var40[3];
                           boolean var36 = j.e(var45 - var47) <= 1 && j.e(var31 - var38) <= 1;
                           if (!var44 || !var36) {
                              by();
                              j.a("cGame_Minigame_Connect.h:234:******************:" + dh);
                              continue;
                           }
                        }

                        dh++;
                     }
                  }

                  if (d(dm, dn, do, dp) || e(dm, dn, do, dp) || a(dm, dn, do, dp) || c(dm, dn, do, dp)) {
                     L = true;
                  }

                  if (var16 == 3 && dh > 1) {
                     boolean var24 = false;
                     byte var17 = 24;
                     d(24, 1, false);
                     dg = 1;
                     dk = 0;
                     dl = 100;
                  }

                  if (L) {
                     di = di - j.a_;
                  }

                  if ((var23 = 7 + (8 - (di << 3) / B[2 + o.e] - 1)) < 7) {
                     var23 = 7;
                  }

                  i(33, 6, 6, var23);
                  if (di <= 5000) {
                     if (!bi) {
                        bi = true;
                     }

                     g(33, 3, (System.currentTimeMillis() & 512L) != 0L);
                  }

                  if (di <= 0) {
                     di = 0;
                     dg = 4;
                     g(33, 3, false);
                     i(33, 6, 6, 15);
                     short var18 = 285;
                     a(a(285, (int)0), 2000, 0, j.g() / 2, j.h() / 2, 0, -60, b[0], 2);
                  }
                  break;
               case 1:
                  bs();
                  break;
               case 2:
                  bv();
                  break;
               case 3:
                  bx();
                  break;
               case 4:
                  if ((di = di + j.a_) > 2000) {
                     M[0] = dj;
                     V(K[0]);
                     m(42);
                  }
            }
         }

         R();
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
         i.b(7);
         if (dg == 0) {
            bz();
         }

         S();
      }

      if (var0 == 4) {
         U();
         a[0].d(4);
         a[0].a(1, true);
         aL();
         i.a();
         if (bX != 17) {
            boolean var26 = false;
            byte var19 = 5;
            d(5, 1, false);
         }
      }
   }

   private static void D(int var0) {
      if (var0 == 0) {
         Q();
         aq = false;
         P = false;
         M = false;
         N = false;
         al = true;
         bA();
         c(false);
         al(46);
         byte var1 = 0;
         boolean var6 = true;
         short var5 = 46;
         a(46, var6, (boolean)var1, 0);
         i(56, 3, 7, b);
         i(56, 3, 9, b);
         az(128);

         for (int var8 = 0; var8 < 2; var8++) {
            if (d[var8] == null) {
               d[var8] = new p();
            }

            d[var8].a(a[188]);
            d[var8].b(-1, -1);
         }

         ae();
         ad();
         dv = 0;
         dw = 0;
         dx = 0;
         dy = 0;
         du = 0;
         var5 = 318;
         String var10001 = a(318, (int)0);
         var1 = 20;
         String var36 = var10001;
         boolean var22 = false;
         a(0, var36, var1, 0);
         b(56, 8, e(ds - dt));
         if (!i()) {
            c(56, 3, true);
            a(56, 3, false);
         }
      }

      if (var0 == 1) {
         aq = false;
         bA();
         c(false);
         al(46);
         ak(46);
         o.d = a[o.g][bq][0];
         i(56, 3, 7, b);
         i(56, 3, 9, b);
         az(128);

         for (int var10 = 0; var10 < 2; var10++) {
            if (d[var10] == null) {
               d[var10] = new p();
            }

            d[var10].a(a[188]);
            d[var10].b(-1, -1);
         }

         b(56, 8, e(ds - dt));
         if (N) {
            if (P) {
               short var23 = 283;
               String var44 = a(283, (int)0);
               byte var11 = 19;
               String var37 = var44;
               boolean var24 = false;
               a(0, var37, var11, 0);
            } else {
               short var25 = 282;
               String var45 = a(282, (int)0);
               byte var12 = 19;
               String var38 = var45;
               boolean var26 = false;
               a(0, var38, var12, 0);
            }
         } else if (!M) {
            short var27 = 318;
            String var46 = a(318, (int)0);
            byte var13 = 20;
            String var39 = var46;
            boolean var28 = false;
            a(0, var39, var13, 0);
         }

         if (!i()) {
            c(56, 3, true);
            a(56, 3, false);
         }
      }

      if (var0 == 5) {
         int var14 = bZ;
         switch (bZ) {
            case 6:
               eu = bW;
               m(17);
               S = true;
               break;
            case 1269:
               du++;
               break;
            case 1270:
               if (--du <= 0) {
                  du = 0;
               }
               break;
            case 1271:
               boolean var40 = false;
               byte var29 = 12;
               d(12, 1, false);
               j();
               if (!i()) {
                  c(56, 3, true);
                  a(56, 3, false);
               }
            case 1268:
               if (++du >= 2) {
               }
               break;
            case 1272:
               byte var2;
               if (dv >= H[5]) {
                  var2 = 1;
               } else if (dv >= H[6]) {
                  var2 = 2;
               } else if (dv >= H[7]) {
                  var2 = 3;
               } else {
                  var2 = 4;
               }

               j.a("gamestate_minigame_stack.h:358:iRank:" + var2 + ":" + dv);
               ah();
               K[0] = var2;
               V(K[0]);
               m(42);
               break;
            case 1273:
               M = true;
         }
      }

      if (var0 == 2) {
         int var15 = H[0];
         int var17 = H[1];
         var15 *= var17;
         aY();
         aZ();
         i.a(7);
         if (M) {
            if (h()) {
               ah();
               M = false;
            } else if (k()) {
               ag();
               M = false;
            } else {
               if ((dz = dz + j.a_) >= 2500) {
                  af();
               }

               for (int var18 = 0; var18 < var15; var18++) {
                  int var3 = var18;
                  int[] var4;
                  int var30 = (var4 = g[var3])[6];
                  boolean var41 = false;
                  boolean var7 = false;
                  switch (var30) {
                     case 0:
                     default:
                        break;
                     case 1:
                        var4[8] -= j.a_;
                        if (var4[8] < 0) {
                           var4[8] = 0;
                           y(var3, 6);
                           k(5, 1268);
                        }
                        break;
                     case 2:
                        var4[8] -= j.a_;
                        if (var4[8] < 0) {
                           var4[8] = 0;
                           y(var3, 5);
                           k(5, 1269);
                        }
                        break;
                     case 3:
                        var4[8] += j.a_;
                        var30 = D();
                        if (var4[8] >= var30) {
                           var4[8] = var30;
                           y(var3, 9);
                           F = var4;
                           k(5, 1270);
                        }
                        break;
                     case 4:
                        var4[8] -= j.a_;
                        if (var4[8] < 0) {
                           var4[8] = 0;
                           y(var3, 6);
                        }
                        break;
                     case 5:
                        var4[8] += j.a_;
                        if (var4[8] > 1500) {
                           var4[8] = 1500;
                           y(var3, 7);
                        }
                        break;
                     case 6:
                        var30 = hB;
                        if (a(hL, hM, var4[0] - dq / 2, var4[1] - dr / 2, dq, dr)) {
                           if (var30 == 3) {
                              var7 = true;
                           } else if (var30 == 2 || var30 == 1) {
                              var41 = true;
                           }
                        }

                        var4[7] = var41 ? 1 : 0;
                        if (var7) {
                           if (a(E, var4)) {
                              var41 = false;
                              byte var32 = 24;
                              d(24, 1, false);
                              dv++;
                              dw++;
                              dz = 0;
                              E = var4;
                              k(5, var3 + 1188);
                              y(var3, 3);
                              int var20 = H[1];
                              if (var3 >= var20) {
                                 y(var3 - var20, 1);
                              }
                           } else {
                              var41 = false;
                              byte var33 = 13;
                              d(13, 1, false);
                              y(var3, 4);
                           }
                        }
                        break;
                     case 7:
                        var4[8] += j.a_;
                        if (var4[8] > 500) {
                           var4[8] = 500;
                           y(var3, 0);
                           k(5, 1270);
                        }
                        break;
                     case 8:
                        var4[8] += j.a_;
                        if (var4[8] > 300) {
                           var4[8] = 300;
                           y(var3, 0);
                        }
                  }
               }

               for (int var19 = 0; var19 < 2; var19++) {
                  l var35;
                  if (d[var19] != null && (var35 = d[var19]).a > 0) {
                     d[var19].a(j.a_);
                  }

                  if (d[var19] != null && d[var19].a() >= 0 && d[var19].a()) {
                     d[var19].b(-1, -1);
                  }
               }
            }
         }

         R();
      }

      if (var0 == 3) {
         c(j.b);
         if (dw > 1 && dx != dw) {
            F(dw, 2500);
            dx = dw;
         }

         am(0);
         S();
         i.b(7);
      }

      if (var0 == 4) {
         U();
         a[0].d(4);
         a[0].a(1, true);
      }
   }

   private static boolean h() {
      int var0 = H[0];
      int var1 = H[1];
      var0 *= var1;

      for (int var3 = 0; var3 < var0; var3++) {
         if (g[var3][6] != 9) {
            return false;
         }
      }

      return true;
   }

   private static void ad() {
      int var0 = H[0];
      int var1 = H[1];
      int var2 = var0 * var1;

      for (int var3 = 0; var3 < var2; var3++) {
         k(var3, -1, -1);
      }

      for (int var6 = 0; var6 < var2; var6++) {
         int var10 = j.b(0, 10);
         int var4 = j.b(1, 5);
         k(var6, var10, var4);
         if (var6 >= (var0 - 1) * var1) {
            y(var6, 6);
         }
      }

      int var13 = H[2 + o.e];

      for (int var8 = 0; var8 < var13; var8++) {
         int var5 = var8;
         int var11 = j.b(0, 10);
         int var12 = j.b(1, 5);
         if (var8 == 0) {
            boolean var9 = false;

            while (!var9) {
               var11 = j.b(0, 10);
               var12 = j.b(1, 5);

               for (int var7 = 0; var7 < var2; var7++) {
                  if (g[var7][6] == 6 && (g[var7][4] == var11 || g[var7][5] == var12)) {
                     var9 = true;
                     break;
                  }
               }
            }
         }

         l(var5, var11, var12);
      }

      j();
   }

   private static void ae() {
      int var0 = H[0];
      int var1 = H[1];
      int var2 = var0 * var1;
      ds = H[2 + o.e];
      dt = 0;
      o.d = a[o.g][bq][0];
      new StringBuffer()
         .append("minigame_stack - Number of cards (")
         .append(var2)
         .append(" : ")
         .append(var0)
         .append(" rows * ")
         .append(var1)
         .append(" columns) is not a multiple of 2 !!!");
      g = new int[var2][11];
      h = new int[ds + 2][11];
      E = new int[11];
      F = new int[11];
      dq = a[56].b(0);
      dr = a[56].c(0);
      c(aj, 56, 1);
      var2 = aj[0];
      int var3 = aj[1];
      int var4 = (aj[2] - aj[0] + 1 - dq) / (var1 - 1);
      int var5 = var3 + dr / 2;
      int var6 = 0;

      for (int var7 = 0; var7 < var0; var7++) {
         var3 = var2 + dq / 2;

         for (int var8 = 0; var8 < var1; var8++) {
            int var9 = -1;
            var9 = (byte)-1;
            int var13 = var5;
            int var12 = var3;
            int var11 = var8;
            int var10 = var7;
            var9 = var6;
            int[] var18;
            (var18 = g[var9])[0] = var12;
            var18[1] = var13;
            var18[9] = var18[0];
            var18[10] = var18[1];
            var18[2] = var10;
            var18[3] = var11;
            var18[4] = -1;
            var18[5] = -1;
            var18[8] = 0;
            var18[6] = 0;
            var18[7] = 0;
            var3 += var4;
            var6++;
         }

         var5 += 20;
      }
   }

   private static boolean i() {
      return dt < ds;
   }

   private static boolean j() {
      if (dt < ds) {
         af();
         F = E = h[dt];
         dt++;
         b(56, 8, e(ds - dt));
         return true;
      } else {
         return false;
      }
   }

   private static void af() {
      if (dw > dy) {
         dy = dw;
      }

      dw = 0;
   }

   private static boolean a(int[] var0, int[] var1) {
      return var0[4] == var1[4] || var0[5] == var1[5];
   }

   private static boolean k() {
      if (dt < ds) {
         return false;
      }

      int var0 = H[0];
      int var1 = H[1];
      var0 *= var1;

      for (int var3 = 0; var3 < var0; var3++) {
         if (g[var3][6] == 6 && a(E, g[var3])) {
            return false;
         }

         if (g[var3][6] == 3) {
            return false;
         }
      }

      return true;
   }

   private static void ag() {
      M[0] = dv * 50;
      af();
      int var1 = 0;
      short var0 = 3;
      d(3, 1, false);
      N = true;
      P = false;
      var0 = 282;
      String var10001 = a(282, (int)0);
      byte var2 = 19;
      String var6 = var10001;
      int var4 = 0;
      a(0, var6, var2, 0);
      var4 = H[0];
      var1 = H[1];

      for (int var8 = 0; var8 < var4 * var1; var8++) {
         if (g[var8][6] == 4) {
            y(var8, 6);
         }
      }
   }

   private static void ah() {
      M[0] = dv * 50;
      af();
      boolean var1 = false;
      short var0 = 5;
      d(5, 1, false);
      N = true;
      P = true;
      var0 = 283;
      String var10001 = a(283, (int)0);
      byte var2 = 19;
      String var5 = var10001;
      boolean var4 = false;
      a(0, var5, var2, 0);
   }

   private static void E(int var0) {
      switch (var0) {
         case 0:
            dB = 0;
            h.b(0, 1);
            break;
         case 1:
            dB = 0;
            h.b(1, -1);
            break;
         case 2:
            dB = 0;
            h.b(2, 1);
      }

      dA = var0;
   }

   private static void a(int var0, int var1, int var2, int var3, int var4, int[] var5) {
      var2 -= var0;
      var3 -= var1;
      var5[0] = j.d(var2 * var4) + var0;
      var5[1] = j.d(var3 * var4) + var1;
   }

   private static void ai() {
      a(8, 1, true, true);
      aL();
   }

   private static void F(int var0) {
      if (var0 == 0) {
         hN = -1;
         bR();
         c(false);
         al(50);
         boolean var3 = false;
         boolean var2 = true;
         byte var1 = 50;
         a(50, var2, var3, 0);
         az(2);
         b(55, 1, x);
         dG = 0;
         dC = a(55, 5, 2);
         dD = a(55, 5, 3);
         if (hA == 4) {
            dC = (int)(dC * 1.1);
            dD = (int)(dD * 1.3);
         }

         dH = (dH = a(55, 7, 5) - a(55, 7, 2)) >> 1;
         dJ = a[10].b(34);
         if (hA == 6) {
            dH = dH - dJ * (G.length - 1) / 2;
         } else {
            dH = dH - dJ * (G.length - 1);
         }

         dI = a(55, 7, 3);
         dK = a(55, 3, 3);
         dL = a(55, 3, 6);
         if (hA == 6) {
            dK = a(55, 3, 3);
            dL = a(55, 3, 6);
         }

         bS();
         X(6);
         if (bY == 34) {
            i(0, 5, 16, 37);
         }

         aY = true;
         if (hA == 6) {
            aZ = true;
         }
      }

      if (var0 == 1) {
         bR();
         c(false);
         al(50);
         boolean var22 = false;
         boolean var16 = true;
         byte var8 = 50;
         a(50, var16, var22, 0);
         az(2);
         bS();
         X(6);
      }

      if (var0 == 2) {
         if (r()) {
            if (hN == -1) {
               hN = 0;
            } else {
               int var9 = 0;

               int var27;
               while (true) {
                  if (var9 >= P.length) {
                     var27 = -1;
                     break;
                  }

                  int var17 = P[var9][0];
                  int var23 = P[var9][1];
                  int var4 = hL;
                  int var5 = hM;
                  int var10004 = var17 + 120 - 1;
                  int var7 = var23 + 120 - 1;
                  int var6 = var10004;
                  int var26 = var23;
                  int var25 = var17;
                  var23 = var5;
                  var17 = var4;
                  if (var4 >= var25 && var17 <= var6 && var23 >= var26 && var23 <= var7) {
                     var27 = var9;
                     break;
                  }

                  var9++;
               }

               var9 = var27;
               if (var27 == hN) {
                  hO = var9;
                  hN++;
               } else if (var9 != hO) {
                  if (var9 == -1) {
                     hO = -1;
                  } else {
                     hN = -1;
                  }
               }

               if (hN == P.length) {
                  bt = !bt;
                  hN = -1;
               }
            }
         }

         bj = bt;
         if (hA == 6 && !e(4)) {
            boolean var19 = false;
            byte var11 = 4;
            d(4, 1, false);
         }

         aY();
         ah(55);
      }

      if (var0 == 5) {
         int var12 = bZ;
         switch (bZ) {
            case 1:
               if (hA == 6) {
                  if (bY == 34) {
                     if (s.a()) {
                        T = true;
                     }

                     n(1);
                  } else if (!S && !ai) {
                     l(8);
                  } else {
                     l(eu);
                  }

                  S = false;
               } else {
                  l(44);
               }
               break;
            case 1729:
               dG = ++dG % G.length;
               bS();
               j.a("gamestate_help_subScreen.h:222:HELP_NEXT " + dG);
               break;
            case 1730:
               dG = dG == 0 ? G.length - 1 : --dG;
               bS();
               j.a("gamestate_help_subScreen.h:229:HELP_BACK " + dG);
         }
      }

      if (var0 == 3) {
         c(j.b);
         if (hA != 1 || dG != 6) {
            if (dE != -1) {
               h(false);
               am(0);
               a.e(dF);
               a.a(j.b, dE, dC, dD, 0);
            } else {
               h(false);
               am(0);
            }
         } else {
            for (int var13 = 0; var13 < 6; var13++) {
               i(55, var13 + 14, 7, -1);
            }

            am(0);
            bT();
         }

         if (hA == 6) {
            for (int var15 = 0; var15 < G.length / 2 + G.length % 2; var15++) {
               int var21 = dH + (var15 * dJ << 1);
               a[10].a(j.b, var15 == dG / 2 ? 34 : 42, var21, dI, 0);
            }
         } else {
            for (int var14 = 0; var14 < G.length; var14++) {
               int var20 = dH + (var14 * dJ << 1);
               a[10].a(j.b, var14 == dG ? 34 : 42, var20, dI, 0);
            }
         }

         if (bt) {
            bV();
         }
      }

      if (var0 == 4) {
         i(0, 5, 16, 67);
         aY = false;
         if (hA == 6) {
            aZ = false;
         }
      }
   }

   private static void a(boolean var0, boolean var1) {
      int var2 = j.b(1, 10);
      int var3 = j.b(0, 5);
      switch (o.d) {
         case 6:
            if (d != null) {
               for (int var8 = 0; var8 < d.length; var8++) {
                  i(var8, var0 ? var2 : d[var8][4], var1 ? var3 : d[var8][5]);
               }

               return;
            }
            break;
         case 7:
            if (e != null) {
               for (int var7 = 0; var7 < e.length; var7++) {
                  j(var7, var0 ? var2 : e[var7][4], var1 ? var3 : e[var7][5]);
               }

               return;
            }
            break;
         case 11:
            if (g != null) {
               for (int var5 = 0; var5 < g.length; var5++) {
                  k(var5, var0 ? var2 : g[var5][4], var1 ? var3 : g[var5][5]);
               }
            }

            if (h != null) {
               int var6;
               l(var6 = dt - 1, var0 ? var2 : h[var6][4], var1 ? var3 : h[var6][5]);
               return;
            }
            break;
         default:
            if (a[0] != null) {
               for (q var4 = a[0].a.a; var4 != null; var4 = var4.b) {
                  if (var0) {
                     var4.a = var2;
                  } else {
                     var4.b = o;
                  }
               }
            }
      }
   }

   private static void a(boolean var0, int var1) {
      j.b(1, 10);
      j.b(0, 5);
      dO = var0 ? a[o.g][bq][28 - var1] : 0;
      switch (o.d) {
         case 6:
            if (var0) {
               int var5 = z[0];
               int var9 = z[1];
               var5 *= var9;
               switch (var1) {
                  case 1:
                     da = 0;
                     db = var5 / 2 - 3;
                     break;
                  case 2:
                     da = 0;
                     db = var5 / 2 - 2;
                     break;
                  case 3:
                     db = var5 / 2;
               }
            } else {
               db = 0;
               da = 0;
            }

            x(0, 3);
            return;
         case 7:
            switch (var1) {
               case 0:
                  dj = 0;
                  dN = 0;
                  di = 0;
                  return;
               case 1:
                  dj = 1500;
                  dN = 1500;
                  di = 0;
                  return;
               case 2:
                  dj = 2500;
                  dN = 2500;
                  di = 0;
                  return;
               case 3:
                  dN = 9000;
                  dj = 9000;
                  di = 0;
               default:
                  return;
            }
         case 11:
            int var2 = H[0];
            int var7 = H[1];
            var2 *= var7;

            for (int var8 = 0; var8 < var2; var8++) {
               g[var8][6] = 3;
            }

            dv = var0 ? var1 * 20 : 0;
            return;
         default:
            if (a != null) {
               if (!var0) {
                  for (int var3 = 1; var3 < a.length; var3++) {
                     if (a[var3] != null) {
                        if (o.d == 2 && var3 == 2) {
                           a[var3].g = 0;
                        } else {
                           a[var3].g = 20;
                           a[var3].a.a = 0;
                        }
                     } else {
                        j.a("gamestate_cheat.h:294:player #" + var3 + " is null");
                     }
                  }

                  a[0].a.a = 50;
                  dN = -200;
                  a[0].g = 0;
                  return;
               }

               switch (var1) {
                  case 1:
                     if (o.d == 1) {
                        dN = 50;
                        a[0].g = 1;
                     } else {
                        dN = 100;
                        a[0].g = 5;
                        if (o.d == 2) {
                           a[2].a.a = 20;
                        }
                     }
                     break;
                  case 2:
                     if (o.d == 1) {
                        dN = 0;
                        a[0].g = 5;
                     } else if (o.d == 2) {
                        dN = 300;
                        a[0].g = 4;
                        a[2].a.a = 20;
                        a[2].g = 0;
                        a[3].a.a = 1;
                     } else {
                        dN = 400;
                        a[0].g = 7;
                     }
                     break;
                  case 3:
                     dN = 800;
                     a[0].g = 12;
               }

               a[0].a.a = 0;
            }
      }
   }

   private static void aj() {
      a(11, 1, true, true);
      aL();
   }

   private static void G(int var0) {
      if (var0 == 0) {
         ak();
         c(false);
         int var1 = aA[0];
         int var2;
         if ((var2 = E[var1][0]) > 0) {
            fV += var2;
            o(fk, fV);
         }

         z(23, fV);
         z(24, fV);
         z(25, fV);
         gv = var1;
         h(18, true);
         boolean var5 = false;
         var5 = false;
         d(0, 1, false);
         if (!V) {
            V = true;
            a(0, 1, false);
            j.g(1879048192);
            j.e(j.b, 0, 0, c.e_, c.f_);
         }
      }

      if (var0 == 2) {
         aY();
         aZ();
         g(58, 8, (System.currentTimeMillis() & 512L) != 0L);
         if (c(0, 0, c.e_, c.f_)) {
            int var7 = 0;
            var7 = (byte)15;
            d(15, 1, false);
            var7 = aA[0];

            for (int var11 = 1; var11 < aA.length; var11++) {
               aA[var11 - 1] = aA[var11];
            }

            gw--;
            bF();
            l(bY);
         }
      }

      if (var0 == 3) {
         if (bY == 42) {
            int var10 = j.i();
            int var12 = j.j();
            int var3 = j.k();
            int var4 = j.l();
            j.a(j.b, 0, 0, c.e_, c.f_);
            c(j.b);
            j.a(j.b, var10, var12, var3, var4);
         }

         am(2);
      }

      if (var0 == 4) {
         al();
         if (gw != 0 || bY != 42) {
            V = false;
         }
      }
   }

   private static void ak() {
      Z(71);
      a(47, 1, true, true);
      aL();
   }

   private static void al() {
      Z(47);
      aL();
   }

   private static void H(int var0) {
      if (var0 == 0) {
         c(false);
         aL();
         aV();
         ag(19);
         if (bY != 1 && bY != 8) {
            az(2);
         } else {
            az(0);
         }

         short var1 = 513;
         String var10001 = a(513, (int)0);
         byte var5 = 0;
         var5 = 3;
         var5 = 17;
         short var8 = 0;
         String var2 = var10001;
         String var9 = "";
         gp = 17;
         gq = 3;
         gr = 0;
         bg = true;
         bh = false;
         a(var9, true);
         al(9);
         boolean var4 = false;
         boolean var3 = true;
         var8 = (byte)9;
         a(9, var3, var4, 0);
         gt = 0;
         gs = -1;
         au(0);
         f(9, true);
         g(9, true);
         bo();
         if (var2 != null) {
            b(17, 3, var2);
            g(17, 3, true);
         }

         var8 = 610;
         b(17, 4, a(a(610, (int)0), 3));
         if (bY == 8) {
            var8 = 273;
            String var18 = a(273, (int)0);
            boolean var13 = false;
            a(0, var18, -1, 0);
         }
      }

      if (var0 == 5) {
         int var14 = bZ;
         if (bg) {
            if (var14 == 1) {
               bp();
               if (W) {
                  m(4);
               } else {
                  m(39);
               }
            } else {
               switch (var14) {
                  case 2:
                     bp();
               }
            }
         } else {
            switch (var14) {
               case 1109:
                  var14 = gr;
                  String var17 = r;
                  if (var14 == 0) {
                     i = var17;
                     a(s, i);
                     b(s, j);
                     ab(s);
                     byte var16 = 1;
                     if (i(s, var16) == 1) {
                        m(26);
                     } else if (W) {
                        X = true;
                        m(26);
                     } else {
                        m(39);
                     }

                     f(4, 1);
                  } else {
                     new StringBuffer().append("state_enter_name - Input msg VKEYBOARD_ENTRY_DONE - Unexpected keyb context (").append(var14).append(")");
                  }
            }
         }
      }

      if (var0 == 2) {
         aY();
         aZ();
      }

      if (var0 == 3) {
         am(0);
      }

      if (var0 == 4) {
         W = false;
         aL();
      }
   }

   private static void I(int var0) {
      if (var0 == 0) {
         dP = -1;
         c(false);
         ag(63);
         byte var2 = 1;
         if (i(s, var2) == 1) {
            az(0);
         } else {
            az(2);
         }

         al(24);
         boolean var1 = false;
         boolean var3 = true;
         var2 = 24;
         a(24, var3, var1, 0);
         var2 = 63;
         s(63, a[var2].length + 3);
         h(63, 2);
         var1 = false;
         var2 = 1;
         if (i(s, var2) == 1) {
            var1 = true;
         }

         if (var1 || fH != 0) {
            i(583, 0);
         }

         if (var1 || fH != 2) {
            i(587, 0);
         }

         if (var1 || fH != 1) {
            i(585, 0);
         }

         if (var1 || fH != 4) {
            i(586, 0);
         }

         if (var1 || fH != 3) {
            i(588, 0);
         }

         if (var1 || fH != 5) {
            i(584, 0);
         }

         if (var1 || fH != 16) {
            i(592, 0);
         }

         if (var1 || fH != 15) {
            i(593, 0);
         }
      }

      if (var0 == 5) {
         int var5 = bZ;
         byte var9 = 1;
         if (i(s, var9) == 1 && var5 == 1) {
            return;
         }

         if (var5 == 1) {
            boolean var12 = false;
            var9 = 14;
            d(14, 1, false);
         } else {
            boolean var13 = false;
            var9 = 16;
            d(16, 1, false);
         }

         switch (var5) {
            case 1:
               l(8);
               break;
            case 1030:
               J(0);
               break;
            case 1031:
               J(2);
               break;
            case 1032:
               J(1);
               break;
            case 1033:
               J(3);
               break;
            case 1034:
               J(4);
               break;
            case 1035:
               J(5);
               break;
            case 1036:
               J(16);
               break;
            case 1037:
               J(15);
               break;
            case 1038:
               am();
         }
      }

      if (var0 == 2) {
         aY();
      }

      if (var0 == 3) {
         b(j.b);
         am(0);
      }
   }

   private static void J(int var0) {
      dP = var0;
      short var1 = 1;
      if (i(s, var1) == 1) {
         ao(var0);
         K(var0);
         m(18);
      } else if (aC[8] != 4) {
         var1 = 594;
         a(1, a(594, (int)0), 16, 4);
      } else {
         am();
      }
   }

   private static void am() {
      ao(dP);
      K(dP);
      byte var0 = 4;
      if (i(s, var0) == 0) {
         var0 = 65;
         i = a(65, (int)0);
      }

      n(1);
   }

   private static void K(int var0) {
      short[] var1 = null;
      j.a("gamestate_language_selection.h:281:langselect_LoadFonts() - _iLangCode:" + var0 + "    (GLLang.TH=" + 15 + ", GLLang.VI=" + 16 + ")");
      b[0] = null;
      b[1] = null;
      if (var0 != 15 && var0 != 16) {
         j.b("/2");
         j.a("gamestate_language_selection.h:352:== Pack_Open PACK_FONT ==");
         b[0] = a(1, 31, false, false);
         b[1] = a(3, 15, false, false);
         var1 = (short[])j.a(0);
         j.l();
      }

      b[0].a(var1);
      b[1].a(var1);
      b[0].d(1);
   }

   private static void L(int var0) {
      if (var0 == 0) {
         c(false);
         al(51);
         int var2 = 0;
         boolean var1 = true;
         int var3 = 51;
         a(51, var1, (boolean)var2, 0);
         az(2);

         for (int var4 = 0; var4 < 4; var4++) {
            var2 = var4;
            if (d[var2] == 0) {
               a(66, var2 + 2, a(var3 = var2 + 665, (int)0));
            } else {
               a(66, var2 + 2, a(var3 = var2 + 648, (int)0));
            }

            if (e[var2]) {
               i(66, var2 + 6, 16, 22);
               i(66, var2 + 6, 7, 0);
               i(66, var2 + 6, 9, 3);
               i(66, var2 + 6, 11, 3);
            } else {
               i(66, var2 + 6, 16, 23);
               i(66, var2 + 6, 7, 4);
               i(66, var2 + 6, 9, 5);
               i(66, var2 + 6, 11, 5);
            }

            an();
         }

         X(4);
      }

      if (var0 == 5) {
         int var5 = bZ;
         switch (bZ) {
            case 1:
               m(4);
               break;
            case 1013:
               n(0);
               ad(s);
               o.a(3);
               o.b(o.i);
               boolean var6 = false;
               byte var10 = 15;
               d(15, 1, false);
               break;
            case 1014:
               N(0);
               break;
            case 1015:
               N(1);
               break;
            case 1016:
               N(2);
               break;
            case 1017:
               N(3);
               break;
            case 1018:
               M(0);
               break;
            case 1019:
               M(1);
               break;
            case 1020:
               M(2);
               break;
            case 1021:
               M(3);
         }
      }

      if (var0 == 2) {
         aY();
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
      }

      if (var0 == 4) {
         c(false);
      }
   }

   private static void M(int var0) {
      byte var1 = 0;
      var1 = 16;
      d(16, 1, false);
      e[var0] = !e[var0];
      if (e[var0]) {
         i(66, var0 + 6, 16, 22);
         i(66, var0 + 6, 6, 1);
         i(66, var0 + 6, 8, 40);
         i(66, var0 + 6, 10, 40);
      } else {
         i(66, var0 + 6, 16, 23);
         i(66, var0 + 6, 6, 38);
         i(66, var0 + 6, 8, 41);
         i(66, var0 + 6, 10, 41);
      }
   }

   private static void N(int var0) {
      int var1 = 0;
      var1 = (byte)16;
      d(16, 1, false);
      if (d[var0] == 0) {
         d[var0] = 1;
         a(66, var0 + 2, a(var1 = var0 + 648, (int)0));
      } else {
         d[var0] = 0;
         a(66, var0 + 2, a(var1 = var0 + 665, (int)0));
      }

      an();
   }

   private static void an() {
      int var0 = 0;

      for (int var1 = 0; var1 < 4; var1++) {
         if (d[var1] == 0) {
            var0++;
         }
      }

      if (var0 < 2) {
         b(66, 0, false);
      } else {
         b(66, 0, true);
      }
   }

   private static void O(int var0) {
      if (var0 == 0) {
         j = null;
         ab = false;
         i = null;
         Z = false;
         ac = false;
         c(false);
         az(2);
         al(29);
         boolean var3 = false;
         int var1 = 1;
         int var2 = 29;
         a(29, (boolean)var1, var3, 0);
         var3 = false;
         var1 = (boolean)1;
         var2 = (byte)33;
         a(33, var1, var3, 0);
         Q(o.g);
         ao();
         b(28, 7, a(var2 = 204 + o.g, (int)0));
         b(28, 1, e(y()) + "/" + e(90));
         i(28, 5, 7, 0);
         g(false);
         int var12 = 28;
         var1 = a[var12].length;
         i(28, 13, 7, o.g << 1);
         i(28, 13, 9, (o.g << 1) + 1);
         i(28, 13, 13, (o.g << 1) + 1);
         var12 = (byte)28;
         s(28, a[var12].length + 12);

         for (int var14 = 0; var14 < 5; var14++) {
            if (var14 != 0) {
               for (int var20 = 0; var20 < 3; var20++) {
                  short var4 = a(28, var20 + 13, 2);
                  short var5 = a(28, var20 + 13, 3);
                  f(28, var20 + 13, var1);
                  i(28, var1, 2, var4 + (c.e_ - var4 * 2) * var14 / 4 + 0);
                  i(28, var1, 3, var5);
                  if (var20 == 0) {
                     i(28, var1, 7, o.g << 1);
                     i(28, var1, 9, (o.g << 1) + 1);
                     i(28, var1, 13, (o.g << 1) + 1);
                  }

                  var1++;
               }
            }
         }

         for (int var15 = 0; var15 < 5; var15++) {
            var3 = m(o.g, var15);
            h(28, 15 + var15 * 3, var3);
            i(28, 15 + var15 * 3, 6, 0 + e(o.g, var15));
            int var22;
            if (var3) {
               var22 = a[o.g][var15][0];
            } else {
               var22 = 12;
            }

            i(28, 13 + var15 * 3, 6, var22);
            i(28, 13 + var15 * 3, 8, var22);
            i(28, 13 + var15 * 3, 10, var22);
         }

         var12 = fr + o.g;
         var12 = i(s, var12);
         aa = false;
         j.a("gamestate_stage_select_compact.h:223:needsToAnimateNewStage " + var12 + " s_iSelectedVenue " + o.g);
         if (var12 > -1) {
            S(var12);
         }

         Y = false;
         j.a(a, 0, 0, c.e_, c.f_);
         a(o.g, a);
         X(19);
      }

      if (var0 == 1) {
         j.a("gamestate_stage_select_compact.h:258:STAGE_SELECT_COMPACT k_enter_light");
         j = null;
         c(false);
         az(2);
         ak(29);
         ak(33);
         if (Y) {
            az(2);
         }

         ao();
         if (ac) {
            (i = new p(a[7], -100, -100)).b(a[o.g][bq][0], -1);
            short var8 = a(28, 13 + bq * 3, 2);
            short var18 = a(28, 13 + bq * 3, 3);
            i.a(var8, var18);
            j.a(
               "GetParamValue(k_gameStageSelect_Compact, k_StageSelect_Compact_Button_Stage1 + (s_iSelectedStage*STAGE_NUM_GUI_ELEMS), BUTTON_PALETTEHIGHLIGHTED)="
                  + a(28, 13 + bq * 3, 11)
            );
            i.a(a(28, 13 + bq * 3, 11));
         }

         if (ab) {
            S(1);
         }

         b(28, 1, e(y()) + "/" + e(90));
         g(false);
         j.a(a, 0, 0, c.e_, c.f_);
         a(o.g, a);
      }

      if (var0 == 5) {
         int var9 = bZ;
         switch (bZ) {
            case 1:
               m(G());
               n(13);
               break;
            case 5:
               l(o.g, bq);
            case 1008:
            default:
               break;
            case 1133:
            case 1134:
            case 1135:
            case 1136:
            case 1137:
               bq = var9 - 1133;
               ac = true;
               R(bq);
         }
      }

      if (var0 == 2) {
         aY();
         aZ();
         if (i != null) {
            i.b(j.a_);
         }

         if (j != null) {
            j.b(j.a_);
         }

         if (aa) {
            g.a(j.a_);
         }

         if (Z) {
            g(28, 2, j.b_ % 800 >= 300);
         }
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
      }

      if (var0 == 4) {
         if (j != null) {
            j.a();
         }

         c(false);
      }
   }

   private static void P(int var0) {
      a(var0, j.b);
   }

   private static void a(int var0, Graphics var1) {
      if (a[var0 + 72] != null) {
         a[var0 + 72].a(var1, 0, 0, 0, 0);
      }
   }

   private static void Q(int var0) {
      for (int var1 = 0; var1 < 6; var1++) {
         Z(var1 + 72);
      }

      if (var0 >= 0) {
         a(var0 + 72, 1, true, true);
      }

      m(72, 6);
   }

   private static void R(int var0) {
      boolean var1;
      if (!(var1 = m(o.g, var0))) {
         boolean var2 = false;
         byte var3 = 13;
         d(13, 1, false);
      }

      Y = true;
      if (var1) {
         az(2);
         b(29, 12, e(a[o.g][bq][18]));
         b(29, 17, e(a[o.g][bq][19]));
         b(29, 18, e(a[o.g][bq][20]));
         b(29, 19, e(a[o.g][bq][21]));
         int var16;
         b(30, 0, a(var16 = 297 + a[o.g][bq][0], (int)0));
         b(30, 2, e(a[o.g][bq][17]));
         g(28, 12, false);
         var1 = o.g * 5 + var0;
         var16 = fj + var1;
         int var11 = i(s, var16);
         var1 = e(o.g, var0);
         g(28, 10, true);
         b(28, 10, a(var16 = 297 + a[o.g][var0][0], (int)0));
         g(28, 11, true);
         StringBuffer var10002 = new StringBuffer();
         short var19 = 342;
         b(28, 11, var10002.append(a(342, (int)0)).append(e(var11)).toString());
         if (var11 > 0) {
            h(28, 9, true);
            i(28, 9, 6, var1 + 4);
         } else {
            h(28, 9, false);
         }

         g(28, 2, true);
         var19 = 510;
         b(28, 2, a(510, (int)0));
         Z = true;
      } else {
         az(2);
         int var21 = 664;
         String var6 = a(664, (int)0);
         c[0] = "" + (var0 - 1);
         String var7 = a(var6, c, '#');
         b(28, 12, var7);
         g(28, 12, true);
         g(28, 10, true);
         b(28, 10, a(var21 = 297 + a[o.g][var0][0], (int)0));
         g(28, 11, false);
         h(28, 9, false);
         g(28, 2, false);
         Z = false;
      }

      label44: {
         if (Z) {
            int var12 = 13 + var0 * 3;
            byte var8 = 28;
            if ((c[28][var12] & 2) != 0) {
               boolean var14 = false;
               byte var24 = 15;
               d(15, 1, false);
               k(5, 5);
               break label44;
            }
         }

         boolean var13 = false;
         byte var23 = 16;
         d(16, 1, false);
      }

      for (int var9 = 0; var9 < 5; var9++) {
         f(28, 13 + var9 * 3, var9 == var0);
      }

      g(28, 8, false);
      if (i == null) {
         i = new p(a[7], -100, -100);
      }

      i.b(a[o.g][var0][0], -1);
      short var10 = a(28, 13 + var0 * 3, 2);
      short var15 = a(28, 13 + var0 * 3, 3);
      i.a(var10, var15);
      i.a(a(28, 13 + var0 * 3, 11));
   }

   private static int e(int var0, int var1) {
      int var3 = var1;
      int var2 = var0 * 5 + var3;
      var2 = fj + var2;
      if ((var2 = i(s, var2)) >= a[var0][var1][25]) {
         return 3;
      } else if (var2 >= a[var0][var1][26]) {
         return 2;
      } else {
         return var2 >= a[var0][var1][27] ? 1 : 0;
      }
   }

   private static void S(int var0) {
      j.a("gamestate_stage_select_compact.h:889:stage_select_compact_unlockEffects() - stage:" + var0);
      if (var0 == 0) {
         ab = true;
         b(28, 16, false);
         i(28, 16, 6, 12);
      }

      if (var0 >= 5) {
         var0 = 4;
      }

      o(fr + o.g, -1);
      (j = new p(a[7], -100, -100)).b(12, 1);
      short var1 = a(28, 13 + var0 * 3, 2);
      short var2 = a(28, 13 + var0 * 3, 3);
      j.a(var1, var2);
      j.a(o.g << 1);
      (g = l.a(3, 300, 500, var1, var2, 1, 1, -j.c(250), j.c(250), -j.c(350), j.c(350), 0, 0, -1, -1, 8)).a();
      aa = true;
      byte var3 = 0;
      var3 = 17;
      d(17, 1, false);
   }

   private static void ao() {
      Graphics var0 = j.b;
      j.b = a;

      try {
         int var1 = o.g;
         a(o.g, j.b);
      } catch (Exception var2) {
         j.a("gamestate_stage_select_compact.h:971:Exception setting loading backbuffer: " + var2.toString() + "  " + var2.getMessage());
      }

      j.b = var0;
   }

   private static void T(int var0) {
      if (var0 == 0) {
         t = false;
         al = false;
         dX = 0;
         c(false);
         al(41);
         boolean var3 = false;
         boolean var2 = true;
         short var1 = 41;
         a(41, var2, var3, 0);
         dS = 4;
         if (o.d != 6 && o.d != 7 && o.d != 11) {
            if (o.c()) {
               dS = 2;
            } else if (o.d()) {
               dS = 3;
            }

            if (dS > 3) {
               dS = 3;
            }

            if (bY != 41) {
               V(K[0]);
            }
         } else {
            dS = 1;
         }

         eb = -1;
         at();
         (h = l.a(10, 2000, 500, c.bA - 300, c.bB - 150, 600, 300, -j.c(1), j.c(1), -j.c(1), j.c(1), 0, 0, -1, -1, 8)).a();
         if (o.a() == 1) {
            if (o.d == 8) {
               K[0] = 4;

               for (int var6 = 0; var6 < 3; var6++) {
                  if (i[var6][0] == 1) {
                     K[0]--;
                  }
               }
            } else if (o.d == 10) {
               K[0] = 4;

               for (int var5 = 0; var5 < 3; var5++) {
                  if (i[var5][0] == 1) {
                     K[0]--;
                  }
               }
            } else if (o.d == 3) {
               if (o.c == 3 && K[0] == 1) {
                  K[0] = 1;
               } else {
                  K[0] = 5 - o.c;
               }
            }
         }

         j.a("gamestate_debriefing_tally.h:309:cRules.s_gameType:" + o.i);
         if (o.d == 6) {
            var1 = 280;
            String var8 = a(a(280, (int)0), db);
            b(22, 14, var8);
         } else if (o.d == 7) {
            var1 = 284;
            String var10 = a(a(284, (int)0), db);
            b(22, 14, var10);
         } else if (o.d == 11) {
            var1 = 284;
            String var12 = a(a(284, (int)0), db);
            b(22, 14, var12);
         } else {
            b(22, 14, a(275 + K[0] - 1, (int)0));
         }

         i(22, 4, 6, 4 - K[0]);
         if (o.a == 1) {
            i(22, 5, 6, v());
         } else {
            i(22, 5, 6, w());
         }

         eg = ga;
         eh = gb;
         j.a("gamestate_debriefing_tally.h:350:s_player_tickets_fake:" + ga);
         j.a("gamestate_debriefing_tally.h:351:s_player_tickets_fake_base:" + eg);
         j.a("gamestate_debriefing_tally.h:352:s_player_XP_fake:" + gb);
         ei = 0;
         ej = 0;
         var3 = false;
         var2 = true;
         byte var13 = 33;
         a(33, var2, var3, 0);
         ad = false;
         ae = false;
         g(true);
         U(0);
         X(15);
         ag = false;
         ah = false;
      }

      if (var0 == 1) {
         c(false);
         ak(41);
         ak(33);
         j.a("gamestate_debriefing_tally.h:416:debriefing_iNumPlayers:" + dS);
         if (o.d == 6 || o.d == 7 || o.d == 11) {
            dS = 1;
         }

         a[0].e();
         at();
         if (ee == 9) {
            ga = fV;
            ad = true;
            ae = true;
         } else {
            ad = false;
            ae = false;
         }

         g(true);
         if (gw == 0) {
            X(15);
         }

         ag = false;
         ah = false;
      }

      if (var0 == 5) {
         int var14 = bZ;
         switch (bZ) {
            case 1:
            case 1280:
               if (ad) {
                  fS = 0;
                  if (o.a() == 1) {
                     if (t() == 0 && bq == 4 && !c(1)) {
                        ah = true;
                     } else {
                        n(4);
                     }
                  } else {
                     n(1);
                  }
               }
         }
      }

      if (var0 == 2) {
         aY();
         if (a[0] != null) {
            a[0].c();
         }

         l var15 = h;
         if (h.a > 0) {
            h.a(j.a_);
         }

         g(22, 14, (System.currentTimeMillis() & 512L) != 0L);
         ar();
         aZ();
         R();
      }

      if (var0 == 3) {
         c(j.b);
         if (ee == 9 && !ag && (ah || gw > 0)) {
            j.a(a, 0, 0, c.e_, c.f_);
            j.b = a;
         }

         if (!ag) {
            h(40, 0, true);
            e(40, 0, 0, 0);
            h(40, 0, false);
            j.a(0, 0, c.e_, a(40, 0, 3) + 50);
            if (a[0] != null) {
               a[0].d();
            }

            j.a(0, 0, c.e_, c.f_);
            am(0);
            S();
            switch (ee) {
               case 0:
                  l var26 = h;
                  if (h.a > 0) {
                     try {
                        h.a(j.b, a[188], 3, 0, 0, false);
                     } catch (Exception var4) {
                        j.a("gamestate_debriefing_tally.h:641:Tally - Exception painting sparkles: " + var4.toString() + " - " + var4.toString());
                     }
                  }
                  break;
               case 1:
                  j.a(0, 0, dX, c.f_);
                  a[43].a(j.b, 0, dT, dU, 0);
                  j.a(0, 0, c.e_, c.f_);
                  if (af) {
                     a[43].a(j.b, 4, dX, dU, 0);
                  } else if (dX - dY >= 20) {
                     a[43].a(j.b, 3, dX, dU, 0);
                  }

                  for (int var25 = 0; var25 < 3; var25++) {
                     a[43].a(j.b, 2, R[var25], dU, 0);
                     if (o.a() == 1) {
                        if (R[var25] <= dX) {
                           a[11].a(j.b, 8, R[var25], dU, 0);
                        } else {
                           a[11].a(j.b, 9, R[var25], dU, 0);
                        }
                     } else if (R[var25] <= dX) {
                        a[10].a(j.b, 44, R[var25], dU, 0);
                     } else {
                        a[10].a(j.b, 65, R[var25], dU, 0);
                     }
                  }
                  break;
               case 2:
                  j.a(0, 0, dX, c.f_);
                  a[43].a(j.b, 0, dT, dU, 0);
                  j.a(0, 0, c.e_, c.f_);
                  if (af) {
                     a[43].a(j.b, 4, dX, dU, 0);
                  } else if (dX - dY >= 20) {
                     a[43].a(j.b, 3, dX, dU, 0);
                  }

                  for (int var22 = 0; var22 < 3; var22++) {
                     a[43].a(j.b, 2, R[var22], dU, 0);
                     if (o.a() == 1) {
                        if (R[var22] <= dX) {
                           a[11].a(j.b, 8, R[var22], dU, 0);
                        } else {
                           a[11].a(j.b, 9, R[var22], dU, 0);
                        }
                     } else if (R[var22] <= dX) {
                        a[10].a(j.b, 44, R[var22], dU, 0);
                     } else {
                        a[10].a(j.b, 65, R[var22], dU, 0);
                     }
                  }

                  l var23 = i;
                  if (i.a > 0) {
                     i.a(j.b, a[69], 1, 0, 0, false);
                  }

                  if (j != null) {
                     var23 = j;
                     if (j.a > 0) {
                        j.a(j.b, a[10], 1, 0, 0, false);
                     }
                  }
                  break;
               case 3:
                  l var21 = i;
                  if (i.a > 0) {
                     i.a(j.b, a[69], 1, 0, 0, false);
                  }
               case 4:
               case 5:
               case 6:
               default:
                  break;
               case 7:
                  l var20 = i;
                  if (i.a > 0) {
                     i.a(j.b, a[69], 1, 0, 0, false);
                  }
                  break;
               case 8:
                  j.a(0, 0, dX, c.f_);
                  a[43].a(j.b, 0, dT, dU, 0);
                  j.a(0, 0, c.e_, c.f_);
                  if (af) {
                     a[43].a(j.b, 4, dX, dU, 0);
                  } else if (dX - dY >= 20) {
                     a[43].a(j.b, 3, dX, dU, 0);
                  }

                  for (int var17 = 0; var17 < 3; var17++) {
                     a[43].a(j.b, 2, R[var17], dU, 0);
                     if (o.a() == 1) {
                        if (R[var17] <= dX) {
                           a[11].a(j.b, 8, R[var17], dU, 0);
                        } else {
                           a[11].a(j.b, 9, R[var17], dU, 0);
                        }
                     } else if (R[var17] <= dX) {
                        a[10].a(j.b, 44, R[var17], dU, 0);
                     } else {
                        a[10].a(j.b, 65, R[var17], dU, 0);
                     }
                  }

                  l var18 = i;
                  if (i.a > 0) {
                     i.a(j.b, a[69], 1, 0, 0, false);
                  }

                  if (j != null) {
                     var18 = j;
                     if (j.a > 0) {
                        j.a(j.b, a[10], 1, 0, 0, false);
                     }
                  }
                  break;
               case 9:
                  j.a(0, 0, dX, c.f_);
                  a[43].a(j.b, 0, dT, dU, 0);
                  j.a(0, 0, c.e_, c.f_);
                  if (af) {
                     a[43].a(j.b, 4, dX, dU, 0);
                  } else if (dX - dY >= 20) {
                     a[43].a(j.b, 3, dX, dU, 0);
                  }

                  for (int var16 = 0; var16 < 3; var16++) {
                     a[43].a(j.b, 2, R[var16], dU, 0);
                     if (o.a() == 1) {
                        if (R[var16] <= dX) {
                           a[11].a(j.b, 8, R[var16], dU, 0);
                        } else {
                           a[11].a(j.b, 9, R[var16], dU, 0);
                        }
                     } else if (R[var16] <= dX) {
                        a[10].a(j.b, 44, R[var16], dU, 0);
                     } else {
                        a[10].a(j.b, 65, R[var16], dU, 0);
                     }
                  }
            }

            if (ee == 9 && (ah || gw > 0)) {
               j.g(-1610612736);
               j.e(j.b, 0, 0, c.e_, c.f_);
            }
         }

         if (ee == 9 && (ah || gw > 0)) {
            j.b = null;
            j.a((Graphics)null);
            c(j.b);
            ag = true;
            if (ah) {
               u(1);
            }
         }
      }

      if (var0 == 4) {
         c(false);
         ad = true;
         ae = true;
      }
   }

   private static boolean l() {
      boolean var0 = false;
      switch (o.a) {
         case 2:
            if (o.f()) {
               int var4;
               if ((var4 = t()) == 0 || var4 == 5) {
                  var0 = true;
               }
            } else if (o.i != 0 && o.i != 2 && o.i != 1) {
               int var6 = 0;
               int var2 = 0;

               while (var6 < 4) {
                  if (c[var6] >= c) {
                     var2++;
                  }

                  var6++;
               }

               if (var2 >= 3) {
                  var0 = true;
               }

               if (c[0] >= c) {
                  var0 = true;
               }
            } else {
               for (int var5 = 0; var5 < 4; var5++) {
                  if (c[var5] >= c) {
                     var0 = true;
                     return var0;
                  }
               }
            }
            break;
         case 3:
            var0 = true;
            break;
         default:
            if (o.f()) {
               int var1;
               if ((var1 = t()) == 0 || var1 == 5) {
                  var0 = true;
               }
            } else {
               for (int var3 = 0; var3 < 4; var3++) {
                  if (Q[var3] >= c) {
                     var0 = true;
                     break;
                  }
               }
            }
      }

      return var0;
   }

   private static boolean m() {
      if (o.a() != 1) {
         return false;
      }

      boolean var0 = true;
      if (o.f()) {
         int var1;
         if ((var1 = t()) == 0) {
            var0 = true;
         } else {
            if (var1 == 5) {
               o.h = 10000;
            }

            var0 = false;
         }
      } else if (o.e()) {
         for (int var2 = 1; var2 < 4; var2++) {
            if (c[var2] < c) {
               var0 = false;
            }
         }

         if (c[0] >= c) {
            var0 = false;
            o.h = 10000;
         }
      } else if (o.i == 2) {
         if (c[0] < c) {
            var0 = false;
         }

         if (c[1] >= c) {
            var0 = false;
            o.h = 10000;
         }
      } else {
         for (int var3 = 1; var3 < 4; var3++) {
            if (a[var3].a != 2 && c[var3] >= c[0]) {
               var0 = false;
               break;
            }
         }
      }

      return var0;
   }

   private static int t() {
      if (o.i != 6 && o.i != 7 && o.i != 11) {
         int var0;
         if (o.f()) {
            if (a[0].a == 2) {
               var0 = 5;
            } else {
               boolean var2 = true;

               for (int var1 = 1; var1 < 4; var1++) {
                  if (a[var1].a != 2) {
                     var2 = false;
                     break;
                  }
               }

               if (var2) {
                  var0 = 0;
               } else {
                  var0 = 4;
               }
            }
         } else if (o.i == 2) {
            if (a.b != 0 && a.b != 2) {
               var0 = 5;
            } else {
               var0 = 0;
            }
         } else {
            var0 = a.a;
         }

         if (o.a == 3) {
            var0 = 0;
         }

         return var0;
      } else {
         return 0;
      }
   }

   private static void ap() {
      j.a("gamestate_debriefing_tally.h:1149:Score_UpdateScore()");
      int var0 = a.b;
      j.a("gamestate_debriefing_tally.h:1152:Default winner: " + var0);

      for (int var1 = 0; var1 < 4; var1++) {
         if (a.equals(a[var1])) {
            j.a("gamestate_debriefing_tally.h:1157:Found winner: " + var1);
            var0 = var1;
            break;
         }
      }

      P[var0] = c[var0];

      for (int var5 = 0; var5 < 4; var5++) {
         J[var5] = c[var5];
         O[var5] = c[var5];
      }

      if (o.i == 2) {
         if (var0 % 2 == 0) {
            if (var0 == 0) {
               dR = 2;
            } else {
               dR = 0;
            }
         } else if (var0 == 1) {
            dR = 3;
         } else {
            dR = 1;
         }

         c[dR] = c[var0];
      }

      j.a("gamestate_debriefing_tally.h:1187:...adding score (Winner:" + var0 + ")");

      for (int var6 = 0; var6 < 4; var6++) {
         j.a("gamestate_debriefing_tally.h:1222::::player " + var6 + " ...");
         n var2;
         j.a("gamestate_debriefing_tally.h:1224::::CardList size " + (var2 = a[var6]).a);

         for (q var7 = a[var6].a; var7 != null; var7 = var7.b) {
            j.a("gamestate_debriefing_tally.h:1228:...checking card...");
            j.a("gamestate_debriefing_tally.h:1230:...adding score for card of type " + var7.a);
            int var10002 = c[var6];
            int var3 = var7.a;
            int var4 = 0;
            if (var3 <= 9) {
               var4 = var3;
            } else if (var3 <= 12) {
               var4 = 20;
            } else if (var3 <= 14) {
               var4 = 50;
            }

            c[var6] = var10002 + var4;
            c[var6]++;
            j.a("gamestate_debriefing_tally.h:1234:...score of player: " + c[var6]);
         }

         P[var6] = c[var6];
      }

      if (o.i == 2) {
         c[dR] = c[var0];
      }
   }

   public static void d() {
      for (int var0 = 0; var0 < 4; Q[var0] = var0++) {
         c[var0] = 0;
      }
   }

   private static int u() {
      j.a("gamestate_debriefing_tally.h:1417:tally_getStagePoints() - s_cheats_result_order:" + dO);
      if (dO > -1) {
         j.a("gamestate_debriefing_tally.h:1420:tally_getStagePoints    result: " + dO);
         return dO;
      } else if (o.d == 6) {
         return M[0];
      } else if (o.d == 7) {
         return M[0];
      } else if (o.d == 11) {
         return M[0] + dy * H[8];
      } else if (o.d == 1) {
         return M[0] + dQ + ao[7 + K[0] - 1];
      } else if (o.d == 2) {
         return M[0] + dQ + ao[7 + (K[0] - 1 >> 1)];
      } else if (o.d == 3) {
         j.a("gamestate_debriefing_tally.h:1436: won elimination as s_result_score[0] = " + M[0] + "s_turn_score " + dQ);
         return M[0] + dQ + ao[3 + K[0] - 1];
      } else {
         return M[0] + dQ + ao[3 + K[0] - 1];
      }
   }

   private static int v() {
      int var0;
      if ((var0 = u()) >= a[o.g][bq][25]) {
         return 3;
      } else if (var0 >= a[o.g][bq][26]) {
         return 2;
      } else {
         return var0 >= a[o.g][bq][27] ? 1 : 0;
      }
   }

   private static int w() {
      int var0;
      if ((var0 = u()) >= an[5]) {
         return 3;
      } else if (var0 >= an[6]) {
         return 2;
      } else {
         return var0 >= an[7] ? 1 : 0;
      }
   }

   private static void aq() {
      if (o.d == 6) {
         U(8);
      } else if (o.d == 7) {
         U(8);
      } else if (o.d == 11) {
         if (ej == 1) {
            U(8);
         } else {
            ej++;
            U(4);
         }
      } else if (ej == 1) {
         U(8);
      } else {
         ej++;
         U(4);
      }
   }

   private static void U(int var0) {
      ee = var0;
      ef = 0;
      switch (var0) {
         case 0:
            (i = l.a(15, 200, 1500, a(22, 4, 2), a(22, 4, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 1:
            (i = l.a(15, 200, 1500, a(40, 11, 2), a(40, 11, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 2:
            eb = -1;
            if (o.a == 1) {
               var0 = v();
            } else {
               var0 = w();
            }

            switch (var0) {
               case 0:
                  eb = 23;
                  break;
               case 1:
                  eb = 6;
                  break;
               case 2:
                  eb = 3;
                  break;
               case 3:
                  eb = 13;
            }

            c.d(c.a[eb]);
            c.a(eb, true);
            (i = l.a(15, 200, 1500, a(40, 11, 2), a(40, 11, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 3:
            h(22, 1, true);
            h(22, 4, true);
            g(22, 8, true);
            g(22, 11, false);
            (i = l.a(15, 200, 1500, a(22, 4, 2), a(22, 4, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 4:
            short var10 = 0;
            var10 = (byte)11;
            d(11, 1, false);
            h(40, 7, true);
            g(40, 15, true);
            g(40, 14, true);
            if (o.d == 6) {
               g(40, 16, true);
               g(40, 17, true);
               var10 = 309;
               b(40, 16, a(309, (int)0));
            } else if (o.d == 7) {
               g(40, 16, true);
               g(40, 17, true);
               var10 = 313;
               b(40, 16, a(313, (int)0));
            } else if (o.d == 11) {
               if (ej == 1) {
                  g(40, 16, true);
                  g(40, 17, true);
                  var10 = 310;
                  b(40, 16, a(310, (int)0));
               } else if (ej == 0) {
                  g(40, 20, true);
                  g(40, 21, true);
                  var10 = 313;
                  b(40, 20, a(313, (int)0));
               }
            } else if (ej == 1) {
               g(40, 16, true);
               g(40, 17, true);
               var10 = 310;
               b(40, 16, a(310, (int)0));
            } else if (ej == 0) {
               g(40, 20, true);
               g(40, 21, true);
               var10 = 311;
               b(40, 20, a(311, (int)0));
            }

            (i = l.a(15, 200, 1500, a(40, 15, 2), a(40, 15, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 5:
            return;
         case 6:
            g(22, 9, true);
            g(22, 11, true);
            g(22, 12, true);
            if (o.d == 6) {
               short var4 = 309;
               b(22, 11, a(309, (int)0));
            } else if (o.d == 7) {
               short var5 = 309;
               b(22, 11, a(309, (int)0));
            } else if (o.d == 11) {
               if (ej == 1) {
                  short var6 = 310;
                  b(22, 11, a(310, (int)0));
               } else if (ej == 0) {
                  short var7 = 309;
                  b(22, 11, a(309, (int)0));
               }
            } else if (ej == 1) {
               short var8 = 310;
               b(22, 11, a(310, (int)0));
            } else if (ej == 0) {
               short var9 = 311;
               b(22, 11, a(311, (int)0));
            }

            (i = l.a(15, 200, 1500, a(40, 19, 2), a(40, 19, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 7:
            (i = l.a(15, 200, 1500, a(40, 15, 2), a(40, 15, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            return;
         case 8:
            if (u() != 0) {
               byte var2 = 0;
               var2 = 22;
               d(22, 1, false);
            }

            g(40, 15, true);
            h(40, 6, true);
            h(40, 5, true);
            h(40, 8, true);
            g(40, 12, true);
            g(40, 11, true);
            b(40, 12, "+ ");
            ea = 4;
            (i = l.a(15, 200, 1500, a(40, 15, 2), a(40, 15, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
            break;
         case 9:
            ga = fV;
            a(40, 25, true);
            ad = true;
            ae = true;
            g(true);
            int[] var1;
            if (o.a() != 1 ? false : (bq == a[o.g].length - 1 ? false : m((var1 = a())[0], var1[1]))) {
               a(40, 26, true);
            }

            if (y() >= 90) {
               z(5, -1);
               return;
            }
      }
   }

   private static void ar() {
      ef = ef + j.a_;
      switch (ee) {
         case 0:
            l var27 = h;
            if (h.a == 0) {
               U(4);
               return;
            }
            break;
         case 1:
            int var7 = dZ;
            if (ef > 2000) {
               ef = 2000;
            }

            int var26 = var7 * ef / 2000;
            b(40, 11, e(var26));
            if (ef >= 2000) {
               U(2);
               return;
            }
            break;
         case 2:
            int var4 = fZ - eh;
            int var20 = dZ;
            if (ef > 2000) {
               ef = 2000;
            }

            ga = eg + var20 * ef / 2000;
            gb = eh + var4 * ef / 2000;
            var4 = gY;
            g(true);
            if (var4 != gY) {
               j.a("gamestate_debriefing_tally.h:2000:itopBarDisplayedLevelPrev:" + var4 + "   s_topBar_iDisplayedLevel:" + gY);
               var4 = gY;
               m(34);
               var20 = gY - 1;
               eg = eg + D[var20][1];
               var20 = gY - 1;
               fY = fY + D[var20][1];
            }

            if (ef >= 2000) {
               l var23 = i;
               if (i.a == 0) {
                  U(9);
               }
            }

            l var24 = i;
            if (i.a > 0) {
               i.a(j.a_);
            }

            if (j != null) {
               l var25 = j;
               if (j.a > 0) {
                  j.a(j.a_);
                  return;
               }
            }
            break;
         case 3:
            if (ef >= 2000) {
               b(eh);
               U(9);
            }

            l var19 = i;
            if (i.a > 0) {
               i.a(j.a_);
               return;
            }
            break;
         case 4:
            byte var3 = 17;
            if (o.d == 6) {
               ec = M[0];
            } else if (o.d == 7) {
               ec = M[0];
            } else if (o.d == 11) {
               if (ej == 1) {
                  ec = dy * H[8];
               } else if (ej == 0) {
                  var3 = 21;
                  ec = M[0];
               }
            } else if (ej == 1) {
               ec = M[0];
            } else if (ej == 0) {
               var3 = 21;
               if (o.d == 1) {
                  ec = ao[7 + K[0] - 1];
               } else if (o.d == 2) {
                  ec = ao[7 + (K[0] - 1 >> 1)];
               } else {
                  ec = ao[3 + K[0] - 1];
               }
            }

            if (ef > 1000) {
               ef = 1000;
            }

            ed = ec * ef / 1000;
            b(40, var3, e(ec));
            if (ef >= 1000) {
               ei = ei + ec;
               aq();
            }

            l var18 = i;
            if (i.a > 0) {
               i.a(j.a_);
               return;
            }
            break;
         case 5:
            if (ef > 200) {
               ef = 200;
            }

            if (ef >= 200) {
               U(4);
            }

            l var17 = i;
            if (i.a > 0) {
               i.a(j.a_);
               return;
            }
            break;
         case 6:
            if (o.d == 6) {
               ec = M[0];
            } else if (o.d == 7) {
               ec = M[0];
            } else if (o.d == 11) {
               if (ej == 1) {
                  ec = dy * H[8];
               } else if (ej == 0) {
                  ec = M[0];
               }
            } else if (ej == 1) {
               ec = M[0];
            } else if (ej == 0) {
               if (o.d == 1) {
                  ec = ao[7 + K[0] - 1];
               } else if (o.d == 2) {
                  ec = ao[7 + (K[0] - 1 >> 1)];
               } else {
                  ec = ao[3 + K[0] - 1];
               }
            }

            if (ef > 1000) {
               ef = 1000;
            }

            ed = ec * ef / 1000;
            b(22, 12, e(ed));
            if (ef >= 1000) {
               U(5);
            }

            l var16 = i;
            if (i.a > 0) {
               i.a(j.a_);
               return;
            }
            break;
         case 7:
            if (ef > 200) {
               ef = 200;
            }

            if (ef >= 200) {
               aq();
            }

            l var15 = i;
            if (i.a > 0) {
               i.a(j.a_);
               return;
            }
            break;
         case 8:
            if (dO > -1) {
               ec = dO;
               dO = -1;
            } else if (o.d == 6) {
               ec = M[0];
            } else if (o.d == 7) {
               ec = M[0];
            } else if (o.d == 11) {
               ec = M[0] + dy * H[8];
            } else if (o.d == 1) {
               ec = M[0] + dQ + ao[7 + K[0] - 1];
            } else if (o.d == 2) {
               ec = M[0] + dQ + ao[7 + (K[0] - 1 >> 1)];
            } else {
               ec = M[0] + dQ + ao[3 + K[0] - 1];
            }

            if (ef > 5000) {
               ef = 5000;
            }

            ed = ec * ef / 5000;
            b(40, 15, e(ed));
            dT = a(40, 6, 2);
            dU = a(40, 6, 3);
            dY = dT - (a[43].b(1) >> 1);
            if (o.a == 1) {
               dW = a[43].b(1) * ec / a[o.g][bq][29];
            } else if (o.a == 0) {
               dW = a[43].b(1) * ec / an[8];
            }

            dV = dW * ef / 5000;
            dX = dY + dV;
            if (dV >= a[43].b(0)) {
               dX = dY + a[43].b(0);
               af = true;
            } else {
               af = false;
            }

            for (int var0 = 0; var0 < 3; var0++) {
               if (o.a == 1) {
                  R[var0] = dY + a[43].b(1) * a[o.g][bq][var0 + 25] / a[o.g][bq][29];
               } else if (o.a == 0) {
                  R[var0] = dY + a[43].b(1) * an[var0 + 5] / an[8];
               }
            }

            int var2;
            if (R[0] <= dX) {
               if (o.a == 1) {
                  dZ = a[o.g][bq][18];
               } else if (o.a == 0) {
                  dZ = an[1];
               }

               var2 = dZ * ef / 5000;
               if (ef > 5000) {
                  var2 = dZ;
               }

               if (ea != 1) {
                  byte var1 = 0;
                  var1 = 23;
                  d(23, 1, false);
                  (j = l.a(15, 200, 1500, R[0], a(40, 6, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
                  ea = 1;
                  c.a(3, true);
               }
            } else if (R[1] <= dX) {
               if (o.a == 1) {
                  dZ = a[o.g][bq][19];
               } else if (o.a == 0) {
                  dZ = an[2];
               }

               var2 = dZ * ef / 3750;
               if (ef > 3750) {
                  var2 = dZ;
               }

               if (ea != 2) {
                  byte var9 = 0;
                  var9 = 23;
                  d(23, 1, false);
                  (j = l.a(15, 200, 1500, R[1], a(40, 6, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
                  ea = 2;
               }
            } else if (R[2] <= dX) {
               if (o.a == 1) {
                  dZ = a[o.g][bq][20];
               } else if (o.a == 0) {
                  dZ = an[3];
               }

               var2 = dZ * ef / 2500;
               if (ef > 2500) {
                  var2 = dZ;
               }

               if (ea != 3) {
                  byte var11 = 0;
                  var11 = 23;
                  d(23, 1, false);
                  (j = l.a(15, 200, 1500, R[2], a(40, 6, 3), 1, 1, -j.c(600), j.c(600), -j.c(300), j.c(300), 0, 0, -1, -1, 8)).a();
                  ea = 3;
               }
            } else {
               if (o.a == 1) {
                  dZ = a[o.g][bq][21];
               } else if (o.a == 0) {
                  dZ = an[4];
               }

               var2 = dZ;
            }

            b(40, 11, e(var2));
            if (ef > 5000) {
               ef = 5000;
            }

            if (ef >= 5000) {
               U(2);
            }

            l var13 = i;
            if (i.a > 0) {
               i.a(j.a_);
            }

            if (j != null) {
               var13 = j;
               if (j.a > 0) {
                  j.a(j.a_);
                  return;
               }
            }
            break;
         case 9:
            bE();
      }
   }

   private static void as() {
      ap();
      if (dN == -1) {
         dQ = 0;
      } else {
         dQ = dN;
         dN = -1;
      }

      if (dQ < 0) {
         dQ = 0;
      }

      N[o.c] = dQ;

      for (int var0 = 0; var0 < 4; var0++) {
         K[var0] = 1;
         if (a[var0].a == 2) {
            M[var0] = 0;
            j[o.c][var0] = 0;
            K[var0] = 4;
         } else {
            a[var0].d();
            M[var0] = a[var0].h * ao[0];
            j[o.c][var0] = M[var0];

            for (int var1 = 0; var1 < 4; var1++) {
               if (c[var0] > c[var1] && a[var1].a != 2 || c[var0] == c[var1] && a[var1].a != 2 && var1 < var0) {
                  K[var0]++;
               }
            }
         }
      }

      if (o.a != 3) {
         int var2 = a[0].h;
         if (a[0].h > go) {
            go = var2;
            o(fo, go);
         }
      }

      if (o.d == 2) {
         if (K[0] != 1 && K[2] != 1) {
            K[0] = 3;
            K[2] = 4;
            K[o.a(a.b)] = 2;
         } else {
            K[0] = 1;
            K[2] = 2;
            K[1] = 3;
            K[3] = 4;
         }
      }

      for (int var3 = 0; var3 < 4; L[K[var3] - 1] = var3++) {
         i[o.c][var3] = K[var3];
      }

      for (int var4 = 0; var4 < 4; var4++) {
         c[var4] = 0;
      }

      if (!g && o.a != 3) {
         switch (o.d) {
            case 1:
               if (t() == 0) {
                  switch (o.g) {
                     case 0:
                        z(6, -1);
                        break;
                     case 1:
                        z(7, -1);
                        break;
                     case 2:
                        z(8, -1);
                        break;
                     case 3:
                        z(9, -1);
                        break;
                     case 4:
                        z(10, -1);
                        break;
                     case 5:
                        z(11, -1);
                  }
               }
         }
      }

      if (o.d == 3) {
         if (o.c >= 1 && M[0] < j[0][0]) {
            M[0] = j[0][0];
         }

         if (o.c == 2 && M[0] < j[1][0]) {
            M[0] = j[1][0];
         }
      }
   }

   private static void V(int var0) {
      var0 = 4 - var0;
      int var2 = o.g * 5 + bq;
      int var1;
      if (o.a == 1) {
         if (var0 > s[o.g][bq]) {
            s[o.g][bq] = var0;
            o(fi + var2, var0);
         }

         var0 = a[o.g][bq][21 - v()];
         j.a("gamestate_debriefing_tally.h:2630: the player gonna win " + var0 + " tokens");
         var1 = u();
      } else {
         var0 = an[4 - w()];
         var1 = u();
      }

      if (o.a() == 1) {
         int var3 = fj + var2;
         var3 = i(s, var3);
         if (var1 > var3) {
            int var4 = x();
            var3 = m(o.g);
            o(fj + var2, var1);
            var2 = x();
            int var5 = m(o.g);
            j.a("gamestate_debriefing_tally.h:2672:numberOfVenuesUnlocked(before):" + var4 + "  numberOfVenuesUnlockedAfterHighScore:" + var2);
            j.a("gamestate_debriefing_tally.h:2673:numberOfLevelsUnlocked(before):" + var3 + "  numberOfLevelsUnlockedAfterHighScore:" + var5);
            if (var5 > var3) {
               j.a("gamestate_debriefing_tally.h:2678:Unlocked new stage!");
               j.a("gamestate_debriefing_tally.h:2679:New stage unlock animation in venue " + o.g + ", stage " + (var5 - 1));
               f(fr + o.g, var5 - 1);
            }

            if (var2 > var4) {
               j.a("gamestate_debriefing_tally.h:2688:Unlocked new venue!");
               j.a("gamestate_debriefing_tally.h:2689:New stage unlock animation in venue " + (var2 - 1) + ", stage " + 0);
               o(fr + var2 - 1, 0);
               var3 = fp;
               var3 = i(s, var3);
               j.a("gamestate_debriefing_tally.h:2693:firstUnlockedVenue: " + var3);
               if (var3 == -1) {
                  j.a("gamestate_debriefing_tally.h:2696:Set RMS_NEW_VENUE_TO_ANIMATE_FIRST to " + (var2 - 1));
                  o(fp, var2 - 1);
               }

               j.a("gamestate_debriefing_tally.h:2700:Set RMS_NEW_VENUE_TO_ANIMATE_LAST to " + (var2 - 1));
               o(fq, var2 - 1);
            }
         }
      }

      ga = fV;
      fV += var0;
      o(fk, fV);
      j.a("gamestate_debriefing_tally.h:2712:iReward:" + var0);
      j.a("gamestate_debriefing_tally.h:2713:s_player_tickets_fake:" + ga);
      j.a("gamestate_debriefing_tally.h:2714:s_player_tickets:" + fV);
      z(23, fV);
      z(24, fV);
      z(25, fV);
      if (!g && o.a != 3) {
         switch (o.d) {
            case 0:
               if (o.a != 0) {
                  z(12, var1);
               }
               break;
            case 1:
               z(16, var1);
               break;
            case 2:
               z(13, var1);
               break;
            case 3:
               z(15, var1);
            case 4:
            case 5:
            case 8:
            case 10:
            default:
               break;
            case 6:
               z(17, var1);
               break;
            case 7:
               z(18, var1);
               break;
            case 9:
               z(14, var1);
               break;
            case 11:
               z(19, var1);
         }
      }

      gb = fW;
      fY = fV;
      fZ = fW;
      int[] var14 = b(fW);
      int var16 = fX;
      if ((fX = var14[0]) > var16) {
         for (int var15 = var16; var15 < fX; var15++) {
            var0 = var15;
            j.a("cGame_XP.h:93:xp_giveLevelRewards - Giving rewards for level:" + var0);
            fV = fV + D[var0][1];
            o(fk, fV);
         }
      }

      z(0, -1);
      z(1, -1);
      z(2, -1);
      z(3, -1);
      z(4, -1);
      if (g) {
         m(41);
      }
   }

   private static void at() {
      g(40, 3, true);
      h(40, 1, true);
      c(aj, 40, 4);
      h(40, 2, true);
      c = a[0];
      if (a[0] != null) {
         a[0].d = (aj[2] + aj[0]) / 2;
         a[0].e = (aj[3] + aj[1]) / 2 + 5;
         a[0].a(false);
      }

      String var3;
      if (o.d != 1 && o.d != 2) {
         if (o.d != 6 && o.d != 7 && o.d != 11) {
            var3 = a(289 + K[0] - 1, (int)0);
            c.d(c.a[11]);
            c.a(11, true);
         } else {
            short var4 = 314;
            var3 = a(314, (int)0);
            c.d(c.a[11]);
            c.a(11, true);
         }
      } else {
         boolean var1;
         String var10000;
         if (var1 = o.d == 1 ? K[0] == 1 : a == a[0] || a == a[2]) {
            short var0 = 425;
            var10000 = a(425, (int)0);
         } else {
            short var2 = 517;
            var10000 = a(517, (int)0);
         }

         var3 = var10000;
         if (var1) {
            c.d(c.a[13]);
            c.a(13, true);
         } else {
            c.d(c.a[1]);
            c.a(24, true);
         }
      }

      if (eb != -1) {
         c.d(c.a[eb]);
         c.a(eb, true);
      }

      b(40, 3, var3);
   }

   private static int[] a() {
      int[] var0 = new int[2];
      if (bq == a[o.g].length - 1) {
         var0[0] = o.g + 1;
         var0[1] = 0;
      } else {
         var0[0] = o.g;
         var0[1] = bq + 1;
      }

      return var0;
   }

   private static void l(int var0, int var1) {
      if (fV >= a[var0][var1][17]) {
         fV = fV - a[var0][var1][17];
         o(fk, fV);
         g(false);
         j.a("gamestate_debriefing_tally.h:2908:Proceeding to gameplay: Venue:" + var0 + ", stage " + bq);
         o.a(var0, var1);
         o.a(1);
         if (a[var0][var1][0] == 1) {
            Q = true;
            o.f = 2;
         } else {
            o.f = 4;
         }

         boolean var7 = false;
         byte var6 = 16;
         d(16, 1, false);
         bq = var1;
         o.g = var0;
         if (!c(0)) {
            u(0);
         } else {
            au();
         }
      } else {
         short var2 = 269;
         String var4 = a(269, (int)0);
         String var3 = var4;
         boolean var5 = false;
         a(0, var3, -1, 0);
         j.a("gamestate_debriefing_tally.h:2972:NOT ENOUGH MONEY!");
      }
   }

   private static void au() {
      switch (o.i) {
         case 6:
            n(6);
            return;
         case 7:
            n(7);
            return;
         case 11:
            n(8);
            return;
         default:
            n(0);
      }
   }

   private static void av() {
      h();
      al = true;
      dO = -1;
      dN = 0;
      if (aj) {
         if (ak) {
            em = 0;
            aq = false;
            ap = false;
            d = 0;
            fS = 0;
            a = null;
            b = null;

            for (int var0 = 0; var0 < 4; var0++) {
               a[var0] = null;
            }

            for (int var3 = 0; var3 < q.a.length; var3++) {
               q.a[var3] = null;
            }

            a = new n();
            b = new n();

            for (int var4 = 0; var4 < 4; var4++) {
               a[var4] = new n();
            }

            q.n = 0;
            a.d = 4;
            b.d = 5;
            if (bc) {
               n var6 = a;

               for (int var13 = 0; var13 < v.length; var13++) {
                  for (int var24 = 0; var24 < 2; var24++) {
                     if (v[var13][var24 << 1] >= 0) {
                        var6.a(v[var13][var24 << 1], v[var13][(var24 << 1) + 1]);
                     }
                  }
               }

               for (int var14 = 0; var14 < v.length; var14++) {
                  if (v[var14][4] >= 0) {
                     var6.a(v[var14][4], v[var14][5]);
                  }
               }
            } else {
               a.setSeed(System.currentTimeMillis());
               int var5 = 0;
               if (o.a == 1) {
                  var5 = a[o.g][bq][10];
               }

               switch (var5) {
                  case 0:
                     for (int var11 = 1; var11 < 5; var11++) {
                        a(a, 0, var11);

                        for (int var23 = 1; var23 <= 12; var23++) {
                           a(a, var23, var11);
                           a(a, var23, var11);
                        }
                     }

                     for (int var12 = 0; var12 < 4; var12++) {
                        a(a, 13, 0);
                        a(a, 14, 0);
                     }
                     break;
                  case 1:
                     for (int var1 = 0; var1 < 4; var1++) {
                        a(a, 13, 0);
                     }

                     for (int var10 = 1; var10 < 5; var10++) {
                        a(a, 0, var10);

                        for (int var2 = 1; var2 <= 5; var2++) {
                           a(a, var2, var10);
                           a(a, var2, var10);
                           a(a, var2, var10);
                           a(a, var2, var10);
                        }

                        for (int var22 = 10; var22 <= 12; var22++) {
                           a(a, var22, var10);
                           a(a, var22, var10);
                        }
                     }
               }
            }

            a.a();
            ay = false;
            az = false;
            e = true;
            ai = false;
            h = 0;
            p = 0;
            j.a("cGame_Match.h:136:Turn:" + p);
            o.k = -1;
            e = 0;
            aH();
         }

         if (o.a() == 1 && o.h == 0) {
            for (int var7 = 0; var7 < a.length; var7++) {
               int var15 = 102 + o.g;
               c[var7] = i(s, var15);
               c[var7] = 0;
            }
         }

         o.m = o.a() == 1 && o.d == 9 ? 1 : 0;
         a = null;
         l = null;
         r = null;
         eS = 0;
         t = null;
         c = null;
         d = null;
         p = null;
         o = null;
         b = null;
         m = null;
         n = null;
         a[0] = null;
         a[1] = null;
         a[2] = null;
         a[3] = null;
         a[4] = null;
         a[5] = null;
         b = null;
         a = null;
         az = false;
         aA = false;
         aB = false;
         aC = false;
         aD = false;
         aF = false;
         aG = false;
         ek = 0;
         o.a = true;
         aN();
         o.b();
         r = 0;
         ep = 0;
         int var8 = 0;
         a = true;
         b = true;
         am = false;
         an = true;
         byte var16 = 50;
         en = 79 + i(s, var16);
         var16 = 51;
         eo = i(s, var16);

         for (int var18 = 0; var18 < 4; var18++) {
            if (a[var18].a == 2) {
               ac[var18] = 0;
            } else {
               if (bc) {
                  ac[var18] = C();
               } else if (o.a != 0 && o.a != 3) {
                  ac[var18] = 5;
               } else {
                  ac[var18] = 7;
               }

               var8++;
            }
         }

         if (var8 == 2) {
            o.a(2, false);
         }

         o.a(4, false);
         n = 0;
         o = 0;
         if (l == null) {
            l = new p();
         }

         l.a(a[78]);
         if (t == null) {
            t = new p();
         }

         t.a(a[189]);

         for (int var19 = 0; var19 < 4; var19++) {
            if (a[var19] == null) {
               a[var19] = new p();
            }

            a[var19].a(a[71]);
            a[var19].a(a(10, var19 + 1, 2) + (a(10, var19 + 1, 5) >> 1), a(10, var19 + 1, 3) + (a(10, var19 + 1, 6) >> 1));
         }

         if (a[4] == null) {
            a[4] = new p();
         }

         a[4].a(a[188]);
         a[4].a(a(10, 19, 2) + (a(10, 19, 5) >> 1), a(10, 19, 3) + (a(10, 19, 6) >> 1));
         if (a[5] == null) {
            a[5] = new p();
         }

         a[5].a(a[188]);
         a[5].a(c.bA, c.bB);
         if (r == null) {
            r = new p();
         }

         r.a(a[190]);
         r.a(c.bA, c.bB);
         if (s == null) {
            s = new p();
         }

         s.a(a[190]);
         s.a(c.bA, c.bB);
         if (p == null) {
            p = new p();
         }

         p.a(a[67]);
         p.a(c.bA, c.bB);
         if (o == null) {
            o = new p();
         }

         o.a(c.bA, c.bB);
         if (k == null) {
            k = new p();
         }

         k.a(a[188]);
         k.a(a(10, 18, 2) + (a(10, 18, 5) >> 1), a(10, 18, 3) + (a(10, 18, 6) >> 1));
         (a = new p()).a(a[34]);
         a.a(a(10, 19, 2) + (a(10, 19, 5) >> 1), a(10, 19, 3) + (a(10, 19, 6) >> 1));
         if (b == null) {
            b = new p[4];

            for (int var20 = 0; var20 < b.length; var20++) {
               b[var20] = new p();
               b[var20].a(a[41]);
               b[var20].a(c.bA, c.bB);
            }
         }

         if (m == null) {
            m = new p();
         }

         m.a(a[78]);
         m.a(c.bA, c.bB);
         if (n == null) {
            n = new p();
         }

         n.a(a[78]);
         n.a(c.bA, c.bB);
         if (c == null) {
            c = new p();
         }

         c.a(a[83]);
         c.a(eo);
         c.a(c.bA, c.bB);
         c.b(-1, -1);
         if (d == null) {
            d = new p();
         }

         d.a(a[34]);
         d.a(c.bA, c.bB);
         d.b(-1, -1);
         if (q == null) {
            q = new p();
         }

         q.a(a[188]);
         q.a(c.bA, c.bB);
         q.b(-1, -1);
         if (b == null) {
            b = new p();
         }

         b.a(a[78]);
         if (g) {
            a(21);
         } else {
            a(0);
         }

         if (o.a == 1) {
            label364: {
               if (o.d == 3 && o.c == 0) {
                  if ((fU = br) > -1) {
                     break label364;
                  }
               } else if (o.d == 3) {
                  a[0].k = fU;
                  a[0].j = 0;
                  break label364;
               }

               fU = -1;
            }

            if (br >= 0) {
               if ((o.d != 3 || o.c == 0) && ap[br] > 0) {
                  a[0].k = br;
                  a[0].j = 0;
                  ap[br]--;
                  b(s, ff + br, ap[br]);
                  if (ap[br] == 0) {
                     C[7][fT] = C[7][fT] & -2;
                     C[7][fT] = C[7][fT] & -3;
                     br = -1;
                     fT = 0;
                     b(s, fe, fT);
                     bl();
                  }
               }
            } else {
               a[0].k = fU;
               a[0].j = 0;
            }

            for (int var21 = 1; var21 < 4; var21++) {
               if ((var8 = a[o.g][bq][var21 + 22 - 1]) != -1) {
                  if (var8 != 5) {
                     a[var21].a[var8] = true;
                  }

                  ap = true;
                  a[var21].k = a[o.g][bq][var21 + 22 - 1];
                  if (a[var21].k == 5) {
                     a[var21].m = true;
                     a[var21].k = j.b(0, 5);
                  } else {
                     a[var21].m = false;
                  }

                  a[var21].j = e[2 + a[var21].k];
               } else {
                  a[var21].k = -1;
                  a[var21].m = false;
                  a[var21].j = 0;
               }
            }
         }

         aj = false;
      }
   }

   private static void aw() {
      if (o.a == 3) {
         for (int var9 = 0; var9 < 4; var9++) {
            int var7;
            do {
               a[var9] = j.b(2, 24);
               var7 = e[var9] ? 0 : 1;

               for (int var11 = 0; var11 < var9; var11++) {
                  if (a[var9] == a[var11]) {
                     var7 = b[a[var9]][40] == 0 ? 1 : 0;
                  }
               }
            } while (var7 != b[a[var9]][40]);

            j.a("cGame_Match.h:621:picked character number " + a[var9] + " as player number " + var9);
            if (d[var9] == 0) {
               int var14;
               a[var9] = a(var14 = var9 + 665, (int)0);
            } else {
               int var15;
               a[var9] = a(var15 = var9 + 648, (int)0);
            }
         }
      } else if (o.a != 0) {
         if (o.a == 1) {
            int[] var6 = a[o.g][bq];
            if (o.d == 3) {
               switch (o.c) {
                  case 0:
                     a[1] = var6[2];
                     a[2] = var6[3];
                     a[3] = var6[4];
                     break;
                  case 1:
                     if (K[2] == 4) {
                        a[2] = a[1];
                        a[2] = a[1];
                     } else if (K[3] == 4) {
                        a[3] = a[2];
                        a[3] = a[2];
                        a[2] = a[1];
                        a[2] = a[1];
                     }
                     break;
                  case 2:
                     if (K[2] > 2) {
                        a[2] = a[3];
                        a[2] = a[3];
                     }
               }
            } else {
               a[1] = var6[2];
               a[2] = var6[3];
               a[3] = var6[4];
            }

            a[1] = a(b[a[1]][0], (int)1);
            a[2] = a(b[a[2]][0], (int)1);
            a[3] = a(b[a[3]][0], (int)1);
         } else {
            if (bq < 0) {
               bq = 0;
            }

            j.a("cGame_Match.h:739:s_iCurrentVenue:" + o.g + "   s_iSelectedStage:" + bq);
            int[] var5 = a[o.g][bq];
            a[1] = var5[2];
            a[2] = var5[3];
            a[3] = var5[4];
         }
      } else {
         for (int var1 = 1; var1 < 4; var1++) {
            int var0;
            do {
               a[var1] = j.b(1, 24);
               var0 = e[var1] ? 0 : 1;

               for (int var2 = 1; var2 < var1; var2++) {
                  if (a[var1] == a[var2]) {
                     var0 = b[a[var1]][40] == 0 ? 1 : 0;
                  }
               }
            } while (var0 != b[a[var1]][40]);

            j.a("cGame_Match.h:651:picked character number " + a[var1] + " as player number " + var1);
         }

         int var8;
         int var10 = var8 = a(b[a[1]][40], (int)1);

         while (var8 == var10) {
            var10 = a(b[a[2]][40], (int)2);
         }

         int var4 = var8;

         while (var4 == var10 || var8 == var4) {
            var4 = a(b[a[3]][40], (int)3);
         }

         j.a("cGame_Match.h:667:iCharacterID[WEST]:" + a[1]);
         int var3;
         a[1] = a(var3 = var8 + 68, (int)0);
         j.a("cGame_Match.h:670:iCharacterID[NORTH]:" + a[2]);
         a[2] = a(var3 = var10 + 68, (int)0);
         j.a("cGame_Match.h:673:iCharacterID[EAST]:" + a[3]);
         a[3] = a(var3 = var4 + 68, (int)0);
      }
   }

   private static void ax() {
      for (int var0 = 0; var0 <= 3; var0++) {
         if (a[var0].a != 2) {
            a[var0] = new i();
            cm = r[1][0];
            int[] var1;
            if (bc && var0 != 0) {
               (var1 = new int[1])[0] = cm;
               a[var0] = a(b[cm][0], (int)1);
            } else {
               (var1 = new int[1])[0] = a[var0];
            }

            a[var0].a(42, var1);
            if (var0 != 0 || o.a == 3) {
               a[var0].e();
            }

            if (var0 == 0 && o.a != 3) {
               a[var0].h();
               a[var0].e();
               b[var0] = 1;
            } else {
               switch (b[a[var0]][39]) {
                  case 0:
                     b[var0] = 1;
                     break;
                  case 1:
                     b[var0] = 21;
                     break;
                  case 2:
                     b[var0] = 30;
                     break;
                  case 3:
                     b[var0] = 26;
                     break;
                  case 4:
                     b[var0] = 22;
                     break;
                  case 5:
                     b[var0] = 32;
                     break;
                  case 6:
                     b[var0] = 31;
               }
            }

            a[var0].d(b[var0]);
            a[var0].d = a(10, var0 + 5, 2);
            a[var0].e = a(10, var0 + 5, 3) - -9;
            b(10, var0 + 13, a(a[var0 + 0], a(10, 13, 7), a(10, 13, 5)));
            g(10, var0 + 13, false);
         }
      }

      if (a[2].a != 2) {
         a[2].a(true);
      }

      if (a[3].a != 2) {
         a[3].a(true);
      }
   }

   public static int a(int var0, int var1) {
      j.a("cGame_Match.h:884:getRandomCharacterName() - _iGender:" + var0);
      if (f) {
         return e[var1] ? j.b(0, 25) : j.b(25, 50);
      } else {
         return var0 == 0 ? j.b(0, 25) : j.b(25, 50);
      }
   }

   private static void b(boolean var0) {
      if (o.a != 3) {
         if (p != 0 || !var0) {
            q var1;
            r var2;
            if ((var2 = a[0]).d != -1 && hB == 3 && c((var1 = var2.a.a(var2.d)).f, var1.g, q.h, q.i) && var1.l == 0) {
               var1.l = 1;
            }

            if (r()) {
               for (q var3 = var2.a.b; var3 != null; var3 = var3.a) {
                  if (d(var3.f, var3.g, q.h, q.i) || e(var3.f, var3.g, q.h, q.i) && var2.d != -1) {
                     if (var2.a.a(var3) != var2.d) {
                        var2.b(var3);
                        return;
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   private static void ay() {
      switch (eq) {
         case 0:
            if (--er <= 0) {
               eq = 1;
               return;
            }
            break;
         case 1:
            f = f;
            g = g;
            boolean var3 = false;
            switch (o.k) {
               case 0:
                  if (g > 160) {
                     var3 = true;
                  }
                  break;
               case 1:
                  if (f < -180) {
                     var3 = true;
                  }
                  break;
               case 2:
                  if (g < -160) {
                     var3 = true;
                  }
                  break;
               case 3:
                  if (f > 180) {
                     var3 = true;
                  }
            }

            if (var3) {
               eq = 2;
               return;
            }
            break;
         case 2:
            f = 0;
            g = 0;
            es = 0;
            et = 0;
            if (o.k == 0) {
               a[o.k].a = 2;

               for (int var2 = 1; var2 < 4; var2++) {
                  if (a[var2].a != 2) {
                     a = a[var2];
                     e(7);
                     break;
                  }
               }
            } else {
               boolean var0 = true;

               for (int var1 = 1; var1 < 4; var1++) {
                  if (a[var1].a != 2 && var1 != o.k) {
                     var0 = false;
                     break;
                  }
               }

               a[o.k].a = 2;
               if (var0) {
                  a = a[0];
                  e(7);
               }

               aO();
            }

            a(1);
      }
   }

   private static void az() {
      ai = false;
      l(eu);
   }

   private static void aA() {
      switch (h) {
         case 0:
            am = true;
            h();
            if (ev == 0) {
               for (int var10 = 0; var10 < 4; var10++) {
                  a[(o.d() + var10) % 4].s = d.c[var10 + 0][0];
                  a[(o.d() + var10) % 4].t = d.c[var10 + 0][1];
                  a[(o.d() + var10) % 4].o = (a[(o.d() + var10) % 4].s - a[(o.d() + var10) % 4].q) / 20;
                  a[(o.d() + var10) % 4].p = (a[(o.d() + var10) % 4].t - a[(o.d() + var10) % 4].r) / 20;
               }
            } else if (ev < 500) {
               for (int var11 = 0; var11 < 4; var11++) {
                  a[var11].q = a[var11].q + a[var11].o;
                  a[var11].r = a[var11].r + a[var11].p;
               }
            } else if (ev >= 500) {
               for (int var12 = 0; var12 < 4; var12++) {
                  a[var12].q = a[var12].s;
                  a[var12].r = a[var12].t;
               }

               h++;
            }
            break;
         case 1:
            am = true;
            ev = 0;
            aO();
            h++;
            aI();

            for (int var4 = 0; var4 < 4; var4++) {
               g(10, var4 + 13, false);
            }

            short var5 = 0;
            var5 = (byte)29;
            d(29, 1, false);
            var5 = 642;
            String var8 = a(642, (int)0);
            c[0] = "\\2" + a[p] + "\\0";
            String var9 = a(var8, c, '#');
            b(10, 31, var9);
            break;
         case 2:
            am = true;
            if (c(0, 0, c.e_, c.f_)) {
               int[] var1;
               a(var1 = new int[4], 0, 7, 0, 0);
               if (!c(var1[0], var1[1], var1[2], var1[3])) {
                  boolean var2 = false;
                  byte var3 = 16;
                  d(16, 1, false);
                  h++;
               }
            }
            break;
         case 3:
            h++;
            break;
         case 4:
            g(10, 31, false);

            for (int var0 = 0; var0 < 4; var0++) {
               g(10, var0 + 13, true);
            }

            a(eZ);
            h = 0;
            a = true;
            b = true;
      }

      ev = ev + j.a_;
   }

   private static void aB() {
      for (int var0 = 0; var0 < 4; var0++) {
         a[var0].e();
      }

      if (o.a != 3 && a[0].g > 1) {
         if (a[0].g > 0) {
            aq = true;
         }

         if (ek != a[0].g && ++ew >= 5 && c) {
            F(a[0].g, 2500);
            ek = a[0].g;
            c = false;
            ew = 0;
         }
      }
   }

   private static void aC() {
      if (m == 1 || m == 8 || m == 19 || m == 20) {
         if (c.a() == 2 && c.a()) {
            c.b(4 + a[p].b, -1);
            d.b(4 + a[p].b, -1);
         } else if (c.a() == 3 && c.a()) {
            c.b(8 + a[p].b, -1);
            d.b(4 + a[p].b, -1);
         } else if (c.a() < 0) {
            if (o.a) {
               c.b(4 + a[p].b, -1);
               d.b(4 + a[p].b, -1);
            } else {
               c.b(8 + a[p].b, -1);
               d.b(8 + a[p].b, -1);
            }
         } else if (c.a()) {
            if (o.a) {
               c.b(4 + a[p].b, -1);
               d.b(4 + a[p].b, -1);
            } else {
               c.b(8 + a[p].b, -1);
               d.b(8 + a[p].b, -1);
            }
         }

         c.c();
         c.b(j.a_);
      }

      if (a != null && a.a() >= 0) {
         a.c();
         a.b(j.a_);
      }

      b.c();
      a.d();

      for (int var0 = 0; var0 < 4; var0++) {
         a[var0].a(true);
      }

      for (int var6 = 0; var6 < 4; var6++) {
         if (a[var6].o) {
            if (var6 == p) {
               a[194].a(j.b, 0, a[var6].d + -4, a[var6].e + -9, 0);
            }

            int var1 = var6;
            r var2;
            if ((var2 = a[var1]).a != 2) {
               j.a(a[var1].d + -94, 0, 195, a[var1].e + -9);
               a[var1].d();
               j.a(0, 0, c.e_, c.f_);
               if (var2.k != -1) {
                  e var3 = a[187];
                  int var4 = e[2 + var2.k];
                  if ((var4 = var2.j * a[187].b(5) / var4) > a[187].b(5)) {
                     var4 = a[187].b(5);
                  }

                  int[] var5 = new int[4];
                  a[187].a(var5, 5, a[var1].d + -5, a[var1].e + -2, 0);
                  var3.a(j.b, 7, a[var1].d + -5, a[var1].e + -2, 0);
                  j.a(0, 0, var5[0] + var4, c.f_);
                  var3.a(j.b, 5, a[var1].d + -5, a[var1].e + -2, 0);
                  j.a(0, 0, c.e_, c.f_);
                  if (var2.j > 0) {
                     var3.a(j.b, 6, var5[0] + var4, a[var1].e + -2, 0);
                  }

                  var3.a(j.b, 0 + var2.k, a[var1].d + -5, a[var1].e + -2, 0);
               }

               if (el != 0) {
                  if (el <= 0) {
                     var1 = 33;
                  } else {
                     var1 = 32 - (el << 3) / 15000;
                  }

                  if (var1 > 33) {
                     var1 = 33;
                  }

                  if (var1 < 25) {
                     var1 = 25;
                  }

                  if (el < 5000 && b % 500L > 150L) {
                     var1 = 33;
                  }

                  i(10, 17, 6, var1);
                  h(10, 17, true);
                  e(10, 17, 0, 0);
                  h(10, 17, false);
               }
            }
         }
      }

      if (m == 4 && (a == null || !a.e)) {
         switch (eT) {
            case 0:
               if (a[p].i == 0) {
               }
               break;
            case 1:
               if (a[p].a == 0) {
                  if (eV != 24 && a[p].i != 0 && eV <= 0) {
                     b.b.a(b.d);
                  }
               } else {
                  b.b.a(b.d);
               }
               break;
            case 2:
               r.c();
               r.b(j.a_);
               break;
            case 3:
               p.c();
               if (p.a() >= 0) {
                  a(p, eR);
               }

               p.b(j.a_);
         }
      }

      if (l != null && l.a() >= 0) {
         l.c();
         a(l, eN);
         l.b(j.a_);
         int[] var7 = a(l);
         if (b(a[1], var7)) {
            n[1] = a[1];
            a[1] = var7;
         } else {
            int[] var15 = a(var7[0], var7[1], var7[2], var7[3], a[1][0], a[1][1], a[1][2], a[1][3]);
            a[1] = var7;
            n[1] = var15;
         }
      }

      if (t != null && t.a() >= 0) {
         t.c();
         t.b(j.a_);
         int[] var8 = a(t);
         if (b(a[2], var8)) {
            n[2] = a[2];
            a[2] = var8;
         } else {
            int[] var16 = a(var8[0], var8[1], var8[2], var8[3], a[2][0], a[2][1], a[2][2], a[2][3]);
            a[2] = var8;
            n[2] = var16;
         }
      }

      if (s != null && s.a() >= 0) {
         s.c();
         s.b(j.a_);
         int[] var9 = a(s);
         if (b(a[3], var9)) {
            n[3] = a[3];
            a[3] = var9;
         } else {
            int[] var17 = a(var9[0], var9[1], var9[2], var9[3], a[3][0], a[3][1], a[3][2], a[3][3]);
            a[3] = var9;
            n[3] = var17;
         }
      }

      if (q != null && q.a() >= 0) {
         q.c();
         q.b(j.a_);
      }

      if (b != null && b.a() >= 0) {
         b.c();
         a(b, 33);
         b.b(j.a_);
         int[] var10 = a(b);
         if (b(a[0], var10)) {
            n[0] = a[0];
            a[0] = var10;
         } else {
            int[] var18 = a(var10[0], var10[1], var10[2], var10[3], a[0][0], a[0][1], a[0][2], a[0][3]);
            a[0] = var10;
            n[0] = var18;
         }
      }

      if (k != null && k.a() >= 0) {
         k.c();
         k.b(j.a_);
      }

      for (int var11 = 0; var11 < b.length; var11++) {
         if (b[var11].a() >= 0) {
            b[var11].c();
            b[var11].b(j.a_);
            int[] var19 = a(b[var11]);
            if (b(a[4], var19)) {
               n[4] = a[4];
               a[4] = var19;
            } else {
               int[] var22 = a(var19[0], var19[1], var19[2], var19[3], a[4][0], a[4][1], a[4][2], a[4][3]);
               a[4] = var19;
               n[4] = var22;
            }
         }
      }

      if (m.a() >= 0) {
         e = true;
         m.c();
         a(m, eO);
         m.b(j.a_);
      }

      if (n.a() >= 0) {
         n.c();
         n.b(j.a_);
         a(n, eP);
         int[] var12 = a(n);
         if (b(a[5], var12)) {
            n[5] = a[5];
            a[5] = var12;
         } else {
            int[] var20 = a(var12[0], var12[1], var12[2], var12[3], a[5][0], a[5][1], a[5][2], a[5][3]);
            a[5] = var12;
            n[5] = var20;
         }
      }

      if (o != null && o.a() >= 0) {
         h();
         o.c();
         a(o, eQ);
         o.b(j.a_);
      }

      for (int var13 = 0; var13 < 6; var13++) {
         if (a[var13] != null && a[var13].a() >= 0) {
            a[var13].c();
            a[var13].b(j.a_);
            if (var13 < 4) {
               int[] var21 = a(a[var13]);
               if (b(a[var13 + 6], var21)) {
                  n[var13 + 6] = a[var13 + 6];
                  a[var13 + 6] = var21;
               } else {
                  int[] var23 = a(var21[0], var21[1], var21[2], var21[3], a[var13 + 6][0], a[var13 + 6][1], a[var13 + 6][2], a[var13 + 6][3]);
                  a[var13 + 6] = var21;
                  n[var13 + 6] = var23;
               }
            }
         }
      }

      if (ay && m == 5) {
         if (m != 4 && !aA) {
            b(32, 2, true);
         } else {
            b(32, 2, false);
         }
      }

      if (aM && m != 17 && eM != 17 && (l != 1 || !a[o.e()].b || a[o.e()].a || a[o.e()].a.a >= 2)) {
         aM = false;
         e = true;
      }
   }

   private static void aD() {
      j.a(0, 0, c.e_, c.f_);
      e = false;
      if (b != null && b.a() >= 0 && b.a()) {
         b.b(-1, -1);
      }

      if (l != null && l.a() >= 0 && l.a()) {
         l.b(-1, -1);
      }

      if (t != null && t.a() >= 0 && t.a()) {
         t.b(-1, -1);
      }

      if (s != null && s.a() >= 0 && s.a()) {
         s.b(-1, -1);
      }

      if (q != null && q.a() >= 0 && q.a()) {
         q.b(-1, -1);
      }

      if (o != null && o.a() >= 0 && o.a()) {
         o.b(-1, -1);
      }

      if (k != null && k.a() >= 0 && k.a()) {
         k.b(-1, -1);
      }

      for (int var0 = 0; var0 < b.length; var0++) {
         if (b[var0].a() >= 0 && b[var0].a()) {
            if (b[var0].a() == 0) {
               b[var0].b(var0 + 1, 1);
            } else {
               b[var0].b(-1, -1);
               if (a[var0].a == 0 && !f) {
                  e(140, 1);
                  e(6);
               }
            }
         }
      }

      if (n.a() >= 0 && n.a()) {
         n.b(-1, -1);
      }

      for (int var1 = 0; var1 < 6; var1++) {
         if (a[var1].a() >= 0 && a[var1].a()) {
            if (var1 < 4 && a[var1].a() == var1 + 14 && a[var1].l > 0) {
               a[var1].b(var1 + 18, -1);
            } else {
               a[var1].b(-1, -1);
            }
         }
      }

      ar = true;
   }

   private static void aE() {
      if (a || am && ev == j.a_) {
         a[en].e(eo);
         if (f && !an) {
            j.a(a, 0, 0, c.e_, c.bB - 75);
            a[en].a(a, 0, 0, 0, 0);
            j.a(a, 0, c.bB + 75, c.e_, c.bB - 75);
            a[en].a(a, 0, 0, 0, 0);
            j.a(a, 0, c.bB - 75, c.bA - 75, 150);
            a[en].a(a, 0, 0, 0, 0);
            j.a(a, c.bA + 75, c.bB - 75, c.bA - 75, 150);
            a[en].a(a, 0, 0, 0, 0);
            j.a(a, 0, 0, c.e_, c.f_);
         } else {
            a[en].a(a, 0, 0, 0, 0);
         }

         a(32, 2, true);
         f(a, 10, 21, 0, 0);
         a(32, 2, false);
         j.b = a;
         a.c();

         for (q var0 = a.a; var0 != null; var0 = var0.b) {
            var0.a(a.d, -1, -1);
         }

         j.b = null;
         j.a((Graphics)null);
      } else {
         a(32, 2, false);
         if (ay) {
            a(32, 2, true);
         }
      }

      for (int var5 = 0; var5 < 4; var5++) {
         if (a[var5].a != 2) {
            b = "drawMatchBg_8 ";
            if (a || a[var5] || am && ev == j.a_) {
               b = "drawMatchBg_9 ";
               a[82].e(eo);
               if (!a) {
                  byte var1 = 0;
                  byte var2 = 0;
                  byte var3 = 0;
                  byte var4 = 0;
                  switch (var5) {
                     case 0:
                        var1 = 7;
                        var2 = 21;
                        var3 = 14;
                        var4 = 42;
                        break;
                     case 1:
                        var1 = 0;
                        var2 = 7;
                        var3 = 21;
                        var4 = 14;
                        break;
                     case 2:
                        var1 = 7;
                        var2 = 0;
                        var3 = 14;
                        var4 = 31;
                        break;
                     case 3:
                        var1 = 21;
                        var2 = 7;
                        var3 = 42;
                        var4 = 14;
                  }

                  j.a(a, a(10, 1 + a[var5].b, 2) - var1, a(10, 1 + a[var5].b, 3) - var2, a(10, 1 + a[var5].b, 5) + var3, a(10, 1 + a[var5].b, 6) + var4);
                  a[en].e(eo);
                  a[en].a(a, 0, 0, 0, 0);
                  j.a(a, 0, 0, c.e_, c.f_);
               }

               switch (a[var5].b) {
                  case 0:
                     a[82].a(a, 0 + a[var5].b, c.bA, c.f_, 0);
                     if (var5 == p) {
                        a[191].a(a, 0 + a[var5].b, c.bA, c.f_, 0);
                     }
                     break;
                  case 1:
                     a[82].a(a, 0 + a[var5].b, 0, c.bB, 0);
                     if (var5 == p) {
                        a[191].a(a, 0 + a[var5].b, 0, c.bB, 0);
                     }
                     break;
                  case 2:
                     a[82].a(a, 0 + a[var5].b, c.bA, 0, 0);
                     if (var5 == p) {
                        a[191].a(a, 0 + a[var5].b, c.bA, 0, 0);
                     }
                     break;
                  case 3:
                     a[82].a(a, 0 + a[var5].b, c.e_, c.bB, 0);
                     if (var5 == p) {
                        a[191].a(a, 0 + a[var5].b, c.e_, c.bB, 0);
                     }
               }

               a[var5].a(false);
            }
         }
      }

      if (!am) {
         boolean var6 = false;
         if (b) {
            var6 = true;

            for (int var11 = 0; var11 < 4; var11++) {
               if (a[var11].a != 2 && a[var11].o) {
                  b(a, var11);
                  if (!f) {
                     a(a, a[10][var11 + 13], 10, var11 + 13, 0, 0);
                  }
               }
            }
         } else {
            if (a[p]) {
               int var7 = 0;

               for (int var13 = 0; var13 < a.length; var13++) {
                  if (a[var13].a.a > 0) {
                     var7++;
                  }
               }

               int var14 = p;
               if (var7 > 2) {
                  do {
                     if (--var14 < 0) {
                        var14 = 3;
                     }
                  } while (a[var14].a.a == 0);
               }

               a[var14] = true;
               if (a == -1) {
                  if (--var14 < 0) {
                     var14 = 3;
                  }

                  a[var14] = true;
               }
            } else if (a != -1) {
               byte var8 = a;
               if ((var8 = (byte)(a - 1)) < 0) {
                  var8 = 3;
               }

               a[var8] = true;
               a = -1;
            }

            for (int var10 = 0; var10 < 4; var10++) {
               if (a[var10].a != 2 && a[var10].o && (a[var10] || a)) {
                  a[var10] = false;
                  b(a, var10);
                  if (!f) {
                     a(a, a[10][var10 + 13], 10, var10 + 13, 0, 0);
                  } else {
                     var6 = true;
                  }
               }
            }
         }

         if (f && var6) {
            for (int var12 = 0; var12 < 4; var12++) {
               if (a[var12].a != 2 && a[var12].o) {
                  a(a, a[10][var12 + 13], 10, var12 + 13, 0, 0);
                  g(10, var12 + 13, false);
               }
            }
         }
      }

      b = false;
      e();
      a = false;
      am = false;
      if (f) {
         a = new boolean[]{false, false, false, false};
      }

      c(j.b);
   }

   private static void aF() {
      aD();
      aB();
      aE();
      b.c();

      for (int var0 = 0; var0 < 4; var0++) {
         if (a[var0].a.d == 0) {
            a[var0].f();
         }
      }
   }

   private static void c(int var0, boolean var1) {
      a[var0].o = var1;
      g(10, var0 + 13, var1);
   }

   private static void aG() {
      j.a("cGame_Match.h:3661:-- Turn match ENABLED");
      if (g) {
         el = 15000;
      }
   }

   private static void aH() {
      j.a("cGame_Match.h:3674:-- Turn match DISABLED");
      el = 0;
   }

   private static void b(Graphics var0, int var1) {
      a[26].e(eo);
      if (var1 == p) {
         a[26].a(var0, 1, a[var1].d + -4, a[var1].e + -9, 0);
      } else {
         a[26].a(var0, 0, a[var1].d + -4, a[var1].e + -9, 0);
      }
   }

   static void e() {
      if (!an) {
         if (b.b != null && b.b.a != null) {
            q var1 = b.b.a;
            if (b.b.a.d) {
               var1.a(b.d, -1, -1);
               if (!b.b.e) {
                  var1.a(b.d, false);
                  var1.d = false;
                  return;
               }

               var1.a(b.d, true);
            }
         }
      } else {
         for (q var0 = b.a; var0 != null && var0 != b.b; var0 = var0.b) {
            var0.a(b.d, -1, -1);
            if (!var0.e) {
               var0.a(b.d, false);
            }
         }
      }
   }

   private static void a(p var0, int var1) {
      int var2 = var0.a;
      int var3 = var0.b;
      int[] var8;
      if ((var8 = var0.a()) != null && var8.length != 0) {
         int var6 = var8.length / 2;

         int var4;
         for (int var7 = 0; var7 < var6 && (var4 = m[var1][var7 << 1]) >= 0; var7++) {
            String var9 = a(var4, (int)0);
            int var5 = m[var1][(var7 << 1) + 1];
            a(0, var9, var2 + var8[var7 << 1], var3 + var8[(var7 << 1) + 1], 3, var5);
         }
      }
   }

   private static void aI() {
      for (int var0 = 0; var0 < 4; var0++) {
         a[var0].d = a(10, 5 + a[var0].b, 2);
         a[var0].e = a(10, 5 + a[var0].b, 3) - -9;
         if (a[var0].b != 2 && a[var0].b != 3) {
            a[var0].a(false);
         } else {
            a[var0].a(true);
         }

         b(10, 13 + a[var0].b, a(a[var0 + 0], a(10, 13, 7), a(10, 13, 5)));
      }
   }

   private static void W(int var0) {
      if (var0 == 0) {
         bH();
         X(13);
      }

      if (var0 == 1) {
         bH();
         X(13);
      }

      if (var0 == 2) {
         aY();
         ah(59);
      }

      if (var0 == 5) {
         int var1 = bZ;
         j.a("gamestate_achievements.h:77:iInputMsg : " + var1);
         switch (var1) {
            case 1:
               l(G());
               break;
            case 1980:
            case 1981:
            case 1982:
            case 1983:
            case 1984:
            case 1985:
            case 1986:
            case 1987:
            case 1988:
            case 1989:
            case 1990:
            case 1991:
            case 1992:
            case 1993:
            case 1994:
            case 1995:
            case 1996:
            case 1997:
            case 1998:
            case 1999:
            case 2000:
            case 2001:
            case 2002:
            case 2003:
            case 2004:
            case 2005:
            case 2006:
            case 2007:
            case 2008:
            case 2009:
            case 2010:
            case 2011:
            case 2012:
            case 2013:
            case 2014:
            case 2015:
            case 2016:
            case 2017:
            case 2018:
            case 2019:
            case 2020:
               var1 -= 1980;
               var1 = gW + 2 + var1 * 5;
               j.a("cGame_Achievements.h:196:change the iItemFirstGUIID's pallete id:" + var1);
               i(60, var1, 7, 2);
               c(0);
               byte var6 = 0;
               var6 = 16;
               d(16, 1, false);
         }
      }

      if (var0 == 3) {
         c(j.b);
         am(0);
         int var8 = -a(59, 1, 17);

         for (int var2 = 0; var2 < eA; var2++) {
            int var3 = ez + var2 * (ex + eB);
            if ((var8 < eE * var2 * eC || var8 >= eE * (var2 + 1) * eC) && (var2 != eA - 1 || var8 <= eE * eA * eC)) {
               a[10].a(j.b, 42, ey, var3, 0);
            } else {
               a[10].a(j.b, 34, ey, var3, 0);
            }
         }

         if (var8 > 0) {
            h(59, 6, true);
         } else {
            h(59, 6, false);
         }

         if (var8 >= 4000) {
            h(59, 5, false);
         } else {
            h(59, 5, true);
         }
      }

      if (var0 == 4) {
         a(14, 17, true);
         al();
      }
   }

   private static void c(Graphics var0) {
      if (as) {
         var0.drawImage(a, 0, 0, 0);
      }
   }

   private static void X(int var0) {
      if (var0 != -1 && var0 != 0) {
         j.b = a;
         switch (var0) {
            case 1:
               a[1].a(a, 0, 0, 0, 0, 0, 0);
               int[] var9 = new int[]{2};
               a(4, var9, 0, 0);
               break;
            case 2:
               b(a);
               int[] var8 = new int[]{14, 0, 1, 2, 3};
               a(1, var8, 0, 0);
               break;
            case 3:
               b(a);
               int[] var7 = new int[]{0, 1};
               a(6, var7, 0, 0);
               break;
            case 4:
               b(a);
               int[] var6 = new int[]{1};
               a(66, var6, 0, 0);
               break;
            case 5:
               b(a);
               int[] var5 = new int[]{8};
               a(54, var5, 0, 0);
               break;
            case 6:
               b(a);
               break;
            case 7:
               b(a);
               break;
            case 8:
               b(a);
               break;
            case 9:
               int[] var4 = new int[]{0, 1, 2};
               a(5, var4, 0, 0);
               break;
            case 10:
               b(a);
               int[] var3 = new int[]{0, 1};
               a(7, var3, 0, 0);
               break;
            case 11:
               b(a);
               int[] var2 = new int[]{2, 15};
               a(13, var2, 0, 0);
            case 12:
            case 18:
            case 20:
            case 21:
            default:
               break;
            case 13:
               b(a);
               break;
            case 14:
               b(j.b);
               break;
            case 15:
               b(a);
               break;
            case 16:
               b(a);
               break;
            case 17:
               b(a);
               break;
            case 19:
               int[] var1 = new int[]{4};
               a(28, var1, 0, 0);
         }

         j.b = null;
         j.a((Graphics)null);
      }
   }

   private static int f(int var0, int var1) {
      return k[var0][var1 << 1];
   }

   private static int g(int var0, int var1) {
      return k[var0][(var1 << 1) + 1];
   }

   private static boolean n() {
      return eK <= 0;
   }

   private static void aJ() {
      if (!n()) {
         eJ = eJ + j.a_;

         for (int var0 = 0; var0 < 12; var0++) {
            if (eJ > V[var0] && e[var0].a() >= 0) {
               e[var0].b(j.a_);
            }

            if (e[var0].a() >= 0 && e[var0].a()) {
               int var1 = var0;
               e[var1].b(-1, -1);
               V[var1] = -1;
               U[var1] = -1;
               eK--;
               if (!au) {
                  if (n()) {
                     if (at) {
                        at = false;
                     }

                     if (au) {
                        au = false;
                     }
                  }
               } else if (at) {
                  var1 = var0;
                  int var2 = eJ;
                  int var4 = var1 / 3;
                  V[var1] = var2;

                  int var3;
                  do {
                     var3 = j.b(0, eI - 1);
                  } while (c(var4, var3));

                  U[var1] = var3;
                  var2 = f(var4, var3);
                  var3 = g(var4, var3);
                  e[var1].b(eH, 1);
                  e[var1].a(c.bA + var2, c.bB + var3);
                  eK++;
               }
            }
         }
      }
   }

   private static boolean c(int var0, int var1) {
      int var3;
      int var2 = (var3 = var0 * 3) + 3;

      for (int var4 = var3; var4 < var2; var4++) {
         if (var1 == U[var4]) {
            return true;
         }
      }

      return false;
   }

   private static void Y(int var0) {
      boolean var5 = false;
      var0 = var0;
      if (!at) {
         byte var15;
         switch (var0) {
            case 10:
            case 11:
            case 12:
               var15 = 2;
               break;
            case 13:
            case 14:
               var15 = 0;
               break;
            case 1982:
            case 1983:
               var15 = 1;
               break;
            default:
               var15 = -1;
         }

         eH = var15;
         if (var15 >= 0) {
            at = true;
            au = false;
            int var7 = 0;
            int var1 = 0;
            int var3 = 0;
            var7 = (boolean)0;
            eJ = 0;
            eK = 0;

            for (int var9 = 0; var9 < U.length; var9++) {
               U[var9] = -1;
            }

            for (int var4 = 0; var4 < 4; var4++) {
               var7 = j.b(var4 * 100, var4 * 100 + 100);

               for (int var13 = 0; var13 < 3; var13++) {
                  V[var4 + var13 * 3] = var7;
               }

               var1 = 0;

               do {
                  var7 = j.b(0, eI - 1);
                  if (!c(var4, var7)) {
                     U[var1 + var4 * 3] = var7;
                     int var2 = f(var4, var7);
                     var7 = g(var4, var7);
                     e[var3].b(eH, 1);
                     e[var3].a(c.bA + var2, c.bB + var7);
                     var3++;
                     var1++;
                     eK++;
                  }
               } while (var1 < 3);
            }
         }
      }
   }

   private static void aK() {
      a = new Image[2];
      a = new e[195];
      b = new e[2];
      d = new boolean[195];
      W = new int[195];
      X = new int[195];
      int var0 = 0 + Z.length;

      for (int var1 = 0; var1 < l.length; var1++) {
         if (l[var1][2] == 1) {
            var0++;
         }
      }

      e.a(var0);

      for (int var2 = 0; var2 < Z.length; var2++) {
         e.a(var2, Z[var2]);
      }
   }

   private static e a(int var0, int var1, boolean var2, boolean var3) {
      var3 = var3;
      var2 = var2;
      boolean var12 = false;
      boolean var13 = false;
      var1 = var1;
      var0 = var0;
      j.a("** game_LoadSprite - dataID:" + var0 + "  paletteMask:" + var1 + "  buildCache:" + var2 + "  freeCacheData:" + var3 + " **");
      e var4;
      (var4 = new e()).a(j.a(var0), 0);
      j.a("+++++++++++++++++++++++++++++dataID " + var0 + ":" + eL);
      int var5;
      int var26 = var5 = a(eL, var0, l);
      int var8 = var0;
      int var7 = var26;
      int var9 = -1;
      if (var7 != -1) {
         if (l[var7][2] == 0) {
            if (a(var7, l)) {
               if (e(1, l[var7][3])) {
                  av = true;
               } else {
                  av = false;
               }

               if (e(2, l[var7][3])) {
                  aw = true;
               } else {
                  aw = false;
               }
            }
         } else if ((l[var7][2] == 1 || l[var7][2] == 2) && a(var7, l)) {
            av = false;
            aw = false;
            var9 = h(eL, var8);
         }
      } else {
         av = false;
         aw = false;
      }

      int var6 = var9;
      var2 = av;
      var3 = aw;
      j.a("b_buildCache:" + av + "          b_freeCacheData:" + av);
      if (eL != a("/3") || var0 != 80 && var0 != 51 && var0 != 51 && var0 != 83 && var0 != 79) {
         var0 = var4.b;
         j.a("Numbers of pals = " + var0 + "\n");
         if (var0 > 1) {
            var1 = 0;

            for (int var22 = 0; var22 < var0; var22++) {
               var1 += 1 << var22;
            }
         }
      }

      for (int var16 = 0; var1 >> var16 != 0; var16++) {
         if ((var1 >> var16 & 1) != 0) {
            boolean var11 = var2;
            byte var10 = 0;
            byte var25 = 0;
            var8 = var16;
            e var23 = var4;
            if (var25 != 0) {
               if (var25 == 1) {
                  var23.b(var8, var10);
               } else if (var25 == 2) {
                  var23.f(var8);
               }
            }

            if (var11) {
               var23.a(var8, 0, -1, -1);
            }
         }
      }

      if (var2 && var3) {
         var4.b();
      }

      if (var6 != -1) {
         if (var6 >= Z.length) {
            e.a(var6, l[var5][3]);
         }

         var4.c(var6);
      }

      return var4;
   }

   private static void Z(int var0) {
      d[var0] = false;
      W[var0] = 0;
      X[var0] = 0;
   }

   private static void a(int var0, int var1, boolean var2, boolean var3) {
      d[var0] = true;
      W[var0] = var1;
      X[var0] = 0;
      X[var0] = X[var0] | (var2 ? 1 : 0);
      X[var0] = X[var0] | (var3 ? 2 : 0);
   }

   private static boolean d(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = var1 == 0 || var1 == 2;
      int var5 = var1 == 0 || var1 == 1;
      j.a("... ## spriteBatchLoad_executeLoadUnload() - Sprite: " + var0);
      if (d[var0]) {
         if (var3 && a[var0] == null) {
            j.a("... ## Loading sprite " + var0 + " - PaletteMask:" + W[var0] + " ##");
            a[var0] = a(var0, W[var0], (X[var0] & 1) != 0, (X[var0] & 2) != 0);
            var2 = true;
         }
      } else if (var5 && a[var0] != null) {
         a[var0].a();
         a[var0] = null;
         var2 = true;
         j.a("... ## Freeing sprite " + var0 + " ##");
         int var10000 = a("/3");
         var5 = var0;
         if ((var0 = h(var10000, var5)) != -1 && var0 >= Z.length) {
            e.b(var0);
            if (a[var5] != null) {
               a[var5].d();
               a[var5].c();
            }
         }
      }

      return var2;
   }

   private static void aL() {
      a(0, d.length, false, 0);
   }

   private static void m(int var0, int var1) {
      a(var0, var1, false, 0);
   }

   private static int a(int var0, int var1, boolean var2, int var3) {
      if (bW != 2 && bW != 3 && bW != 1 && bW != 18) {
         j.b("/3");
      }

      eL = a("/3");

      int var5;
      for (var5 = var0; var5 < var0 + var1; var5++) {
         boolean var4 = d(var5, var3);
         if (var2 && var4) {
            break;
         }
      }

      if (bW != 2 && bW != 3 && bW != 1 && bW != 18) {
         j.l();
         System.gc();
      }

      return var5;
   }

   private static int a(String var0) {
      return Integer.parseInt(var0.substring(1));
   }

   private static boolean e(int var0, int var1) {
      return (var0 & var1) != 0;
   }

   private static int a(int var0, int var1, int[][] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3][1] == var1 && var2[var3][0] == var0) {
            return var3;
         }
      }

      return -1;
   }

   private static boolean a(int var0, int[][] var1) {
      return Y[var1[var0][2]] + 2 <= var1[var0].length;
   }

   private static int h(int var0, int var1) {
      int var2 = 0 + Z.length;

      for (int var3 = 0; var3 < l.length; var3++) {
         if (l[var3][2] == 1) {
            if (l[var3][0] == var0 && l[var3][1] == var1) {
               return var2;
            }

            var2++;
         } else if (l[var3][2] == 2 && l[var3][0] == var0 && l[var3][1] == var1) {
            return l[var3][3];
         }
      }

      return -1;
   }

   public static int[] a(p var0) {
      int[] var3 = new int[4];
      int var1 = var0.a();
      int var2 = var0.b();
      if (var1 < 0) {
         return var3;
      }

      e var4;
      (var4 = var0.a()).a(var3, var1, var2, var0.a, var0.b, var4.b(var1, var2));
      return var3;
   }

   private static boolean b(int[] var0, int[] var1) {
      return var0[0] < var1[0] && var0[1] < var1[1] && var0[2] > var1[2] && var0[3] > var1[3];
   }

   private static void aM() {
      if (a == null || !a.e) {
         if (aJ && a == null) {
            try {
               if (!p.b(0) && b.b.a == 14) {
                  boolean var0 = false;
                  byte var1 = 18;
                  d(18, 1, false);
               }
            } catch (Exception var3) {
            }

            aJ = false;
         }

         switch (eT) {
            case 0:
               if (a[p].a.d == 0) {
                  a[p].i = 0;
                  eV = 24;
               }

               if (eU++ >= 10) {
                  eT = 1;
                  eU = 0;
                  return;
               }
               break;
            case 1:
               if (a[p].a == 0) {
                  if (ao) {
                     eS = j.b(1, 5);
                     int var8 = 373;
                     String var6 = a(373, (int)0);
                     var8 = eS;
                     String var2 = "";
                     switch (var8) {
                        case 0:
                        default:
                           break;
                        case 1:
                           short var13 = 139;
                           var2 = a(139, (int)0);
                           break;
                        case 2:
                           short var12 = 140;
                           var2 = a(140, (int)0);
                           break;
                        case 3:
                           short var11 = 141;
                           var2 = a(141, (int)0);
                           break;
                        case 4:
                           short var10 = 142;
                           var2 = a(142, (int)0);
                     }

                     c[0] = var2;
                     b(a(var6, c, '#'), 3000);
                  }

                  if (eS != 0) {
                     aH();
                     if (eV > 0) {
                        eV = 0;
                     }

                     if (eV <= 0) {
                        o = eS;
                        a[p].i = 0;
                        eT = 2;
                        eU = 0;
                        b.b.b = o;
                        eS = 0;
                        h(10, 30, false);
                        a(10, 26, false);
                        a(10, 27, false);
                        a(10, 28, false);
                        a(10, 29, false);
                        b.b.a(b.d);
                        return;
                     }
                  }

                  return;
               }

               if (a[p].i > 0) {
                  o = a[p].i;
               } else {
                  o = j.b(1, 5);
               }

               b.b.b = o;
               eT = 2;
               eU = 0;
               return;
            case 2:
               byte var4;
               if (n == 13) {
                  var4 = 8;
               } else {
                  var4 = 9;
               }

               if (r.a() != var4) {
                  r.b(var4, 1);
                  boolean var5 = false;
                  byte var7 = 10;
                  d(10, 1, false);
               }

               if (r.a()) {
                  eT = 3;
                  eU = 0;
                  r.b(-1, -1);
                  return;
               }
               break;
            case 3:
               if (p.a() < 0) {
                  p.a(a[67]);
                  p.a(o - 1);
                  p.b(0, 1);
                  eR = 24 + (o - 1);
                  h();
               }

               if (p.a()) {
                  p.b(-1, -1);
                  e = true;
                  if (aI) {
                     aO();
                     aO();
                     aI = false;
                  }

                  if (ay) {
                     a[p].d = -1;
                     a(5);
                     return;
                  }

                  a(20);
               }
         }
      }
   }

   private static void a(n var0, int var1, int var2) {
      j.a("rules.h:881:addDrawPileCard() - _iCardType:" + var1 + "    _iCardColor:" + var2);
      int var3 = var0.a;
      if (var0.a == 0) {
         var3 = 0;
      } else {
         var3 = Math.abs(a.nextInt() % var0.a);
      }

      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      q var4;
      (var4 = new q()).a = var1;
      var4.b = var2;
      var4.a = false;
      var4.d = 0;
      var4.a(var0.d);
      var4.a(a(10, 19, 2), a(10, 19, 3));
      var0.a(var4, var3);
   }

   private static void aN() {
      aa[0] = 0;
      aa[1] = 1;
      aa[2] = 2;
      aa[3] = 3;
      if (o.i == 2) {
         o.f = 4;
         aa[2] = aa[0];
         aa[3] = aa[1];
      }

      for (int var0 = 0; var0 < 4; var0++) {
         a[var0] = new r();
         a[var0].a = a[var0];
         a[var0].a = a[var0];
         a[var0].b = var0 + 0;
         a[var0].c = var0;
         a[var0].a.d = a[var0].b;
         a[var0].n = o.e;
         a[var0].e = -1;
         a[var0].g = 0;
         a[var0].h = 0;
         a[var0].m = 0;
         if (g) {
            c(var0, false);
         } else {
            c(var0, true);
         }

         if (f) {
            a[var0].a = d[var0];
         } else if (o.e()) {
            if (var0 == 0) {
               a[var0].a = 0;
            } else if (c[var0] >= c) {
               a[var0].a = 2;
            } else {
               a[var0].a = 1;
            }
         } else if (o.f()) {
            if (var0 == 0) {
               a[var0].a = 0;
            } else {
               a[var0].a = 1;
            }
         } else {
            label58: {
               if (o.c()) {
                  if (var0 == 0) {
                     a[var0].a = 0;
                     break label58;
                  }

                  if (var0 != 2) {
                     a[var0].a = 2;
                     break label58;
                  }
               } else {
                  if (o.d()) {
                     if (var0 == 0) {
                        a[var0].a = 0;
                     } else if (var0 == 1) {
                        a[var0].a = 2;
                     } else {
                        a[var0].a = 1;
                     }
                     break label58;
                  }

                  if (var0 == 0) {
                     a[var0].a = 0;
                     break label58;
                  }
               }

               a[var0].a = 1;
            }
         }

         a[var0].l = 0;
      }
   }

   public static int[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[] var8 = new int[4];
      if (var2 == var0 || var3 == var1) {
         return new int[]{var4, var5, var6, var7};
      } else if (var6 != var4 && var7 != var5) {
         var8[0] = var0 < var4 ? var0 : var4;
         var8[1] = var1 < var5 ? var1 : var5;
         var8[2] = var2 > var6 ? var2 : var6;
         var8[3] = var3 > var7 ? var3 : var7;
         return var8;
      } else {
         return new int[]{var0, var1, var2, var3};
      }
   }

   public static void a(int var0, int var1) {
      if (s.a()) {
         if (var0 == 12) {
            s.b(10, 1);
            s.a(var1 - 1);
            byte var2 = 0;
            var2 = 18;
            d(18, 1, false);
         } else if (var0 == 11) {
            s.b(4, 1);
            s.a(var1 - 1);
            byte var4 = 0;
            var4 = 18;
            d(18, 1, false);
         } else if (var0 == 10) {
            if (o.a) {
               s.b(0, 1);
            } else {
               s.b(15, 1);
            }

            s.a(var1 - 1);
            byte var6 = 0;
            var6 = 21;
            d(21, 1, false);
         }

         a[3] = a(s);
         if (var0 >= 10 && var0 <= 14) {
            q.b(10, 1);
         }
      }
   }

   private static void n(int var0, int var1) {
      if (var0 == 25) {
         ab[25] = 0;

         for (int var3 = 0; var3 < 6; var3++) {
            int var2 = var3;
            if ((0 & 1 << var2) != 0) {
               ab[25]++;
            }
         }
      } else if (var0 == 26) {
         ab[26] = 0;

         for (int var4 = 0; var4 < 16; var4++) {
            int var5 = var4;
            if ((0 & 1 << var5) != 0) {
               ab[26]++;
            }
         }
      }

      if (o.a() == 1) {
         if (var0 == 18) {
            ab[var0] = 1;
         } else {
            if (var0 < 25) {
               ab[var0]++;
            }
         }
      }
   }

   public static void f() {
      while (b.b.a != null) {
         n.a(b, 0, a, 0);
      }

      e = true;
   }

   public static void a(int var0) {
      if (var0 >= 0) {
         eM = var0;
      }
   }

   private static void aO() {
      eZ = m;
      q = 10;
      if (l == 1 && a[p].b) {
         q = 30;
      }

      for (int var0 = 0; var0 < 4; var0++) {
         if (a[var0].a != 2) {
            a[var0].a.e();
         }
      }

      a[p].a();
      if (o.g()) {
         if ((p = o.c()) == 0) {
            o.a(50, a[0]);
         }
      } else {
         p = o.d();
      }

      a[p].b();
      if (!a[p].g || p == 0 && o.a(a[p], 14)) {
         if (!a[p].i && !a[p].c && !a[p].d && !a[p].g && a == null && a[p].k) {
            eZ = 20;
         } else {
            eZ = 1;
         }
      } else {
         eZ = 6;
      }

      if (o.a) {
         c.b(12 + a[p].b, 1);
         d.b(-1, 1);
      } else {
         c.b(16 + a[p].b, 1);
         d.b(-1, 1);
      }

      if (f && a[p].a == 0) {
         for (int var1 = 0; var1 < 4; var1++) {
            a[(p + var1) % 4].b = var1 + 0;
            a[(p + var1) % 4].a.d = a[(p + var1) % 4].b;
            a[(p + var1) % 4].a.d();
         }
      }

      e = true;
      if (p == 0 && !a[p].g && !a[p].d) {
         aG();
      }
   }

   private static boolean d(int var0) {
      n var1 = a[var0].a;
      return a[var0].a.a == ac[var0] && a[var0].a != 2 || a[var0].a == 2;
   }

   private static void aP() {
      while (a[fa].a == 2) {
         fa = ++fa % 4;
      }

      n var1 = a[fa].a;
      int var0 = a[fa].a.a;
      if (a[fa].a.a < ac[fa] && aL) {
         var1 = a[0].a;
         if (a[0].a.a == 0 && o.d != 1) {
            byte var10001 = 4;
            boolean var2 = false;
            byte var8 = 6;
            d(6, 1, false);
         }

         a[fa].a(1);
         fa = ++fa % 4;
      }

      if (d(0) && d(1) && d(2) && d(3)) {
         boolean var3 = j.a(11) || j.a(5) || c(0, 0, c.e_, c.f_);
         if (o.i == 2 && c[0] == 0 && c[1] == 0 && c[2] == 0 && c[3] == 0) {
            if (!var3) {
               return;
            }

            int[] var9;
            a(var9 = new int[4], 0, 7, 0, 0);
            if (c(var9[0], var9[1], var9[2], var9[3])) {
               return;
            }
         }

         if (var3) {
            var3 = false;
            byte var10 = 16;
            d(16, 1, false);
         }

         int var11 = a(true);
         q var5;
         n = (var5 = a.a(var11)).a;
         o = var5.b;
         var5.e = 1;
         var5.a = false;
         var5.d = 0;
         var1 = b;
         n.a(a, var11, b, b.a);
         var5.d = true;
         q.a[5] = var5;
         e = true;
         a[p].a(n, o);
         a[p].b();
         q = 10;
         a(1);

         for (int var6 = 0; var6 < 4; var6++) {
            if (a[var6].a != 2) {
               a[var6].a.e();
            }
         }

         e(0);
         a[p].a(n, o);
         a[p].b(a[p].a.a(0));
         o.e = true;
         b(32, 0, false);
         if (!a[p].d(n, o, true)) {
            o.d = false;
         }

         if (p == 0) {
            aG();
         }
      }
   }

   private static void a(r var0, int var1) {
      if (var0.c) {
         if (l.a() < 0) {
            if (o.b() && a(var0.b) != var1) {
               aO();
            }

            var1 = b.b.b;
            l.b(0, 1);
            l.a(var1);
            eN = 16 + (var1 - 1);
            h();
            if (var0.b == 0) {
               l.a(c.bA, c.f_ * 3 / 4);
            } else if (var0.b == 1) {
               l.a(c.e_ / 4, c.bB);
            } else if (var0.b == 2) {
               l.a(c.bA, c.f_ / 4);
            } else if (var0.b == 3) {
               l.a(c.e_ * 3 / 4, c.bB);
            }

            a[1] = a(l);
         }

         var0.i = true;
         var0.c = false;
         if (o.b) {
            o.b = false;
         }

         a[p].a(7, false);
         if (o.d == 2) {
            a[o.a(p)].a(7, false);
         }

         boolean var46 = false;
         byte var37 = 19;
         d(19, 1, false);
      } else {
         if (var0.d && !var0.e) {
            if (!o.a(var0.a, 12) || var0.f) {
               if (o.b() && a(var0.b) != var1) {
                  aO();
               }

               var0.a(r);
               var0.d();
               r = 0;
               o.a(var0, false);
               var0.i = true;
               var0.d = false;
               if (o.d == 2) {
                  if (a[o.a(p)].a > 1) {
                     a[p].d(b[p]);
                     a[o.a(p)].d(b[o.a(p)]);
                  }

                  a[p].a(8, false);
                  a[o.a(p)].a(8, false);
               } else {
                  a[p].d(b[p]);
                  a[p].a(8, false);
               }

               a[p].a(a[188]);
               a[p].b(2, 1);
               boolean var45 = false;
               byte var36 = 27;
               d(27, 1, false);
               return;
            }

            if (p == 0) {
               var0.a(12, -1);
               o.a(50, var0);
            }
         }

         if (var0.g && !var0.e) {
            if (!o.a(var0.a, 14) || var0.f || p != 0 && (!var0.a.b(o, 0, false) || j.b(0, 100) >= r.d[var0.n])) {
               if (o.b()) {
                  if (a(var0.b) != var1) {
                     aI = true;
                  } else {
                     aI = false;
                  }
               } else {
                  aI = false;
               }

               var0.a(r);
               var0.d();
               r = 0;
               o.a(var0, false);
               var0.i = true;
               var0.g = false;
               if (o.d == 2) {
                  if (a[o.a(p)].a > 1) {
                     a[p].d(b[p]);
                     a[o.a(p)].d(b[o.a(p)]);
                  }

                  a[p].a(8, false);
                  a[o.a(p)].a(8, false);
               } else {
                  a[p].d(b[p]);
                  a[p].a(8, false);
               }

               boolean var44 = false;
               byte var35 = 25;
               d(25, 1, false);
               j.a("rules.h:3839:play sound SFX_FAIL");
               return;
            }

            if (p == 0) {
               var0.a(14, -1);
               o.a(50, var0);
            }
         }

         r var5 = var0;
         aH = true;
         boolean var10000;
         if (var5.a == 0) {
            r var6 = var5;
            if (ao) {
               short var3 = 372;
               b(a(372, (int)0), 3000);
               var6.d();
               var10000 = true;
            } else {
               label484: {
                  ay = false;
                  az = false;
                  n var20 = var6.a;
                  if (var6.a.a == 2 && var6.f > 0 && !var6.a && !o.g()) {
                     ay = true;
                  }

                  if (var6.a() == 1 && !var6.a && var6.e != -1) {
                     ay = true;
                  }

                  label506: {
                     if (!o.g()) {
                        if (var6.d != -1 && hB == 3) {
                           q var2;
                           if (!c((var2 = var6.a.a(var6.d)).f, var2.g, q.h, q.i) || var2.l == 0) {
                              var2.l = 1;
                           } else if (var2.l == 1) {
                              var2.l = 100;
                           } else if (var2.g >= c.f_ - (q.i << 1)) {
                              var2.l = 1;
                              q.b = false;
                           } else if (var2.e > 0 && !var2.a) {
                              var2.l = 100;
                           }
                        }

                        if (r()) {
                           for (q var9 = var6.a.b; var9 != null; var9 = var9.a) {
                              if (d(var9.f, var9.g, q.h, q.i) || e(var9.f, var9.g, q.h, q.i) && var6.d != -1) {
                                 if (var6.a.a(var9) != var6.d) {
                                    var6.b(var9);
                                 } else if (d(var9.f, var9.g, q.h, q.i) && var9.l == 0) {
                                    var9.l = 1;
                                 }
                                 break;
                              }
                           }
                        }

                        int[] var10 = new int[4];
                        a[23].a(var10, 0, a(10, 19, 2), a(10, 19, 3), 0);
                        if ((d(var10[0], var10[1], var10[2] - var10[0], var10[3] - var10[1]) || a(var10[0], var10[1], var10[2] - var10[0], var10[3] - var10[1]))
                           && a != null) {
                           a.b(14, -1);
                        }

                        if (c(var10[0], var10[1], var10[2] - var10[0], var10[3] - var10[1]) && var6.k && b()) {
                           var20 = var6.a;
                           if (var6.a.a < r[10][0] || var6.f == 0) {
                              a[a(var6.b)].d(b[a(var6.b)]);
                              if (o.d == 2) {
                                 a[o.a(a(var6.b))].d(b[o.a(a(var6.b))]);
                              }

                              q var16 = var6.a.a(var6.d);
                              boolean var41 = false;
                              byte var29 = 12;
                              d(12, 1, false);
                              if (k == 2) {
                                 var6.c();
                              } else {
                                 var16 = var6.a(1);
                              }

                              if (k == 1) {
                                 ay = false;
                                 var10000 = true;
                                 break label484;
                              }

                              var6.l = true;
                              var6.a(n, o);
                              ay = false;
                              var20 = var6.a;
                              if (var6.a.a == 2 && var6.f > 0 && !var6.a) {
                                 ay = true;
                              }

                              if (var16.e <= 0) {
                                 aH();
                                 var6.d();
                                 var10000 = true;
                                 break label484;
                              }

                              if (var16.a != 13 && var16.a != 14) {
                                 a(10, 23, false);
                                 a(10, 25, false);
                                 aG = true;
                              } else {
                                 a(10, 23, true);
                                 a(10, 25, true);
                              }

                              c(10, 23, bc);
                              var6.b(var16);
                              a(19);
                              break label506;
                           }

                           a(23);
                           short var25 = 657;
                           String var10001 = a(657, (int)0);
                           byte var14 = 26;
                           String var39 = var10001;
                           boolean var26 = false;
                           a(0, var39, var14, 0);
                        } else {
                           r var11 = var6;
                           if (var6.d == -1) {
                              var10000 = false;
                           } else {
                              label526: {
                                 q var12 = var11.a.a(var11.d);
                                 if (var12 != null) {
                                    if (var12.l == 100 || var12.g < c.f_ - (q.i << 1) && hB == 3 || var12.g < c.f_ - q.i * 5 / 3 && hB == 3 && i - h < 250L) {
                                       c(var10 = new int[]{0, 0, 0, 0}, 10, 20);
                                       int[] var21;
                                       c(var21 = new int[]{0, 0, 0, 0}, 10, 0);
                                       j.a("rules.h:4226:s_pointerReleasePosY:" + var10[1]);
                                       if (!c(var10[0], var10[1], var10[2], var10[3]) && !c(var21[0], var21[1], var21[2], var21[3]) && hG >= var10[1]) {
                                          var10000 = false;
                                          break label526;
                                       }

                                       var10000 = true;
                                       break label526;
                                    }

                                    if (var12.l == 3 && (var12.f <= 150 || var12.f + q.h >= 498 || var12.g <= 220)) {
                                       var10000 = true;
                                       break label526;
                                    }
                                 }

                                 var10000 = false;
                              }
                           }

                           if (var10000) {
                              if (var6.a.a(var6.d).e > 0 && !var6.a.a(var6.d).a && !var6.a.a(var6.d).e && var6.a.a(var6.d).l != 3) {
                                 if (o.g()) {
                                    o.c(0);
                                    o.c = true;
                                 }

                                 o.a(var6);
                                 var6.g = false;
                                 o.b();
                                 var6.e = var6.d;
                                 q var38 = var6.a.a(var6.e);
                                 a(var6, var38);
                                 var6.e = -1;
                                 if (ay && eM != 4) {
                                    b(32, 2, true);
                                    b(32, 0, false);
                                    var6.i = true;
                                    var6.k = false;
                                    var6.b(var6.a.a(0));
                                    a(5);
                                    var10000 = true;
                                 } else {
                                    if (var6.d > 0) {
                                       var6.b(var6.a.a(var6.d - 1));
                                    } else {
                                       var20 = var6.a;
                                       if (var6.a.a > 0) {
                                          var6.b(var6.a.a(0));
                                       } else {
                                          var6.d = -1;
                                       }
                                    }

                                    var10000 = true;
                                 }
                                 break label484;
                              }

                              if (var6.a.a(var6.d).l != 3) {
                                 var6.a.a(var6.d).l = 1;
                                 q.b = false;
                                 boolean var4 = false;
                                 byte var22 = 13;
                                 d(13, 1, false);
                              }
                           }
                        }
                     }

                     if (aE && !o.g()) {
                        b(32, 0, false);
                        o.f = true;
                        aE = false;
                     }

                     if (var6.e) {
                        if (o.l > 0 && aE) {
                           aE = false;
                           int var15;
                           if (o.g()) {
                              o.c(0);
                              o.c = true;
                              var6.a.d(n, o, true);
                              var15 = var6.a.c;
                           } else {
                              b(32, 0, false);
                              o.f = true;
                              var6.a.a(n, 0, true);
                              var15 = var6.a.c;
                           }

                           o.a(var6);
                           var6.g = false;
                           o.b();
                           var6.b(var6.a.a(var15));
                           var6.e = var15;
                           var20 = var6.a;
                           if (var6.a.a == 2 && var6.f > 0) {
                              ay = true;
                           }

                           q var40 = var6.a.a(var6.e);
                           a(var6, var40);
                           var6.e = -1;
                           if (ay && eM != 4) {
                              b(32, 2, true);
                              b(32, 0, false);
                              var6.i = true;
                              var6.k = false;
                              var6.b(var6.a.a(0));
                              a(5);
                              var10000 = true;
                           } else {
                              if (var15 > 0) {
                                 var6.b(var6.a.a(var15 - 1));
                              } else {
                                 var20 = var6.a;
                                 if (var6.a.a > 0) {
                                    var6.b(var6.a.a(0));
                                 } else {
                                    var6.d = -1;
                                 }
                              }

                              var10000 = true;
                           }
                           break label484;
                        }

                        if (var6.e) {
                           o.b(var6);
                        }
                     }
                  }

                  var10000 = false;
               }
            }
         } else {
            r var7 = var5;
            j.a("rules.h:4404:chooseToPlayNPC() - player " + a(var7.b));
            if (var7.e == -1) {
               j.a("rules.h:4409:chooseToPlayNPC() - Choosing card to play");
               var7.e = var7.a(n, o);
            }

            if (var7.e >= 0) {
               j.a("rules.h:4415:chooseToPlayNPC() - Has card to play");
               if (var7.a.a(var7.e).e) {
                  var10000 = false;
               } else {
                  j.a("rules.h:4423:chooseToPlayNPC() - Not bMove");
                  q var42 = var7.a.a(var7.e);
                  a(var7, var42);
                  a[a(var7.b)] = true;
                  var7.e = -1;
                  if (ap && j.b(0, 100) <= r[0][0]) {
                     int var18 = j.b(0, S.length);
                     D(var7.b, S[var18]);
                  } else if (!ap && j.b(0, 100) <= r[2][0]) {
                     int var17 = j.b(0, T.length);
                     D(var7.b, T[var17]);
                  }

                  StringBuffer var48 = new StringBuffer().append("rules.h:4441:chooseToPlayNPC() - len: ");
                  n var31 = var7.a;
                  j.a(var48.append(var7.a.a).append(" hascalluno: ").append(var7.a).toString());
                  var31 = var7.a;
                  if (var7.a.a == 1 && !var7.a) {
                     j.a("rules.h:4446:chooseToPlayNPC() - Need to choose if call UNO");
                     boolean var19 = false;
                     if (o.g == 0 && bq == 0 && o.a == 1) {
                        var19 = true;
                        j.a("rules.h:5429:FORCING MISS UNO!!");
                     }

                     if (var19 || j.b(0, 100) >= r.c[var7.n] && !f) {
                        j.a("rules.h:4456:chooseToPlayNPC() - Miss UNO");
                        var7.b = true;
                     } else {
                        j.a("rules.h:4451:chooseToPlayNPC() - Call UNO!");
                        var7.g();
                     }
                  }

                  var10000 = true;
               }
            } else {
               j.a("rules.h:4467:chooseToPlayNPC() - Unable to play any card : will draw fro draw pile ...");
               boolean var43 = false;
               byte var33 = 12;
               d(12, 1, false);
               if (k == 2) {
                  var7.c();
               } else {
                  j.a("rules.h:4476:Drawing 1 card from draw pile...");
                  var7.a(1);
               }

               if (o.d == 2) {
                  if (a[o.a(var7.b)].a > 1) {
                     a[a(var7.b)].d(b[a(var7.b)]);
                     a[o.a(a(var7.b))].d(b[o.a(a(var7.b))]);
                  }
               } else {
                  a[a(var7.b)].d(b[a(var7.b)]);
               }

               if (k == 1) {
                  var10000 = true;
               } else {
                  var7.a(n, o);
                  if (var7.f > 0) {
                     j.a("rules.h:4506:chooseToPlayNPC() - Drawn card is valid (played in the next round)");
                     var10000 = false;
                  } else {
                     j.a("rules.h:4512:chooseToPlayNPC() - Drawn card is invalid");
                     var10000 = true;
                  }
               }
            }
         }

         if (var10000) {
            n var34 = var0.a;
            if (var0.a.a == 0) {
               a = var0;
               e(7);
               return;
            }

            var0.i = true;
            var0.k = false;
            if (!f && var0.a == 1 && var0.b && l == 1) {
               a(17);
               q = 30;
               aM = true;
            }
         }
      }
   }

   public static void b(int var0, int var1) {
      var1 /= 2;
      if (t.a() < 0) {
         if (var0 < 0) {
            t.a.e(b.b.b);
         } else {
            t.a.e(aa[var0]);
         }

         t.b(var1, 1);
         if (var0 == 0) {
            t.a(c.bA, c.f_ - (q.i >> 1));
            t.a(0);
         } else if (var0 == 1) {
            t.a(q.i >> 1, c.bB);
            t.a(1);
         } else if (var0 == 2) {
            t.a(c.bA, q.i >> 1);
            t.a(2);
         } else if (var0 == 3) {
            t.a(c.e_ - (q.i >> 1), c.bB);
            t.a(3);
         } else {
            t.a(c.bA, c.bB);
            t.a(0);
         }

         a[2] = a(t);
      }
   }

   public static void b(int var0) {
      if (p != 0) {
         byte var1 = 0;
         var1 = 8;
         d(8, 1, false);
      } else {
         byte var3 = 0;
         var3 = 22;
         d(22, 1, false);
      }

      if (o.a() < 0) {
         if (var0 == 1) {
            o.a(a[71]);
            o.a(1);
            o.b(0, 1);
            eQ = 29;
            h();
            return;
         }

         if (var0 == 3) {
            o.a(a[71]);
            o.a(4);
            o.b(0, 1);
            eQ = 31;
            h();
            a[4].a(a[188]);
            a[4].a(0);
            a[4].b(22, 1);
            return;
         }

         if (var0 == 99) {
            o.a(a[71]);
            o.a(4);
            o.b(0, 1);
            return;
         }

         if (var0 == 2) {
            o.a(a[71]);
            o.a(3);
            o.b(0, 1);
            eQ = 30;
            h();
            return;
         }

         if (var0 == 0) {
            o.a(a[71]);
            o.a(5);
            o.b(0, 1);
            eQ = 28;
            h();
            return;
         }

         if (var0 == 4) {
            o.a(a[71]);
            o.a(2);
            o.b(0, 1);
            eQ = 32;
            h();
         }
      }
   }

   public static void c(int var0, int var1) {
      if (a[var0].a() < 0) {
         if (var1 == 2) {
            a[var0].a(a[188]);
            a[var0].a(0);
            if (var0 % 2 > 0) {
               a[var0].b(24, 2);
            } else {
               a[var0].b(23, 2);
            }
         } else if (var1 == 0) {
            a[var0].a(a[188]);
            a[var0].a(0);
            a[var0].b(var0 + 14, 1);
         } else if (var1 == 1 || var1 == 3 || var1 == 99 || var1 == 4) {
            a[var0].a(a[188]);
            a[var0].b(25, 1);
         }

         a[var0 + 6] = a(a[var0]);
      }
   }

   public static void d(int var0, int var1) {
      if (a[var0].a() < 0) {
         a[var0].a(a[186]);
         a[var0].a(0);
         a[var0].b(2, 1);
         a[var0 + 6] = a(a[var0]);
      }
   }

   private static void a(r var0, q var1) {
      if (var1.b != 0) {
         aH();
      }

      var0.n = false;
      switch (var1.a) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
            n = var1.a;
            o = var1.b;
            var0.a(var1);
            if (o.a(p)) {
            }
            break;
         case 10:
            n = var1.a;
            o = var1.b;
            var0.a(var1);
            e(147, 1);
            if (!o.a(p)) {
               n var13 = var0.a;
               if (var0.a.a != 0) {
                  o.a = !o.a;
                  if (o.b() == 2) {
                     o.b = true;
                  }

                  if (o.a) {
                     c.b(2, 1);
                     d.b(-1, 1);
                  } else {
                     c.b(3, 1);
                     d.b(-1, 1);
                  }
               }
            }

            a.a();
            Y(10);
            if (var0.b == 0) {
               n(1 + (var1.b - 1 << 2), 1);
            }
            break;
         case 11:
            n = var1.a;
            o = var1.b;
            var0.a(var1);
            e(148, 1);
            if (!o.a(p)) {
               n var12 = var0.a;
               if (var0.a.a != 0) {
                  a[o.d()].c = true;
               }
            }

            a.a();
            Y(11);
            if (var0.b == 0) {
               n(2 + (var1.b - 1 << 2), 1);
            }
            break;
         case 12:
            if (a[o.d()].l <= 0) {
               byte var9 = 0;
               var9 = 22;
               d(22, 1, false);
            }

            n = var1.a;
            o = var1.b;
            var0.a(var1);
            e(146, 1);
            a[p].d = false;
            n var11 = var0.a;
            if (var0.a.a == 0) {
               if (a[o.d()].l > 0) {
                  c(o.d(), 0);
               } else {
                  a[o.d()].a(r + 2);
                  a[o.d()].d();
               }
            } else if (!o.a(p)) {
               if (a[o.d()].l > 0) {
                  c(o.d(), 0);
               } else {
                  a[o.d()].d = true;
                  a(b, 2);
               }
            }

            a.a();
            Y(12);
            if (var0.b == 0) {
               n(3 + (var1.b - 1 << 2), 1);
            }
            break;
         case 13:
            n = var1.a;
            o = var1.b;
            var0.a(var1);
            e(149, 1);
            if (!o.a(p)) {
               n var6 = var0.a;
               if (var0.a.a != 0) {
                  boolean var7 = false;
                  byte var8 = 22;
                  d(22, 1, false);
                  a(4);
               }
            }

            a.a();
            Y(13);
            if (var0.b == 0) {
            }
            break;
         case 14:
            if (a[o.d()].l <= 0) {
               byte var2 = 0;
               var2 = 22;
               d(22, 1, false);
            }

            q var4 = b.b;

            while (var4 != null && var4.b <= 0) {
               var4 = var4.a;
            }

            n = var1.a;
            o = var1.b;
            var0.a(var1);
            e(150, 1);
            var0.h = !var0.a.b(var4.b, 0, false);
            n var5 = var0.a;
            if (var0.a.a == 0) {
               if (a[o.d()].l > 0) {
                  c(o.d(), 0);
               } else {
                  a[o.d()].a(r + 4);
                  a[o.d()].d();
               }
            } else if (!o.a(p)) {
               a(4);
               if (a[o.d()].l > 0) {
                  c(o.d(), 0);
               } else {
                  a[o.d()].g = true;
                  a[o.d()].a(14, -1);
                  a(b, 2);
               }
            }

            a.a();
            Y(14);
      }

      if (var0.a == 0) {
         e(8);
      }

      f(32, 0, o.g());
   }

   public static void a(n var0, int var1) {
      if (var0.b == null) {
         r = 0;
      } else if (var0.b.a != 12 && var0.b.a != 14) {
         r = 0;
      } else if (var0.b.a == 12) {
         r += 2;
      } else if (var1 == 0) {
         r += 2;
      } else if (var1 == 1) {
         r = r;
      } else {
         r += 4;
      }
   }

   private static void aQ() {
      r = 0;
   }

   public static boolean a() {
      return ax || bc;
   }

   public static int a(boolean var0) {
      if (var0) {
         var0 = 0;
         q var1 = a.a(0);

         while (var1.a > 9) {
            var1 = a.a(++var0);
         }
      } else {
         var0 = 0;
      }

      return var0;
   }

   private static void aR() {
      if (o.a == 3) {
         gm++;
         f(fn, gm);
         m(15);
      } else if (o.a == 0) {
         gn++;
         f(fm, gn);
         m(15);
      } else {
         m(42);
      }
   }

   public static void e(int var0, int var1) {
      if (o.a() != 3 || var0 == 144) {
         int var2;
         f(var2 = var0, i(s, var2) + var1);
      }
   }

   private static void aS() {
      a = new byte[1][fw];
      s = -1;
      a[0] = "";

      try {
         RecordStore var0;
         if ((var0 = RecordStore.openRecordStore("UNO", true)).getNumRecords() < 1) {
            for (int var1 = 0; var1 < 1; var1++) {
               boolean var2 = false;
               var2 = false;
               a(0, false, false, true);
               ac(0);
               var0.addRecord(a[0], 0, fw);
               var0.setRecord(1, a[0], 0, fw);
            }

            s = 0;
         } else {
            var0.enumerateRecords(null, null, false);

            for (int var4 = 0; var4 < 1; var4++) {
               a[0] = var0.getRecord(1);
               aa(0);
               ac(0);
            }

            if (s < 0) {
               aa(0);
            }
         }

         var0.closeRecordStore();
         i = a(s);
         int var6 = s;
         j = a(a[var6], 104, 17);
         a[0] = a(s);
         a[0] = a[0].trim();
      } catch (Exception var3) {
         s = 0;
      }
   }

   private static void aa(int var0) {
      if (i(0, 6) > 0) {
         s = 0;
      }

      if (s < 0) {
         s = 0;
      }

      int var2 = 13;
      aO = i(s, var2) > 0;
      var2 = (byte)9;
      aP = i(s, var2) > 0;
      var2 = (byte)10;
      aQ = i(s, var2) > 0;
      var2 = (byte)11;
      aR = i(s, var2) > 0;
      var2 = (byte)12;
      aS = i(s, var2) > 0;
      fP = i(0, 15);
      fQ = i(0, 16);
      fR = i(0, 14);
      fT = i(0, fe);
      br = b[7][fT][0];

      for (int var3 = 0; var3 < 5; var3++) {
         ap[var3] = i(0, ff + var3);
      }

      bb = i(0, 35) > 0;
      ax = i(0, 39) > 0;
      d = i(0, 40) > 0;
      aT = i(0, 38) > 0;
      aV = true;
      aW = true;
      j.a("saveLoad.h:441:s_musicEnable = " + aV + "  s_sfxEnable " + aW);
      ad(0);
      var2 = fk;
      fV = i(s, var2);
      var2 = fl;
      fW = i(s, var2);
      var2 = fm;
      gn = i(s, var2);
      var2 = fn;
      gm = i(s, var2);
      var2 = fo;
      go = i(s, var2);

      for (int var4 = 0; var4 < 6; var4++) {
         for (int var1 = 0; var1 < 5; var1++) {
            int[] var10000 = s[var4];
            var2 = fi + var4 * 5 + var1;
            var10000[var1] = i(s, var2);
         }
      }
   }

   private static void a(int var0, boolean var1, boolean var2, boolean var3) {
      j.a("saveLoad.h:474:RMS_Reset() - profileID:" + var0);
      int var4 = 0;
      bb = false;
      ax = false;
      d = false;
      o.e = 0;
      o.b(0);
      c = 250;
      o.j = 0;
      l = 1;
      i = 1;
      k = 0;
      o.m = 0;
      j = 3;
      if (var3) {
         a[0] = "";
      }

      fP = 0;
      fQ = 0;
      fR = 0;
      fT = 0;
      br = -1;

      for (int var5 = 0; var5 < 5; var5++) {
         ap[var5] = 0;
      }

      bC();
      fP = 0;
      fQ = 0;
      fR = 0;
      fS = 0;
      fV = fO;
      z(23, fV);
      z(24, fV);
      z(25, fV);
      fW = 0;
      fX = 0;
      aO = true;
      aP = true;
      aQ = true;
      aR = true;
      aS = true;
      b(var0, 1, 1);
      C = false;
      b(var0, 2, 0);
      a(var0, fh, 0L);
      B = false;
      b(var0, 3, 0);
      b(var0, 4, 0);
      b(var0, 5, 0);
      b(var0, 6, -1);
      b(var0, 7, -1);
      b(var0, 13, aO ? 1 : 0);
      b(var0, 9, aP ? 1 : 0);
      b(var0, 10, aQ ? 1 : 0);
      b(var0, 11, aR ? 1 : 0);
      b(var0, 12, aS ? 1 : 0);
      b(var0, fg, 0);
      if (var3) {
         i = "";
      }

      j = "";
      a(var0, i);
      b(var0, j);
      b(var0, 14, fR);
      b(var0, 15, 0);
      b(var0, 16, 0);
      fT = 0;
      b(var0, fe, 0);

      for (int var6 = 0; var6 < 5; var6++) {
         b(var0, ff + var6, 0);
         ap[var6] = 0;
      }

      br = -1;
      b(var0, 35, 0);
      b(var0, 37, aW ? 1 : 0);
      b(var0, 36, aV ? 1 : 0);
      aT = i(var0, 38) > 0;
      aV = true;
      aW = true;
      b(var0, 38, 1);
      b(var0, 36, 1);
      b(var0, 37, 1);
      d(1, aV);
      d(0, aW);
      b(var0, 39, 0);
      var4 = var0;
      b(var0, 41, o.e);
      b(var4, 42, o.i);
      b(var4, 43, c);
      b(var4, 44, o.j);
      b(var4, 45, l);
      b(var4, 46, i);
      b(var4, 47, k);
      b(var4, 48, o.m);
      b(var4, 49, j);
      b(var0, 95, 0);

      for (int var8 = 0; var8 < a.length; var8++) {
         b(var0, var8 + 96, 0);
         b(var0, var8 + 102, 0);
         b(var0, var8 + 108, 0);
      }

      for (int var9 = 115; var9 < 139; var9++) {
         b(var0, var9, 0);
      }

      for (int var10 = 139; var10 <= 168; var10++) {
         b(var0, var10, 0);
      }

      for (int var11 = t; var11 <= ae; var11++) {
         b(var0, var11, 0);
      }

      var4 = var0;
      b(var0, t, b[0][1]);
      b(var4, u, b[0][2]);
      b(var4, v, b[0][3]);
      b(var4, w, b[0][4]);
      b(var4, z, b[0][7]);
      b(var4, A, b[0][8]);
      b(var4, B, b[0][9]);
      b(var4, C, b[0][10]);
      b(var4, D, b[0][11]);
      b(var4, E, b[0][12]);
      b(var4, R, b[0][25]);
      b(var4, S, b[0][26]);
      b(var4, T, b[0][27]);
      b(var4, U, b[0][28]);
      b(var4, V, b[0][29]);
      b(var4, W, b[0][30]);
      b(var4, X, b[0][31]);
      b(var4, Y, b[0][32]);
      b(var4, Z, b[0][33]);
      b(var4, aa, b[0][34]);
      b(var4, ab, b[0][35]);
      b(var4, ac, b[0][36]);
      b(var4, ad, b[0][37]);
      b(var4, ae, b[0][38]);

      for (int var13 = fi; var13 < fi + 30; var13++) {
         b(var0, var13, 0);
      }

      for (int var14 = fj; var14 < fj + 30; var14++) {
         b(var0, var14, 0);
      }

      b(var0, fk, fV);
      b(var0, fm, 0);
      b(var0, fn, 0);
      b(var0, fo, 0);
      gn = 0;
      gm = 0;
      go = 0;
      b(var0, fp, -1);
      b(var0, fq, -1);

      for (int var15 = 0; var15 < 6; var15++) {
         b(var0, fr + var15, -1);
         b(var0, fs + var15, 0);
      }

      for (int var16 = ft; var16 < ft + 200; var16++) {
         b(var0, var16, 0);
      }

      if (var2) {
         if (a[0] != null) {
            a[0].g();
         }

         bk();
         bh();
         g(7, 0);
         g(8, 0);
         g(9, 0);
         bl();
         g();
      }

      if (var3) {
         b(var0, fu, -1);
      }

      if (var1) {
         ab(var0);
      }
   }

   private static void ab(int var0) {
      if (a == null) {
         j.a("!!!ERROR!!! In RMS_Load(): RMS must init first !!");
      } else {
         try {
            RecordStore var1;
            (var1 = RecordStore.openRecordStore("UNO", true)).setRecord(var0 + 1, a[var0], 0, fw);
            var1.closeRecordStore();
         } catch (Exception var2) {
         }
      }
   }

   private static void o(int var0, int var1) {
      if (a == null) {
         j.a("!!!ERROR!!! In RMS_Load(): RMS must init first !!");
      } else {
         f(var0, var1);
      }
   }

   public static int b(int var0) {
      return i(s, var0);
   }

   private static int i(int var0, int var1) {
      byte[] var10000 = a[var0];
      var1 <<= 2;
      byte[] var2 = var10000;
      return var10000[var1 + 3] & 0xFF | (var2[var1 + 2] & 0xFF) << 8 | (var2[var1 + 1] & 0xFF) << 16 | (var2[var1] & 0xFF) << 24;
   }

   public static void f(int var0, int var1) {
      b(s, var0, var1);
   }

   private static void b(int var0, int var1, int var2) {
      aN = true;
      byte[] var10000 = a[var0];
      int var10001 = var1 << 2;
      var2 = var2;
      var1 = var10001;
      byte[] var3 = var10000;
      var10000[var1 + 3] = (byte)var2;
      var3[var1 + 2] = (byte)(var2 >> 8);
      var3[var1 + 1] = (byte)(var2 >> 16);
      var3[var1] = (byte)(var2 >>> 24);
   }

   private static void a(int var0, int var1, long var2) {
      aN = true;
      byte[] var10000 = a[var0];
      int var10001 = var1 << 2;
      long var6 = var2;
      var1 = var10001;
      byte[] var8 = var10000;
      var10000[var1 + 7] = (byte)(var6 & 255L);
      var8[var1 + 6] = (byte)(var6 >> 8 & 255L);
      var8[var1 + 5] = (byte)(var6 >> 16 & 255L);
      var8[var1 + 4] = (byte)(var6 >> 24 & 255L);
      var8[var1 + 3] = (byte)(var6 >> 32 & 255L);
      var8[var1 + 2] = (byte)(var6 >> 40 & 255L);
      var8[var1 + 1] = (byte)(var6 >> 48 & 255L);
      var8[var1] = (byte)(var6 >> 56 & 255L);
   }

   private static void ac(int var0) {
      byte[] var6 = new byte[4];
      int[] var1 = new int[4];
      String var2 = j.a.getAppProperty("MIDlet-Version");
      j.a("saveLoad.h:812:VERSION: *" + var2 + "*");
      if (var2 != null) {
         int var3 = 0;
         int var4 = 0;

         for (int var5 = 0; var5 < var2.length(); var5++) {
            if (var2.charAt(var5) == '.') {
               var1[var3] = Integer.parseInt(var2.substring(var4, var5));
               j.a("saveLoad.h:826:Token " + var3 + ": " + var1[var3]);
               var4 = var5 + 1;
               var3++;
            }
         }

         if (var4 < var2.length()) {
            var1[var3] = Integer.parseInt(var2.substring(var4, var2.length()));
            j.a("saveLoad.h:834:Token " + var3 + ": " + var1[var3]);
            var3++;
         }

         int var9 = 0;

         for (int var7 = 4 - var3; var7 < 4; var7++) {
            var6[var7] = (byte)var1[var9];
            var9++;
         }
      }

      for (int var8 = 0; var8 < 4; var8++) {
         a[0][var8] = var6[var8];
      }
   }

   private static void a(int var0, String var1) {
      a(a[var0], 68, var1, 17);
   }

   public static String a(int var0) {
      return a(a[var0], 68, 17);
   }

   private static void b(int var0, String var1) {
      a(a[var0], 104, var1, 17);
   }

   private static void ad(int var0) {
      o.e = i(var0, 41);
      o.b(i(var0, 42));
      c = i(var0, 43);
      o.j = i(var0, 44);
      l = 1;
      i = i(var0, 46);
      k = i(var0, 47);
      j = i(var0, 49);
   }

   private static void ae(int var0) {
      if (o.a() != 3) {
         fS += var0;
         fR += var0;
         e(139, var0);
         b(s, 14, fR);
      }
   }

   private static void a(byte[] var0, int var1, int var2) {
      var0[var1 + 1] = (byte)var2;
      var0[var1] = (byte)(var2 >> 8);
   }

   private static String a(byte[] var0, int var1, int var2) {
      String var5 = "";
      int var3 = 0;

      while (var3 < 17) {
         StringBuffer var10000 = new StringBuffer().append(var5);
         int var4 = var1;
         byte[] var6 = var0;
         var5 = var10000.append((char)((short)((var0[var4] & 255) << 8 | var6[var4 + 1] & 0xFF) + 32)).toString();
         var3++;
         var1 += 2;
      }

      return var5.trim();
   }

   private static void a(byte[] var0, int var1, String var2, int var3) {
      var3 = 0;

      while (var3 < 17) {
         if (var3 >= var2.length()) {
            a(var0, var1, 0);
         } else {
            a(var0, var1, (short)(var2.charAt(var3) - ' '));
         }

         var3++;
         var1 += 2;
      }
   }

   private static void d(int var0, boolean var1) {
      j.a("sound.h:440:setSoundModeEnabled() - _iSoundMode:" + var0 + "   _bEnabled:" + var1 + " ============");
      f[var0] = var1;
   }

   public static void a(int var0, boolean var1) {
      d(var0, 1, false);
   }

   private static void af(int var0) {
      if (aT) {
         j.d(var0);
      }
   }

   private static void d(int var0, int var1, boolean var2) {
      StringBuffer var10000 = new StringBuffer().append("sound.h:528:+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++play sound: ");
      int var3 = var0;
      String var10001;
      switch (var0) {
         case 0:
            var10001 = "DATA.SOUND_M_ACHIEVEMENTS";
            break;
         case 1:
            var10001 = "DATA.SOUND_M_BATTLE";
            break;
         case 2:
            var10001 = "DATA.SOUND_M_CONGRATULATIONS";
            break;
         case 3:
            var10001 = "DATA.SOUND_M_LOSE";
            break;
         case 4:
            var10001 = "DATA.SOUND_M_TITLE";
            break;
         case 5:
            var10001 = "DATA.SOUND_M_WIN";
            break;
         case 6:
            var10001 = "DATA.SOUND_SFX_CARDS_DISTRIBUTION";
            break;
         case 7:
            var10001 = "DATA.SOUND_SFX_CHALLENGE";
            break;
         case 8:
            var10001 = "DATA.SOUND_SFX_CHALLENGE_FAILED";
            break;
         case 9:
            var10001 = "DATA.SOUND_SFX_CHALLENGE_SUCCESSFUL";
            break;
         case 10:
            var10001 = "DATA.SOUND_SFX_COLOR_HAS_CHANGED";
            break;
         case 11:
            var10001 = "DATA.SOUND_SFX_COLOR_SELECT_BLUE";
            break;
         case 12:
         default:
            var10001 = "no sound for " + var3;
            break;
         case 13:
            var10001 = "DATA.SOUND_SFX_ILLEGAL_MOVE";
            break;
         case 14:
            var10001 = "DATA.SOUND_SFX_MENU_BACK";
            break;
         case 15:
            var10001 = "DATA.SOUND_SFX_MENU_CONFIRM";
            break;
         case 16:
            var10001 = "DATA.SOUND_SFX_MENU_SELECT";
            break;
         case 17:
            var10001 = "DATA.SOUND_SFX_MENU_UNLOCK";
            break;
         case 18:
            var10001 = "DATA.SOUND_SFX_MISS_TURN";
            break;
         case 19:
            var10001 = "DATA.SOUND_SFX_MISS_TURN_REACT";
            break;
         case 20:
            var10001 = "DATA.SFX_PLAY_CARD || SFX_DRAW_CARD";
            break;
         case 21:
            var10001 = "DATA.SOUND_SFX_REVERSE";
            break;
         case 22:
            var10001 = "DATA.SOUND_SFX_SPECIAL_CARD";
            break;
         case 23:
            var10001 = "DATA.SOUND_SFX_STARS";
            break;
         case 24:
            var10001 = "DATA.SOUND_SFX_STREAK";
            break;
         case 25:
            var10001 = "DATA.SOUND_SFX_WILD_DRAW_FOUR";
            break;
         case 26:
            var10001 = "DATA.SOUND_SFX_WILD_DRAW_SIX";
            break;
         case 27:
            var10001 = "DATA.SOUND_SFX_WILD_DRAW_TWO";
            break;
         case 28:
            var10001 = "DATA.SOUND_VFX_YELL_UNO";
            break;
         case 29:
            var10001 = "DATA.SOUND_SFX_YOUR_TURN";
      }

      j.a(var10000.append(var10001).toString());
      var3 = var0;
      if (var0 == 22 || var3 == 13 || var3 == 13) {
         d(100);
      }

      byte var7 = b[i(var0)][1] == 1;
      if (!var2) {
         if (var7 && (!f[1] || !aV)) {
            return;
         }

         if (!var7 && (!f[0] || !aW)) {
            return;
         }
      }

      if ((var2 = g(var0)) != -1) {
         p.d(var2);
         if (var7) {
            var7 = 50;
         } else {
            var7 = 100;
         }

         p.a(var2, var0, var1, var7, b[i(var0)][2]);
         ad[var2] = var0;
         g[var2] = true;
      }
   }

   private static int g(int var0) {
      int var1 = -1;
      byte var2 = b[i(var0)][2];
      boolean var3 = b[i(var0)][1] == 1;

      for (int var4 = 0; var4 < 1; var4++) {
         if (!e(var4) && !g[var4]) {
            var1 = var4;
            var2 = 0;
            if (!var3) {
               break;
            }
         } else {
            if (ad[var4] < 0) {
               new StringBuffer()
                  .append("sound_findBestChannelForSound() - Sound reported to be playing in channel ")
                  .append(var4)
                  .append(" but s_soundPlayingNow has invalid value (<0)");
               var1 = -1;
               break;
            }

            if (var3 && b[i(ad[var4])][1] == 1) {
               if (f(h(var0), h(ad[var4]))) {
                  var1 = var4;
               } else {
                  var1 = -1;
               }
               break;
            }

            if (f(var2, b[i(ad[var4])][2])) {
               var2 = b[i(ad[var4])][2];
               var1 = var4;
            }
         }
      }

      return var1;
   }

   private static int h(int var0) {
      return b[i(var0)][2];
   }

   private static boolean f(int var0, int var1) {
      return var0 < var1;
   }

   public static void c(int var0) {
      for (int var1 = 0; var1 < 1; var1++) {
         if (e(0) && (ad[0] < 0 || b[i(ad[0])][1] == var0)) {
            boolean var2 = false;
            p.d(0);
         }
      }
   }

   private static boolean e(int var0) {
      boolean var1 = false;

      try {
         var1 = p.b(var0);
      } catch (Exception var2) {
      }

      return var1;
   }

   private static void aT() {
      p.e();
   }

   private static void aU() {
      try {
         j.c("/0");
         p.c(31);
         p.e(100);

         for (int var0 = 0; var0 < 31; var0++) {
            if (!p.a(var0)) {
               p.a("/4", var0);
            }
         }

         aX = true;
      } catch (Exception var1) {
      }
   }

   public static void d(int var0) {
      if (aT && aU) {
         j.d(var0);
         j.a("sound.h:967: *** BZZZZ ***  *** BZZZZ ***  *** BZZZZ *** ");
      }
   }

   private static int i(int var0) {
      int var1 = -1;

      for (int var2 = 0; var2 < b.length; var2++) {
         if (b[var2][0] == var0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         new StringBuffer().append("Could Not find sound index> ").append(var0);
      }

      return var1;
   }

   private static String a(String var0) {
      if (var0 == null) {
         return null;
      }

      char[] var5 = var0.toCharArray();

      for (int var1 = 1; var1 < var5.length; var1++) {
         if (var5[var1 - 1] == '\\') {
            if (aZ) {
               var5[var1] = (char)(var5[var1] > '0' ? 51 : 48);
            } else {
               int var2 = var5[var1] - '0';
               int var3 = 0;

               int var10002;
               label46:
               while (true) {
                  if (var3 >= o.length) {
                     var10002 = var2;
                     break;
                  }

                  for (int var4 = 0; var4 < o[var3].length; var4++) {
                     if (var2 == o[var3][var4]) {
                        var10002 = var3;
                        break label46;
                     }
                  }

                  var3++;
               }

               var5[var1] = (char)(var10002 + 48);
            }
         }
      }

      return new String(var5, 0, var5.length);
   }

   private static void p(int var0, int var1) {
      if (var1 >= 4) {
         var1 %= 4;
      }

      b[var0].e(var1);
   }

   private static void a(int var0, String var1, int var2, int var3, int var4, int var5) {
      a(j.b, var0, var1, var2, var3, 3, var5);
   }

   private static void a(Graphics var0, int var1, String var2, int var3, int var4, int var5, int var6) {
      int var7 = var1;
      var7 = b[var7].f();
      if (var6 > -1) {
         p(var1, var6);
      }

      b[var1].a(var0, var2, var3, var4, var5);
      p(var1, var7);
   }

   private static short[] a(int var0, String var1, int var2, int var3) {
      return b[var0].a(var1, var2, var3);
   }

   private static void a(int var0, String var1, short[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      p(var0, var9);
      if (aY) {
         var1 = a(var1);
      } else {
         var1 = var1;
      }

      b[var0].a(j.b, var1, var2, var3, var4, 0, -1, var7, var8);
      b[var0].e(0);
   }

   static boolean a(int var0, int var1) {
      return a(var0, var1, 14) != 0;
   }

   private static boolean g(int var0, int var1) {
      return (c[var0][var1] & 1) != 0;
   }

   private static void a(int var0, int var1, String var2) {
      a[var0][var1] = var2;
   }

   static void a(int var0, int var1, boolean var2) {
      a[var0][var1][14] = (short)(var2 ? 1 : 0);
   }

   private static void e(int var0, int var1, boolean var2) {
      new StringBuffer().append("SetButtonPressed() - Item ").append(var1).append("  in layer ").append(var0).append(" is not a Button!!");
      if (var2) {
         c[var0][var1] = (byte)(c[var0][var1] | 1);
      } else {
         c[var0][var1] = (byte)(c[var0][var1] & -2);
      }
   }

   private static void f(int var0, int var1, boolean var2) {
      if (var2) {
         c[var0][var1] = (byte)(c[var0][var1] | 2);
      } else {
         c[var0][var1] = (byte)(c[var0][var1] & -3);
      }
   }

   static void b(int var0, int var1, boolean var2) {
      if (var2) {
         c[var0][var1] = (byte)(c[var0][var1] & -5);
      } else {
         c[var0][var1] = (byte)(c[var0][var1] | 4);
      }
   }

   private static boolean h(int var0, int var1) {
      return (c[var0][var1] & 4) != 0;
   }

   static void c(int var0, int var1, boolean var2) {
      if (var2) {
         c[var0][var1] = (byte)(c[var0][var1] | 4);
      } else {
         c[var0][var1] = (byte)(c[var0][var1] & -5);
      }
   }

   private static void a(int[] var0, int var1, int var2) {
      boolean var3 = (c[var1][var2] & 1) != 0;
      boolean var4 = (c[var1][var2] & 2) != 0;
      boolean var5 = (c[var1][var2] & 4) != 0;
      short[] var6;
      short var7 = (var6 = a[var1][var2])[5];
      e var8;
      if ((var8 = a[var7]) == null) {
         new StringBuffer()
            .append(" Sprite used for this button(")
            .append(var7)
            .append(") is null. gameLayer: ")
            .append(var1)
            .append("; buttonIdx: ")
            .append(var2);
      } else {
         short var9 = var5 ? (var6[12] != -1 ? var6[12] : var6[6]) : (var4 && var6[10] != -1 ? var6[10] : (var3 ? var6[8] : var6[6]));
         var8.a(var0, var9, 0, 0, 0);
      }
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4) {
      boolean var5 = (c[var1][var2] & 1) != 0;
      boolean var6 = (c[var1][var2] & 2) != 0;
      boolean var7 = (c[var1][var2] & 4) != 0;
      short[] var8;
      short var9 = (var8 = a[var1][var2])[5];
      e var10;
      if ((var10 = a[var9]) == null) {
         new StringBuffer()
            .append(" Sprite used for this button (")
            .append(var9)
            .append(") is null. gameLayer: ")
            .append(var1)
            .append("; buttonIdx: ")
            .append(var2);
      } else {
         short var11 = var7 ? (var8[12] != -1 ? var8[12] : var8[6]) : (var6 && var8[10] != -1 ? var8[10] : (var5 ? var8[8] : var8[6]));
         var10.a(var0, var11, var8[2] + var3, var8[3] + var4, 0);
      }
   }

   private static void d(int var0, int var1, int var2, int var3) {
      f(j.b, var0, var1, var2, var3);
   }

   private static void f(Graphics var0, int var1, int var2, int var3, int var4) {
      short[] var5 = a[var1][var2];
      int var6 = (c[var1][var2] & 1) != 0;
      boolean var7 = (c[var1][var2] & 32) != 0;
      int var8 = (c[var1][var2] & 2) != 0;
      int var9 = (c[var1][var2] & 4) != 0;
      boolean var10 = (c[var1][var2] & 8) != 0;
      boolean var11 = (c[var1][var2] & 16) != 0;
      int var12 = var5[5];
      short var10000;
      if (var9) {
         if (var5[12] != -1) {
            var9 = var5[12];
            var8 = var5[13];
            var10000 = var5[20];
         } else {
            var9 = var5[6];
            var8 = var5[7];
            var10000 = var5[17];
         }
      } else if (var8 && var5[10] != -1) {
         var9 = var5[10];
         var8 = var5[11];
         var10000 = var5[19];
      } else {
         var9 = var6 ? var5[8] : var5[6];
         var8 = var6 ? var5[9] : var5[7];
         var10000 = var6 ? var5[17] : var5[18];
      }

      var6 = var10000;
      e var13;
      if ((var13 = a[var12]) == null) {
         new StringBuffer()
            .append(" Sprite used for this button (")
            .append(var12)
            .append(") is null. gameLayer: ")
            .append(var1)
            .append("; buttonIdx: ")
            .append(var2);
      } else {
         var12 = 0;
         if (var8 > 0) {
            var12 = var13.f();
            var13.e(var8);
         }

         if (var10) {
            j.h(9);
         }

         if (var11) {
            j.h(12);
            j.a(12, 1, 64);
         }

         var13.a(var0, var9, var5[2] + var3, var5[3] + var4, 0, 0, 0);
         if (var8 > 0) {
            var13.e(var12);
         }

         if (var5[15] >= 0) {
            var12 = 0;
            e var19 = a[var5[15]];
            if (var6 > 0) {
               var12 = var19.f();
               var19.e(var6);
            }

            var9 = var5[16];
            var19.a(var0, var9, var5[2] + var3 + var5[21], var5[3] + var4 + var5[22], 0, 0, 0);
            if (var6 > 0) {
               var19.e(var12);
            }
         }

         if (a[var1][var2] != null) {
            String var20 = a[var1][var2];
            e var14;
            if ((var14 = a(var9 = var5[23])) == null) {
               return;
            }

            short var15 = var5[27];
            var6 = 0;
            if (var15 > 0) {
               var6 = var14.f();
               var14.e(var15);
            }

            if (var5[28] == 1) {
               var9 = c.e_;
               a(var14, var9, 1);
               short[] var26 = var14.a(var20, var9, false);
               var14.a(var0, var20, var26, var5[2] + var3 + var5[25], var5[3] + var4 + var5[26], 0, -1, 3);
            } else {
               var14.a(var0, var20, var5[2] + var3 + var5[25], var5[3] + var4 + var5[26], 3);
            }

            if (var15 > 0) {
               var14.e(var6);
            }
         }

         if (var11) {
            j.i(12);
         }

         if (var10) {
            j.i(9);
         }

         if (var7) {
            var8 = var5[2] + 200;
            var9 = var5[3] - null.getHeight() / 2;
            s.a(j.b, null, var8, var9, 0);
         }
      }
   }

   private static void aV() {
      for (int var0 = 0; var0 < a.length; var0++) {
         int var1 = var0;

         for (int var2 = 0; var2 < a[var1].length; var2++) {
            if (k(var1, var2) == 6) {
               e(var1, var2, false);
            }
         }
      }
   }

   private static void g(int var0, int var1, boolean var2) {
      a[var0][var1][18] = (short)(var2 ? 1 : 0);
   }

   private static void b(int var0, int var1, String var2) {
      a[var0][var1] = var2;
   }

   private static void a(String var0, int var1, int var2, int var3, int var4) {
      a(j.b, var0, var1, var2, var3, var4);
   }

   private static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         short[] var6 = a[var2][var3];
         if (bW == 45 && hA != 6) {
            a(var0, var1, var6[2] + var4, var6[3] + var5, var6[5], var6[6], var6[10], var6[9], var6[7], var6[8], 2);
         } else {
            a(var0, var1, var6[2] + var4, var6[3] + var5, var6[5], var6[6], var6[10], var6[9], var6[7], var6[8], var6[12]);
         }
      }
   }

   private static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 != null) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         switch (var6) {
            case 0:
               var11 = 16;
               var13 = var3;
               break;
            case 1:
               var11 = 2;
               var13 = var3 + (var5 >> 1);
               break;
            case 2:
               var11 = 32;
               var13 = var3 + var5;
         }

         switch (var7) {
            case 0:
               var11 |= 4;
               var12 = var2;
               break;
            case 1:
               var11 |= 1;
               var12 = var2 + (var4 >> 1);
               break;
            case 2:
               var11 |= 8;
               var12 = var2 + var4;
         }

         if (aY) {
            f = a(var1);
         } else {
            f = var1;
         }

         e var18;
         if ((var18 = a(var8)) != null) {
            int var14 = var18.f();
            if (var9 >= 0) {
               var18.e(var9);
            }

            short[] var35 = null;
            if (var10 == 2 || var10 == 4 || var10 == 1) {
               var35 = var18.a(f, var4, false);
               int var15 = var18.e() + var18.b();
               var15 = var35[0] * var15;
               if (var10 == 1) {
                  if (var15 > var5) {
                     var10 = 4;
                  } else {
                     var10 = 2;
                  }
               }
            }

            if (var10 == 2) {
               a(var18, var4, var5);
               var18.a(var0, f, var35, var12, var13, 0, -1, var11);
            } else if (var10 == 3) {
               var10 = var7;
               var9 = var6;
               var7 = var5;
               var6 = var4;
               var5 = var3;
               var4 = var2;
               String var22 = f;
               var2 = var8;
               var0 = var0;
               e var20 = a(var2);
               var11 = (byte)0;
               var12 = 0;
               var13 = 0;
               switch (var9) {
                  case 0:
                     var11 = (byte)16;
                     var13 = var5;
                     break;
                  case 1:
                     var11 = (byte)2;
                     var13 = var5 + (var7 >> 1);
                     break;
                  case 2:
                     var11 = (byte)32;
                     var13 = var5 + var7;
               }

               switch (var10) {
                  case 0:
                     var11 |= 4;
                     var12 = var4;
                     break;
                  case 1:
                     var11 |= 1;
                     var12 = var4 + (var6 >> 1);
                     break;
                  case 2:
                     var11 |= 8;
                     var12 = var4 + var6;
               }

               var5 = var20.c();
               var5 = var13 - (var5 >> 1);
               var20.a(var22);
               var7 = e.a;
               if (e.a <= var6) {
                  var20.a(var0, f, var12, var13, var11);
               } else {
                  String var45 = var22;
                  int var49 = -1;

                  for (int var16 = 0; var16 < 10; var16++) {
                     if (b[var16] != null && var45.equals(b[var16])) {
                        var49 = var16;
                        break;
                     }
                  }

                  var7 = var49;
                  var9 = j.i();
                  var10 = j.j();
                  var11 = j.k();
                  var12 = j.l();
                  if (var4 > var9) {
                     if (var7 == -1) {
                        var13 = -1;

                        for (int var50 = 0; var50 < 10; var50++) {
                           if (b[var50] == null) {
                              var13 = var50;
                              break;
                           }
                        }

                        var7 = var13;
                        if (var13 != -1) {
                           int var54 = var6;
                           String var51 = var22;
                           var13 = var7;
                           ae[var13] = 0;
                           af[var13] = 0;
                           b[var13] = var51;
                           ag[var13] = 0;
                           ah[var13] = var54;
                           ai[var13] = 20;
                           ae[var7] = ae[var7] + j.a_;
                           j.a(var4, 0, var6, j.h());
                           var20.a(var0, var22, var4, var5, 0);
                           j.a(0, 0, j.g(), j.h());
                        }
                     } else {
                        ae[var7] = ae[var7] + j.a_;
                        j.a(var4, 0, var6, j.h());
                        var20.a(var0, var22, var4 - ag[var7], var5, 0);
                        j.a(0, 0, j.g(), j.h());
                     }
                  }

                  j.a(var9, var10, var11, var12);
               }

               e var21 = a(var8);

               for (int var23 = 0; var23 < 10; var23++) {
                  if (b[var23] != null) {
                     af[var23] = af[var23] + j.a_;
                     var21.a(b[var23]);
                     var4 = e.a;
                     ai[var23]--;
                     if (ai[var23] <= 0) {
                        ag[var23]++;
                        if (ag[var23] > var4) {
                           ag[var23] = ag[var23] - var4;
                           ag[var23] = ag[var23] - ah[var23];
                        } else if (ag[var23] == 0) {
                           ai[var23] = 20;
                        }

                        if (af[var23] - ae[var23] >= 2000) {
                           var5 = var23;
                           ae[var5] = 0;
                           af[var5] = 0;
                           b[var5] = null;
                           ag[var5] = 0;
                           ah[var5] = 0;
                           ai[var5] = 0;
                        }
                     }
                  }
               }
            } else if (var10 == 4) {
               int var52 = var18.e() + var18.b();
               var52 = var35[0] * var52 + (var5 >> 1);
               j.a(var2, var3, var4, var5);
               var18.a(var0, f, var35, var12, var13 - fx, 0, -1, var11);
               if (fx < var52 && fx + var5 >= var52) {
                  var18.a(var0, f, var35, var12, var13 + var52 - fx, 0, -1, var11);
               }

               if (fx + 3 >= var52) {
                  fx = 0;
                  fy = 0;
               }

               if (fy > 1) {
                  fx += 3;
               } else {
                  fy++;
               }

               j.a(0, 0, j.g(), j.h());
            } else {
               a(var18, var4, var5);
               var18.a(var0, f, var12, var13, var11);
            }

            var18.e(var14);
         }
      }
   }

   private static boolean i(int var0, int var1) {
      return a(var0, var1, 10) != 0;
   }

   private static void h(int var0, int var1, boolean var2) {
      a[var0][var1][10] = (short)(var2 ? 1 : 0);
   }

   private static void c(int var0, int var1, int var2) {
      short[] var3;
      var1 = (var3 = a[13][var1])[7] & 1536;
      var3[6] = 0;
      var3[7] = (short)(var2 | var1);
   }

   private static void b(int[] var0, int var1, int var2) {
      short[] var3;
      short var4 = (var3 = a[var1][var2])[5];
      short var5 = var3[6];
      int var6 = var3[7];
      e var7;
      if ((var7 = a[var4]) == null) {
         new StringBuffer().append(" Sprite used for this item is null. gameLayer: ").append(var1).append("; graphItemIdx: ").append(var2);
      } else if (var6 >= 0) {
         var6 &= -1537;
         var7.a(var0, var6, var5, var3[2], var3[3], 0);
      } else {
         var7.a(var0, var5, var3[2], var3[3], 0);
      }
   }

   private static void e(int var0, int var1, int var2, int var3) {
      int var4 = var3;
      var3 = var2;
      var2 = var1;
      var1 = var0;
      Graphics var12 = j.b;
      short[] var5 = a[var1][var2];
      boolean var6 = (c[var1][var2] & 8) != 0;
      boolean var7 = (c[var1][var2] & 16) != 0;
      short var8 = var5[5];
      short var9 = var5[6];
      int var10 = var5[7];
      e var11;
      if ((var11 = a[var8]) == null) {
         new StringBuffer()
            .append(" Sprite used to paint this item (")
            .append(var8)
            .append(") is null. gameLayer: ")
            .append(var1)
            .append("; graphItemIdx: ")
            .append(var2);
      } else {
         var1 = 0;
         if (var5[8] >= 0) {
            var1 = var11.f();
            var11.e(var5[8]);
         }

         if (var6) {
            j.h(9);
         }

         if (var7) {
            j.h(12);
            j.a(12, 1, 64);
         }

         if (var10 < 0) {
            var11.a(var12, var9, var5[2] + var3, var5[3] + var4, 0, 0, 0);
         } else {
            var10 &= -1537;
            var11.a(var12, var10, var9, var5[2] + var3, var5[3] + var4, 0, 0, 0);
         }

         if (var7) {
            j.i(12);
         }

         if (var6) {
            j.i(9);
         }

         if (var5[8] >= 0) {
            var11.e(var1);
         }
      }
   }

   private static void c(int[] var0, int var1, int var2) {
      short[] var3 = a[var1][var2];
      var0[0] = var3[2];
      var0[1] = var3[3];
      var0[2] = var3[2] + var3[5] - 1;
      var0[3] = var3[3] + var3[6] - 1;
   }

   private static void f(int var0, int var1, int var2, int var3) {
      int var4 = var3;
      var3 = var2;
      var2 = var1;
      var1 = var0;
      Graphics var9 = j.b;
      short[] var11;
      var2 = (var11 = a[var1][var2])[2] + var3;
      var3 = var11[3] + var4;
      short var17 = var11[5];
      short var5 = var11[6];
      int var6 = var11[8] & 255;
      int var7 = var11[9] & 255;
      int var8 = var11[10] & 255;
      var6 = (var1 = var11[7] & 255) << 24 | var6 << 16 | var7 << 8 | var8;
      if (var1 == 255) {
         var9.setColor(var6);
         j.c(var9, var2, var3, var17, var5);
      } else {
         if (var1 > 0) {
            j.g(var6);
            j.e(var9, var2, var3, var17, var5);
         }
      }
   }

   private static void g(int var0, int var1, int var2, int var3) {
      short[] var11;
      var1 = (var11 = a[var0][var1])[2] + var2;
      var2 = var11[3] + var3;
      short var14 = var11[5];
      short var4 = var11[6];
      int var5 = var11[9] & 255;
      int var6 = var11[10] & 255;
      int var7 = var11[11] & 255;
      int var8 = var11[12] & 255;
      int var9 = var5 << 24 | var6 << 16 | var7 << 8 | var8;
      int var10 = var5;
      var5 = var11[13] & 255;
      var6 = var11[14] & 255;
      var7 = var11[15] & 255;
      var8 = var11[16] & 255;
      var6 = var5 << 24 | var6 << 16 | var7 << 8 | var8;
      byte var19 = 16;
      switch (var11[8]) {
         case 0:
            var19 = 16;
            break;
         case 1:
            var19 = 32;
            break;
         case 2:
            var19 = 4;
            break;
         case 3:
            var19 = 8;
      }

      if (var10 == 255 && var5 == 255) {
         j.b(var1, var2, var14, var4, var9, var6, var19);
      } else {
         j.c(var1, var2, var14, var4, var9, var6, var19);
      }
   }

   private static void h(int var0, int var1, int var2, int var3) {
      short[] var4;
      short[] var10000 = var4 = a[var0][var1];
      var10000[16] = (short)(var10000[16] + var2);
      var4[17] = (short)(var4[17] + var3);
      if (var4[16] > var4[14]) {
         var4[16] = var4[14];
      } else if (var4[16] < var4[12]) {
         var4[16] = var4[12];
      }

      if (var4[17] > var4[15]) {
         var4[17] = var4[15];
      } else if (var4[17] < var4[13]) {
         var4[17] = var4[13];
      }

      boolean var7 = var4[21] != var4[16] || var4[22] != var4[17];
      var7 = var7;
      var1 = var1;
      var0 = var0;
      a[var0][var1][23] = (short)(var7 ? 1 : 0);
   }

   private static boolean j(int var0, int var1) {
      return a[var0][var1][24] == 1;
   }

   private static void i(int var0, int var1, boolean var2) {
      a[var0][var1][24] = (short)(var2 ? 1 : 0);
   }

   private static void d(int var0, int var1, int var2) {
      a[var0][var1][11] = (short)var2;
   }

   private static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      a[var0][var1][12] = (short)var2;
      a[var0][var1][13] = (short)var3;
      a[var0][var1][14] = 0;
      a[var0][var1][15] = 0;
   }

   private static int j(int var0, int var1) {
      int var2 = a[var0][var1][14] - a[var0][var1][12];
      int var3 = -a[var0][var1][16];
      short var4 = a[var0][var1][25];
      var1 = (var3 + var4 / 2) / var4;
      j.a(
         "cGame_GUI_ScrollWindow.h:521:ScrollWindow_getCurrentPageHoriz() - iRangeX:"
            + var2
            + "   iPositionX:"
            + var3
            + "   iPageWidth"
            + var4
            + "   iPageH:"
            + var1
      );
      return var1;
   }

   private static void e(int var0, int var1, int var2) {
      int var3 = a[var0][var1][25];
      var3 = -(var2 * var3);
      j.a("cGame_GUI_ScrollWindow.h:534:ScrollWindow_setTargetPageX() - _iPage:" + var2);
      if (var3 < a[var0][var1][12]) {
         var3 = a[var0][var1][12];
      }

      if (var3 > a[var0][var1][14]) {
         var3 = a[var0][var1][14];
      }

      var2 = var3;
      var1 = var1;
      var0 = var0;
      a[var0][var1][27] = (short)var2;
   }

   private static void q(int var0, int var1) {
      j.a("cGame_GUI_ScrollWindow.h:554:ScrollWindow_HandleRelease()");
      short var2 = l(var0, var1);
      int var4 = var1;
      int var3 = var0;
      int var8 = a[var3][var4][26] != -1;
      if (!var2 && !var8) {
         short var10002 = (short)hJ;
         short var10003 = (short)hK;
         var2 = (byte)4;
         short var5 = var10003;
         var2 = var10002;
         var4 = var1;
         var8 = var0;
         short[] var10;
         (var10 = a[var8][var4])[18] = var2;
         var10[19] = var5;
         var10[20] = 4;
         i(var0, var1, false);
      } else if (var2 && hJ != 0) {
         if (hJ > 15) {
            e(var0, var1, j(var0, var1) - 1);
            return;
         }

         if (hJ < 15) {
            e(var0, var1, j(var0, var1) + 1);
            return;
         }
      } else if (!var8 || hK == 0) {
         e(var0, var1, j(var0, var1));
         return;
      }
   }

   private static boolean k(int var0, int var1) {
      return a(var0, var1, 7) != 0;
   }

   private static void j(int var0, int var1, boolean var2) {
      a[61][15][7] = (short)(var2 ? 1 : 0);
   }

   private static boolean l(int var0, int var1) {
      return a[var0][var1][25] != -1;
   }

   private static void r(int var0, int var1) {
      a[var0][var1][27] = 12345;
   }

   private static void aW() {
      a = new short[68][][];
      b = new short[68][][];
      a = new byte[68];
      c = new byte[68][];
      a = new String[68][];
      h = new boolean[68];

      for (int var0 = 0; var0 < 68; var0++) {
         a[var0] = null;
         b[var0] = null;
         a[var0] = (byte)(j.c_ - 1);
         c[var0] = null;
         a[var0] = null;
         h[var0] = false;
      }

      j.b("/7");

      for (int var9 = 0; var9 < 68; var9++) {
         if (b[var9] == null) {
            int var1 = var9;
            byte[] var2 = j.a(var9);
            int var3 = 0;
            int var4 = 0;

            while (var3 < var2.length) {
               var4++;
               var3 += 8;
               var3 += j.a(var2, var3) + 1 << 1;
            }

            byte var11 = 0;
            a[var1] = new short[var4][];
            b[var1] = new short[var4][];
            c[var1] = new byte[var4];
            a[var1] = new String[var4];

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = 5 + j.a(var2, var11 + 8);
               b[var1][var5] = new short[var6];
               a[var1][var5] = new short[var6];
               a[var1][var5] = null;
               short[] var7 = b[var1][var5];

               for (int var8 = 0; var8 < var6; var8++) {
                  var7[var8] = j.a(var2, var11);
                  var11 += 2;
               }

               short var12;
               if (var7[0] == 1 && (var12 = var7[7]) >= 0) {
                  switch (var7[6]) {
                     case -3:
                        var12 |= 1024;
                        break;
                     case -2:
                        var12 |= 512;
                  }

                  var7[6] = 0;
                  var7[7] = (short)var12;
               }

               if (var7[0] == 102) {
                  h[var1] = true;
               }
            }

            ag(var1);
         }
      }

      j.l();
   }

   private static void ag(int var0) {
      int var1 = var0;
      if (a[var1].length != b[var1].length) {
         for (int var2 = 0; var2 < a[var1].length; var2++) {
            a[var1][var2] = null;
         }

         a[var1] = null;
         c[var1] = null;
         a[var1] = null;
         a[var1] = new short[b[var1].length][];

         for (int var4 = 0; var4 < b[var1].length; var4++) {
            a[var1][var4] = new short[b[var1][var4].length];
         }

         c[var1] = new byte[a[var1].length];
         a[var1] = new String[a[var1].length];
      }

      for (int var3 = b[var0].length - 1; var3 >= 0; var3--) {
         int var5;
         for (int var6 = (var5 = 5 + b[var0][var3][4]) - 1; var6 >= 0; var6--) {
            a[var0][var3][var6] = b[var0][var3][var6];
         }

         c[var0][var3] = 0;
         if (a[var0][var3][0] == 2 && a[var0][var3][17] >= 0) {
            a[var0][var3] = a(a[var0][var3][17], 0);
         } else if (a[var0][var3][0] == 6 && a[var0][var3][24] >= 0) {
            a[var0][var3] = a(a[var0][var3][24], 0);
         } else {
            a[var0][var3] = null;
         }
      }
   }

   private static void s(int var0, int var1) {
      if (var1 != a[var0].length) {
         short[][] var2 = new short[var1][];
         byte[] var3 = new byte[var1];
         String[] var4 = new String[var1];

         for (int var5 = 0; var5 < a[var0].length && var5 < var1; var5++) {
            var2[var5] = a[var0][var5];
            var3[var5] = c[var0][var5];
            var4[var5] = a[var0][var5];
         }

         a[var0] = var2;
         c[var0] = var3;
         a[var0] = var4;
      }
   }

   private static void f(int var0, int var1, int var2) {
      new StringBuffer()
         .append("ResetElementData() - Error cloning elem1=")
         .append(var1)
         .append(" to elem2=")
         .append(var2)
         .append(" in layer ")
         .append(var0)
         .append(": elem1 is greater than number of elements in layer (")
         .append(b[var0].length)
         .append(")");
      new StringBuffer()
         .append("ResetElementData() - Error cloning elem1=")
         .append(var1)
         .append(" to elem2=")
         .append(var2)
         .append(" in layer ")
         .append(var0)
         .append(": elem2 is greater than number of elements in layer (")
         .append(b[var0].length)
         .append(")");
      a[var0][var2] = null;
      a[var0][var2] = new short[b[var0][var1].length];

      for (int var3 = 0; var3 < a[var0][var1].length; var3++) {
         a[var0][var2][var3] = a[var0][var1][var3];
      }

      c[var0][var2] = c[var0][var1];
      if (a[var0][var1] != null) {
         a[var0][var2] = new String(a[var0][var1]);
      }
   }

   private static int k(int var0, int var1) {
      return a[var0][var1][0];
   }

   static final short a(int var0, int var1, int var2) {
      return a[var0][var1][var2];
   }

   private static void i(int var0, int var1, int var2, int var3) {
      a[var0][var1][var2] = (short)var3;
   }

   private static void ah(int var0) {
      for (int var1 = 0; var1 < a[var0].length; var1++) {
         short[] var4;
         if ((var4 = a[var0][var1])[0] == 1 && i(var0, var1)) {
            short var3;
            int var5 = (var3 = var4[7]) & 1536;
            var3 &= -1537;
            short var2 = var4[6];
            if (var3 >= 0) {
               short var6 = var4[5];
               e var18;
               if ((var18 = a[var6]) != null) {
                  short var7;
                  var7 = (var7 = var4[12]) + j.a_;
                  int var8 = var18.a(var3);
                  var3 = var18.a(var3, var2) * fC;
                  if (var7 >= var3) {
                     if (var5 != 0) {
                        c[var0][var1] = (byte)(c[var0][var1] | 64);
                     }

                     if (var5 != 512) {
                        var7 = 0;
                        var4[6] = (short)((var2 + 1) % var8);
                     }
                  }

                  var4[12] = (short)var7;
               }
            }
         }
      }

      if (a[var0] != j.c_) {
         a[var0] = (byte)j.c_;

         for (int var9 = 0; var9 < a[var0].length; var9++) {
            short[] var17;
            if ((var17 = a[var0][var9])[0] == 1 && i(var0, var9)) {
               short var19 = var17[5];
               e var20 = a[var19];
               short var10 = var17[6];
               short var13;
               if ((var13 = var17[7]) >= 0 && var20 != null) {
                  short var22;
                  var22 = (var22 = var17[12]) + j.a_;
                  if ((var13 & 1536) != 0) {
                     var13 &= -1537;
                     int var24 = var20.a(var13);
                     if (var10 < var24 - 1) {
                        var13 = var20.a(var13, var10) * fC;
                        if (var22 >= var13) {
                           var22 = 0;
                           var17[6] = (short)((var10 + 1) % var24);
                        }
                     } else {
                        var17[12] = 1;
                     }
                  } else {
                     int var25 = var20.a(var13);
                     var13 = var20.a(var13, var10) * fC;
                     if (var22 >= var13) {
                        var22 = 0;
                        var17[6] = (short)((var10 + 1) % var25);
                     }
                  }

                  var17[12] = (short)var22;
               }
            }
         }
      }
   }

   private static void ai(int var0) {
      j(var0, 0, 0, 0);
   }

   private static void g(int var0, int var1, int var2) {
      j(var0, var1, var2, 0);
   }

   private static void j(int var0, int var1, int var2, int var3) {
      boolean var4 = var3 == 0 || var3 == 1;
      boolean var5 = var3 == 0 || var3 == 2;
      new StringBuffer().append("PaintAllVisibleItems() - Unexpected paint mode (").append(var3).append(")");
      int var7 = j.i();
      int var8 = j.j();
      int var9 = j.k();
      int var10 = j.l();
      boolean var11 = false;
      boolean var13;
      if (h[var0]) {
         var13 = false;
      } else {
         var13 = true;
      }

      for (int var6 = 0; var6 < a[var0].length; var6++) {
         if (a[var0][var6][0] == 102) {
            if (!var5) {
               break;
            }

            var13 = true;
         } else if (var13 && var5 || !var13 && var4) {
            var11 |= b(var0, var6, var1, var2);
         }
      }

      if (var11) {
         j.a(var7, var8, var9, var10);
      }
   }

   private static boolean b(int var0, int var1, int var2, int var3) {
      boolean var4 = false;
      short[] var5;
      switch ((var5 = a[var0][var1])[0]) {
         case 1:
            if (var5[10] != 0) {
               e(var0, var1, var2, var3);
            }
            break;
         case 2:
            if (a[var0][var1] != null && var5[18] != 0) {
               a(a[var0][var1], var0, var1, var2, var3);
            }
            break;
         case 4:
            if (var5[11] == 0) {
               f(var0, var1, var2, var3);
            }
            break;
         case 5:
            if (var5[7] != 0) {
               g(var0, var1, var2, var3);
            }
            break;
         case 6:
            if (var5[14] != 0) {
               d(var0, var1, var2, var3);
            }
            break;
         case 7:
            var4 = true;
            var1 = var1;
            var0 = var0;
            short[] var16;
            if ((var16 = a[var0][var1])[5] > 0 && var16[6] > 0) {
               j.a(var16[2], var16[3], var16[5], var16[6]);
            } else {
               j.a(0, 0, c.e_, c.f_);
            }
            break;
         case 101:
            if (var5[7] != 0) {
               var3 = var3;
               var2 = var2;
               var1 = var1;
               var0 = var0;
               short[] var9;
               if ((var9 = a[var0][var1])[11] >= 0) {
                  var1 = j.i();
                  int var19 = j.j();
                  int var6 = j.k();
                  int var7 = j.l();
                  j.a(var9[2] + var2, var9[3] + var3, var9[5], var9[6]);
                  short var10000 = var9[11];
                  int var10001 = var2 + var9[16];
                  var3 += var9[17];
                  var2 = var10001;
                  j(var10000, var2, var3, 0);
                  j.a(var1, var19, var6, var7);
               }
            }
      }

      return var4;
   }

   private static void a(int var0, int[] var1, int var2, int var3) {
      for (int var8 = 0; var8 < var1.length; var8++) {
         int var10001 = var1[var8];
         byte var6 = 0;
         byte var5 = 0;
         int var4 = var10001;
         var3 = var0;
         switch (a[var3][var4][0]) {
            case 1:
               e(var3, var4, var5, var6);
               i(var3, var4, 10, 0);
               break;
            case 2:
               a(a[var3][var4], var3, var4, var5, var6);
               i(var3, var4, 18, 0);
            case 3:
            default:
               break;
            case 4:
               f(var3, var4, var5, var6);
               i(var3, var4, 11, 1);
               break;
            case 5:
               g(var3, var4, var5, var6);
               i(var3, var4, 7, 0);
               break;
            case 6:
               d(var3, var4, var5, var6);
               i(var3, var4, 14, 0);
         }
      }
   }

   private static e a(int var0) {
      if (var0 == 0) {
         return b[0];
      }

      if (var0 == 1) {
         return b[1];
      }

      if (var0 == 2) {
         return b[1];
      }

      new StringBuffer().append("getGUIFont() - Invalid font:").append(var0);
      return null;
   }

   private static int[] a(e var0, int var1, int var2) {
      int[] var3 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
      int var4 = 0;
      byte var5 = 0;

      while (var4 < f.length()) {
         if (f.charAt(var4) == '^') {
            int var6;
            try {
               var6 = Integer.parseInt(f.substring(var4 + 1, var4 + 3));
            } catch (NumberFormatException var11) {
               var6 = -1;
            }

            int var7;
            int var8;
            var7 = (var8 = (var7 = c.e_) / var0.d() + (var7 % var0.d() != 0 ? 3 : 2)) * var0.d();
            String var9 = f.substring(0, var4);

            for (int var10 = 0; var10 < var8; var10++) {
               var9 = var9 + ' ';
            }

            short[] var13 = var0.a(var9, var1, var2);
            var3[var5] = var6;
            var3[var5 + 1] = var13[0];
            var3[var5 + 2] = var13[var13[0] << 1] - (var7 >> 1);
            f = var9 + f.substring(var4 + 3);
            var5 += 3;
         }

         var4++;
      }

      return var3;
   }

   private static int a(int var0, int var1, int var2, int var3) {
      var3 = -1;
      int var4 = var0;
      var4 = a[var4].length;
      boolean var5 = false;
      boolean var6 = false;
      var4--;

      for (; var4 >= 0 && var3 == -1; var4--) {
         switch (k(var0, var4)) {
            case 6:
               if (r()) {
                  int var37 = var2;
                  int var35 = var1;
                  int var33 = var4;
                  int var30 = var0;
                  boolean var39 = false;
                  boolean var48;
                  if (h(var30, var33)) {
                     var48 = false;
                  } else if (!a(var30, (int)var33)) {
                     var48 = false;
                  } else {
                     a(aj, var30, var33, var35, var37);
                     if (!d(aj[0], aj[1], aj[2] - aj[0], aj[3] - aj[1])
                        && !a(aj[0], aj[1], aj[2] - aj[0], aj[3] - aj[1])
                        && !c(aj[0], aj[1], aj[2] - aj[0], aj[3] - aj[1])) {
                        e(var30, var33, false);
                     } else {
                        boolean var41 = false;
                        if (hB == 1 || hB == 2) {
                           aV();
                           e(var30, var33, true);
                           var41 = true;
                        }

                        if (hB == 3) {
                           var41 = true;
                           e(var30, var33, false);
                           var39 = true;
                           if (hB == 1) {
                              var39 = false;
                           }
                        }

                        if (var41) {
                           br = true;
                        }
                     }

                     var48 = var39;
                  }

                  if (var48) {
                     var3 = var4;
                  }
               }
               break;
            case 10:
               if (r() && hB == 3) {
                  boolean var10001;
                  label182: {
                     int var36 = var2;
                     int var34 = var1;
                     int var32 = var4;
                     int var29 = var0;
                     if ((c[var29][var32] & 4) == 0) {
                        int var38 = a(var29, var32, 2) + var34;
                        int var40 = a(var29, var32, 3) + var36;
                        int var42 = var38 + a(var29, var32, 5) - 1;
                        int var43 = var40 + a(var29, var32, 6) - 1;
                        if (a(var38, var40, var42 - var38, var43 - var40)) {
                           aj(var29);
                           j.a("cGame_GUI.h:1548:gui_ProcessInput__processLayerZone (" + var38 + ", " + var40 + ", " + var42 + ", " + var43 + ": true");
                           var10001 = true;
                           break label182;
                        }
                     }

                     var10001 = false;
                  }

                  var6 |= var10001;
                  var5 = true;
               }
               break;
            case 101:
               int var10 = var2;
               int var9 = var1;
               int var8 = var4;
               int var7 = var0;
               int var11 = -1;
               int var10000;
               if (!k(var7, var8)) {
                  var10000 = -1;
               } else {
                  short[] var12 = a[var7][var8];
                  boolean var13 = false;
                  if (var12[11] >= 0) {
                     int var16 = var8;
                     int var15 = var7;
                     int[] var25 = aj;
                     short[] var17 = a[var15][var16];
                     var25[0] = var17[2];
                     var25[1] = var17[3];
                     var25[2] = var17[5];
                     var25[3] = var17[6];
                     if (d(aj[0], aj[1], aj[2], aj[3]) || a(aj[0], aj[1], aj[2], aj[3]) || c(aj[0], aj[1], aj[2], aj[3])) {
                        var13 = true;
                     }

                     boolean var14 = j(var7, var8);
                     boolean var45 = var13;
                     var15 = var8;
                     var3 = var7;
                     var17 = a[var3][var15];
                     int var19 = var15;
                     int var18 = var3;
                     short[] var20 = a[var18][var19];
                     int var21 = 0;
                     short var22 = 0;
                     boolean var23;
                     if (!(var23 = l(var18, var19)) && !var23) {
                        if (var20[18] != 0) {
                           var20[18] = (short)(var20[18] * (var20[20] - 1) / var20[20]);
                           var21 = var20[18];
                        }

                        if (var20[19] != 0) {
                           var20[19] = (short)(var20[19] * (var20[20] - 1) / var20[20]);
                           var22 = var20[19];
                        }
                     } else if (a[var18][var19][27] != 12345) {
                        short var47 = a[var18][var19][16];
                        var21 = (a[var18][var19][27] + var47) / 2 - var47;
                        var22 = 0;
                     }

                     h(var18, var19, var21, var22);
                     var20[21] = var20[16];
                     var20[22] = var20[17];
                     if (var45) {
                        if (hB == 2) {
                           r(var3, var15);
                           h(var3, var15, hJ, hK);
                           if (a() != 0) {
                              fz = a();
                           }
                        }

                        if ((var17[21] != var17[16] || var17[22] != var17[17]) && (fz > 5 || fz < -5)) {
                           i(var3, var15, true);
                           aV();
                           fz = 0;
                        }

                        if (j(var3, var15)) {
                           j(var3, var15);
                        }

                        if (hB == 3) {
                           j.a("cGame_GUI_ScrollWindow.h:178:PointerGetEvent() == POINTER_EVENT_RELEASE");
                           i(var3, var15, false);
                           q(var3, var15);
                        }
                     } else if (j(var3, var15)) {
                        j.a("cGame_GUI_ScrollWindow.h:198:ScrollWindow_IsDragging()");
                        q(var3, var15);
                     }

                     if (!j(var7, var8)) {
                        if (var13) {
                           j.a("cGame_GUI_ScrollWindow.h:68:Processing child layer input - Frame:" + 0L);
                           var11 = a(var12[11], var9 + var12[16], var10 + var12[17], -1);
                        } else {
                           var11 = a(var12[11], var9 + 3000, var10 + 3000, -1);
                        }
                     }

                     if (var14) {
                        var11 = -1;
                     }

                     if (var11 != -1) {
                        j.a("cGame_GUI_ScrollWindow.h:90:iActivatedButtonIdx != GUI_INPUT_EVENTS.NO_ACTIVATED_BUTTON - k_iActivatedButtonIdx_Child:" + fD);
                        fD = var11;
                        fE = var12[11];
                        var11 = -3;
                     }
                  }

                  var10000 = var11;
               }

               var3 = var10000;
         }
      }

      if (var5 && !var6) {
         boolean var49;
         if (var0 == fB) {
            fA = fB;
            fB = -1;
            var49 = true;
         } else {
            var49 = false;
         }

         if (var49) {
            br = true;
         }
      }

      if (var0 == fB) {
         br = true;
      }

      int var31 = var0;
      if (fA == var31) {
         fA = -1;
         return -2;
      } else {
         return var3;
      }
   }

   private static void aj(int var0) {
      if (var0 != fB) {
         fA = fB;
         fB = var0;
      }
   }

   private static void t(int var0, int var1) {
      h(var0, var1, 0);
   }

   private static void h(int var0, int var1, int var2) {
      fF = var0;
      switch (var0) {
         case 0:
            int var57 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            switch (var57) {
               case 0:
                  j.a("cGame_GUI_Navigation.h:115:k_Navigation_Button_Options PRESSED!");
                  k(5, 4);
                  a(16, false);
                  return;
               case 1:
                  j.a("cGame_GUI_Navigation.h:95:k_Navigation_Button_Quit PRESSED!");
                  k(5, 2);
                  a(14, false);
                  return;
               case 2:
                  j.a("cGame_GUI_Navigation.h:80:k_Navigation_Button_OK PRESSED!");
                  k(5, 0);
                  a(16, false);
                  return;
               case 3:
                  j.a("cGame_GUI_Navigation.h:122:k_Navigation_Button_Next PRESSED!");
                  k(5, 5);
                  a(16, false);
                  return;
               case 4:
                  j.a("cGame_GUI_Navigation.h:108:k_Navigation_Button_SKIP PRESSED!");
                  k(5, 3);
                  a(15, false);
                  return;
               case 5:
                  j.a("cGame_GUI_Navigation.h:87:k_Navigation_Button_Back PRESSED!");
                  k(5, 1);
                  a(14, false);
                  return;
               case 6:
                  a(16, false);
                  if (f(7) && k(7) != 2) {
                     a(7, false, true);
                  } else {
                     a(7, true, true);
                  }

                  return;
               case 7:
                  j.a("cGame_GUI_Navigation.h:129:k_Navigation_Button_Pause PRESSED!");
                  k(5, 6);
                  a(15, false);
                  return;
               case 8:
                  j.a("cGame_GUI_Navigation.h:152:CHEAT PRESSED");
                  if (bk = !bk) {
                     l(47);
                     return;
                  } else if (U) {
                     m(bY);
                     return;
                  } else {
                     l(bY);
                     return;
                  }
               default:
                  return;
            }
         case 1:
            int var56 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
               if (r) {
                  a(1, 9, true);
                  h(1, 5, true);
               } else {
                  a(1, 9, false);
                  h(1, 5, false);
               }
            }

            if (var0 == 4) {
               k(5, 1002);
            }

            if (var0 != 5) {
               return;
            }

            switch (var56) {
               case 7:
                  j.a("cGame_GUI_Menu_Main.h:65:k_Menu_Main_Button_DailyScratch PRESSED!");
                  k(5, 1004);
                  return;
               case 8:
                  j.a("cGame_GUI_Menu_Main.h:72:k_Menu_Main_Button_DailyScratch PRESSED!");
                  k(5, 1024);
                  return;
               case 9:
                  s = true;
                  k(5, 1010);
                  return;
               case 10:
                  j.a("cGame_GUI_Menu_Main.h:50:k_Menu_Main_Button_Story PRESSED!");
                  k(5, 1001);
                  return;
               case 11:
                  j.a("cGame_GUI_Menu_Main.h:57:k_Menu_Main_Button_Online PRESSED!");
                  k(5, 1012);
                  return;
               case 12:
                  j.a("cGame_GUI_Menu_Main.h:34:k_Menu_Main_Button_QuickGame PRESSED!");
                  k(5, 1000);
                  return;
               case 13:
                  j.a("cGame_GUI_Menu_Main.h:146:k_Menu_Main_Button_IGP PRESSED!");
                  k(5, 1010);
                  return;
               default:
                  return;
            }
         case 2:
         case 4:
         case 5:
         case 18:
         case 25:
         case 26:
         case 37:
         case 41:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 60:
         case 62:
         case 64:
         case 65:
         default:
            j.a("cGame_GUIManager.h:92:gui type [" + var0 + "] is undefined.");
            j.a("cGame_GUIManager.h:93:Please make sure to register any type");
            break;
         case 3:
            if (var1 == 0) {
               aV();
            }

            return;
         case 6:
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            k(fD);
            switch (var1 = b(true)) {
               case 3:
                  m(44);
                  break;
               case 15:
                  aV = false;
                  o(36, 0);
                  j(15, 16);
                  d(1, false);
                  c(1);
                  break;
               case 16:
                  aV = true;
                  o(36, 1);
                  j(16, 15);
                  d(1, true);
                  if (bY != 17 && ha != 42 && !al) {
                     a(4, false);
                  } else {
                     a(5, false);
                  }
                  break;
               case 17:
                  aW = false;
                  o(37, 0);
                  j(17, 18);
                  d(0, false);
                  c(0);
                  break;
               case 18:
                  aT();
                  aW = true;
                  o(37, 1);
                  j(18, 17);
                  d(0, true);
                  a(15, false);
                  break;
               case 36:
                  aD(6);
                  m(45);
                  break;
               case 37:
                  a(0, b(24), 2, 4);
                  break;
               case 58:
                  k(5, 1);
                  break;
               case 59:
                  k(5, 1025);
                  break;
               case 121:
                  j(121, 122);
                  ax = false;
                  f(39, 0);
                  break;
               case 122:
                  j(122, 121);
                  ax = true;
                  f(39, 1);
                  break;
               case 123:
                  j(123, 124);
                  d = false;
                  f(40, d ? 1 : 0);
                  break;
               case 124:
                  j(124, 123);
                  d = true;
                  f(40, d ? 1 : 0);
                  break;
               case 184:
                  j(184, 185);
                  aT = false;
                  o(38, aT ? 1 : 0);
                  break;
               case 185:
                  j(185, 184);
                  aT = true;
                  af(200);
                  o(38, aT ? 1 : 0);
                  break;
               case 271:
                  a(0, b(272), 8, 4);
                  break;
               case 422:
                  bj = !bj;
                  a(0, 8, bj);
                  break;
               case 509:
                  m(12);
                  break;
               case 582:
                  m(51);
                  break;
               case 620:
                  v();
            }

            if (var1 != 18) {
               if (var1 != 17 && var1 != 15 && var1 != 16) {
                  a(16, false);
               }

               return;
            }

            boolean var99 = true;
            boolean var91 = false;
            byte var79 = 15;
            d(15, 1, true);
            break;
         case 7:
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            k(fD);
            a(16, false);
            switch (b(true)) {
               case 2:
                  m(8);
                  return;
               case 3:
                  m(44);
                  return;
               case 36:
                  aD(6);
                  m(45);
                  return;
               case 37:
                  a(0, b(24), 2, 12);
                  return;
               case 42:
                  return;
               case 58:
                  az();
                  S = false;
                  return;
               case 59:
                  k(5, 1025);
                  return;
               case 422:
                  bj = !bj;
                  a(0, 8, bj);
                  return;
               case 574:
                  var2 = z();
                  if (ha != 36 && ha != 37 && ha != 38) {
                     if (o.a() == 1) {
                        String var89 = a(b(656), var2);
                        a(0, var89, 5, 12);
                     } else {
                        String var90 = a(b(595), var2);
                        a(0, var90, 5, 12);
                     }

                     return;
                  } else {
                     String var88 = a(b(660), var2);
                     a(0, var88, 5, 12);
                     return;
                  }
               case 620:
                  v();
                  return;
               default:
                  return;
            }
         case 8:
            int var54 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            switch (var54) {
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
                  j.a("cGame_GUI_VenueSelect.h:24:k_VenueSelect_Button_WorldX PRESSED!");
                  k(5, 1113 + (var54 - 8));
                  return;
               case 14:
                  j.a("cGame_GUI_VenueSelect.h:32:k_VenueSelect_Button_Play PRESSED!");
                  k(5, 1112);
                  return;
               default:
                  return;
            }
         case 9:
            int var53 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 == 5) {
               switch (var53) {
                  case 6:
                  case 9:
                  case 12:
                  case 15:
                  case 18:
                  case 21:
                  case 24:
                  case 27:
                     k(5, 1133 + (var53 - 6) / 3);
                  case 7:
                  case 8:
                  case 10:
                  case 11:
                  case 13:
                  case 14:
                  case 16:
                  case 17:
                  case 19:
                  case 20:
                  case 22:
                  case 23:
                  case 25:
                  case 26:
               }
            }

            return;
         case 10:
            int var51 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 == 5) {
               switch (var51) {
                  case 19:
                     j.a("cGame_GUI_Match.h:17:k_Match_Draw_Pile PRESSED!");
                     k(5, 1154);
                  case 20:
                  case 21:
                  default:
                     break;
                  case 22:
                     j.a("cGame_GUI_Match.h:57:k_Match_Button_Ch_Draw PRESSED!");
                     k(5, 1160);
                     break;
                  case 23:
                     j.a("cGame_GUI_Match.h:69:k_Match_Button_Dr_Pass PRESSED!");
                     k(5, 1162);
                     a(14, false);
                     break;
                  case 24:
                     j.a("cGame_GUI_Match.h:63:k_Match_Button_Ch_Play PRESSED!");
                     k(5, 1161);
                     break;
                  case 25:
                     j.a("cGame_GUI_Match.h:76:k_Match_Button_Dr_Play PRESSED!");
                     k(5, 1163);
                     break;
                  case 26:
                     j.a("cGame_GUI_Match.h:82:k_Match_Button_Color_Blue PRESSED!");
                     k(5, 1164);
                     e(9);
                     break;
                  case 27:
                     j.a("cGame_GUI_Match.h:89:k_Match_Button_Color_Green PRESSED!");
                     k(5, 1165);
                     e(9);
                     break;
                  case 28:
                     j.a("cGame_GUI_Match.h:96:k_Match_Button_Color_Red PRESSED!");
                     k(5, 1166);
                     e(9);
                     break;
                  case 29:
                     j.a("cGame_GUI_Match.h:103:k_Match_Button_Color_Yellow PRESSED!");
                     k(5, 1167);
                     e(9);
               }
            }

            if (var0 == 4) {
               switch (m) {
                  case 0:
                     if (o.i == 2 && c[0] == 0 && c[1] == 0 && c[2] == 0 && c[3] == 0 && o.c == 0) {
                        j.g(-1358954496);
                        j.e(j.b, 0, 0, c.e_, c.f_);
                        String var85 = b(169);
                        c[0] = "\\2" + a[2] + "\\0";
                        var85 = a(var85, c, '#');
                        short[] var97 = a(0, var85, c.e_ - (c.e_ >> 2), 30);
                        a(0, var85, var97, c.bA, c.bB, 0, -1, 3, var85.length(), -1);
                        if (a[0].a.a() == ac[0] && a[1].a.a() == ac[1] && a[2].a.a() == ac[2] && a[3].a.a() == ac[3]) {
                           int var27 = 3;
                           var27 = f.g_;
                           int var75 = 1;
                           boolean var102 = true;
                           if ((System.currentTimeMillis() & 512L) != 0L) {
                              p(1, 1);
                              String var10001 = b(23);
                              byte var98 = 3;
                              int var87 = var27;
                              var75 = c.bA;
                              String var52 = var10001;
                              byte var29 = 1;
                              a(j.b, var29, var52, var75, var87, var98, -1);
                              p(1, 0);
                           }
                        }
                     }
                  default:
                     if (o.a == 3 && h == 2) {
                        j.g(-1358954496);
                        j.e(j.b, 0, 0, c.e_, c.f_);
                        if ((System.currentTimeMillis() & 512L) != 0L) {
                           byte var77 = 31;
                           byte var103 = 10;
                           a(1, a[10][31], c.bA, c.bB - 30, 3, 0);
                           a(1, b(23), c.bA, c.bB + 30, 3, 0);
                        }
                     }

                     if (q() && be) {
                        u.b(j.a_);
                        u.c();
                     }
               }
            }

            return;
         case 11:
            int var50 = var2;
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 2) {
               byte var84 = 3;
               byte var72 = 11;
               if (a(11, 3, 18) != 0) {
                  if (j.b_ % 500 >= 200) {
                     b(11, 3, b(23));
                  } else {
                     b(11, 3, null);
                  }
               }
            }

            if (var0 == 5) {
               var2 = var50;
               if (var50 == 6) {
                  a(14, false);
               } else {
                  a(15, false);
               }

               switch (var2) {
                  case 4:
                  case 5:
                  case 6:
                  case 2980:
                  case 2981:
                     if ((B() & 4) != 0 || var2 != 2980 && var2 != 2981) {
                        t(11, 1);
                        if (A() >= 0) {
                           byte var96;
                           if (var2 != 4 && var2 != 5 && var2 != 2980) {
                              var96 = 1;
                           } else {
                              var96 = 0;
                           }

                           j.a("cGame_GUI_MsgboxStandard.h:193:Sending callback action :" + var96 + "     elemID:" + var2);
                           aq(var96);
                        }

                        t(11, 1);
                        e(3);
                        o();
                        j.a("cGame_GUI_MsgboxStandard.h:205:< PointerClean >");
                        bU();
                     }
               }

               if (var50 >= 0) {
                  j.a("cGame_GUI_MsgboxStandard.h:43:< PointerClean >");
                  bU();
               }
            }

            if (var0 == 6) {
               al(1);
               f(l(fF), true);
               var2 = B();
               g(11, 2, true);
               b(11, 2, g);
               if ((var2 & 1) != 0) {
                  ai = true;
               }

               if ((var2 & 2) == 0) {
                  if ((var2 & 4) != 0) {
                     a(11, 5, true);
                     a(11, 6, true);
                  } else {
                     a(11, 4, true);
                  }
               }

               a(1, (byte)0);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
               if ((B() & 1) != 0) {
                  ai = false;
               }
            }

            return;
         case 12:
            int var49 = var2;
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 5) {
               var2 = var49;
               switch (var49) {
                  case 3:
                  case 4:
                  case 5:
                  case 2980:
                  case 2981:
                     if ((B() & 4) != 0 || var2 != 2980 && var2 != 2981) {
                        t(12, 1);
                        if (A() >= 0) {
                           byte var95;
                           if (var2 != 3 && var2 != 4 && var2 != 2980) {
                              a(14, false);
                              var95 = 1;
                           } else {
                              a(15, false);
                              var95 = 0;
                           }

                           j.a("cGame_GUI_MsgboxSmall.h:167:Sending callback action :" + var95 + "     elemID:" + var2);
                           aq(var95);
                        }

                        t(12, 1);
                        e(3);
                        o();
                        j.a("cGame_GUI_MsgboxSmall.h:179:< PointerClean >");
                        bU();
                     }
               }

               if (var49 >= 0) {
                  j.a("cGame_GUI_MsgboxSmall.h:43:< PointerClean >");
                  bU();
               }
            }

            if (var0 == 6) {
               al(2);
               f(l(fF), true);
               var2 = B();
               g(12, 2, true);
               b(12, 2, g);
               if ((var2 & 1) != 0) {
                  ai = true;
               }

               if ((var2 & 2) == 0) {
                  if ((var2 & 4) != 0) {
                     a(12, 4, true);
                     a(12, 5, true);
                  } else {
                     a(12, 3, true);
                  }
               }

               a(2, (byte)0);
            }

            if (var0 == 1) {
               a(2, false, false);
               f(2, false);
            }

            return;
         case 13:
            if ((var0 = var1) == 0) {
               bb();
            }

            if (var0 == 6) {
               al(32);
               f(l(fF), true);
               a(32, (byte)0);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
            }

            return;
         case 14:
            int var48 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
               c(14, 10, true);
               h(14, 13, false);
               bI();
            }

            if (var0 == 5) {
               switch (var48) {
                  case 0:
                     j.a("cGame_GUI_Menu_Topbar.h:99:k_Menu_Topbar_Button_Stats PRESSED!");
                     m(39);
                     a(16, false);
                     break;
                  case 10:
                     j.a("cGame_GUI_Menu_Topbar.h:92:k_Menu_Topbar_Button_Tickets PRESSED!");
                     break;
                  case 11:
                     j.a("cGame_GUI_Menu_Topbar.h:68:k_Menu_Topbar_Button_Shop PRESSED!");
                     m(26);
                     a(16, false);
                     break;
                  case 17:
                     j.a("cGame_GUI_Menu_Topbar.h:52:k_Menu_Topbar_Button_Options PRESSED!");
                     m(8);
                     a(16, false);
               }
            }

            if (var0 == 4 && bW == 4) {
               j.a(0, 0, c.e_, a(14, 2, 3) + 33);
               a[0].d();
               j.a(0, 0, c.e_, c.f_);
               a[53].a(j.b, 1, a(14, 2, 2), a(14, 2, 3), 0);
            }

            return;
         case 15:
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 6) {
               al(34);
               f(l(fF), true);
               a(34, (byte)0);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
            }

            return;
         case 16:
            return;
         case 17:
            int var47 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
               a(24, 1, true, true);
               m(24, 1);
               hb = F();
               if (bW != 49) {
                  az(2);
               }
            }

            if (var0 == 5) {
               var2 = var47;
               String var83;
               if ((var83 = c[gs][var2 - 5]) == m) {
                  a(14, false);
                  if (r.length() >= 1) {
                     a(r.substring(0, r.length() - 1), false);
                     bo();
                  }
               } else {
                  a(16, false);
                  if (var83 != o && var83 != n) {
                     if (var83 == l) {
                        if (gs != 2) {
                           if (gt == 0) {
                              gt = 1;
                           } else if (gt == 1) {
                              gt = 2;
                           } else if (gt == 2) {
                              gt = 0;
                           }

                           if (gt == 0) {
                              au(0);
                           } else {
                              au(1);
                           }
                        }
                     } else if (var83 == p) {
                        if (r.length() >= 1) {
                           bp();
                           k(5, 1109);
                        }
                     } else {
                        String var94 = var83;
                        String var101;
                        if ((var101 = r + var94).length() <= gp) {
                           a(var101, false);
                        } else {
                           a(r.substring(0, gp - 1) + var94, false);
                        }

                        bo();
                        if (gs == 1 && gt == 1) {
                           gt = 0;
                           au(0);
                        }
                     }
                  } else if (gs == 2) {
                     gt = 0;
                     au(0);
                  } else {
                     au(2);
                  }
               }
            }

            if (var0 == 2) {
               if (j.b_ % 500 >= 200) {
                  b(17, 2, s);
               } else {
                  b(17, 2, t);
               }
            }

            if (var0 == 4) {
               bn();
            }

            if (var0 == 1) {
               Z(24);
               m(24, 1);
               az(hb);
            }

            return;
         case 19:
            return;
         case 20:
            return;
         case 21:
            return;
         case 22:
            int var46 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 == 5) {
               switch (var46) {
                  case 15:
                     j.a("cGame_GUI_Tally.h:18:k_Tally_Button_OK PRESSED!");
                     k(5, 1280);
               }
            }

            return;
         case 23:
            if ((var0 = var1) == 0) {
               aV();
            }

            if (var0 == 5) {
               j.a("cGame_GUI_LevelUp.h:13:LEVELUP START_GUI_MESSAGE_HANDLER(GUI_MESSAGE_INPUT_EVENT)");
            }

            return;
         case 24:
            int var45 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            switch (var45) {
               case -3:
                  if (fE == 25) {
                     var2 = (fD - 1) / 9;
                     int var82 = (fD - 1) % 9;
                     j.a("cGame_GUI_VenueSelect_Slide.h:23:Venue item PRESSED!! - iItemIndex:" + var2 + "   iItemGUIElem:" + var82);
                     switch (var82) {
                        case 2:
                           k(5, var2 + 1168);
                           return;
                        case 5:
                           a(17, false);
                           k(5, var2 + 1178);
                     }
                  }

                  return;
               default:
                  return;
            }
         case 27:
            A(var1, var2);
            return;
         case 28:
            int var44 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 == 5) {
               switch (var44) {
                  case 13:
                  case 16:
                  case 19:
                  case 22:
                  case 25:
                  case 28:
                  case 31:
                  case 34:
                     k(5, 1133 + (var44 - 13) / 3);
                  case 14:
                  case 15:
                  case 17:
                  case 18:
                  case 20:
                  case 21:
                  case 23:
                  case 24:
                  case 26:
                  case 27:
                  case 29:
                  case 30:
                  case 32:
                  case 33:
               }
            }

            if (var0 == 4) {
               if (i != null && Z) {
                  i.c();
                  if (g(28, 13 + bq * 3)) {
                     a[34].a(j.b, 18, i.a, i.b, 0);
                  }
               }

               if (j != null && !j.a()) {
                  j.c();
               }

               if (j != null && ab && j.a()) {
                  ab = false;
                  S(1);
                  var2 = a[o.g][1][0];
                  b(28, 16, true);
                  i(28, 16, 6, var2);
               }

               if (aa) {
                  g.a(j.b, a[188], 8, 0, 0, false);
               }
            }

            return;
         case 29:
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 2) {
               switch (k(27)) {
                  case 1:
                     p[27][2] = p[27][2] / 2;
                     p[27][0] = j.d(p[27][2]);
                     if (p[27][2] == 0) {
                        a(27, (byte)0);
                     }
                     break;
                  case 2:
                     p[27][2] = p[27][2] << 1;
                     p[27][0] = j.d(p[27][2]);
                     if (p[27][2] >= j.c(350)) {
                        a(27, false, false);
                     }
               }
            }

            if (var0 == 6) {
               al(27);
               a(27, (byte)1);
               p[27][2] = j.c(350);
            }

            if (var0 == 7) {
               a(27, (byte)2);
               p[27][2] = j.c(4);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
            }

            return;
         case 30:
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 2) {
               switch (k(28)) {
                  case 1:
                     p[28][2] = p[28][2] / 2;
                     p[28][0] = -j.d(p[28][2]);
                     if (p[28][2] == 0) {
                        a(28, (byte)0);
                     }
                     break;
                  case 2:
                     p[28][2] = p[28][2] << 1;
                     p[28][0] = -j.d(p[28][2]);
                     if (p[28][2] >= j.c(350)) {
                        a(28, false, false);
                     }
               }
            }

            if (var0 == 6) {
               al(28);
               a(28, (byte)1);
               p[28][2] = j.c(350);
            }

            if (var0 == 7) {
               a(28, (byte)2);
               p[28][2] = j.c(4);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
            }

            return;
         case 31:
            var0 = var1;
            if (var1 == 0) {
               bb();
               hf = 0;
            }

            if (var0 == 2) {
               hf = hf + j.a_;
               switch (k(3)) {
                  case 1:
                     p[3][2] = p[3][2] + hg * j.a_ / 1000;
                     p[3][0] = j.d(p[3][2]);
                     if (p[3][0] >= 0) {
                        p[3][0] = 0;
                        a(3, (byte)0);
                     }
                     break;
                  case 2:
                     p[3][2] = p[3][2] - hg * j.a_ / 1000;
                     p[3][0] = j.d(p[3][2]);
                     if (p[3][0] <= -700) {
                        a(3, false, false);
                     }
               }
            }

            if (var0 == 6) {
               a(3, (byte)1);
               p[3][2] = -j.c(700);
            }

            if (var0 == 7) {
               a(3, (byte)2);
               p[3][2] = 0;
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
               var1 = B();
               j.a("cGame_GUI_Msgbox_Tutorial.h:226:gui_MsgBoxTutorial_Close()");
               if ((var1 & 1) != 0) {
                  j.a("cGame_GUI_Msgbox_Tutorial.h:231:gui_MsgBoxTutorial_Close() - UNPAUSING");
                  ai = false;
               }
            }

            return;
         case 32:
            int var42 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 == 5) {
               switch (var42) {
                  case 0:
                     j.a("cGame_GUI_Match_Back.h:23:k_Match_Back_Button_Jumpin PRESSED!");
                     k(5, 1158);
                     break;
                  case 2:
                     j.a("cGame_GUI_Match_Back.h:17:k_Match_Back_Button_UNO PRESSED!");
                     k(5, 1155);
               }
            }

            if (var0 == 4) {
               switch (m) {
                  case 0:
                  case 1:
                  case 2:
                  case 4:
                  case 5:
                  case 6:
                  case 17:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                     aC();
                     if (ep > 0) {
                        ep--;
                     }
                  case 3:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 18:
                  default:
                     an = false;
                     if (q()) {
                        a[16].a(j.b, 0, a(31, 2, 2), a(31, 2, 3), 0);
                     }
               }
            }

            return;
         case 33:
            C(var1, var2);
            return;
         case 34:
            int var41 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
               hh = 1;
               hi = 1;
            }

            if (var0 == 2) {
               bM();
            }

            if (var0 == 5) {
               aB(var41);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
            }

            return;
         case 35:
            int var40 = var2;
            var0 = var1;
            if (var1 == 0) {
               bb();
               al(47);
               a(47, (byte)0);
               boolean var66 = b(3) == 1;
               c(35, 7, var66);
            }

            if (var0 == 4) {
               a[0].d();
               h(35, 2, true);
               b(35, 2, 0, 0);
               h(35, 2, false);
            }

            if (var0 == 5) {
               a(16, false);
               switch (var40) {
                  case 4:
                     j.a("cGame_GUI_Profile.h:63:k_Profile_Button_Achievements pressed");
                     m(50);
                     break;
                  case 5:
                     j.a("cGame_GUI_Profile.h:87:k_Profile_Button_Leadership pressed");
                     m(40);
                     break;
                  case 6:
                     j.a("cGame_GUI_Profile.h:70:InputMsg.NameChange!");
                     m(49);
                     break;
                  case 7:
                     j.a("cGame_GUI_Profile.h:81:InputMsg.GLLIVE!");
                     m(28);
               }
            }

            if (var0 == 1) {
               a(l(fF), false, false);
            }

            return;
         case 36:
            return;
         case 38:
            E(var1, var2);
            return;
         case 39:
            int var39 = var2;
            var0 = var1;
            if (var1 == 0) {
               bb();
            }

            if (var0 == 5) {
               var2 = var39;
               j.a("cGame_GUI_MsgboxCharacter.h:136:k_MsgBox_Char_Button_OK:6");
               j.a("cGame_GUI_MsgboxCharacter.h:137:k_MsgBox_Char_Button_Yes:5");
               j.a("cGame_GUI_MsgboxCharacter.h:138:k_MsgBox_Char_Button_No:4");
               j.a("cGame_GUI_MsgboxCharacter.h:139:MSGBOX_YES:2980");
               j.a("cGame_GUI_MsgboxCharacter.h:140:MSGBOX_NO:2981");
               switch (var2) {
                  case 4:
                  case 5:
                  case 6:
                  case 2980:
                  case 2981:
                     if ((B() & 4) != 0 || var2 != 2980 && var2 != 2981) {
                        t(39, 1);
                        if (A() >= 0) {
                           byte var93;
                           if (var2 != 6 && var2 != 5 && var2 != 2980) {
                              var93 = 1;
                           } else {
                              var93 = 0;
                           }

                           j.a("cGame_GUI_MsgboxCharacter.h:200:Sending callback action :" + var93 + "     elemID:" + var2);
                           aq(var93);
                        }

                        t(39, 1);
                        e(3);
                        o();
                        j.a("cGame_GUI_MsgboxCharacter.h:212:< PointerClean >");
                        bU();
                        if (2981 != var2 && 4 != var2) {
                           a(15, false);
                        } else {
                           a(14, false);
                        }
                     }
               }

               if (var39 >= 0) {
                  j.a("cGame_GUI_MsgboxCharacter.h:48:< PointerClean >");
                  bU();
               }
            }

            if (var0 == 6) {
               al(4);
               f(l(fF), true);
               var2 = B();
               g(39, 2, true);
               b(39, 2, g);
               if ((var2 & 1) != 0) {
                  ai = true;
               }

               if ((var2 & 2) == 0) {
                  if ((var2 & 4) != 0) {
                     a(39, 5, true);
                     a(39, 4, true);
                     a(39, 6, false);
                  } else {
                     a(39, 6, true);
                     a(39, 5, false);
                     a(39, 4, false);
                  }
               }

               a(4, (byte)0);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
               f(l(fF), false);
               if ((B() & 1) != 0) {
                  ai = false;
               }
            }

            return;
         case 40:
            int var38 = var2;
            var0 = var1;
            if (var1 == 0) {
               aV();
            }

            if (var0 != 5) {
               return;
            }

            switch (var38) {
               case 25:
                  a(15, false);
                  j.a("cGame_GUI_TallyBar.h:22:k_Tally_Button_OK PRESSED!");
                  k(5, 1280);
                  return;
               case 26:
                  a(15, false);
                  j.a("cGame_GUI_TallyBar.h:29:k_Tally_Button_Next PRESSED!");
                  f(fr + o.g, -1);
                  int[] var63;
                  l((var63 = a())[0], var63[1]);
                  return;
               default:
                  return;
            }
         case 42:
            aC(var1);
            return;
         case 54:
            G(var1, var2);
            return;
         case 55:
            w(var1, var2);
            return;
         case 56:
            B(var1, var2);
            return;
         case 57:
            int var37 = var2;
            var0 = var1;
            if (var1 == 0) {
               j.a("cGame_GUI_Cheat.h:8:cheat GUI_MESSAGE_INITIALIZE");
               bb();
               al(0);
               a(0, (byte)0);
            }

            if (var0 == 5) {
               j.a("cGame_GUI_Cheat.h:42:cheat GUI_MESSAGE_INPUT_EVENT");
               switch (var37) {
                  case 1:
                     int var81 = (var2 = dM - 1) / 5;
                     int var92 = var2 % 5;
                     int var100 = a[var81][var92][25];
                     var2 = var81 * 5 + var92;
                     o(fj + var2, var100);
                     s[var81][var92] = 18;
                     o(fi + var2, 18);
                     U = true;
                     if (var92 == 3 && var81 < 5) {
                        o(fr + var81 + 1, 0);
                     } else {
                        o(fr + var81, var92 + 1);
                     }

                     j.a(
                        "gamestate_cheat.h:402:Cheat : Stage #"
                           + var92
                           + " at venue #"
                           + var81
                           + " is unlocked now with highscore of "
                           + var100
                           + " and "
                           + s[var81][var92]
                           + " stars."
                     );
                     break;
                  case 2:
                     a(true, false);
                     break;
                  case 3:
                     a(false, true);
                  case 4:
                  case 10:
                  default:
                     break;
                  case 5:
                     j.a("cGame_GUI_Cheat.h:62:k_Cheat_Button_CheatWin1");
                     a(true, 1);
                     break;
                  case 6:
                     j.a("cGame_GUI_Cheat.h:68:k_Cheat_Button_CheatWin2");
                     a(true, 2);
                     break;
                  case 7:
                     j.a("cGame_GUI_Cheat.h:74:k_Cheat_Button_CheatWin3");
                     a(true, 3);
                     break;
                  case 8:
                     a(false, 0);
                     break;
                  case 9:
                     fV += 1000;
                     o(fk, fV);
                     ar = true;
                     break;
                  case 11:
                     m(34);
                     ar = true;
               }
            }

            if (var0 == 1) {
               a(l(fF), false, false);
            }

            return;
         case 58:
            aE(var1);
            return;
         case 59:
            H(var1, var2);
            return;
         case 61:
            int var36 = var2;
            var0 = var1;
            if (var1 == 0) {
               bb();
               al(35);
               a(35, (byte)0);
               h(61, 19, false);
            }

            if (var0 == 4) {
               j.a(0, 0, c.e_, a(61, 1, 3) + 70);
               a[0].d();
               j.a(0, 0, c.e_, c.f_);
               h(61, 3, true);
               b(61, 3, 0, 0);
               h(61, 3, false);
               if (k(61, 15)) {
                  c(aj, 61, 16);
                  var2 = aj[2] + aj[0] >> 1;
                  int var3 = aj[3] + aj[1] >> 1;
                  int var4 = -a(61, 15, 16);
                  int var5 = -a(61, 15, 12);
                  if (gi > 1) {
                     a(var2, var3, var4, var5, gi, 20, true);
                     if ((var2 = gi * var4 / var5) == 0) {
                        h(61, 19, false);
                        h(61, 20, true);
                     } else if (var2 >= gi - 1) {
                        h(61, 19, true);
                        h(61, 20, false);
                     } else {
                        h(61, 19, true);
                        h(61, 20, true);
                     }
                  } else {
                     h(61, 19, false);
                     h(61, 20, false);
                  }
               }
            }

            label803:
            if (var0 == 5) {
               switch (var36) {
                  case -3:
                     if (fE == 62) {
                        var2 = (fD - 1) / 8;
                        int var80 = (fD - 1) % 8;
                        j.a("cGame_GUI_NewShop.h:156:Shop item PRESSED!! - iItemIndex:" + var2 + "   iItemGUIElem:" + var80);
                        if (var80 == 0) {
                           k(5, var2 + 1503);
                        } else if (var80 == 3) {
                           k(5, var2 + 1603);
                        }
                     }
                     break;
                  case -2:
                  case -1:
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 15:
                  case 16:
                  default:
                     break label803;
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                     j.a("cGame_GUI_NewShop.h:104:k_Shop_Button_Cathegory PRESSED!");
                     k(5, 1703 + (var36 - 5));
                     break;
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                     j.a("cGame_GUI_NewShop.h:118:k_Shop_Button_Subcathegory PRESSED!");
                     k(5, 1713 + (var36 - 10));
                     break;
                  case 17:
                     at(0);
                     k(5, 1723);
                     a[0].j();
                     k(5, 1703 + gc);
                     break label803;
                  case 18:
                     at(1);
                     k(5, 1723);
                     a[0].j();
                     k(5, 1703 + gc);
                     break label803;
               }

               a(16, false);
            }

            if (var0 == 1) {
               a(l(fF), false, false);
            }

            return;
         case 63:
            aF(var1);
            return;
         case 66:
            I(var1, var2);
            return;
      }
   }

   private static int j(int var0) {
      new StringBuffer().append("guiMgr_GetLayerType() - Layer ").append(var0).append(" out of bounds");
      return ak[var0];
   }

   private static boolean f(int var0) {
      new StringBuffer().append("guiMgr_GetLayerActiveState() - Layer ").append(var0).append(" out of bounds");
      return i[var0];
   }

   private static void e(int var0, boolean var1) {
      new StringBuffer().append("guiMgr_SetLayerActiveState() - Layer ").append(var0).append(" out of bounds");
      i[var0] = var1;
   }

   private static boolean g(int var0) {
      new StringBuffer().append("guiMgr_GetLayerLockState() - Layer ").append(var0).append(" out of bounds");
      return (am[var0] & 1) != 0;
   }

   private static void f(int var0, boolean var1) {
      new StringBuffer().append("guiMgr_SetLayerInputBlockState() - Layer ").append(var0).append(" out of bounds");
      if (var1) {
         am[var0] = am[var0] | 2;
      } else {
         am[var0] = am[var0] & -3;
      }
   }

   private static void g(int var0, boolean var1) {
      new StringBuffer().append("guiMgr_SetLayerPaintBlockState() - Layer ").append(var0).append(" out of bounds");
      if (var1) {
         am[var0] = am[var0] | 4;
      } else {
         am[var0] = am[var0] & -5;
      }
   }

   private static void aX() {
      if (i == null) {
         i = new boolean[fG];
      }

      if (am == null) {
         am = new int[fG];
      }

      if (al == null) {
         al = new int[fG];
      }

      if (p == null) {
         p = new int[fG][3];
      }

      for (int var0 = 0; var0 < fG; var0++) {
         i[var0] = false;
         am[var0] = 0;
         al[var0] = 0;
         p[var0][0] = 0;
         p[var0][1] = 0;
      }

      c(false);
   }

   private static void c(boolean var0) {
      for (int var1 = 0; var1 < fG; var1++) {
         e(var1, false);
      }
   }

   private static int k(int var0) {
      new StringBuffer().append("guiMgr_GetGUILayerState() - Layer ").append(var0).append(" out of bounds");
      return al[var0];
   }

   private static void a(int var0, byte var1) {
      new StringBuffer().append("guiMgr_SetGUILayerState() - Layer ").append(var0).append(" out of bounds");
      al[var0] = var1;
   }

   private static void h(int var0, boolean var1) {
      a(18, var1, false, 0);
   }

   private static void a(int var0, boolean var1, boolean var2) {
      a(var0, var1, var2, 0);
   }

   private static void a(int var0, boolean var1, boolean var2, int var3) {
      new StringBuffer().append("guiMgr_ActivateGUILayer() - Layer ").append(var0).append(" out of bounds");
      am[var0] = 0;
      if (var1 || !var1 && !var2) {
         e(var0, var1);
      }

      if (var1) {
         var3 = var0;
         new StringBuffer().append("guiMgr_InitGUILayerInitialize() - _iLayer ").append(var3).append(" out of bounds");
         int var4 = j(var3);
         bb();
         al(var3);
         byte var8 = 0;
         h(var4, var8, 0);
      }

      if (var2 && i[var0]) {
         byte var9 = var1;
         var3 = var0;
         new StringBuffer().append("guiMgr_InitGUILayerIntroOutro() - _iLayer ").append(var3).append(" out of bounds");
         var0 = j(var3);
         if (var9) {
            var9 = 6;
            h(var0, var9, 0);
            return;
         }

         var9 = 7;
         h(var0, var9, 0);
      }
   }

   private static void ak(int var0) {
      new StringBuffer().append("guiMgr_ActivateGUILayer_NoInit() - Layer ").append(var0).append(" out of bounds");
      var0 = var0;
      new StringBuffer().append("guiMgr_ActivateGUILayer_NoInit() - Layer ").append(var0).append(" out of bounds");
      e(var0, true);
   }

   private static void al(int var0) {
      new StringBuffer().append("guiMgr_ResetGUILayer() - Layer ").append(var0).append(" out of bounds");
      ag(ak[var0]);
      p[var0][0] = 0;
      p[var0][1] = 0;
      am[var0] = 0;
   }

   private static int l(int var0) {
      for (int var1 = 0; var1 < fG; var1++) {
         if (j(var1) == var0) {
            return var1;
         }
      }

      return -1;
   }

   private static void aY() {
      int var0 = 0;

      for (int var1 = 0; var1 < fG; var1++) {
         boolean var2 = (boolean)var0;
         var0 = var1;
         int var3 = j(var1);
         if (i[var0] && !g(var0)) {
            int var4 = p[var0][0];
            var0 = p[var0][1];
            if ((var0 = a(var3, var4, var0, -1)) != -1 && var0 != -2) {
               int var8 = var0;
               h(var3, 5, var8);
            }
         }

         var0 = var2;
         if (i[var1] && (am[var1] & 2) != 0) {
            break;
         }
      }
   }

   private static void aZ() {
      for (int var0 = 0; var0 < fG; var0++) {
         int var1 = var0;
         if (i[var1] && !g(var1)) {
            int var10000 = j(var1);
            byte var2 = 2;
            h(var10000, var2, 0);
         }

         if (i[var0] && (am[var0] & 2) != 0) {
            break;
         }
      }
   }

   private static void ba() {
      am(0);
   }

   private static void am(int var0) {
      int var1 = -1;

      for (int var2 = 0; var2 < fG; var2++) {
         if (i[var2] && (am[var2] & 4) != 0) {
            var1 = var2;
            break;
         }
      }

      for (int var9 = var1 < 0 ? fG - 1 : var1; var9 >= 0; var9--) {
         int var3 = var0;
         int var7 = 0;
         var7 = var9;
         if (i[var7]) {
            int var4;
            int var10000 = var4 = j(var7);
            byte var6 = 3;
            h(var10000, var6, 0);
            j(var4, p[var7][0], p[var7][1], var3);
            var6 = 4;
            h(var4, var6, 0);
         }
      }
   }

   private static void bb() {
      for (int var0 = 0; var0 < ak.length; var0++) {
         int var1 = ak[var0];

         for (int var2 = 0; var2 < a[var1].length; var2++) {
            if (k(var1, var2) == 6) {
               e(var1, var2, false);
            }
         }
      }
   }

   private static void u(int var0, int var1) {
      j.a("cGame_Text.h:162:loadText() - _iLangCode:" + var0 + "  _iStoreIndex:" + var1);
      j.a("cGame_Text.h:166:Language EN found!");
      int var3 = var0;
      j.a("cGame_Text.h:353:getPackNameFromLanguage() - _iLangCode:" + var3);
      String var2;
      switch (var3) {
         case 0:
            var2 = "/EN";
            break;
         default:
            var2 = "/EN";
      }

      var2 = var2;
      j.a("cGame_Text.h:204:zPackName:" + var2);
      if (b == null) {
         var3 = var0;
         j.a("cGame_Text.h:244:getNumTextsFromLanguage() - _iLangCode:" + var3);
         b = new String[7][];
      } else {
         b[var1] = null;
      }

      j.a("cGame_Text.h:216:Loading text package '" + var2 + "'    fileId:" + 0 + "    _iStoreIndex:" + var1);
      j.n();
      j.a(var2, var1);
      int var5 = j.m();
      b[var1] = new String[var5];

      for (int var7 = 0; var7 < var5; var7++) {
         b[var1][var7] = j.d(var7 + (var1 << 11));
      }

      j.n();
      fH = var0;
      an(var1);
   }

   private static void an(int var0) {
      j.a("cGame_Text.h:462:_iStoreIndex:" + var0);
      if (var0 == 5) {
         String var1;
         int var2;
         if ((var2 = (var1 = a(10323, (int)var0)).indexOf(35)) != -1) {
            var1 = var1.substring(0, var2) + GloftUNO3.a.getAppProperty("MIDlet-Version") + var1.substring(var2 + 1);
            b[var0][83] = var1;
         }

         b[var0][81] = b[0][653];
      }

      if (fH == 2) {
         j.a("cGame_Text.h:485:Postprocessing FR texts...");

         for (int var4 = 0; var4 < b[var0].length; var4++) {
            if (b[var0][var4] != null) {
               b[var0][var4] = b(b[var0][var4]);
               b[var0][var4] = c(b[var0][var4]);
            }
         }
      }

      if (fH == 15) {
         j.a("cGame_Text.h:502:Postprocessing TH texts...");

         for (int var5 = 0; var5 < b[var0].length; var5++) {
            if (b[var0][var5] != null) {
               b[var0][var5] = d(b[var0][var5]);
            }
         }
      }
   }

   private static String b(String var0) {
      int var1 = var0.length();
      int var2 = 1;

      while (var2 < var1) {
         switch (var0.charAt(var2)) {
            case '!':
            case '%':
            case '+':
            case ',':
            case '-':
            case '.':
            case ':':
            case ';':
            case '?':
               if (var0.charAt(var2 - 1) == ' ') {
                  var0 = var0.substring(0, var2 - 1) + ' ' + var0.substring(var2);
               }
            case '"':
            case '#':
            case '$':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '<':
            case '=':
            case '>':
            default:
               var2++;
         }
      }

      return var0;
   }

   private static String c(String var0) {
      int var1 = var0.length();
      boolean var2 = false;

      for (int var3 = 0; var3 < var1; var3++) {
         switch (var0.charAt(var3)) {
            case 'À':
            case 'Â':
               var0 = var0.substring(0, var3) + 'A' + var0.substring(var3 + 1, var1);
               var2 = true;
            case 'Á':
            case 'Ã':
            case 'Ä':
            case 'Å':
            case 'Æ':
            case 'Ì':
            case 'Í':
            case 'Ð':
            case 'Ñ':
            case 'Ò':
            case 'Ó':
            case 'Õ':
            case 'Ö':
            case '×':
            case 'Ø':
            case 'Ú':
            default:
               break;
            case 'Ç':
               var0 = var0.substring(0, var3) + 'C' + var0.substring(var3 + 1, var1);
               var2 = true;
               break;
            case 'È':
            case 'É':
            case 'Ê':
            case 'Ë':
               var0 = var0.substring(0, var3) + 'E' + var0.substring(var3 + 1, var1);
               var2 = true;
               break;
            case 'Î':
            case 'Ï':
               var0 = var0.substring(0, var3) + 'I' + var0.substring(var3 + 1, var1);
               var2 = true;
               break;
            case 'Ô':
               var0 = var0.substring(0, var3) + 'O' + var0.substring(var3 + 1, var1);
               var2 = true;
               break;
            case 'Ù':
            case 'Û':
               var0 = var0.substring(0, var3) + 'U' + var0.substring(var3 + 1, var1);
               var2 = true;
         }
      }

      if (var2) {
         j.a("cGame_Text.h:652:stripFrenchAccents() - Modified string **" + var0 + "**");
      }

      return var0;
   }

   private static String d(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         switch (var0.charAt(var2)) {
            case 'À':
            case 'Â':
               var0 = var0.substring(0, var2) + 'A' + var0.substring(var2 + 1, var1);
            case 'Á':
            case 'Ã':
            case 'Ä':
            case 'Å':
            case 'Æ':
            case 'Ì':
            case 'Í':
            case 'Ð':
            case 'Ñ':
            case 'Ò':
            case 'Ó':
            case 'Õ':
            case 'Ö':
            case '×':
            case 'Ø':
            case 'Ú':
            case 'Ü':
            case 'Ý':
            case 'Þ':
            case 'ß':
            case 'æ':
            case 'ç':
            case 'ð':
            case 'ñ':
            case '÷':
            case 'ø':
            default:
               break;
            case 'Ç':
               var0 = var0.substring(0, var2) + 'C' + var0.substring(var2 + 1, var1);
               break;
            case 'È':
            case 'É':
            case 'Ê':
            case 'Ë':
               var0 = var0.substring(0, var2) + 'E' + var0.substring(var2 + 1, var1);
               break;
            case 'Î':
            case 'Ï':
               var0 = var0.substring(0, var2) + 'I' + var0.substring(var2 + 1, var1);
               break;
            case 'Ô':
               var0 = var0.substring(0, var2) + 'O' + var0.substring(var2 + 1, var1);
               break;
            case 'Ù':
            case 'Û':
               var0 = var0.substring(0, var2) + 'U' + var0.substring(var2 + 1, var1);
               break;
            case 'à':
            case 'á':
            case 'â':
            case 'ã':
            case 'ä':
            case 'å':
               var0 = var0.substring(0, var2) + 'a' + var0.substring(var2 + 1, var1);
               break;
            case 'è':
            case 'é':
            case 'ê':
            case 'ë':
               var0 = var0.substring(0, var2) + 'e' + var0.substring(var2 + 1, var1);
               break;
            case 'ì':
            case 'í':
            case 'î':
            case 'ï':
               var0 = var0.substring(0, var2) + 'i' + var0.substring(var2 + 1, var1);
               break;
            case 'ò':
            case 'ó':
            case 'ô':
            case 'õ':
            case 'ö':
               var0 = var0.substring(0, var2) + 'o' + var0.substring(var2 + 1, var1);
               break;
            case 'ù':
            case 'ú':
            case 'û':
            case 'ü':
               var0 = var0.substring(0, var2) + 'u' + var0.substring(var2 + 1, var1);
         }
      }

      return var0;
   }

   public static final String b(int var0) {
      return a(var0, (int)0);
   }

   public static String a(int var0, int var1) {
      String var2;
      if ((var2 = b[var1][var0 & 2047]) != null) {
         var2 = var2.toString();
      }

      return var2;
   }

   private static String a(String var0, int var1) {
      var1 = var1;
      byte var3 = 35;
      var0 = var0;
      int var2;
      if ((var2 = var0.indexOf(35)) != -1) {
         var0 = var0.substring(0, var2) + j.a(var1, fH, " ") + var0.substring(var2 + 1);
      }

      return var0;
   }

   private static String e(int var0) {
      return j.a(var0, fH, " ");
   }

   private static String f(int var0) {
      int var1;
      var0 = (var1 = var0 / 1000) / 60;
      if ((var1 = var1 % 60) >= 10) {
         StringBuffer var6 = new StringBuffer().append("").append(var0);
         short var4 = 615;
         return var6.append(a(615, (int)0)).append(var1).toString();
      } else {
         StringBuffer var10000 = new StringBuffer().append("").append(var0);
         short var3 = 615;
         return var10000.append(a(615, (int)0)).append("0").append(var1).toString();
      }
   }

   private static String a(String var0, String[] var1, char var2) {
      var2 = 0;
      String var3 = "";

      for (int var4 = 0; var4 < var0.length(); var4++) {
         if (var0.charAt(var4) == '#') {
            var3 = var3 + var1[var2];
            var2++;
         } else {
            var3 = var3 + var0.charAt(var4);
         }
      }

      return var3;
   }

   private static void ao(int var0) {
      u(var0, 0);
      u(var0, 1);
      u(var0, 2);
      u(var0, 3);
      u(var0, 4);
      u(var0, 5);
      u(var0, 6);
      byte var1 = 4;
      if (i(s, var1) == 0) {
         var1 = 65;
         i = a(65, (int)0);
      }

      a(s, i);
      f(fu, var0);
   }

   private static String a(String var0, int var1, int var2) {
      b[1].a(var0);
      if (e.a() <= var2) {
         return var0;
      }

      var0 = var0 + "...";

      do {
         var0 = var0.substring(0, var0.length() - 4) + "...";
         b[1].a(var0);
         var1 = e.a();
         j.a("cGame_Text.h:1133:fakeName = " + var0 + " fakeNameWidth: " + var1);
      } while (var1 > var2);

      return var0;
   }

   private static void bc() {
      j.a("Loading SHOP_XXX array");

      for (int var0 = 0; var0 < b.length; var0++) {
         b[var0] = (int[][])j.a(var0 + 6);
         b[var0] = a(b[var0]);
      }

      for (int var1 = 0; var1 < b[3].length; var1++) {
         b[3][var1][2] = var1 % 3;
      }
   }

   private static int[][] a(int[][] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2][0] == -1) {
            var1++;
         }
      }

      int[][] var7;
      if (var1 > 0) {
         var7 = new int[var0.length - var1][var0[0].length];
         var1 = 0;

         for (int var4 = 0; var4 < var0.length; var4++) {
            if (var0[var4][0] != -1) {
               int var3 = 0;

               for (int var5 = 0; var5 < var0[var4].length; var5++) {
                  var7[var1][var3] = var0[var4][var5];
                  var3++;
               }

               var1++;
            }
         }
      } else {
         var7 = var0;
      }

      return var7;
   }

   private static void bd() {
      for (int var0 = 0; var0 < 6; var0++) {
         j[var0] = false;
      }

      j[0] = true;
   }

   private static boolean h(int var0) {
      if (var0 == 0) {
         return true;
      }

      int var1 = fs + var0;
      return i(s, var1) == 1 ? true : y() >= q[var0][0];
   }

   private static int x() {
      int var0 = 0;

      for (int var1 = 0; var1 < 6 && h(var1); var1++) {
         var0++;
      }

      return var0;
   }

   private static int m(int var0) {
      j.a("cGame_Career.h:84:getNumberOfUnlockedLevelsInVenue() - venueNumber:" + var0);
      int var1 = 0;

      for (int var2 = 0; var2 < 5 && m(var0, var2); var2++) {
         var1++;
      }

      return var1;
   }

   private static boolean m(int var0, int var1) {
      j.a("cGame_Career.h:109:isStageUnlocked() - _iVenue:" + var0 + "    _iStage:" + var1);
      if (var1 != 0 && var1 != 1) {
         int var4 = var1 - 1;
         int var5 = 0;

         for (int var6 = 0; var6 < var1; var6++) {
            int var2 = var0 * 5 + var6;
            int var3 = fj + var2;
            var3 = i(s, var3);
            j.a("cGame_Career.h:142:isStageUnlocked() - prev iStage1D:" + var2 + "    prev iStageHighscore:" + var3);
            j.a("cGame_Career.h:143:isStageUnlocked() - unlocked:" + (var3 >= a[var0][var6][27]));
            if (var3 >= a[var0][var6][27]) {
               var5++;
            }
         }

         j.a("cGame_Career.h:151:isStageUnlocked - iUnlockedPrevStages:" + var5 + "   iNeededBeatenStagesToUnlock:" + var4);
         return var5 >= var4;
      } else {
         return true;
      }
   }

   private static int n(int var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         var1 += e(var0, var2);
      }

      return var1;
   }

   private static int y() {
      int var0 = 0;

      for (int var1 = 0; var1 < 6; var1++) {
         var0 += n(var1);
      }

      return var0;
   }

   private static int o(int var0) {
      int var1 = 0;

      for (int var2 = var0; var2 >= 0 && !h(var2); var2--) {
         var1 += q[var2][5];
      }

      return var1;
   }

   private static void ap(int var0) {
      for (int var1 = var0; var1 >= 0 && !h(var1); var1--) {
         f(fs + var1, 1);
         o(fr + var1, 0);
      }

      z(0, -1);
      z(1, -1);
      z(2, -1);
      z(3, -1);
      z(4, -1);
   }

   private static int z() {
      if (o.a != 0 && o.a != 3) {
         j.a("cGame_Career.h:257:GetRestartFee() - s_iCurrentVenue:" + o.g + "     s_iSelectedStage:" + bq);
         return a[o.g][bq][17];
      } else {
         return an[0];
      }
   }

   private static void be() {
      int var0 = t[0][0];
      fK = 0;
      switch (var0) {
         case 0:
            t[0][4] = 1;
            boolean var15 = true;
            boolean var11 = true;
            boolean var7 = true;
            a(1, var11, var15, 0);
            return;
         case 1:
            t[0][4] = 2;
            boolean var14 = true;
            boolean var10 = true;
            byte var6 = 2;
            a(2, var10, var14, 0);
            return;
         case 2:
            t[0][4] = 1;
            boolean var13 = true;
            boolean var9 = true;
            boolean var5 = true;
            a(1, var9, var13, 0);
            return;
         case 3:
            t[0][4] = 3;
            boolean var12 = true;
            boolean var8 = true;
            byte var4 = 3;
            a(3, var8, var12, 0);
            return;
         case 4:
            t[0][4] = 4;
            boolean var2 = true;
            boolean var1 = true;
            byte var3 = 4;
            a(4, var1, var2, 0);
            return;
         default:
            new StringBuffer().append("msgBox_Update() - Unregistered msgbox type ").append(var0);
      }
   }

   private static void c(int var0, String var1) {
      a(var0, var1, -1, 0);
   }

   private static void a(int var0, String var1, int var2) {
      a(0, var1, var2, 0);
   }

   private static void a(int var0, String var1, int var2, int var3) {
      new StringBuffer().append("msgBox_AddMsgBox() : Too many msgboxes in queue, adding message ").append(var1).append(" of type ").append(var0);
      if (fJ < 14) {
         t[fJ][0] = var0;
         t[fJ][1] = var2;
         t[fJ][2] = var3;
         if (var0 == 2) {
            t[fJ][3] = 1;
         } else {
            t[fJ][3] = 0;
         }

         d[fJ] = var1;
         fJ++;
         g = d[0];
         if (fJ == 1) {
            be();
         }
      }
   }

   private static boolean o() {
      if (fJ > 0) {
         for (int var0 = 0; var0 < 14; var0++) {
            for (int var1 = 0; var1 < 5; var1++) {
               t[var0][var1] = t[var0 + 1][var1];
            }

            d[var0] = d[var0 + 1];
         }

         fJ--;
         g = d[0];
         if (fJ > 0) {
            be();
         }
      }

      return fJ > 0;
   }

   private static boolean p() {
      return fJ > 0;
   }

   private static int A() {
      return t[0][1];
   }

   private static int B() {
      return p() ? t[0][2] : 0;
   }

   private static void aq(int var0) {
      int var1 = t[0][1];
      j.a("cGame_MsgBox.h:428:msgBox_ClickCallback() - iCurrentCallback:" + var1 + "     _iAction:" + var0);
      switch (var1) {
         case 0:
            if (var0 == 0) {
               v = true;
               bc = true;
               fL = 0;
               bd = false;
               be = false;
               fM = -1;
               if (u == null) {
                  u = new p();
               }

               bf();
               n(0);
               ad(s);
               o.a(2);
               o.b(1);
               fN = 0;
               return;
            }

            bf();
            k(5, 1029);
            return;
         case 1:
            if (var0 == 0) {
               k(5, 1022);
               return;
            }

            k(5, 1023);
            return;
         case 2:
            j.a("cGame_MsgBox.h:468:MSGBOX_CALLBACK.QUIT_GAME:");
            if (var0 == 0) {
               k(5, 1024);
               return;
            }
            break;
         case 3:
            if (var0 == 0) {
               k(5, 1026);
               return;
            }
            break;
         case 4:
            k(5, 1045);
            return;
         case 5:
            if (var0 == 0) {
               var0 = z();
               if (fV < var0) {
                  short var7 = 614;
                  String var11 = a(614, (int)0);
                  boolean var8 = false;
                  a(0, var11, -1, 0);
                  return;
               }

               fV -= var0;
               o(fk, fV);
               k(5, 1279);
            }
            break;
         case 6:
            k(5, 1046);
            return;
         case 7:
            if (var0 == 0) {
               k(5, 1276);
               return;
            }
            break;
         case 8:
            if (var0 == 0) {
               k(5, 1277);
               return;
            }
            break;
         case 9:
            if (var0 == 0) {
               k(5, 1278);
               return;
            }
            break;
         case 10:
            k(5, 1272);
            return;
         case 11:
            k(5, 1273);
            return;
         case 12:
            short var4 = 662;
            String var10001 = a(662, (int)0);
            byte var2 = 11;
            String var10 = var10001;
            boolean var5 = false;
            a(0, var10, var2, 0);
            J = true;
            return;
         case 13:
            a = a[0];
            return;
         case 14:
            if (var0 == 0) {
               k(5, 1188);
               return;
            }
            break;
         case 15:
            if (var0 == 0) {
               m(46);
               return;
            }
            break;
         case 16:
            if (var0 == 0) {
               k(5, 1038);
               return;
            }
            break;
         case 17:
            if (var0 == 0) {
               k(5, 1110);
               return;
            }
            break;
         case 18:
            n(1);
            return;
         case 19:
            k(5, 1272);
            return;
         case 20:
            k(5, 1273);
            return;
         case 21:
            k(5, 1273);
            return;
         case 22:
         case 23:
         case 24:
         default:
            new StringBuffer().append("msgBox_ClickCallback() - Callback ID (").append(var1).append(" not handled");
            break;
         case 25:
            m(12);
            boolean var9 = false;
            byte var3 = 16;
            d(16, 1, false);
            return;
         case 26:
            a(1);
            return;
      }
   }

   private static boolean q() {
      return bc;
   }

   static boolean b() {
      return !bc || bd;
   }

   private static int C() {
      int var0 = 0;

      for (int var1 = 0; var1 < v.length; var1++) {
         if (v[var1][0] >= 0 && v[var1][2] >= 0) {
            var0++;
         }
      }

      return var0;
   }

   private static void bf() {
      boolean var0 = true;
      bb = true;
      f(35, bb ? 1 : 0);
   }

   private static void bg() {
      bc = false;
      n(1);
      ai = false;
   }

   private static void k(int var0, int var1, int var2, int var3) {
      u.a(a[185]);
      u.b(0, -1);
      u.a(var2, var3);
      be = true;
   }

   static void e(int var0) {
      if (bc) {
         if (fL < u.length) {
            if (fN <= 0) {
               j.a("cGame_Tutorial.h:488:Arrived tutorial event " + f[var0] + " - Checking condition type " + e[u[fL][1]]);
               if (u[fL][0] == 1) {
                  if (var0 == u[fL][1]) {
                     j.a("cGame_Tutorial.h:496:Advanced tutorial");
                     fL++;
                     bd = false;
                     be = false;
                  }

                  if (fL >= u.length) {
                     bg();
                  }
               }
            }
         }
      }
   }

   private static void bh() {
      C = new int[b.length][];

      for (int var0 = 0; var0 < b.length; var0++) {
         C[var0] = new int[b[var0].length];
      }

      int var4 = ft;

      for (int var1 = 0; var1 < C.length; var1++) {
         for (int var2 = 0; var2 < C[var1].length; var2++) {
            int[] var10000 = C[var1];
            int var3 = var4;
            var10000[var2] = i(s, var3);
            var4++;
         }
      }

      for (int var5 = 0; var5 < 10; var5++) {
         for (int var6 = 0; var6 < C[var5].length; var6++) {
            if (b[var5][var6][5] == 1) {
               C[var5][var6] = C[var5][var6] | 1;
            }

            switch (var5) {
               case 0:
                  C[var5][var6] = C[var5][var6] | 8;
                  break;
               case 1:
                  C[var5][var6] = C[var5][var6] | 16;
                  break;
               case 2:
                  C[var5][var6] = C[var5][var6] | 32;
                  break;
               case 3:
                  C[var5][var6] = C[var5][var6] | 64;
                  break;
               case 4:
                  C[var5][var6] = C[var5][var6] | 128;
                  break;
               case 5:
                  C[var5][var6] = C[var5][var6] | 256;
                  break;
               case 6:
                  C[var5][var6] = C[var5][var6] | 512;
                  break;
               case 7:
                  C[var5][var6] = C[var5][var6] | 1024;
                  break;
               case 8:
                  C[var5][var6] = C[var5][var6] | 2048;
                  break;
               case 9:
                  C[var5][var6] = C[var5][var6] | 4096;
            }
         }

         if (var5 != 7 && var5 != 8 && var5 != 9) {
            g(var5, 0);
         }
      }

      bl();
   }

   public static int a(int var0, int var1, int var2) {
      j.a("cGame_NewShop.h:468:newShop_getSectionItemIndexFromType _iSubcategoryID:" + var0 + "  _iItemType:" + var1 + "  _iItemColor:" + var2);
      int var3 = -1;
      int[][] var4 = b[var0];

      for (int var5 = 0; var5 < var4.length; var5++) {
         if (var0 == 6 || var0 == 5) {
            if (var4[var5][0] == var1) {
               var3 = var5;
               break;
            }
         } else if (var0 == 4) {
            if (var4[var5][0] == var1 && var4[var5][2] == var2 && var4[var5][3] == a[0].b[44]) {
               var3 = var5;
               break;
            }
         } else if (var4[var5][0] == var1 && var4[var5][2] == var2) {
            var3 = var5;
            break;
         }
      }

      if (var3 == -1) {
         var3 = 0;
      }

      return var3;
   }

   private static int a(int var0, boolean var1) {
      int[] var2 = C[var0];
      int var3 = -1;

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (var1 && (var2[var4] & 4) != 0) {
            j.a("cGame_NewShop.h:526:congagagagagagagagagagaga1");
            var3 = var4;
            break;
         }

         if ((var2[var4] & 2) != 0) {
            j.a("cGame_NewShop.h:533:congagagagagagagagagagaga2" + var0);
            new StringBuffer()
               .append("newShop_getEquippedItem() - More than one equipped item in subcategory ID ")
               .append(var0)
               .append(" - Items are:")
               .append(var3)
               .append(" and ")
               .append(var4);
            var3 = var4;
         }
      }

      return var3;
   }

   public static void g(int var0, int var1) {
      int[] var2 = C[var0];
      j.a("cGame_NewShop.h:574:newShop_equipItem _iSubcategoryID:" + var0 + "  _iSectionItem:" + var1);

      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var3 == var1) {
            var2[var3] |= 2;
         } else {
            var2[var3] &= -3;
         }
      }

      if (var0 == 7) {
         if (var1 < 0) {
            fT = 0;
         } else {
            fT = var1;
         }

         if ((br = b[var0][fT][0]) == -2) {
            br = -1;
         }

         b(s, fe, fT);
      }

      if (var0 == 8) {
         int var10000 = b[var0][var1][0];
         int var6 = b[var0][var1][2];
         int var4 = var10000;
         j.a("cGame_NewShop.h:2183:Setting equipped deck in RMS: Theme:" + var4 + "  Color:" + var6);
         f(52, var4);
         f(53, var6);
      }

      j.a("cGame_NewShop.h:619:s_newShopcathegory:" + gc);
      if (var0 == 9) {
         int var8 = b[var0][var1][0];
         int var7 = b[var0][var1][2];
         int var5 = var8;
         j.a("cGame_NewShop.h:2193:Setting equipped theme in RMS: Theme:" + var5 + "  Color:" + var7);
         f(50, var5);
         f(51, var7);
      }

      bl();
   }

   private static void bi() {
      for (int var0 = 0; var0 < C.length; var0++) {
         v(var0, -1);
      }
   }

   private static void v(int var0, int var1) {
      int[] var3 = C[var0];

      for (int var2 = 0; var2 < var3.length; var2++) {
         if (var2 == var1) {
            var3[var2] |= 4;
         } else {
            var3[var2] &= -5;
         }
      }
   }

   private static void ar(int var0) {
      T();
      f(61, 5 + gc, false);
      gc = var0;
      f(61, var0 + 5, true);
      bi();
      d(false);
      var0 = 0;

      for (int var1 = 0; var1 < w[gc].length; var1++) {
         var0 += B[w[gc][var1]].length - 1;
      }

      if ((gi = var0 / 8 + 1) <= 0) {
         gi = 1;
      }

      boolean var3 = false;
      b(false, -1);
   }

   private static void bj() {
      T();

      for (int var0 = 0; var0 < 5; var0++) {
         a(61, var0 + 10, false);
      }

      j(61, 15, false);
   }

   private static void as(int var0) {
      gd = var0;
      bi();

      for (int var3 = 0; var3 < 5; var3++) {
         int var2 = var3 + 10;
         int var1 = 61;
         new StringBuffer()
            .append("ResetElementData() - Error resetting elem.")
            .append(var2)
            .append(" in layer ")
            .append(61)
            .append(": element ID is greater than number of initial elements (")
            .append(b[61].length)
            .append(") (was this element added manually?)");

         for (int var6 = (var1 = 5 + b[61][var2][4]) - 1; var6 >= 0; var6--) {
            a[61][var2][var6] = b[61][var2][var6];
         }

         c[61][var2] = 0;
         a[61][var2] = null;
         if (a[61][var2][0] == 2 && a[61][var2][17] != -1) {
            a[61][var2] = a(a[61][var2][17], 0);
         } else if (a[61][var2][0] == 6 && a[61][var2][24] != -1) {
            a[61][var2] = a(a[61][var2][24], 0);
         } else {
            a[61][var2] = null;
         }
      }

      var0 = 0;
      if (w[gc].length > 1) {
         for (var0 = 0; var0 < w[gc].length; var0++) {
            a(61, var0 + 10, true);
            if (var0 == gd) {
               f(61, var0 + 10, true);
            }

            if (x[gc][var0] == -1) {
               i(61, var0 + 10, 15, -1);
            } else {
               i(61, var0 + 10, 16, x[gc][var0]);
            }
         }
      }

      while (var0 < 5) {
         a(61, var0 + 10, false);
         c(61, var0 + 10, true);
         i(61, var0 + 10, 5, 10);
         i(61, var0 + 10, 15, -1);
         var0++;
      }

      e(false);
      if ((gi = (B[w[gc][gd]].length - 1) / 8 + 1) <= 0) {
         gi = 1;
      }

      boolean var7 = false;
      b(false, -1);
   }

   private static void at(int var0) {
      int var2 = 0;

      for (int var3 = 0; var3 < 10; var3++) {
         for (int var4 = 0; var4 < b[var3].length; var4++) {
            if (n(var0, b[var3][var4][3])) {
               var2++;
            }
         }

         B[var3] = new int[var2];
         var2 = 0;
      }

      int var1 = 0;
      var2 = 0;

      for (int var6 = 0; var6 < 10; var6++) {
         for (int var7 = 0; var7 < b[var6].length; var7++) {
            if (n(var0, b[var6][var7][3])) {
               B[var1][var2] = var7;
               var2++;
            }
         }

         var1++;
         var2 = 0;
      }
   }

   private static void d(boolean var0) {
      j(61, 15, true);
      int var2 = 0;

      for (int var3 = 0; var3 < w[gc].length; var3++) {
         int var1 = w[gc][var3];
         var2 += B[var1].length;
      }

      if (!var0) {
         ag(62);
         a(aj, 62, 1, 0, 0);
         var0 = aj[1];
         a(aj, 62, 4, 0, 0);
         int var17 = aj[3];
         int var22 = var0;
         var17 = var17 - var0 + 1;
         int var4 = var0 - a(61, 15, 3);
         c(aj, 62, 0);
         gh = (var0 = aj[3]) - var22;
         int var12 = a(61, 15, 5);
         var22 = a(62, 1, 2) - a(61, 15, 2);
         gg = (var12 - var22 * 2) / 3 + -5;
         short var24 = 62;
         var12 = a[var24].length;
         var24 = (byte)62;
         s(62, a[var24].length + 8 * (var2 - 1));
         int var6 = 0;
         gf = var4 * 2 + var17;
         var4 = 0;

         for (int var7 = 0; var7 < var2 && var6 < var2; var7++) {
            if (var7 > 0) {
               gf = gf + gh;
            }

            int var5 = 0;

            for (int var8 = 0; var8 < 2 && var6 < var2; var8++) {
               var6++;

               for (int var9 = 0; var9 < 8; var9++) {
                  if (var7 != 0 || var8 != 0) {
                     f(62, var9 + 1, var12);
                     short var19 = a(62, var9 + 1, 2);
                     var24 = a(62, var9 + 1, 3);
                     i(62, var12, 2, var19 + var4);
                     i(62, var12, 3, var24 + var5);
                     var12++;
                  }
               }

               var5 += gh;
            }

            var4 += gg;
         }

         if ((ge = a(61, 15, 5)) >= var4 - ge) {
            a(61, 15, 0, 0, 0, 0);
         } else {
            a(61, 15, -(var2 / 8) * (gg << 2), 0, 0, 0);
         }

         var17 = gg << 2;
         byte var14 = 15;
         var14 = 61;
         a[61][15][25] = (short)var17;
         r(61, 15);
         i(61, 15, 16, 0);
      }

      for (int var29 = 0; var29 < var2; var29++) {
         int[] var21;
         int var27 = (var21 = a(var29))[0];
         var0 = var21[1];
         a(gc, var27, var0, var29, true);
      }
   }

   private static int[] a(int var0) {
      int var1 = 0;
      int[] var3 = new int[2];

      for (int var4 = 0; var4 < w[gc].length; var4++) {
         int var2 = w[gc][var4];

         for (int var5 = 0; var5 < B[var2].length; var5++) {
            if (var0 == var1) {
               var3[0] = var4;
               var3[1] = B[var2][var5];
               return var3;
            }

            var1++;
         }
      }

      var3[0] = 0;
      var3[1] = B[0][0];
      return var3;
   }

   private static void e(boolean var0) {
      j(61, 15, true);
      var0 = w[gc][gd];
      var0 = b[var0].length;
      ag(62);
      a(aj, 62, 1, 0, 0);
      int var1 = aj[1];
      a(aj, 62, 4, 0, 0);
      int var2 = aj[3];
      var1 = var1;
      int var3 = var2 - var1 + 1;
      int var4 = var1 - a(61, 15, 3);
      c(aj, 62, 0);
      gh = (var2 = aj[3]) - var1;
      int var13 = a(61, 15, 5);
      var2 = a(62, 1, 2) - a(61, 15, 2);
      gg = (var13 - var2 * 2) / 3;
      int var18 = 62;
      var13 = a[var18].length;
      var18 = (byte)62;
      s(62, a[var18].length + 8 * (var0 - 1));
      int var6 = 0;
      gf = var4 * 2 + var3;
      var4 = 0;

      label53:
      for (int var7 = 0; var7 < var0 && var6 < var0; var7++) {
         if (var7 > 0) {
            gf = gf + gh;
         }

         int var5 = 0;
         int var8 = 0;

         while (var8 < 2 && var6 < var0) {
            var6++;

            for (int var9 = 0; var9 < 8; var9++) {
               if (var7 != 0 || var8 != 0) {
                  f(62, var9 + 1, var13);
                  var18 = a(62, var9 + 1, 2);
                  short var22 = a(62, var9 + 1, 3);
                  i(62, var13, 2, var18 + var4);
                  i(62, var13, 3, var22 + var5);
                  var13++;
               }
            }

            var5 += gh;
            var8++;
            continue;

            var4 += gg;
            continue label53;
         }
         break;
      }

      ge = a(61, 15, 6);
      int var26 = gf - ge;
      a(61, 15, -var26, 0, 0, 0);
      i(61, 15, 16, 0);

      for (int var15 = 0; var15 < var0; var15++) {
         var4 = var15;
         var3 = gd;
         var18 = gc;
         a(gc, var3, var4, -1, false);
      }
   }

   private static void a(int var0, int var1, int var2, int var3, boolean var4) {
      int var5 = w[var0][var1];
      int var6;
      if (var4) {
         var6 = 1 + (var3 << 3);
      } else {
         var6 = 1 + (var2 << 3);
      }

      int[] var7;
      int var8;
      if ((var7 = b[var5][var2])[0] >= 0) {
         var8 = y[var0][var1] + var7[0];
      } else {
         var8 = -1;
      }

      int var9 = var7[2];
      int var10;
      if (!i(var10 = var7[3])) {
         c(62, var6, true);
         c(62, var6 + 3, true);
      }

      int var12 = var1;
      int var11 = var0;
      if (z[var11][var12] != -1) {
         var12 = var1;
         var11 = var0;
         var11 = A[var11][var12];
         i(62, var6 + 1, 5, 184);
         i(62, var6 + 1, 6, var11);
         h(62, var6 + 1, true);
         i(62, var6 + 1, 8, 1);
         if (var8 < 0) {
            h(62, var6 + 2, false);
         } else {
            h(62, var6 + 2, true);
            i(62, var6 + 2, 5, var8);
            i(62, var6 + 2, 6, var7[1]);
            i(62, var6 + 2, 8, var9);
         }

         aq = a[184].a(var11, aq, 0, z[var0][var1]);
         short var13 = a(62, var6 + 1, 2);
         short var20 = a(62, var6 + 1, 3);
         i(62, var6 + 2, 2, var13 + aq[0]);
         i(62, var6 + 2, 3, var20 + aq[1]);
      } else if (var8 < 0) {
         h(62, var6 + 1, true);
         i(62, var6 + 1, 5, 10);
         i(62, var6 + 1, 6, 48);
      } else {
         h(62, var6 + 1, true);
         i(62, var6 + 1, 5, var8);
         i(62, var6 + 1, 6, 0);
         i(62, var6 + 1, 8, var9);
         h(62, var6 + 2, false);
      }

      if (var5 == 7) {
         if (var2 > 0) {
            b(62, var6 + 6, "x " + e(ap[b[7][var2][0]]));
         } else {
            b(62, var6 + 6, "");
         }

         k = e(var7[4]) + " x " + 5;
         switch (var2) {
            case 1:
               if (k(6)) {
                  gj = 44;
                  c(62, var6 + 3, false);
               } else {
                  gj = -1;
                  byte var18 = 53;
                  k = a(53, (int)0);
                  c(62, var6 + 3, true);
               }
               break;
            case 2:
               if (k(7)) {
                  gj = 44;
                  c(62, var6 + 3, false);
               } else {
                  gj = -1;
                  byte var17 = 53;
                  k = a(53, (int)0);
                  c(62, var6 + 3, true);
               }
               break;
            case 3:
               if (k(8)) {
                  gj = 44;
                  c(62, var6 + 3, false);
               } else {
                  gj = -1;
                  byte var16 = 53;
                  k = a(53, (int)0);
                  c(62, var6 + 3, true);
               }
               break;
            case 4:
               if (k(9)) {
                  gj = 44;
                  c(62, var6 + 3, false);
               } else {
                  gj = -1;
                  byte var15 = 53;
                  k = a(53, (int)0);
                  c(62, var6 + 3, true);
               }
               break;
            case 5:
               if (k(10)) {
                  gj = 44;
                  c(62, var6 + 3, false);
               } else {
                  gj = -1;
                  byte var14 = 53;
                  k = a(53, (int)0);
                  c(62, var6 + 3, true);
               }
         }
      } else {
         b(62, var6 + 6, "");
      }

      if ((C[var5][var2] & 4) != 0 && var5 != 7) {
         i(62, var6, 6, 37);
         i(62, var6, 8, 37);
      } else if (var5 == 7 && (C[var5][var2] & 2) != 0) {
         i(62, var6, 7, 4);
         i(62, var6, 9, 4);
      } else {
         i(62, var6, 6, 7);
         i(62, var6, 8, 37);
      }

      if ((C[var5][var2] & 1) != 0) {
         if ((C[var5][var2] & 2) != 0) {
            i(62, var6 + 3, 5, 49);
            i(62, var6 + 3, 6, 1);
            i(62, var6 + 3, 8, 1);
            i(62, var6 + 7, 6, 1);
            a(var5, var2, -1, -1, "", var10, var3, var4);
         } else {
            i(62, var6 + 3, 5, 49);
            i(62, var6 + 3, 6, 2);
            i(62, var6 + 3, 8, 2);
            i(62, var6 + 7, 6, 2);
            a(var5, var2, -1, -1, "", var10, var3, var4);
         }
      } else if (var7[6] == 1) {
         short var19 = 293;
         a(var5, var2, 10, 43, a(293, (int)0), var10, var3, var4);
         i(62, var6 + 3, 7, 0);
         i(62, var6 + 3, 9, 0);
      } else {
         if (var5 == 7) {
            if (gj == -1) {
               a(var5, var2, -1, gj, k, var10, var3, var4);
            } else {
               a(var5, var2, 10, gj, k, var10, var3, var4);
            }
         } else {
            a(var5, var2, 10, 44, e(var7[4]), var10, var3, var4);
         }

         int var10001 = var7[4];
         i(62, var6 + 3, 7, 0);
         i(62, var6 + 3, 9, 1);
      }
   }

   private static void a(int var0, int var1, int var2, int var3, String var4, int var5, int var6, boolean var7) {
      if (var7) {
         var6 = 1 + (var6 << 3);
      } else {
         var6 = 1 + (var1 << 3);
      }

      int var9 = 2;
      int var8 = 6;
      var7 = (byte)62;
      var7 = b[62][var8][2] + var1 / 2 % 4 * gg;
      b(62, var6 + 5, var4);
      if (var2 == -1) {
         h(62, var6 + 4, false);
         i(62, var6 + 5, 2, var7 + -16);
      } else {
         h(62, var6 + 4, true);
         i(62, var6 + 4, 5, var2);
         i(62, var6 + 4, 6, var3);
         var9 = var6 + 4;
         var8 = (byte)62;
         int[] var20 = aj;
         boolean var11 = false;
         var11 = false;
         var7 = var9;
         byte var16 = 62;
         int[] var13 = aj;
         short[] var23;
         short var27 = (var23 = a[var16][var7])[5];
         short var10 = var23[6];
         var8 = var23[7];
         e var28;
         if ((var28 = a[var27]) == null) {
            new StringBuffer().append(" Sprite used for this item is null. gameLayer: ").append(var16).append("; graphItemIdx: ").append(var7);
         } else if (var8 >= 0) {
            var8 &= -1537;
            var28.a(var13, var8, var10, 0, 0, 0);
         } else {
            var28.a(var13, var10, 0, 0, 0);
         }

         a(a(62, var6 + 5, 7)).a(var4);
      }

      if (!i(var5)) {
         h(62, var6 + 7, false);
         i(62, var6 + 3, 5, 48);
         i(62, var6 + 3, 6, 9);
         i(62, var6 + 3, 8, 9);
         i(62, var6 + 3, 7, 10);
         h(62, var6 + 4, false);
         if (var5 == 0) {
            int var10001 = var6 + 5;
            short var14 = 421;
            b(62, var10001, a(421, (int)0));
         } else {
            int var29 = var6 + 5;
            short var15 = 420;
            b(62, var29, a(420, (int)0));
         }
      }

      if (var0 == 8 || var0 == 9) {
         if ((C[var0][var1] & 1) != 0) {
            c(62, var6, false);
            return;
         }

         c(62, var6, true);
      }
   }

   private static void i(int var0, boolean var1) {
      int var2 = var0;
      int[] var6;
      int var3 = (var6 = a(var0))[0];
      var0 = var6[1];
      var3 = w[gc][var3];
      int var4 = 1 + (var0 << 3);
      v(var3, var0);
      j.a("cGame_NewShop.h:1969:newShop_processItemClick() - _iSectionItem:" + var0 + "  _bPreviewOnly:" + var1);
      if ((C[var3][var0] & 1) != 0) {
         g(var3, var0);
         b(true, var3);
      } else if (b[var3][var0][6] == 1) {
         m(23);
      } else if (var1) {
         if (gc == 2 && h(62, var4 + 3)) {
            String var8 = a(var0 + 482 - 1, (int)0);
            String var22 = var8;
            byte var5 = 0;
            a(0, var22, -1, 0);
            boolean var23 = false;
            var5 = 13;
            d(13, 1, false);
         }

         boolean var30 = false;
         b(false, -1);
      } else {
         var2 = var2;
         var1 = var0;
         var0 = var3;
         var3 = b[var0][var1][4];
         if (fV >= var3) {
            int var24 = 0;
            byte var31 = 16;
            d(16, 1, false);
            var24 = var2;
            var2 = var1;
            var1 = var0;
            C[var1][var2] = C[var1][var2] | 1;
            switch (var1) {
               case 3:
                  z(27, -1);
               default:
                  switch (gc) {
                     case 0:
                        z(26, -1);
                     case 1:
                     default:
                        break;
                     case 2:
                        z(28, var2);
                        break;
                     case 3:
                        z(29, 3);
                        break;
                     case 4:
                        z(29, 4);
                  }

                  g(var1, var2);
                  if (var1 == 7) {
                     ap[br] = ap[br] + 5;
                     f(ff + br, ap[br]);
                  }

                  d(true);
                  byte var32 = 1;
                  b(true, -1);
                  var1 = 1 + (var24 << 3);
                  int var18 = a(62, var1, 2);
                  int var14 = a(62, var1, 3);
                  var18 += a(61, 15, 16);
                  var14 += a(61, 15, 17);
                  (c = l.a(15, 200, 1500, var18, var14, 1, 1, -j.c(200), j.c(200), -j.c(200), j.c(200), 0, 0, -1, -1, 8)).a();
                  bl();
                  fV -= var3;
                  o(fk, fV);
                  g(false);
                  boolean var26 = false;
                  var32 = 30;
                  d(30, 1, false);
                  b(true, var0);
            }
         } else {
            short var34 = 268;
            String var10 = a(268, (int)0);
            boolean var27 = false;
            byte var35 = 13;
            d(13, 1, false);
            String var28 = var10;
            boolean var36 = false;
            a(0, var28, -1, 0);
         }
      }

      d(true);
   }

   private static void f(boolean var0) {
      b(var0, -1);
   }

   private static void b(boolean var0, int var1) {
      int var2;
      if (var1 != 3 && var1 != -1) {
         var2 = a(3, false);
      } else {
         var2 = a(3, true);
      }

      int var3;
      if (var1 != 5 && var1 != -1) {
         var3 = a(5, false);
      } else {
         var3 = a(5, true);
      }

      int var4;
      if (var1 != 6 && var1 != -1) {
         var4 = a(6, false);
      } else {
         var4 = a(6, true);
      }

      int var5;
      if (var1 != 4 && var1 != -1) {
         var5 = a(4, false);
      } else {
         var5 = a(4, true);
      }

      int var6;
      if (var1 != 0 && var1 != -1) {
         var6 = a(0, false);
      } else {
         var6 = a(0, true);
      }

      int var7;
      if (var1 != 1 && var1 != -1) {
         var7 = a(1, false);
      } else {
         var7 = a(1, true);
      }

      if (var1 != 2 && var1 != -1) {
         var1 = a(2, false);
      } else {
         var1 = a(2, true);
      }

      int var9 = b[4][var5][2];
      boolean var8 = false;
      if (a[0].b[44] == 0) {
         a[0].a(2, f[0], var9);
         a[0].a(0, f[2], var9);
         a[0].a(1, f[4], var9);
         a[0].a(6, f[12], var9);
         a[0].a(7, f[14], var9);
         a[0].a(8, f[16], var9);
         a[0].a(9, f[18], var9);
         a[0].a(11, f[22], var9);
         a[0].a(10, f[20], var9);
      } else {
         a[0].a(2, f[38], var9);
         a[0].a(0, f[40], var9);
         a[0].a(1, f[42], var9);
         a[0].a(6, f[50], var9);
         a[0].a(7, f[52], var9);
         a[0].a(8, f[54], var9);
         a[0].a(9, f[56], var9);
         a[0].a(11, f[60], var9);
         a[0].a(10, f[58], var9);
      }

      int var10001 = b[3][var2][0];
      int var10002 = b[3][var2][2];
      int var10003 = b[5][var3][0];
      int var10004 = b[4][var5][2];
      int var10005 = b[6][var4][0];
      int var10006 = b[4][var5][2];
      int var10007 = b[0][var6][0];
      int var10008 = b[0][var6][2];
      int var10009 = b[1][var7][0];
      int var10010 = b[1][var7][2];
      int var10011 = b[2][var1][0];
      int var13 = b[2][var1][2];
      int var12 = var10011;
      int var11 = var10010;
      int var10 = var10009;
      var7 = var10008;
      var6 = var10007;
      var5 = var10006;
      var4 = var10005;
      var3 = var10004;
      var2 = var10003;
      var1 = var10002;
      var9 = var10001;
      var8 = false;
      j.a("cGame_NewShop.h:2440:setAvatarParts - _iHatID:" + var6 + "  _iGlassesID:" + var10);
      a[0].a(5, var9, var1);
      a[0].a(4, var2, var3);
      a[0].a(3, var4, var5);
      a[0].a(18, var6, var7);
      a[0].a(17, var10, var11);
      a[0].a(12, var12, var13);
      a[0].a(13, var12, var13);
      a[0].a(14, var12, var13);
      a[0].a(15, var12, var13);
      a[0].a(16, var12, var13);
      a[0].f();
      if (var0) {
         a[0].i();
      }
   }

   private static void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if ((var2 = var4 * var2 / var3) > var4 - 1) {
         var2 = var4 - 1;
      }

      if (var4 > 1) {
         var0 -= 20 * (var4 - 1) / 2;
      } else {
         var0 = var0;
      }

      for (int var9 = 0; var9 < var4; var9++) {
         a[10].a(j.b, var9 == var2 ? 34 : 42, var0, var1, 0);
         var0 += 20;
      }
   }

   private static void bk() {
      int var0 = ft;

      for (int var1 = 0; var1 < C.length; var1++) {
         for (int var2 = 0; var2 < C[var1].length; var2++) {
            f(var0, 0);
            C[var1][var2] = 0;
            var0++;
         }
      }
   }

   private static void bl() {
      int var0 = ft;

      for (int var1 = 0; var1 < C.length; var1++) {
         for (int var2 = 0; var2 < C[var1].length; var2++) {
            f(var0, C[var1][var2] & -7);
            var0++;
         }
      }
   }

   static void g() {
      f[38] = b[bs][1];
      f[39] = b[bs][2];
      f[40] = b[bs][3];
      f[41] = b[bs][4];
      f[44] = b[bs][7];
      f[45] = b[bs][8];
      f[46] = b[bs][9];
      f[47] = b[bs][10];
      f[48] = b[bs][11];
      f[49] = b[bs][12];
      f[62] = b[bs][25];
      f[63] = b[bs][26];
      f[64] = b[bs][27];
      f[65] = b[bs][28];
      f[66] = b[bs][29];
      f[67] = b[bs][30];
      f[68] = b[bs][31];
      f[69] = b[bs][32];
      f[70] = b[bs][33];
      f[71] = b[bs][34];
      f[72] = b[bs][35];
      f[73] = b[bs][36];
      f[74] = b[bs][37];
      f[75] = b[bs][38];
      f[0] = b[bt][1];
      f[1] = b[bt][2];
      f[2] = b[bt][3];
      f[3] = b[bt][4];
      f[6] = b[bt][7];
      f[7] = b[bt][8];
      f[8] = b[bt][9];
      f[9] = b[bt][10];
      f[10] = b[bt][11];
      f[11] = b[bt][12];
      f[24] = b[bt][25];
      f[25] = b[bt][26];
      f[26] = b[bt][27];
      f[27] = b[bt][28];
      f[28] = b[bt][29];
      f[29] = b[bt][30];
      f[30] = b[bt][31];
      f[31] = b[bt][32];
      f[32] = b[bt][33];
      f[33] = b[bt][34];
      f[34] = b[bt][35];
      f[35] = b[bt][36];
      f[36] = b[bt][37];
      f[37] = b[bt][38];
   }

   private static void b(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if ((var2 = var4 * var2 / var3) > var4 - 1) {
         var2 = var4 - 1;
      }

      if (var4 > 1) {
         if (var6) {
            var0 -= 20 * (var4 - 1) / 2;
            var1 = var1;
         } else {
            var0 = var0;
            var1 -= 20 * (var4 - 1) / 2;
         }
      } else {
         var0 = var0;
         var1 = var1;
      }

      for (int var10 = 0; var10 < var4; var10++) {
         a[10].a(j.b, var10 == var2 ? 34 : 42, var0, var1, 0);
         if (var6) {
            var0 += 20;
         } else {
            var1 += 20;
         }
      }
   }

   private static boolean i(int var0) {
      return var0 == 2 || a[0].b[44] == var0;
   }

   private static boolean n(int var0, int var1) {
      return var1 == 2 || var0 == var1;
   }

   private static void bm() {
      int var0 = y();
      b(35, 14, e(gn));
      b(35, 15, e(gm));
      b(35, 17, E() + "/" + 30);
      j.a("cGame_Profile.h:34:totalAmountOfStars = " + 90 + " currentAmmountOfStars " + var0);
      if (fH == 11) {
         b(35, 16, "% " + e(var0 * 100 / 90));
      } else {
         b(35, 16, e(var0 * 100 / 90) + " %");
      }

      b(35, 18, e(go));
   }

   private static int c(boolean var0) {
      var0 = 0;

      for (int var1 = 0; var1 < 6 && h(var1); var1++) {
         for (int var2 = 0; var2 < 5; var2++) {
            if (!m(var1, var2)) {
               return var0;
            }

            var0++;
         }
      }

      return var0;
   }

   private static void w(int var0, int var1) {
      if (var0 == 0) {
         bb();
         al(50);
         a(50, (byte)0);
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               k(5, 1730);
               boolean var8 = false;
               byte var6 = 16;
               d(16, 1, false);
               break;
            case 5:
               j.a("cGame_GUI_Help_SubScreen.h:45:START_GUI_MESSAGE_HANDLER SUBSCREEN");
               k(5, 1);
               boolean var7 = false;
               byte var5 = 14;
               d(14, 1, false);
               break;
            case 6:
               k(5, 1729);
               boolean var2 = false;
               byte var4 = 16;
               d(16, 1, false);
         }
      }

      if (var0 == 1) {
         int var10000 = l(fF);
         boolean var3 = false;
         boolean var9 = false;
         a(var10000, var9, var3, 0);
      }
   }

   private static void a(String var0, boolean var1) {
      if (bh) {
         boolean var2;
         if (!var1 && var0.length() > r.length()) {
            var1 = r.length();
            var2 = true;
         } else {
            var1 = var0.length();
            var2 = false;
         }

         if (var1 <= 0) {
            s = "";
         } else {
            s = "*";
         }

         for (int var3 = 1; var3 < var1; var3++) {
            s = s + "*";
         }

         if (var2) {
            s = s + var0.substring(r.length(), var0.length());
         }
      } else {
         s = var0;
      }

      r = var0;
      if (s.length() < gp) {
         t = s + "_";
      } else {
         t = s;
      }
   }

   private static void au(int var0) {
      int var1 = 5;
      if (gt == 2) {
         i(17, 35, 16, 5);
      } else {
         i(17, 35, 16, 4);
      }

      if (var0 != gs) {
         gs = var0;

         for (int var2 = 0; var2 < c[var0].length; var2++) {
            String var3;
            if ((var3 = c[var0][var2]) == l || var3 == m || var3 == p) {
               a(17, var1, true);
            } else if (var3 == q) {
               a(17, var1, false);
            } else {
               a(17, var1, var3);
               a(17, var1, true);
            }

            var1++;
         }

         bo();
      }
   }

   private static void bn() {
      int var0 = 5;
      short var2 = 0;

      int var1;
      for (var1 = 0; var1 < c[0].length; var1++) {
         if (g(17, var0)) {
            var2 = 1;
            break;
         }

         var0++;
      }

      if (var2) {
         String var5;
         if ((var5 = c[gs][var1]) == m || var5 == p || var5 == " ") {
            i(18, 2, 5, a(17, var0, 15));
            i(18, 2, 6, a(17, var0, 16));
            h(18, 2, true);
            g(18, 1, false);
         } else if (var5 == l) {
            i(18, 2, 6, 3);
            h(18, 2, true);
            g(18, 1, false);
         } else {
            b(18, 1, var5);
            h(18, 2, false);
            g(18, 1, true);
         }

         short var6 = a(17, var0, 2);
         short var3 = a(17, var0, 3);
         var2 = var3;
         var6 = var6;
         byte var4 = 18;
         j(18, var6, var2, 0);
      }
   }

   private static void bo() {
      boolean var0 = s.length() >= gq;
      a(17, 38, var0);
      g(17, 4, !var0);
   }

   private static void bp() {
      bg = false;
      boolean var2 = false;
      boolean var1 = false;
      byte var0 = 9;
      a(9, var1, var2, 0);
      f(9, false);
      g(9, false);
      a(0, 5, true);
   }

   private static int[] b(int var0) {
      ar[0] = -1;
      int var1 = 0;
      var0 = var0;

      for (int var2 = 0; var2 < D.length && var0 >= D[var2][0]; var2++) {
         var0 -= D[var2][0];
         var1++;
      }

      ar[0] = var1;
      ar[1] = var0;
      ar[2] = D[var1][0];
      return ar;
   }

   private static void i(int var0, int var1, int var2) {
      int[] var3;
      (var3 = d[var0])[4] = var1;
      var3[5] = var2;
   }

   private static void x(int var0, int var1) {
      int[] var2;
      (var2 = d[var0])[6] = var1;
      switch (var1) {
         case 1:
            var2[8] = 500;
            byte var7 = 0;
            var7 = 20;
            d(20, 1, false);
            return;
         case 2:
            var2[8] = 300;
            byte var5 = 0;
            var5 = 20;
            d(20, 1, false);
            return;
         case 3:
            var2[8] = 0;
            return;
         case 4:
            var2[8] = 450;
         case 6:
         default:
            return;
         case 5:
            var2[8] = 0;
            return;
         case 7:
            var2[8] = 0;
            byte var3 = 0;
            var3 = 20;
            d(20, 1, false);
            return;
         case 8:
            var2[8] = -j.b(0, 1000);
      }
   }

   private static void bq() {
      j.a(a, 0, 0, c.e_, c.f_);
      a(o.g, a);
      short var0 = a(27, 0, 2);
      short var1 = a(27, 0, 3);
      short var2 = a(27, 0, 5);
      short var3 = a(27, 0, 6);
      j.g(1879048192);
      j.e(a, var0, var1, var2, var3);
   }

   private static void a(int var0, int var1, int var2, int var3, int var4) {
      int[] var5;
      (var5 = e[var0])[2] = var1;
      var5[3] = var2;
      var5[4] = -1;
      var5[5] = -1;
      var5[11] = -1;
      var5[8] = 0;
      var5[6] = 6;
      var5[10] = 0;
      var5[7] = 0;
   }

   private static void j(int var0, int var1, int var2) {
      int[] var3;
      (var3 = e[var0])[4] = var1;
      var3[5] = var2;
      var3[6] = 0;
   }

   private static void br() {
      int var0 = B[0];
      int var1 = B[1];
      var0 *= var1;

      for (int var5 = 0; var5 < var0; var5++) {
         j(var5, -1, -1);
      }

      for (int var6 = 0; var6 < 15; var6++) {
         C[0] = 0;
      }

      for (int var3 = 0; var3 < var0; var3++) {
         var1 = j.b(0, 10);
         int var2 = j.b(1, 5);
         j(var3, var1, var2);
      }
   }

   private static void bs() {
      if (dk < dh && (dl = dl - j.a_) <= 0) {
         e[D[dk]][6] = 1;
         e[D[dk]][8] = 200;
         dl = 100;
         int var0 = e[D[dk]][2] * df + e[D[dk]][3];
         int var1 = f[var0][0];
         var0 = f[var0][1];
         i.a(var1, var0, 10, 188, 11, true, 7, 0, 0, false, -1, -1, false, true, 1, false);
         dk++;
      }

      for (int var5 = 0; var5 < dh; var5++) {
         if (e[D[var5]][8] > 0) {
            e[D[var5]][8] = e[D[var5]][8] - j.a_;
            if (e[D[var5]][8] <= 0) {
               e[D[var5]][6] = 0;
               e[D[var5]][10] = 1;
               int var6 = var5;
               int var2 = (var5 + 1) * B[5];
               var6 = e[D[var6]][2] * df + e[D[var6]][3];
               int var3 = f[var6][0];
               var6 = f[var6][1];
               if (var2 > 0) {
                  a("+ " + var2, 1000, 0, var3, var6, 0, -60, b[1], 1);
               }

               if (dh - 1 == var5) {
                  bu();
                  av(dh);
               }
            }
         }
      }
   }

   private static void av(int var0) {
      int var1 = 0;

      for (int var2 = 1; var2 <= var0; var2++) {
         var1 += var2;
      }

      var1 *= B[5];
      dj += var1;
      b(33, 4, e(dj));
      a("+ " + var1, 1000, 0, a(33, 4, 2) + 50, a(33, 4, 3) - 30, 0, -60, b[0], 1);
   }

   private static void bt() {
      j.a(a, 0, 0, c.e_, c.f_);
      a(o.g, a);
      short var0 = a(33, 0, 2);
      short var1 = a(33, 0, 3);
      short var2 = a(33, 0, 5);
      short var3 = a(33, 0, 6);
      j.g(1879048192);
      j.e(a, var0, var1, var2, var3);
   }

   private static void bu() {
      dg = 2;

      int var0;
      for (int var3 = (var0 = de * df) - 1; var3 >= 0; var3--) {
         if (e[var3][10] == 1) {
            int var1 = var3 - df;

            for (boolean var2 = false; var1 >= 0 && !var2; var1 -= df) {
               if (e[var1][10] == 0) {
                  j(var3, e[var1][4], e[var1][5]);
                  e[var1][10] = 1;
                  e[var3][10] = 0;
                  e[var3][9] = 0;
                  e[var3][7] = 0;
                  e[var3][6] = 2;
                  e[var3][11] = f[e[var1][2] * df + e[var1][3]][1];
                  e[var3][8] = 200;
                  var2 = true;
               }
            }
         }
      }

      bw();
   }

   private static void bv() {
      int var0;
      for (int var1 = (var0 = de * df) - 1; var1 >= 0; var1--) {
         if (e[var1][8] > 0) {
            e[var1][8] = e[var1][8] - j.a_;
            if (e[var1][8] <= 0) {
               e[var1][6] = 0;
               bw();
            }
         }
      }
   }

   private static void bw() {
      for (int var0 = de * df - 1; var0 >= 0; var0--) {
         if (e[var0][6] == 2) {
            return;
         }
      }

      dg = 3;
      dk = 0;
      dl = 100;
      by();

      for (int var4 = 0; var4 < de * df; var4++) {
         e[var4][8] = 0;
         if (e[var4][10] == 1) {
            int var1 = var4;
            int var2 = j.b(0, 10);
            int var3 = j.b(1, 5);
            j(var1, var2, var3);
            e[var4][10] = 0;
            e[var4][6] = 4;
            D[dh] = var4;
            dh++;
         }
      }
   }

   private static void bx() {
      if (dk < dh && (dl = dl - j.a_) <= 0) {
         e[D[dk]][6] = 3;
         e[D[dk]][8] = 200;
         dl = 100;
         dk++;
      }

      for (int var0 = 0; var0 < dh; var0++) {
         if (e[D[var0]][8] > 0) {
            e[D[var0]][8] = e[D[var0]][8] - j.a_;
            if (e[D[var0]][8] <= 0) {
               e[D[var0]][6] = 0;
               if (dh - 1 == var0) {
                  dg = 0;
                  by();

                  for (int var1 = 0; var1 < de * df; var1++) {
                     e[var1][6] = 0;
                  }
               }
            }
         }
      }
   }

   private static void by() {
      int var0 = de * df;

      for (int var1 = 0; var1 < var0; var1++) {
         D[var1] = -1;
         e[var1][7] = 0;
         e[var1][9] = 0;
      }

      dh = 0;
   }

   private static void bz() {
      for (int var0 = 0; var0 < dh - 1; var0++) {
         int var1 = e[D[var0]][2] * df + e[D[var0]][3];
         int var2 = e[D[var0 + 1]][2] * df + e[D[var0 + 1]][3];
         int var3 = f[var1][0];
         int var4 = f[var2][0];
         var1 = f[var1][1];
         var2 = f[var2][1];
         byte var13 = 100;
         int var7 = var2;
         int var6 = var4;
         int var5 = var1;
         var4 = var3;
         byte var14 = 10;
         Graphics var15 = j.b;
         int var8 = j.e(var6 - var4);
         int var9 = j.e(var7 - var5);
         j.a(var15, 100);

         for (int var10 = -5; var10 < 5; var10++) {
            if (var8 > var9) {
               j.b(var15, var4, var5 + var10, var6, var7 + var10);
            } else {
               j.b(var15, var4 + var10, var5, var6 + var10, var7);
            }
         }

         if (var0 > 0) {
            j.a(j.b, 100);
            j.a(j.b, var3 - 5, var1 - 5, 10, 10, 0, 360);
         }
      }
   }

   private static void k(int var0, int var1, int var2) {
      int[] var3;
      (var3 = g[var0])[4] = var1;
      var3[5] = var2;
   }

   private static void l(int var0, int var1, int var2) {
      int[] var3;
      (var3 = h[var0])[4] = var1;
      var3[5] = var2;
      var3[0] = a(56, 2, 2) + a(56, 2, 5) / 2;
      var3[1] = a(56, 2, 3) + a(56, 2, 6) / 2;
   }

   private static void y(int var0, int var1) {
      int[] var2;
      (var2 = g[var0])[6] = var1;
      switch (var1) {
         case 1:
            var2[8] = 500;
            return;
         case 2:
            var2[8] = 300;
            var2[0] = a(56, 2, 2) + a(56, 2, 5) / 2;
            var2[1] = a(56, 2, 3) + a(56, 2, 6) / 2;
            j.a("cGame_Minigame_Stack_Card.h:111:STACK_CARD_STATE.UNCOVERING_HINT");
            byte var5 = 0;
            var5 = 20;
            d(20, 1, false);
            return;
         case 3:
            var2[9] = var2[0];
            var2[10] = var2[1];
            var2[0] = a(56, 2, 2) + a(56, 2, 5) / 2;
            var2[1] = a(56, 2, 3) + a(56, 2, 6) / 2;
            var2[8] = 0;
            return;
         case 4:
            var2[8] = 450;
         case 6:
         default:
            return;
         case 5:
            var2[8] = 0;
            return;
         case 7:
            var2[8] = 0;
            j.a("cGame_Minigame_Stack_Card.h:119:STACK_CARD_STATE.COVERING");
            byte var3 = 0;
            var3 = 20;
            d(20, 1, false);
            return;
         case 8:
            var2[8] = -j.b(0, 1000);
      }
   }

   private static void bA() {
      if (!M) {
         short var0 = 318;
         String var10001 = a(318, (int)0);
         byte var2 = 20;
         String var1 = var10001;
         boolean var4 = false;
         a(0, var1, var2, 0);
      }

      j.a(a, 0, 0, c.e_, c.f_);
      a(o.g, a);
      short var5 = a(56, 0, 2);
      short var6 = a(56, 0, 3);
      short var7 = a(56, 0, 5);
      short var3 = a(56, 0, 6);
      j.g(1879048192);
      j.e(a, var5, var6, var7, var3);
   }

   private static boolean j(int var0) {
      int[] var1;
      return (var1 = g[var0])[6] == 3;
   }

   private static void aw(int var0) {
      int[] var8;
      int var1 = (var8 = g[var0])[6];
      int var4 = 100;
      int var5 = 0;
      int var2 = 1;
      int var6 = 0;
      int var7 = 0;
      if (var1 != 9) {
         switch (var1) {
            case 0:
               var2 = 0;
               var5 = var8[7] == 1;
               break;
            case 1:
            case 7:
               if ((var1 = var8[8]) >= 250) {
                  var2 = 0;
                  var4 = (var1 - 250) * 100 / 250;
               } else {
                  var2 = 1;
                  var4 = (250 - var1) * 100 / 250;
               }
               break;
            case 2:
               var1 = var8[8];
               var2 = 1;
               var4 = (300 - var1) * 100 / 300;
               break;
            case 3:
               var2 = 1;
               var5 = 0;
               var1 = D();
               if (var8[8] >= var1) {
                  var6 = 500;
                  var7 = 500;
               } else {
                  var6 = (var8[9] - var8[0]) * (var1 - var8[8]) / var1;
                  var7 = (var8[10] - var8[1]) * (var1 - var8[8]) / var1;
               }
               break;
            case 4:
               var2 = 1;
               var5 = 0;
               var6 = j.b(-4, 4);
               var7 = j.b(-4, 4);
               break;
            case 5:
            case 6:
               var2 = 1;
               e var10 = a[56];
               int[] var3 = new int[4];
               var5 = 15 + var8[4];
               var10.a(var3, var5, var8[0], var8[1], 0);
               if (!d(var3[0], var3[1], var3[2], var3[3]) && !a(var3[0], var3[1], var3[2], var3[3]) && !c(var3[0], var3[1], var3[2], var3[3])) {
                  var5 = 0;
               } else {
                  var5 = 1;
               }
               break;
            case 8:
               if ((var1 = var8[8]) < 0) {
                  var1 = 0;
               }

               var2 = 0;
               var4 = var1 * 100 / 300;
         }

         if (var4 != 100) {
            j.h(13);
            j.a(13, 1, var4);
            j.a(13, 3, 100);
            j.a(13, 4, 100);
         }

         if (var2) {
            e var16 = a[56];
            var1 = 15 + var8[4];
            var2 = var8[5] - 1;
            var16.e(var2);
            var16.a(j.b, var1, var8[0] + var6, var8[1] + var7, 0);
            if (var5 && var8[7] == 1) {
               a[70].a(j.b, 3, var8[0] + var6, var8[1] + var7, 0);
            }
         } else {
            e var17;
            (var17 = a[55]).e(b);
            var17.a(j.b, 24, var8[0] + var6, var8[1] + var7, 0);
            if (var5 && var8[7] == 1) {
               a[70].a(j.b, 3, var8[0] + var6, var8[1] + var7, 0);
            }
         }

         if (var4 != 100) {
            j.i(13);
         }
      }
   }

   private static int D() {
      int[] var1 = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1};
      int var0 = 650 - dw * 5;

      for (int var2 = 0; var2 < dw; var2++) {
         var0 += var1[var2 / 5];
      }

      return var0;
   }

   private static boolean a(String var0, int var1, int var2, int var3, int var4, int var5, int var6, e var7, int var8) {
      for (int var9 = 0; var9 < 30; var9++) {
         if (as[var9] <= 0) {
            g[var9] = var0;
            as[var9] = var1;
            at[var9] = 0;
            au[var9] = j.c(var3);
            av[var9] = j.c(var4);
            aw[var9] = 0;
            ax[var9] = -60;
            c[var9] = var7;
            ay[var9] = var8;
            return true;
         }
      }

      j.a("WARNING: No Space for a new Floating Combo Point Text. Increase FLOATING_TEXT_CONF.MAX_DATA");
      return false;
   }

   private static void bB() {
      j.a("Initializating Floating Combo Points");

      for (int var0 = 0; var0 < 30; var0++) {
         as[var0] = 0;
      }
   }

   private static void ax(int var0) {
      aA[gw] = var0;
      gw++;
   }

   private static void bC() {
      bD();
      gx = 0;
      gy = 0;
      gz = 0;
      gA = 0;
      gB = 0;
      gC = 0;
      gD = 0;
      gE = 0;
      gF = 0;
      gG = 0;
      gH = 0;
      gI = 0;
      gJ = 0;
      gK = 0;
      gL = 0;
      gM = 0;
      gN = 0;
      gO = 0;
      gP = 0;
      gQ = 0;
      gR = 0;
      gS = 0;
      gT = 0;
      gU = 0;
      gw = 0;

      for (int var0 = 0; var0 < aA.length; var0++) {
         aA[var0] = -1;
      }

      bF();
   }

   private static void bD() {
      j.b("/6");
      E = (int[][])j.a(25);
      F = (int[][])j.a(26);
      E = a(E);
      F = a(F);
      j.l();
   }

   private static void z(int var0, int var1) {
      j.a("cGame_AchievementMgr.h:253:Checking achievement " + var0 + ":" + var1);
      switch (var0) {
         case 0:
            j.a("cGame_AchievementMgr.h:260:isVenueUnlocked(1):" + h(1));
            if (y() >= q[1][0] || h(1)) {
               ay(var0);
            }
            break;
         case 1:
            j.a("cGame_AchievementMgr.h:271:isVenueUnlocked(2):" + h(2));
            if (y() >= q[2][0] || h(2)) {
               ay(var0);
            }
            break;
         case 2:
            if (y() >= q[3][0] || h(3)) {
               ay(var0);
            }
            break;
         case 3:
            if (y() >= q[4][0] || h(4)) {
               ay(var0);
            }
            break;
         case 4:
            if (y() >= q[5][0] || h(5)) {
               ay(var0);
            }
            break;
         case 5:
            ay(var0);
            break;
         case 6:
            ay(var0);
            break;
         case 7:
            ay(var0);
            break;
         case 8:
            ay(var0);
            break;
         case 9:
            ay(var0);
            break;
         case 10:
            ay(var0);
            break;
         case 11:
            ay(var0);
            break;
         case 12:
            if (var1 >= F[0][0]) {
               ay(var0);
            }
            break;
         case 13:
            if (var1 >= F[1][0]) {
               ay(var0);
            }
            break;
         case 14:
            if (var1 >= F[2][0]) {
               ay(var0);
            }
            break;
         case 15:
            if (var1 >= F[3][0]) {
               ay(var0);
            }
            break;
         case 16:
            if (var1 >= F[4][0]) {
               ay(var0);
            }
            break;
         case 17:
            if (var1 >= F[5][0]) {
               ay(var0);
            }
            break;
         case 18:
            if (var1 >= F[6][0]) {
               ay(var0);
            }
            break;
         case 19:
            if (var1 >= F[7][0]) {
               ay(var0);
            }
            break;
         case 20:
            if (var1 >= F[11][0]) {
               ay(var0);
            }
            break;
         case 21:
            if (var1 >= F[12][0]) {
               ay(var0);
            }
            break;
         case 22:
            if (var1 >= F[13][0]) {
               ay(var0);
            }
            break;
         case 23:
            if (var1 >= F[14][0]) {
               ay(var0);
            }
            break;
         case 24:
            if (var1 >= F[15][0]) {
               ay(var0);
            }
            break;
         case 25:
            if (var1 >= F[16][0]) {
               ay(var0);
            }
            break;
         case 26:
            if (gK < F[20][0] && ++gK >= F[20][0]) {
               ay(var0);
            }
            break;
         case 27:
            if (gU < F[21][0] && ++gU >= F[21][0]) {
               ay(var0);
            }
            break;
         case 28:
            if (gM == 0 || gN == 0 || gO == 0 || gP == 0 || gQ == 0) {
               switch (var1) {
                  case 1:
                     gM = 1;
                     break;
                  case 2:
                     gN = 1;
                     break;
                  case 3:
                     gO = 1;
                     break;
                  case 4:
                     gP = 1;
                     break;
                  case 5:
                     gQ = 1;
               }

               if (gM == 1 && gN == 1 && gO == 1 && gP == 1 && gQ == 1) {
                  ay(var0);
               }
            }
            break;
         case 29:
            if (gR < F[23][0]) {
               if (var1 == 3) {
                  gR |= 2;
               }

               if (var1 == 4) {
                  gR |= 1;
               }

               if ((gR & 2) != 0 && (gR & 1) != 0) {
                  ay(var0);
               }
            }
            break;
         case 30:
            if (gT <= F[24][0] && gT >= F[24][0]) {
               ay(var0);
            }
            break;
         case 31:
            if (gT <= F[25][0] && gT >= F[25][0]) {
               ay(var0);
            }
            break;
         case 32:
            if (gT <= F[26][0] && gT >= F[26][0]) {
               ay(var0);
            }
            break;
         default:
            new StringBuffer().append(" Unknown type ").append(var0);
      }

      bF();
   }

   private static boolean k(int var0) {
      new StringBuffer().append(" param error iAchievType ").append(var0);
      int var1;
      if (var0 > 31) {
         var1 = gy;
         var0 = 1 << var0 - 31;
      } else {
         var1 = gx;
         var0 = 1 << var0;
      }

      return (var1 & var0) != 0;
   }

   private static void bE() {
      if (gw > 0) {
         m(48);
      }
   }

   private static void ay(int var0) {
      new StringBuffer().append(" param error iAchievType ").append(var0);
      int var1;
      int var2;
      if (var0 > 31) {
         var1 = gy;
         var2 = 1 << var0 - 31;
      } else {
         var1 = gx;
         var2 = 1 << var0;
      }

      var1 |= var2;
      if (var0 > 31) {
         if (var1 != gy) {
            ax(var0);
         }
      } else if (var1 != gx) {
         ax(var0);
      }

      if (var0 > 31) {
         gy = var1;
      } else {
         gx = var1;
      }
   }

   private static void bF() {
      gV++;
   }

   private static void bG() {
      int var1 = 0;
      bD();
      String var0 = "ACHIEVEMENTS";
      byte[] var3;
      if ((var3 = j.a("ACHIEVEMENTS")) == null) {
         bC();
      } else {
         var1 += 4;
         gx = j.a(var3, 4);
         var1 += 4;
         gy = j.a(var3, 8);
         var1 += 4;
         gz = j.a(var3, 12);
         var1 += 4;
         gA = j.a(var3, 16);
         var1 += 4;
         gB = j.a(var3, 20);
         var1 += 4;
         gC = j.a(var3, 24);
         var1 += 4;
         gD = j.a(var3, 28);
         var1 += 4;
         gE = j.a(var3, 32);
         var1 += 4;
         gF = j.a(var3, 36);
         var1 += 4;
         gG = j.a(var3, 40);
         var1 += 4;
         gH = j.a(var3, 44);
         var1 += 4;
         gI = j.a(var3, 48);
         var1 += 4;
         gJ = j.a(var3, 52);
         var1 += 4;
         gK = j.a(var3, 56);
         var1 += 4;
         gL = j.a(var3, 60);
         var1 += 4;
         gM = j.a(var3, 64);
         var1 += 4;
         gN = j.a(var3, 68);
         var1 += 4;
         gO = j.a(var3, 72);
         var1 += 4;
         gP = j.a(var3, 76);
         var1 += 4;
         gQ = j.a(var3, 80);
         var1 += 4;
         gR = j.a(var3, 84);
         var1 += 4;
         gS = j.a(var3, 88);
         var1 += 4;
         gT = j.a(var3, 92);
         var1 += 4;
         gw = j.a(var3, 96);
         var1 += 4;
         gU = j.a(var3, 100);
         var1 += 4;

         for (int var2 = 0; var2 < aA.length; var2++) {
            aA[var2] = j.a(var3, var1);
            var1 += 4;
         }
      }
   }

   private static int E() {
      int var0 = 0;

      for (int var1 = 0; var1 < 30; var1++) {
         if (k(var1)) {
            var0++;
         }
      }

      return var0;
   }

   private static void bH() {
      ak();
      c(false);
      al(19);
      int var1 = 0;
      int var0 = 1;
      int var10 = 19;
      a(19, (boolean)var0, (boolean)var1, 0);
      k = new boolean[30];

      for (int var11 = 0; var11 < 30; var11++) {
         k[var11] = k(var11);
      }

      d(59, 1, 60);
      var0 = k.length;
      ag(60);
      b(aj, 60, gW + 2);
      var1 = aj[0];
      int var2 = aj[1];
      int var3 = aj[3] - var2 + 1;
      j.a("cGame_Achievements.h:72:iItemLeftY:" + var2 + "  iItemHeight:" + var3);
      c(aj, 60, 0);
      int var4 = aj[3] - var2;
      var1 = aj[2] - var1;
      var10 = (byte)60;
      int var5 = a[var10].length;
      var10 = (byte)60;
      s(60, a[var10].length + 5 * (var0 - 1));
      var2 -= a(59, 1, 3);
      int var6 = 0;
      int var7 = 0;
      var3 = var2 * 2 + var3;

      for (int var8 = 0; var8 < var0; var8++) {
         boolean var9 = false;
         if (var8 > 0) {
            for (int var27 = 0; var27 < 5; var27++) {
               f(60, gW + var27, var5);
               short var18 = a(60, gW + var27, 3);
               i(60, var5, 3, var18 + var6);
               var18 = a(60, gW + var27, 2);
               i(60, var5, 2, var18 + var7);
               var5++;
            }
         }

         b(60, 4 + var8 * 5, a(var10 = var8 + 437, (int)0));
         b(60, 5 + var8 * 5, a(var10 = var8 + 476, (int)0));
         if (!var9) {
            var3 += var4;
            var6 += var4;
            var7 = 0;
         } else {
            var7 += var1;
         }
      }

      var3 -= var4;
      short var23 = a(59, 1, 6);
      int var24 = var3 - var23;
      a(59, 1, 0, -var24, 0, 0);
      j.a("cGame_Achievements.h:144:iScrollAreaHeight:" + var24 + "  iItemDistanceY:" + var4);
      i(59, 1, 17, 0);

      for (int var30 = 0; var30 < var0; var30++) {
         var1 = var30;
         var2 = gW + var1 * 5;
         i(60, var2 + 2, 5, 47);
         i(60, var2 + 1, 5, 47);
         i(60, var2 + 1, 6, k[var1] ? 44 : 45);
         i(60, var2 + 2, 6, az[var1]);
      }

      eD = a(59, 1, 6);
      eE = a(60, 0, 6);
      eB = (ex = a[10].c(34)) << 1;
      var0 = (eA = eD / (ex + eB)) * (ex + eB) - eB;
      ez = (eD - var0) / 2 + a(59, 4, 3);
      ey = a(59, 4, 2);
      eC = k.length / eA - 2;
      az(2);
   }

   private static void az(int var0) {
      gX = var0;
      al(8);
      boolean var3 = false;
      boolean var2 = true;
      byte var1 = 8;
      a(8, var2, var3, 0);
      if ((var0 & 1) != 0) {
         a(0, 2, true);
      }

      if ((var0 & 2) != 0) {
         a(0, 5, true);
      }

      if ((var0 & 4) != 0) {
         a(0, 1, true);
      }

      if ((var0 & 8) != 0) {
         a(0, 4, true);
      }

      if ((var0 & 16) != 0) {
         a(0, 0, true);
      }

      if ((var0 & 32) != 0) {
         a(0, 3, true);
      }

      if ((var0 & 64) != 0) {
         a(0, 6, true);
      }

      if ((var0 & 128) != 0) {
         a(0, 7, true);
      }

      a(0, 8, bj);
   }

   private static int F() {
      return gX;
   }

   private static void bI() {
      g(false);
   }

   private static void g(boolean var0) {
      int var1;
      if (var0) {
         var0 = ga;
         var1 = gb;
      } else {
         var0 = fV;
         var1 = fW;
      }

      b(14, 14, e(var0));
      int[] var3;
      gY = (var3 = b(var1))[0];
      b(14, 16, e(var3[0] + 1));
      b(14, 15, e(var3[1]) + "/" + var3[2]);
      b(14, 5, e(y()) + "/" + e(90));
      if ((var0 = 23 * var3[1] / var3[2]) > 29) {
         var0 = 29;
      }

      i(14, 1, 6, var0 + 7);
      if (bW == 4) {
         b(14, 6, a(i, a(14, 0, 23), a(14, 8, 5)));
         b(14, 7, " ");
      } else {
         b(14, 7, a(i, a(14, 0, 23), a(14, 9, 5)));
         b(14, 6, " ");
      }

      boolean var5 = bW != 25 && bW != 26 && bW != 42 && bW != 39;
      a(14, 11, var5 && ae);
      var5 = bW != 39;
      c(14, 0, !var5 || !ad);
   }

   private static void bJ() {
      if (aC == null) {
         aC = new int[53];

         for (int var0 = 0; var0 < aC.length; var0++) {
            aC[var0] = -1;
         }

         aC[26] = 4;
         aC[20] = 4;
         aC[8] = 4;
         aC[39] = 4;
         aC[35] = 4;
         aC[12] = 4;
         aC[4] = 4;
         aC[35] = 4;
         aC[21] = 35;
         aC[31] = 4;
         aC[32] = 31;
         aC[40] = 39;
         aC[41] = 39;
         aC[45] = 44;
         aC[49] = 39;
         aC[50] = 39;
         aC[12] = -2;
         aC[0] = -2;
         aC[1] = -2;
         aC[2] = -2;
         aC[3] = -2;
         aC[18] = -2;
         aC[29] = -2;
      }
   }

   private static void bK() {
      j.a("cGame_GUI_Menu_Topbar.h:303:s_game_prev_state = " + bY);
      j.a("cGame_GUI_Menu_Topbar.h:304:s_game_state = " + bW);
      j.a("cGame_GUI_Menu_Topbar.h:305:s_game_next_state = " + bX);
      if (bX == 4 && !l(bW) && !m(bW) && bW != 12 && bW != 48 && bW != 32 && bW != 52 || bX == 4 && bY == 17 || bX == 4 && bY == 42) {
         if (!q) {
            byte var0 = 0;
            var0 = 4;
            d(4, 1, false);
         }

         q = false;
      }

      boolean var2 = bZ == 1;
      if (bW != -1 && aC != null && aC[bW] != -2) {
         if (m(bW)) {
            ha = bW;
            bl = false;
            if (l(bX)) {
               aC[bX] = ha;
               return;
            }
         }

         if (l(bW)) {
            if (var2) {
               bL();
               return;
            }

            gZ = bW;
            bl = true;
         }

         switch (bX) {
            case 4:
            case 21:
            case 29:
            case 31:
            case 35:
               return;
            case 8:
               if (bW == 17) {
                  aC[8] = 17;
                  return;
               }

               if (!bl) {
                  aC[8] = ha;
                  return;
               }

               if (gZ != 8) {
                  aC[8] = gZ;
                  return;
               }
               break;
            case 44:
               if (bW == 8) {
                  aC[44] = 8;
                  return;
               }

               if (bW != 45) {
                  c(1);
                  aC[44] = 17;
                  return;
               }
               break;
            default:
               if (bX >= 0) {
                  if (l(bX)) {
                     if (!l(bX) || !l(bW)) {
                        return;
                     }

                     if (var2) {
                        aC[bW] = ha;
                     } else if (l(bY)) {
                        aC[bW] = ha;
                     } else {
                        if (bY != bX) {
                           aC[bX] = bW == 8 ? ha : bW;
                           aC[bW] = bY;
                           return;
                        }

                        if (aC[bW] == bY) {
                           return;
                        }

                        aC[bW] = ha;
                     }
                  }

                  aC[bX] = bW;
               }
         }
      }
   }

   private static int G() {
      if (bW == 12) {
         if (bl) {
            return 8;
         } else {
            return bY == 45 ? 4 : ha;
         }
      } else if (aC[bW] != -1 && aC[bW] != -2) {
         j.a("cGame_GUI_Menu_Topbar.h:523:return s_navigationBackArray[" + g(bW) + "]: " + g(aC[bW]));
         return aC[bW];
      } else {
         j.a("cGame_GUI_Menu_Topbar.h:518:navigate to last state");
         return bY;
      }
   }

   private static void bL() {
      for (int var0 = 0; var0 < aB.length; var0++) {
         aC[aB[var0]] = ha;
      }
   }

   private static boolean l(int var0) {
      for (int var1 = 0; var1 < aB.length; var1++) {
         if (aB[var1] == var0) {
            return true;
         }
      }

      return false;
   }

   private static boolean m(int var0) {
      return var0 == 21 || var0 == 35 || var0 == 4 || var0 == 36 || var0 == 37 || var0 == 38 || var0 == 42 || var0 == 13 || var0 == 3;
   }

   private static String g(int var0) {
      switch (var0) {
         case 0:
            return "ks_init";
         case 1:
            return "ks_loading";
         case 2:
            return "ks_gameloft_logo";
         case 3:
            return "ks_splash";
         case 4:
            return "ks_menu_main";
         case 5:
            return "ks_menu_single_player";
         case 6:
            return "ks_menu_customization";
         case 7:
            return "ks_menu_tournament";
         case 8:
            return "ks_menu_option";
         case 9:
            return "ks_menu_reward_cups";
         case 10:
            return "ks_menu_multiplay";
         case 11:
            return "ks_menu_statistics";
         case 12:
            return "ks_igp";
         case 13:
            return "ks_gameplay";
         case 14:
            return "ks_carrerMenu";
         case 15:
            return "ks_debriefing";
         case 16:
            return "ks_debriefing_detail";
         case 17:
            return "ks_menu_ingame";
         case 18:
            return "ks_copyRight";
         case 19:
            return "ks_cutscene";
         case 20:
            return "ks_venue_select";
         case 21:
            return "ks_stage_select_compact";
         case 22:
            return "ks_connection";
         case 23:
            return "ks_lottery";
         case 24:
            return "ks_objectives";
         case 25:
            return "ks_shop";
         case 26:
            return "ks_newShop";
         case 27:
            return "ks_online_test";
         case 28:
            return "ks_login_gllive";
         case 29:
            return "ks_connecting";
         case 30:
            return "ks_login_guest";
         case 31:
            return "ks_login_selectaccount";
         case 32:
            return "ks_lobby";
         case 33:
            return "ks_tally";
         case 34:
            return "ks_levelup";
         case 35:
            return "ks_venue_select_slide";
         case 36:
            return "ks_minigame_memory";
         case 37:
            return "ks_minigame_connect";
         case 38:
            return "ks_minigame_stack";
         case 39:
            return "ks_profile";
         case 40:
            return "ks_online_ranking";
         case 41:
            return "ks_update_leaderboard";
         case 42:
            return "ks_debriefing_tally";
         case 43:
            return "ks_battleBanner";
         case 44:
            return "ks_help";
         case 45:
            return "ks_help_subScreen";
         case 46:
         default:
            return "------------------------------UNKNOWN STATE: " + var0;
         case 47:
            return "ks_cheat";
         case 48:
            return "ks_achievement_complete";
         case 49:
            return "ks_enter_name";
         case 50:
            return "ks_achievements";
         case 51:
            return "ks_language_selection";
         case 52:
            return "ks_hotseat_menu";
      }
   }

   private static void A(int var0, int var1) {
      if (var0 == 0) {
         aV();
         hc = 2;
         hd = 4;
         var1 = o.g * 5 + bq;
         int var4 = fj + var1;
         if (i(s, var4) > 0 || o.g != 0) {
            hc = z[0];
            hd = z[1];
         }
      }

      if (var0 == 4) {
         a[0].d();
         h(27, 6, true);
         b(27, 6, 0, 0);
         h(27, 6, false);
         var1 = hc * hd;

         for (int var2 = 0; var2 < var1; var2++) {
            var0 = var2;
            int[] var3;
            int var19 = (var3 = d[var0])[6];
            int var7 = 100;
            boolean var8 = false;
            boolean var12 = true;
            int var9 = 0;
            int var10 = 0;
            switch (var19) {
               case 0:
                  var12 = false;
                  var8 = var3[7] == 1;
                  break;
               case 1:
               case 7:
                  if ((var19 = var3[8]) >= 250) {
                     var12 = false;
                     var7 = (var19 - 250) * 100 / 250;
                  } else {
                     var12 = true;
                     var7 = (250 - var19) * 100 / 250;
                  }
                  break;
               case 2:
                  var19 = var3[8];
                  var12 = true;
                  var7 = (300 - var19) * 100 / 300;
                  break;
               case 3:
               case 5:
               case 6:
                  var12 = true;
                  var8 = false;
                  break;
               case 4:
                  var12 = true;
                  var8 = false;
                  var9 = j.b(-4, 4);
                  var10 = j.b(-4, 4);
                  break;
               case 8:
                  if ((var19 = var3[8]) < 0) {
                     var19 = 0;
                  }

                  var12 = false;
                  var7 = var19 * 100 / 300;
            }

            if (var7 != 100) {
               j.h(13);
               j.a(13, 1, var7);
               j.a(13, 3, 100);
               j.a(13, 4, 100);
            }

            if (var12) {
               e var6 = a[56];
               var19 = 15 + var3[4];
               int var5 = var3[5] - 1;
               var6.e(var5);
               var6.a(j.b, var19, var3[0] + var9, var3[1] + var10, 0);
            } else {
               e var34;
               (var34 = a[55]).e(b);
               var34.a(j.b, 24, var3[0] + var9, var3[1] + var10, 0);
               if (var8 && var3[7] == 1) {
                  a[70].a(j.b, 3, var3[0] + var9, var3[1] + var10, 0);
               }
            }

            if (var7 != 100) {
               j.i(13);
            }
         }

         for (int var16 = 0; var16 < 2; var16++) {
            l var24;
            if (c[var16] != null && (var24 = c[var16]).a > 0) {
               c[var16].a(j.b, a[69], 1, 0, 0, false);
            }

            if (c[var16] != null && c[var16].a() >= 0) {
               c[var16].c();
               c[var16].b(j.a_);
            }
         }

         he = -1;

         for (int var17 = 0; var17 < var1; var17++) {
            var0 = var17;
            int[] var18;
            switch ((var18 = d[var0])[6]) {
               case 3:
                  if (var18[8] > 1050) {
                     break;
                  }

                  e var39 = b[0];
                  int var28 = 281;
                  var39.a(a(281, (int)0));
                  var28 = e.a();
                  int var33 = var18[8] * 30 / 1050;
                  b[0].e(0);
                  int var36 = 0;
                  byte var37 = 0;
                  if (var18[0] - var28 <= 0) {
                     var36 = (var28 >> 1) + 2;
                  } else if (var18[0] + (var28 >> 1) >= c.e_) {
                     var36 = 0 - ((var28 >> 1) + 2);
                  }

                  if (H) {
                     for (int var38 = 0; var38 < 2; var38++) {
                        if (var0 == y[var38]) {
                           short var31 = 281;
                           a(0, a(281, (int)0), var18[0] + var36, var18[1] - var33 + A[var38] + var37, 3, 0);
                        }

                        var37 += 15;
                     }
                     break;
                  }

                  short var30 = 281;
                  a(0, a(281, (int)0), var18[0] + var36, var18[1] - var33, 3, 0);
                  break;
               case 5:
                  e var10000 = b[0];
                  int var25 = 321;
                  var10000.a(a(321, (int)0));
                  var25 = e.a();
                  int var32 = cX / 4 + var18[8] * 30 / 1500;
                  b[0].e(0);
                  int var35 = 0;
                  if (var18[0] - (var25 >> 1) <= 0) {
                     var35 = (var25 >> 1) + 2;
                  } else if (var18[0] + (var25 >> 1) >= c.e_) {
                     var35 = 0 - (var25 >> 1);
                  }

                  short var27 = 321;
                  a(1, a(321, (int)0), var18[0] + var35, var18[1] - var32 + (he == -1 ? 0 : 15), 3, 0);
                  he = var0;
            }
         }
      }
   }

   private static void B(int var0, int var1) {
      if (var0 == 0) {
         aV();
      }

      if (var0 == 5) {
         switch (var1) {
            case 3:
               j.a("cGame_GUI_Minigame_Stack.h:19:k_MatchScore_Button_Details PRESSED!");
               int var2 = H[0];
               int var3 = H[1];
               int var4 = var2 * var3;
               var1 = 0;

               boolean var10000;
               while (true) {
                  if (var1 >= var4) {
                     var10000 = true;
                     break;
                  }

                  int[] var13;
                  if ((var13 = g[var1])[6] == 3) {
                     var10000 = false;
                     break;
                  }

                  var1++;
               }

               if (var10000) {
                  k(5, 1271);
               }
         }
      }

      if (var0 == 4) {
         var0 = H[0];
         var1 = H[1];
         var0 *= var1;
         e var21 = a[56];
         int var14 = 15 + F[4];
         int var19 = F[5] - 1;
         var21.e(var19);
         var21.a(j.b, var14, F[0], F[1], 0);

         for (int var9 = 0; var9 < var0; var9++) {
            if (!j(var9)) {
               aw(var9);
            }
         }

         for (int var10 = 0; var10 < var0; var10++) {
            if (j(var10)) {
               aw(var10);
            }
         }

         for (int var11 = 0; var11 < 2; var11++) {
            l var22;
            if (d[var11] != null && (var22 = d[var11]).a > 0) {
               d[var11].a(j.b, a[69], 1, 0, 0, false);
            }

            if (d[var11] != null && d[var11].a() >= 0) {
               d[var11].c();
               d[var11].b(j.a_);
            }
         }

         for (int var12 = 0; var12 < var0; var12++) {
            var14 = var12;
            int[] var20;
            switch ((var20 = g[var14])[6]) {
               case 3:
                  var14 = D();
                  if (var20[8] < var14) {
                     var14 = var20[8] * 30 / var14;
                     b[0].e(0);
                     short var24 = 281;
                     a(0, a(281, (int)0), var20[0], var20[1] - var14, 3, 0);
                  }
                  break;
               case 5:
                  var14 = dr / 4 + var20[8] * 30 / 1500;
                  b[0].e(0);
                  short var23 = 321;
                  a(1, a(321, (int)0), var20[0], var20[1] - var14, 3, 0);
            }
         }
      }
   }

   private static void bM() {
      if (hh == 0 && hi == 0) {
         f(34, 2, true);
         f(34, 3, false);
         f(34, 6, false);
         f(34, 4, true);
         f(34, 5, false);
      } else if (hh == 0 && hi == 2) {
         f(34, 2, true);
         f(34, 3, false);
         f(34, 6, false);
         f(34, 4, false);
         f(34, 5, true);
      } else if (hh == 0 && hi == 1) {
         f(34, 2, true);
         f(34, 3, false);
         f(34, 6, true);
         f(34, 4, false);
         f(34, 5, false);
      } else if (hh == 1 && hi == 0) {
         f(34, 2, false);
         f(34, 3, true);
         f(34, 6, false);
         f(34, 4, true);
         f(34, 5, false);
      } else if (hh == 1 && hi == 2) {
         f(34, 2, false);
         f(34, 3, true);
         f(34, 6, false);
         f(34, 4, false);
         f(34, 5, true);
      } else {
         if (hh == 1 && hi == 1) {
            f(34, 2, false);
            f(34, 3, true);
            f(34, 6, true);
            f(34, 4, false);
            f(34, 5, false);
         }
      }
   }

   private static void aA(int var0) {
      switch (var0) {
         case 0:
            h.a(w, "2", "10", true, null);
            return;
         case 1:
            h.a(u, "2", "10", true, null);
            return;
         case 2:
            h.a(v, "2", "10", true, null);
            return;
         case 3:
            h.a(w, "0", "10", false, null);
            return;
         case 4:
            h.a(u, "0", "10", false, null);
            return;
         case 5:
            h.a(v, "0", "10", false, null);
      }
   }

   private static void aB(int var0) {
      switch (var0) {
         case 2:
            hh = 0;
            break;
         case 3:
            hh = 1;
            break;
         case 4:
            hi = 0;
            break;
         case 5:
            hi = 2;
            break;
         case 6:
            hi = 1;
      }

      byte var1 = 0;
      var1 = 16;
      d(16, 1, false);
      if (hh == 0 && hi == 0) {
         aA(0);
      } else if (hh == 0 && hi == 2) {
         aA(2);
      } else if (hh == 0 && hi == 1) {
         aA(1);
      } else if (hh == 1 && hi == 0) {
         aA(3);
      } else if (hh == 1 && hi == 2) {
         aA(5);
      } else {
         if (hh == 1 && hi == 1) {
            aA(4);
         }
      }
   }

   private static void C(int var0, int var1) {
      if (var0 == 0) {
         aV();
         b(33, 4, e(dj));
         b(33, 3, f(di));
      }

      if (var0 == 2) {
         b(33, 3, f(di));
      }

      if (var0 == 4) {
         var0 = B[0];
         var1 = B[1];
         var0 *= var1;

         for (int var15 = 0; var15 < var0; var15++) {
            int var2 = var15;
            int[] var3 = e[var2];
            int var7 = 100;
            if (var3[10] == 0 && var3[6] != 4) {
               if (var3[6] == 1) {
                  int var5;
                  var7 = (var5 = var3[8]) * 100 / 200;
               }

               if (var3[6] == 3) {
                  int var21 = var3[8];
                  var7 = 100 - var21 * 100 / 200;
               }

               if (var7 != 100) {
                  j.h(13);
                  j.a(13, 1, var7);
                  j.a(13, 3, 100);
                  j.a(13, 4, 100);
               }

               e var6 = a[56];
               int var4 = 15 + var3[4];
               int var22 = var3[5] - 1;
               var6.e(var22);
               int[] var23 = f[var3[2] * df + var3[3]];
               if (var3[6] == 2) {
                  int var8 = e[var2][11];
                  int var9 = var23[1];
                  var2 = e[var2][8];
                  var2 = var9 - (var9 - var8) * var2 / 200;
                  var6.a(j.b, var4, var23[0], var2, 0);
               } else {
                  var6.a(j.b, var4, var23[0], var23[1], 0);
                  if (var3[7] == 1) {
                     a[70].a(j.b, 3, var23[0], var23[1], 0);
                  }
               }

               if (var7 != 100) {
                  j.i(13);
               }
            }
         }

         Graphics var18 = j.b;
         boolean var20 = false;
         int var12 = 0;
         Graphics var19 = j.b;

         for (int var25 = 0; var25 < 30; var25++) {
            if (as[var25] > 0 && at[var25] <= 0) {
               e var26 = c[var25];
               var12 = j.d(au[var25]);
               int var24 = j.d(av[var25]);
               int var27 = var26.f();
               int var28 = ay[var25];
               var26.e(var28);
               var26.a(var19, g[var25], var12, var24, 1);
               var26.e(var27);
            }
         }
      }
   }

   private static void D(int var0, int var1) {
      if (!bc) {
         byte var2 = 0;
         var2 = 11;
         d(11, 1, false);
         switch (var0) {
            case 0:
               bm = true;
               hj = var1;
               hn = 2000;
               return;
            case 1:
               bp = true;
               hm = var1;
               hq = 2000;
               return;
            case 2:
               bn = true;
               hk = var1;
               ho = 2000;
               return;
            case 3:
               bo = true;
               hl = var1;
               hp = 2000;
         }
      }
   }

   private static void bN() {
      bm = false;
   }

   private static void bO() {
      bn = false;
   }

   private static void bP() {
      bo = false;
   }

   private static void bQ() {
      bp = false;
   }

   static void h() {
      bm = false;
      bo = false;
      bp = false;
      bn = false;
   }

   private static void E(int var0, int var1) {
      if (var0 == 2) {
         switch (k(6)) {
            case 0:
               if ((ht = ht + j.a_) >= hs) {
                  boolean var10 = true;
                  boolean var8 = false;
                  byte var6 = 6;
                  a(6, var8, var10, 0);
               }
               break;
            case 1:
               p[6][2] = p[6][2] + hr * j.a_ / 1000;
               p[6][1] = j.d(p[6][2]);
               if (p[6][1] >= 0) {
                  p[6][1] = 0;
                  a(6, (byte)0);
                  int var5;
                  aj(var5 = ak[6]);
               }
               break;
            case 2:
               p[6][2] = p[6][2] - hr * j.a_ / 1000;
               p[6][1] = j.d(p[6][2]);
               if (p[6][1] <= -300) {
                  boolean var4 = false;
                  boolean var3 = false;
                  byte var2 = 6;
                  a(6, var3, var4, 0);
               }
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case -2:
               if (k(6) == 0) {
                  boolean var11 = true;
                  boolean var9 = false;
                  byte var7 = 6;
                  a(6, var9, var11, 0);
               }
         }
      }

      if (var0 == 6) {
         a(6, (byte)1);
         p[6][2] = -j.c(300);
      }

      if (var0 == 7) {
         a(6, (byte)2);
         p[6][2] = 0;
      }
   }

   private static void b(String var0, int var1) {
      hs = 3000;
      ht = 0;
      boolean var3 = true;
      boolean var2 = true;
      byte var4 = 6;
      a(6, var2, var3, 0);
      b(38, 1, var0);
   }

   private static void aC(int var0) {
      if (var0 == 2) {
         switch (k(5)) {
            case 0:
               if ((hw = hw + j.a_) >= hv) {
                  boolean var6 = true;
                  boolean var5 = false;
                  byte var4 = 5;
                  a(5, var5, var6, 0);
               }
               break;
            case 1:
               p[5][2] = p[5][2] + hu * j.a_ / 1000;
               p[5][0] = j.d(p[5][2]);
               if (p[5][0] >= 0) {
                  p[5][0] = 0;
                  a(5, (byte)0);
               }
               break;
            case 2:
               p[5][2] = p[5][2] - hu * j.a_ / 1000;
               p[5][0] = j.d(p[5][2]);
               if (p[5][0] <= -300) {
                  boolean var3 = false;
                  boolean var2 = false;
                  byte var1 = 5;
                  a(5, var2, var3, 0);
               }
         }
      }

      if (var0 == 6) {
         a(5, (byte)1);
         p[5][2] = -j.c(300);
      }

      if (var0 == 7) {
         a(5, (byte)2);
         p[5][2] = 0;
      }
   }

   private static void F(int var0, int var1) {
      hx = var0;
      hv = 2500;
      hw = 0;
      boolean var3 = true;
      boolean var2 = true;
      short var4 = 5;
      a(5, var2, var3, 0);
      var4 = 618;
      b(42, 2, a(a(618, (int)0), hx));
      if (aq) {
         g(42, 1, true);
         StringBuffer var10002 = new StringBuffer();
         var4 = 616;
         b(42, 1, var10002.append(a(616, (int)0)).append(e(100 * a[0].g)).toString());
         aq = false;
      }

      if (var0 >= 6) {
         i(42, 0, 6, 2);
         i(42, 0, 8, 1);
         i(42, 3, 8, 3);
         i(42, 2, 8, 3);
         i(42, 1, 8, 3);
      } else {
         i(42, 0, 6, 0);
         i(42, 0, 8, 0);
         i(42, 3, 8, 0);
         i(42, 2, 8, 0);
         i(42, 1, 8, 0);
      }

      if (o.d != 6 && o.d != 7 && o.d != 11) {
         var2 = false;
         byte var7 = 24;
         d(24, 1, false);
      }

      if (!g && o.a == 0) {
         z(20, var0);
         z(21, var0);
         z(22, var0);
      }
   }

   private static void G(int var0, int var1) {
      if (var0 == 0) {
         bb();
         al(49);
         a(49, (byte)0);
      }

      if (var0 == 5) {
         boolean var3 = false;
         byte var2 = 16;
         d(16, 1, false);
         switch (var1) {
            case 0:
               j.a("cGame_GUI_Help.h:50:k_Help_Button_PlayTutorials pressed");
               aq(0);
               break;
            case 1:
               j.a("cGame_GUI_Help.h:56:k_Help_Button_ActionsCards pressed");
               aD(0);
               m(45);
               break;
            case 2:
               j.a("cGame_GUI_Help.h:63:k_Help_Button_Scoring pressed");
               aD(2);
               m(45);
               break;
            case 3:
               j.a("cGame_GUI_Help.h:70:k_Help_Button_CustomRules pressed");
               aD(1);
               m(45);
               break;
            case 4:
               j.a("cGame_GUI_Help.h:77:k_Help_Button_Chat pressed");
               aD(3);
               m(45);
               break;
            case 5:
               j.a("cGame_GUI_Help.h:84:k_Help_Button_Powers pressed");
               aD(4);
               m(45);
               break;
            case 6:
               j.a("cGame_GUI_Help.h:98:k_Help_Button_Career pressed");
               aD(7);
               m(45);
               break;
            case 7:
               j.a("cGame_GUI_Help.h:91:k_Help_Button_Controls pressed");
               aD(5);
               m(45);
         }
      }

      if (var0 == 1) {
         int var10000 = l(fF);
         boolean var4 = false;
         boolean var5 = false;
         a(var10000, var5, var4, 0);
      }
   }

   private static void aD(int var0) {
      switch (var0) {
         case 0:
            short var8 = 414;
            x = a(414, (int)0);
            hy = 10264;
            hz = 10265;
            G = H;
            hA = 0;
            return;
         case 1:
            short var7 = 416;
            x = a(416, (int)0);
            hy = 10240;
            hz = 10241;
            G = K;
            hA = 1;
            return;
         case 2:
            G = L;
            short var6 = 415;
            x = a(415, (int)0);
            hy = 10302;
            hz = 10303;
            hA = 2;
            return;
         case 3:
            G = M;
            short var5 = 634;
            x = a(634, (int)0);
            hy = 10308;
            hz = 10309;
            hA = 3;
            return;
         case 4:
            G = I;
            short var4 = 418;
            x = a(418, (int)0);
            hy = 10282;
            hz = 10283;
            hA = 4;
            return;
         case 5:
            G = J;
            short var3 = 417;
            x = a(417, (int)0);
            hy = 10254;
            hz = 10255;
            hA = 5;
            return;
         case 6:
            G = O;
            byte var2 = 36;
            x = a(36, (int)0);
            hy = 10320;
            hz = 10321;
            hA = 6;
            return;
         case 7:
            G = N;
            boolean var1 = false;
            x = a(0, (int)0);
            hy = 10370;
            hz = 10371;
            hA = 7;
      }
   }

   private static void bR() {
      if (hA == 1 || hA == 0) {
         a(54, 0, false, false);
         a(56, 0, false, false);
      }

      for (int var0 = 0; var0 < G.length; var0++) {
         if (G[var0][0] != -1) {
            a(G[var0][2], 0, false, false);
         }
      }

      aL();
   }

   private static void bS() {
      a = a[G[dG][2]];
      if (G[dG][0] > -1) {
         i(55, 3, 6, dL);
         if (hA == 4) {
            i(55, 3, 3, (int)(dK / 1.2));
         } else {
            i(55, 3, 3, dK);
         }
      } else {
         i(55, 3, 3, dK - dL);
         i(55, 3, 6, dL << 1);
      }

      dE = G[dG][0];
      dF = G[dG][1];
      b(55, 2, a(hy + (dG << 1), (int)5));
      b(55, 3, a(hz + (dG << 1), (int)5));
   }

   private static void bT() {
      j.a("cGame_Help_SubScreen.h:315:help_subScreen_paintSpecialScoreScreen");
      b(55, 20, a(10319, (int)5));
      String var0 = a(a(10318, (int)5), 20);
      b(55, 21, var0);
      var0 = a(a(10318, (int)5), 50);
      b(55, 22, var0);

      for (int var4 = 0; var4 < 3; var4++) {
         g(55, var4 + 20, true);
         int var2 = var4 + 20;
         byte var1 = 55;
         a((String)null, 55, var2, 0, 0);
      }

      (a = a[56]).e(2);
      short var5 = a(55, 8, 2);
      short var12 = a(55, 8, 3);
      a.a(j.b, 9, var5, var12, 0);
      a.e(1);
      short var6 = a(55, 9, 2);
      var12 = a(55, 9, 3);
      a.a(j.b, 10, var6, var12, 0);
      a.e(3);
      short var7 = a(55, 11, 2);
      var12 = a(55, 11, 3);
      a.a(j.b, 11, var7, var12, 0);
      a.e(2);
      short var8 = a(55, 10, 2);
      var12 = a(55, 10, 3);
      a.a(j.b, 12, var8, var12, 0);
      (a = a[54]).e(0);
      short var9 = a(55, 13, 2);
      var12 = a(55, 13, 3);
      a.a(j.b, 0, var9, var12, 0);
      short var10 = a(55, 12, 2);
      var12 = a(55, 12, 3);
      a.a(j.b, 1, var10, var12, 0);

      for (int var11 = 0; var11 < 6; var11++) {
         h(55, var11 + 8, false);
      }
   }

   private static void h(boolean var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         g(55, var1 + 20, false);
      }

      for (int var2 = 0; var2 < 6; var2++) {
         i(55, var2 + 14, 7, 0);
      }
   }

   private static void aE(int var0) {
      if (var0 == 0) {
         f(l(fF), true);
         g(l(fF), true);
         int var1;
         String var3 = a(var1 = 437 + gv, (int)0);
         b(58, 2, var3);
         var1 = E[gv][0];
         b(58, 5, e(var1));
         b(58, 3, a(var1 = 476 + gv, (int)0));
         int var2 = az[gv];
         byte var6 = 6;
         var6 = 58;
         i(58, 6, 6, var2);
         hb = gX;
         az(0);
      }

      if (var0 == 1) {
         h(18, false);
         az(hb);
      }
   }

   private static void H(int var0, int var1) {
      if (var0 == 0) {
         bb();
         al(19);
         a(19, (byte)0);
      }

      if (var0 == 5) {
         switch (var1) {
            case -3:
               if (fE == 60) {
                  var1 = (fD - gW) / 5;
                  int var2 = (fD - gW) % 5;
                  j.a(
                     "cGame_GUI_Achievements.h:52:entered ACTIVATED_BUTTON_CHILD_LAYER at cGame_GUI_Achievements with iItemIndex "
                        + var1
                        + " iItemGUIElem "
                        + var2
                  );
                  if (var2 == 2) {
                     k(5, var1 + 1980);
                  }
               }

               boolean var6 = false;
               byte var5 = 15;
               d(15, 1, false);
         }
      }

      if (var0 == 1) {
         int var10000 = l(fF);
         boolean var3 = false;
         boolean var7 = false;
         a(var10000, var7, var3, 0);
      }
   }

   private static void aF(int var0) {
      if (var0 == 0) {
         aV();
      }

      if (var0 == 5) {
         k(fD);
         byte var1 = 0;
         var1 = 16;
         d(16, 1, false);
         switch (b(true)) {
            case 583:
               k(5, 1030);
               return;
            case 584:
               k(5, 1035);
               return;
            case 585:
               k(5, 1032);
               return;
            case 586:
               k(5, 1034);
               return;
            case 587:
               k(5, 1031);
               return;
            case 588:
               k(5, 1033);
               return;
            case 589:
            case 590:
            case 591:
            default:
               break;
            case 592:
               k(5, 1036);
               return;
            case 593:
               k(5, 1037);
         }
      }
   }

   private static void I(int var0, int var1) {
      if (var0 == 0) {
         aV();
      }

      if (var0 == 5) {
         k(var1);
         switch (var1) {
            case 0:
               j.a("cGame_GUI_Hotseat_Menu.h:20:k_Hotseat_Button_Ok PRESSED!");
               k(5, 1013);
               return;
            case 1:
            default:
               break;
            case 2:
               j.a("cGame_GUI_Hotseat_Menu.h:26:k_Hotseat_Button_P1 PRESSED!");
               k(5, 1014);
               return;
            case 3:
               j.a("cGame_GUI_Hotseat_Menu.h:32:k_Hotseat_Button_P2 PRESSED!");
               k(5, 1015);
               return;
            case 4:
               j.a("cGame_GUI_Hotseat_Menu.h:38:k_Hotseat_Button_P3 PRESSED!");
               k(5, 1016);
               return;
            case 5:
               j.a("cGame_GUI_Hotseat_Menu.h:44:k_Hotseat_Button_P4 PRESSED!");
               k(5, 1017);
               return;
            case 6:
               k(5, 1018);
               return;
            case 7:
               k(5, 1019);
               return;
            case 8:
               k(5, 1020);
               return;
            case 9:
               k(5, 1021);
         }
      }
   }

   protected final void pointerPressed(int var1, int var2) {
      super.pointerPressed(var1, var2);
      f++;
      hD = var1;
      hE = var2;
      hF = -1;
      hG = -1;
      hL = var1;
      hM = var2;
      bq = true;
      br = false;
      bw = hD;
      bx = hE;
      hJ = 0;
      hK = 0;
      e = System.currentTimeMillis();
      s.b(var1, var2);
   }

   protected final void pointerReleased(int var1, int var2) {
      super.pointerReleased(var1, var2);
      if ((i = System.currentTimeMillis()) - e < 200L) {
         bs = true;
         hH = var1;
         hI = var2;
      } else {
         g++;
         bs = false;
         hF = var1;
         hG = var2;
         hD = -1;
         hE = -1;
         bu = -1;
         bv = -1;
         hL = var1;
         hM = var2;
         bq = false;
         this.keyReleased(hC);
         hC = -256;
         s.a(var1, var2);
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      super.pointerDragged(var1, var2);
      h = System.currentTimeMillis();
      if (var1 != -1 && var2 != -1) {
         bu = var1;
         bv = var2;
         hL = var1;
         hM = var2;
      }

      s.c(var1, var2);
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   private static boolean c(int var0, int var1, int var2, int var3) {
      return hB != 3 ? false : a(hF, hG, var0, var1, var2, var3);
   }

   private static boolean d(int var0, int var1, int var2, int var3) {
      return hB != 1 ? false : a(hD, hE, var0, var1, var2, var3);
   }

   private static boolean e(int var0, int var1, int var2, int var3) {
      return hB != 2 ? false : a(bu, bv, var0, var1, var2, var3);
   }

   public static final boolean a(int var0, int var1, int var2, int var3) {
      if (hB != 2) {
         return false;
      } else {
         return bu < 0 && bv < 0 ? a(hD, hE, var0, var1, var2, var3) : e(var0, var1, var2, var3);
      }
   }

   private static boolean r() {
      return bq && !br || hB != 0 && !br;
   }

   public static final int a() {
      return bu > 0 ? bu - hD : 0;
   }

   public static final int b() {
      return bv > 0 ? bv - hE : 0;
   }

   private static void bU() {
      hF = -1;
      hG = -1;
      hD = -1;
      hE = -1;
      bu = -1;
      bv = -1;
      hL = -1;
      hM = -1;
      bq = false;
      br = false;
      e = 0L;
      hB = 0;
   }

   private static void bV() {
      for (int var0 = 0; var0 < P.length; var0++) {
         int var1 = P[var0][0];
         int var2 = P[var0][1];
         aD[0] = var1;
         aD[1] = var2;
         aD[2] = var1 + 120 - 1;
         aD[3] = var2 + 120 - 1;
         var1 = var0 < hN ? -65536 : -16776961;
         var2 = var1;
         int[] var4 = aD;
         j.b.setColor(var2);
         if (var4 != null) {
            j.b(var4[0], var4[1], var4[2], var4[1]);
            j.b(var4[0], var4[1], var4[0], var4[3]);
            j.b(var4[0], var4[3], var4[2], var4[3]);
            j.b(var4[2], var4[1], var4[2], var4[3]);
         }
      }
   }

   public final void hideNotify() {
      j.a("++++++++++++ hideNotify()");
      if (bW == 4 || bW == 45 && hA == 6) {
         u = true;
      }

      this.a();
   }

   public final void showNotify() {
      j.a("------------- showNotify()");
      this.b();
   }

   static {
      String[] var10000 = new String[]{"AAA", "BBB", "CCC"};
      int[] var0 = new int[]{4, 1, 1};
      int[] var1 = new int[]{-16738073, -16719589, -1696512, -869376};
      int[] var2 = new int[]{1000, 500, 250, 0};
      m = g.a;
      int[] var3 = new int[]{-1, -1, 1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1};
      fw = (
            fv = (
                  fu = (
                        ft = (
                              fs = (
                                    fr = (
                                          fq = (
                                                fp = (
                                                      fo = (
                                                            fn = (
                                                                  fm = (
                                                                        fl = (
                                                                              fk = (
                                                                                    fj = (
                                                                                          fi = (
                                                                                                fh = (
                                                                                                      fg = (
                                                                                                            ff = (
                                                                                                                  fe = (
                                                                                                                        bp = (
                                                                                                                              bo = (
                                                                                                                                    bn = (
                                                                                                                                          bm = (
                                                                                                                                                bl = (
                                                                                                                                                      bk = (
                                                                                                                                                            bj = (
                                                                                                                                                                  bi = (
                                                                                                                                                                        bh = (
                                                                                                                                                                              bg = (
                                                                                                                                                                                    bf = (
                                                                                                                                                                                          be = (
                                                                                                                                                                                                bd = (
                                                                                                                                                                                                      bc = (
                                                                                                                                                                                                            bb = (
                                                                                                                                                                                                                  ba = (
                                                                                                                                                                                                                        aZ = (
                                                                                                                                                                                                                              aY = (
                                                                                                                                                                                                                                    aX = (
                                                                                                                                                                                                                                          aW = (
                                                                                                                                                                                                                                                aV = (
                                                                                                                                                                                                                                                      aU = (
                                                                                                                                                                                                                                                            aT = (
                                                                                                                                                                                                                                                                  aS = (
                                                                                                                                                                                                                                                                        aR = (
                                                                                                                                                                                                                                                                              aQ = (
                                                                                                                                                                                                                                                                                    aP = (
                                                                                                                                                                                                                                                                                          aO = (
                                                                                                                                                                                                                                                                                                aN = (
                                                                                                                                                                                                                                                                                                      aM = (
                                                                                                                                                                                                                                                                                                            aL = (
                                                                                                                                                                                                                                                                                                                  aK = (
                                                                                                                                                                                                                                                                                                                        aJ = (
                                                                                                                                                                                                                                                                                                                              aI = (
                                                                                                                                                                                                                                                                                                                                    aH = (
                                                                                                                                                                                                                                                                                                                                          aG = (
                                                                                                                                                                                                                                                                                                                                                aF = (
                                                                                                                                                                                                                                                                                                                                                      aE = (
                                                                                                                                                                                                                                                                                                                                                            aD = (
                                                                                                                                                                                                                                                                                                                                                                  aC = (
                                                                                                                                                                                                                                                                                                                                                                        aB = (
                                                                                                                                                                                                                                                                                                                                                                              aA = (
                                                                                                                                                                                                                                                                                                                                                                                    az = (
                                                                                                                                                                                                                                                                                                                                                                                          ay = (
                                                                                                                                                                                                                                                                                                                                                                                                ax = (
                                                                                                                                                                                                                                                                                                                                                                                                      aw = (
                                                                                                                                                                                                                                                                                                                                                                                                            av = (
                                                                                                                                                                                                                                                                                                                                                                                                                  au = (
                                                                                                                                                                                                                                                                                                                                                                                                                        at = (
                                                                                                                                                                                                                                                                                                                                                                                                                              as = (
                                                                                                                                                                                                                                                                                                                                                                                                                                    ar = (
                                                                                                                                                                                                                                                                                                                                                                                                                                          aq = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                ap = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                      ao = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                            an = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  am = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        al = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ak = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    aj = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ah = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ag = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            af = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ae = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ad = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ac = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ab = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aa = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Z = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Y = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            X = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  W = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        V = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              U = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    T = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          S = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                R = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Q = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            P = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  O = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        N = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              M = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    L = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          K = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                J = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      I = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            H = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  G = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        F = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              E = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    D = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          C = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                B = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            z = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  y = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        x = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              w = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    v = (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          u = 169
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               + 1
                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                         + 1
                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                   + 1
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             + 1
                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                       + 1
                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                 + 1
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           + 1
                                                                                                                                                                                                                     )
                                                                                                                                                                                                                     + 1
                                                                                                                                                                                                               )
                                                                                                                                                                                                               + 1
                                                                                                                                                                                                         )
                                                                                                                                                                                                         + 1
                                                                                                                                                                                                   )
                                                                                                                                                                                                   + 1
                                                                                                                                                                                             )
                                                                                                                                                                                             + 1
                                                                                                                                                                                       )
                                                                                                                                                                                       + 1
                                                                                                                                                                                 )
                                                                                                                                                                                 + 1
                                                                                                                                                                           )
                                                                                                                                                                           + 1
                                                                                                                                                                     )
                                                                                                                                                                     + 1
                                                                                                                                                               )
                                                                                                                                                               + 1
                                                                                                                                                         )
                                                                                                                                                         + 1
                                                                                                                                                   )
                                                                                                                                                   + 1
                                                                                                                                             )
                                                                                                                                             + 1
                                                                                                                                       )
                                                                                                                                       + 1
                                                                                                                                 )
                                                                                                                                 + 1
                                                                                                                           )
                                                                                                                           + 1
                                                                                                                     )
                                                                                                                     + 1
                                                                                                               )
                                                                                                               + 1
                                                                                                         )
                                                                                                         + 6
                                                                                                   )
                                                                                                   + 1
                                                                                             )
                                                                                             + 2
                                                                                       )
                                                                                       + 30
                                                                                 )
                                                                                 + 30
                                                                           )
                                                                           + 1
                                                                     )
                                                                     + 1
                                                               )
                                                               + 1
                                                         )
                                                         + 1
                                                   )
                                                   + 1
                                             )
                                             + 1
                                       )
                                       + 1
                                 )
                                 + 6
                           )
                           + 6
                     )
                     + 200
               )
               + 1
         )
         << 2;
      var10000 = new String[]{
         "SHOW_MSG",
         "HIGHLIGHT_PLAYER_CARD",
         "HIGHLIGHT_DECK",
         "SHOW_WILDCARD_HELP",
         "FORCE_COLOR_SELECTION",
         "FORCE_UNO_BUTTON_PRESS",
         "SET_WHEEL_COLOR",
         "HIDE_MSG",
         "DELAY"
      };
      int[] var5 = new int[]{243, 244, 245, 246, 247};
      int[][] var6 = new int[][]{{248, 249, 250}, {251, 252, 254, 255}, {-1}, {-1}, {-1}};
      c = new String[][]{
         {
               "q",
               "w",
               "e",
               "r",
               "t",
               "y",
               "u",
               "i",
               "o",
               "p",
               "a",
               "s",
               "d",
               "f",
               "g",
               "h",
               "j",
               "k",
               "l",
               "z",
               "x",
               "c",
               "v",
               "b",
               "n",
               "m",
               " ",
               "@",
               ",",
               ".",
               l,
               m,
               o,
               p
         },
         {
               "Q",
               "W",
               "E",
               "R",
               "T",
               "Y",
               "U",
               "I",
               "O",
               "P",
               "A",
               "S",
               "D",
               "F",
               "G",
               "H",
               "J",
               "K",
               "L",
               "Z",
               "X",
               "C",
               "V",
               "B",
               "N",
               "M",
               " ",
               "@",
               ",",
               ".",
               l,
               m,
               o,
               p
         },
         {
               "1",
               "2",
               "3",
               "4",
               "5",
               "6",
               "7",
               "8",
               "9",
               "0",
               "#",
               "$",
               "%",
               "&",
               "*",
               "-",
               "+",
               "(",
               ")",
               "!",
               "\"",
               ":",
               ";",
               "/",
               "?",
               "_",
               " ",
               "@",
               ",",
               ".",
               q,
               m,
               n,
               p
         }
      };
      int[] var7 = new int[]{348, 349, 350, 351};
      int[][] var8 = new int[][]{{352, 353, 354, 355}, {356, 357, 358, 359}, {360, 361, 362, 363, 364}, {365, 366, 367, 368}};
      var10000 = new String[]{"UPD", "D_BG", "D_CL_S", "D_ARROW", "D_AV", "D_DESK", "D_EFP", "D_BUF"};
      int[] var10 = new int[]{0, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 6000};
      int[] var11 = new int[]{0, 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 5000};
      int[][] var12 = new int[][]{
         {0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 200, 400, 800, 1200, 1400, 0, 200, 400, 600, 800},
         {0, 0, 0, 0, 0, 0, 0, 0},
         {0, 0, 200, 400, 600, 800, 0, 0, 200, 400, 600, 800},
         {0, 0, 200, 400, 600, 800, 0, 0, 200, 400, 600, 800},
         {0, 0, 0, 0, 0, 0, 0, 0},
         {0, 0, 200, 400, 600, 800, 0, 0, 200, 400, 600, 800},
         {0, 0, 200, 400, 600, 800, 0, 0, 200, 400, 600, 800},
         {0, 0, 200, 400, 800},
         {0, 0, 200, 400, 800},
         {0, 200, 200, 400, 400, 600, 600, 800, 1000, 1200, 1400, 1600, 1600, 1600, 1800},
         {0, 1000, 2000, 3000, 4000, 5000},
         {0, 200, 400, 600, 800, 1000},
         {0, 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000}
      };
      P = new int[][]{{b.a - 120, 0}, {0, 0}, {0, b.b - 120}, {b.a - 120, b.b - 120}, {b.a - 120, (b.b >> 1) - 60}, {(b.a >> 1) - 60, (b.b >> 1) - 60}};
   }
}
