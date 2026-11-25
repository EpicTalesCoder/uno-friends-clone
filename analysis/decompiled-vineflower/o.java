final class o implements c, d {
   public static int a;
   public static int b;
   public static int c;
   public static int d = 0;
   public static int e = 0;
   public static boolean a = true;
   public static boolean b = false;
   private static int[][] a = new int[][]{{50, 100, 150}, {50, 100, 150}, {50, 100, 150}, {100, 150, 200}, {20, 50, 80}};
   public static int f;
   public static int g;
   public static int h;
   public static int i = 0;
   private static int n;
   static int j = 0;
   public static int k = -1;
   static int l = 0;
   public static int m = 0;
   private static int o = -1;
   private static int p = -1;
   public static boolean c = false;
   public static boolean d = false;
   public static boolean e = false;
   public static boolean f = false;

   public static int a(boolean var0) {
      int var1 = 0;
      if (a == 0) {
         var1 = 200;
      } else if (a != 2 && !var0) {
         if (a == 1 && !var0) {
            var1 = -1;
         }
      } else if (i == 0 || i == 1 || i == 2) {
         var1 = a.c[0] * a[i][e] / 100;
      } else if (i == 3) {
         var1 = a[i][e] * a.j;
      } else {
         var1 = (a.c[3] + a.c[2] + a.c[1]) * a[i][e] / 100;
      }

      return var1;
   }

   public static void a(int var0, int var1) {
      a = 1;
      if (var1 >= a.a[var0].length - 1) {
         var1 = 0;
      }

      int[] var2;
      e = (var2 = a.a[var0][var1])[1];
      int var3;
      if ((var3 = var2[0]) == 3) {
         a.j = 3;
      }

      b(var3);
      int var4 = var1;
      var3 = var0;
      int[] var6 = a.a[var3][var4];
      var4 = 4;
      if (var6[2] == -1) {
         var4--;
      }

      if (var6[3] == -1) {
         var4--;
      }

      if (var6[4] == -1) {
         var4--;
      }

      f = var4;
      j = var2[5] != 0 ? 1 : 0;
      a.l = 1;
      a.i = var2[7] != 0 ? 1 : 0;
      a.k = var2[9];
      g = var0;
      b = var1;
      h = 0;
      if (e() || i == 2) {
         a.c = 250;
      }

      a.a[0] = a.a(a.s);
      a.a[0] = a.a[0].trim();
      a.a[1] = a.a(a.b[var2[2]][0], 1);
      a.a[2] = a.a(a.b[var2[3]][0], 1);
      a.a[3] = a.a(a.b[var2[4]][0], 1);
      if (b == 0) {
         a.d();
      }
   }

   public static void a(int var0) {
      boolean var3 = false;
      a = var0;
      a.f = false;
      a.g = false;
      if (a != 1) {
         b = 0;
      }

      if (a == 3) {
         e = 0;
         b(0);
         a.c = 250;
         j = 0;
         a.l = 1;
         a.i = 1;
         a.k = 0;
         m = 0;
         a.f = true;
         f = 4;
         j.b(0, 15);
         if (a.d[0] == 0) {
            a.a[0] = a.b(665);
         } else {
            a.a[0] = a.b(648);
         }

         j.b(16, 25);
         if (a.d[1] == 0) {
            a.a[1] = a.b(666);
         } else {
            a.a[1] = a.b(649);
         }

         j.b(26, 35);
         if (a.d[2] == 0) {
            a.a[2] = a.b(667);
         } else {
            a.a[2] = a.b(650);
         }

         j.b(36, 49);
         if (a.d[3] == 0) {
            a.a[3] = a.b(668);
         } else {
            a.a[3] = a.b(651);
         }
      }

      if (a == 2 || a == 0) {
         a.a[0] = a.a(a.s);
         a.a[0] = a.a[0].trim();
         f = 4;
         int var1 = var0 = a.a(a.b[a.a[1]][40], 1);

         while (var0 == var1) {
            var1 = a.a(a.b[a.a[2]][40], 2);
         }

         int var2 = var0;

         while (var2 == var1 || var0 == var2) {
            var2 = a.a(a.b[a.a[3]][40], 3);
         }

         j.a("cRules.java:469:iCharacterID[WEST]:" + a.a[1]);
         a.a[1] = a.b(var0 + 68);
         j.a("cRules.java:472:iCharacterID[NORTH]:" + a.a[2]);
         a.a[2] = a.b(var1 + 68);
         j.a("cRules.java:475:iCharacterID[EAST]:" + a.a[3]);
         a.a[3] = a.b(var2 + 68);
      }

      if (a != 1 || b == 0) {
         a.d();
      }

      c = 0;
   }

   public static int a() {
      return a;
   }

   public static void b(int var0) {
      i = var0;
      if (var0 == 1) {
         f = 2;
      }
   }

   public static void a(int var0, boolean var1) {
      n |= var0;
   }

   public static void a() {
      n = 0;
   }

   public static boolean a() {
      return j == 1;
   }

   public static boolean a(n var0, int var1) {
      return a() && var0.a(var1, 0, true);
   }

   public static boolean b() {
      return m == 1;
   }

   public static boolean c() {
      return i == 1 ? true : f == 2;
   }

   public static int b() {
      int var0 = 4;

      for (int var1 = 0; var1 < 4; var1++) {
         if (a.a[var1].a == 2) {
            var0--;
         }
      }

      return var0;
   }

   public static boolean d() {
      return f == 3;
   }

   public static boolean e() {
      return i == 4;
   }

   public static boolean f() {
      return i == 3;
   }

   public static int c() {
      return p;
   }

   public static void c(int var0) {
      a.a(10, false);
      a.b.b(-1, -1);
      a.b.b(0, 1);
      a.b.a(0);
      if (var0 == 0) {
         a.b.a(c.bA, c.f_ * 3 / 4);
      } else if (var0 == 1) {
         a.b.a((c.e_ << 1) / 5, c.bB);
      } else if (var0 == 2) {
         a.b.a(c.bA, c.f_ / 4);
      } else if (var0 == 3) {
         a.b.a(c.e_ * 3 / 5, c.bB);
      }

      a.a[0] = a.a(a.b);
      c = false;
   }

   public static boolean a(int var0) {
      if (!b()) {
         return false;
      }

      o = var0;

      int var1;
      for (var1 = a(var0, a); var1 != var0; var1 = a(var1, a)) {
         if (a.a[var1].d(a.n, a.o, true) && (a.n < 10 || var1 == 0)) {
            p = var1;
            d = true;
            if (var1 != 0) {
               c(var1);
            } else {
               a.e(153, 1);
            }

            return true;
         }
      }

      if (a.a[var0].d(a.n, a.o, true) && (a.n < 10 || var0 == 0)) {
         p = var0;
         d = true;
         if (var1 != 0) {
            c(var0);
         } else {
            a.e(153, 1);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean g() {
      return d;
   }

   public static void b() {
      d = false;
      byte var0 = -1;
      o = -1;
      var0 = -1;
      p = -1;
   }

   public static int d() {
      return a(a.p, a);
   }

   public static int a(int var0, boolean var1) {
      if (var1) {
         var0 = (var0 + 1) % 4;
      } else {
         var0 = (var0 + 4 - 1) % 4;
      }

      if (a.a[var0].a == 2) {
         var0 = a(var0, var1);
      }

      return var0;
   }

   public static int e() {
      return b(a.p, a);
   }

   private static int b(int var0, boolean var1) {
      if (!var1) {
         var0 = (var0 + 1) % 4;
      } else {
         var0 = (var0 + 4 - 1) % 4;
      }

      if (a.a[var0].a == 2) {
         var0 = b(var0, var1);
      }

      return var0;
   }

   public static void a(int var0, r var1) {
      l = 50;
      var1.e = true;
      var1.b(var1.a.a(0));
      n var4 = var1.a;
      var1.a(a.n, a.o);

      for (int var2 = 0; var2 < var4.a; var2++) {
         q var3 = var4.a(var2);
         if (d) {
            if (n.a(var3.a, a.b.b.a) && var3.b == a.b.b.b) {
               var1.b(var1.a.a(var3.c));
            }
         } else if (n.a(var3.a, a.b.b.a)) {
            var1.b(var1.a.a(var3.c));
         }
      }
   }

   public static void a(r var0) {
      l = 0;
      var0.e = false;
   }

   public static void a(r var0, boolean var1) {
      var0.f = var1;
   }

   public static void b(r var0) {
      if (--l <= 0) {
         if (d) {
            if (a.b.b.a()) {
               a.q = 10;
               a.a[a.p].a();
               a.p = a(o, a);
               b();
               a.a[a.p].b();
            } else if (a.b.b.a == 11) {
               a.q = 10;
               a.a[a.p].a();
               a.p = a(o, a);
               b();
               a.a[a.p].b();
               a.a[a.p].c = true;
            } else if (a.b.b.a == 10) {
               a = !a;
               a.q = 10;
               if (b() == 2) {
                  b = true;
               } else {
                  a.a[a.p].a();
                  a.p = a(o, a);
                  b();
                  a.a[a.p].b();
               }

               if (a) {
                  a.c.b(2, 1);
                  a.d.b(-1, 1);
               } else {
                  a.c.b(3, 1);
                  a.d.b(-1, 1);
               }
            } else if (a.b.b.a == 12) {
               a.q = 10;
               a.a[a.p].a();
               a.p = a(o, a);
               b();
               a.a[a.p].b();
               a.a[a.p].d = true;
               a.a(a.b, 2);
            } else if (a.b.b.a == 13) {
               a.a[a.p].a();
               a.p = o;
               a.a[a.p].b();
               b();
               a.a(4);
               a.a[a.p].i = true;
               a.a[a.p].k = false;
            } else if (a.b.b.a == 14) {
               a.a[a.p].a();
               a.p = o;
               a.a[a.p].b();
               b();
               a.a(4);
               a.a(a.b, 2);
               a.a[a(a.p, a)].g = true;
               a.a[a(a.p, a)].a(14, -1);
               a.a[a.p].i = true;
               a.a[a.p].k = false;
            }

            b();
            a(var0);
            return;
         }

         if (a.b.b.a == 14) {
            a.q = 10;
            if (a.l == 1) {
               a.a[a.p].g = true;
               a.a[a.p].k = true;
               a.a(6);
               if (a.r == 0) {
                  a.a(a.b, 2);
               }
            }
         }

         a(var0);
         boolean var1 = true;
         var0.f = var1;
      }
   }

   public static int a(int var0) {
      return (var0 + 2) % 4;
   }

   static {
      int[] var10000 = new int[]{-1, -1, 1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1};
      int[][] var0 = new int[][]{
         {0, 1, -1, 0, 0},
         {0, 4, -1, 0, 1},
         {0, 10, -1, 0, 2},
         {1, 4, -1, 0, 3},
         {1, 10, -1, 0, 4},
         {2, 15, -1, 0, 5},
         {3, 10, -1, 0, 6},
         {4, 1, 2, 0, 7},
         {5, 1, -1, 0, 8},
         {6, 5, -1, 0, 9},
         {7, 5, -1, 0, 10},
         {8, 5, -1, 0, 11},
         {9, 4, -1, 0, 12},
         {10, 1, -1, 0, 13},
         {11, 1, -1, 0, 14},
         {12, 1, -1, 0, 15},
         {13, 1, -1, 0, 16},
         {14, 1, -1, 0, 17},
         {15, 1, -1, 0, 18},
         {16, 1, -1, 0, 19},
         {17, 1, -1, 0, 20},
         {18, 1, -1, 0, 21},
         {19, 8, -1, 0, 22},
         {20, 1, -1, 0, 23},
         {21, 20, -1, 0, 24},
         {22, 300, -1, 0, 25},
         {23, 5000, -1, 0, 26},
         {24, 1, -1, 0, 27},
         {25, 3, -1, 0, 28},
         {26, 1, -1, 0, 29},
         {27, 5, -1, 1, 1},
         {27, 10, -1, 1, 2},
         {27, 15, 0, 1, 3},
         {27, 15, 1, 1, 4},
         {27, 15, 2, 1, 5},
         {28, -1, -1, 2, -1},
         {29, -1, -1, 3, -1},
         {-1, -1, -1, 4, -1}
      };
   }
}
