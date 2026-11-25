import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e {
   private static int[] c = new int[256];
   static boolean a;
   private static boolean c;
   private static int e;
   private static int f;
   private int g = -1;
   private static short[][] a;
   private static int[] d;
   private static int[] e;
   private static e[][] a;
   private int h = -1;
   private int i = -1;
   private static final boolean d;
   private static int[] f;
   private boolean e = false;
   private static int j;
   static int a;
   private static int k;
   private boolean f = false;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p = 0;
   private int q;
   private boolean g = false;
   private boolean h = false;
   private byte[] a = null;
   private short[][] b;
   private short a;
   private int r = -1;
   private int[] g = new int[4];
   private static short[] a;
   private static int s;
   private static int t;
   private static int u;
   private boolean i = false;
   private static int v;
   private static int w;
   private static int x;
   static int[] a;
   private static int[] h;
   private int y;
   private short[] b;
   private short[] c;
   private short[] d;
   private short[] e;
   private short[] f;
   private short[] g;
   private byte[] b;
   private short[] h;
   private short[] i;
   private byte[] c;
   private short[] j;
   private byte[] d;
   private short[] k;
   private byte[] e;
   private short[] l;
   private short[] m;
   private byte[] f;
   private byte[] g;
   private byte[] h;
   private short[] n;
   private short[] o;
   private byte[] i;
   private byte[] j;
   private short[] p;
   private byte[] k;
   private byte[] l;
   private byte[] m;
   private byte[] n;
   private byte[] o;
   private byte[] p;
   private short[][] c;
   private int z;
   private byte[] q;
   private int[] i;
   private byte[][] a;
   private int A;
   private short[][][] a;
   private int[][][] a;
   private byte[] r;
   int b;
   private int[] j;
   private int B;
   private boolean j;
   private boolean k;
   private int C;
   private short b;
   private int[] k;
   private int[] l;
   static int c;
   static int d;
   private static int D;
   private int[][][] b;
   private Image[][] a;
   private Image[] a;
   private int[] m;
   private int[] n;
   private int[] o;
   private int[] p;
   private int[] q;
   private static int[] r;
   private static int[] s;
   private static int[] t;
   private static int[] u;
   private byte[] s;
   private byte[] t;
   private int[] v;
   private byte a;
   private byte[][] b;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   static int[] b;
   private static boolean l;
   static boolean b;
   static char a;
   private int I = -1;
   private static boolean m;
   private static boolean n;
   private static int J;
   private static int K;

   final void a() {
      this.c = null;
      this.b = null;
      this.d = null;
      this.e = null;
      this.g = null;
      this.h = null;
      this.b = null;
      this.l = null;
      this.j = null;
      this.i = null;
      this.c = null;
      this.j = null;
      this.d = null;
      this.k = null;
      this.e = null;
      this.l = null;
      this.m = null;
      this.f = null;
      this.p = null;
      this.k = null;
      if (this.c != null) {
         for (int var1 = 0; var1 < this.c.length; var1++) {
            this.c[var1] = null;
         }

         this.c = null;
      }

      if (this.a != null) {
         for (int var2 = 0; var2 < this.a.length; var2++) {
            this.a[var2] = null;
         }

         this.a = null;
      }

      this.c();
      this.a = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }

   final void a(byte[] var1, int var2) {
      Object var19 = null;
      boolean var20 = true;
      int var3 = 16777215;
      var2 = 0;
      var1 = var1;
      this = this;
      if (var1 != null) {
         try {
            if (l) {
               System.gc();
            }

            var2++;
            int var10002 = ++var2;
            var2++;
            this.A = (var1[var10002] & 255) + ((var1[var2++] & 255) << 8) + ((var1[var2++] & 255) << 16) + ((var1[var2++] & 255) << 24);
            byte[] var5 = var1;
            int var4 = var2;
            e var31 = this;
            this.y = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
            if (var31.y > 0) {
               if ((var31.A & 32) != 0) {
                  var31.b = new short[var31.y];
                  var31.c = new short[var31.y];
               }

               var31.d = new short[var31.y];
               var31.e = new short[var31.y];
               int var6 = 0;
               byte var7 = 0;
               short[][] var8 = null;
               if ((var31.A & 4) != 0) {
                  var31.t = new byte[var31.y];
               }

               boolean var9 = false;
               boolean var10 = false;
               boolean var11 = false;

               for (int var15 = 0; var15 < var31.y; var15++) {
                  boolean var12 = false;
                  boolean var13 = false;
                  boolean var14 = false;
                  if ((var5[var4] & 255) == 0) {
                     var4++;
                     var9 = false;
                     var10 = true;
                     var11 = true;
                     if ((var31.A & 4) != 0) {
                        var31.t[var15] = var5[var4++];
                     }
                  } else if ((var5[var4] & 255) == 255) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 1;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 254) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 2;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 253) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 5;
                     var9 = false;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 252) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 3;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var12 = true;
                  } else if ((var5[var4] & 255) == 251) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 4;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var12 = true;
                  } else if ((var5[var4] & 255) == 250) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 6;
                     var9 = true;
                     var10 = false;
                     var11 = false;
                     var13 = true;
                  } else if ((var5[var4] & 255) == 249) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 7;
                     var9 = true;
                     var10 = false;
                     var11 = false;
                     var13 = true;
                  } else if ((var5[var4] & 255) == 248) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 8;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var13 = false;
                  } else if ((var5[var4] & 255) == 247) {
                     var4++;
                     var31.g(var31.y);
                     var31.s[var15] = 9;
                     var9 = true;
                     var14 = true;
                     var10 = false;
                     var11 = true;
                     var13 = false;
                  }

                  if (var9) {
                     var31.v[var15] = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                  }

                  if (var14) {
                     if (var8 == null) {
                        var8 = new short[var31.y][];
                     }

                     short[] var16 = new short[3];
                     int var17 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                     var16[0] = (short)var17;
                     var16[1] = (short)(var17 >> 16);
                     var16[2] = var5[var4++];
                     var8[var15] = var16;
                     var6++;
                     var7 += 3;
                  }

                  if (var10 && (var31.A & 32) != 0) {
                     var31.b[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var31.c[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  }

                  if (var11) {
                     if ((var31.A & 16) == 0) {
                        var31.d[var15] = (short)(var5[var4++] & 0xFF);
                        var31.e[var15] = (short)(var5[var4++] & 0xFF);
                     } else {
                        var31.d[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                        var31.e[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     }
                  }

                  if (var12) {
                     if (var8 == null) {
                        var8 = new short[var31.y][];
                     }

                     short[] var203;
                     (var203 = new short[2])[0] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var203[1] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var8[var15] = var203;
                     var6++;
                     var7 += 2;
                  }

                  if (var13) {
                     if (var8 == null) {
                        var8 = new short[var31.y][];
                     }

                     short[] var204;
                     (var204 = new short[4])[0] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var204[1] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var204[2] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var204[3] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var8[var15] = var204;
                     var6++;
                     var7 += 4;
                  }
               }

               if (var6 > 0) {
                  var31.f = new short[var7];
                  var31.g = new short[var6 << 1];
                  int var197 = 0;
                  short var205 = 0;

                  for (short var160 = 0; var160 < var31.y; var160++) {
                     byte var211;
                     if (var31.s[var160] == 3 || var31.s[var160] == 4) {
                        var211 = 2;
                     } else if (var31.s[var160] == 6 || var31.s[var160] == 7) {
                        var211 = 4;
                     } else if (var31.s[var160] == 9) {
                        var211 = 3;
                     } else {
                        var211 = -1;
                     }

                     if (var211 > 0) {
                        var31.g[var197 << 1] = var160;
                        var31.g[(var197 << 1) + 1] = var205;

                        for (int var143 = 0; var143 < var211; var143++) {
                           var31.f[var205] = var8[var160][var143];
                           var205++;
                        }

                        var8[var160] = null;
                        var197++;
                     }
                  }
               }
            }

            var2 = var4;
            var5 = var1;
            var4 = var2;
            e var33 = this;
            short var150;
            if ((var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               var33.g = new byte[var150];
               var33.n = new short[var150];
               var33.o = new short[var150];
               var33.h = new byte[var150];
               if ((var33.A & 16384) != 0) {
                  var33.i = new byte[var150];
               }

               for (int var161 = 0; var161 < var150; var161++) {
                  var33.g[var161] = var5[var4++];
                  if ((var33.A & 1024) == 0) {
                     var33.n[var161] = var5[var4++];
                     var33.o[var161] = var5[var4++];
                  } else {
                     var33.n[var161] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var33.o[var161] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  }

                  if ((var33.A & 16384) != 0) {
                     var33.i[var161] = var5[var4++];
                  }

                  var33.h[var161] = var5[var4++];
               }
            }

            var2 = var4;
            var5 = var1;
            var4 = var2;
            e var35 = this;
            if ((this.A & 32768) != 0) {
               var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
               if ((var35.A & 1024) == 0) {
                  var35.e = new byte[var150 << 2];
                  System.arraycopy(var5, var4, var35.e, 0, var150 << 2);
                  var4 += var150 << 2;
               } else {
                  var35.l = new short[var150 << 2];
                  var4 = a(var5, var4, var35.l, 0, var150 << 2, false);
               }
            }

            if ((var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               if ((var35.A & 2048) != 0) {
                  var35.h = new short[var150];
               } else {
                  var35.b = new byte[var150];
               }

               var35.i = new short[var150];
               if ((var35.A & 32768) != 0) {
                  var35.m = new short[var150 + 1];
               }

               short var169 = 0;

               for (int var173 = 0; var173 < var150; var173++) {
                  if ((var35.A & 2048) != 0) {
                     var35.h[var173] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var35.b[var173] = var5[var4++];
                  }

                  var35.i[var173] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  if ((var35.A & 32768) != 0 && (var35.A & 32768) != 0) {
                     var35.m[var173] = var169;
                     var169 = (short)(var169 + var5[var4++]);
                  }
               }

               if ((var35.A & 32768) != 0) {
                  var35.m[var35.m.length - 1] = var169;
               }

               if ((var35.A & 4096) == 0) {
                  int var174 = var150 << 2;
                  if ((var35.A & 1024) == 0) {
                     var35.c = new byte[var174];

                     for (int var176 = 0; var176 < var174; var176++) {
                        var35.c[var176] = var5[var4++];
                     }
                  } else {
                     var35.j = new short[var174];

                     for (int var177 = 0; var177 < var174; var177++) {
                        var35.j[var177] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     }
                  }
               }
            }

            var2 = var4;
            var5 = var1;
            var4 = var2;
            e var37 = this;
            if ((var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               var37.l = new byte[var150];
               var37.m = new byte[var150];
               var37.n = new byte[var150];
               var37.o = new byte[var150];
               var37.p = new byte[var150];

               for (int var162 = 0; var162 < var150; var162++) {
                  var37.l[var162] = var5[var4++];
                  var37.m[var162] = var5[var4++];
                  var37.n[var162] = var5[var4++];
                  var37.o[var162] = var5[var4++];
                  var37.p[var162] = var5[var4++];
               }
            }

            var2 = var4;
            var5 = var1;
            var4 = var2;
            e var39 = this;
            if ((var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               var39.j = new byte[var150];
               var39.p = new short[var150];

               for (int var170 = 0; var170 < var150; var170++) {
                  var39.j[var170] = var5[var4++];
                  var39.p[var170] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
               }
            }

            var2 = var4;
            if (this.y <= 0) {
               if (l) {
                  System.gc();
               }
            } else {
               if ((this.A & 16777216) != 0) {
                  int var163 = 1;
                  var5 = var1;
                  var4 = var2;
                  e var41 = this;
                  if ((this.A & 16777216) != 0 && var4 < var5.length) {
                     short var171 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     byte var175 = 1;
                     if ((var41.A & 1073741824) != 0) {
                        var175 = (byte)var5[var4++];
                     }

                     if (var41.j == null) {
                        var41.j = new int[var175];
                     }

                     for (int var181 = 0; var181 < var175; var181++) {
                        int var178 = var5[var4++] & 255;
                        var41.b = var178;
                        int var187;
                        if ((var187 = var5[var4++] & 255) == 0) {
                           var187 = 256;
                        }

                        var41.j[var181] = var187;
                        var163 = var175;
                        e var155 = var41;
                        if (var41.a == null) {
                           var155.a = new int[var163][26][];
                        }

                        Object var156 = null;

                        for (int var195 = 0; var195 < var41.b; var195++) {
                           var41.a[var181][var195] = new int[var187];
                           var156 = var41.a[var181][var195];
                           if (var171 == -30584) {
                              for (int var201 = 0; var201 < var187; var201++) {
                                 int var209;
                                 if ((
                                       (
                                             var209 = (var5[var4++] & 255)
                                                + ((var5[var4++] & 255) << 8)
                                                + ((var5[var4++] & 255) << 16)
                                                + ((var5[var4++] & 255) << 24)
                                          )
                                          & 0xFF000000
                                    )
                                    != -16777216) {
                                    var41.j = true;
                                    if ((var209 & 0xFF000000) != 0) {
                                       var41.k = true;
                                    }
                                 }

                                 ((Object[])var156)[var201] = var209;
                              }
                           } else if (var171 == 17476) {
                              for (int var200 = 0; var200 < var187; var200++) {
                                 short var208;
                                 if (((var208 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) & '\uf000') != 61440) {
                                    var41.j = true;
                                    if ((var208 & '\uf000') != 0) {
                                       var41.k = true;
                                    }
                                 }

                                 ((Object[])var156)[var200] = (var208 & '\uf000') << 16
                                    | (var208 & '\uf000') << 12
                                    | (var208 & 3840) << 12
                                    | (var208 & 3840) << 8
                                    | (var208 & 240) << 8
                                    | (var208 & 240) << 4
                                    | (var208 & 15) << 4
                                    | var208 & 15;
                              }
                           } else if (var171 == 21781) {
                              for (int var199 = 0; var199 < var187; var199++) {
                                 short var207 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                                 int var213 = -16777216;
                                 if ((var207 & '耀') != 32768) {
                                    var213 = 0;
                                    var41.j = true;
                                 }

                                 if ((var163 = var213 | (var207 & 31744) << 9 | (var207 & 992) << 6 | (var207 & 31) << 3) == 16253176) {
                                    var163 = 16711935;
                                 }

                                 ((Object[])var156)[var199] = var163;
                              }
                           } else if (var171 == 25861) {
                              for (int var198 = 0; var198 < var187; var198++) {
                                 short var206 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                                 int var212 = -16777216;
                                 if ((var206 & '\uffff') == 63519) {
                                    var212 = 0;
                                    var41.j = true;
                                 }

                                 if ((var163 = var212 | (var206 & '\uf800') << 8 | (var206 & 2016) << 5 | (var206 & 31) << 3) == 16253176) {
                                    var163 = 16711935;
                                 }

                                 ((Object[])var156)[var198] = var163;
                              }
                           }
                        }
                     }

                     var41.b = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     if (var41.b == -23978) {
                        var41.j = true;
                        var41.k = true;
                     }

                     if (var41.b == 25840 || var41.b == -22976) {
                        if (var41.k == null) {
                           var41.k = new int[var175];
                           var41.l = new int[var175];
                        }

                        for (int var182 = 0; var182 < var175; var182++) {
                           var163 = var182;
                           int var188 = var41.j[var163] - 1;
                           var41.k[var182] = 1;

                           for (var41.l[var182] = 0; var188 != 0; var41.l[var182]++) {
                              var188 >>= 1;
                              var41.k[var182] = var41.k[var182] << 1;
                           }

                           var41.k[var182]--;
                        }
                     }

                     if (var41.y > 0) {
                        var41.i = new int[var41.y];
                        int var183 = 0;
                        int var189 = var4;

                        for (int var193 = 0; var193 < var41.y; var193++) {
                           if ((var41.A & 128) != 0) {
                              var150 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                           } else {
                              var150 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                           }

                           var41.i[var193] = var183;
                           var183 += var150;
                           var4 += var150;
                        }

                        var4 = var189;
                        var41.q = new byte[var183];

                        for (int var184 = 0; var184 < var41.y; var184++) {
                           if ((var41.A & 128) != 0) {
                              var189 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                           } else {
                              var189 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                           }

                           System.arraycopy(var5, var4, var41.q, var41.i(var184), var189);
                           var4 += var189;
                        }
                     }
                  }

                  var2 = var4;
               }

               if ((this.A & 536870912) != 0) {
                  var5 = var1;
                  var4 = var2;
                  e var42 = this;
                  if ((this.A & 536870912) != 0) {
                     if ((var42.A & 1073741824) != 0) {
                        var42.a = var5[var4++];
                        var42.b = new byte[var42.a][];
                     } else {
                        var42.a = 1;
                     }

                     var42.j = new int[var42.a];
                     var42.a = new byte[var42.a][];

                     for (int var168 = 0; var168 < var42.a; var168++) {
                        if ((var42.A & 1073741824) != 0) {
                           var4++;
                           var4++;
                           var4++;
                           var4++;
                        }

                        int var172;
                        if ((var42.A & 128) != 0) {
                           var172 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                        } else {
                           var172 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                        }

                        if ((var42.A & 1073741824) != 0) {
                           var42.a[var168] = new byte[var172];
                           System.arraycopy(var5, var4, var42.a[var168], 0, var172);
                           var4 += var172;
                        } else {
                           var42.q = new byte[var172];
                           System.arraycopy(var5, var4, var42.q, 0, var172);
                           var4 += var172;
                        }

                        var42.b = var5[var4++] & 255;
                        int var194;
                        if ((var42.A & 1073741824) != 0) {
                           if ((var194 = var5[var4++] & 255) == 0) {
                              var194 = 256;
                           }

                           int var180 = var194 * 3 + 4;
                           int var186 = var194 + 4;
                           int var192 = var180 + var186;
                           var42.b[var168] = new byte[var42.b * var192];
                           System.arraycopy(var42.a[var168], 41, var42.b[var168], 0, var180);
                           System.arraycopy(var42.a[var168], var180 + 41 + 8, var42.b[var168], var180, var186);
                           System.arraycopy(var5, var4, var42.b[var168], var192, (var42.b - 1) * var192);
                           var4 += (var42.b - 1) * var192;
                        } else {
                           if ((var194 = var5[var4++] & 255) == 0) {
                              var194 = 256;
                           }

                           int var179 = var194 * 3 + 4;
                           int var185 = var194 + 4;
                           int var191 = var179 + var185;
                           var42.r = new byte[var42.b * var191];
                           System.arraycopy(var42.q, 41, var42.r, 0, var179);
                           System.arraycopy(var42.q, var179 + 41 + 8, var42.r, var179, var185);
                           System.arraycopy(var5, var4, var42.r, var191, (var42.b - 1) * var191);
                           var4 += (var42.b - 1) * var191;
                           var150 = var179;

                           for (int var196 = 0; var196 < var42.b; var196++) {
                              for (int var202 = 0; var202 < var194; var202++) {
                                 int var210;
                                 if ((var210 = var42.r[var150] & 255) != 255) {
                                    var42.j = true;
                                    if (var210 != 0) {
                                       var42.k = true;
                                    }
                                 }

                                 var150++;
                              }

                              var150 += var179 + 4;
                           }
                        }

                        var42.j[var168] = var194;
                     }
                  }
               }

               this.c = new short[16][];
               this.z = -1;
               if ((this.A & 4096) != 0) {
                  int var23;
                  if ((var23 = this.g()) > 0) {
                     var2 = 0;
                     if ((this.A & 1024) == 0 && (this.C & 4) == 0) {
                        this.c = new byte[var23 << 2];

                        for (int var51 = 0; var51 < var23; var51++) {
                           this.a(b, var51, 0, 0, 0);
                           this.c[var2++] = (byte)b[0];
                           this.c[var2++] = (byte)b[1];
                           this.c[var2++] = (byte)(b[2] - b[0]);
                           this.c[var2++] = (byte)(b[3] - b[1]);
                        }
                     } else {
                        this.j = new short[var23 << 2];

                        for (int var50 = 0; var50 < var23; var50++) {
                           this.a(b, var50, 0, 0, 0);
                           this.j[var2++] = (short)b[0];
                           this.j[var2++] = (short)b[1];
                           this.j[var2++] = (short)(b[2] - b[0]);
                           this.j[var2++] = (short)(b[3] - b[1]);
                        }
                     }
                  }
               } else if ((this.C & 4) != 0) {
                  boolean var142 = false;
                  this.C &= -5;
               }

               if (l) {
                  System.gc();
               }
            }
         } catch (Exception var18) {
         }
      }
   }

   private void g(int var1) {
      if (this.s == null) {
         this.s = new byte[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.s[var2] = 0;
         }
      }

      if (this.v == null) {
         this.v = new int[var1];
      }
   }

   final void b() {
      boolean var1 = true;
      this = this;
      if ((this.A & 536870912) != 0) {
         this.r = null;
      }

      this.r = null;
      this.a = null;
      this.a = null;
      this.q = null;
      this.i = null;
      if (l) {
         System.gc();
      }
   }

   final int a(int var1, int var2) {
      return this.m[this.p[var1] + var2] & 0xFF;
   }

   final int b(int var1, int var2) {
      return this.p[this.p[var1] + var2] & 15;
   }

   final int a(int var1) {
      return this.j[var1] & 0xFF;
   }

   private int d(int var1) {
      return (this.A & 2048) != 0 ? this.h[var1] : this.b[var1] & 0xFF;
   }

   private int e(int var1) {
      return this.s != null ? this.s[var1] : 0;
   }

   private int f(int var1) {
      return this.d[var1] & 65535;
   }

   private int g(int var1) {
      return this.e[var1] & 65535;
   }

   final int b(int var1) {
      return (this.A & 1024) == 0 && (this.C & 4) == 0 ? this.c[(var1 << 2) + 2] & 0xFF : this.j[(var1 << 2) + 2] & 65535;
   }

   final int c(int var1) {
      return (this.A & 1024) == 0 && (this.C & 4) == 0 ? this.c[(var1 << 2) + 3] & 0xFF : this.j[(var1 << 2) + 3] & 65535;
   }

   private int d(int var1, int var2) {
      var1 = this.i[var1] + var2;
      return this.g[var1] & 0xFF;
   }

   private int e(int var1, int var2) {
      return this.h[this.i[var1] + var2] & 0xFF;
   }

   private int f(int var1, int var2) {
      var1 = this.i[var1] + var2;
      return this.n[var1];
   }

   private int g(int var1, int var2) {
      var1 = this.i[var1] + var2;
      return this.o[var1];
   }

   final int c(int var1, int var2) {
      var1 = this.p[var1] + var2;
      return this.l[var1] & 0xFF;
   }

   final void a(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      E = Integer.MAX_VALUE;
      F = Integer.MAX_VALUE;
      G = Integer.MIN_VALUE;
      H = Integer.MIN_VALUE;
      x = 1;
      this.a((Graphics)null, var2, var3, var4, var5, var6);
      x = 0;
      var1[0] = E;
      var1[1] = F;
      var1[2] = G;
      var1[3] = H;
   }

   final void a(int[] var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      byte var18 = 0;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      boolean var7 = true;
      boolean var8 = false;
      var18 = var18;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      this = this;
      E = Integer.MAX_VALUE;
      F = Integer.MAX_VALUE;
      G = Integer.MIN_VALUE;
      H = Integer.MIN_VALUE;
      x = 1;
      this.a(null, var2, var3, var4, var18);
      x = 0;
      var1[0] = E;
      var1[1] = F;
      var1[2] = G;
      var1[3] = H;
   }

   private int h(int var1) {
      return this.t == null ? 0 : this.t[var1];
   }

   private Object a(int var1, int var2) {
      if (var2 >= 0 && var2 < this.b) {
         if ((this.A & 536870912) != 0) {
            var1 = var2;
            this = this;
            if (this.r == null) {
               return null;
            }

            int var3 = 0;
            var3 = (var2 = this.j[var3]) * 3 + 4;
            int var4 = var2 + 4;
            var3 += var4;
            var1 *= var3;
            int[] var12 = new int[var2];

            for (int var13 = 0; var13 < var2; var13++) {
               var12[var13] = (this.r[var1] & 255) << 16 | (this.r[var1 + 1] & 255) << 8 | this.r[var1 + 2] & 255;
               var1 += 3;
            }

            var1 += 4;

            for (int var14 = 0; var14 < var2; var14++) {
               var12[var14] |= (this.r[var1++] & 255) << 24;
            }

            return var12;
         }

         if (this.a != null && var2 < this.a[var1].length) {
            return this.a[var1][var2];
         }
      }

      return null;
   }

   private int g() {
      if ((this.A & 2048) != 0) {
         return this.h == null ? 0 : this.h.length;
      } else {
         return this.b == null ? 0 : this.b.length;
      }
   }

   private boolean a(int var1) {
      return this.i == null ? false : this.q != null;
   }

   private int i(int var1) {
      return this.i != null ? this.i[var1] : -1;
   }

   private int h(int var1, int var2) {
      int var3 = this.d(var1);
      int var4 = 0;

      for (int var7 = 0; var7 < var3; var7++) {
         int var5 = this.d(var1, var7);
         if ((this.e(var1, var7) & 16) == 0 && this.e(var5) == 5 && (var2 == -1 || var2 == var5)) {
            var4++;
         }
      }

      return var4;
   }

   final int[] a(int var1) {
      return this.a(var1, null, 0, -1);
   }

   final int[] a(int var1, int[] var2, int var3, int var4) {
      int var5;
      if ((var5 = this.h(var1, var4)) > 0) {
         int var6 = 0;
         var2 = var2;
         int var7;
         var7 = (var7 = var5 << 1 + (var3 & 1)) + (var3 > 1 ? 1 : 0);
         if (var2 == null || var2.length < var7) {
            var2 = new int[var7];
         }

         var7 = this.d(var1);
         if (var3 > 1) {
            var3 -= 2;
            var2[0] = var5;
            var6++;
         }

         for (int var9 = 0; var9 < var7; var9++) {
            var5 = this.d(var1, var9);
            if ((this.e(var1, var9) & 16) == 0 && this.e(var5) == 5 && (var4 == -1 || var4 == var5)) {
               var2[var6] = this.f(var1, var9);
               var2[var6 + 1] = this.g(var1, var9);
               if (var3 == 0) {
                  var6 += 2;
               } else {
                  var2[var6 + 2] = var5;
                  var2[var6 + 3] = var9;
                  var6 += 4;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   final int[] a(int var1, int var2, int[] var3, int var4, int var5) {
      int var13 = this.c(var1, var2);
      int[] var15;
      if ((var15 = this.a(var13, null, 0, -1)) != null) {
         int var14 = this.h(var13, -1);
         var5 = this.b(var1, var2);
         int var9 = var2;
         int var8 = var1;
         e var7 = this;
         var8 = this.p[var8] + var9;
         var8 = var8;
         byte var6 = var7.n[var8];
         var9 = var2;
         var8 = var1;
         var7 = this;
         var8 = this.p[var8] + var9;
         var8 = var8;
         byte var10 = var7.o[var8];
         byte var11 = 0;

         for (int var12 = 0; var12 < var14; var12++) {
            var15[var11] += var6;
            var15[var11 + 1] = var15[var11 + 1] + var10;
            if ((var5 & 1) != 0) {
               var15[var11] = -var15[var11];
               var15[var11] += var6 << 1;
            }

            if ((var5 & 2) != 0) {
               var15[var11 + 1] = -var15[var11 + 1];
               var15[var11 + 1] = var15[var11 + 1] + (var10 << 1);
            }

            var11 += 2;
         }
      }

      return var15;
   }

   static int[] a(int[] var0) {
      if (var0 != null && var0 == a) {
         if (var0 != null && var0 == h) {
            return null;
         }

         if (h == null) {
            h = new int[100000];
         }

         return h;
      } else {
         if (a == null) {
            a = new int[100000];
         }

         return a;
      }
   }

   private void a(int var1, int var2, int[] var3) {
      if ((this.A & 536870912) == 0) {
         this.a[var1][var2] = var3;
      } else {
         int[] var12 = var3;
         var1 = var2;
         e var10 = this;
         int var4 = 0;
         int var21;
         var4 = (var21 = this.j[var4]) * 3 + 4;
         int var5 = var21 + 4;
         int var6 = var4 + var5;
         int var7;
         int var8 = (var7 = var1 * var6) + var4;

         for (int var9 = 0; var9 < var21; var9++) {
            var10.r[var8++] = (byte)(var12[var9] >>> 24);
            var10.r[var7++] = (byte)(var12[var9] >> 16);
            var10.r[var7++] = (byte)(var12[var9] >> 8);
            var10.r[var7++] = (byte)var12[var9];
         }

         int var25 = a((byte[])null, 0, 4, 0);
         var25 = a(var10.r, var1 * var6, var4 - 4, var25);
         var2 = var1 * var6 + var4 - 4;
         var10.r[var2++] = (byte)(var25 >>> 24);
         var10.r[var2++] = (byte)(var25 >> 16);
         var10.r[var2++] = (byte)(var25 >> 8);
         var10.r[var2] = (byte)var25;
         var25 = a((byte[])null, 0, 4, 0);
         var25 = a(var10.r, var1 * var6 + var4, var5 - 4, var25);
         var2 = (var1 + 1) * var6 - 4;
         var10.r[var2++] = (byte)(var25 >>> 24);
         var10.r[var2++] = (byte)(var25 >> 16);
         var10.r[var2++] = (byte)(var25 >> 8);
         var10.r[var2] = (byte)var25;
      }
   }

   private static boolean a(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = j.a(var0);
      int var6 = j.b(var0);
      int var7 = j.c(var0);
      int var10 = j.d(var0);
      if (j.b(13)) {
         int var8 = j.o();
         int var9 = j.p();
         var3 = var3 * var8 / 100;
         var4 = var4 * var9 / 100;
      } else if (j.b(15)) {
         return true;
      }

      return var1 + var3 >= var5 && var2 + var4 >= var6 && var1 < var5 + var7 && var2 < var6 + var10;
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5, var6, 0, 0);
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      var2 = this.p[var2] + var3;
      var3 = this.l[var2] & 255;
      int var9 = var2;
      var7 = this.n[var9];
      var9 = var2;
      var8 = this.o[var9];
      var9 = this.p[var2] & 15;
      if ((var6 & 1) != 0) {
         var9 = s[var9 & 7] | var9 & -8;
         var7 = -var7;
      }

      if ((var6 & 2) != 0) {
         var9 = t[var9 & 7] | var9 & -8;
         var8 = -var8;
      }

      if ((var6 & 4) != 0) {
         var9 = u[var9 & 7] | var9 & -8;
         var2 = var7;
         var7 = -var8;
         var8 = var2;
      }

      if (j.b(13)) {
         var2 = j.o();
         var6 = j.p();
         var7 = var2 * var7 / 100;
         var8 = var6 * var8 / 100;
      }

      this.a(var1, var3, var4 + var7, var5 + var8, var9, 0, 0);
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 0, 0);
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.b(var1, var2, var3, var4, var5, var6, var7);
   }

   final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = 0;
      if ((var8 = this.d(var2)) > 0) {
         for (int var9 = 0; var9 < var8; var9++) {
            int var18 = var7;
            int var17 = var6;
            int var16 = var5;
            int var15 = var4;
            int var14 = var3;
            int var13 = var9;
            int var12 = var2;
            Graphics var11 = var1;
            e var10 = this;
            var12 = this.i[var12] + var13;
            var13 = var10.h[var12] & 255;
            int var19 = var10.g[var12] & 255;
            if ((var10.A & 16384) != 0 && (var10.C & 16) == 0) {
               var10.B = var10.i[var12] & 255;
            }

            int var20 = var19;
            if ((var13 & 16) == 0 && var10.z >= 0) {
               var19 = var10.c[var10.z][var19];
            }

            int var23 = 0;
            int var24 = 0;
            if ((var13 & 16) == 0) {
               var23 = var10.f(var19);
               var24 = var10.g(var19);
            }

            int var25 = var23;
            int var26 = var24;
            int var66 = var12;
            int var21 = var10.n[var66];
            var66 = var12;
            int var22 = var10.o[var66];
            if ((var13 & 4) != 0) {
               var12 = var23;
               var23 = var24;
               var24 = var12;
            }

            if ((var16 & 1) != 0) {
               var13 = s[var13 & 7] | var13 & -8;
               var21 = -var21 - var23;
            }

            if ((var16 & 2) != 0) {
               var13 = t[var13 & 7] | var13 & -8;
               var22 = -var22 - var24;
            }

            if ((var16 & 4) != 0) {
               var13 = u[var13 & 7] | var13 & -8;
               var12 = var21;
               var21 = -var22 - var24;
               var22 = var12;
            }

            if (j.b(13) && x != 1) {
               var12 = j.o();
               var16 = j.p();
               var21 = var12 * var21 / 100;
               var22 = var16 * var22 / 100;
            }

            var14 += var21;
            var15 += var22;
            if ((var13 & 16) != 0) {
               var10.a(var11, var19, var14, var15, var13 & 15, var17, var18);
            } else {
               int var10005 = var13 & 15;
               var17 = var26;
               var16 = var25;
               int var92 = var10005;
               int var89 = var15;
               var13 = var14;
               var12 = var20;
               var11 = var11;
               var10 = var10;
               b[0] = var16;
               b[1] = var17;
               int[] var96 = b;
               var15 = var92;
               var14 = var89;
               var13 = var13;
               var12 = var12;
               var11 = var11;
               var10 = var10;
               var17 = var13;
               var18 = var14;
               if (var10.z >= 0) {
                  var12 = var10.c[var10.z][var12];
               }

               var19 = var96[0];
               var16 = var96[1];
               var20 = var19;
               var21 = var16;
               var22 = var20;
               var23 = var21;
               if ((var15 & 4) != 0) {
                  var24 = var20;
                  var20 = var21;
                  var21 = var24;
               }

               if (var10.e(var12) != 0 && var11 != null) {
                  var11.setColor(var10.v[var12]);
                  if (j.b(13)) {
                     var24 = j.o();
                     var25 = j.p();
                     var20 = var20 * var24 / 100;
                     var21 = var21 * var25 / 100;
                  }

                  switch (var10.s[var12]) {
                     case 1:
                        j.d(var11, var13, var14, --var20, --var21);
                        break;
                     case 2:
                        if ((var10.v[var12] & 0xFF000000) != -16777216 && (var10.v[var12] & 0xFF000000) != 0) {
                           j.g(var10.v[var12]);
                           j.e(var11, var13, var14, var20, var21);
                           break;
                        }

                        j.c(var11, var13, var14, var20, var21);
                        break;
                     case 3:
                     case 4:
                        if ((var24 = var10.j(var12)) != -1) {
                           var25 = var10.f[var24];
                           var16 = var10.f[var24 + 1];
                           if ((var15 & 1) != 0) {
                              var25 = 90 - var25;
                           }

                           if ((var15 & 2) != 0) {
                              var25 = -var25;
                              var16 = -var16;
                           }

                           if ((var15 & 4) != 0) {
                              var25 -= 90;
                           }

                           if (var10.s[var12] == 3) {
                              j.b(var11, var13, var14, var20, var21, var25, var16);
                           } else {
                              j.a(var11, var13, var14, var20, var21, var25, var16);
                           }
                        }
                     case 5:
                     default:
                        break;
                     case 6:
                     case 7:
                        if ((var24 = var10.j(var12)) != -1) {
                           var25 = var10.f[var24];
                           var16 = var10.f[var24 + 1];
                           var26 = var10.f[var24 + 2];
                           int var157 = var10.f[var24 + 3];
                           if ((var15 & 1) != 0) {
                              var25 = -var25;
                              var26 = -var26;
                              var13 += j.e(var25) > j.e(var26) ? j.e(var25) : j.e(var26);
                           }

                           if ((var15 & 2) != 0) {
                              var16 = -var16;
                              var157 = -var157;
                              var14 += j.e(var16) > j.e(var157) ? j.e(var16) : j.e(var157);
                           }

                           if ((var15 & 4) != 0) {
                              int var161 = j.e(var16) > j.e(var157) ? j.e(var16) : j.e(var157);
                              int var164 = var14 - var18;
                              var14 = var18 + (var13 - var17);
                              var13 = var17 - var164 + var161;
                              int var64 = var25;
                              var25 = -var16;
                              var16 = var64;
                              var64 = var26;
                              var26 = -var157;
                              var157 = var64;
                           }

                           if (var10.s[var12] == 6) {
                              j.b(var11, var13, var14, var13 + var25, var14 + var16);
                              j.b(var11, var13 + var25, var14 + var16, var13 + var26, var14 + var157);
                              j.b(var11, var13, var14, var13 + var26, var14 + var157);
                           } else {
                              j.c(var11, var13, var14, var13 + var25, var14 + var16, var13 + var26, var14 + var157);
                           }
                        }
                        break;
                     case 8:
                        var24 = var13;
                        var25 = var13 + var20;
                        var16 = var14;
                        var26 = var14 + var21;
                        if ((var15 & 1) != 0) {
                           var24 = var25;
                           var25 = var17;
                        }

                        if ((var15 & 2) != 0) {
                           var16 = var26;
                           var26 = var18;
                        }

                        if ((var15 & 4) != 0) {
                           int var156 = var24;
                           var24 = var25;
                           var25 = var156;
                        }

                        j.b(var11, var24, var16, var25, var26);
                        break;
                     case 9:
                        if ((var24 = var10.j(var12)) != -1) {
                           var25 = var10.v[var12];
                           var16 = var10.f[var24] & '\uffff' | var10.f[var24 + 1] << 16 & -65536;
                           short var149 = var10.f[var24 + 2];
                           var18 = var20;
                           int var160 = var21;
                           if ((var15 & 1) != 0 && var149 < 2) {
                              int var162 = var25;
                              var25 = var16;
                              var16 = var162;
                           }

                           if ((var15 & 2) != 0 && var149 > 1) {
                              int var163 = var25;
                              var25 = var16;
                              var16 = var163;
                           }

                           byte var150;
                           if (var149 == 0) {
                              var150 = 4;
                           } else if (var149 == 1) {
                              var150 = 8;
                           } else if (var149 == 2) {
                              var150 = 16;
                           } else {
                              var150 = 32;
                           }

                           if ((var15 & 4) != 0) {
                              if (var150 == 4) {
                                 var150 = 16;
                              } else if (var150 == 8) {
                                 var150 = 32;
                              } else if (var150 == 16) {
                                 var150 = 8;
                              } else if (var150 == 32) {
                                 var150 = 4;
                              }
                           }

                           j.a(var11, var13, var14, var18, var160, var25, var16, var150);
                        }
                  }
               } else if (x == 1) {
                  if ((var15 & 4) != 0) {
                     var24 = var20;
                     var20 = var21;
                     var21 = var24;
                  }

                  if (var10.e(var12) == 5) {
                     var13 -= var20 >> 1;
                     var14 -= var21 >> 1;
                  }

                  if (var13 < E) {
                     E = var13;
                  }

                  if (var14 < F) {
                     F = var14;
                  }

                  if (var13 + var20 > G) {
                     G = var13 + var20;
                  }

                  if (var14 + var21 > H) {
                     H = var14 + var21;
                  }
               } else if (var20 > 0 && var21 > 0 && (!j.a(var11) || a(var11, var13, var14, var20, var21))) {
                  int[] var128 = null;
                  Image var136 = null;
                  if ((var10.A & 536870912) != 0) {
                     if ((var15 & 4) != 0) {
                        var26 = var20;
                        var20 = var21;
                        var21 = var26;
                     }

                     if ((var10.A & 536870912) != 0) {
                        if ((var10.C & 1) != 0) {
                           if (var10.b == null || var10.b[var10.B] == null) {
                              var10.a(var10.B, 0, 0, 0);
                           }

                           int[] var10001 = var10.b[var10.B][0];
                           boolean var73 = false;
                           boolean var72 = false;
                           boolean var71 = false;
                           int[] var167 = var10001;
                           if (var167 != null) {
                              j.a(var11, var10.b[var10.B][0], 0, var20, var13, var14, var20, var21, var10.j, var10.k, 0);
                           }
                        } else {
                           if (var10.a == null || var10.a[var10.B] == null) {
                              var10.a(var10.B, 0, 0, 0);
                           }

                           short var144 = 0;
                           short var27 = 0;
                           if ((var10.A & 32) != 0) {
                              var144 = var10.b[var12];
                              var27 = var10.c[var12];
                           }

                           var17 = var10.h(var12);
                           var18 = var10.B;
                           var136 = var10.a[var18][var17];
                           if (j.i && j.n() != 0) {
                              boolean var110 = var10.j;
                              int[] var28 = a((int[])null);
                              j.a(var136, var28, 0, var20, var144, var27, var20, var21);
                              int[] var105;
                              if ((var105 = j.a(var11, var28, var13, var14, var22, var23, var15, var110, var10.k)) == null) {
                                 continue;
                              }

                              var20 = j.bE;
                              var21 = j.bF;
                              var15 = 0;
                              var22 = var20;
                              var23 = var21;
                              Image var29 = j.a(var105, var20, var21, var110);
                              var11.drawImage(var29, var13, var14, 0);
                           } else {
                              int var10006 = r[var15 & 7];
                              Image var168 = var136;
                              if (var168 != null) {
                                 var11.drawRegion(var136, var144, var27, var20, var21, r[var15 & 7], var13, var14, 0);
                              }
                           }
                        }
                     }
                  }

                  if ((var10.A & 16777224) != 0) {
                     if (var10.a != null && var10.a[var10.B] != null) {
                        var136 = var10.a[var10.B][var12];
                     }

                     if (var10.b != null && var10.b[var10.B] != null) {
                        var128 = var10.b[var10.B][var12];
                     }

                     boolean var145 = var10.j;
                     if ((var10.C & 1) != 0) {
                        if (var128 == null) {
                           var128 = var10.b(var12);
                        }

                        if (j.i && j.n() != 0) {
                           int[] var129;
                           if ((var129 = j.a(var11, var128, var13, var14, var22, var23, var15, var145, var10.k)) != null) {
                              var145 = j.j;
                              var20 = j.bE;
                              var21 = j.bF;
                              Image var107 = j.a(var129, var20, var21, var145);
                              var11.drawImage(var107, var13, var14, 0);
                           }
                        } else {
                           boolean var177 = false;
                           boolean var174 = false;
                           int[] var171 = var128;
                           if (var171 != null) {
                              j.a(var11, var128, 0, var22, var13, var14, var22, var23, var145, var145, var15, var10.I, true);
                           }
                        }
                     } else if (var136 == null) {
                        int[] var154 = var128;
                        if (var128 == null) {
                           var154 = var10.b(var12);
                        }

                        if (var154 != null) {
                           if (j.i && j.n() != 0) {
                              if ((var154 = j.a(var11, var154, var13, var14, var22, var23, var15, var145, var10.k)) != null) {
                                 var145 = j.j;
                                 var20 = j.bE;
                                 var21 = j.bF;
                                 Image var159 = j.a(var154, var20, var21, var145);
                                 var11.drawImage(var159, var13, var14, 0);
                              }
                           } else if (var10.g < 0) {
                              j.a(var11, var154, 0, var22, var13, var14, var22, var23, var145, var145, var15);
                           } else {
                              if (var10.a == null) {
                                 var10.a = new Image[var10.b][];

                                 for (int var158 = 0; var158 < var10.b; var158++) {
                                    var10.a[var158] = new Image[var10.y];
                                 }
                              }

                              Image var137;
                              if ((var15 & 4) != 0) {
                                 var137 = j.a(var154, var21, var20, var10.j);
                              } else {
                                 var137 = j.a(var154, var20, var21, var10.j);
                              }

                              var10.a(var12, var137);
                              int var179 = r[var15 & 7];
                              boolean var176 = false;
                              boolean var173 = false;
                              Image var170 = var137;
                              if (var170 != null) {
                                 if (r[var15 & 7] == 0) {
                                    var11.drawImage(var137, var13, var14, 0);
                                 } else if ((var15 & 4) != 0) {
                                    var11.drawRegion(var137, 0, 0, var21, var20, r[var15 & 7], var13, var14, 0);
                                 } else {
                                    var11.drawRegion(var137, 0, 0, var20, var21, r[var15 & 7], var13, var14, 0);
                                 }
                              }
                           }
                        }
                     } else if (j.i && j.n() != 0) {
                        int[] var153;
                        if ((var153 = j.a(var11, var136, var13, var14, var22, var23, var15, var145, var10.k)) != null) {
                           var145 = j.j;
                           var20 = j.bE;
                           var21 = j.bF;
                           Image var106 = j.a(var153, var20, var21, var145);
                           var11.drawImage(var106, var13, var14, 0);
                        }
                     } else {
                        var20 = var19;
                        var21 = var16;
                        var10.a(var12, var136);
                        int var178 = r[var15 & 7];
                        boolean var175 = false;
                        boolean var172 = false;
                        Image var169 = var136;
                        if (var169 != null) {
                           if (r[var15 & 7] == 0) {
                              var11.drawImage(var136, var13, var14, 0);
                           } else {
                              var11.drawRegion(var136, 0, 0, var20, var21, r[var15 & 7], var13, var14, 0);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      this.h(var1);
      if (this.y != 0) {
         if (var3 == -1) {
            var3 = this.y - 1;
         }

         if ((this.A & 16777224) != 0) {
            if (var4 >= 0) {
               for (int var15 = 0; var15 <= var3; var15++) {
                  if ((this.C & 1) != 0) {
                     this.b[var1][var15] = this.b[var4][var15];
                  } else {
                     this.a[var1][var15] = this.a[var4][var15];
                  }
               }
            } else {
               var2 = this.B;
               this.B = var1;
               if (l) {
                  System.gc();
               }

               for (int var21 = 0; var21 <= var3; var21++) {
                  if (this.e(var21) == 0) {
                     int var5 = this.f(var21);
                     int var6 = this.g(var21);
                     int[] var7;
                     if (var5 > 0 && var6 > 0 && (var7 = this.b(var21)) != null) {
                        if (j.i && j.n() != 0) {
                           boolean var8 = this.j;
                           var7 = j.a(null, var7, 0, 0, var5, var6, 0, var8, this.k, false);
                           var5 = j.bG;
                           var6 = j.bH;
                        }

                        int var10 = var21;
                        int var9 = var1;
                        int var33 = var6;
                        int var32 = var5;
                        int[] var26 = var7;
                        e var24 = this;
                        int var11 = var32 * var33;
                        if ((var24.C & 1) != 0) {
                           if (var24.b[var9][var10] == null || var24.b[var9][var10].length != var11) {
                              var24.b[var9][var10] = new int[var11];
                           }

                           System.arraycopy(var26, 0, var24.b[var9][var10], 0, var11);
                        } else {
                           boolean var12 = false;

                           for (int var13 = 0; var13 < var11; var13++) {
                              if ((var26[var13] & 0xFF000000) != -16777216) {
                                 var12 = true;
                                 break;
                              }
                           }

                           var24.a[var9][var10] = j.a(var26, var32, var33, var12);
                        }
                     }
                  }
               }

               if (l) {
                  System.gc();
               }

               this.B = var2;
            }
         }

         if ((this.A & 536870912) != 0) {
            try {
               if ((this.C & 1) != 0) {
                  if (this.b[var1] == null) {
                     this.b[var1] = new int[1][];
                  }
               } else if (this.a[var1] == null) {
                  if ((this.A & 1073741824) != 0) {
                     this.a[var1] = new Image[this.a];
                  } else {
                     this.a[var1] = new Image[1];
                  }
               }

               int var27 = 0;
               byte[] var17 = this.q;
               if ((this.A & 1073741824) != 0) {
                  for (int var19 = 0; var19 < this.a; var19++) {
                     var27 = var19;
                     var4 = this.j[var27] * 3 + 4;
                     var27 = var19;
                     int var25 = this.j[var27] + 4;
                     System.arraycopy(this.b[var19], var1 * (var4 + var25), this.a[var19], 41, var4);
                     System.arraycopy(this.b[var19], var1 * (var4 + var25) + var4, this.a[var19], var4 + 41 + 8, var25);
                  }
               } else {
                  byte var28 = 0;
                  var3 = this.j[var28] * 3 + 4;
                  var28 = 0;
                  var4 = this.j[var28] + 4;
                  System.arraycopy(this.r, var1 * (var3 + var4), var17, 41, var3);
                  System.arraycopy(this.r, var1 * (var3 + var4) + var3, var17, var3 + 41 + 8, var4);
               }

               if ((this.C & 1) != 0) {
                  this.b[var1][0] = new int[var17.length];
                  System.arraycopy(var17, 0, this.b[var1][0], 0, var17.length);
               } else if ((this.A & 1073741824) != 0) {
                  for (int var20 = 0; var20 < this.a; var20++) {
                     this.a[var1][var20] = j.a(this.a[var20], 0, (int)this.a[var20].length);
                  }
               } else {
                  this.a[var1][0] = j.a(var17, 0, (int)var17.length);
               }
            } catch (Exception var14) {
            }
         }

         if (l) {
            System.gc();
         }
      }
   }

   private void h(int var1) {
      if ((this.C & 1) != 0) {
         if (this.b == null) {
            this.b = new int[this.b][][];
         }

         if (this.b[var1] == null) {
            this.b[var1] = new int[this.y][];
            return;
         }
      } else {
         if (this.a == null) {
            this.a = new Image[this.b][];
         }

         if (this.a[var1] == null) {
            this.a[var1] = new Image[this.y];
         }
      }
   }

   final void c() {
      if ((this.C & 1) != 0) {
         if (this.b != null) {
            for (int var1 = 0; var1 < this.b.length; var1++) {
               if (this.b[var1] != null) {
                  for (int var2 = 0; var2 < this.b[var1].length; var2++) {
                     this.b[var1][var2] = null;
                  }

                  this.b[var1] = null;
               }
            }

            this.b = null;
            return;
         }
      } else if (this.a != null) {
         for (int var3 = 0; var3 < this.a.length; var3++) {
            this.a[var3] = null;
         }

         this.a = null;
      }
   }

   private int j(int var1) {
      if (this.g != null) {
         for (byte var2 = 0; var2 < this.g.length; var2 += 2) {
            if (this.g[var2] == var1) {
               return this.g[var2 + 1];
            }
         }
      }

      return -1;
   }

   private static int a(byte[] var0, int var1, int var2, int var3) {
      var3 = ~var3;

      while (var2-- != 0) {
         var3 = c[(var3 ^ var0[var1++]) & 0xFF] ^ var3 >>> 8;
      }

      return ~var3;
   }

   static void a(int var0) {
      a = new short[var0][];
      a = new e[var0][];
      d = new int[var0];
      e = new int[var0];
   }

   static void a(int var0, int var1) {
      e[var0] = var1;
      a[var0] = new short[var1];
      a[var0] = new e[var1];

      for (int var2 = 0; var2 < a[var0].length; var2++) {
         a[var0][var2] = -1;
      }
   }

   static void b(int var0) {
      a[var0] = null;
      a[var0] = null;
      d[var0] = 0;
      e[var0] = 0;
   }

   final void c(int var1) {
      this.g = var1;
      if ((this.C & 1) != 0) {
         if (this.b == null) {
            this.b = new int[this.b][][];

            for (int var2 = 0; var2 < this.b; var2++) {
               this.b[var2] = new int[this.y][];
            }

            return;
         }
      } else if (this.a == null) {
         this.a = new Image[this.b][];

         for (int var3 = 0; var3 < this.b; var3++) {
            this.a[var3] = new Image[this.y];
         }
      }
   }

   private final void a(int var1, Object var2) {
      var2 = var2;
      boolean var7 = false;
      var1 = var1;
      this = this;
      if (this.g >= 0) {
         if ((this.C & 1) != 0) {
            if (this.b[this.B][var1] != null) {
               return;
            }
         } else if (this.a[this.B][var1] != null) {
            return;
         }

         int var3 = d[this.g];
         short var4;
         int var5 = (var4 = a[this.g][var3]) >> 10;
         int var6 = var4 & 1023;
         e var11;
         if (var4 >= 0 && (var11 = a[this.g][var3]) != null) {
            if ((this.C & 1) != 0) {
               var11.b[var5][var6] = null;
            } else {
               var11.a[var5][var6] = null;
            }
         }

         var4 = (short)((var1 & 1023) + (this.B << 10));
         a[this.g][var3] = var4;
         a[this.g][var3] = this;
         d[this.g] = (d[this.g] + 1) % e[this.g];
         if ((this.C & 1) != 0) {
            if (this.b[this.B][var1] == null || this.b[this.B][var1].length != 0) {
               this.b[this.B][var1] = new int[0];
            }

            System.arraycopy((int[])var2, 0, this.b[this.B][var1], 0, 0);
            return;
         }

         this.a[this.B][var1] = (Image)var2;
      }
   }

   final void d() {
   }

   private int[] b(int var1) {
      if (this.a(var1)) {
         int var2 = this.h(var1);
         if (this.a(var2, this.q, this.i(var1), this.f(var1), this.g(var1))) {
            return a;
         }
      }

      return null;
   }

   private boolean a(int var1, byte[] var2, int var3, int var4, int var5) {
      int var6 = 0;
      var4 *= var5;
      if (a == null) {
         a = new int[100000];
      }

      Object var21 = null;
      if ((var21 = (int[])this.a(var1, this.B)) == null) {
         return false;
      }

      int var7 = 0;
      if (this.b != 25840) {
         if (this.b == 10225) {
            while (var6 < var4) {
               int var50;
               if ((var50 = var2[var3++] & 255) > 127) {
                  int var10 = var2[var3++] & 255;
                  var7 = (int)((Object[])var21)[var10];
                  var50 -= 128;

                  while (var50-- > 0) {
                     a[var6++] = var7;
                  }
               } else {
                  a[var6++] = (int)((Object[])var21)[var50];
               }
            }
         } else if (this.b == 22258) {
            var3--;
            var6--;
            var4--;

            while (var6 < var4) {
               int var41;
               if ((var41 = var2[++var3]) < 0) {
                  var41 += 128;

                  while (true) {
                     a[++var6] = (int)((Object[])var21)[var2[++var3] & 0xFF];
                     if (--var41 <= 0) {
                        break;
                     }
                  }
               } else {
                  var7 = (int)((Object[])var21)[var2[++var3] & 0xFF];

                  while (true) {
                     a[++var6] = var7;
                     if (--var41 <= 0) {
                        break;
                     }
                  }
               }
            }
         } else if (this.b == 5632) {
            int var15;
            var4 = (var15 = var4 + ((var4 & 1) == 0 ? 0 : 2)) >> 1;

            while (--var4 >= 0) {
               byte var43 = var2[var3++];
               a[var6++] = (int)((Object[])var21)[var43 >> 4 & 15];
               a[var6++] = (int)((Object[])var21)[var43 & 15];
            }
         } else if (this.b == 1024) {
            int var17;
            var4 = (var17 = var4 + ((var4 & 3) == 0 ? 0 : 4)) >> 2;

            while (--var4 >= 0) {
               byte var44 = var2[var3++];
               a[var6++] = (int)((Object[])var21)[var44 >> 6 & 3];
               a[var6++] = (int)((Object[])var21)[var44 >> 4 & 3];
               a[var6++] = (int)((Object[])var21)[var44 >> 2 & 3];
               a[var6++] = (int)((Object[])var21)[var44 & 3];
            }
         } else if (this.b == 512) {
            int var19;
            var4 = (var19 = var4 + ((var4 & 7) == 0 ? 0 : 8)) >> 3;

            while (--var4 >= 0) {
               byte var45 = var2[var3++];
               a[var6++] = (int)((Object[])var21)[var45 >> 7 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 6 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 5 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 4 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 3 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 2 & 1];
               a[var6++] = (int)((Object[])var21)[var45 >> 1 & 1];
               a[var6++] = (int)((Object[])var21)[var45 & 1];
            }
         } else if (this.b == 22018) {
            while (--var4 >= 0) {
               a[var6++] = (int)((Object[])var21)[var2[var3++] & 0xFF];
            }
         } else if (this.b == -23978) {
            while (var6 < var4) {
               int var46;
               if ((var46 = var2[var3++] & 255) > 127) {
                  var46 -= 128;

                  while (var46-- > 0) {
                     a[var6++] = (int)((Object[])var21)[var2[var3++] & 0xFF];
                  }
               } else {
                  var7 = (int)((Object[])var21)[var2[var3++] & 0xFF];

                  while (var46-- > 0) {
                     a[var6++] = var7;
                  }
               }
            }

            var6 = 0;

            while (var6 < var4) {
               int var48;
               if ((var48 = var2[var3++] & 255) == 254) {
                  int var9 = var2[var3++] & 255;
                  var48 = var2[var3++] & 255;

                  while (var9-- > 0) {
                     a[var6] = var48 << 24 | a[var6] & 16777215;
                     var6++;
                  }
               } else {
                  a[var6] = var48 << 24 | a[var6] & 16777215;
                  var6++;
               }
            }
         }
      } else {
         while (var6 < var4) {
            int var8 = var2[var3++] & 255;
            var7 = (int)((Object[])var21)[var8 & this.k[var1]];
            var8 >>= this.l[var1];

            while (var8-- >= 0) {
               a[var6++] = var7;
            }
         }
      }

      return true;
   }

   static final int a() {
      return a;
   }

   final void a(short[] var1) {
      this.a = var1[0];
      this.b = new short[this.a][];
      int var2 = 1;

      for (int var3 = 0; var3 < this.a; var3++) {
         this.b[var3] = new short[2];
         this.b[var3][0] = var1[var2++];
         this.b[var3][1] = var1[var2++];
      }

      int var13 = var2;

      while (var13 < var1.length) {
         short var12 = var1[var13++];
         short var4;
         short[] var5;
         (var5 = new short[((var4 = var1[var13++]) << 1) + 2])[0] = this.b[var12][0];
         var5[1] = this.b[var12][1];

         for (int var6 = 0; var6 < var4; var6++) {
            var5[(var6 << 1) + 2] = var1[var13++];
            var5[(var6 << 1) + 3] = var1[var13++];
         }

         this.b[var12] = var5;
      }

      e var7;
      (var7 = this).q = -var7.g(0, 0);
      int var8 = var7.g(0, 1);
      var7.l = var7.q + var8;
      e var9 = var7;
      var7.m = var9.g(0, 2) - var9.g(0, 1);
      e var10 = var7;
      var7.o = var10.f(var10.k(32), 0);
   }

   private int k(int var1) {
      if (this.b == null) {
         return 0;
      }

      int var2 = var1 % this.a;
      if (this.b[var2][0] == var1) {
         return this.b[var2][1];
      }

      byte var3 = 2;
      int var4 = this.b[var2].length;

      while (var3 < var4 && this.b[var2][var3] != var1) {
         var3 += 2;
      }

      return var3 >= var4 ? 1 : this.b[var2][var3 + 1];
   }

   final int b() {
      return this.r >= 0 ? this.m * this.r >> 8 : this.m;
   }

   final int c() {
      return this.r >= 0 ? this.l * this.r >> 8 : this.l;
   }

   final int d() {
      return this.r >= 0 ? this.o * this.r >> 8 : this.o;
   }

   private int h() {
      return this.r >= 0 ? this.n * this.r >> 8 : this.n;
   }

   final void d(int var1) {
      this.n = 1;
   }

   final int e() {
      return this.r >= 0 ? this.l * this.r >> 8 : this.l;
   }

   private static final int a(short[] var0, int var1) {
      var1 = (var1 << 1) + 1;
      return var0[var1];
   }

   private static final int b(short[] var0, int var1) {
      var1 = (var1 << 1) + 2;
      return var0[var1];
   }

   final short[] a(String var1, int var2, int var3) {
      return this.a(var1, var2, false);
   }

   final short[] a(String var1, int var2, boolean var3) {
      if (a == null) {
         a = new short[100];
      }

      int var4 = var1.length();
      short var5 = 0;
      short var6 = 1;
      short var7 = 0;
      boolean var8 = this.h;
      boolean var9 = false;
      short var10 = 0;
      boolean var11 = this.h;

      for (int var12 = 0; var12 < var4; var12++) {
         char var13;
         if ((var13 = var1.charAt(var12)) != 32 && var13 != a) {
            if (var13 == 92) {
               if (var1.charAt(++var12) == '^') {
                  var11 = !var11;
               }
            } else if (var13 == 10) {
               a[var6++] = (short)var12;
               a[var6++] = var5;
               var5 = 0;
               var10 = 0;
            } else {
               if (var13 < 32) {
                  if (var13 == 1) {
                     var12++;
                     continue;
                  }

                  if (var13 != 2) {
                     continue;
                  }

                  var13 = var1.charAt(++var12);
               } else {
                  var13 = this.k(var13);
               }

               if (var13 > this.g()) {
                  var13 = 0;
               }

               var13 = this.l(var13) + this.h();
               if (var11) {
                  var13++;
               }

               var10 += (short)var13;
               if ((var5 += (short)var13) > var2) {
                  boolean var10000 = var3 || !var9;
                  boolean var14 = var3 || !var9;
                  if (var10000) {
                     var5 -= (short)var13;
                     var7 = (short)(var12 - 1);
                  }

                  var9 = false;

                  for (int var20 = var7; var20 >= 0 && (var1.charAt(var20) == ' ' || var1.charAt(var20) == a); var20--) {
                     if (var1.charAt(var20) == ' ') {
                        var5 -= (short)this.d();
                     }
                  }

                  if (var14) {
                     var8 = var11;
                     var10 = 0;
                  }

                  a[var6++] = (short)(var7 + 1);
                  a[var6++] = (short)(var5 - var10);
                  var5 = 0;
                  var12 = var7;
                  var11 = var8;
               }
            }
         } else {
            if (var13 == 32) {
               var5 += (short)this.d();
            }

            var7 = (short)var12;
            var8 = var11;
            var9 = true;
            var10 = 0;
            if (var5 > var2 && !var3) {
               var9 = false;

               for (int var21 = var7; var21 >= 0 && (var1.charAt(var21) == ' ' || var1.charAt(var21) == a); var21--) {
                  if (var1.charAt(var21) == ' ') {
                     var5 -= (short)this.d();
                  }
               }

               while (var7 < var4 && (var1.charAt(var7) == ' ' || var1.charAt(var7) == a)) {
                  var7++;
               }

               var12 = --var7;
               var11 = var8;
               a[var6++] = (short)(var7 + 1);
               a[var6++] = (short)var5;
               var5 = 0;
            }
         }
      }

      a[var6++] = (short)var4;
      a[var6++] = var5;
      a[0] = (short)(var6 / 2);
      return a;
   }

   final String a(String var1, int var2) {
      String var3 = "";
      short var4 = 0;
      boolean var6 = false;
      int var5 = var2;
      String var8 = var1;
      short[] var7 = this.a(var8, var5, false);

      for (int var9 = 0; var9 < var7[0]; var9++) {
         if (var4 != 0 && (var4 >= var1.length() || var1.charAt(var4) != '\n')) {
            var3 = var3 + "\n";
         }

         var3 = var3 + var1.substring(var4, var7[(var9 << 1) + 1]);
         var4 = var7[(var9 << 1) + 1];
      }

      return var3;
   }

   final void a(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, -1, false);
   }

   final void a(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   private void a(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      short var11 = var3[0];
      int var12 = this.e();
      if (var7 == -1) {
         var7 = var11;
      }

      if (var6 + var7 > var11) {
         var7 = var11 - var6;
      }

      var12 = this.b() + var12;
      if ((var8 & 32) != 0) {
         var5 -= var12 * (var7 - 1);
      } else if ((var8 & 2) != 0) {
         var5 -= var12 * (var7 - 1) >> 1;
      }

      j = this.B;
      if (var9 >= 0) {
         u = (u = var6 > 0 ? a(var3, var6 - 1) : 0) + var9;
      }

      int var13 = (var9 = j.b(var1)) + j.d(var1);
      var9 -= var12;
      var13 += var12;
      int var14 = 0;
      if (var10) {
         for (int var19 = var11 - 1; var19 >= var6 && var14 <= var7 - 1; var14++) {
            s = var19 > 0 ? a(var3, var19 - 1) : 0;
            t = a(var3, var19);
            if (s < var2.length() && var2.charAt(s) == '\n') {
               s++;
            }

            int var15 = var4;
            int var16;
            if ((var16 = var5 + var14 * var12) >= var9) {
               if (var16 > var13) {
                  break;
               }

               if ((var8 & 43) != 0) {
                  if (this.r >= 0) {
                     if ((var8 & 8) != 0) {
                        var15 = var4 - (b(var3, var19) * this.r >> 8);
                     } else if ((var8 & 1) != 0) {
                        var15 = var4 - (b(var3, var19) * this.r >> 9);
                     }
                  } else if ((var8 & 8) != 0) {
                     var15 = var4 - b(var3, var19);
                  } else if ((var8 & 1) != 0) {
                     var15 = var4 - (b(var3, var19) >> 1);
                  }

                  if ((var8 & 32) != 0) {
                     var16 -= this.e();
                  } else if ((var8 & 2) != 0) {
                     var16 -= this.e() >> 1;
                  }
               }

               this.a(var1, var2, var15, var16, 0, false);
            }

            var19--;
         }
      } else {
         for (int var20 = var6; var20 < var11 && var14 <= var7 - 1; var14++) {
            s = var20 > 0 ? a(var3, var20 - 1) : 0;
            t = a(var3, var20);
            if (s < var2.length() && var2.charAt(s) == '\n') {
               s++;
            }

            int var23 = var4;
            int var24;
            if ((var24 = var5 + var14 * var12) >= var9) {
               if (var24 > var13) {
                  break;
               }

               if ((var8 & 43) != 0) {
                  if (this.r >= 0) {
                     if ((var8 & 8) != 0) {
                        var23 = var4 - (b(var3, var20) * this.r >> 8);
                     } else if ((var8 & 1) != 0) {
                        var23 = var4 - (b(var3, var20) * this.r >> 9);
                     }
                  } else if ((var8 & 8) != 0) {
                     var23 = var4 - b(var3, var20);
                  } else if ((var8 & 1) != 0) {
                     var23 = var4 - (b(var3, var20) >> 1);
                  }

                  if ((var8 & 32) != 0) {
                     var24 -= this.e();
                  } else if ((var8 & 2) != 0) {
                     var24 -= this.e() >> 1;
                  }
               }

               this.a(var1, var2, var23, var24, 0, false);
            }

            var20++;
         }
      }

      s = -1;
      t = -1;
      u = -1;
      this.B = j;
   }

   final void a(String var1) {
      this.a(var1, null);
   }

   private void a(String var1, char[] var2) {
      if (var1 != null || var2 != null) {
         a = 0;
         k = this.e();
         int var3 = 0;
         boolean var4 = var1 != null;
         int var5 = s >= 0 ? s : 0;
         int var6;
         if (var4) {
            var6 = t >= 0 ? t : var1.length();
         } else {
            var6 = t >= 0 ? t : var2.length;
         }

         boolean var7 = this.h;

         for (int var9 = var5; var9 < var6; var9++) {
            char var8;
            if ((var8 = var4 ? var1.charAt(var9) : var2[var9]) == 92) {
               var9++;
               if ((var4 ? var1.charAt(var9) : var2[var9]) == '^') {
                  var7 = !var7;
               }
            } else {
               int var10000;
               if (var8 > 32) {
                  var10000 = this.k(var8);
               } else {
                  if (var8 == 32 || var8 == a) {
                     if (var8 == 32) {
                        var3 += this.d();
                     }
                     continue;
                  }

                  if (var8 == 32) {
                     var3 += this.d();
                     continue;
                  }

                  if (var8 == 10) {
                     if (var3 > a) {
                        a = var3;
                     }

                     var3 = 0;
                     k = k + this.b() + this.e();
                     continue;
                  }

                  if (var8 == 1) {
                     var9++;
                     continue;
                  }

                  if (var8 != 2) {
                     continue;
                  }

                  var9++;
                  var10000 = var4 ? var1.charAt(var9) : var2[var9];
               }

               var8 = var10000;
               var3 += this.l(var8) + this.h();
               if (var7) {
                  var3++;
               }
            }
         }

         if (var3 > a) {
            a = var3;
         }

         if (a > 0) {
            a = a - this.h();
         }
      }
   }

   final void a(Graphics var1, String var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, true);
   }

   private void a(Graphics var1, String var2, int var3, int var4, int var5, boolean var6) {
      boolean var13 = true;
      var6 = var6;
      var5 = var5;
      var4 = var4;
      var3 = var3;
      Object var14 = null;
      var2 = var2;
      var1 = var1;
      this = this;
      if (var2 != null) {
         if (this.r >= 0) {
            var4 += this.q * this.r >> 8;
         } else {
            var4 += this.q;
         }

         boolean var7 = var2 != null;
         this.a(var2, null);
         if ((var5 & 43) != 0) {
            if ((var5 & 8) != 0) {
               var3 -= a;
            } else if ((var5 & 1) != 0) {
               var3 -= a >> 1;
            }

            if ((var5 & 32) != 0) {
               var4 -= k;
            } else if ((var5 & 2) != 0) {
               var4 -= k >> 1;
            }
         }

         var5 = var3;
         var4 = var4;
         if (var6) {
            j = this.B;
         }

         int var8 = s >= 0 ? s : 0;
         int var10;
         if (var7) {
            var10 = t >= 0 ? t : var2.length();
         } else {
            var10 = t >= 0 ? t : ((Object[])null).length;
         }

         if (u >= 0 && var10 > u) {
            var10 = u;
         }

         for (int var11 = var8; var11 < var10; var11++) {
            char var12;
            if ((var12 = var7 ? var2.charAt(var11) : ((Object[])null)[var11]) == 92) {
               var11++;
               char var25;
               if ((var25 = var7 ? var2.charAt(var11) : ((Object[])null)[var11]) == '_') {
                  this.g = !this.g;
               } else if (var25 == '^') {
                  this.h = !this.h;
               } else {
                  var12 = var25 & 255;
                  this.e(var12 - 48);
               }
            } else if (var12 != a) {
               int var32;
               if (var12 > 32) {
                  var32 = this.k(var12);
               } else {
                  if (var12 == 32) {
                     if (this.g) {
                        int var29 = this.k(95);
                        var8 = var5 + (this.d() - this.l(var29) >> 1);
                        this.a(var1, var29, var8, var4, 0);
                     }

                     var5 += this.d();
                     continue;
                  }

                  if (var12 == 10) {
                     var5 = var3;
                     var4 += this.b() + this.e();
                     continue;
                  }

                  if (var12 == 1) {
                     var11++;
                     char var27;
                     if ((var27 = var7 ? var2.charAt(var11) : ((Object[])null)[var11]) < this.b) {
                        this.e(var27);
                     }

                     if (var27 == 255) {
                        this.B = j;
                     }
                     continue;
                  }

                  if (var12 != 2) {
                     continue;
                  }

                  var11++;
                  var32 = var7 ? var2.charAt(var11) : ((Object[])null)[var11];
               }

               var12 = var32;
               this.a(var1, var12, var5, var4, 0);
               if (this.g) {
                  int var9 = this.k(95);
                  var8 = var5 + (this.l(var12) - this.l(var9) >> 1);
                  this.a(var1, var9, var8, var4, 0);
               }

               if (this.h) {
                  this.a(var1, var12, ++var5, var4, 0);
               }

               var5 += this.l(var12) + this.h();
            }
         }

         if (var6) {
            this.B = j;
         }
      }
   }

   final void b(Graphics var1, String var2, int var3, int var4, int var5) {
      int var6 = var2.length();
      boolean var12 = false;
      var5 = var5;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      this = this;
      int var7 = 2;

      for (int var8 = 0; var8 < var6; var8++) {
         if (var2.charAt(var8) == '\n') {
            var7++;
         }
      }

      int[] var25 = new int[var7];
      int[] var10 = var25;
      byte var19 = 10;
      int var9 = var6;
      int var22 = 0;
      String var20 = var2;
      int var11 = 0;
      var10[0] = var22 - 1;

      for (int var23 = var22; var23 < var9; var23++) {
         if (var20.charAt(var23) == '\n') {
            var10[++var11] = var23;
         }
      }

      var10[++var11] = var9;
      var22 = var11;
      var6 = this.b() + this.e();
      if ((var5 & 32) != 0) {
         var4 -= var6 * (var22 - 1);
      } else if ((var5 & 2) != 0) {
         var4 -= var6 * (var22 - 1) >> 1;
      }

      for (int var26 = 0; var26 < var22; var26++) {
         s = var25[var26] + 1;
         t = var25[var26 + 1];
         this.a(var1, var2, var3, var4 + var26 * var6, var5, false);
      }

      s = -1;
      t = -1;
   }

   private final int l(int var1) {
      return this.r >= 0 ? this.f(var1, 0) * this.r >> 8 : this.f(var1, 0);
   }

   final void e(int var1) {
      var1 = var1;
      this = this;
      if (var1 < this.b && var1 >= 0) {
         this.B = var1;
      }
   }

   final int f() {
      return this.B;
   }

   final void b(int var1, int var2) {
      int var4 = this.k;
      boolean var3 = this.j;
      var2 = var2;
      var1 = var1;
      boolean var7 = false;
      e var8 = this;
      int[] var5;
      int var6 = (var5 = (int[])this.a(0, var1)).length;
      if (var4) {
         for (int var13 = var6 - 1; var13 >= 0; var13--) {
            var4 = ((var5[var13] >>> 24) * var2 >> 8 & 0xFF) << 24;
            var5[var13] = var4 | var5[var13] & 16777215;
         }
      } else if (var3) {
         var2 = (var2 & 0xFF) << 24;

         for (int var14 = var6 - 1; var14 >= 0; var14--) {
            if ((var5[var14] & 16777215) != 16711935 && var5[var14] >> 24 != 0) {
               var5[var14] = var2 | var5[var14] & 16777215;
            }
         }
      } else {
         var2 = (var2 & 0xFF) << 24;

         for (int var15 = var6 - 1; var15 >= 0; var15--) {
            var5[var15] = var2 | var5[var15] & 16777215;
         }
      }

      if ((var8.A & 536870912) != 0) {
         var8.a(0, var1, var5);
      }
   }

   final void f(int var1) {
      int var2 = this.b - 1;
      var1 = var1;
      var2 = var2;
      var1 = var1;
      boolean var5 = false;
      e var6 = this;
      this.j = true;
      var6.k = true;
      int[] var3 = (int[])var6.a(0, var1);
      int[] var10 = (int[])var6.a(0, var2);

      for (int var4 = 0; var4 < var3.length; var4++) {
         if ((var3[var4] & 16777215) != 16711935 && var3[var4] >> 24 != 0) {
            var3[var4] &= 16777215;
            var3[var4] |= (var10[var4] & 0xFF0000) << 8;
         }
      }

      if ((var6.A & 536870912) != 0) {
         var6.a(0, var1, var3);
      }
   }

   private static int a(byte[] var0, int var1, short[] var2, int var3, int var4, boolean var5) {
      for (int var7 = 0; var7 < var4; var7++) {
         var2[var7] = var5 ? var0[var1++] : (short)((var0[var1++] & 255) + ((var0[var1++] & 255) << 8));
      }

      return var1;
   }

   static final int[] a(int[] var0, int var1, int var2, int var3) {
      Object var9 = null;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      if ((var3 & 7) == 0) {
         return var0;
      }

      int[] var4 = a(var0);
      int var5 = 0;
      int var6 = 0;
      switch (var3 & 7) {
         case 1:
            var5 = var1 * var2;
            var6 = var1 * (var2 - 1);

            for (int var35 = var2; --var35 >= 0; var6 -= var1 << 1) {
               for (int var18 = var1; --var18 >= 0; var4[var5] = var0[var6++]) {
                  var5--;
               }
            }
            break;
         case 2:
            var5 = (var2 - 1) * var1;

            for (int var34 = var2; --var34 >= 0; var6 += var1) {
               System.arraycopy(var0, var6, var4, var5, var1);
               var5 -= var1;
            }
            break;
         case 3:
            var6 = var1 * var2 - 1;

            while (var6 >= 0) {
               var4[var5++] = var0[var6--];
            }
            break;
         case 4:
            var5 = var1 * var2;
            int var33 = var2;

            while (--var33 >= 0) {
               var6 = var33;

               for (int var17 = var1; --var17 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 5:
            var5 = var1 * var2;
            int var32 = var2;

            while (--var32 >= 0) {
               var6 = var2 - 1 - var32;

               for (int var16 = var1; --var16 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 6:
            int var36 = (var5 = var1 * var2) - 1;
            int var31 = var2;

            while (--var31 >= 0) {
               var6 = var36--;

               for (int var15 = var1; --var15 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 7:
            int var8 = (var5 = var1 * var2) - var2;
            int var7 = var2;

            while (--var7 >= 0) {
               var6 = var8++;

               for (int var14 = var1; --var14 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
      }

      return var4;
   }

   static final int[] a(int[] var0, int var1, int var2) {
      return a(var0);
   }

   static {
      for (int var0 = 0; var0 < 256; var0++) {
         int var1 = var0;

         for (int var2 = 8; var2 > 0; var2--) {
            if ((var1 & 1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         c[var0] = var1;
      }

      a = false;
      c = false;
      e = 0;
      f = 0;
      d = false;
      f = null;
      s = -1;
      t = -1;
      u = -1;
      v = -1;
      w = -1;
      x = 0;
      c = 640;
      d = 360;
      D = 0;
      r = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
      s = new int[]{1, 0, 3, 2, 6, 7, 4, 5};
      t = new int[]{2, 3, 0, 1, 5, 4, 7, 6};
      u = new int[]{4, 5, 6, 7, 3, 2, 1, 0};
      b = new int[4];
      l = true;
      b = false;
      a = '|';
      m = false;
      n = false;
      J = -1;
      K = -1;
   }
}
