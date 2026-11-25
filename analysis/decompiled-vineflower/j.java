import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public abstract class j extends Canvas implements Runnable {
   public static Graphics b = null;
   private static Graphics a = null;
   private static Graphics c = null;
   static boolean h;
   private static int a;
   private static long a;
   private static int b = 640;
   private static int c = 360;
   static Display a;
   private static boolean a;
   static MIDlet a;
   private static int d = 40;
   private long b;
   private static int e = -1;
   private static Image a = null;
   private static Graphics d = null;
   private static boolean b = true;
   static int a_;
   private static long c;
   static int b_;
   static int c_;
   static j a;
   private static boolean c = false;
   private static String a = null;
   private static byte[] a;
   private static byte[] b;
   private static int f = -9999;
   private static int g;
   private static Hashtable a;
   private static Hashtable b;
   private static int h = 25;
   private static int i = 500;
   private static int j = 5;
   private static int k = 65280;
   private static int l = 0;
   private static boolean d = false;
   private static boolean e = true;
   private static int m = -1;
   private static int n = 256;
   private static Random a;
   static int d_;
   static int bC;
   private static int[] a;
   private static int o = 256;
   private static int p = a(90);
   private static int q = a(180);
   private static int r = a(270);
   private static int s = a(360);
   private static int t = 804;
   private static InputStream a;
   private static boolean f;
   private static String b;
   private static int u;
   private static int v;
   private static int[] b;
   private static String c;
   private static InputStream b;
   private static int w;
   private static byte[] c;
   private static int x;
   private static int y;
   private static short a;
   static int bD;
   private static boolean g;
   private static byte[][] a;
   private static long d;
   private static int z = 0;
   private static int A = 0;
   private static String d = "UTF-8";
   private static int[] c;
   private static byte[][] b;
   private static int[] d;
   private static int[][] a;
   private static RecordStore a;
   private static int B = 200;
   private static int C;
   private static int[] e;
   private static int[][] b;
   private static Image[] a;
   private static boolean k = false;
   static final boolean i = true;
   private static boolean l = false;
   private static int D = 0;
   private static int[][] c = null;
   static boolean j;
   static int bE;
   static int bF;
   static int bG;
   static int bH;
   private static Image b = null;
   private static Graphics e = null;
   private static Image c = null;
   private static int E = 0;
   private static int F = 0;
   private static int G;
   private static int H;
   private static int I;
   private static int J;
   private static int K;
   private static int L;
   private static int M;
   private static boolean m;
   private static boolean n;
   private static boolean o;

   abstract void c();

   public j(Object var1, Object var2) {
      a = this;
      a = -1;
      a = true;
      a = (MIDlet)var1;
      a = (Display)var2;
      this.d();
      b = new Hashtable();
      (a = new Hashtable()).put(new Integer(48), new Integer(6));
      a.put(new Integer(49), new Integer(7));
      a.put(new Integer(50), new Integer(1));
      a.put(new Integer(51), new Integer(9));
      a.put(new Integer(52), new Integer(3));
      a.put(new Integer(53), new Integer(5));
      a.put(new Integer(54), new Integer(4));
      a.put(new Integer(55), new Integer(13));
      a.put(new Integer(56), new Integer(2));
      a.put(new Integer(57), new Integer(15));
      a.put(new Integer(35), new Integer(17));
      a.put(new Integer(42), new Integer(16));
      a.put(new Integer(-7), new Integer(18));
      a.put(new Integer(-6), new Integer(19));
      a.put(new Integer(-8), new Integer(24));
      b.put(new Integer(-5), new Integer(5));
      b.put(new Integer(-1), new Integer(1));
      b.put(new Integer(-2), new Integer(2));
      b.put(new Integer(-3), new Integer(3));
      b.put(new Integer(-4), new Integer(4));
      c = System.currentTimeMillis();
      this.b = c;
   }

   protected final void i() {
      if (a < 0) {
         b = 640;
         c = 360;
         a = new byte[h];
         b = new byte[h];
         I = 0;
         long var2 = System.currentTimeMillis();
         if (a == null) {
            a = new Random(var2);
         } else {
            a.setSeed(var2);
         }

         a = 0;
         new Thread(this).start();
      }
   }

   protected void a() {
      if (!h) {
         h = true;
         p.f();
      }
   }

   protected void b() {
      if (h) {
         long var1;
         a = var1 = System.currentTimeMillis();
         c = var1;
         this.b = var1;
         h = false;
         this.d();
         if (!a) {
            this.repaint();
         }

         k();
      }
   }

   public void hideNotify() {
      this.a();
   }

   public void showNotify() {
      this.b();
   }

   public void sizeChanged(int var1, int var2) {
      b = var1;
      c = var2;
   }

   private void d() {
      this.setFullScreenMode(true);
      if (a != null && a.getCurrent() != this) {
         a.setCurrent(this);
      }
   }

   protected static final void j() {
      a = -1;
   }

   public void run() {
      try {
         this.d();
         a = false;

         while (a >= 0) {
            if (!h) {
               this.repaint();
               this.serviceRepaints();
               long var1 = System.currentTimeMillis();
               this.b = Math.min(this.b, var1);
               if (e >= 0) {
                  if (e == 0) {
                     Thread.yield();
                  } else {
                     Thread.sleep(e);
                  }
               } else {
                  Thread.sleep(Math.max(1L, d - (var1 - this.b)));
               }

               this.b = System.currentTimeMillis();
            } else {
               this.b = Math.min(this.b, System.currentTimeMillis());
               Thread.sleep(1L);
            }
         }
      } catch (Exception var3) {
         a = -1;
      }

      a = null;
      b = null;
      a = null;
      System.gc();
      a.notifyDestroyed();
   }

   public void paint(Graphics var1) {
      var1 = var1;
      this = this;
      c = var1;
      if (!h && !a) {
         a = true;

         for (int var2 = 0; var2 < h; var2++) {
            a[var2] = b[var2];
            if (b[var2] != 0) {
               if (b[var2] < 0) {
                  b[var2] = 0;
               } else if (b[var2] < 126) {
                  b[var2]++;
                  if (var2 >= 18) {
                     b[var2] = (byte)(-b[var2]);
                  }
               }
            }
         }

         if (g > 0) {
            if (g != Integer.MAX_VALUE) {
               g = g - a_;
            }

            k();
         }

         switch (I) {
            case 0:
            case 3:
            default:
               break;
            case 1:
               b(4);
               break;
            case 2:
               b(0);
         }

         if (m) {
            b(1);
            m = false;
         } else if (n) {
            b(2);
            n = false;
            o = false;
         } else if (o) {
            b(3);
            o = false;
         }

         L = J;
         M = K;
         if ((a_ = (int)((a = System.currentTimeMillis()) - c)) < 0) {
            a_ = 0;
         }

         if (a_ > 1000) {
            a_ = 1000;
         }

         c = a;
         b_ = b_ + a_;
         c_++;

         try {
            a = var1;
            b = var1;
            this.c();
         } catch (Exception var3) {
            a = -1;
         }

         if (Runtime.getRuntime().freeMemory() < 20000) {
            System.gc();
         }

         a = false;
         c = null;
      }
   }

   protected void keyPressed(int var1) {
      byte var2 = a(var1);
      if (b != null) {
         if (b[var2] <= 0) {
            if (b[var2] < 0) {
               b[var2] = 0;
            }

            if (b[var2] < 126) {
               b[var2]++;
            }
         }
      }
   }

   protected void keyReleased(int var1) {
      byte var2 = a(var1);
      if (b != null) {
         if (b[var2] > 0) {
            b[var2] = (byte)(-b[var2]);
         }
      }
   }

   public static void a(boolean var0, int var1, int var2) {
      Integer var5 = new Integer(var1);
      Hashtable var4 = a;
      if ((Integer)a.get(var5) != null) {
         var4.remove(var5);
      }

      var4.put(var5, new Integer(var2));
   }

   private static byte a(int var0) {
      Integer var2 = new Integer(var0);
      if (a == null) {
         return 0;
      } else {
         Integer var1;
         if ((var1 = (Integer)a.get(var2)) != null) {
            return var1.byteValue();
         } else {
            return (var1 = (Integer)b.get(var2)) != null ? var1.byteValue() : 0;
         }
      }
   }

   public static void k() {
      if (a != null && b != null) {
         for (int var0 = 0; var0 < h; var0++) {
            a[var0] = 0;
            b[var0] = 0;
         }
      }
   }

   public static int c() {
      int var0 = h;

      while (--var0 >= 0) {
         if (a[var0] < 0) {
            return var0;
         }
      }

      return -1;
   }

   public static boolean a(int var0) {
      return a[var0] < 0;
   }

   static void a(String var0) {
   }

   static void a(String var0, int var1, int var2) {
      e(var0);
      a = (int[])a(1);
      a(0);
      l();
   }

   static final int c(int var0) {
      return var0 << 8;
   }

   static final int d(int var0) {
      return var0 + 128 >> 8;
   }

   static int b(int var0, int var1, int var2) {
      var0 = var0 * var0 + var1 * var1;
      var1 = 1;

      for (int var5 = 0; var5 < 30; var5++) {
         var1 = var1 + var0 / var1 >> 1;
      }

      return var1;
   }

   static int b(int var0, int var1) {
      if (var1 != var0) {
         int var2;
         if ((var2 = a.nextInt()) < 0) {
            var2 = -var2;
         }

         return var0 + var2 % (var1 - var0);
      } else {
         return var1;
      }
   }

   private static int a(int var0) {
      return var0 * o / 360;
   }

   private static final int a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (var0 * var4 + var1 * 2 * var3 + var2 * var5) / (1 << 16);
   }

   static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = var6 * var6;
      int var7;
      int var8 = (var7 = n - var6) * var7;
      var7 *= var6;
      d_ = a(var0, var2, var4, var7, var8, var9);
      bC = a(var1, var3, var5, var7, var8, var9);
   }

   static final int c(int var0, int var1) {
      return var0 + var1;
   }

   static final int d(int var0, int var1) {
      return (int)(((long)var0 << 8 << 1) / var1 + 1L) >> 1;
   }

   static final int e(int var0) {
      return Math.abs(var0);
   }

   private static void e(String var0) {
      if (a == null || var0 == null || var0.compareTo(b) != 0) {
         w = 1;
         byte var1 = 0;
         a(var0, var1, null, 0);
      }
   }

   private static InputStream a(String var0, int var1, byte[] var2, int var3) {
      c = var0;
      c = null;
      x = 0;
      if (a != null) {
         if (var0 != null && var0.compareTo(b) == 0) {
            if (u == var1) {
               return a;
            }

            e();
         } else {
            f();
         }
      }

      if (a == null) {
         try {
            if (var1 > 0) {
               var0 = var0 + "." + var1;
            }

            InputStream var7 = b(var0);
            u = var1;
            f = var7.markSupported();
            if (var1 != 0) {
               y = 0;
            } else {
               b = var0;
               v = var7.available();
               int var5;
               a = (short)(var5 = (var7.read() & 0xFF) + ((var7.read() & 0xFF) << 8));
               var7.available();
               b = new int[var5];

               for (int var8 = 0; var8 < var5; var8++) {
                  var1 = (var7.read() & 0xFF) + ((var7.read() & 0xFF) << 8) + ((var7.read() & 0xFF) << 16) + ((var7.read() & 0xFF) << 24);
                  b[var8] = var1;
               }

               y = b[0];
            }

            a = var7;
         } catch (Throwable var4) {
         }
      }

      return a;
   }

   private static void e() {
      try {
         if (a != null) {
            try {
               a.close();
            } catch (Throwable var0) {
            }

            a = null;
            b = null;
         }
      } catch (Throwable var1) {
      }
   }

   private static void f() {
      e();
      b = null;
      b = null;
   }

   private static int b(int var0) {
      int var1 = b[var0];
      var0 = b[var0 + 1] - var1 - 1;
      int var2 = 0;

      try {
         while (var1 > v) {
            var1 -= v;
            var2++;
         }

         int var4 = var2;
         String var3 = b;
         InputStream var7;
         (var7 = a(b, var4, null, 0)).available();
         if (y > var1) {
            e();
            var4 = var2;
            var3 = b;
            var7 = a(b, var4, null, 0);
         }

         var7.skip(var1 - y);
         bD = (byte)var7.read() & 255;
         g = false;
         y = var1 + 1;
      } catch (Throwable var5) {
      }

      return var0;
   }

   private static byte[] a(String var0, int var1, boolean var2) {
      byte[] var8 = null;
      e(var0);

      try {
         var1 = b(var1);
         InputStream var3 = a;
         int var4 = a.available();
         int var5 = 0;
         var8 = new byte[var1];

         while (var1 > 0) {
            int var9 = a(var3, var8, var5, Math.min(var1, var4));
            var5 += var9;
            y += var9;
            if ((var1 -= var9) == 0 || var9 == -1) {
               break;
            }

            var4 = u + 1;
            var4 = (var3 = a(var0, var4, null, 0)).available();
         }
      } catch (Throwable var6) {
      }

      return var8;
   }

   private static int a(InputStream var0, byte[] var1, int var2, int var3) {
      try {
         return var0.read(var1, var2, var3);
      } catch (Exception var4) {
         return -1;
      }
   }

   private static InputStream a(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }

   static final void b(String var0) {
      e(var0);
   }

   private static InputStream b(String var0) {
      InputStream var1 = null;
      if (w == 3) {
         var1 = new ByteArrayInputStream(c, x, c.length - x);
      } else if (w != 2 && w == 1) {
         var1 = a(var0);
      }

      return var1;
   }

   static final void l() {
      f();
      if (w == 3) {
         c = null;
      }

      System.gc();
   }

   static int f(int var0) {
      var0 = b(var0);
      int var1 = 0;
      b = a;

      try {
         var1 = a.available();
      } catch (Throwable var2) {
      }

      if (var0 > var1) {
         var0 = var1;
      }

      return var0;
   }

   static final byte[] a(int var0) {
      var0 = var0;
      return a(b, var0, false);
   }

   static int d() {
      int var0 = 0;

      try {
         var0 = b.read();
      } catch (Exception var1) {
      }

      y++;
      return var0;
   }

   static int e() {
      return d() & 0xFF | (d() & 0xFF) << 8;
   }

   static int f() {
      return d() & 0xFF | (d() & 0xFF) << 8 | (d() & 0xFF) << 16 | (d() & 0xFF) << 24;
   }

   private static int b(byte[] var0, int var1, int var2) {
      var1 = 0;
      int var3 = var2;

      try {
         while (var3 > 0) {
            int var4 = b.read(var0, var1, var3);
            var3 -= var4;
            var1 += var4;
         }
      } catch (Exception var5) {
      }

      y += var2;
      return var2;
   }

   static final Object a(int var0) {
      return a(new ByteArrayInputStream(a(var0)));
   }

   static void c(String var0) {
      if (a == null) {
         InputStream var1 = b;
         b = b(var0);
         int var5;
         a = new byte[var5 = d()][];

         for (int var2 = 0; var2 < var5; var2++) {
            int var3 = d();
            a[var2] = new byte[var3];
            b(a[var2], 0, var3);
         }

         try {
            b.close();
         } catch (Exception var4) {
         }

         b = var1;
      }
   }

   static String c(int var0) {
      if (var0 >= a.length) {
         return "";
      }

      try {
         return new String(a[var0], "UTF-8");
      } catch (Exception var1) {
         return "";
      }
   }

   static final void a(Graphics var0) {
      b = a;
   }

   static final int g() {
      return b;
   }

   static final int h() {
      return c;
   }

   static final void m() {
      System.gc();
   }

   static final void f(int var0) {
      b.setColor(var0);
   }

   static final void a(Graphics var0, int var1) {
      var0.setColor(var1);
   }

   private static void a(Graphics var0, int var1, int var2, int var3) {
      var0.setColor(var1 << 16 | var2 << 8 | var3);
   }

   static final int i() {
      Graphics var0 = b;
      boolean var1 = true;
      var0 = b;
      return b.getClipX();
   }

   static final int j() {
      Graphics var0 = b;
      boolean var1 = true;
      var0 = b;
      return b.getClipY();
   }

   static final int k() {
      Graphics var0 = b;
      boolean var1 = true;
      var0 = b;
      return b.getClipWidth();
   }

   static final int l() {
      Graphics var0 = b;
      boolean var1 = true;
      var0 = b;
      return b.getClipHeight();
   }

   static final void a(int var0, int var1, int var2, int var3) {
      a(b, var0, var1, var2, var3);
   }

   static final int a(Graphics var0) {
      boolean var1 = true;
      return var0.getClipX();
   }

   static final int b(Graphics var0) {
      boolean var1 = true;
      return var0.getClipY();
   }

   static final int c(Graphics var0) {
      boolean var1 = true;
      return var0.getClipWidth();
   }

   static final int d(Graphics var0) {
      boolean var1 = true;
      return var0.getClipHeight();
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      boolean var5 = true;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      Graphics var6 = var0;
      var0.setClip(var1, var2, var3, var4);
      var6.clipRect(var1, var2, var3, var4);
   }

   static final boolean a(Graphics var0) {
      return var0 != null;
   }

   static final void b(int var0, int var1, int var2, int var3) {
      b(b, var0, var1, var2, var3);
   }

   static final void b(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawLine(var1, var2, var3, var4);
   }

   static final void c(int var0, int var1, int var2, int var3) {
      c(b, 0, 0, var2, var3);
   }

   static final void c(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.fillRect(var1, var2, var3, var4);
   }

   static final void d(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawRect(var1, var2, var3, var4);
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.fillArc(var1, var2, var3, var4, var5, var6);
   }

   static final void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.drawArc(var1, var2, var3, var4, var5, var6);
   }

   static final void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      b(var0, var1, var2, var3, var4);
      b(var0, var1, var2, var5, var6);
      b(var0, var5, var6, var3, var4);
      var0.fillTriangle(var1, var2, var3, var4, var5, var6);
   }

   static final Image a(int[] var0, int var1, int var2, boolean var3) {
      return Image.createRGBImage(var0, var1, var2, true);
   }

   static final void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, true, 0);
   }

   static final void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10) {
      byte var11 = -1;
      var10 = var10;
      var9 = var9;
      var8 = var8;
      var7 = var7;
      var6 = var6;
      var5 = var5;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -1, true);
   }

   static final void a(
      Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10, int var11, boolean var12
   ) {
      if (var10 != 0) {
         var9 = 0;
         if ((var10 & 4) != 0) {
            var9 = var6;
            var6 = var7;
            var7 = var3;
            var3 = var6;
         }

         var1 = e.a(var1, var6, var7, var10);
         if ((var10 & 4) != 0) {
            var7 = var9;
         }
      }

      if (var0 == a) {
         int var10003 = var2 % var3;
         int var10004 = var2 / var3;
         boolean var22 = (boolean)var8;
         var8 = var7;
         var7 = var6;
         var6 = var5;
         var5 = var4;
         var4 = var10004;
         int var15 = var10003;
         var2 = var3;
         var1 = var1;
         a(var0, b, c, var1, var2, var15, var4, var5, var6, var7, var8, var22);
      } else {
         a(
            var0,
            var0.getClipX() + var0.getClipWidth(),
            var0.getClipY() + var0.getClipHeight(),
            var1,
            var3,
            var2 % var3,
            var2 / var3,
            var4,
            var5,
            var6,
            var7,
            (boolean)var8
         );
      }
   }

   private static void a(Graphics var0, int var1, int var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      int var12 = 0;
      int var13 = 0;
      var12 = var0.getTranslateX();
      var13 = var0.getTranslateY();
      var0.translate(-var12, -var13);
      var7 += var12;
      var8 += var13;
      var5 += var6 * var4;
      if (var7 < var1 && var7 + var9 > 0 && var8 < var2 && var8 + var10 > 0) {
         var6 = i();
         int var14 = j();
         int var15 = k();
         int var16 = l();
         if (var6 < var1 && var6 + var15 > 0 && var14 < var2 && var14 + var16 > 0) {
            if (var7 <= 0) {
               var5 -= var7;
               var9 += var7;
               var7 = 0;
            }

            if (var7 + var9 >= var1) {
               var9 = var1 - var7;
            }

            if (var8 + var10 >= var2) {
               var10 = var2 - var8;
            }

            if (var8 <= 0) {
               var5 -= var8 * var4;
               var10 += var8;
               var8 = 0;
            }

            if (var5 > 0) {
               int[] var22;
               if ((var22 = e.a(var3)).length >= var3.length - var5) {
                  System.arraycopy(var3, var5, var22, 0, var3.length - var5);
               } else {
                  var14 = var22.length / var4;
                  var15 = var10 / var14 + (var10 % var14 == 0 ? -1 : 0);
                  var1 = (var16 = var4 * var14) - var5 % var4;
                  var2 = var8 + var10;

                  while (var15-- > 0) {
                     System.arraycopy(var3, var5, var22, 0, var1);
                     var0.drawRGB(var22, 0, var4, var7, var8, var9, var14, var11);
                     var8 += var14;
                     var5 += var16;
                  }

                  if (var8 + var14 > var2) {
                     var2 = var8 + var14 - var2;
                     var14 -= var2;
                     var1 -= var4 * var2;
                  }

                  System.arraycopy(var3, var5, var22, 0, var1);
                  var10 = var14;
               }

               var3 = var22;
               var5 = 0;
            }

            var0.drawRGB(var3, var5, var4, var7, var8, var9, var10, var11);
            var0.translate(var12, var13);
         }
      }
   }

   static void d(int var0) {
      try {
         if (d < a) {
            a.vibrate(var0);
            d = a + 200L;
         }
      } catch (Exception var1) {
      }
   }

   static final Image a(byte[] var0, int var1, int var2) {
      Image var6;
      var1 = (var6 = Image.createImage((byte[])var0, 0, var2)).getWidth();
      var2 = var6.getHeight();
      int var3 = var1 * var2;
      Image var4;
      Graphics var5;
      (var5 = (var4 = Image.createImage(var1, var2)).getGraphics()).setColor(16711935);
      var5.fillRect(0, 0, var1, var2);
      var5.drawImage(var6, 0, 0, 0);
      var0 = e.a;
      if (e.a == null || var0.length < var3) {
         var0 = new int[var3];
      }

      a(var4, var0, 0, var1, 0, 0, var1, var2);
      var3--;

      for (; var3 >= 0; var3--) {
         if ((var0[var3] & 16777215) == 16711935) {
            var0[var3] = 16711935;
         }
      }

      return Image.createRGBImage(var0, var1, var2, true);
   }

   static final void a(Image var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.getRGB(var1, var2, var3, var4, var5, var6, var7);
      int var8 = var2 + var6 * var7;

      while (var8-- > var2) {
         if ((var1[var8] & 16777215) == 16711935) {
            var1[var8] = 16711935;
         }
      }
   }

   static int a(byte[] var0, int var1, byte var2) {
      var0[var1++] = var2;
      return var1;
   }

   static int a(byte[] var0, int var1, int var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      var0[var1++] = (byte)(var2 >>> 16);
      var0[var1++] = (byte)(var2 >>> 24);
      return var1;
   }

   static short a(byte[] var0, int var1) {
      return (short)(var0[var1++] & 0xFF | (var0[var1] & 255) << 8);
   }

   static int a(byte[] var0, int var1) {
      return var0[var1++] & 0xFF | (var0[var1++] & 0xFF) << 8 | (var0[var1++] & 0xFF) << 16 | (var0[var1] & 0xFF) << 24;
   }

   private static Object a(InputStream var0) {
      Object[] var1 = null;

      try {
         int var2;
         int var3 = (var2 = a(var0)) >> 4;
         int var4 = var2 & 7;
         if ((var2 & 8) != 0) {
            var2 = b(var0);
         } else {
            var2 = a(var0);
         }

         switch (var4) {
            case 0:
               byte[] var18 = new byte[var2];

               for (int var13 = 0; var13 < var2; var13++) {
                  var18[var13] = (byte)a(var0);
               }

               var1 = var18;
               break;
            case 1:
               short[] var17 = new short[var2];
               if (var3 == 0) {
                  for (int var12 = 0; var12 < var2; var12++) {
                     var17[var12] = (byte)a(var0);
                  }
               } else {
                  for (int var11 = 0; var11 < var2; var11++) {
                     var17[var11] = (short)b(var0);
                  }
               }

               var1 = var17;
               break;
            case 2:
               int[] var16 = new int[var2];
               if (var3 == 0) {
                  for (int var10 = 0; var10 < var2; var10++) {
                     var16[var10] = (byte)a(var0);
                  }
               } else if (var3 == 1) {
                  for (int var9 = 0; var9 < var2; var9++) {
                     var16[var9] = (short)b(var0);
                  }
               } else {
                  for (int var8 = 0; var8 < var2; var8++) {
                     var16[var8] = c(var0);
                  }
               }

               var1 = var16;
               break;
            default:
               Object[] var15;
               switch (var4 = var4 & 3) {
                  case 0:
                     if (var3 == 2) {
                        var15 = (Object[])(new byte[var2][]);
                     } else {
                        var15 = (Object[])(new byte[var2][][]);
                     }
                     break;
                  case 1:
                     if (var3 == 2) {
                        var15 = (Object[])(new short[var2][]);
                     } else {
                        var15 = (Object[])(new short[var2][][]);
                     }
                     break;
                  default:
                     if (var3 == 2) {
                        var15 = (Object[])(new int[var2][]);
                     } else {
                        var15 = (Object[])(new int[var2][][]);
                     }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  var15[var7] = a(var0);
               }

               var1 = var15;
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   private static int a(InputStream var0) {
      int var1;
      if ((var1 = var0.read()) >= 0) {
         A++;
      }

      return var1;
   }

   private static int b(InputStream var0) {
      return a(var0) & 0xFF | (a(var0) & 0xFF) << 8;
   }

   private static int c(InputStream var0) {
      return a(var0) & 0xFF | (a(var0) & 0xFF) << 8 | (a(var0) & 0xFF) << 16 | (a(var0) & 0xFF) << 24;
   }

   private static int b(InputStream var0, byte[] var1, int var2, int var3) {
      var2 = 0;
      int var4 = var3;

      try {
         while (var4 > 0) {
            int var5 = var0.read(var1, var2, var4);
            var4 -= var5;
            var2 += var5;
         }
      } catch (Exception var6) {
      }

      A += var3;
      return var3;
   }

   private static byte[] a(int[] var0, boolean var1, byte[] var2) {
      int var3 = var0.length << 2;
      if (var1) {
         if ((var1 = var0[var0.length - 1]) > var3) {
            return null;
         }

         var3 = var1;
      }

      var2 = new byte[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var2[var5] = (byte)(var0[var5 >>> 2] >>> ((var5 & 3) << 3));
      }

      return var2;
   }

   private static int[] a(byte[] var0, boolean var1, int[] var2) {
      int var3 = (var0.length & 3) == 0 ? var0.length >>> 2 : (var0.length >>> 2) + 1;
      if (var1) {
         (var2 = new int[var3 + 1])[var3] = var0.length;
      } else {
         var2 = new int[var3];
      }

      var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2[var4 >>> 2] = var2[var4 >>> 2] | (255 & var0[var4]) << ((var4 & 3) << 3);
      }

      return var2;
   }

   private static int d(InputStream var0) {
      int var1 = 0;

      try {
         var1 = a(var0);
         d[var1] = c(var0);
         if (d[var1] > 2048) {
            d[var1] = 2048;
         }

         a[var1] = new int[d[var1] + 1];

         for (int var2 = 1; var2 < d[var1] + 1; var2++) {
            a[var1][var2] = c(var0);
         }

         b[var1] = new byte[a[var1][d[var1]]];
         b(var0, b[var1], 0, b[var1].length);
      } catch (Exception var3) {
      }

      return var1;
   }

   static void a(String var0, int var1) {
      var1 = var1;
      var0 = var0;
      a(var1);
      if (c == null) {
         c = new int[32];

         for (int var2 = 0; var2 < 32; var2++) {
            c[var2] = -1;
         }

         b = new byte[32][];
         a = new int[32][];
         d = new int[32];
      }

      e(var0);
      int var5 = d(new ByteArrayInputStream(a(var1)));
      c[var1] = var5;
      l();
   }

   static final void d(String var0) {
      d = var0;
   }

   static String d(int var0) {
      int var1 = var0 >> 11;
      var0 &= 2047;

      try {
         int var2;
         return (var2 = a[var1][var0 + 1] - a[var1][var0]) == 0 ? null : new String(b[var1], a[var1][var0], var2, d);
      } catch (Exception var3) {
         return null;
      }
   }

   static final int m() {
      if (d == null) {
         String var2 = "No strings loaded!";
         return 0;
      }

      int var0 = 0;

      for (int var1 = 0; var1 < 32; var1++) {
         var0 += d[var1];
      }

      return var0;
   }

   static void n() {
      for (int var0 = 0; var0 < 32; var0++) {
         a(var0);
      }
   }

   private static void a(int var0) {
      if (c != null) {
         int var1;
         if ((var1 = c[var0]) == -1) {
            return;
         }

         a[var1] = null;
         b[var1] = null;
         d[var1] = 0;
         c[var0] = -1;
      }
   }

   static String a(int var0, int var1, String var2) {
      if (var0 < 1000) {
         return "" + var0;
      }

      String var3 = "";
      switch (var1) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 15:
         case 17:
            var3 = ",";
            break;
         case 1:
         case 3:
         case 5:
         case 16:
            var3 = ".";
            break;
         case 2:
         case 4:
         case 6:
         case 10:
            if (var0 >= 10000) {
               var3 = var2;
            }
            break;
         case 11:
         case 14:
            if (var0 >= 10000) {
               var3 = ".";
            }
            break;
         case 12:
         case 13:
            var3 = var2;
            break;
         default:
            return "" + var0;
      }

      String var5 = "";
      int var6 = var0 % 1000 < 0 ? -(var0 % 1000) : var0 % 1000;
      var0 /= 1000;

      while (var6 != 0 || var0 != 0) {
         if (var6 < 10) {
            var5 = "00" + (var6 < 0 ? -var6 : var6) + var5;
         } else if (var6 < 100) {
            var5 = "0" + (var6 < 0 ? -var6 : var6) + var5;
         } else {
            var5 = (var6 < 0 ? -var6 : var6) + var5;
         }

         var6 = var0 % 1000;
         if ((var0 /= 1000) != 0) {
            var5 = var3 + var5;
         } else if (var6 != 0) {
            var5 = var6 + var3 + var5;
            var6 = 0;
         }
      }

      return var5;
   }

   private static void g() {
      if (a != null) {
         try {
            a.closeRecordStore();
         } catch (RecordStoreException var0) {
         }

         a = null;
      }
   }

   private static void f(String var0) {
      a = RecordStore.openRecordStore(var0, true);
   }

   static byte[] a(String var0) {
      String var1 = "";
      var0 = var0;
      byte[] var2 = null;
      if (!"".equals(var1) && var1 != null) {
         var2 = var1.getBytes();
      }

      byte[] var4 = var2;
      return a(var0, var4);
   }

   private static byte[] a(String var0, byte[] var1) {
      byte[] var2 = null;

      try {
         f(var0);
         if (a.getNumRecords() > 0) {
            var2 = a.getRecord(1);
         }
      } catch (RecordStoreException var9) {
         var2 = null;
      }

      if (var1 != null) {
         var1 = (byte[])var1;
         byte[] var10 = var2;
         byte[] var10000;
         if (var2 != null && var10.length != 0) {
            var10000 = a(var10, false, null);
            var1 = a(var1, false, null);
            int[] var11 = var10000;
            int var14;
            if ((var14 = var10000.length - 1) >= 1) {
               if (var1.length < 4) {
                  int[] var3 = new int[4];
                  System.arraycopy(var1, 0, var3, 0, var1.length);
                  var1 = var3;
               }

               int var4 = var11[0];
               int var5 = -1640531527;

               int var15;
               for (int var6 = (var15 = 6 + 52 / (var14 + 1)) * var5; var6 != 0; var6 -= var5) {
                  int var7 = var6 >>> 2 & 3;

                  int var8;
                  for (var8 = var14; var8 > 0; var8--) {
                     var15 = var11[var8 - 1];
                     var4 = var11[var8] -= (var15 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var15 << 4) ^ (var6 ^ var4) + (var1[var8 & 3 ^ var7] ^ var15);
                  }

                  var15 = var11[var14];
                  var4 = var11[0] -= (var15 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var15 << 4) ^ (var6 ^ var4) + (var1[var8 & 3 ^ var7] ^ var15);
               }
            }

            var10000 = a(var11, true, null);
         } else {
            var10000 = var10;
         }

         var2 = (byte[])var10000;
      }

      g();
      return var2;
   }

   static void a(String var0, byte[] var1) {
      String var2 = "";
      var1 = var1;
      var0 = var0;
      byte[] var3 = null;
      if (!"".equals(var2) && var2 != null) {
         var3 = var2.getBytes();
      }

      byte[] var9 = var3;
      var1 = var1;
      int var10003 = var1.length;
      var3 = var9;
      int var10 = var10003;
      boolean var5 = false;
      var1 = var1;
      a(var0, var1, 0, var10, var3);
   }

   private static void a(String var0, byte[] var1, int var2, int var3, byte[] var4) {
      if (var4 != null) {
         byte[] var15 = var4;
         var1 = (byte[])var1;
         byte[] var22;
         if (var1.length == 0) {
            var22 = var1;
         } else {
            var22 = a(var1, true, null);
            int[] var16 = a(var15, false, null);
            var1 = var22;
            int var17;
            if ((var17 = var22.length - 1) >= 1) {
               if (var16.length < 4) {
                  int[] var5 = new int[4];
                  System.arraycopy(var16, 0, var5, 0, var16.length);
                  var16 = var5;
               }

               int var18 = var1[var17];
               int var7 = -1640531527;
               int var8 = 0;
               int var11 = 6 + 52 / (var17 + 1);

               while (var11-- > 0) {
                  int var9 = (var8 += var7) >>> 2 & 3;

                  int var10;
                  for (var10 = 0; var10 < var17; var10++) {
                     int var6 = var1[var10 + 1];
                     var18 = var1[var10] += (var18 >>> 5 ^ var6 << 2) + (var6 >>> 3 ^ var18 << 4) ^ (var8 ^ var6) + (var16[var10 & 3 ^ var9] ^ var18);
                  }

                  int var19 = var1[0];
                  var18 = var1[var17] += (var18 >>> 5 ^ var19 << 2) + (var19 >>> 3 ^ var18 << 4) ^ (var8 ^ var19) + (var16[var10 & 3 ^ var9] ^ var18);
               }
            }

            var22 = a(var1, false, null);
         }

         var1 = var22;
         var3 = var22.length;
      }

      try {
         f(var0);
         if (a.getNumRecords() > 0) {
            a.setRecord(1, (byte[])var1, var2, var3);
         } else {
            a.addRecord((byte[])var1, var2, var3);
         }
      } catch (RecordStoreException var12) {
      }

      g();
   }

   static void g(int var0) {
      if (e == null) {
         e = new int[1];
         b = new int[1][];
         a = new Image[1];
      }

      int var1 = var0;
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 >= e.length) {
            var10000 = -1;
            break;
         }

         if (e[var2] == var1) {
            var10000 = var2;
            break;
         }

         var2++;
      }

      var1 = var10000;
      if (var10000 == -1 || a == null) {
         C++;
         var1 = 0;
         e[var1] = var0;
         b[var1] = e.a;
         if (b[var1] == null) {
            b[var1] = new int[1600];
         }

         var2 = 1600;

         while (var2 > 0) {
            b[var1][--var2] = var0;
         }

         a[var1] = a(b[var1], 40, 40, true);
      }

      C = var1;
   }

   static void e(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = a(var0);
      int var6 = b(var0);
      int var7 = c(var0);
      int var8 = d(var0);
      int var9 = var1 > var5 ? var1 : var5;
      int var10 = var2 > var6 ? var2 : var6;
      var3 = (var1 + var3 < var5 + var7 ? var1 + var3 : var5 + var7) - var9;
      var4 = (var2 + var4 < var6 + var8 ? var2 + var4 : var6 + var8) - var10;
      if (var3 > 0 && var4 > 0) {
         a(var0, var9, var10, var3, var4);
         var3 += var9;
         var4 += var10;

         for (int var16 = var9; var16 < var3; var16 += 40) {
            for (int var17 = var10; var17 < var4; var17 += 40) {
               Image var10001 = a[C];
               byte var22 = 20;
               int var13 = var17;
               int var12 = var16;
               Image var11 = var10001;
               boolean var23 = true;
               byte var14 = 20;
               var13 = var13;
               var12 = var12;
               var11 = var11;
               Graphics var24 = var0;

               try {
                  var24.drawImage(var11, var12, var13, var14);
               } catch (Exception var15) {
               }
            }
         }

         a(var0, var5, var6, var7, var8);
      }
   }

   private static final void b(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      a(var0, var1, 0, var3, var4, var5, var6, var7, var8);
   }

   static final void o() {
      D = 0;
      G = b;
      H = c;
      (c = new int[18][])[13] = new int[5];
      byte var0 = 13;
      switch (13) {
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
         case 10:
         case 11:
         case 12:
         case 14:
         case 15:
         case 17:
         default:
            break;
         case 13:
            c[13][1] = 100;
            c[13][2] = -1;
            c[13][0] = -1;
            c[13][3] = 100;
            c[13][4] = 100;
            break;
         case 16:
            c[16][0] = 0;
      }

      E = 0;
      l = true;
   }

   static final void h(int var0) {
      boolean var1 = false;
      var0 = var0;
      D |= 1 << var0;
      if ((1 << var0 & 2559) != 0) {
         D &= -2560;
      }

      if ((1 << var0 & 31) != 0) {
         var0 = var0;
         E |= 1 << var0;
      }
   }

   static final void i(int var0) {
      boolean var1 = false;
      var0 = var0;
      D &= ~(1 << var0);
      if ((1 << var0 & 31) != 0) {
         var0 = var0;
         E &= ~(1 << var0);
      }
   }

   static final boolean b(int var0) {
      return (D & 1 << var0) != 0;
   }

   static final int n() {
      return D & 260064;
   }

   static final void p() {
      D &= -260065;
   }

   static final void a(int var0, int var1, int var2) {
      c[var0][var1] = var2;
   }

   static final int o() {
      byte var1 = 1;
      int var0 = 13;
      if ((var0 = c[var0][var1]) != 100) {
         return var0;
      }

      var1 = 3;
      byte var3 = 13;
      return c[var3][var1];
   }

   static final int p() {
      byte var1 = 1;
      int var0 = 13;
      if ((var0 = c[var0][var1]) != 100) {
         return var0;
      }

      var1 = 4;
      byte var3 = 13;
      return c[var3][var1];
   }

   static final void j(int var0) {
      a(13, 1, var0);
      a(13, 3, var0);
      a(13, 4, var0);
   }

   private static final boolean a(boolean var0, int var1) {
      if (var1 == 1) {
         return false;
      } else {
         return var1 == 2 ? true : var0;
      }
   }

   static final int[] a(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int[] var9 = e.a((int[])null);
      a(var1, var9, 0, var4, 0, 0, var4, var5);
      return a(var0, var9, var2, var3, var4, var5, var6, var7, var8);
   }

   static final int[] a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      return a(var0, var1, var2, var3, var4, var5, var6, var7, var8, true);
   }

   static final int[] a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      j = (boolean)var7;
      bE = var4;
      bF = var5;
      bG = var4;
      bH = var5;
      if ((D & 22016) != 0) {
         if ((var6 & 4) != 0) {
            bE = var5;
            bF = var4;
            var4 = bE;
            var5 = bF;
         }

         var1 = e.a(var1, var4, var5, var6);
      }

      int[] var10 = e.a(var1, var4, var5);
      if ((D & 8192) != 0) {
         var8 = a((boolean)var8, c[13][0]);
         int var10007 = o();
         int var10008 = p();
         int var10009 = c[13][2];
         boolean var13 = (boolean)var9;
         int var12 = var6;
         int var11 = var8;
         boolean var49 = (boolean)var7;
         var9 = var10009;
         var8 = var10008;
         var7 = var10007;
         var6 = var5;
         var5 = var4;
         var4 = var3;
         var3 = var2;
         int[] var28 = var10;
         var1 = var1;
         var0 = var0;
         int var14 = 0;
         int var15 = var12 & -2;
         if ((var12 & 4) != 0) {
            var15 = var12;
            var12 = 0;
         }

         if (var15 != 0) {
            if ((var15 & 4) != 0) {
               bE = var6;
               bF = var5;
               var5 = bE;
               var6 = bF;
            }

            var28 = e.a(var1 = e.a(var1, var5, var6, var15), var5, var6);
         }

         var7 = var5 * var7 / 100 + (var5 * var7 % 100 != 0 ? 1 : 0);
         var8 = var6 * var8 / 100 + (var6 * var8 % 100 != 0 ? 1 : 0);
         bG = var7;
         bH = var8;
         if (var7 > 0 && var8 > 0) {
            var15 = (var5 << 8) / var7;
            int var16 = (var6 << 8) / var8;
            int var19 = 0;
            var6 = var0.getClipX();
            var19 = (boolean)0;
            int var17 = var0.getClipY();
            var19 = (boolean)0;
            int var18 = var0.getClipWidth();
            var19 = (boolean)0;
            var19 = var0.getClipHeight();
            int var20 = var7;
            int var21 = 0;
            int var22 = var7;
            int var23 = 0;
            if (var3 < var6) {
               if ((var7 -= var6 - var3) <= 0) {
                  return null;
               }

               var21 = var6 - var3;
               var3 = var6;
            }

            if (var4 < var17) {
               if ((var8 -= var17 - var4) <= 0) {
                  return null;
               }

               var23 = var17 - var4;
               var4 = var17;
            }

            if (var3 + var7 > var6 + var18) {
               if ((var7 = var6 + var18 - var3) <= 0) {
                  return null;
               }

               var22 = var21 + var7;
            }

            if (var4 + var8 > var17 + var19 && (var8 = var17 + var19 - var4) <= 0) {
               return null;
            }

            if ((var17 = var28.length / var7) <= 0) {
               return null;
            }

            var18 = var17;
            var19 = var4;
            if (var9 < 0) {
               int var24 = var17 * var7;
               if ((var12 & 1) != 0) {
                  var12 = (var20 - var22) * var15;
                  var11 = var15;
               } else {
                  var12 = (var22 - 1) * var15;
                  var11 = -var15;
               }

               if ((var18 = var8 - var8 / var17 * var17) == 0) {
                  var18 = var17;
               }

               var15 = var18;
               var14 = var18 * var7;
               var19 = var4 + var8 - var18;
               var20 = var8;
               var23 = (var8 + var23) * var16;

               while (--var20 >= 0) {
                  var6 = (((var23 -= var16) >> 8) * var5 << 8) + var12;

                  for (int var25 = var22; --var25 >= var21; var6 += var11) {
                     var28[--var14] = var1[var6 >> 8];
                  }

                  if (--var18 == 0) {
                     if (var13) {
                        b(var0, var28, 0, var7, var3, var19, var7, var15, var49);
                     }

                     var15 = var17;
                     var19 -= var17;
                     var18 = var17;
                     var14 = var24;
                  }
               }
            } else {
               int var79;
               if ((var12 & 1) != 0) {
                  var79 = (var20 - var21 - 1) * var15;
                  var12 = -var15;
               } else {
                  var79 = var21 * var15;
                  var12 = var15;
               }

               if (!var11 && !var49) {
                  var9 = (var9 & 0xFF) << 24;
                  var11 = 0;

                  for (int var61 = var23 * var16; var11 < var8; var61 += var16) {
                     var4 = (var61 >> 8) * var5;
                     var20 = 0;

                     for (int var78 = var79; var20 < var7; var78 += var12) {
                        var6 = var4 + (var78 >> 8);
                        var28[var14++] = var9 | var1[var6] & 16777215;
                        var20++;
                     }

                     if (--var18 == 0) {
                        if (var13) {
                           b(var0, var28, 0, var7, var3, var19, var7, var17, true);
                        }

                        var19 += var17;
                        var18 = var17;
                        var14 = 0;
                     }

                     var11++;
                  }
               } else if (!var11 && var49) {
                  var9 = (var9 & 0xFF) << 24;
                  var11 = 0;

                  for (int var60 = var23 * var16; var11 < var8; var60 += var16) {
                     var4 = (var60 >> 8) * var5;
                     var20 = 0;

                     for (int var77 = var79; var20 < var7; var77 += var12) {
                        var6 = var4 + (var77 >> 8);
                        int var81;
                        if ((var81 = var1[var6] & 16777215) != 16711935 && var81 != 0) {
                           var28[var14++] = var9 | var81;
                        } else {
                           var28[var14++] = 0;
                        }

                        var20++;
                     }

                     if (--var18 == 0) {
                        if (var13) {
                           b(var0, var28, 0, var7, var3, var19, var7, var17, true);
                        }

                        var19 += var17;
                        var18 = var17;
                        var14 = 0;
                     }

                     var11++;
                  }
               } else {
                  var11 = 0;

                  for (int var59 = var23 * var16; var11 < var8; var59 += var16) {
                     var4 = (var59 >> 8) * var5;
                     var20 = 0;

                     for (int var76 = var79; var20 < var7; var76 += var12) {
                        var6 = var4 + (var76 >> 8);
                        int var80 = ((var1[var6] >>> 24) * var9 >> 8 & 0xFF & 0xFF) << 24;
                        var28[var14++] = var80 | var1[var6] & 16777215;
                        var20++;
                     }

                     if (--var18 == 0) {
                        if (var13) {
                           b(var0, var28, 0, var7, var3, var19, var7, var17, true);
                        }

                        var19 += var17;
                        var18 = var17;
                        var14 = 0;
                     }

                     var11++;
                  }
               }

               if (var13 && var18 != var17) {
                  b(var0, var28, 0, var7, var3, var19, var7, var17 - var18, true);
               }
            }

            return var13 ? null : var28;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      a(b, var0, var1, var2, var3, var4, var5, var6);
   }

   static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 >> 16 & 0xFF;
      int var9 = var5 >> 8 & 0xFF;
      var5 &= 255;
      int var10 = var6 >> 16 & 0xFF;
      int var11 = var6 >> 8 & 0xFF;
      var6 &= 255;
      var10 -= var8;
      var11 -= var9;
      var6 -= var5;
      var3 = var1 + var3 - 1;
      var4 = var2 + var4 - 1;
      var8 <<= 16;
      var9 <<= 16;
      var5 <<= 16;
      if (var7 == 4) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var29 = var3; var29 >= var1; var29--) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            b(var0, var29, var2, var29, var4);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else if (var7 == 8) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var27 = var1; var27 <= var3; var27++) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            b(var0, var27, var2, var27, var4);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else if (var7 == 16) {
         var7 = var4 - var2;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var25 = var4; var25 >= var2; var25--) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            b(var0, var1, var25, var3, var25);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else {
         if (var7 == 32) {
            var7 = var4 - var2;
            var10 = (var10 << 16) / var7;
            var11 = (var11 << 16) / var7;
            var6 = (var6 << 16) / var7;

            for (int var23 = var2; var23 <= var4; var23++) {
               a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
               b(var0, var1, var23, var3, var23);
               var8 += var10;
               var9 += var11;
               var5 += var6;
            }
         }
      }
   }

   static void c(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2;
      int var8 = var3;
      if (var6 == 16 || var6 == 32) {
         var7 = var3;
         var8 = var2;
      }

      if (var6 == 4 || var6 == 16) {
         int var9 = var4;
         var4 = var5;
         var5 = var9;
      }

      int[] var10 = e.a((int[])null);
      int var11 = var8 < var10.length / var7 ? var8 : var10.length / var7;
      int var12 = var4 >>> 24;
      int var13 = var4 >> 16 & 0xFF;
      int var14 = var4 >> 8 & 0xFF;
      int var15 = var4 & 0xFF;
      int var27 = var5 >>> 24;
      int var16 = var5 >> 16 & 0xFF;
      int var17 = var5 >> 8 & 0xFF;
      var5 &= 255;
      var7--;
      int var18 = (var27 - var12 << 16) / var7;
      var16 = (var16 - var13 << 16) / var7;
      int var19 = (var17 - var14 << 16) / var7;
      int var20 = (var5 - var15 << 16) / var7;
      var7++;
      var12 <<= 16;
      var13 <<= 16;
      var14 <<= 16;
      var15 <<= 16;
      if (var6 != 4 && var6 != 8) {
         var17 = 1;
         var5 = 0;
      } else {
         var17 = var2;
         var5 = -(var2 * var11) + 1;
      }

      var27 = 0;

      for (int var21 = 0; var21 < var7; var21++) {
         for (int var22 = var11; --var22 >= 0; var27 += var17) {
            var10[var27] = var4;
         }

         var12 += var18;
         var13 += var16;
         var14 += var19;
         var15 += var20;
         var4 = var12 << 8 & 0xFF000000 | var13 & 0xFF0000 | var14 >> 8 & 0xFF00 | var15 >> 16 & 0xFF;
         var27 += var5;
      }

      if (var6 != 4 && var6 != 8) {
         if (var6 == 16 || var6 == 32) {
            while (var8 > 0) {
               a(b, var10, 0, var11, var0, var1, var11 < var8 ? var11 : var8, var3, true);
               var0 += var11;
               var8 -= var11;
            }
         }
      } else {
         while (var8 > 0) {
            a(b, var10, 0, var2, var0, var1, var2, var11 < var8 ? var11 : var8, true);
            var1 += var11;
            var8 -= var11;
         }
      }
   }

   public void addCommand(Command var1) {
      super.addCommand(var1);
   }

   protected static void Pointer_SetCurrentPointer(int var0) {
   }

   protected static int Pointer_GetNumPointers() {
      return 1;
   }

   private static final void b(int var0) {
      int var1 = var0;
      boolean var2 = false;
      I = var1;
   }

   protected void pointerReleased(int var1, int var2) {
      var2 = var2;
      var1 = var1;
      boolean var3 = false;
      J = var1;
      K = var2;
      n = true;
   }

   protected void pointerPressed(int var1, int var2) {
      var2 = var2;
      var1 = var1;
      boolean var3 = false;
      J = var1;
      K = var2;
      m = true;
   }

   protected void pointerDragged(int var1, int var2) {
      var2 = var2;
      var1 = var1;
      boolean var3 = false;
      J = var1;
      K = var2;
      o = true;
   }

   static {
      char[] var10000 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   }
}
