import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

final class p implements Runnable {
   int a;
   int b;
   int c;
   e a;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private boolean a;
   private int i;
   private static int j = 62;
   private int k;
   private static final int l = 1;
   private static int m;
   private static int n;
   private static boolean b;
   private static byte[][] a;
   private static int[] a;
   private static boolean c = false;
   private static Player[] a;
   private static Player[] b;
   private static int[] b;
   private static int[] c;
   private static int[] d;
   private static int[] e;
   private static int[] f;
   private static int[] g;
   private static int[] h;
   private static int[] i;
   private static int[] j;

   p() {
      this.a();
   }

   p(e var1, int var2, int var3) {
      this.a();
      this.a = var2;
      this.b = var3;
      this.a(var1);
   }

   final void a() {
      this.a = 0;
      this.b = 0;
      this.d = -1;
      this.e = 0;
      this.a = null;
      this.c = 0;
      this.f = 0;
      this.h = 1;
      this.k = -1;
      this.a = true;
      this.i = -1;
   }

   final void a(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   final e a() {
      return this.a;
   }

   final void a(e var1) {
      this.a = var1;
      if (var1 != null) {
         this.b(-1, -1);
      } else {
         this.d = -1;
      }
   }

   final void a(int var1, int var2, boolean var3) {
      this.b(var1, -1);
   }

   final void b(int var1, int var2) {
      byte var5 = -1;
      var2 = var2;
      var1 = var1;
      this = this;
      if (this.a || var1 != this.d) {
         this.d = var1;
         this.g = j;
         int var3 = 0;
         p var8 = this;
         if (this.d < 0) {
            byte var10 = -1;
         } else {
            int var4 = var8.e();

            while (var3 > var4) {
               var3 -= var4;
            }

            var8.e = var3;
            var8.f = 0;
         }

         this.h = var2 - 1;
         this.a = false;
      }
   }

   final int a() {
      return this.d;
   }

   final void b() {
      this.e = j.b(0, this.e());
      this.f = 0;
   }

   final int b() {
      return this.e;
   }

   final int c() {
      return this.a != null && this.d != -1 ? this.a.c(this.d, this.e) : -1;
   }

   final void a(int var1) {
      this.k = var1;
   }

   final int d() {
      return this.k;
   }

   private int e() {
      int var1 = 1;
      this = this;
      if (this.d < 0) {
         return -1;
      }

      if (var1) {
         return this.a.a(this.d);
      }

      var1 = 0;

      for (int var2 = 0; var2 < this.a.a(this.d); var2++) {
         var1 += this.a.a(this.d, var2);
      }

      return var1;
   }

   final int[] a() {
      return this.a.a(this.d, this.e, null, 0, -1);
   }

   final boolean a() {
      if (this.d < 0) {
         return true;
      } else {
         return this.h < 0 ? false : this.a;
      }
   }

   final void c() {
      if (this.d >= 0) {
         if (this.i != -1 && this.i != 100) {
            j.h(13);
            j.j(this.i);
         }

         if (this.k != -1) {
            int var1 = this.a.f();
            this.a.e(this.k);
            this.a.a(j.b, this.d, this.e, this.a, this.b, this.c, 0, 0);
            this.a.e(var1);
         } else {
            this.a.a(j.b, this.d, this.e, this.a, this.b, this.c, 0, 0);
         }

         j.p();
      }
   }

   final void b(int var1) {
      if (!this.a && this.d >= 0) {
         p var2 = this;
         int var3;
         if ((var3 = this.d >= 0 ? var2.a.a(var2.d, var2.e) * var2.g : 0) != 0) {
            if (this.f >= var3) {
               this.f -= var3;
               if (this.e < this.a.a(this.d) - 1) {
                  this.e++;
               } else if (this.h == 0) {
                  this.a = true;
               } else {
                  if (this.h > 0) {
                     this.h--;
                  }

                  this.e = 0;
               }
            }

            this.f += var1;
         }
      }
   }

   private static final int c(int var0) {
      while (var0 >= 7) {
         var0 -= 7;
      }

      while (var0 < 0) {
         var0 += 7;
      }

      return var0;
   }

   private static final int a(int var0, int var1) {
      return var0 * 7 * 5 + var1 * 5;
   }

   private static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (b) {
         int var6 = h[var0];
         int var7 = i[var0];
         var6 = c(var6 + var7);

         for (int var9 = 0; var9 < var7; var9++) {
            int var8 = c(var6 - var9 - 1);
            var8 = a(var0, var8);
            if (g[var8] == var1 && (var1 != 3 && var1 != 1 || g[var8 + 2] >= var3)) {
               g[var8] = 0;
            }
         }

         int var12 = a(var0, var6);
         g[var12] = var1;
         g[var12 + 1] = var2;
         g[var12 + 2] = var3;
         g[var12 + 3] = var4;
         g[var12 + 4] = var5;
         i[var0]++;
      }
   }

   private static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
      a(var0, var1, var2, var3, var4, var5);
   }

   private static void a(int var0, int[] var1) {
      var1[5] = i[var0];
      if (i[var0] > 0) {
         int var2 = a(var0, h[var0]);
         System.arraycopy(g, var2, var1, 0, 5);
         h[var0] = c(h[var0] + 1);
         i[var0]--;
      }
   }

   static void c(int var0) {
      a = new Player[l];
      b = new Player[31];
      b = new int[l];
      c = new int[l];
      d = new int[l];
      e = new int[l];
      f = new int[l];
      g = new int[l * 7 * 5];
      h = new int[l];
      i = new int[l];
      j = new int[6];

      for (int var1 = 0; var1 < l; var1++) {
         b[var1] = -1;
         h[var1] = 0;
         i[var1] = 0;
      }

      n = 31;
      a = new byte[31][];
      a = new int[n];
      m = 100;
      b = true;
   }

   static final void a(String var0, int var1) {
      boolean var4 = true;
      boolean var5 = true;
      var1 = var1;
      var0 = var0;
      if (b && var1 >= 0) {
         j.b(var0);
         byte[] var11 = j.a(var1);
         boolean var7 = true;
         boolean var3 = true;
         int var2 = var1;
         var1 = j.bD;
         byte[] var8 = var11;
         if (b) {
            if (var8 == null || var8.length <= 0) {
               return;
            }

            a[var2] = var8;
            a[var2] = var1;
            if (var3) {
               b[var2] = Manager.createPlayer(new ByteArrayInputStream(a[var2]), j.c(a[var2]));
               a[var2] = null;
            }
         }
      }
   }

   static boolean a(int var0) {
      return a != null && var0 < a.length && a[var0] != null ? true : b != null && var0 < b.length && b[var0] != null;
   }

   static final void d(int var0) {
      b(var0, 2, -1, -1, -1, -1);
   }

   static void a(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= 0 && var3 != 0) {
         b(var0, 3, var1, var4, var3, var2);
      }
   }

   private static void a(int var0, int var1, int var2) {
      if (d[var0] != 2 || c[var0] >= var2) {
         if (b[var0] != var1 || d[var0] == 0) {
            var2 = b[var0];
            f(var0);
            int var3 = var1;
            Object var4 = null;
            a[var0] = (Player)(var4 = b[var3]);
            if (a[var0] == null) {
               if (a[var1] == null) {
                  return;
               }

               a[var0] = Manager.createPlayer(new ByteArrayInputStream(a[var1]), j.c(a[var1]));
            }

            if (a[var0] != null) {
               a[var0].realize();
               a[var0].prefetch();
               d[var0] = 1;
               b[var0] = var1;
               if (var2 >= 0 && var2 < n) {
                  var3 = var2;
                  if ((!b ? -1 : (var3 >= 0 && var3 < n && b != null && b[var3] != null ? b[var3].getState() : -1)) == 400) {
                     b[var2].stop();
                  }
               }
            }
         }
      }
   }

   static void e(int var0) {
      if (b) {
         m = 100;

         try {
            for (int var3 = 0; var3 < l; var3++) {
               int var1 = e[var3];
               var1 = var3;
               if (b && a[var1] == null) {
               }
            }
         } catch (Exception var2) {
         }
      }
   }

   static void d() {
      if (b) {
         for (int var0 = 0; var0 < l; var0++) {
            int[] var2 = j;
            a(var0, var2);
            if (j[5] > 0) {
               if (d[var0] == 2) {
                  boolean var1;
                  try {
                     var1 = b(var0);
                  } catch (Exception var7) {
                     var1 = false;
                  }

                  if (!var1) {
                     d[var0] = 1;
                  }
               }

               while (j[5] > 0) {
                  try {
                     switch (j[0]) {
                        case 1:
                           a(var0, j[1], j[2]);
                           break;
                        case 2:
                           f(var0);
                           break;
                        case 3:
                           int var10001 = j[1];
                           int var10002 = j[2];
                           int var10003 = j[4];
                           int var5 = j[3];
                           int var4 = var10003;
                           int var3 = var10002;
                           int var12 = var10001;
                           int var11 = var0;
                           if (!j.h) {
                              a(var11, var12, var3);
                              if (!j.h && d[var11] == 1 && a[var11] != null) {
                                 if (var4 == 0) {
                                    a[var11].setLoopCount(-1);
                                 } else {
                                    a[var11].setLoopCount(var4);
                                 }

                                 a[var11].start();
                                 d[var11] = 2;
                                 e[var11] = var5;
                                 f[var11] = var4;
                                 c[var11] = var3;
                                 b[var11] = var12;
                              }
                           }
                           break;
                        case 4:
                           int var10 = var0;
                           if (a[var10] != null) {
                              a[var10].stop();
                              d[var10] = 1;
                           }
                           break;
                        case 5:
                           int var9 = var0;
                           if (d[var9] == 2 && a[var9] != null) {
                              a[var9].stop();
                              d[var9] = 3;
                           }
                           break;
                        case 6:
                           int var8 = var0;
                           if (d[var8] == 3 && a[var8] != null) {
                              a[var8].start();
                              d[var8] = 2;
                           }
                     }
                  } catch (Exception var6) {
                  }

                  var2 = j;
                  a(var0, var2);
               }
            }
         }
      }
   }

   public final void run() {
   }

   protected static boolean b(int var0) {
      if (!b) {
         return false;
      }

      if (var0 < l && a[var0] != null) {
         boolean var1 = true;
         if (a[var0].getState() != 400) {
            var1 = false;
         }

         return var1;
      } else {
         return false;
      }
   }

   private static void f(int var0) {
      if (b) {
         if (a[var0] != null) {
            a[var0].stop();
            a[var0].deallocate();
            int var1;
            if ((var1 = b[var0]) < 0 || b[var1] == null) {
               a[var0].close();
            }

            a[var0] = null;
         }

         d[var0] = 0;
         b[var0] = -1;
      }
   }

   static void e() {
      for (int var0 = 0; var0 < l; var0++) {
         byte var1 = 4;
         b(var0, 4, -1, -1, -1, -1);
      }

      d();
   }

   static void f() {
      try {
         e();
      } catch (Exception var0) {
      }
   }

   private static boolean a(int var0, int var1) {
      return (((Object[])null)[15] & var1) != 0;
   }

   static final int a(int var0) {
      return ((Object[])null)[13];
   }

   static final int b(int var0) {
      return a(0, 8) ? ((Object[])null)[6] - ((Object[])null)[1] - ((Object[])null)[14] : ((Object[])null)[14];
   }
}
