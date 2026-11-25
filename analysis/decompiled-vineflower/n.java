final class n implements c, d {
   public q a;
   public q b;
   public int a;
   public int b;
   public r a;
   public int c;
   public int d;

   public n() {
   }

   public final int a() {
      return this.a;
   }

   public final int b() {
      return this.b;
   }

   private void a(q var1) {
      if (var1 != null) {
         if (this.a != null) {
            var1.a = this.b;
            this.b.b = var1;
            this.b = var1;
         } else {
            this.a = this.b = var1;
            var1.a = var1.b = null;
         }

         this.a++;
      }
   }

   public final void a(int var1, int var2) {
      q var3;
      (var3 = new q()).a = var1;
      var3.b = var2;
      var3.a = false;
      var3.d = 0;
      var3.a(this.d);
      this.a(var3);
   }

   public final void a(q var1, int var2) {
      var1.a(this.d);
      if (this.a == 0) {
         this.a(var1);
      } else if (var2 <= 0) {
         var1.b = this.a;
         this.a.a = var1;
         this.a = var1;
         this.a++;
      } else if (var2 >= this.a) {
         this.a(var1);
      } else {
         q var3;
         for (var3 = this.a; var2 > 1; var3 = var3.b) {
            var2--;
         }

         q var4 = var3.b;
         var1.a = var3;
         var3.b = var1;
         var1.b = var4;
         var4.a = var1;
         this.a++;
      }
   }

   public final q a(int var1) {
      if (this.a == 0) {
         return null;
      }

      if (var1 <= 0) {
         return this.a;
      }

      if (var1 >= this.a) {
         return this.b;
      }

      q var2 = this.a;

      while (var1 > 0) {
         var2 = var2.b;
         var1--;
      }

      return var2;
   }

   public static void a(n var0, int var1, n var2, int var3) {
      q var5;
      if ((var5 = var0.a(var1)) != null) {
         if (var5.a == null) {
            if (var5.b == null) {
               var0.a = null;
               var0.b = null;
            } else {
               var0.a = var5.b;
               var5.b.a = null;
               var5.b = null;
            }
         } else if (var5.b == null) {
            var5.a.b = null;
            var0.b = var5.a;
            var5.a = null;
         } else {
            var5.a.b = var5.b;
            var5.b.a = var5.a;
            var5.a = null;
            var5.b = null;
         }

         var0.a--;
         if (var2 == a.b) {
            var5.d = j.b(0, 4);
         }

         var5.a(var2.d);
         if (var2.a == 0) {
            var2.a = var5;
            var2.b = var5;
         } else if (var3 <= 0) {
            var5.b = var2.a;
            var2.a.a = var5;
            var2.a = var5;
         } else if (var3 >= var2.a) {
            var5.a = var2.b;
            var2.b.b = var5;
            var2.b = var5;
         } else {
            q var4;
            for (var4 = var2.a; var3 > 1; var4 = var4.b) {
               var3--;
            }

            q var6 = var4.b;
            var5.a = var4;
            var4.b = var5;
            var5.b = var6;
            var6.a = var5;
         }

         var2.a++;
         var0.a();
         var2.a();
      }
   }

   public final boolean a(int var1, int var2, boolean var3) {
      if (this.a < 0) {
         return false;
      }

      q var4 = this.a(0);

      for (this.c = 0; var4 != null; var4 = var4.b) {
         if (var3) {
            if (a(var4.a, var1) && var4.e > 0 && !var4.a) {
               return true;
            }
         } else if (a(var4.a, var1) && !var4.a) {
            return true;
         }

         this.c++;
      }

      q var5 = this.a;

      for (this.c = 0; var5 != null && this.c < 0; var5 = var5.b) {
         if (var3) {
            if (a(var5.a, var1) && var5.e > 0 && !var5.a) {
               return true;
            }
         } else if (a(var5.a, var1) && !var5.a) {
            return true;
         }

         this.c++;
      }

      return false;
   }

   public final boolean b(int var1, int var2, boolean var3) {
      if (this.a < 0) {
         return false;
      }

      q var4 = this.a(0);

      for (this.c = 0; var4 != null; var4 = var4.b) {
         if (var3) {
            if (var4.b == var1 && var4.e > 0 && !var4.a) {
               return true;
            }
         } else if (var4.b == var1 && !var4.a) {
            return true;
         }

         this.c++;
      }

      q var5 = this.a;

      for (this.c = 0; var5 != null && this.c < 0; var5 = var5.b) {
         if (var3) {
            if (var5.b == var1 && var5.e > 0 && !var5.a) {
               return true;
            }
         } else if (var5.b == var1 && !var5.a) {
            return true;
         }

         this.c++;
      }

      return false;
   }

   public final boolean c(int var1, int var2, boolean var3) {
      if (this.a < 0) {
         return false;
      }

      q var4 = this.a(0);

      for (this.c = 0; var4 != null; var4 = var4.b) {
         if (var4.b == var1 && var4.a() && var4.e > 0 && !var4.a) {
            return true;
         }

         this.c++;
      }

      q var5 = this.a;

      for (this.c = 0; var5 != null && this.c < 0; var5 = var5.b) {
         if (var5.b == var1 && var5.a() && var5.e > 0 && !var5.a) {
            return true;
         }

         this.c++;
      }

      return false;
   }

   public final int a(q var1) {
      int var2 = -1;

      for (q var3 = this.a; var3 != null; var3 = var3.b) {
         var2++;
         if (var3.equals(var1)) {
            break;
         }
      }

      return var2;
   }

   public static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   public final boolean d(int var1, int var2, boolean var3) {
      this.c = -1;

      for (q var4 = this.a; var4 != null; var4 = var4.b) {
         this.c++;
         if (a(var4.a, var1) && (var4.b == var2 || var1 == 13 || var1 == 14)) {
            if (!var3 || !var4.a) {
               return true;
            }
         } else if (var4.b > var2) {
            return false;
         }
      }

      this.c++;
      return false;
   }

   public final void a() {
      q var2 = this.a;

      for (int var1 = 0; var2 != null; var1++) {
         var2.c = var1;
         var2 = var2.b;
      }
   }

   public final void b() {
      int var1;
      int var2 = var1 = this.a >> 1;
      if (var1 < 5) {
         var2 = 5;
      }

      for (q var3 = this.a; var3 != null; var3 = var3.b) {
         var3.d = (var3.c - var1) * var1 / var2;
         if ((var3.c - var1) * var1 % var2 != 0) {
            if (var3.c < var1) {
               var3.d--;
            } else {
               var3.d++;
            }
         }
      }
   }

   public final void a(boolean var1) {
      for (q var2 = this.a; var2 != null; var2 = var2.b) {
         if (this.d == 0 && this.a.d == var2.c) {
            if (var1) {
               var2.b(this.d, true);
            }
         } else if (var1) {
            if (this.d == 0 || var2.e) {
               var2.a(this.d, true);
            }
         } else if (this.d != 0 && !var2.e) {
            var2.a(this.d, false);
         }
      }
   }

   public final void c() {
      q var1 = this.a;
      if (this.a != null) {
         if (this.d == 4) {
            var1.a(this.d, -1, -1);
            var1.a(this.d, false);
            var1.a.b(j.a_);
         } else {
            a.e();
            if (this.b != null && this.b.d) {
               this.b.a(this.d, -1, -1);
               if (this.b.equals(this.b) && !this.b.e) {
                  this.b.b(this.d, true);
               } else {
                  this.b.a(this.d, true);
               }
            }

            a.c = !this.b.e;
         }
      }
   }

   public final void d() {
      for (q var1 = this.a; var1 != null; var1 = var1.b) {
         var1.a(this.d);
      }
   }

   public final void e() {
      this.b = this.a;
   }
}
