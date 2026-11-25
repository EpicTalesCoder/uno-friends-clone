import javax.microedition.lcdui.Graphics;

final class q implements c, d {
   public q a;
   public q b;
   public int a;
   public int b;
   public int c;
   public boolean a;
   public int d;
   public int e;
   public int f;
   public int g;
   private int o;
   private int p;
   private int q;
   private int r;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   public int l = -1;
   public static boolean b;
   public static boolean c = false;
   private int s;
   public boolean d;
   p a;
   private e a;
   public boolean e;
   private int t = -1;
   private int u;
   public int m;
   public static int n = 0;
   private static int[] a = new int[]{-9, -3, 7, 12, 2};
   private static int[] b = new int[]{-10, 3, -14, -3, -7};
   public static q[] a = new q[6];
   private static int v;
   private int w;
   private int x;
   private int y;
   private int z;
   private static int A = c.bA;
   private static int B = c.bB;
   private static int C = c.bA;
   private static int D = c.bB;

   public q() {
   }

   public final void a(boolean var1, int var2, int var3, n var4) {
      this.e = true;
      if (this.e) {
         n++;
      }

      this.u = var2;
      n var14 = var4;
      q var10 = this;
      int var5 = var14.d;
      if (var14.d == 5) {
         if (var10.a()) {
            var10.o = (c.e_ - h >> 1) + a[v % 5];
            var10.p = (c.f_ - i >> 1) + b[v % 5];
            var10.s = v % 5;
            var10.d = true;
            v++;
         } else {
            var10.o = c.e_ - h >> 1;
            var10.p = c.f_ - i >> 1;
            var10.d = true;
            var10.s = 5;
         }
      } else {
         int var6 = var14.a;
         int var7 = var14.a.d;
         int var9;
         if (var5 == 0) {
            int var8;
            if (var6 > 5) {
               if (a.p == 0) {
                  var8 = h + 135 + 6 * (var6 - 5);
               } else {
                  var8 = h + 108 + 6 * (var6 - 5);
               }
            } else if (a.p == 0) {
               var8 = h + var6 * 27;
            } else {
               var8 = h + 27 * (var6 - 1);
            }

            if ((var9 = c.e_ - var8 >> 1) + var8 > 600) {
               var9 = 600 - var8;
            }
         } else {
            int var16;
            if (var6 > 5) {
               var16 = h + (j << 2) + k * (var6 - 5);
            } else {
               var16 = h + j * (var6 - 1);
            }

            if (var5 == 2) {
               var9 = (c.e_ + var16 >> 1) - h;
            } else if (var5 == 1) {
               var9 = c.f_ - var16 - 20 >> 1;
            } else {
               var9 = (c.f_ + var16 - 20 >> 1) - h;
            }
         }

         q var15 = var14.a;

         label197:
         while (var15 != null) {
            if (var15.c == var10.c) {
               switch (var5) {
                  case 0:
                     var10.o = var9;
                     var10.p = c.f_ - i;
                     break label197;
                  case 1:
                     var10.o = -12;
                     var10.p = var9;
                     break label197;
                  case 2:
                     var10.o = var9;
                     var10.p = -12;
                     break label197;
                  case 3:
                     var10.o = c.e_ - i + 12;
                     var10.p = var9;
                  case 4:
                  default:
                     break label197;
               }
            }

            if ((var15 = var15.b) != null) {
               if (var5 == 0 && var15.c == var7 + 1 && a.p == 0) {
                  var9 += 40;
               } else if (var5 != 0 && var5 != 1) {
                  var9 -= var15.a(var7, var6, var5 == 0);
               } else {
                  var9 += var15.a(var7, var6, var5 == 0);
               }
            }
         }
      }

      q var11;
      if ((var11 = var10).u != 0) {
         var11.q = (var11.o - var11.f) % var11.u == 0 ? (var11.o - var11.f) / var11.u : (var11.o - var11.f) / (var11.u - 1);
         var11.r = (var11.p - var11.g) % var11.u == 0 ? (var11.p - var11.g) / var11.u : (var11.p - var11.g) / (var11.u - 1);
         var11.w = var11.o < var11.f ? var11.o : var11.f;
         var11.x = var11.p < var11.g ? var11.p : var11.g;
         var11.y = (var11.o > var11.f ? var11.o : var11.f) + i;
         var11.z = (var11.p > var11.g ? var11.p : var11.g) + i;
         if (n == 1) {
            A = var11.w;
            B = var11.x;
            C = var11.y;
            D = var11.z;
         } else {
            int[] var12;
            A = (var12 = a.a(var11.w, var11.x, var11.y, var11.z, A, B, C, D))[0];
            B = var12[1];
            C = var12[2];
            D = var12[3];
         }
      }

      var1 = var4.d;
      this.a.a(a.a[55]);
      if (var3 == 4) {
         if (var1 != 0) {
            return;
         }

         this.a.a(a.a[57]);
         this.t = this.b + 5;
         this.t = 5;
      } else if (var1 == 5) {
         this.a.a(a.a[57]);
         if (var3 == 0) {
            return;
         }

         this.t = 0 + (var3 - 1);
      } else if (var3 == 0) {
         this.a.a(a.a[57]);
         switch (var1) {
            case 1:
               this.t = 4;
               break;
            case 2:
               this.t = 4;
               break;
            case 3:
               this.t = 4;
         }
      } else if (var1 == 0) {
         this.a.a(a.a[57]);
         switch (var3) {
            case 1:
               this.t = 5;
               break;
            case 2:
               this.t = this.b + 5;
               this.t = 5;
               break;
            case 3:
               this.t = this.b + 5;
               this.t = 5;
         }
      } else if (var3 == 1 && var1 == 2) {
         this.t = 8;
      } else if (var3 == 2 && var1 == 1) {
         this.t = 10;
      } else if (var3 == 2 && var1 == 3) {
         this.t = 11;
      } else if (var3 == 3 && var1 == 2) {
         this.t = 12;
      } else if (var3 == 1 && var1 == 3) {
         this.t = 9;
      } else if (var3 == 3 && var1 == 1) {
         this.t = 13;
      }

      this.a.b(this.t, 1);
      this.a.a(this.b);
   }

   public final void a(int var1, boolean var2) {
      int var4 = var1;
      q var3 = this;
      if ((this.a == 13 || var3.a == 14) && var3.b != 0 && (var4 == 0 || var4 == 4)) {
         var3.b = 0;
      }

      if (var4 == 0) {
         if (var3.b != 0) {
            var3.a.e(var3.b - 1);
         }
      } else if (var4 == 5) {
         if (var3.b != 0) {
            var3.a.e(var3.b - 1);
         }
      } else {
         var3.a.e(0);
      }

      Graphics var5 = j.b;
      this.a.a(this.f, this.g);
      if (!var2) {
         j.b = a.a;
      }

      if (this.a.a().equals(a.a[56])) {
         this.a.a(this.b - 1);
      } else if (this.a.a().equals(a.a[a.a]) || this.a.a().equals(a.a[51])) {
         this.a.a(a.b);
      }

      if (!this.a) {
         this.a.c();
      }

      if (var1 == 0 && (this.a.a().equals(a.a[56]) || this.a.a().equals(a.a[54]))) {
         boolean var6 = a.b(39) > 0;
         if (this.e != 1 && var6) {
            a.a[70].a(j.b, 0, this.f, this.g, 0);
         }
      }

      if (this.a && var1 == 0 && (this.a.a().equals(a.a[56]) || this.a.a().equals(a.a[54]))) {
         a.a[186].a(j.b, 23, this.f, this.g, 0);
      }

      if (this.a && var1 != 0 && this.a.a().equals(a.a[80])) {
         if (var1 == 1) {
            a.a[186].a(j.b, 25, this.f, this.g, 0);
         } else if (var1 == 2) {
            a.a[186].a(j.b, 26, this.f, this.g, 0);
         }

         if (var1 == 3) {
            a.a[186].a(j.b, 27, this.f, this.g, 0);
         }
      }

      if (!var2) {
         j.b = var5;
      }
   }

   public final void b(int var1, boolean var2) {
      if (this.a.a().equals(a.a[56])) {
         a.a[34].a(j.b, 4, this.f, this.g, 0);
      }

      this.a(var1, true);
   }

   public final void a(int var1, int var2, int var3) {
      if (this.e) {
         if (a.b.a() >= 0 && o.c) {
            return;
         }

         if (this.m > 0) {
            this.m--;
            return;
         }

         if (this.a.a() == this.t && this.a.a()) {
            this.t = -1;
            this.a(var1);
         }

         this.u--;
         if (this.u <= 0) {
            this.e = false;
            if (var1 >= 0 && var1 <= 3) {
               if (var1 != 0) {
                  a.a[a.a(var1)] = true;
               }

               a.a = (byte)var1;
            }

            if (--n == 0) {
               a.e = true;
               A = c.bA;
               B = c.bB;
               C = c.bA;
               D = c.bB;
               a.e(2);
            }

            this.q = 0;
            this.r = 0;
            this.u = 0;
            if (this == a.a) {
               a.a = null;
            }

            this.a(var1);
            if (this == a.b.b) {
               a.a(this.a, this.b);
               if (a[this.s] != null) {
                  a[this.s].d = false;
               }

               a[this.s] = this;
            }
         } else {
            this.a(this.f + this.q, this.g + this.r);
         }

         if (this.a != null) {
            this.a.b(j.a_);
         }

         if (this.u > 0) {
            return;
         }
      }

      label268: {
         switch (var1) {
            case 0:
               if (var1 == 0 && o.l <= 0) {
                  if ((this.l == 0 || this.l == 1)
                     && a.bu != -1
                     && a.bv != -1
                     && a.bv + 20 < c.f_ - i / 3
                     && a.bv - i + 20 < c.f_ - i
                     && a.bu - h + 20 >= 150
                     && a.bu - h + 20 + h <= 498
                     && a.bv - i + 20 >= 220
                     && var3 == this.c
                     && a.p == 0
                     && !a.a(10, 26)
                     && !a.a(10, 25)
                     && !a.a(10, 24)
                     && (a.a() > 5 || a.a() < -5 || a.b() > 5 || a.b() < -5)) {
                     this.l = 3;
                     this.a(a.bw - h + 20, a.bx - i + 20);
                     break label268;
                  }

                  if (this.l == 3) {
                     if (this.g < c.f_ - i) {
                        c = true;
                     }

                     if (a.bv + 20 >= c.f_ - i / 3 && c && Math.abs(a.bu - h + 20 - this.o) <= h) {
                        b = false;
                        this.l = 1;
                        c = false;
                        this.a(this.f, c.f_ - i);
                        break label268;
                     }

                     if (a.bu != -1 && a.bv != -1) {
                        b = false;
                        boolean var6 = false;
                        if (a.bu - h + 20 >= 150 && a.bu - h + 20 + h <= 498 && a.bv - i + 20 + 100 >= 220) {
                           this.a(a.bw - h + 20, a.bx - i + 20);
                        }

                        if (a.bu - h + 20 < 150) {
                           this.a(150, this.g);
                           this.a(150, a.bx - i + 20);
                           var6 = true;
                        }

                        if (a.bu - h + 20 + h > 498) {
                           this.a(508 - h - 10, a.bx - i + 20);
                           var6 = true;
                        }

                        if (a.bv - i + 20 < 235) {
                           if (var6) {
                              this.a(this.f, 235);
                           } else {
                              this.a(a.bw - h + 20, 235);
                           }
                        }
                        break label268;
                     }
                  }
               }

               if (!a.f) {
                  if (b) {
                     if (var3 == this.c) {
                        if (this.g > c.f_ - i - j) {
                           this.a(this.f, this.g - j / 2);
                           a.e = true;
                        }

                        if (this.g <= c.f_ - i - j) {
                           this.a(this.f, c.f_ - i - j);
                        }
                     } else {
                        var3 = c.f_ - i - ((i >> 2) - Math.abs(c.bA - (this.f + (h >> 1))) >> 2);
                        if (this.g < var3) {
                           this.a(this.f, this.g + j / 2);
                           a.e = true;
                        }

                        if (this.g >= var3) {
                           this.a(this.f, var3);
                        }
                     }

                     if (this.f < var2) {
                        this.f += 27;
                        a.e = true;
                     } else if (this.f > var2) {
                        this.f -= 27;
                        a.e = true;
                     }

                     if (j.e(this.f - var2) < 27) {
                        this.a(var2, this.g);
                     }
                  } else if (var3 == this.c) {
                     this.a(var2, c.f_ - i - j);
                  } else {
                     this.a(var2, c.f_ - i);
                     this.b(var1);
                  }
               } else if (a.a[a.p].b != var1 || a.a[a.p].i || a.a[a.p].d || a.a[a.p].g || a.a[a.p].c) {
                  this.a(var2, c.f_ - i);
                  this.b(var1);
                  if (a.d[a.a(var1)] == 1) {
                     this.a(this.f, this.g + (c.bB >> 1));
                  }
               } else if (b) {
                  if (var3 == this.c) {
                     if (this.g > c.f_ - i - j) {
                        this.a(this.f, this.g - j / 2);
                     }

                     if (this.g <= c.f_ - i - j) {
                        this.a(this.f, c.f_ - i - j);
                     }
                  } else {
                     if (this.g < c.f_ - i) {
                        this.a(this.f, this.g + j / 2);
                     }

                     if (this.g >= c.f_ - i) {
                        this.a(this.f, c.f_ - i);
                     }
                  }

                  if (this.f < var2) {
                     this.f += 27;
                  } else if (this.f > var2) {
                     this.f -= 27;
                  }

                  if (j.e(this.f - var2) < 27) {
                     this.a(var2, this.g);
                  }

                  this.b(var1);
                  if (a.d[a.p] == 1) {
                     this.a(this.f, this.g + (c.bB >> 1));
                  }
               } else {
                  if (var3 == this.c) {
                     this.a(var2, c.f_ - i - j);
                  } else {
                     this.a(var2, c.f_ - i);
                  }

                  this.b(var1);
                  if (a.d[a.p] == 1) {
                     this.a(this.f, this.g + (c.bB >> 1));
                  }
               }
               break label268;
            case 1:
               this.a(-12, var2);
               this.b(var1);
               break;
            case 2:
               this.a(var2, -12);
               this.b(var1);
               break;
            case 3:
               this.a(c.e_ + 12, var2);
               this.b(var1);
               break;
            case 4:
               int[] var4;
               (var4 = new int[4])[0] = a.a(10, 19, 2);
               var4[1] = a.a(10, 19, 3);
               var4[2] = a.a(10, 19, 5);
               var4[3] = a.a(10, 19, 6);
               this.a(var4[0] + (var4[2] >> 1), var4[1] + (var4[3] >> 1));
               break;
            case 5:
               if (this.o != 0 && this.p != 0 && this.a()) {
                  this.a(this.o, this.p);
               } else {
                  this.a(c.e_ - h >> 1, c.f_ - i >> 1);
               }
               break;
            default:
               break label268;
         }

         this.a(var1);
      }

      if (this.a != null) {
         this.a.b(j.a_);
      }
   }

   private void b(int var1) {
      switch (var1) {
         case 0:
            var1 = a.a(10, 1, 3) - ((i >> 1) - Math.abs(c.bA - (this.f + (h >> 1))) >> 2);
            if (o.a == 3) {
            }

            this.a(this.f, var1);
            return;
         case 1:
            var1 = a.a(10, 2, 2) - (Math.abs(c.bB - this.g) >> 2) - 12;
            if (a.p != a.a(1)) {
               var1 -= h / 3;
            }

            this.a(var1, this.g);
            return;
         case 2:
            var1 = a.a(10, 3, 3) - (Math.abs(c.bA - this.f) >> 2) - 12;
            if (a.p != a.a(2)) {
               var1 -= i / 3;
            }

            this.a(this.f, var1);
            return;
         case 3:
            var1 = a.a(10, 4, 2) + i + (Math.abs(c.bB - this.g) >> 2) + 12;
            if (a.p != a.a(3)) {
               var1 += h / 3;
            }

            this.a(var1, this.g);
      }
   }

   public final void a(int var1) {
      if (!this.e || this.t < 0 || this.a.a()) {
         if (var1 != 0 || a.a[a.p].b == 0 && a.a[a.p].a != 0) {
            if (var1 == 5) {
               if (this.b == 0) {
                  this.a = a.a[54];
                  if (this.a != null && this.a == null) {
                     this.a = new p(this.a, this.f, this.g);
                  }

                  this.a.a(this.a);
                  this.a.b(this.a - 13, -1);
               } else if (a.b.b != this && (a.b.b != this.b || this.b == null || !a.b.b.e) && !this.e) {
                  this.a = a.a[81];
                  if (this.a != null && this.a == null) {
                     this.a = new p(this.a, this.f, this.g);
                  }

                  this.a.a(this.a);
                  this.a.b(this.d, -1);
               } else {
                  this.a = a.a[56];
                  if (this.a != null && this.a == null) {
                     this.a = new p(this.a, this.f, this.g);
                  }

                  this.a.a(this.a);
                  this.a.b(this.a, -1);
               }
            } else if (var1 == 4) {
               this.a = a.a[51];
               if (this.a != null && (this.a == null || this.a != null && !this.a.a().equals(this.a))) {
                  this.a = new p(this.a, this.f, this.g);
                  this.a.a(this.a);
               }

               if (a.a[a.p] != null && a.a[a.p].a != 0) {
                  this.a.b(0, -1);
                  if (a.a != null) {
                     a.a.b(-1, -1);
                  }
               } else if (a.a[a.p] == null || !a.a[a.p].k) {
                  this.a.b(0, -1);
                  if (a.a != null) {
                     a.a.b(-1, -1);
                  }
               } else if (a.m == 1 && !a.a[a.p].i && !a.a[a.p].c && !a.a[a.p].d && !a.a[a.p].g && a.a == null && a.a[a.p].f == 0) {
                  if (this.a.a() != 17 && a.a[a.p].k) {
                     this.a.b(0, -1);
                     if (a.a == null && a.a != null) {
                        a.a.b(13, -1);
                     }
                  }
               } else {
                  this.a.b(0, -1);
                  if (a.a != null) {
                     a.a.b(-1, -1);
                  }
               }

               int[] var2 = new int[4];
               a.a[23].a(var2, 0, a.a(10, 19, 2), a.a(10, 19, 3), 0);
               if (a.a(var2[0], var2[1], var2[2] - var2[0], var2[3] - var2[1])
                  && a.a[a.p].a == 0
                  && a.k != 2
                  && a.a[a.p].k
                  && a.b()
                  && a.m != 6
                  && a.m != 2
                  && a.h != 2) {
                  this.a.b(2, -1);
               }
            } else {
               this.a = a.a[a.a];
               if (this.a != null && this.a == null) {
                  this.a = new p(this.a, this.f, this.g);
               }

               this.a.a(this.a);
               if ((var1 = (var1 = var1 * 15) + this.d) < 0) {
                  var1 += 60;
               } else if (var1 >= 60) {
                  var1 -= 60;
               }

               this.a.b(var1 + 2, -1);
            }
         } else if (this.b == 0) {
            this.a = a.a[54];
            if (this.a != null && this.a == null) {
               this.a = new p(this.a, this.f, this.g);
            }

            this.a.a(this.a);
            this.a.b(this.a - 13, -1);
         } else {
            this.a = a.a[56];
            if (this.a != null && this.a == null) {
               this.a = new p(this.a, this.f, this.g);
            }

            this.a.a(this.a);
            this.a.b(this.a, -1);
         }

         if (h == 0 || i == 0) {
            h = a.a[56].b(0);
            i = a.a[56].c(0);
            k = (j = h / 3) >> 2;
         }
      }
   }

   public final void a(int var1, int var2) {
      this.f = var1;
      this.g = var2;
      this.a.a(this.f, this.g);
   }

   private static int a(boolean var0) {
      return var0 ? 27 : j;
   }

   private static int b(boolean var0) {
      return var0 ? 6 : k;
   }

   public final int a(int var1, int var2, boolean var3) {
      int var4;
      if (var2 - 1 - var1 > 2 && var1 > 2) {
         if (this.c <= var1 && this.c + 2 > var1) {
            var4 = a(var3);
         } else if (this.c > var1 && var1 + 2 >= this.c) {
            var4 = a(var3);
         } else {
            var4 = b(var3);
         }
      } else if (var1 <= 2) {
         if (this.c < 5) {
            var4 = a(var3);
         } else {
            var4 = b(var3);
         }
      } else if (this.c > var2 - 5) {
         var4 = a(var3);
      } else {
         var4 = b(var3);
      }

      return var4;
   }

   public final boolean a() {
      return this.a <= 9;
   }

   public final void a() {
      switch (this.a) {
         case 10:
         case 11:
         case 12:
            this.a = j.b(0, 10);
            return;
         case 13:
         case 14:
            this.a = 0 + j.b(0, 6);
            this.b = 1 + j.b(0, 4);
      }
   }

   public final void b() {
      this.a = true;
   }

   public final void c() {
      this.a = false;
   }

   public final boolean b() {
      return this.a > 9;
   }
}
