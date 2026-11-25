import javax.microedition.lcdui.Graphics;

final class l {
   private int b = 0;
   int a = 0;
   private int c = 0;
   private int d = 0;
   private int e = 0;
   private int f = 0;
   private int g = 0;
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private int l = 0;
   private int[] a;
   private int[] b;
   private int[] c;
   private int[] d;
   private int[] e;
   private int[] f = new int[4];
   private int[] g = new int[4];
   private int m = 0;
   private int n = 0;
   private int o = 0;
   private int p = 0;
   private int q = 0;
   private int[] h = new int[4];
   private int r = 0;
   private int s = 0;
   private int t = 1;

   private l(int var1) {
      this.l = var1;
      this.a = new int[var1];
      this.b = new int[var1];
      this.c = new int[var1];
      this.d = new int[var1];
      this.e = new int[var1];
      this.b = var1;
   }

   private l(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22,
      int var23,
      int var24,
      int var25,
      int var26,
      int var27
   ) {
      this(var1);
      var2 = var2;
      this.d = var2;
      var2 = var3;
      this.e = var2;
      int var58 = var7;
      int var55 = var6;
      var3 = var5;
      var2 = var4;
      l var28 = this;
      this.f[0] = var2;
      var28.f[1] = var3;
      var28.f[2] = var55;
      var28.f[3] = var58;
      var3 = var9;
      var2 = var8;
      l var29 = this;
      this.f = var2;
      var29.g = var3;
      var3 = var11;
      var2 = var10;
      l var30 = this;
      this.h = var2;
      var30.i = var3;
      var3 = var13;
      var2 = var12;
      l var31 = this;
      this.p = var2;
      var31.q = var3;
      var3 = var15;
      var2 = var14;
      l var32 = this;
      this.j = var2;
      var32.k = var3;
      var2 = var16;
      this.t = var2 >= 1 ? var2 : 1;
      var5 = var20;
      var4 = var19;
      var3 = var18;
      var2 = var17;
      l var33 = this;
      this.g[0] = var2;
      var33.g[1] = var3;
      var33.g[2] = var4;
      var33.g[3] = var5;
      var33.m = j.c(var2 * 2 + var4) / 2;
      var33.n = j.c(var3 * 2 + var5) / 2;
      var2 = var21;
      this.o = var2;
      byte var60 = 0;
      byte var57 = 0;
      byte var54 = 0;
      byte var45 = 0;
      l var34 = this;
      this.h[0] = var45;
      var34.h[1] = var54;
      var34.h[2] = var57;
      var34.h[3] = var60;
      var45 = 0;
      this.r = var45;
      var45 = 0;
      this.s = var45;
   }

   public final void a() {
      int var1 = this.b;
      this = this;
      new StringBuffer()
         .append(" param error: _iNumberOfPartcles (")
         .append(var1)
         .append(") should be less or equal than m_emitter_maxParticles (")
         .append(this.l)
         .append(")");
      this.b = var1;
      this.a = var1;
      this.m = j.c(2 * this.g[0] + this.g[2]) / 2;
      this.n = j.c(2 * this.g[1] + this.g[3]) / 2;

      for (int var3 = 0; var3 < this.b; var3++) {
         this.c[var3] = j.b(this.f, this.g + 1);
         this.d[var3] = j.b(this.h, this.i + 1);
         if (this.d > 0) {
            this.e[var3] = -(var3 * this.d) / this.b;
         } else {
            this.e[var3] = 0;
         }
      }
   }

   public final void a(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      if (this.o != 0) {
         var2 = this.g[0];
         var3 = this.g[1];
         var4 = var2 + this.g[2] - 1;
         var5 = var3 + this.g[3] - 1;
      }

      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      if (this.r > 0) {
         var6 = this.h[0];
         var7 = this.h[1];
         var8 = var6 + this.h[2] - 1;
         var9 = var7 + this.h[3] - 1;
      }

      this.a = 0;
      this.c = 0;

      for (int var10 = 0; var10 < this.b; var10++) {
         int var19 = var10;
         l var18 = this;
         new StringBuffer()
            .append(" param error _iParticleIdx (")
            .append(var19)
            .append(") should be less than number of particles (")
            .append(var18.b)
            .append(")");
         if (var18.e[var19] < var18.e) {
            this.a++;
            int var11 = this.a(var10);
            boolean var12 = this.b(var10);
            if (!var11) {
               this.c++;
            } else {
               var11 = j.d(this.a[var10]);
               int var13 = j.d(this.b[var10]);
               this.a[var10] = this.a[var10] + (int)(this.c[var10] * var1 / 1000L);
               this.b[var10] = this.b[var10] + (int)(this.d[var10] * var1 / 1000L);
               int var14 = this.a[var10];
               int var15 = this.b[var10];
               int var20 = var15;
               var19 = var14;
               var18 = this;
               int var10000;
               if (this.o == 0) {
                  var10000 = 0;
               } else {
                  int var21 = j.d(var18.m - var19);
                  int var17 = j.d(var18.n - var20);
                  var10000 = j.c(j.b(var21, var17, 30));
               }

               int var16 = var10000;
               var20 = var16;
               var19 = var14;
               var18 = this;
               int var44;
               int var30 = this.o == 0 ? 0 : j.d(var44 = var18.o * (var18.m - var19), var20);
               var20 = var16;
               var19 = var15;
               var18 = this;
               var16 = this.o == 0 ? 0 : j.d(var44 = var18.o * (var18.n - var19), var20);
               var30 = this.p + var30;
               var16 = this.q + var16;
               this.c[var10] = this.c[var10] + (int)(var30 * var1 / 1000L);
               this.d[var10] = this.d[var10] + (int)(var16 * var1 / 1000L);
               if (this.j > 0) {
                  this.c[var10] = this.c[var10] < -this.j ? -this.j : (this.c[var10] > this.j ? this.j : this.c[var10]);
               }

               if (this.k > 0) {
                  this.d[var10] = this.d[var10] < -this.k ? -this.k : (this.d[var10] > this.k ? this.k : this.d[var10]);
               }

               if (this.t > 1) {
                  var16 = this.t - 1;
                  this.c[var10] = this.c[var10] * var16 / this.t;
                  this.d[var10] = this.d[var10] * var16 / this.t;
               }

               var16 = j.d(var14);
               var14 = j.d(var15);
               if (this.o != 0) {
                  var15 = var5;
                  var30 = var4;
                  var44 = var3;
                  var20 = var2;
                  var19 = var14;
                  int var36 = var16;
                  if (var16 >= var20 && var36 <= var30 && var19 >= var44 && var19 <= var15) {
                     this.e[var10] = this.e;
                  }
               }

               if (this.r > 0) {
                  boolean var25 = false;
                  if (var16 < var6) {
                     var25 = true;
                     if (j.e(this.c[var10]) > this.s && var11 != var6) {
                        this.c[var10] = -this.c[var10];
                        var16 = var6;
                     } else {
                        var16 = var6;
                        this.c[var10] = 0;
                     }
                  } else if (var16 > var8) {
                     var25 = true;
                     if (j.e(this.c[var10]) > this.s && var11 != var8) {
                        this.c[var10] = -this.c[var10];
                        var16 = var8;
                     } else {
                        var16 = var8;
                        this.c[var10] = 0;
                     }
                  }

                  if (var14 < var7) {
                     var25 = true;
                     if (j.e(this.d[var10]) > this.s && var13 != var7) {
                        this.d[var10] = -this.d[var10];
                        var14 = var7;
                     } else {
                        var14 = var7;
                        this.d[var10] = 0;
                     }
                  } else if (var14 > var9) {
                     var25 = true;
                     if (j.e(this.d[var10]) > this.s && var13 != var9) {
                        this.d[var10] = -this.d[var10];
                        var14 = var9;
                     } else {
                        var14 = var9;
                        this.d[var10] = 0;
                     }
                  }

                  if (var25) {
                     this.c[var10] = this.c[var10] / this.r;
                     this.d[var10] = this.d[var10] / this.r;
                     this.a[var10] = j.c(var16);
                     this.b[var10] = j.c(var14);
                  }
               }
            }

            this.e[var10] = this.e[var10] + var1;
            if (var12 && !this.b(var10)) {
               this.a[var10] = j.c(this.f[0] + j.b(0, this.f[2]));
               this.b[var10] = j.c(this.f[1] + j.b(0, this.f[3]));
            }
         }
      }
   }

   public final void a(Graphics var1, e var2, int var3, int var4, int var5, boolean var6) {
      this.a(var1, var2, var3, 0, 0, false, b.c);
   }

   public final void a(Graphics var1, e var2, int var3, int var4, int var5, boolean var6, int var7) {
      for (int var8 = 0; var8 < this.b; var8++) {
         if (this.a(var8)) {
            int var12 = var8;
            l var11 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var12)
               .append(") should be less than number of particles (")
               .append(var11.b)
               .append(")");
            int var9 = j.d(var11.a[var12]) + var4;
            var12 = var8;
            var11 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var12)
               .append(") should be less than number of particles (")
               .append(var11.b)
               .append(")");
            int var10 = j.d(var11.b[var12]) + var5;
            var12 = var8;
            var11 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var12)
               .append(") should be less than number of particles (")
               .append(var11.b)
               .append(")");
            int var15 = var11.e[var12];
            int var16;
            if ((var16 = a(var2, var3, var15, var7, var6 ? 1 : -1)) >= 0) {
               var2.a(var1, var3, var16, var9, var10, 0);
            } else {
               this.e[var8] = this.e;
            }
         }
      }
   }

   public final int a() {
      return this.a;
   }

   private boolean a(int var1) {
      new StringBuffer().append(" param error _iParticleIdx (").append(var1).append(") should be less than number of particles (").append(this.b).append(")");
      return this.e[var1] > 0 && this.e[var1] < this.e;
   }

   private boolean b(int var1) {
      new StringBuffer().append(" param error _iParticleIdx (").append(var1).append(") should be less than number of particles (").append(this.b).append(")");
      return this.e[var1] <= 0;
   }

   private static int a(e var0, int var1, int var2, int var3, int var4) {
      var2 /= var3;
      var3 = 0;

      for (int var5 = 0; var5 < var0.a(var1); var5++) {
         var3 += var0.a(var1, var5);
      }

      if (var4 > 0 && var2 / var3 >= var4) {
         return -1;
      }

      int var9 = var2 % var3;
      var2 = -1;

      while ((var9 -= var0.a(var1, ++var2)) >= 0) {
      }

      return var2;
   }

   public static l a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15
   ) {
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      var15 = var15;
      byte var35 = -1;
      var13 = var13;
      byte var33 = 0;
      var11 = var11;
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
      var0 = var0;
      return new l(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var33, var13, var35, var15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
   }
}
