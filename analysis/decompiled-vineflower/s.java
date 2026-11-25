import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class s implements Runnable, CommandListener {
   private static String a = "2.2";
   private static String b;
   private static String c = "";
   private static String d;
   private static Font a;
   private static String e = "URL";
   private static int a = 13568256;
   private static int b = 2;
   private static int c = 2;
   private static int d;
   private static int e;
   private static int f;
   private static int g = 0;
   private static int h = 0;
   private static boolean[] a = new boolean[1];
   private static int[] a = new int[1];
   private static int i;
   private static int j = -1;
   private static int k = 8;
   private static int l;
   private static int m;
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static int x;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   private static int C;
   private static int D;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   private static int I;
   private static String f = "WN";
   private static String g = "BS";
   private static String h = "CATALOG";
   private static String i = "GLDT";
   private static String j = "ZVIP";
   private static String k = "PROMO";
   private static String l = "URL-PT";
   private static String m = "URL-OPERATOR";
   private static int J = 15;
   private static int K;
   private static int[] b;
   private static byte[][] a;
   private static int L;
   private static byte[] a;
   private static int M;
   private static int N = 0;
   private static int O = 1;
   private static int P = 2;
   private static int Q = 3;
   private static Image[] a;
   private static int R;
   private static int[] c;
   private static int S;
   private static int T;
   private static boolean a;
   private static String[] a;
   private static String n = "IGP-PROMOS";
   private static String o = "IGP-WN";
   private static String p = "IGP-BS";
   private static String q = "IGP-CATEGORIES";
   private static String r = "URL-TEMPLATE-GAME";
   private static String s = "more_games_url";
   private static String t = "more_games_status";
   private static String u = null;
   private static String v = null;
   private static String w = "on";
   private static String x = "XXXX";
   private static String y = "&ctg=" + x;
   private static String z = "&ctg=";
   private static String A = "&lg=";
   private static String B = "SC";
   private static String C = "CCTL";
   private static String D = "ingameads.gameloft.com/redir";
   private static String E = ";";
   private static String F;
   private static boolean b;
   private static boolean c;
   private static boolean d = true;
   private static String G;
   private static String[] b = new String[0];
   private static String[] c;
   private static String[] d;
   private static String[] e;
   private static int U;
   private static int V;
   private static String[] f;
   private static short[] a;
   private static int W;
   private static boolean e;
   private static boolean f;
   private static boolean g = false;
   private static boolean h = false;
   private static long a = 0L;
   private static boolean i = true;
   private static MIDlet a;
   private static Canvas a;
   private static String H;
   private static boolean j = false;
   private static CommandListener a = null;
   private static s a = null;
   private static boolean k = false;
   private static String I = null;
   private static boolean l = false;
   private static boolean m = false;
   private static int X;
   private static int Y;
   private static int Z;
   private static int aa;
   private static int ab;
   private static int ac;
   private static Image[] b;
   private static Image[] c;
   private static Image a;
   private static Image b;
   private static Image[] d;
   private static Image c;
   private static Image d;
   private static Image e;
   private static Image f;
   private static Image g;
   private static Image h;
   private static Image i;
   private static Image j;
   private static Image k;
   private static Image l;
   private static Image m;
   private static Image n;
   private static Image[] e;
   private static Image o;
   private static Image p;
   private static Image[][] a;
   private static String[][] a;
   private static int[][] a;
   private static int[][] b;
   private static int[] d;
   private static int ad;
   private static int ae;
   private static int af;
   private static int ag;
   private static int ah;
   private static int ai;
   private static int aj;
   private static int ak;
   private static int al;
   private static int am;
   private static int an = -1;
   private static String[] g;
   private static int[] e;
   private static boolean[] b;
   private static int ao = 0;
   private static int ap;
   private static boolean n;
   private static byte a;
   private static byte b;
   private static int aq;
   private static boolean o;
   private static int ar;
   private static int as;
   private static int at;
   private static int au;
   private static int av;
   private static int aw;
   private static boolean p = true;
   private static String J;
   private static String K;
   private static String L = "";
   private static String M;
   private static String N;
   private static boolean q = false;
   private static int ax;
   private static int ay;
   private static int az;
   private static int aA;
   private static int aB;
   private static int aC;
   private static Command a;
   private static Command b;
   private static int aD = 0;
   private static boolean r = false;
   private static boolean s = false;
   private static int aE = -1;
   private static int aF = -1;
   private static int aG = -1;
   private static int aH = -1;
   private static int aI;
   private static int aJ;
   private static int aK;
   private static Hashtable a = new Hashtable();
   private static boolean t = false;
   private static int aL = 0;
   private static boolean u = false;
   private static short[] b = new short[50];

   private static boolean c() {
      b();

      try {
         InputStream var0;
         b = new int[K = (K = (var0 = a("/dataIGP")).read() & 0xFF) + ((var0.read() & 0xFF) << 8)];

         for (int var1 = 0; var1 < K; var1++) {
            b[var1] = var0.read() & 0xFF;
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 8);
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 16);
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 24);
         }

         var0.close();
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   private static void b() {
      b = null;
      a = null;
      K = 0;
      System.gc();
   }

   private static byte[] a(int var0) {
      if (var0 >= 0 && var0 < K - 1) {
         int var1;
         if ((var1 = b[var0 + 1] - b[var0]) == 0) {
            return null;
         }

         byte[] var2 = null;

         try {
            InputStream var3;
            (var3 = a("/dataIGP")).skip(2 + 4 * K + b[var0]);
            var0 = (var2 = new byte[var1]).length;

            while (var0 > 0) {
               var0 -= var3.read(var2);
            }

            var3.close();
         } catch (Exception var4) {
         }

         return var2;
      } else {
         return null;
      }
   }

   private static int a(byte[] var0) {
      return (var0[L++] & 0xFF) + ((var0[L++] & 0xFF) << 8);
   }

   private static byte[] a(byte[] var0) {
      int var1;
      byte[] var2 = new byte[var1 = a(var0)];
      System.arraycopy(var0, L, var2, 0, var1);
      L += var1;
      return var2;
   }

   private static Image a(byte[] var0) {
      byte[] var1;
      return Image.createImage(var1 = a(var0), 0, var1.length);
   }

   private static String a(int var0) {
      return "" + f[var0];
   }

   private static int a(int var0, int var1) {
      if (aL != 0) {
         if (var1 != 0 && var1 != O) {
            return a[var0 * 6 + var1] & 0xFF;
         }

         int var2 = a[var0 * 6 + var1] & 255;
         var0 = a[var0 * 6 + var1 + 1] & 255;
         int var4;
         return (var4 = 0 | (var0 & 0xFF) << 8) | var2 & 0xFF;
      } else {
         return a[(var0 << 2) + var1] & 0xFF;
      }
   }

   private static void a(int var0, Graphics var1, int var2, int var3, int var4) {
      a(a(var0), var1, az, var2, var3, var4);
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4, int var5) {
      a(var0, var1, var3, var4, var5);
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4) {
      String var22;
      char[] var5 = (var22 = var0).toCharArray();
      c[0] = 0;
      T = 0;
      int var6 = 0;
      int var10 = var22.length();
      byte var11 = 0;
      int[] var12 = new int[]{3633, 3636, 3637, 3638, 3639, 3640, 3641, 3642, 3655, 3656, 3657, 3658, 3659, 3660, 3661, 3662};
      if (az <= 176 && e[Z] == 4) {
         var11 += 2;
      }

      for (int var7 = 0; var7 < var10; var7++) {
         char var23 = var5[var7];
         boolean var13 = var6 < 10;
         boolean var14 = var23 == '\n';
         boolean var15 = var23 == '\\';
         boolean var16 = var7 != var10 - 1 && var5[var7 + 1] == 'N';
         boolean var17 = var7 != var10 - 1 && var5[var7 + 1] == 'n';
         boolean var18 = false;

         for (int var19 = 0; var19 < var12.length; var19++) {
            if (var23 == var12[var19]) {
               var18 = true;
               break;
            }
         }

         if (var13 && (var14 || var15 && (var16 || var17))) {
            if (var15 && (var16 || var17)) {
               var7++;
            }

            c[var6] = c[var6] - h;
            if (c[var6] > T) {
               T = c[var6];
            }

            c[++var6] = 0;
         } else if (var23 != 0 && var23 != 1 && !var18) {
            c[var6] = c[var6] + a(var23, P) + h;
         }
      }

      c[var6] = c[var6] - h;
      if (c[var6] > T) {
         T = c[var6];
      }

      S = (var6 + 1) * M + var6 * (var11 + 0);
      if (a) {
         a = false;
      } else {
         var3 += (var11 + 0) * var6 / 2;
         var6 = 0;
         if ((var4 & 32) != 0) {
            var3 -= S;
         } else if ((var4 & 2) != 0) {
            var3 -= S >> 1;
         }

         int var28 = var2;
         boolean var8 = true;
         boolean var9 = false;
         a(var1, 0, 0, az, aA);

         for (int var27 = 0; var27 < var10; var27++) {
            char var24 = var5[var27];
            if (var8) {
               var28 = var2;
               if ((var4 & 8) != 0) {
                  var28 = var2 - c[var6];
               } else if ((var4 & 1) != 0) {
                  var28 = var2 - (c[var6] >> 1);
               }

               var8 = false;
            }

            boolean var29 = var6 < 10;
            boolean var31 = var24 == '\n';
            int var33 = var24 == '\\';
            int var35 = var27 != var10 - 1 && var5[var27 + 1] == 'N';
            int var37 = var27 != var10 - 1 && var5[var27 + 1] == 'n';
            if (!var29 || !var31 && (!var33 || !var35 && !var37)) {
               if (var9) {
                  var9 = false;
                  char var39;
                  if ((var39 = var5[var27 - 2]) == ' ') {
                     var28 -= a(var39, P) + h >> 1;
                  }

                  if (var24 == ' ') {
                     var28 += a(var24, P) + h >> 1;
                     continue;
                  }
               }

               a(var1, var28, var3, a(var24, P), a(var24, Q));

               for (int var30 = 0; var30 < var12.length; var30++) {
                  if (var24 == var12[var30]) {
                     var28 -= a(var24, P) + h;
                     break;
                  }
               }

               if (var24 == 3635) {
                  var28 -= a(3585, P) / 2;
               }

               if (var24 >= 3585 && var24 <= 3675) {
                  a(var1, var28, var3, a(var24, P), a(var24, Q));
               }

               Image var10001 = a[R];
               int var10002 = a(var24, 0);
               int var10003 = a(var24, O);
               int var10004 = a(var24, P);
               int var10005 = a(var24, Q);
               int var21 = var3;
               int var20 = var28;
               int var40 = var10005;
               var37 = var10004;
               var35 = var10003;
               var33 = var10002;
               Image var32 = var10001;
               var1.drawRegion(var32, var33, var35, var37, var40, 0, var20, var21, 20);
               var28 += a(var24, P) + h;
            } else {
               if (var33 && (var35 || var37)) {
                  var27++;
               }

               var3 += M + var11 - 1;
               var6++;
               var8 = true;
               var9 = true;
            }
         }

         a(var1, 0, 0, az, aA);
      }
   }

   public static void a(MIDlet var0, Canvas var1, int var2, int var3) {
      Object var4 = null;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      az = var2;
      aA = var3;
      aB = az >> 1;
      aC = aA >> 1;
      d = aA;
      p = aA >= 160;
      e = (aA << 1) / 100;
      f = aA / 2;
      if (2 > az) {
         b = 2;
      }

      if (2 > az) {
         c = 2;
      }

      if (a == null && var1 != null) {
         a = var0;
         a = var1;
         c();
         String var6 = b;
         new StringBuffer().append(var6).append("");
         if ((m = d()) && q) {
            m = false;
         }

         D = null;
         F = null;
         r = null;
         q = null;
         s = null;
         t = null;
         w = null;
         f = null;
         g = null;
         h = null;
         i = null;
         j = null;
         k = null;
         l = null;
         m = null;
         e = null;
         x = null;
         y = null;
         B = null;
         z = null;
         C = null;
         E = null;
         n = null;
         a = null;
         o = null;
         p = null;
         System.gc();
      }
   }

   private static boolean a(String var0, int var1) {
      if (var0 == null) {
         return (var1 & 1) == 0;
      }

      var0 = var0.trim();
      return ((var1 & 1) == 0 || var0.length() != 0)
         && ((var1 & 2) == 0 || var0.toUpperCase().compareTo("DEL") != 0)
         && ((var1 & 4) == 0 || var0.toUpperCase().compareTo("NO") != 0 && var0.toUpperCase().compareTo("0") != 0);
   }

   private static String a(String var0, String var1, String var2) {
      String var3 = "";

      try {
         if (var2 != null && var0 != null && var1 != null) {
            int var4 = var0.indexOf(var1 + "=");
            var2 = var2.trim();
            if (var4 >= 0 && var2.length() > 0) {
               var4 += var1.length() + 1;
               int var8;
               if ((var8 = var0.indexOf(E, var4)) < 0) {
                  var8 = var0.length();
               }

               if ((var3 = var0.substring(var4, var8).trim()).length() == 0 || var3.compareTo("0") == 0 || var3.toUpperCase().compareTo("NO") == 0) {
                  var3 = "";
               } else if (var3.toUpperCase().compareTo("DEL") != 0 && var1.compareTo("OP") != 0) {
                  int var6;
                  if ((var6 = var2.indexOf(x)) >= 0) {
                     var3 = var2.substring(0, var6) + var3 + var2.substring(var6 + x.length());
                  } else {
                     var3 = var2;
                  }
               }
            }
         }
      } catch (Exception var5) {
         var3 = "";
      }

      return var3;
   }

   private static void a(int var0, String var1, int var2, String var3, String var4) {
      try {
         if (c) {
            String var7 = var3;
            var1 = a(a.getAppProperty(var7), var1, var4);
         } else {
            String var8 = e + "-" + var1;
            var1 = a.getAppProperty(var8);
         }

         if (a(var1, 7) && (var1.toUpperCase().compareTo("NO") != 0 || var1.toUpperCase().compareTo("0") != 0)) {
            b[var0] = true;
            g[var0] = var1;
            if (b[var0] && var0 != l) {
               ao++;
               e[var0] = 4;
               if (b) {
                  g[var0] = g[var0] + z + B + (ao < 10 ? "0" : "") + ao;
               }
            }
         }
      } catch (Exception var5) {
      }
   }

   private static void a(int var0, String[] var1, int var2, String var3) {
      int var4 = var1.length;
      a[var0] = new String[var4];
      a[var0] = new int[var4];
      b[var0] = new int[var4];
      int var5 = 0;
      if (!a[0]) {
         String var6 = "";
         if (c) {
            try {
               String var8 = var3;
               var3 = a.getAppProperty(var8);
               if (var0 != 2) {
                  var6 = F;
               } else if (L.length() > 0 && b) {
                  var6 = L + y;
               } else if (L.length() > 0) {
                  var6 = L;
               }
            } catch (Exception var10) {
            }
         }

         for (int var7 = 0; var7 < var1.length; var7++) {
            try {
               String var11 = "";
               if (var0 != 2 && var7 == var4 - 1) {
                  if (!c) {
                     var11 = a[var0];
                     var11 = a.getAppProperty(var11);
                  } else if (L.length() > 0) {
                     var11 = q;
                     var11 = a(a.getAppProperty(var11), var1[var7], L + (b ? y : ""));
                  }
               } else if (c) {
                  if (var1[var7].compareTo(i) == 0) {
                     var11 = a(var3, var1[var7], F);
                  } else if (var1[var7].compareTo(h) == 0) {
                     var11 = L;
                  } else {
                     var11 = a(var3, var1[var7], var6);
                  }
               } else {
                  var11 = a[var0] + "-" + var1[var7];
                  var11 = a.getAppProperty(var11);
               }

               if (a(var11, 7)) {
                  a[var0][var5] = var11;
                  a[var0][var5++] = var7;
                  int var15 = var2 - (var1.length - 1) + var7;
                  b[var0][var7] = var15;
               }
            } catch (Exception var9) {
            }
         }

         if (var5 > 0) {
            b[m + var0] = true;
            d[var0] = var5;
         }
      }
   }

   private static String[] a(byte[] var0) {
      String[] var1 = new String[a(var0)];

      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = a(var0);
         var1[var2] = new String(var0, L, var3);
         L += var3;
      }

      return var1;
   }

   private static void c() {
      String[] var12;
      try {
         if (!c()) {
            l = false;
            return;
         }

         byte[] var1;
         a(var1 = a(0));
         int var0 = a(var1);
         L += var0;
         int var8 = a(var1);
         L += var8;
         int var9 = a(var1);
         L += var9;
         int var10 = a(var1);
         L += var10;
         int var11 = a(var1);
         G = new String(var1, L, var11);
         L += var11;
         a(var1);
         a(var1);
         d = a(var1) == 1;
         b = a(var1);
         var12 = a(var1);
         c = a(var1);
         d = a(var1);
         e = a(var1);

         for (int var2 = 0; var2 < a.length; var2++) {
            a[var2] = a(var1) == 1;
         }

         try {
            int var24 = a(var1);
            if ((c = new String(var1, L, var24)).equals(a + "z")) {
               aL = 2;
               O = 2;
               P = 4;
               Q = 5;
            }
         } catch (Exception var6) {
            l = false;
         }

         b();
      } catch (Exception var7) {
         l = false;
         return;
      }

      String[] var13 = var12;
      int var14 = (var12.length - 1 > 0 ? var13.length - 1 : 0) + 4;
      q = ++var14;
      int var16 = C = (B = (A = (z = (y = (x = (w = (v = (u = (t = (s = (r = var14 + 1) + 1) + 1) + 1) + 1) + 1) + 1) + 1) + 1) + 1) + 1) + 1;
      if (c.length > 1) {
         E = (D = var16 + 1) + (c.length - 1);
      } else {
         E = var16 + 1;
      }

      int var17 = E;
      if (d.length > 1) {
         G = (F = var17 + 1) + (d.length - 1);
      } else {
         G = var17 + 1;
      }

      int var18 = G;
      I = (H = G + 1) + 1;
      e = new Image[U = var12.length];
      V = U + 1 + 1 + 1 + 1 + (a[0] ? 1 : 0);

      for (int var19 = 0; var19 < a.length; var19++) {
         if (a[var19]) {
            a[var19] = ++k;
         } else {
            a[var19] = --j;
         }
      }

      i = ++k;
      g = new String[V];
      b = new boolean[V];
      e = new int[V];

      for (int var20 = 0; var20 < b.length; var20++) {
         b[var20] = false;
      }

      p = (o = (n = (m = (l = U) + 1) + 1) + 1) + 1;
      a = new String[3][];
      a = new int[3][];
      b = new int[3][];
      d = new int[3];
      String var25 = s;
      u = a.getAppProperty(var25);
      var25 = t;
      v = a.getAppProperty(var25);
      if (u != null && v.toLowerCase().equals(w.toLowerCase())) {
         N = u;
         q = true;
         l = true;
      } else {
         try {
            var25 = r;
            if ((F = a.getAppProperty(var25)) != null) {
               F = F.trim();
               c = true;
               if (F.indexOf(D) != -1) {
                  b = true;
               }
            }
         } catch (Exception var5) {
         }

         for (int var21 = 0; var21 < U; var21++) {
            a(var21, var12[var21], 7, n, F);
         }

         try {
            var25 = m;
            String var22;
            if (a(var22 = a.getAppProperty(var25).trim(), 7)) {
               L = var22;
            }

            var25 = l;
            J = a.getAppProperty(var25);
         } catch (Exception var4) {
         }

         if (!a[0]) {
            if (c) {
               if (a(L, 7)) {
                  a(U, k, 7, q, L + (b ? y : ""));
               }
            } else {
               var25 = e + "-" + k;
               String var23;
               if ((var23 = a.getAppProperty(var25)) != null) {
                  var25 = e + "-" + k;
                  if (a(a.getAppProperty(var25), 7)) {
                     g[l] = var23;
                     b[l] = true;
                     e[l] = 5;
                  }
               }
            }
         }

         a(0, c, E, o);
         a(1, d, G, p);
         if (!a[0]) {
            if (c) {
               var25 = q;
               if (a(a(a.getAppProperty(var25), "OP", L), 7)) {
                  if (a(L, 7)) {
                     b[o] = true;
                  }

                  g[o] = L;
               }
            } else if (a(L, 7)) {
               g[o] = L;
               b[o] = true;
            }

            if (b[o] && b) {
               g[o] = g[o] + z + C;
            }
         }

         if (a[0]) {
            try {
               if (a(L, 7)) {
                  g[p] = L;
                  b[p] = true;
               }
            } catch (Exception var3) {
            }
         }

         if ((an = a()) > 0) {
            l = true;
         }
      }
   }

   public static boolean a() {
      return l;
   }

   public static void a(String var0, int var1) {
      if (q) {
         d = N;
         g();
      } else {
         e();
         t = false;
         byte var8 = 0;
         var0 = var0;
         if (var8 >= 0 && var8 < b.length) {
            aw = var8 <= b.length ? var8 : 0;
            K = var0;
            ab = -1;
            X = 0;
            aa = -1;
            Z = 0;
            ag = 0;
            ah = 0;
            c = new int[10];
            k = true;
            a = Font.getFont(0, 0, 8);
            a = 0;
            b = 0;
         }

         ac = 4 + V;
         int var6 = 0;

         int var10000;
         while (true) {
            if (var6 >= b.length) {
               var10000 = -1;
               break;
            }

            if (b[var6]) {
               var10000 = var6;
               break;
            }

            var6++;
         }

         Z = var10000;
         if (j) {
            a.setCommandListener(a);
         }
      }

      g = true;
      h = true;
      RecordStore var7 = null;

      try {
         var7 = RecordStore.openRecordStore("igp19", false);
      } catch (Exception var4) {
         try {
            var7 = RecordStore.openRecordStore("igp19", true);
         } catch (Exception var3) {
         }
      }

      try {
         if (var7 != null) {
            var7.closeRecordStore();
         }
      } catch (Exception var2) {
      }
   }

   public static void a() {
      t = true;
      if (m) {
         X = 7;
         d = M;
      }
   }

   public static boolean b() {
      return m;
   }

   private static boolean d() {
      int var0 = 0;

      for (int var1 = 0; var1 < b.length; var1++) {
         if (b[var1].equals("SP")) {
            var0 = 1;
         }
      }

      if (!var0) {
         return false;
      }

      try {
         String var4 = q;
         String var8;
         if ((var8 = a.getAppProperty(var4)) == null || var8.indexOf(j) == -1) {
            String var5 = e + "-" + j;
            return (M = a.getAppProperty(var5)) != null;
         }

         int var2;
         if ((var2 = (var0 = var8.indexOf(j) + j.length() + 1) + j.length()) >= var8.length()) {
            return false;
         }

         if (!var8.substring(var0, var2).equals(j)) {
            return false;
         }

         M = L;
         if (b) {
            if ((var0 = (M = M + y).indexOf(x)) >= 0) {
               M = M.substring(0, var0) + j + M.substring(var0 + x.length());
            }

            if (M.length() == 0) {
               return false;
            }
         }

         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   private static int a() {
      int var0 = 0;

      for (int var1 = 0; var1 < b.length; var1++) {
         if (b[var1]) {
            var0++;
         }
      }

      return var0;
   }

   private static void d() {
      if (J != null) {
         int var0;
         if ((var0 = J.length()) <= 0) {
            J = null;
         } else {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = 1;
            String var6 = "";
            ay = 0;
            char[] var7 = (J = J.toUpperCase()).toCharArray();

            for (int var8 = 0; var8 < var0; var8++) {
               char var9;
               if (((var9 = var7[var8]) < ' ' || var9 > 'z') && var9 != 130 && var9 != '\n') {
                  var6 = null;
                  break;
               }

               if (var9 == '\n') {
                  var1 = true;
               } else if (var8 < var0 - 1 && var9 == '\\' && (var7[var8 + 1] == 'n' || var7[var8 + 1] == 'N')) {
                  var1 = true;
                  var8++;
               }

               if (var1) {
                  if (var6.length() > 0) {
                     if (++var5 == 3) {
                        var6 = null;
                        break;
                     }

                     var6 = var6 + '\n';
                     if (var3 > ay) {
                        ay = var3;
                     }

                     var3 = 0;
                  } else {
                     var6 = var6 + "";
                  }

                  var1 = false;
               } else {
                  var6 = var6 + var9;
                  var3 += a(var9, P);
                  if (var9 == ' ') {
                     var2 = var6.length() - 1;
                     var4 = var3;
                  }
               }

               if (var3 >= az) {
                  if (var5 >= 3) {
                     var6 = null;
                     break;
                  }

                  if (var2 == var8) {
                     var6 = var6 + "\n";
                     var3 = 0;
                  } else {
                     if (var2 == 0) {
                        var6 = null;
                        break;
                     }

                     var6 = var6.substring(0, var2) + "\n" + var6.substring(var2 + 1, var6.length());
                     var3 -= var4;
                     if (var4 > ay) {
                        ay = var4;
                     }
                  }

                  var5++;
               }
            }

            if (var6 != null && !a(var6, 7)) {
               var6 = null;
            }

            J = var6;
            ax = var5;
            if (var3 > ay) {
               ay = var3;
            }

            ay = ay + (a(79, P) << 1);
         }
      }
   }

   private static void a(int var0) {
      byte[] var1 = null;
      L = 0;
      switch (var0) {
         case -1:
            b = new Image[J];
            c = new Image[V];
            (a = new Image[3][])[0] = new Image[c.length];
            a[1] = new Image[d.length];
            a[2] = new Image[e.length];
            return;
         case 0:
            c();
            return;
         case 1:
            var1 = a(var0);

            for (int var25 = 0; var25 < aw; var25++) {
               var0 = a(var1);
               L += var0;
            }

            a(var1);
            f = new String[var0 = a(var1)];
            byte[] var26 = new byte[var0];
            System.arraycopy(var1, L, var26, 0, var0);
            L += var0;
            a(var1);
            int var32;
            a = new short[var32 = var1[L++] & 0xFF | (var1[L++] & 255) << 8];

            for (int var34 = 0; var34 < var32 - 1; var34++) {
               a[var34] = (short)((var1[L++] & 255) + ((var1[L++] & 255) << 8));
            }

            a[var32 - 1] = (short)var0;

            for (int var35 = 0; var35 < var32; var35++) {
               var0 = var35 == 0 ? 0 : a[var35 - 1] & 65535;
               int var36;
               if ((var36 = (a[var35] & '\uffff') - var0) != 0) {
                  try {
                     f[var35] = new String(var26, var0, var36, "UTF-8");
                  } catch (Exception var6) {
                  }
               }
            }

            if (j) {
               a = new Command(a(w), 4, 1);
               b = new Command(a(x), 2, 1);
               boolean var12 = true;
               var12 = true;
               if (b != null) {
                  a.removeCommand(b);
               }

               if (a != null) {
                  a.removeCommand(a);
               }

               a.addCommand(a);
               a.addCommand(b);
               return;
            }
            break;
         case 2:
            a = new Image[7];
            byte[] var33 = new byte[(var1 = a(var0)).length];
            System.arraycopy(var1, 0, var33, 0, var1.length);
            var0 = a(var1);
            L = 0;
            a[0] = a(var1);
            if (G.equals("128x")) {
               a[5] = b(var33, 2, var0, 1, 4084831);
            } else {
               a[5] = b(var33, 2, var0, 1, 8956605);
            }

            a[2] = b(var33, 2, var0, 1, 16711680);
            int var5 = a(var1);
            a = new byte[(a(var1) + 1) * (4 + aL)];
            var0 = var5 / (6 + aL);

            for (int var31 = 0; var31 < var0; var31++) {
               int var24 = a(var1) * (4 + aL);
               System.arraycopy(var1, L, a, var24, 4 + aL);
               L = L + 4 + aL;
            }

            h = (M = a[32 * (4 + aL) + Q]) == 13 ? 0 : -1;
            d();
            return;
         case 3:
            var1 = a(var0);

            for (int var30 = 0; var30 < J; var30++) {
               if (var30 == 14) {
                  d = new Image[4];
                  byte[] var23 = a(var1);
                  d[0] = a(var23, 0, var23.length, 0, 0);
                  d[1] = a(var23, 0, var23.length, 0, a[0] ? 16744192 : 13568256);
                  d[2] = a(var23, 0, var23.length, 0, 5767410);
                  d[3] = a(var23, 0, var23.length, 0, 14588928);
                  b[var30] = d[0];
               } else {
                  b[var30] = a(var1);
               }
            }

            return;
         case 4:
            for (int var29 = 0; var29 < U; var29++) {
               c[var29] = a(a(var0));
            }

            return;
         case 5:
            byte[] var27 = a(var1 = a(var0));
            int var28 = var27.length;
            byte var21 = 0;
            c[l] = Image.createImage(var27, var21, var28);

            for (int var22 = 0; var22 < aw; var22++) {
               a(var1);
            }

            a = a(var1);
            return;
         case 6:
         case 7:
            int var2 = (var0 == 6 ? c.length : d.length) - 1;
            int var3 = var0 == 6 ? 0 : 1;
            var1 = a(var0);

            int var4;
            for (var4 = 0; var4 < var2; var4++) {
               a[var3][var4] = a(var1);
            }

            a[var3][var4] = b[11];
            c[var0 == 6 ? m : n] = b[10];
            return;
         case 8:
            var1 = a(var0);
            c[o] = a(var1);
            if ((b[aw].equals("JP") || b[aw].equals("DOCOMO")) && b == null) {
               b = a(var1);
               return;
            }
            break;
         default:
            if (var0 == a[0]) {
               var1 = a(var0);
               c[p] = a(var1);
               return;
            }

            if (var0 == i) {
               b();
            }
      }
   }

   private static void b(boolean var0) {
      for (int var1 = 0; var1 < a.length; var1++) {
         if (a[var1] != null) {
            for (int var2 = 0; var2 < a[var1].length; var2++) {
               a[var1][var2] = null;
            }
         }
      }

      for (int var3 = 0; var3 < c.length; var3++) {
         c[var3] = null;
      }

      a = null;
      b = null;
      if (var0) {
         b();
         a = null;
         a = null;

         for (int var4 = 0; var4 < J; var4++) {
            b[var4] = null;
         }

         b = null;

         for (int var5 = 0; var5 < 4; var5++) {
            d[var5] = null;
         }

         d = null;
         a = null;
         f = null;
         c = null;
         K = null;
         c = null;
         a = null;
         c = null;
         d = null;
         e = null;
         f = null;
         g = null;
         h = null;
         i = null;
         j = null;
         k = null;
         l = null;
         m = null;
         n = null;
         p = null;
         o = null;

         for (int var6 = 0; var6 < e.length; var6++) {
            e[var6] = null;
         }
      }

      System.gc();
   }

   public static void a(boolean var0) {
      if (!var0) {
         if (X == 5) {
            X = aa;
            ab = -1;
         }
      } else {
         if (X == 0 || X == 2) {
            aa = X;
            X = 5;
         }

         e();
      }
   }

   private static int a(byte[] var0, int var1, int var2, String var3) {
      char[] var5 = var3.toCharArray();

      for (int var4 = var1; var4 < var2 - 4; var4++) {
         if ((var0[var4] & 255) == var5[0] && (var0[var4 + 1] & 255) == var5[1] && (var0[var4 + 2] & 255) == var5[2] && (var0[var4 + 3] & 255) == var5[3]) {
            return var4;
         }
      }

      return -1;
   }

   private static Image a(byte[] var0, int var1, int var2, int var3, int var4) {
      int[] var15 = new int[10];
      int[] var7 = new int[10];
      int var8 = 0;

      for (int var9 = 0; var9 < var15.length; var9++) {
         var15[var9] = -1;
         var7[var9] = -1;
      }

      int var23 = a(var0, 0, var2, "PLTE");
      int var5 = a(var0, 0, var2, "tRNS");
      Image var6 = null;
      if (var23 > 0 && var5 > 0) {
         int var10 = (var0[var23 - 4] << 24 & 0xFF000000) + (var0[var23 - 3] << 16 & 0xFF0000) + (var0[var23 - 2] << 8 & 0xFF00) + (var0[var23 - 1] & 255);
         boolean var22 = false;

         for (int var11 = 0; var11 < var10 / 3; var11++) {
            if (var0[var5 + 4 + var11] != 0) {
               int var12 = var0[var23 + 4 + var11 * 3] & 255;
               int var13 = var0[var23 + 4 + var11 * 3 + 1] & 255;
               int var14 = var0[var23 + 4 + var11 * 3 + 2] & 255;
               if (var12 == 255 || var13 == 255 || var14 == 255) {
                  var22 = true;
                  break;
               }

               if (var12 == 0 || var13 == 0 || var14 == 0) {
                  var22 = true;
                  break;
               }
            }
         }

         if (!var22) {
            var3 = (var3 = 0 | 1 << 16) | 256 | 1;
         }

         for (int var24 = 0; var24 < var10 / 3; var24++) {
            if (var0[var5 + 4 + var24] != 0
               && (var0[var23 + 4 + var24 * 3] & 255) == (var3 >> 16 & 0xFF & 0xFF)
               && (var0[var23 + 4 + var24 * 3 + 1] & 255) == (var3 >> 8 & 0xFF & 0xFF)
               && (var0[var23 + 4 + var24 * 3 + 2] & 255) == (var3 & 0xFF)) {
               var15[var8] = var24;
               int var26 = a(var0, var23 + 4 + var24 * 3, 3);
               a(var0, var23 + 4 + var24 * 3, 3, var4);
               var7[var8] = var26;
               var8++;
            }
         }

         byte[] var25 = new byte[var10 + 4];
         System.arraycopy(var0, var23, var25, 0, var10 + 4);
         long[] var27 = new long[256];

         for (int var28 = 0; var28 < 256; var28++) {
            long var19 = var28;

            for (int var31 = 0; var31 < 8; var31++) {
               if ((var19 & 1L) == 1L) {
                  var19 = 3988292384L ^ var19 >> 1;
               } else {
                  var19 >>= 1;
               }
            }

            var27[var28] = var19;
         }

         long var20 = 4294967295L;

         for (int var29 = 0; var29 < var25.length; var29++) {
            var20 = var27[(int)(var20 ^ var25[var29]) & 0xFF] ^ var20 >> 8;
         }

         long var21 = var20 ^ 4294967295L;
         int var30 = a(var0, var23 + 4 + var10, 4);
         a(var0, var23 + 4 + var10, 4, (int)var21);
         System.gc();
         var6 = Image.createImage(var0, 0, var2);

         for (int var32 = 0; var32 < var8; var32++) {
            var2 = var15[var32];
            var3 = var7[var32];
            a(var0, var23 + 4 + var2 * 3, 3, var3);
         }

         a(var0, var23 + 4 + var10, 4, var30);
      }

      return var6;
   }

   private static void a(byte[] var0, int var1, int var2, int var3) {
      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         var0[var1 + var2 - 1 - var4] = (byte)((var3 & 255 << var4 * 8) >> var4 * 8);
      }
   }

   private static int a(byte[] var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         var3 += var0[var1 + var2 - 1 - var4] << var4 * 8 & 255 << var4 * 8;
      }

      return var3;
   }

   public static boolean a(int var0) {
      if (q) {
         return true;
      }

      if (t) {
         return !m ? true : X == 4;
      }

      if (!l) {
         return true;
      }

      if (r) {
         r = false;
      } else {
         Y = var0;
      }

      switch (X) {
         case 0:
            if (ab >= ac) {
               h();
               X = 1;
               f();
            } else {
               a(ab);
            }

            ab++;
            break;
         case 1:
            switch (Y) {
               case 21:
                  if (o && ah > 0 && --ah - ag < 0) {
                     ag--;
                  }

                  return false;
               case 22:
               case 28:
               case 29:
               case 30:
               case 31:
               default:
                  return false;
               case 23:
                  if (an <= 1) {
                     return false;
                  }

                  if (Z == 0) {
                     Z = V - 1;
                  } else {
                     Z--;
                  }

                  while (!b[Z]) {
                     if (Z == 0) {
                        Z = V - 1;
                     } else {
                        Z--;
                     }
                  }

                  e = true;
               case 24:
                  if (an > 1) {
                     if (!e) {
                        if (Z == V - 1) {
                           Z = 0;
                        } else {
                           Z++;
                        }

                        while (!b[Z]) {
                           if (Z == V - 1) {
                              Z = 0;
                           } else {
                              Z++;
                           }
                        }

                        f = true;
                     }

                     ag = 0;
                     ah = 0;
                     f();
                  }

                  return false;
               case 25:
               case 27:
                  X = 6;
                  return false;
               case 26:
                  X = 4;
                  return false;
               case 32:
                  if (o && ah < ae - 1 && ++ah - ag >= af) {
                     ag++;
                  }

                  return false;
            }
         case 2:
            b(false);
            var0 = Z;
            a(ab = e[var0] == 4 ? e[var0] : (var0 == l ? 5 : (var0 == m ? 6 : (var0 == n ? 7 : (var0 == o ? 8 : (var0 == p ? a[0] : -1))))));
            h();
            X = 1;
            break;
         case 3:
            switch (Y) {
               case 25:
                  d = null;
                  return false;
               case 26:
                  X = 1;
                  H = null;
                  return false;
               default:
                  return false;
            }
         case 4:
            b(true);
            if (j) {
               a.setCommandListener(a);
               if (b != null) {
                  a.removeCommand(b);
                  b = null;
               }

               if (a != null) {
                  a.removeCommand(a);
                  a = null;
               }
            }

            k = false;
            return true;
         case 5:
         default:
            break;
         case 6:
            String var2 = g[Z];
            if (o) {
               var2 = a[ad][ah];
            }

            if (var2 != null && var2.length() > 0) {
               if (b) {
                  int var1;
                  if ((var1 = var2.indexOf(A)) == -1) {
                     var2 = var2 + A + b[aw];
                  } else {
                     var2 = var2.substring(0, var1) + A + b[aw] + var2.substring(var1 + A.length() + 2);
                  }
               }

               d = var2;
            }
      }

      return false;
   }

   public static void a(int var0, int var1) {
      if ((var0 = b(var0, var1)) != 0) {
         Y = var0;
         r = true;
      }

      aD = 0;
      s = false;
   }

   public static void b(int var0, int var1) {
      if ((var0 = b(var0, var1)) != 0) {
         aD = var0;
      }
   }

   public static void c(int var0, int var1) {
      Y = 0;
      aD = 0;
      s = false;
      b(var0, var1);
   }

   private static int b(int var0, int var1) {
      if (var0 < 0 || var1 < 0) {
         return 0;
      }

      if (X != 0 && k) {
         if (o) {
            int var2 = aA * 5 / 100;
            var2 = var2 + 1 + b[5].getWidth();
            int var3 = az / 100;
            int var4 = var2 + a[ad][0].getWidth() + var3;
            var3 *= 3;
            boolean var5 = var0 > aj + var3 && var0 < aj + al - var3;

            for (int var7 = ag; var7 < ag + af; var7++) {
               if (var5 && var1 > aI + am * (var7 - ag) && var1 < aI + am * (var7 - ag) + am) {
                  if (ah == var7) {
                     return 25;
                  }

                  ah = var7;
                  return 0;
               }
            }

            if (var5) {
               var5 = var0 > b[12].getWidth() * 3 / 2 + 2 && var0 < az - (b[12].getWidth() * 3 / 2 - 2);
            }

            if (af < ae && var5) {
               if (ah > 0 && var1 > aJ - (var4 - 2) / 2 && var1 < aJ + (var4 - 2)) {
                  return 21;
               }

               if (ah < ae - 1 && var1 > aK - (var4 - 2) / 2 && var1 < aK + (var4 - 2)) {
                  return 32;
               }
            }
         } else if (var0 > au && var0 < au + as && var1 > av && var1 < av + at) {
            return 27;
         }

         int var8 = az - b[7].getWidth();
         int var10 = (aA >> 1) - b[7].getHeight();
         int var11 = b[7].getHeight() << 1;
         int var12 = b[7].getWidth() << 1;
         if (var1 >= var10 && var1 <= var10 + var11) {
            if (var0 >= 0 && var0 <= var12 + 0) {
               return 23;
            }

            if (var0 >= var8 - var12 / 2 && var0 <= var8 + var12) {
               return 24;
            }
         }

         if (j) {
            return 0;
         }

         if (var1 >= aA - b[13].getHeight() && var1 <= aA) {
            if (var0 > b && var0 < b[13].getWidth() + b) {
               return 0;
            }

            if (var0 > az - c - b[13].getWidth() && var0 < az - c) {
               return 26;
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   private static void e() {
      Y = 0;
      aD = 0;
      r = true;
      s = false;
      W = 0;
      e = false;
      f = false;
   }

   private static void f() {
      ap = Z;
      ah = 0;
      ae = 0;
      ag = 0;
      o = false;
      n = g[Z] != null && g[Z].length() > 0 && g[Z].compareTo("DEL") != 0;
      if (Z == m) {
         ad = 0;
         o = true;
         n = false;
      }

      if (Z == n) {
         ad = 1;
         o = true;
         n = false;
      }

      if (Z == o || Z == p) {
         n = true;
      }

      ar = y;
      if (e[Z] == 4) {
         ar = z;
      }

      if (o) {
         ae = d[ad];
      }
   }

   public static void a(Graphics var0) {
      if (!q) {
         if (l || t) {
            if (d != null) {
               g();
            } else if (!t) {
               Graphics var10;
               a(var10 = var0, 0, 0, az, aA);
               switch (X) {
                  case 0:
                     var10.setColor(0);
                     var10.fillRect(0, 0, az, aA);
                     int var10002 = az * 3 / 4;
                     int var20 = ac;
                     int var19 = ab;
                     int var18 = var10002;
                     int var17 = aC;
                     Graphics var14 = var10;
                     if (var19 > var20) {
                        var19 = var20;
                     }

                     int var21 = (az - var18) / 2;
                     var14.setClip(var21, 0, var18 + 2, aA);
                     var14.setColor(16777215);
                     var14.drawRect(var21, var17, var18, 6);
                     int var22 = (var18 - 2 - 2) * var19 / var20 + 1;
                     var14.setColor(16711680);
                     var14.fillRect(var21 + 1 + 1, var17 + 1 + 1, var22, 3);
                     if (K != null && !K.trim().equals("")) {
                        var10.setColor(16777215);
                        var10.setFont(a);
                        var10.drawString(K, aB, aC - 5, 33);
                        return;
                     }
                     break;
                  case 1:
                     b(var10);
                     if (System.currentTimeMillis() % 1000L <= 500L && aD != 27) {
                        break;
                     }

                     Graphics var13 = var10;
                     if (n) {
                        var13.setColor(a);
                        int var16 = d[0].getWidth() / 2;
                        au -= var16;
                        as += var16 * 2;
                        at++;
                        if (a[0]) {
                           var13.setColor(16744192);
                        }

                        if (aD == 27) {
                           var13.setColor(14588928);
                           a(var13, au - 2, av - 2, as + 4, at + 4, 3, true);
                           var13.setColor(5767410);
                           a(var13, au, av, as, at, 2, true);
                        } else {
                           a(var13, au, av, as, at, 1, true);
                        }

                        R = 0;
                        a(ar, var13, aB, av + (at >> 1), 3);
                     }

                     return;
                  case 2:
                     int var11 = M;
                     var10.setColor(6324884);
                     var10.fillRect(0, aC - var11 - 5, az, var11 << 1);
                     int var12 = R;
                     R = 0;
                     a(I, var10, aB, aC - var11, 65);
                     R = var12;
                     return;
                  case 3:
                     b(var10);
                     int var1 = aA * 40 / 100;
                     int var2 = az;
                     int var10004 = aA - (var1 << 1);
                     int var8 = -220209185;
                     int var7 = var10004;
                     int var6 = var2;
                     int var5 = var1;
                     boolean var4 = false;
                     Graphics var3 = var10;
                     int[] var9 = new int[var6 * var7];

                     for (int var15 = 0; var15 < var9.length; var15++) {
                        var9[var15] = var8;
                     }

                     var3.drawRGB(var9, 0, var6, 0, var5, var6, var7, true);
                     var10.setColor(39423);
                     var10.drawRect(0, var1, var2 - 1, aA - (var1 << 1) - 1);
                     var10.drawRect(1, var1 + 1, var2 - 3, aA - (var1 << 1) - 3);
                     a(C, var10, aB, aC, 3);
                     c(var10);
                  case 4:
                  default:
                     break;
                  case 5:
                     return;
               }
            }
         }
      }
   }

   private static void b(Graphics var0) {
      a = true;
      a(ar, null, 0, 0, 3);
      int var1 = a(32, P) / 2;
      int var2 = a(32, Q) / 3;
      as = T + var1;
      at = S + var2;
      if ((S + at) % 2 != 0) {
         at++;
      }

      au = aB - as / 2;
      if (e[Z] == 4) {
         av = f - at / 2;
      } else if (Z == l || Z == o || Z == p) {
         av = aA - b[12].getHeight() - aq - at;
      }

      if (a[0] && Z == p) {
         av = aA * 75 / 100;
      }

      var0.setColor(16777215);
      if (a[0]) {
         var0.setColor(0);
      }

      int var15 = 0;
      var1 = 7247016;
      int var3 = 0;
      int var4 = aA;
      var3 = az;
      int var11 = 0;
      var15 = (boolean)0;
      Graphics var12 = var0;
      if (var4 + 0 > aA) {
         var4 = aA;
      }

      if (var3 + 0 > az) {
         var3 = az;
      }

      for (int var6 = 0; var6 < var4 + 0; var6++) {
         var15 = 0 + var6 * 110 / var4;
         int var7 = 0 + var6 * 148 / var4;
         int var9 = 0 + var6 * 168 / var4;
         var12.setColor(var15, var7, var9);
         var12.drawLine(0, var6, 0 + var3, var6);
      }

      c(var0);
      var11 = aA - b[12].getHeight() - aq;
      if (o) {
         Graphics var14 = var0;
         var15 = e;
         if (p) {
            a(var14, true);
            var15 += c[Z].getHeight();
         }

         var3 = b[13].getHeight() + aq;
         var15 += e;
         var3 = aA - var15 - var3;
         var4 = a[ad][a[ad][0]].getHeight();
         int var5 = ad;
         int var61 = 0;

         for (int var68 = 0; var68 < b[ad].length; var68++) {
            int var8 = 1;

            for (int var73 = 0; a(b[var5][var68]).indexOf("\n", var73) != -1; var8++) {
               var73 = a(b[var5][var68]).indexOf("\n", var73) + 1;
            }

            if (var8 > var61) {
               var61 = var8;
            }
         }

         var4 = Math.max(Math.max(2, var61) * M, var4 + var4 / 4);
         var5 = b[5].getWidth();
         var61 = var3 / var4;
         if (var4 * ae + (aA << 1 << 1) / 100 > var3) {
            var15 += var5 + (var5 >> 1);
            var61 = (var3 -= 2 * (var5 + (var5 >> 1))) / var4;
         }

         int var72 = var61;
         if (ae < var61) {
            var72 = ae;
         }

         var15 += (var3 >> 1) - (var72 * var4 >> 1);
         int var69 = var4 * var72 + (aA << 1 << 1) / 100;
         af = var72;
         var3 = var15;
         if (var61 < ae) {
            var61 = 16777215;
            if (ah > 0) {
               if (aD == 21) {
                  var61 = 16545540;
               }

               a(var14, aB, var3 - var5, var5, var61, true, false);
               aJ = var3 - var5;
            }

            var61 = 16777215;
            if (ah != ae - 1) {
               if (aD == 32) {
                  var61 = 16545540;
               }

               a(var14, aB, var3 + af * var4 + var5, var5, var61, true, true);
               aK = var3 + af * var4;
            }
         }

         var3 = var15 + var4 / 2 + 1;
         al = az - (2 * b[5].getWidth() + b[5].getWidth() / 4 + 8);
         if (az > aA) {
            al = al - b[5].getWidth() / 2;
         }

         aj = (az >> 1) - (al >> 1);
         var61 = (az << 1) / 100;
         var61 = (var5 = aj + var61) + a[ad][0].getWidth() + var61;
         a[ad][0].getWidth();
         var14.setColor(0);
         a(var14, aj - (az << 1) / 100, var15 - (aA << 1) / 100, al + (az << 1 << 1) / 100, var69, 0, true);

         for (int var70 = ag; var70 < ag + var72; var70++) {
            int var74 = a[ad][var70];
            a(var14, a[ad][var74], var5, var3, 6);
            R = 5;
            if (ad == 2 || var74 == b[ad].length - 1) {
               R = 2;
            }

            a(a(b[ad][var74]), var14, var61, var3, 6);
            var3 += var4;
         }

         ai = ah - ag;
         ak = var15 + var4 * ai;
         am = var4;
         aI = var15;
         var14.setColor(16545540);
         var14.drawRoundRect(aj, ak, al, am, az * 5 / 100, aA * 5 / 100);
      } else if (Z == p) {
         var15 = az / 2;
         var3 = e;
         a(var0, c[p], var15, var3, 17);
         a = true;
         a(q, null, 0, 0, 0);
         c[Z].getHeight();
         if (a[0]) {
            R = 0;
         }

         a(a(r), var0, az - (b[4].getWidth() + 8 << 1), az >> 1, aA >> 1, 3);
      } else if (Z == l) {
         int var22 = aA >= 128;
         boolean var36 = J != null && J.length() > 0;
         var4 = 0;
         var22 = var22 ? b[10].getHeight() : 0;
         if (p) {
            a(var0, false);
            var4 = 2 * e + var22 + 1;
         }

         if (c[l].getWidth() >= 470) {
            var0.setColor(13421772);
            var0.fillRect(aB + 14 + 13, var4, 6, 20);
            var4 += 20;
         } else if (c[l].getWidth() > 310) {
            var0.setColor(13421772);
            var0.fillRect(aB + 14 + 2, var4, 4, 20);
            var4 += 20;
         } else if (c[l].getWidth() > 220) {
            var0.setColor(13421772);
            var0.fillRect(aB + 14, var4, 3, 20);
            var4 += 20;
         } else if (c[l].getWidth() > 140) {
            var0.setColor(14145495);
            var0.fillRect(aB + 8, var4, 2, 11);
            var4 += 11;
         } else if (c[l].getWidth() > 100) {
            var0.setColor(13487565);
            var0.fillRect(aB + 6, var4, 1, 10);
            var4 += 10;
         }

         var4 += c[l].getHeight() - 1;
         a(var0, c[l], aB, var4, 33);
         a(var0, a, aB + (c[l].getWidth() >> 1) + 1, var4, 40);
         if (var36) {
            R = 0;
            int var53 = var11 - var4;
            if (M << 1 > var53) {
               var4 += M / 3;
            } else {
               var4 += (var53 - M * ax) / 2;
            }

            var0.setColor(0);
            a(var0, aB - ay / 2, var4 - (aA << 1) / 100, ay, ax * M + (aA << 1 << 1) / 100, 0, true);
            a(J, var0, az, aB, var4, 17);
         }
      } else if (Z == o) {
         if (p) {
            a(var0, false);
         }

         var15 = (d + g) / 2;
         if (d) {
            var0.drawRegion(c[Z], 0, 0, c[Z].getWidth(), c[Z].getHeight(), 0, aB, var15, 10);
            var0.drawRegion(c[Z], 0, 0, c[Z].getWidth(), c[Z].getHeight(), 2, aB, var15, 6);
         } else {
            a(var0, c[Z], aB, var15, 3);
         }

         if (b == null) {
            a = true;
            a(a(ap), null, 0, 0, 0, 0);
            var15 -= S / 2;
            var3 = R;
            R = 0;
            a(a(ap), var0, c[Z].getWidth() / 2, aB, var15, 17);
            R = var3;
         } else {
            a(var0, b, aB, aA / 2, 3);
         }
      } else {
         a = true;
         a(a(ap), var0, 0, 0, 0, 0);
         var15 = c[Z].getHeight();
         var3 = 0;
         int var54;
         var54 = (var54 = az - 4) - (b[12].getWidth() << 1);
         if (T > var54) {
            var3 = b[12].getHeight();
         }

         var54 = var15 + S + var3;
         var4 = Math.max(0, aA - var54);
         int var67 = az <= 176 ? 2 : 0;
         if (S > (M << 1) + var67 && var4 / 3 > (M + var67) / 2) {
            var54 = var15 + (M << 1) + var3;
            var4 = Math.max(0, aA - var54);
         }

         int var71 = var4 / 3;
         if (var3 > 0) {
            var3 = aA - b[12].getHeight();
            var54 = var15 + S;
            var4 = Math.max(0, aA - var54);
            if (S > (M << 1) + var67 && var4 / 3 > S - (M + var67 << 1)) {
               var54 = var15 + (M << 1);
               var4 = Math.max(0, aA - var54);
            }

            var15 = var4 / 3;
            if (var15 * 2 + S + c[Z].getHeight() < var3) {
               var71 = var15;
            }
         }

         var3 = var71;
         var15 = var71;
         a(var0, c[Z], aB, var15, 17);
         var3 = (var3 + c[Z].getHeight() + var11 - S) / 2;
         if (a[0]) {
            R = 0;
         }

         R = 0;
         a(a(ap), var0, 0, aB, var3, 17);
      }

      if (an > 1) {
         var15 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
         byte var42 = 5;
         byte var50 = 7;
         if (e || aD == 23) {
            var42 = 4;
            W++;
         }

         if (f || aD == 24) {
            var50 = 6;
            W++;
         }

         int var60 = var15 + 1 + b[var42].getWidth();
         b[var42].getWidth();
         a(var0, b[var42], var60, aC, 10);
         a(var0, b[var50], az - var60, aC, 6);
         if (W > 4) {
            e = false;
            f = false;
            W = 0;
         }
      }
   }

   private static void a(Graphics var0, boolean var1) {
      int var2 = az * 3 / 100;
      int var3;
      int var4 = (var3 = e) + b[10].getHeight() + e;
      int var5 = az;
      int var6 = aA >= 400 ? 2 : 1;
      a(var0, b[10], var2, var3, 20);
      if (var1) {
         R = 0;
         a(ap, var0, var5, var4 - e + 3, 40);
      }

      var0.setColor(10862283);

      for (var1 = 0; var1 < var6; var1++) {
         var0.drawLine(0, var4 + var1, var5, var4 + var1);
      }

      g = var4 + var1;
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      var5 = var6 ? -1 : 1;
      if (var3 % 2 == 0) {
         var3--;
      }

      var0.setColor(16545540);
      a(var0, var1, var2, var1 - (var3 >> 1), var2 + var5 * (var3 >> 1), var1 + (var3 >> 1), var2 + var5 * (var3 >> 1));
      var0.setColor(var4);
      a(var0, var1, var2 + var5, var1 - (var3 >> 1) + 2, var2 + var5 * (var3 >> 1) - var5, var1 + (var3 >> 1) - 2, var2 + var5 * (var3 >> 1) - var5);
   }

   private static void c(Graphics var0) {
      if (!j) {
         int var1 = aA - 2;
         int var2 = b;
         int var3 = az - c;
         int var4 = b[9].getHeight();
         d = var1 - var4;
         aq = aA - var1;
         Image var9 = b[12];
         Image var5 = b[12];
         if (aD == 26) {
            var5 = b[13];
         }

         b = (byte)(b | 2);
         a = (byte)(a | 2);
         if ((b & 1) != 0) {
            a(var0, var9, var2, var1, 36);
         }

         if ((b & 2) != 0) {
            a(var0, var5, var3, var1, 40);
         }

         var2 += b[12].getWidth() / 2 - b[9].getWidth() / 2;
         var3 += -b[12].getWidth() / 2 + b[8].getWidth() / 2;
         var1 += -b[12].getHeight() / 2 + b[9].getHeight() / 2;
         if (((a = (byte)(a | 2)) & 1) != 0) {
            a(var0, b[9], var2, var1, 36);
         }

         if ((a & 2) != 0) {
            a(var0, b[8], var3, var1, 40);
         }
      }
   }

   private static Image b(byte[] var0, int var1, int var2, int var3, int var4) {
      var1 = 0;

      for (int var13 = 2; var1 == 0 && var13 < var2 + 2; var13++) {
         if ((var0[var13] & 255) == 80 && (var0[var13 + 1] & 255) == 76 && (var0[var13 + 2] & 255) == 84 && (var0[var13 + 3] & 255) == 69) {
            var1 = var13;
         }
      }

      var3 = (var0[var1 - 4] << 24 & 0xFF000000) + (var0[var1 - 3] << 16 & 0xFF0000) + (var0[var1 - 2] << 8 & 0xFF00) + (var0[var1 - 1] & 255);
      var0[var1 + 4 + 3] = (byte)(var4 >> 16 & 0xFF);
      var0[var1 + 4 + 3 + 1] = (byte)(var4 >> 8 & 0xFF);
      var0[var1 + 4 + 3 + 2] = (byte)var4;
      byte[] var15 = new byte[var3 + 4];
      System.arraycopy(var0, var1, var15, 0, var3 + 4);
      long[] var5 = new long[256];

      for (int var6 = 0; var6 < 256; var6++) {
         long var7 = var6;

         for (int var9 = 0; var9 < 8; var9++) {
            if ((var7 & 1L) == 1L) {
               var7 = 3988292384L ^ var7 >> 1;
            } else {
               var7 >>= 1;
            }
         }

         var5[var6] = var7;
      }

      long var17 = 4294967295L;

      for (int var16 = 0; var16 < var15.length; var16++) {
         var17 = var5[(int)(var17 ^ var15[var16]) & 0xFF] ^ var17 >> 8;
      }

      var17 ^= 4294967295L;
      var0[var1 + 4 + var3] = (byte)((var17 & -16777216L) >> 24);
      var0[var1 + 4 + var3 + 1] = (byte)((var17 & 16711680L) >> 16);
      var0[var1 + 4 + var3 + 2] = (byte)((var17 & 65280L) >> 8);
      var0[var1 + 4 + var3 + 3] = (byte)(var17 & 255L);
      System.gc();
      var2 = var2;
      byte var11 = 2;
      return Image.createImage(var0, var11, var2);
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.fillTriangle(var1, var2, var3, var4, var5, var6);
   }

   private static void a(Graphics var0, Image var1, int var2, int var3, int var4) {
      var0.drawImage(var1, var2, var3, var4);
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (aA >= 176) {
         var4 += 2;
      } else {
         var4++;
      }

      Image var8 = d[var5];
      var0.fillRect(var1 + var8.getWidth(), var2, var3 - 2 * var8.getWidth(), var4);
      var0.fillRect(var1, var2 + var8.getHeight(), var3, var4 - 2 * var8.getHeight() + 1);
      var0.drawRegion(var8, 0, 0, var8.getWidth(), var8.getHeight(), 0, var1, var2, 20);
      var0.drawRegion(var8, 0, 0, var8.getWidth(), var8.getHeight(), 5, var1 + var3 - var8.getWidth(), var2, 20);
      var0.drawRegion(var8, 0, 0, var8.getWidth(), var8.getHeight(), 3, var1 + var3 - var8.getWidth(), var2 + var4, 36);
      var0.drawRegion(var8, 0, 0, var8.getWidth(), var8.getHeight(), 6, var1, var2 + var4, 36);
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      var1 = Math.max(var1, 0);
      var2 = Math.max(var2, 0);
      var3 = Math.min(var3, az);
      var4 = Math.min(var4, aA);
      var0.setClip(var1, var2, var3, var4);
   }

   public final void run() {
   }

   private static boolean e() {
      if (l) {
         if (h) {
            return g;
         }

         try {
            RecordStore.openRecordStore("igp19", false).closeRecordStore();
            g = true;
         } catch (Exception var1) {
         }

         h = true;
      }

      return g;
   }

   private static void g() {
      if (d != null && d.length() > 0) {
         String var0 = d;
         d = null;

         try {
            var0 = var0;
            a.platformRequest(var0);
            Thread.sleep(200L);
         } catch (Exception var1) {
         }

         if (!t) {
            X = 1;
            return;
         }

         X = 4;
      }
   }

   public static boolean a(Graphics var0, Image var1, int var2, int var3, int var4) {
      if (e()) {
         return false;
      }

      if (l && var1 != null && var0 != null) {
         if (System.currentTimeMillis() - a > 800L) {
            i = !i;
            a = System.currentTimeMillis();
         }

         if (i) {
            a(var0, var1, var2, var3, 0);
            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (j) {
         if (var1 == a) {
            a(25);
            return;
         }

         if (var1 == b) {
            a(26);
         }
      }
   }

   private static InputStream a(String var0) {
      return "a".getClass().getResourceAsStream(var0);
   }

   private static void h() {
      int var0 = az - (2 * b[5].getWidth() + b[5].getWidth() / 4 + 8);
      if (az > aA) {
         var0 -= b[5].getWidth() / 2;
      }

      int var1 = (az << 1) / 100;
      b[11].getWidth();
      var0 = var0 - var1 * 2 - b[11].getWidth();

      try {
         for (int var13 = 0; var13 < f.length; var13++) {
            if ((f[var13] == null || var13 != q - 1)
               && f[var13] != null
               && (var13 == s || var13 == u || var13 == y || var13 == r || var13 < q || var13 >= D && var13 < F + d.length)) {
               int var2;
               int var3;
               label170: {
                  var2 = az - 4;
                  var3 = var13 == r ? 4 : 3;
                  int var10000;
                  if ((c.length <= 1 || var13 < D || var13 >= D + c.length) && (d.length <= 1 || var13 < F || var13 >= F + d.length) && var13 != r) {
                     if (var13 != s && var13 != u && var13 != y) {
                        if (var13 != q - 1) {
                           break label170;
                        }

                        var10000 = c[o] != null ? c[o].getWidth() >> 1 : az;
                     } else {
                        var3 = 2;
                        var10000 = az - (b[12].getWidth() << 1);
                     }
                  } else {
                     var10000 = var0;
                  }

                  var2 = var10000;
               }

               String[] var23 = f;
               String var10002 = f[var13];
               boolean var14 = true;
               int var4 = var3;
               var3 = var2;
               String var15 = var10002;
               String var5 = "";
               int var6 = 0;
               int var7 = 0;
               String var16 = var15;
               String var8 = "";
               char[] var9 = var16.toCharArray();

               for (int var10 = 0; var10 < var16.length(); var10++) {
                  if (var9[var10] == '，' || var9[var10] == '！' || var9[var10] == '？' || var9[var10] == '；' || var9[var10] == '：') {
                     var8 = var8 + var9[var10];
                     var8 = var8 + '|';
                  } else if (var9[var10] == '\b') {
                     var8 = var8 + '|';
                  } else if (var9[var10] == '\n') {
                     var8 = var8 + ' ';
                  } else {
                     var8 = var8 + var9[var10];
                  }
               }

               if (b[aw].equals("ZH-TW") && var8.indexOf(124) == -1 && var8.indexOf(32) == -1 && var8.length() > 5) {
                  var8 = var8.substring(0, var8.length() >> 1) + "|" + var8.substring(var8.length() >> 1, var8.length());
               }

               String var17 = var8;
               short[] var19 = a(var8, var3, true);
               char[] var21 = var17.toCharArray();

               for (int var22 = 0; var22 < var19[0]; var22++) {
                  if (var6 != 0) {
                     var7++;
                     var5 = var5.trim();
                     if (var7 >= var4) {
                        break;
                     }

                     var5 = var5 + "\n";
                  }

                  var5 = var5 + var17.substring(var6, var19[(var22 << 1) + 1]);
                  var6 = var19[(var22 << 1) + 1];
                  if (var17.length() != var6 && var21[var19[(var22 << 1) + 1]] == '\n') {
                     var6++;
                  }
               }

               var23[var13] = var5;
               f[var13] = a(f[var13]);
            }
         }
      } catch (Exception var11) {
      }
   }

   private static short[] a(String var0, int var1, boolean var2) {
      int var3 = var0.length();
      short var4 = 0;
      short var5 = 1;
      short var6 = 0;
      boolean var7 = false;
      short var8 = 0;
      char[] var9 = var0.toCharArray();

      for (int var10 = 0; var10 < var3; var10++) {
         char var13;
         if ((var13 = var9[var10]) == ' ') {
            var4 = (short)(var4 + a(var13, P));
            short var14 = var6;
            var6 = (short)var10;
            var7 = true;
            var8 = 0;
            if (var6 == var3 - 2 && var4 + a(var9[var6 + 1], P) > var1) {
               if (var14 != 0) {
                  var6 = var14;
               }

               b[var5++] = (short)(var6 + 1);
               b[var5++] = (short)var4;
               var4 = 0;
            }

            boolean var11;
            if (var11 = var4 > var1) {
               var7 = false;

               for (int var12 = var6; var12 >= 0 && var9[var12] == ' '; var4 = (short)(var4 - a(32, P))) {
                  var12--;
               }

               int var23;
               for (var23 = 0; var6 < var3 && var9[var6] == ' '; var23++) {
                  var6++;
               }

               if (var23 == 1 && var10 == var3 - 2) {
                  var6 = var14;
               } else {
                  var10 = --var6;
               }
            }

            if (var11) {
               b[var5++] = (short)(var6 + 1);
               b[var5++] = (short)var4;
               var4 = 0;
            }
         } else if (var13 == '|') {
            if (!var2) {
               break;
            }

            var4 = (short)(var4 + a(var13, P));
            var6 = (short)var10;
            var7 = true;
            var8 = 0;
            if (var4 > var1) {
               var7 = false;

               for (int var21 = var6; var21 >= 0 && var9[var21] == ' '; var4 = (short)(var4 - a(32, P))) {
                  var21--;
               }

               while (var6 < var3 && var9[var6] == ' ') {
                  var6++;
               }

               var10 = --var6;
               b[var5++] = (short)(var6 + 1);
               b[var5++] = (short)var4;
               var4 = 0;
            }
         } else if (var13 == '\n') {
            b[var5++] = (short)var10;
            b[var5++] = var4;
            var4 = 0;
            var8 = 0;
         } else {
            int var22 = a(var13, P) + h;
            var8 = (short)(var8 + var22);
            if ((var4 = (short)(var4 + var22)) > var1 && var7) {
               var7 = false;

               for (int var24 = var6; var24 >= 0 && var9[var24] == ' '; var4 = (short)(var4 - a(32, Q))) {
                  var24--;
               }

               b[var5++] = (short)(var6 + 1);
               b[var5++] = (short)(var4 - var8);
               var4 = 0;
               var10 = var6;
            }
         }
      }

      if (var4 != 0) {
         b[var5++] = (short)var3;
         b[var5++] = var4;
      }

      b[0] = (short)(var5 / 2);
      return b;
   }

   private static String a(String var0) {
      String var1 = "";
      char[] var2 = var0.toCharArray();

      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (var2[var3] != '|') {
            var1 = var1 + var2[var3];
         }
      }

      return var1;
   }

   static {
      b = "IGP-Signature=" + a;
      a = new String[]{e + "-" + f, e + "-" + g, e};
   }
}
