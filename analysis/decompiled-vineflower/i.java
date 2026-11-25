final class i {
   private static i[] a = new i[8];
   private static i[] b = new i[8];
   private static int[] c = new int[8];
   private p[] a;
   private int f;
   private int[][] a;
   private int[] d;
   private int g;
   private int h = 1;
   private int i = 0;
   private int j;
   private int k;
   private int l;
   private int m = -1;
   int[] a = new int[33];
   private int n;
   private int o;
   private i a;
   private i b;
   private int p = -1;
   int a;
   int b;
   int c;
   private int q;
   private int r;
   private int s;
   private int t;
   int d;
   int e;
   private int u;
   private int v;
   private int w;
   int[] b;
   private p a;
   private static i c;

   static void a(int var0) {
      if ((c[var0] & 1) == 0) {
         i var2 = a[var0];

         while (var2 != null) {
            i var1 = var2.a;
            var2.c();
            var2 = var1;
         }
      }
   }

   static void b(int var0) {
      if ((c[var0] & 4) == 0) {
         for (i var1 = a[var0]; var1 != null; var1 = var1.a) {
            var1.d();
         }
      }
   }

   static void a() {
      for (int var0 = 1; var0 < 8; var0++) {
         c(var0);
      }
   }

   static void c(int var0) {
      while (a[var0] != null) {
         a[var0].b();
      }
   }

   final void b() {
      if (this.p != -1) {
         if (this.b != null) {
            this.b.a = this.a;
         } else {
            a[this.p] = this.a;
         }

         if (this.a != null) {
            this.a.b = this.b;
         } else {
            b[this.p] = this.b;
         }

         this.p = -1;
         this.a = null;
         this.b = null;
      }
   }

   public final void a(int var1, int[] var2) {
      this.a = var1;
      switch (this.a) {
         case 22:
            this.b = var2[0];
            this.c = var2[1];
            this.q = var2[2];
            this.b = new int[7];
            e var7 = a.a[var2[3]];
            this.w = j.b(0, var7.b - 1);
            int var8 = j.b(var2[4], var2[5] + 1);
            this.a = new p(var7, this.b, this.c);
            this.a.b(var8, -1);
            this.a.b();
            return;
         case 42:
            this.b = new int[45];
            this.b[41] = 1;
            this.b[44] = 0;
            this.b[41] = 1;
            this.b[42] = 0;
            this.b[43] = 0;
            this.b[40] = 0;
            this.b[39] = -4;
            this.n = var2[0];
            this.b[0] = 0;
            this.b[1] = a.b[this.n][1];
            this.b[2] = a.b[this.n][2];
            this.b[3] = a.b[this.n][3];
            this.b[4] = a.b[this.n][4];
            this.b[7] = a.b[this.n][7];
            this.b[8] = a.b[this.n][8];
            this.b[9] = a.b[this.n][9];
            this.b[10] = a.b[this.n][10];
            this.b[11] = a.b[this.n][11];
            this.b[12] = a.b[this.n][12];
            this.b[25] = a.b[this.n][25];
            this.b[26] = a.b[this.n][26];
            this.b[27] = a.b[this.n][27];
            this.b[28] = a.b[this.n][28];
            this.b[29] = a.b[this.n][29];
            this.b[30] = a.b[this.n][30];
            this.b[31] = a.b[this.n][31];
            this.b[32] = a.b[this.n][32];
            this.b[33] = a.b[this.n][33];
            this.b[34] = a.b[this.n][34];
            this.b[35] = a.b[this.n][35];
            this.b[36] = a.b[this.n][36];
            this.b[37] = a.b[this.n][37];
            this.b[38] = a.b[this.n][38];
            this.b[6] = a.b[this.n][6];
            this.b[18] = a.b[this.n][18];
            this.b[20] = a.b[this.n][20];
            this.b[14] = a.b[this.n][14];
            this.b[16] = a.b[this.n][16];
            this.b[22] = a.b[this.n][22];
            this.b[24] = a.b[this.n][24];
            this.b = c.bA;
            this.c = c.bB;
            this.v = 0;
            this.f = -1;
            this.d = new int[17];
            this.a = new p[17];

            for (int var5 = 0; var5 < this.a.length; var5++) {
               this.a[var5] = new p();
            }

            boolean var3 = false;
            k var4 = a.a;
            int[][] var6 = new int[18][9];
            var4.a(var6, 0);
            this.a = var6;
            return;
         default:
            this.a = var1;
      }
   }

   final void c() {
      if (this.a != null) {
         this.a.b(j.a_);
      }

      switch (this.a) {
         case 22:
            this.b[6] = this.b[6] + j.a_;
            if (this.b[6] > 1200) {
               this.b();
               return;
            } else {
               int var5 = j.c(this.b[6]) / 1200;
               j.a(this.b[0], this.b[1], this.b[4], this.b[5], this.b[2], this.b[3], var5);
               this.b = j.d_;
               this.c = j.bC;
               this.a.a().e(this.w);
               this.a.a(this.b, this.c);
            }
         default:
            return;
         case 42:
            i var4;
            for ((var4 = this = this).h = 0; var4.i - m.a >= 0; var4.h++) {
               var4.i = var4.i - m.a;
            }

            var4.i = var4.i + j.a_;
            this.k();
            return;
         case 43:
            if ((this = this).b[3] > 0 && this.b[7] > 0) {
               if (this.a.a()) {
                  this.b();
               }
            } else if (this.b[4] > 0) {
               this.t = this.t + j.a_;
               if (this.t > this.b[4]) {
                  this.b();
               }
            }

            if (this.b[8] != 0) {
               i var1 = this;
               this.d = var1.b - p.a(0);
               var1.e = var1.c - p.b(0);
               this.d = this.d + this.r;
               this.e = this.e + this.s;
            }

            if (this.b[3] > 0) {
               this.a.a(this.d, this.e);
            }
      }
   }

   public final void d() {
      switch (this.a) {
         case 22:
            int var13 = j.c(this.b[6]) / 1200;
            j.h(13);
            int var18 = 200 - j.d(var13 * 100);
            var13 = 255 - j.d(var13 * 255);
            j.a(13, 1, var18);
            j.a(13, 2, var13);
            this.a.c();
            j.a(13, 2, 100);
            j.p();
            break;
         case 42:
            if ((this = this).f != -1) {
               for (int var4 = 0; var4 < this.g; var4++) {
                  p var10 = this.a[var4];
                  int[] var2 = this.a[var4 + 1];
                  var10.a(this.d + var2[7], this.e + var2[8]);
                  if ((var10.c & 8388608) == 0) {
                     if (var4 == this.d[5] && this.b[37] >= 0) {
                        int[] var10000 = new int[]{0, 0};
                        var10000 = new int[]{0, 0};
                        int[] var3 = this.a[this.d[2]].a();
                        int[] var5 = a.a[96 + this.b[37]].a(0);
                        var2 = this.a[this.d[2] + 1];
                        int[] var6 = new int[]{0, 0, 0, 0};
                        int[] var7 = new int[]{0, 0, 0, 0};
                        var6[0] = j.i();
                        var6[1] = j.j();
                        var6[2] = j.k();
                        var6[3] = j.l();
                        if (this.a()) {
                           var3[0] = -var3[0];
                           var5[0] = -var5[0];
                           var7[0] = var6[0];
                           var7[1] = this.e + var3[1] + var2[8] + var5[1];
                           var7[2] = this.d + var3[0] + var2[7] + var5[0] - var7[0];
                           var7[3] = var6[1] + var6[3] - var7[1];
                        } else {
                           var7[0] = this.d + var3[0] + var2[7] + var5[0];
                           var7[1] = this.e + var3[1] + var2[8] + var5[1];
                           var7[2] = var6[0] + var6[2] - var7[0];
                           var7[3] = var6[1] + var6[3] - var7[1];
                        }

                        j.a(var7[0], var7[1], var7[2], var7[3]);
                        var10.c();
                        j.a(var6[0], var6[1], var6[2], var6[3]);
                     } else {
                        var10.c();
                     }

                     if (var4 == this.d[4] && this.b[35] >= 0) {
                        int[] var11 = this.a[this.d[4]].a();
                        var2 = this.a[this.d[4] + 1];
                        new StringBuffer().append("CreatureDrawAccesories(): no marker for current frame for petID .").append(this.n);
                        byte var19 = 0;
                        if (this.a()) {
                           var19 = 1;
                           var11[0] = -var11[0];
                        }

                        a.a[84 + this.b[35]].e(this.b[36]);
                        a.a[84 + this.b[35]].a(j.b, 0, this.d + var11[0] + var2[7], this.e + var11[1] + var2[8], var19);
                     }

                     if (var4 == this.d[5] && this.b[37] >= 0) {
                        int[] var12 = this.a[this.d[2]].a();
                        var2 = this.a[this.d[2] + 1];
                        new StringBuffer().append("CreatureDrawAccesories(): no marker for current frame for petID .").append(this.n);
                        byte var20 = 0;
                        if (this.a()) {
                           var20 = 1;
                           var12[0] = -var12[0];
                        }

                        a.a[96 + this.b[37]].e(this.b[38]);
                        a.a[96 + this.b[37]].a(j.b, 0, this.d + var12[0] + var2[7], this.e + var12[1] + var2[8], var20);
                     }
                  }
               }
            }

            return;
         case 43:
            if ((this = this).b[3] <= 0) {
               e var1;
               (var1 = a.a[this.b[0]]).a(j.b, this.b[1], this.d, this.e, 0);
               return;
            }

            this.a.a(this.d, this.e);
            this.a.c();
      }
   }

   public final void e() {
      i var1 = this;
      this.a[0] = 0;
      var1.a[1] = 1;
      var1.a[2] = 2;
      var1.a[3] = 3;
      var1.a[4] = 4;
      var1.a[5] = 5;
      var1.a[6] = 6;
      var1.a[7] = 7;
      var1.a[8] = 8;
      var1.a[9] = 9;
      var1.a[10] = 10;
      var1.a[11] = 11;
      var1.a[12] = 12;
      var1.a[13] = 13;
      var1.a[14] = 14;
      var1.a[15] = 15;
      var1.a[18] = 18;
      var1.a[20] = 20;
      var1.a[21] = 21;
      var1.a[22] = 22;
      var1.a[23] = 23;
      var1.a[24] = 24;
      var1.a[25] = 25;
      var1.a[26] = 26;
      var1.a[27] = 27;
      var1.a[28] = 28;
      var1.a[29] = 29;
      var1.a[30] = 30;
      var1.a[31] = 32;
      var1.a[32] = 31;
      this.a(this.a[1], true);
      this.f();
   }

   private void k() {
      try {
         for (int var1 = 0; var1 < this.h; var1++) {
            this.b();
         }
      } catch (Exception var2) {
      }
   }

   public final void d(int var1) {
      this.o = var1;
   }

   public final int a() {
      return this.o;
   }

   private int b() {
      try {
         if (this.f == -1) {
            return -1;
         }

         k var3 = a.a.a[this.f];
         int var4 = this.a[0][0];

         for (int var1 = 0; var1 < var3.a; var1++) {
            int[] var5;
            (var5 = this.a[var1 + 1])[4] = j.c(var5[4], var5[0]);
            var5[5] = j.c(var5[5], var5[1]);
            var5[7] = this.b[41] * j.d(var5[4]);
            var5[8] = j.d(var5[5]);
            if (var5[3] != -1 && var4 == var3.a[var1].a[var5[3]].a[0]) {
               k var6 = var3.a[var1].a[var5[3]];

               for (int var2 = 0; var2 < var6.a; var2++) {
                  k var7;
                  switch ((var7 = var6.a[var2]).a[0]) {
                     case 41:
                        var5[7] = this.b[41] * var7.a[1];
                        var5[8] = var7.a[2];
                        var5[0] = var7.a[3];
                        var5[1] = var7.a[4];
                        var5[4] = j.c(var7.a[1]);
                        var5[5] = j.c(var7.a[2]);
                        break;
                     case 42:
                        if ((var5[6] & 1) == 0) {
                           this.a[var1].a(var7.a[1], -1, false);
                        }
                        break;
                     case 43:
                        this.a[var1].c = this.a[var1].c | var7.a[1];
                        if (this.b[41] == -1 && (var7.a[1] & 1) != 0) {
                           this.a[var1].c ^= 1;
                        }
                        break;
                     case 44:
                        this.a[var1].c = this.a[var1].c & ~var7.a[1];
                        if (this.b[41] == -1 && (var7.a[1] & 1) != 0) {
                           this.a[var1].c ^= 1;
                        }
                        break;
                     case 105:
                        if (var7.a[1] != -1) {
                           if (this.d[var7.a[1]] != -1) {
                              this.a[var1].a(this.a[this.d[var7.a[1]]].d());
                           }

                           this.d[var7.a[1]] = var1;
                           int var12;
                           switch (var7.a[1]) {
                              case 0:
                                 var12 = 109;
                                 var5[6] |= 1;
                                 break;
                              case 1:
                                 var12 = 152;
                                 break;
                              case 2:
                                 var12 = 152;
                                 var5[6] |= 1;
                                 break;
                              case 3:
                                 var12 = 153 + this.b[9];
                                 break;
                              case 4:
                                 var12 = 110 + this.b[7];
                                 break;
                              case 5:
                                 var12 = 129 + this.b[11];
                                 break;
                              case 6:
                              case 7:
                              case 8:
                              case 9:
                                 var12 = 109;
                                 break;
                              case 10:
                              case 11:
                                 var12 = 151;
                                 break;
                              case 12:
                                 var12 = 160 + this.b[25];
                                 break;
                              case 13:
                                 var12 = 160 + this.b[27];
                                 break;
                              case 14:
                                 var12 = 160 + this.b[29];
                                 break;
                              case 15:
                                 var12 = 160 + this.b[31];
                                 break;
                              case 16:
                                 var12 = 160 + this.b[33];
                                 break;
                              default:
                                 var12 = 152;
                           }

                           if (a.a[var12] != this.a[var1].a()) {
                              this.a[var1].a(a.a[var12]);
                              this.a[var1].a(0, -1, false);
                           }

                           if (this.b[41] == -1) {
                              this.a[var1].c = 1;
                           } else {
                              this.a[var1].c = 0;
                           }
                        }
                        break;
                     case 106:
                        this.j = var7.a[1];
                        this.k = var7.a[2];
                        this.m = 0;
                  }
               }

               if (var5[3] < var3.a[var1].a - 1) {
                  var5[3]++;
               } else {
                  var5[3] = 0;
               }
            }

            this.a[var1].b(j.a_);
         }

         if (var4 == 0) {
            this.f();
         }

         if (var4 >= var3.a[3]) {
            var4 = 0;
            i var9 = this;
            label76:
            switch (this.m) {
               case -1:
               case 3:
                  switch (var9.b[43]) {
                     case 0:
                        var9.a(var9.o, false);
                     default:
                        break label76;
                  }
               case 0:
                  var9.m = 1;
                  var9.a(var9.j, true);
               case 1:
               default:
                  break;
               case 2:
                  var9.m = 3;
                  i var10 = var9;
                  switch (var9.b[43]) {
                     case 1:
                        if (var10.m == 3) {
                           var10.a(false);
                           var10.b = var10.t;
                           var10.b[43] = 0;
                        }
                     default:
                        var9.a(var9.l, true);
                  }
            }
         } else {
            var4++;
         }

         this.a[0][0] = var4;
         return var4;
      } catch (Exception var8) {
         throw var8;
      }
   }

   final void a(int[] var1) {
      i var2 = this;
      boolean var10000;
      if (this.f == -1) {
         var10000 = true;
      } else {
         k var3 = a.a.a[var2.f];
         var10000 = var2.a[0][0] >= var3.a[3];
      }

      if (var10000) {
         int var5 = j.b(0, var1.length);
         int var4 = this.a[var1[var5]];
         this.o = var4;
      }
   }

   private void l() {
      for (int var1 = 0; var1 < this.g; var1++) {
         this.a[var1].c ^= 1;
      }

      this.k();
   }

   public final void a(boolean var1) {
      if (var1) {
         if (this.b[41] != -1) {
            this.b[41] = -1;
            this.l();
            return;
         }
      } else if (this.b[41] != 1) {
         this.b[41] = 1;
         this.l();
      }
   }

   private boolean a() {
      return this.b[41] == -1;
   }

   public final void a(int var1, boolean var2) {
      switch (this.m) {
         case -1:
         case 3:
            i var3 = this;
            this.j = -1;
            var3.k = -1;
            var3.l = -1;
            var3.m = -1;
            break;
         default:
            if (var1 != this.j && var1 != this.k) {
               this.l = var1;
               var1 = this.k;
               this.m = 2;
            }
      }

      if (this.f != var1 || var2) {
         this.f = var1;
         this.g = a.a.a[this.f].a;

         for (int var4 = 0; var4 < this.g; var4++) {
            this.a[var4].a();
         }

         a.a.a(this.a, var1);
         this.h = 1;
         this.k();
      }
   }

   public final void f() {
      int var1 = this.a[this.d[4]].a();
      this.a[this.d[4]].a(a.a[110 + this.b[7]]);
      this.a[this.d[4]].a(var1, -1, false);
      this.a[this.d[4]].a(this.b[8]);
      var1 = this.a[this.d[3]].a();
      this.a[this.d[3]].a(a.a[153 + this.b[9]]);
      this.a[this.d[3]].a(var1, -1, false);
      this.a[this.d[3]].a(this.b[10]);
      var1 = this.a[this.d[5]].a();
      this.a[this.d[5]].a(a.a[129 + this.b[11]]);
      this.a[this.d[5]].a(var1, -1, false);
      this.a[this.d[5]].a(this.b[12]);
      var1 = this.a[this.d[12]].a();
      this.a[this.d[12]].a(a.a[160 + this.b[25]]);
      this.a[this.d[12]].a(var1, -1, false);
      this.a[this.d[12]].a(this.b[26]);
      var1 = this.a[this.d[13]].a();
      this.a[this.d[13]].a(a.a[160 + this.b[27]]);
      this.a[this.d[13]].a(var1, -1, false);
      this.a[this.d[13]].a(this.b[28]);
      var1 = this.a[this.d[14]].a();
      this.a[this.d[14]].a(a.a[160 + this.b[29]]);
      this.a[this.d[14]].a(var1, -1, false);
      this.a[this.d[14]].a(this.b[30]);
      var1 = this.a[this.d[15]].a();
      this.a[this.d[15]].a(a.a[160 + this.b[31]]);
      this.a[this.d[15]].a(var1, -1, false);
      this.a[this.d[15]].a(this.b[32]);
      var1 = this.a[this.d[16]].a();
      this.a[this.d[16]].a(a.a[160 + this.b[33]]);
      this.a[this.d[16]].a(var1, -1, false);
      this.a[this.d[16]].a(this.b[34]);
      this.a[this.d[2]].a(this.b[1], -1, false);
      this.a[this.d[2]].a(this.b[2]);
      this.a[this.d[0]].a(this.b[3], -1, false);
      this.a[this.d[0]].a(this.b[4]);
      this.a[this.d[10]].a(this.b[22]);
      this.a[this.d[11]].a(this.b[24]);
      this.a[this.d[9]].a(this.b[20]);
      this.a[this.d[8]].a(this.b[18]);
      this.a[this.d[7]].a(this.b[16]);
      this.a[this.d[6]].a(this.b[14]);
      this.a[this.d[1]].a(this.b[6]);
   }

   public final void g() {
      this.b[0] = 0;
      this.b[1] = a.b[0][1];
      this.b[2] = a.b[0][2];
      this.b[3] = a.b[0][3];
      this.b[4] = a.b[0][4];
      this.b[7] = a.b[0][7];
      this.b[8] = a.b[0][8];
      this.b[9] = a.b[0][9];
      this.b[10] = a.b[0][10];
      this.b[11] = a.b[0][11];
      this.b[12] = a.b[0][12];
      this.b[25] = a.b[0][25];
      this.b[26] = a.b[0][26];
      this.b[27] = a.b[0][27];
      this.b[28] = a.b[0][28];
      this.b[29] = a.b[0][29];
      this.b[30] = a.b[0][30];
      this.b[31] = a.b[0][31];
      this.b[32] = a.b[0][32];
      this.b[33] = a.b[0][33];
      this.b[34] = a.b[0][34];
      this.b[35] = a.b[0][35];
      this.b[36] = a.b[0][36];
      this.b[37] = a.b[0][37];
      this.b[38] = a.b[0][38];
      this.b[44] = 0;
      a.f[38] = a.b[a.bs][1];
      a.f[39] = a.b[a.bs][2];
      a.f[40] = a.b[a.bs][3];
      a.f[41] = a.b[a.bs][4];
      a.f[44] = a.b[a.bs][7];
      a.f[45] = a.b[a.bs][8];
      a.f[46] = a.b[a.bs][9];
      a.f[47] = a.b[a.bs][10];
      a.f[48] = a.b[a.bs][11];
      a.f[49] = a.b[a.bs][12];
      a.f[62] = a.b[a.bs][25];
      a.f[63] = a.b[a.bs][26];
      a.f[64] = a.b[a.bs][27];
      a.f[65] = a.b[a.bs][28];
      a.f[66] = a.b[a.bs][29];
      a.f[67] = a.b[a.bs][30];
      a.f[68] = a.b[a.bs][31];
      a.f[69] = a.b[a.bs][32];
      a.f[70] = a.b[a.bs][33];
      a.f[71] = a.b[a.bs][34];
      a.f[72] = a.b[a.bs][35];
      a.f[73] = a.b[a.bs][36];
      a.f[74] = a.b[a.bs][37];
      a.f[75] = a.b[a.bs][38];
      a.f[43] = a.b[a.bs][6];
      a.f[0] = a.b[a.bt][1];
      a.f[1] = a.b[a.bt][2];
      a.f[2] = a.b[a.bt][3];
      a.f[3] = a.b[a.bt][4];
      a.f[6] = a.b[a.bt][7];
      a.f[7] = a.b[a.bt][8];
      a.f[8] = a.b[a.bt][9];
      a.f[9] = a.b[a.bt][10];
      a.f[10] = a.b[a.bt][11];
      a.f[11] = a.b[a.bt][12];
      a.f[24] = a.b[a.bt][25];
      a.f[25] = a.b[a.bt][26];
      a.f[26] = a.b[a.bt][27];
      a.f[27] = a.b[a.bt][28];
      a.f[28] = a.b[a.bt][29];
      a.f[29] = a.b[a.bt][30];
      a.f[30] = a.b[a.bt][31];
      a.f[31] = a.b[a.bt][32];
      a.f[32] = a.b[a.bt][33];
      a.f[33] = a.b[a.bt][34];
      a.f[34] = a.b[a.bt][35];
      a.f[35] = a.b[a.bt][36];
      a.f[36] = a.b[a.bt][37];
      a.f[37] = a.b[a.bt][38];
      a.f[5] = a.b[a.bt][6];
      this.i();
   }

   public final void h() {
      i var1;
      (var1 = this).b[1] = a.b(a.t);
      var1.b[2] = a.b(a.u);
      var1.b[3] = a.b(a.v);
      var1.b[4] = a.b(a.w);
      var1.b[5] = a.b(a.x);
      var1.b[6] = a.b(a.y);
      var1.b[7] = a.b(a.z);
      var1.b[8] = a.b(a.A);
      var1.b[9] = a.b(a.B);
      var1.b[10] = a.b(a.C);
      var1.b[11] = a.b(a.D);
      var1.b[12] = a.b(a.E);
      var1.b[13] = a.b(a.F);
      var1.b[14] = a.b(a.G);
      var1.b[15] = a.b(a.H);
      var1.b[16] = a.b(a.I);
      var1.b[17] = a.b(a.J);
      var1.b[18] = a.b(a.K);
      var1.b[19] = a.b(a.L);
      var1.b[20] = a.b(a.M);
      var1.b[21] = a.b(a.N);
      var1.b[22] = a.b(a.O);
      var1.b[23] = a.b(a.P);
      var1.b[24] = a.b(a.Q);
      var1.b[25] = a.b(a.R);
      var1.b[26] = a.b(a.S);
      var1.b[27] = a.b(a.T);
      var1.b[28] = a.b(a.U);
      var1.b[29] = a.b(a.V);
      var1.b[30] = a.b(a.W);
      var1.b[31] = a.b(a.X);
      var1.b[32] = a.b(a.Y);
      var1.b[33] = a.b(a.Z);
      var1.b[34] = a.b(a.aa);
      var1.b[35] = a.b(a.ab);
      var1.b[36] = a.b(a.ac);
      var1.b[37] = a.b(a.ad);
      var1.b[38] = a.b(a.ae);
      var1.b[44] = a.b(a.af);
      a.f[0] = a.b(a.ag);
      a.f[1] = a.b(a.ah);
      a.f[2] = a.b(a.ai);
      a.f[3] = a.b(a.aj);
      a.f[6] = a.b(a.ak);
      a.f[7] = a.b(a.al);
      a.f[8] = a.b(a.am);
      a.f[9] = a.b(a.an);
      a.f[10] = a.b(a.ao);
      a.f[11] = a.b(a.ap);
      a.f[24] = a.b(a.aq);
      a.f[25] = a.b(a.ar);
      a.f[26] = a.b(a.as);
      a.f[27] = a.b(a.at);
      a.f[28] = a.b(a.au);
      a.f[29] = a.b(a.av);
      a.f[30] = a.b(a.aw);
      a.f[31] = a.b(a.ax);
      a.f[32] = a.b(a.ay);
      a.f[33] = a.b(a.az);
      a.f[34] = a.b(a.aA);
      a.f[35] = a.b(a.aB);
      a.f[36] = a.b(a.aC);
      a.f[37] = a.b(a.aD);
      a.f[13] = a.b(a.aE);
      a.f[15] = a.b(a.aF);
      a.f[17] = a.b(a.aG);
      a.f[19] = a.b(a.aH);
      a.f[21] = a.b(a.aI);
      a.f[23] = a.b(a.aJ);
      a.f[5] = a.b(a.aK);
      a.f[38] = a.b(a.aL);
      a.f[39] = a.b(a.aM);
      a.f[40] = a.b(a.aN);
      a.f[41] = a.b(a.aO);
      a.f[44] = a.b(a.aP);
      a.f[45] = a.b(a.aQ);
      a.f[46] = a.b(a.aR);
      a.f[47] = a.b(a.aS);
      a.f[48] = a.b(a.aT);
      a.f[49] = a.b(a.aU);
      a.f[62] = a.b(a.aV);
      a.f[63] = a.b(a.aW);
      a.f[64] = a.b(a.aX);
      a.f[65] = a.b(a.aY);
      a.f[66] = a.b(a.aZ);
      a.f[67] = a.b(a.ba);
      a.f[68] = a.b(a.bb);
      a.f[69] = a.b(a.bc);
      a.f[70] = a.b(a.bd);
      a.f[71] = a.b(a.be);
      a.f[72] = a.b(a.bf);
      a.f[73] = a.b(a.bg);
      a.f[74] = a.b(a.bh);
      a.f[75] = a.b(a.bi);
      a.f[51] = a.b(a.bj);
      a.f[53] = a.b(a.bk);
      a.f[55] = a.b(a.bl);
      a.f[57] = a.b(a.bm);
      a.f[59] = a.b(a.bn);
      a.f[61] = a.b(a.bo);
      a.f[43] = a.b(a.bp);
      if (a.f[38] == 0
         && a.f[39] == 0
         && a.f[40] == 0
         && a.f[41] == 0
         && a.f[44] == 0
         && a.f[45] == 0
         && a.f[46] == 0
         && a.f[47] == 0
         && a.f[48] == 0
         && a.f[49] == 0
         && a.f[62] == 0
         && a.f[63] == 0
         && a.f[64] == 0
         && a.f[65] == 0
         && a.f[66] == 0
         && a.f[67] == 0
         && a.f[68] == 0
         && a.f[69] == 0
         && a.f[70] == 0
         && a.f[71] == 0
         && a.f[72] == 0
         && a.f[73] == 0
         && a.f[74] == 0
         && a.f[75] == 0) {
         a.g();
      }
   }

   public final void i() {
      a.f(a.t, this.b[1]);
      a.f(a.u, this.b[2]);
      a.f(a.v, this.b[3]);
      a.f(a.w, this.b[4]);
      a.f(a.z, this.b[7]);
      a.f(a.A, this.b[8]);
      a.f(a.B, this.b[9]);
      a.f(a.C, this.b[10]);
      a.f(a.D, this.b[11]);
      a.f(a.E, this.b[12]);
      a.f(a.R, this.b[25]);
      a.f(a.S, this.b[26]);
      a.f(a.T, this.b[27]);
      a.f(a.U, this.b[28]);
      a.f(a.V, this.b[29]);
      a.f(a.W, this.b[30]);
      a.f(a.X, this.b[31]);
      a.f(a.Y, this.b[32]);
      a.f(a.Z, this.b[33]);
      a.f(a.aa, this.b[34]);
      a.f(a.ab, this.b[35]);
      a.f(a.ac, this.b[36]);
      a.f(a.ad, this.b[37]);
      a.f(a.ae, this.b[38]);
      a.f(a.G, this.b[14]);
      a.f(a.I, this.b[16]);
      a.f(a.K, this.b[18]);
      a.f(a.M, this.b[20]);
      a.f(a.O, this.b[22]);
      a.f(a.Q, this.b[24]);
      a.f(a.y, this.b[6]);
      a.f(a.af, this.b[44]);
      a.f(a.ag, a.f[0]);
      a.f(a.ah, a.f[1]);
      a.f(a.ai, a.f[2]);
      a.f(a.aj, a.f[3]);
      a.f(a.ak, a.f[6]);
      a.f(a.al, a.f[7]);
      a.f(a.am, a.f[8]);
      a.f(a.an, a.f[9]);
      a.f(a.ao, a.f[10]);
      a.f(a.ap, a.f[11]);
      a.f(a.aq, a.f[24]);
      a.f(a.ar, a.f[25]);
      a.f(a.as, a.f[26]);
      a.f(a.at, a.f[27]);
      a.f(a.au, a.f[28]);
      a.f(a.av, a.f[29]);
      a.f(a.aw, a.f[30]);
      a.f(a.ax, a.f[31]);
      a.f(a.ay, a.f[32]);
      a.f(a.az, a.f[33]);
      a.f(a.aA, a.f[34]);
      a.f(a.aB, a.f[35]);
      a.f(a.aC, a.f[36]);
      a.f(a.aD, a.f[37]);
      a.f(a.aE, a.f[13]);
      a.f(a.aF, a.f[15]);
      a.f(a.aG, a.f[17]);
      a.f(a.aH, a.f[19]);
      a.f(a.aI, a.f[21]);
      a.f(a.aJ, a.f[23]);
      a.f(a.aK, a.f[5]);
      a.f(a.aL, a.f[38]);
      a.f(a.aM, a.f[39]);
      a.f(a.aN, a.f[40]);
      a.f(a.aO, a.f[41]);
      a.f(a.aP, a.f[44]);
      a.f(a.aQ, a.f[45]);
      a.f(a.aR, a.f[46]);
      a.f(a.aS, a.f[47]);
      a.f(a.aT, a.f[48]);
      a.f(a.aU, a.f[49]);
      a.f(a.aV, a.f[62]);
      a.f(a.aW, a.f[63]);
      a.f(a.aX, a.f[64]);
      a.f(a.aY, a.f[65]);
      a.f(a.aZ, a.f[66]);
      a.f(a.ba, a.f[67]);
      a.f(a.bb, a.f[68]);
      a.f(a.bc, a.f[69]);
      a.f(a.bd, a.f[70]);
      a.f(a.be, a.f[71]);
      a.f(a.bf, a.f[72]);
      a.f(a.bg, a.f[73]);
      a.f(a.bh, a.f[74]);
      a.f(a.bi, a.f[75]);
      a.f(a.bj, a.f[51]);
      a.f(a.bk, a.f[53]);
      a.f(a.bl, a.f[55]);
      a.f(a.bm, a.f[57]);
      a.f(a.bn, a.f[59]);
      a.f(a.bo, a.f[61]);
      a.f(a.bp, a.f[43]);
   }

   public final void a(int var1, int var2, int var3) {
      switch (var1) {
         case 0:
            this.b[3] = var2;
            this.b[4] = var3;
            if (this.b[44] == 0) {
               a.f[2] = var2;
               a.f[3] = var3;
               return;
            }

            a.f[40] = var2;
            a.f[41] = var3;
            return;
         case 1:
            this.b[5] = var2;
            this.b[6] = var3;
            if (this.b[44] == 0) {
               a.f[4] = var2;
               a.f[5] = var3;
               return;
            }

            a.f[42] = var2;
            a.f[43] = var3;
            return;
         case 2:
            this.b[1] = var2;
            this.b[2] = var3;
            if (this.b[44] == 0) {
               a.f[0] = var2;
               a.f[1] = var3;
               return;
            }

            a.f[38] = var2;
            a.f[39] = var3;
            return;
         case 3:
            this.b[9] = var2;
            this.b[10] = var3;
            if (this.b[44] == 0) {
               a.f[8] = var2;
               a.f[9] = var3;
               return;
            }

            a.f[46] = var2;
            a.f[47] = var3;
            return;
         case 4:
            this.b[7] = var2;
            this.b[8] = var3;
            if (this.b[44] == 0) {
               a.f[6] = var2;
               a.f[7] = var3;
               return;
            }

            a.f[44] = var2;
            a.f[45] = var3;
            return;
         case 5:
            this.b[11] = var2;
            this.b[12] = var3;
            if (this.b[44] == 0) {
               a.f[10] = var2;
               a.f[11] = var3;
               return;
            }

            a.f[48] = var2;
            a.f[49] = var3;
            return;
         case 6:
            this.b[13] = var2;
            this.b[14] = var3;
            if (this.b[44] == 0) {
               a.f[12] = var2;
               a.f[13] = var3;
               return;
            }

            a.f[50] = var2;
            a.f[51] = var3;
            return;
         case 7:
            this.b[15] = var2;
            this.b[16] = var3;
            if (this.b[44] == 0) {
               a.f[14] = var2;
               a.f[15] = var3;
               return;
            }

            a.f[52] = var2;
            a.f[53] = var3;
            return;
         case 8:
            this.b[17] = var2;
            this.b[18] = var3;
            if (this.b[44] == 0) {
               a.f[16] = var2;
               a.f[17] = var3;
               return;
            }

            a.f[54] = var2;
            a.f[55] = var3;
            return;
         case 9:
            this.b[19] = var2;
            this.b[20] = var3;
            if (this.b[44] == 0) {
               a.f[18] = var2;
               a.f[19] = var3;
               return;
            }

            a.f[56] = var2;
            a.f[57] = var3;
            return;
         case 10:
            this.b[21] = var2;
            this.b[22] = var3;
            if (this.b[44] == 0) {
               a.f[20] = var2;
               a.f[21] = var3;
               return;
            }

            a.f[58] = var2;
            a.f[59] = var3;
            return;
         case 11:
            this.b[23] = var2;
            this.b[24] = var3;
            if (this.b[44] == 0) {
               a.f[22] = var2;
               a.f[23] = var3;
               return;
            }

            a.f[60] = var2;
            a.f[61] = var3;
            return;
         case 12:
            this.b[25] = var2;
            this.b[26] = var3;
            if (this.b[44] == 0) {
               a.f[24] = var2;
               a.f[25] = var3;
               return;
            }

            a.f[62] = var2;
            a.f[63] = var3;
            return;
         case 13:
            this.b[27] = var2;
            this.b[28] = var3;
            if (this.b[44] == 0) {
               a.f[26] = var2;
               a.f[27] = var3;
               return;
            }

            a.f[64] = var2;
            a.f[65] = var3;
            return;
         case 14:
            this.b[29] = var2;
            this.b[30] = var3;
            if (this.b[44] == 0) {
               a.f[28] = var2;
               a.f[29] = var3;
               return;
            }

            a.f[66] = var2;
            a.f[67] = var3;
            return;
         case 15:
            this.b[31] = var2;
            this.b[32] = var3;
            if (this.b[44] == 0) {
               a.f[30] = var2;
               a.f[31] = var3;
               return;
            }

            a.f[68] = var2;
            a.f[69] = var3;
            return;
         case 16:
            this.b[33] = var2;
            this.b[34] = var3;
            if (this.b[44] == 0) {
               a.f[32] = var2;
               a.f[33] = var3;
               return;
            }

            a.f[70] = var2;
            a.f[71] = var3;
            return;
         case 17:
            this.b[35] = var2;
            this.b[36] = var3;
            if (this.b[44] == 0) {
               a.f[34] = var2;
               a.f[35] = var3;
               return;
            } else {
               a.f[72] = var2;
               a.f[73] = var3;
            }
         default:
            return;
         case 18:
            this.b[37] = var2;
            this.b[38] = var3;
            if (this.b[44] == 0) {
               a.f[36] = var2;
               a.f[37] = var3;
            } else {
               a.f[74] = var2;
               a.f[75] = var3;
            }
      }
   }

   public final int[] a() {
      int[] var1;
      (var1 = new int[2])[0] = 0;
      var1[1] = this.b[4];
      return var1;
   }

   public final int[] a(int var1) {
      int[] var2 = new int[2];
      switch (var1) {
         case 0:
            var2[0] = this.b[3];
            var2[1] = this.b[4];
            break;
         case 1:
            var2[0] = this.b[5];
            var2[1] = this.b[6];
            break;
         case 2:
            var2[0] = this.b[1];
            var2[1] = this.b[2];
            break;
         case 3:
            var2[0] = this.b[9];
            var2[1] = this.b[10];
            break;
         case 4:
            var2[0] = this.b[7];
            var2[1] = this.b[8];
            break;
         case 5:
            var2[0] = this.b[11];
            var2[1] = this.b[12];
            break;
         case 6:
            var2[0] = this.b[13];
            var2[1] = this.b[14];
            break;
         case 7:
            var2[0] = this.b[15];
            var2[1] = this.b[16];
            break;
         case 8:
            var2[0] = this.b[17];
            var2[1] = this.b[18];
            break;
         case 9:
            var2[0] = this.b[19];
            var2[1] = this.b[20];
            break;
         case 10:
            var2[0] = this.b[21];
            var2[1] = this.b[22];
            break;
         case 11:
            var2[0] = this.b[23];
            var2[1] = this.b[24];
            break;
         case 12:
            var2[0] = this.b[25];
            var2[1] = this.b[26];
            break;
         case 13:
            var2[0] = this.b[27];
            var2[1] = this.b[28];
            break;
         case 14:
            var2[0] = this.b[29];
            var2[1] = this.b[30];
            break;
         case 15:
            var2[0] = this.b[31];
            var2[1] = this.b[32];
            break;
         case 16:
            var2[0] = this.b[33];
            var2[1] = this.b[34];
            break;
         case 17:
            var2[0] = this.b[35];
            var2[1] = this.b[36];
            break;
         case 18:
            var2[0] = this.b[37];
            var2[1] = this.b[38];
      }

      j.a("cActor_Creature.h:3004:Creature_GetPart() ret: " + var2[0] + ", " + var2[1]);
      return var2;
   }

   public final void j() {
      i var1 = this;
      if (this.b[44] == 0) {
         a.f[0] = var1.b[1];
         a.f[1] = var1.b[2];
         a.f[2] = var1.b[3];
         a.f[3] = var1.b[4];
         a.f[4] = var1.b[5];
         a.f[5] = var1.b[6];
         a.f[6] = var1.b[7];
         a.f[7] = var1.b[8];
         a.f[8] = var1.b[9];
         a.f[9] = var1.b[10];
         a.f[10] = var1.b[11];
         a.f[11] = var1.b[12];
         a.f[12] = var1.b[13];
         a.f[13] = var1.b[14];
         a.f[14] = var1.b[15];
         a.f[15] = var1.b[16];
         a.f[16] = var1.b[17];
         a.f[17] = var1.b[18];
         a.f[18] = var1.b[19];
         a.f[19] = var1.b[20];
         a.f[20] = var1.b[21];
         a.f[21] = var1.b[22];
         a.f[22] = var1.b[23];
         a.f[23] = var1.b[24];
         a.f[24] = var1.b[25];
         a.f[25] = var1.b[26];
         a.f[26] = var1.b[27];
         a.f[27] = var1.b[28];
         a.f[28] = var1.b[29];
         a.f[29] = var1.b[30];
         a.f[30] = var1.b[31];
         a.f[31] = var1.b[32];
         a.f[32] = var1.b[33];
         a.f[33] = var1.b[34];
         a.f[34] = var1.b[35];
         a.f[35] = var1.b[36];
         a.f[36] = var1.b[37];
         a.f[37] = var1.b[38];
      } else {
         a.f[38] = var1.b[1];
         a.f[39] = var1.b[2];
         a.f[40] = var1.b[3];
         a.f[41] = var1.b[4];
         a.f[42] = var1.b[5];
         a.f[43] = var1.b[6];
         a.f[44] = var1.b[7];
         a.f[45] = var1.b[8];
         a.f[46] = var1.b[9];
         a.f[47] = var1.b[10];
         a.f[48] = var1.b[11];
         a.f[49] = var1.b[12];
         a.f[50] = var1.b[13];
         a.f[51] = var1.b[14];
         a.f[52] = var1.b[15];
         a.f[53] = var1.b[16];
         a.f[54] = var1.b[17];
         a.f[55] = var1.b[18];
         a.f[56] = var1.b[19];
         a.f[57] = var1.b[20];
         a.f[58] = var1.b[21];
         a.f[59] = var1.b[22];
         a.f[60] = var1.b[23];
         a.f[61] = var1.b[24];
         a.f[62] = var1.b[25];
         a.f[63] = var1.b[26];
         a.f[64] = var1.b[27];
         a.f[65] = var1.b[28];
         a.f[66] = var1.b[29];
         a.f[67] = var1.b[30];
         a.f[68] = var1.b[31];
         a.f[69] = var1.b[32];
         a.f[70] = var1.b[33];
         a.f[71] = var1.b[34];
         a.f[72] = var1.b[35];
         a.f[73] = var1.b[36];
         a.f[74] = var1.b[37];
         a.f[75] = var1.b[38];
      }

      var1.i();
      if (this.b[44] == 0) {
         this.b[44] = 1;
      } else {
         this.b[44] = 0;
      }

      var1 = this;
      if (this.b[44] == 0) {
         var1.b[1] = a.f[0];
         var1.b[2] = a.f[1];
         var1.b[3] = a.f[2];
         var1.b[4] = a.f[3];
         var1.b[5] = a.f[4];
         var1.b[6] = a.f[5];
         var1.b[7] = a.f[6];
         var1.b[8] = a.f[7];
         var1.b[9] = a.f[8];
         var1.b[10] = a.f[9];
         var1.b[11] = a.f[10];
         var1.b[12] = a.f[11];
         var1.b[13] = a.f[12];
         var1.b[14] = a.f[13];
         var1.b[15] = a.f[14];
         var1.b[16] = a.f[15];
         var1.b[17] = a.f[16];
         var1.b[18] = a.f[17];
         var1.b[19] = a.f[18];
         var1.b[20] = a.f[19];
         var1.b[21] = a.f[20];
         var1.b[22] = a.f[21];
         var1.b[23] = a.f[22];
         var1.b[24] = a.f[23];
         var1.b[25] = a.f[24];
         var1.b[26] = a.f[25];
         var1.b[27] = a.f[26];
         var1.b[28] = a.f[27];
         var1.b[29] = a.f[28];
         var1.b[30] = a.f[29];
         var1.b[31] = a.f[30];
         var1.b[32] = a.f[31];
         var1.b[33] = a.f[32];
         var1.b[34] = a.f[33];
         var1.b[35] = a.f[34];
         var1.b[36] = a.f[35];
         var1.b[37] = a.f[36];
         var1.b[38] = a.f[37];
      } else {
         var1.b[1] = a.f[38];
         var1.b[2] = a.f[39];
         var1.b[3] = a.f[40];
         var1.b[4] = a.f[41];
         var1.b[5] = a.f[42];
         var1.b[6] = a.f[43];
         var1.b[7] = a.f[44];
         var1.b[8] = a.f[45];
         var1.b[9] = a.f[46];
         var1.b[10] = a.f[47];
         var1.b[11] = a.f[48];
         var1.b[12] = a.f[49];
         var1.b[13] = a.f[50];
         var1.b[14] = a.f[51];
         var1.b[15] = a.f[52];
         var1.b[16] = a.f[53];
         var1.b[17] = a.f[54];
         var1.b[18] = a.f[55];
         var1.b[19] = a.f[56];
         var1.b[20] = a.f[57];
         var1.b[21] = a.f[58];
         var1.b[22] = a.f[59];
         var1.b[23] = a.f[60];
         var1.b[24] = a.f[61];
         var1.b[25] = a.f[62];
         var1.b[26] = a.f[63];
         var1.b[27] = a.f[64];
         var1.b[28] = a.f[65];
         var1.b[29] = a.f[66];
         var1.b[30] = a.f[67];
         var1.b[31] = a.f[68];
         var1.b[32] = a.f[69];
         var1.b[33] = a.f[70];
         var1.b[34] = a.f[71];
         var1.b[35] = a.f[72];
         var1.b[36] = a.f[73];
         var1.b[37] = a.f[74];
         var1.b[38] = a.f[75];
      }

      var1.f();
      if (this.b[44] == 0) {
         a.c(61, 17, true);
         a.c(61, 18, false);
      } else {
         a.c(61, 17, false);
         a.c(61, 18, true);
      }

      int[] var3 = this.a(18);
      a.g(0, a.a(0, var3[0], var3[1]));
      int[] var4 = this.a(17);
      a.g(1, a.a(1, var4[0], var4[1]));
      int[] var5 = this.a(12);
      a.g(2, a.a(2, var5[0], var5[1]));
      int[] var6 = this.a(5);
      a.g(3, a.a(3, var6[0], var6[1]));
      int[] var7 = this.a(4);
      a.g(5, a.a(5, var7[0], var7[1]));
      int[] var8 = this.a(3);
      a.g(6, a.a(6, var8[0], var8[1]));
      int[] var9 = this.a();
      a.g(4, a.a(4, var9[0], var9[1]));
      a.g(7, a.a(7, a.br, 0));
      this.i();
   }

   public static i a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      boolean var5,
      int var6,
      int var7,
      int var8,
      boolean var9,
      int var10,
      int var11,
      boolean var12,
      boolean var13,
      int var14,
      boolean var15
   ) {
      var2 = var6;
      Object var17 = null;
      var6 = var2;
      byte var18 = 43;
      i var19;
      (var19 = new i()).a = 43;
      var19.a(43, null);
      if (var6 > -1) {
         var7 = var6;
         i var21 = var19;
         if (var19.p != var7) {
            var21.p = var7;
            var21.u = var21.q;
            i var23 = null;

            for (var24 = a[var7]; var24 != null && var21.u > var24.q; var24 = var24.a) {
               var23 = var24;
            }

            var21.b = var23;
            var21.a = var24;
            if (var23 == null) {
               a[var7] = var21;
            } else {
               var23.a = var21;
            }

            if (var24 != null) {
               var24.b = var21;
            } else {
               b[var7] = var21;
            }
         }
      }

      c = var19;
      var19.b = var0;
      c.c = var1;
      c.q = 10;
      c.t = var5 ? 1 : 0;
      c.b = new int[9];
      c.b[2] = 0;
      c.b[1] = var4;
      c.b[0] = var3;
      c.b[3] = var5 ? 1 : 0;
      c.b[4] = -1;
      c.b[5] = 0;
      c.b[6] = -1;
      c.b[7] = var13 ? 1 : 0;
      c.b[8] = 0;
      if (c.b[3] > 0) {
         c.a = new p(a.a[var3], c.b, c.c);
         c.a.b(var4, 1);
      }

      c.r = 0;
      c.s = 0;
      c.d = c.b;
      c.e = c.c;
      c.d = c.d + c.r;
      c.e = c.e + c.s;
      return c;
   }
}
