/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e {
    private static int[] c = new int[256];
    static boolean a;
    private static boolean c;
    private static int e;
    private static int f;
    private int g;
    private static short[][] a;
    private static int[] d;
    private static int[] e;
    private static e[][] a;
    private int h;
    private int i;
    private static final boolean d;
    private static int[] f;
    private boolean e;
    private static int j;
    static int a;
    private static int k;
    private boolean f;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean g;
    private boolean h;
    private byte[] a;
    private short[][] b;
    private short a;
    private int r;
    private int[] g;
    private static short[] a;
    private static int s;
    private static int t;
    private static int u;
    private boolean i;
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
    private byte[] e = false;
    private short[] l;
    private short[] m;
    private byte[] f = false;
    private byte[] g = new int[4];
    private byte[] h = false;
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
    private int[] i = false;
    private byte[][] a;
    private int A;
    private short[][][] a;
    private int[][][] a;
    private byte[] r = -1;
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
    private int[] p = 0;
    private int[] q;
    private static int[] r;
    private static int[] s;
    private static int[] t;
    private static int[] u;
    private byte[] s;
    private byte[] t;
    private int[] v;
    private byte a = null;
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
        int n2;
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
            for (n2 = 0; n2 < this.c.length; ++n2) {
                this.c[n2] = null;
            }
            this.c = null;
        }
        if (this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2] = null;
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

    final void a(byte[] byArray, int n2) {
        e e2 = e3;
        e e3 = null;
        boolean bl = true;
        int n3 = 0xFFFFFF;
        n2 = 0;
        e e4 = e2;
        if (byArray == null) {
            return;
        }
        try {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            if (l) {
                System.gc();
            }
            ++n2;
            int n14 = ++n2;
            int n15 = ++n2;
            int n16 = ++n2;
            int n17 = ++n2;
            e4.A = (byArray[n14] & 0xFF) + ((byArray[n15] & 0xFF) << 8) + ((byArray[n16] & 0xFF) << 16) + ((byArray[n17] & 0xFF) << 24);
            byte[] byArray2 = byArray;
            int n18 = ++n2;
            e e5 = e4;
            e4.y = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
            if (e5.y > 0) {
                if ((e5.A & 0x20) != 0) {
                    e5.b = new short[e5.y];
                    e5.c = new short[e5.y];
                }
                e5.d = new short[e5.y];
                e5.e = new short[e5.y];
                n13 = 0;
                n12 = 0;
                short[][] sArrayArray = null;
                if ((e5.A & 4) != 0) {
                    e5.t = new byte[e5.y];
                }
                n11 = 0;
                n10 = 0;
                n9 = 0;
                for (n8 = 0; n8 < e5.y; ++n8) {
                    short[] sArray;
                    n7 = 0;
                    n6 = 0;
                    n5 = 0;
                    if ((byArray2[n18] & 0xFF) == 0) {
                        ++n18;
                        n11 = 0;
                        n10 = 1;
                        n9 = 1;
                        if ((e5.A & 4) != 0) {
                            e5.t[n8] = byArray2[n18++];
                        }
                    } else if ((byArray2[n18] & 0xFF) == 255) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 1;
                        n11 = 1;
                        n10 = 0;
                        n9 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 254) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 2;
                        n11 = 1;
                        n10 = 0;
                        n9 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 253) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 5;
                        n11 = 0;
                        n10 = 0;
                        n9 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 252) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 3;
                        n11 = 1;
                        n10 = 0;
                        n9 = 1;
                        n7 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 251) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 4;
                        n11 = 1;
                        n10 = 0;
                        n9 = 1;
                        n7 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 250) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 6;
                        n11 = 1;
                        n10 = 0;
                        n9 = 0;
                        n6 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 249) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 7;
                        n11 = 1;
                        n10 = 0;
                        n9 = 0;
                        n6 = 1;
                    } else if ((byArray2[n18] & 0xFF) == 248) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 8;
                        n11 = 1;
                        n10 = 0;
                        n9 = 1;
                        n6 = 0;
                    } else if ((byArray2[n18] & 0xFF) == 247) {
                        ++n18;
                        e5.g(e5.y);
                        e5.s[n8] = 9;
                        n11 = 1;
                        n5 = 1;
                        n10 = 0;
                        n9 = 1;
                        n6 = 0;
                    }
                    if (n11 != 0) {
                        e5.v[n8] = (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24);
                    }
                    if (n5 != 0) {
                        if (sArrayArray == null) {
                            sArrayArray = new short[e5.y][];
                        }
                        sArray = new short[3];
                        n4 = (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24);
                        sArray[0] = (short)n4;
                        sArray[1] = (short)(n4 >> 16);
                        sArray[2] = byArray2[n18++];
                        sArrayArray[n8] = sArray;
                        ++n13;
                        n12 += 3;
                    }
                    if (n10 != 0 && (e5.A & 0x20) != 0) {
                        e5.b[n8] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        e5.c[n8] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    }
                    if (n9 != 0) {
                        if ((e5.A & 0x10) == 0) {
                            e5.d[n8] = (short)(byArray2[n18++] & 0xFF);
                            e5.e[n8] = (short)(byArray2[n18++] & 0xFF);
                        } else {
                            e5.d[n8] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                            e5.e[n8] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        }
                    }
                    if (n7 != 0) {
                        if (sArrayArray == null) {
                            sArrayArray = new short[e5.y][];
                        }
                        short[] sArray2 = new short[2];
                        sArray = sArray2;
                        sArray2[0] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        sArray[1] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        sArrayArray[n8] = sArray;
                        ++n13;
                        n12 += 2;
                    }
                    if (n6 == 0) continue;
                    if (sArrayArray == null) {
                        sArrayArray = new short[e5.y][];
                    }
                    short[] sArray3 = new short[4];
                    sArray = sArray3;
                    sArray3[0] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    sArray[1] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    sArray[2] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    sArray[3] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    sArrayArray[n8] = sArray;
                    ++n13;
                    n12 += 4;
                }
                if (n13 > 0) {
                    e5.f = new short[n12];
                    e5.g = new short[n13 << 1];
                    n8 = 0;
                    short s2 = 0;
                    for (n12 = 0; n12 < e5.y; n12 = (short)(n12 + 1)) {
                        n4 = e5.s[n12] == 3 || e5.s[n12] == 4 ? 2 : (e5.s[n12] == 6 || e5.s[n12] == 7 ? 4 : (e5.s[n12] == 9 ? 3 : -1));
                        if (n4 <= 0) continue;
                        e5.g[n8 << 1] = n12;
                        e5.g[(n8 << 1) + 1] = s2;
                        for (int i2 = 0; i2 < n4; ++i2) {
                            e5.f[s2] = sArrayArray[n12][i2];
                            s2 = (short)(s2 + 1);
                        }
                        sArrayArray[n12] = null;
                        ++n8;
                    }
                }
            }
            int n19 = n18;
            byArray2 = byArray;
            n18 = n19;
            e e6 = e4;
            if ((n13 = (int)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8))) > 0) {
                e6.g = new byte[n13];
                e6.n = new short[n13];
                e6.o = new short[n13];
                e6.h = new byte[n13];
                if ((e6.A & 0x4000) != 0) {
                    e6.i = new byte[n13];
                }
                for (n12 = 0; n12 < n13; ++n12) {
                    e6.g[n12] = byArray2[n18++];
                    if ((e6.A & 0x400) == 0) {
                        e6.n[n12] = byArray2[n18++];
                        e6.o[n12] = byArray2[n18++];
                    } else {
                        e6.n[n12] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        e6.o[n12] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    }
                    if ((e6.A & 0x4000) != 0) {
                        e6.i[n12] = byArray2[n18++];
                    }
                    e6.h[n12] = byArray2[n18++];
                }
            }
            int n20 = n18;
            byArray2 = byArray;
            n18 = n20;
            e e7 = e4;
            if ((e7.A & 0x8000) != 0) {
                n13 = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                if ((e7.A & 0x400) == 0) {
                    e7.e = new byte[n13 << 2];
                    System.arraycopy(byArray2, n18, e7.e, 0, n13 << 2);
                    n18 += n13 << 2;
                } else {
                    e7.l = new short[n13 << 2];
                    n18 = e.a(byArray2, n18, e7.l, 0, n13 << 2, false);
                }
            }
            if ((n13 = (int)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8))) > 0) {
                if ((e7.A & 0x800) != 0) {
                    e7.h = new short[n13];
                } else {
                    e7.b = new byte[n13];
                }
                e7.i = new short[n13];
                if ((e7.A & 0x8000) != 0) {
                    e7.m = new short[n13 + 1];
                }
                short s3 = 0;
                for (n11 = 0; n11 < n13; ++n11) {
                    if ((e7.A & 0x800) != 0) {
                        e7.h[n11] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    } else {
                        e7.b[n11] = byArray2[n18++];
                    }
                    e7.i[n11] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    if ((e7.A & 0x8000) == 0 || (e7.A & 0x8000) == 0) continue;
                    e7.m[n11] = s3;
                    s3 = (short)(s3 + byArray2[n18++]);
                }
                if ((e7.A & 0x8000) != 0) {
                    e7.m[e7.m.length - 1] = s3;
                }
                if ((e7.A & 0x1000) == 0) {
                    n11 = n13 << 2;
                    if ((e7.A & 0x400) == 0) {
                        e7.c = new byte[n11];
                        for (n10 = 0; n10 < n11; ++n10) {
                            e7.c[n10] = byArray2[n18++];
                        }
                    } else {
                        e7.j = new short[n11];
                        for (n10 = 0; n10 < n11; ++n10) {
                            e7.j[n10] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        }
                    }
                }
            }
            int n21 = n18;
            byArray2 = byArray;
            n18 = n21;
            e e8 = e4;
            if ((n13 = (int)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8))) > 0) {
                e8.l = new byte[n13];
                e8.m = new byte[n13];
                e8.n = new byte[n13];
                e8.o = new byte[n13];
                e8.p = new byte[n13];
                for (n12 = 0; n12 < n13; ++n12) {
                    e8.l[n12] = byArray2[n18++];
                    e8.m[n12] = byArray2[n18++];
                    e8.n[n12] = byArray2[n18++];
                    e8.o[n12] = byArray2[n18++];
                    e8.p[n12] = byArray2[n18++];
                }
            }
            int n22 = n18;
            byArray2 = byArray;
            n18 = n22;
            e e9 = e4;
            short s4 = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
            n13 = s4;
            if (s4 > 0) {
                e9.j = new byte[n13];
                e9.p = new short[n13];
                for (int i3 = 0; i3 < n13; ++i3) {
                    e9.j[i3] = byArray2[n18++];
                    e9.p[i3] = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                }
            }
            int n23 = n18;
            if (e4.y <= 0) {
                if (l) {
                    System.gc();
                }
                return;
            }
            if ((e4.A & 0x1000000) != 0) {
                n12 = 1;
                n13 = n3;
                byArray2 = byArray;
                n18 = n23;
                e e10 = e4;
                if ((e10.A & 0x1000000) != 0 && n18 < byArray2.length) {
                    short s5 = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    n11 = 1;
                    if ((e10.A & 0x40000000) != 0) {
                        n11 = byArray2[n18++];
                    }
                    if (e10.j == null) {
                        e10.j = new int[n11];
                    }
                    for (n9 = 0; n9 < n11; ++n9) {
                        e10.b = n10 = byArray2[n18++] & 0xFF;
                        if ((n7 = byArray2[n18++] & 0xFF) == 0) {
                            n7 = 256;
                        }
                        e10.j[n9] = n7;
                        n12 = n11;
                        Object object = e10;
                        if (((e)object).a == null) {
                            ((e)object).a = new int[n12][26][];
                        }
                        object = null;
                        for (n5 = 0; n5 < e10.b; ++n5) {
                            int n24;
                            e10.a[n9][n5] = new int[n7];
                            object = e10.a[n9][n5];
                            if (s5 == -30584) {
                                for (n8 = 0; n8 < n7; ++n8) {
                                    if (((n24 = (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24)) & 0xFF000000) != -16777216) {
                                        e10.j = true;
                                        if ((n24 & 0xFF000000) != 0) {
                                            e10.k = true;
                                        }
                                    }
                                    object[n8] = n24;
                                }
                                continue;
                            }
                            if (s5 == 17476) {
                                for (n8 = 0; n8 < n7; ++n8) {
                                    if (((n24 = (int)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8))) & 0xF000) != 61440) {
                                        e10.j = true;
                                        if ((n24 & 0xF000) != 0) {
                                            e10.k = true;
                                        }
                                    }
                                    object[n8] = (n24 & 0xF000) << 16 | (n24 & 0xF000) << 12 | (n24 & 0xF00) << 12 | (n24 & 0xF00) << 8 | (n24 & 0xF0) << 8 | (n24 & 0xF0) << 4 | (n24 & 0xF) << 4 | n24 & 0xF;
                                }
                                continue;
                            }
                            if (s5 == 21781) {
                                for (n8 = 0; n8 < n7; ++n8) {
                                    n24 = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                                    n4 = -16777216;
                                    if ((n24 & 0x8000) != 32768) {
                                        n4 = 0;
                                        e10.j = true;
                                    }
                                    if ((n12 = n4 | (n24 & 0x7C00) << 9 | (n24 & 0x3E0) << 6 | (n24 & 0x1F) << 3) == 0xF800F8) {
                                        n12 = 0xFF00FF;
                                    }
                                    object[n8] = n12;
                                }
                                continue;
                            }
                            if (s5 != 25861) continue;
                            for (n8 = 0; n8 < n7; ++n8) {
                                n24 = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                                n4 = -16777216;
                                if ((n24 & 0xFFFF) == 63519) {
                                    n4 = 0;
                                    e10.j = true;
                                }
                                if ((n12 = n4 | (n24 & 0xF800) << 8 | (n24 & 0x7E0) << 5 | (n24 & 0x1F) << 3) == 0xF800F8) {
                                    n12 = 0xFF00FF;
                                }
                                object[n8] = n12;
                            }
                        }
                    }
                    e10.b = (short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                    if (e10.b == -23978) {
                        e10.j = true;
                        e10.k = true;
                    }
                    if (e10.b == 25840 || e10.b == -22976) {
                        if (e10.k == null) {
                            e10.k = new int[n11];
                            e10.l = new int[n11];
                        }
                        n9 = 0;
                        while (n9 < n11) {
                            n12 = n9;
                            e e11 = e10;
                            e10.k[n9] = 1;
                            e10.l[n9] = 0;
                            for (n7 = e11.j[n12] - 1; n7 != 0; n7 >>= 1) {
                                int n25 = n9;
                                e10.k[n25] = e10.k[n25] << 1;
                                int n26 = n9;
                                e10.l[n26] = e10.l[n26] + 1;
                            }
                            int n27 = n9++;
                            e10.k[n27] = e10.k[n27] - 1;
                        }
                    }
                    if (e10.y > 0) {
                        e10.i = new int[e10.y];
                        n9 = 0;
                        n7 = n18;
                        for (n6 = 0; n6 < e10.y; ++n6) {
                            n13 = (e10.A & 0x80) != 0 ? (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24) : (int)((short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8)));
                            e10.i[n6] = n9;
                            n9 += n13;
                            n18 += n13;
                        }
                        n18 = n7;
                        e10.q = new byte[n9];
                        for (n9 = 0; n9 < e10.y; ++n9) {
                            n7 = (e10.A & 0x80) != 0 ? (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24) : (int)((short)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8)));
                            n12 = n9;
                            e e12 = e10;
                            System.arraycopy(byArray2, n18, e12.q, e10.i(n9), n7);
                            n18 += n7;
                        }
                    }
                }
                n23 = n18;
            }
            if ((e4.A & 0x20000000) != 0) {
                n13 = n3;
                byArray2 = byArray;
                n18 = n23;
                e e13 = e4;
                if ((e13.A & 0x20000000) != 0) {
                    if ((e13.A & 0x40000000) != 0) {
                        e13.a = byArray2[n18++];
                        e13.b = new byte[e13.a][];
                    } else {
                        e13.a = 1;
                    }
                    e13.j = new int[e13.a];
                    e13.a = new byte[e13.a][];
                    for (n12 = 0; n12 < e13.a; ++n12) {
                        if ((e13.A & 0x40000000) != 0) {
                            ++n18;
                            ++n18;
                            ++n18;
                            ++n18;
                        }
                        int n28 = (e13.A & 0x80) != 0 ? (byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8) + ((byArray2[n18++] & 0xFF) << 16) + ((byArray2[n18++] & 0xFF) << 24) : (int)((byArray2[n18++] & 0xFF) + ((byArray2[n18++] & 0xFF) << 8));
                        if ((e13.A & 0x40000000) != 0) {
                            e13.a[n12] = new byte[n28];
                            System.arraycopy(byArray2, n18, e13.a[n12], 0, n28);
                            n18 += n28;
                        } else {
                            e13.q = new byte[n28];
                            System.arraycopy(byArray2, n18, e13.q, 0, n28);
                            n18 += n28;
                        }
                        e13.b = byArray2[n18++] & 0xFF;
                        if ((e13.A & 0x40000000) != 0) {
                            if ((n6 = byArray2[n18++] & 0xFF) == 0) {
                                n6 = 256;
                            }
                            n10 = n6 * 3 + 4;
                            n9 = n6 + 4;
                            n7 = n10 + n9;
                            e13.b[n12] = new byte[e13.b * n7];
                            System.arraycopy(e13.a[n12], 41, e13.b[n12], 0, n10);
                            System.arraycopy(e13.a[n12], n10 + 41 + 8, e13.b[n12], n10, n9);
                            System.arraycopy(byArray2, n18, e13.b[n12], n7, (e13.b - 1) * n7);
                            n18 += (e13.b - 1) * n7;
                        } else {
                            if ((n6 = byArray2[n18++] & 0xFF) == 0) {
                                n6 = 256;
                            }
                            n10 = n6 * 3 + 4;
                            n9 = n6 + 4;
                            n7 = n10 + n9;
                            e13.r = new byte[e13.b * n7];
                            System.arraycopy(e13.q, 41, e13.r, 0, n10);
                            System.arraycopy(e13.q, n10 + 41 + 8, e13.r, n10, n9);
                            System.arraycopy(byArray2, n18, e13.r, n7, (e13.b - 1) * n7);
                            n18 += (e13.b - 1) * n7;
                            n13 = n10;
                            for (n5 = 0; n5 < e13.b; ++n5) {
                                for (n8 = 0; n8 < n6; ++n8) {
                                    int n29 = e13.r[n13] & 0xFF;
                                    if (n29 != 255) {
                                        e13.j = true;
                                        if (n29 != 0) {
                                            e13.k = true;
                                        }
                                    }
                                    ++n13;
                                }
                                n13 += n10 + 4;
                            }
                        }
                        e13.j[n12] = n6;
                    }
                }
            }
            e4.c = new short[16][];
            e4.z = -1;
            if ((e4.A & 0x1000) != 0) {
                int n30 = e4.g();
                if (n30 > 0) {
                    int n31 = 0;
                    if ((e4.A & 0x400) == 0 && (e4.C & 4) == 0) {
                        e4.c = new byte[n30 << 2];
                        for (n3 = 0; n3 < n30; ++n3) {
                            e4.a(b, n3, 0, 0, 0);
                            e4.c[n31++] = (byte)b[0];
                            e4.c[n31++] = (byte)b[1];
                            e4.c[n31++] = (byte)(b[2] - b[0]);
                            e4.c[n31++] = (byte)(b[3] - b[1]);
                        }
                    } else {
                        e4.j = new short[n30 << 2];
                        for (n3 = 0; n3 < n30; ++n3) {
                            e4.a(b, n3, 0, 0, 0);
                            e4.j[n31++] = (short)b[0];
                            e4.j[n31++] = (short)b[1];
                            e4.j[n31++] = (short)(b[2] - b[0]);
                            e4.j[n31++] = (short)(b[3] - b[1]);
                        }
                    }
                }
            } else if ((e4.C & 4) != 0) {
                n18 = 0;
                e e14 = e4;
                e14.C &= 0xFFFFFFFB;
            }
            if (l) {
                System.gc();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void g(int n2) {
        if (this.s == null) {
            this.s = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.s[i2] = 0;
            }
        }
        if (this.v == null) {
            this.v = new int[n2];
        }
    }

    final void b() {
        boolean bl = true;
        e e2 = this;
        if ((e2.A & 0x20000000) != 0) {
            e2.r = null;
        }
        e2.r = null;
        e2.a = null;
        e2.a = null;
        e2.q = null;
        e2.i = null;
        if (l) {
            System.gc();
        }
    }

    final int a(int n2, int n3) {
        return this.m[this.p[n2] + n3] & 0xFF;
    }

    final int b(int n2, int n3) {
        return this.p[this.p[n2] + n3] & 0xF;
    }

    final int a(int n2) {
        return this.j[n2] & 0xFF;
    }

    private int d(int n2) {
        if ((this.A & 0x800) != 0) {
            return this.h[n2];
        }
        return this.b[n2] & 0xFF;
    }

    private int e(int n2) {
        if (this.s != null) {
            return this.s[n2];
        }
        return 0;
    }

    private int f(int n2) {
        return this.d[n2] & 0xFFFF;
    }

    private int g(int n2) {
        return this.e[n2] & 0xFFFF;
    }

    final int b(int n2) {
        if ((this.A & 0x400) == 0 && (this.C & 4) == 0) {
            return this.c[(n2 << 2) + 2] & 0xFF;
        }
        return this.j[(n2 << 2) + 2] & 0xFFFF;
    }

    final int c(int n2) {
        if ((this.A & 0x400) == 0 && (this.C & 4) == 0) {
            return this.c[(n2 << 2) + 3] & 0xFF;
        }
        return this.j[(n2 << 2) + 3] & 0xFFFF;
    }

    private int d(int n2, int n3) {
        n2 = this.i[n2] + n3;
        int n4 = this.g[n2] & 0xFF;
        return n4;
    }

    private int e(int n2, int n3) {
        return this.h[this.i[n2] + n3] & 0xFF;
    }

    private int f(int n2, int n3) {
        n2 = this.i[n2] + n3;
        return this.n[n2];
    }

    private int g(int n2, int n3) {
        n2 = this.i[n2] + n3;
        return this.o[n2];
    }

    final int c(int n2, int n3) {
        n2 = this.p[n2] + n3;
        int n4 = this.l[n2] & 0xFF;
        return n4;
    }

    final void a(int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        E = Integer.MAX_VALUE;
        F = Integer.MAX_VALUE;
        G = Integer.MIN_VALUE;
        H = Integer.MIN_VALUE;
        x = 1;
        this.a((Graphics)null, n2, n3, n4, n5, n6);
        x = 0;
        nArray[0] = E;
        nArray[1] = F;
        nArray[2] = G;
        nArray[3] = H;
    }

    final void a(int[] nArray, int n2, int n3, int n4, int n5) {
        boolean bl = false;
        n5 = 0;
        e e2 = this;
        boolean bl2 = true;
        bl2 = false;
        e e3 = e2;
        E = Integer.MAX_VALUE;
        F = Integer.MAX_VALUE;
        G = Integer.MIN_VALUE;
        H = Integer.MIN_VALUE;
        x = 1;
        e3.a((Graphics)null, n2, n3, n4, n5);
        x = 0;
        nArray[0] = E;
        nArray[1] = F;
        nArray[2] = G;
        nArray[3] = H;
    }

    private int h(int n2) {
        if (this.t == null) {
            return 0;
        }
        return this.t[n2];
    }

    private Object a(int n2, int n3) {
        if (n3 >= 0 && n3 < this.b) {
            if ((this.A & 0x20000000) != 0) {
                n2 = n3;
                if (this.r != null) {
                    int n4 = 0;
                    e e2 = this;
                    int n5 = e2.j[n4];
                    n4 = n5 * 3 + 4;
                    int n6 = n5 + 4;
                    n2 *= (n4 += n6);
                    int[] nArray = new int[n5];
                    for (n6 = 0; n6 < n5; ++n6) {
                        nArray[n6] = (this.r[n2] & 0xFF) << 16 | (this.r[n2 + 1] & 0xFF) << 8 | this.r[n2 + 2] & 0xFF;
                        n2 += 3;
                    }
                    n2 += 4;
                    n6 = 0;
                    while (n6 < n5) {
                        int n7 = n6++;
                        nArray[n7] = nArray[n7] | (this.r[n2++] & 0xFF) << 24;
                    }
                    return nArray;
                }
                return null;
            }
            if (this.a != null && n3 < this.a[n2].length) {
                return this.a[n2][n3];
            }
        }
        return null;
    }

    private int g() {
        if ((this.A & 0x800) != 0) {
            if (this.h == null) {
                return 0;
            }
            return this.h.length;
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.length;
    }

    private boolean a(int n2) {
        if (this.i == null) {
            return false;
        }
        return this.q != null;
    }

    private int i(int n2) {
        if (this.i != null) {
            return this.i[n2];
        }
        return -1;
    }

    private int h(int n2, int n3) {
        int n4 = this.d(n2);
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n6 = this.d(n2, i2);
            int n7 = this.e(n2, i2);
            if ((n7 & 0x10) != 0 || this.e(n6) != 5 || n3 != -1 && n3 != n6) continue;
            ++n5;
        }
        return n5;
    }

    final int[] a(int n2) {
        return this.a(n2, null, 0, -1);
    }

    final int[] a(int n2, int[] nArray, int n3, int n4) {
        int n5 = this.h(n2, n4);
        if (n5 > 0) {
            int n6 = 0;
            int n7 = n5 << 1 + (n3 & 1);
            if (nArray == null || nArray.length < (n7 += n3 > 1 ? 1 : 0)) {
                nArray = new int[n7];
            }
            n7 = this.d(n2);
            if (n3 > 1) {
                n3 -= 2;
                nArray[0] = n5;
                ++n6;
            }
            for (int i2 = 0; i2 < n7; ++i2) {
                n5 = this.d(n2, i2);
                int n8 = this.e(n2, i2);
                if ((n8 & 0x10) != 0 || this.e(n5) != 5 || n4 != -1 && n4 != (n8 = n5)) continue;
                nArray[n6] = this.f(n2, i2);
                nArray[n6 + 1] = this.g(n2, i2);
                if (n3 == 0) {
                    n6 += 2;
                    continue;
                }
                nArray[n6 + 2] = n8 = n5;
                nArray[n6 + 3] = i2;
                n6 += 4;
            }
            return nArray;
        }
        return null;
    }

    final int[] a(int n2, int n3, int[] nArray, int n4, int n5) {
        int n6 = this.c(n2, n3);
        int[] nArray2 = this.a(n6, null, 0, -1);
        if (nArray2 != null) {
            n6 = this.h(n6, -1);
            n5 = this.b(n2, n3);
            int n7 = n3;
            int n8 = n2;
            e e2 = this;
            n8 = e2.p[n8] + n7;
            byte by = e2.n[n8];
            n7 = n3;
            n8 = n2;
            e2 = this;
            n8 = e2.p[n8] + n7;
            byte by2 = e2.o[n8];
            n2 = 0;
            for (n3 = 0; n3 < n6; ++n3) {
                int n9 = n2;
                nArray2[n9] = nArray2[n9] + by;
                int n10 = n2 + 1;
                nArray2[n10] = nArray2[n10] + by2;
                if ((n5 & 1) != 0) {
                    int n11 = n2;
                    nArray2[n11] = -nArray2[n11];
                    int n12 = n2;
                    nArray2[n12] = nArray2[n12] + (by << 1);
                }
                if ((n5 & 2) != 0) {
                    int n13 = n2 + 1;
                    nArray2[n13] = -nArray2[n13];
                    int n14 = n2 + 1;
                    nArray2[n14] = nArray2[n14] + (by2 << 1);
                }
                n2 += 2;
            }
        }
        return nArray2;
    }

    static int[] a(int[] nArray) {
        if (nArray == null || nArray != a) {
            if (a == null) {
                a = new int[100000];
            }
            return a;
        }
        if (nArray == null || nArray != h) {
            if (h == null) {
                h = new int[100000];
            }
            return h;
        }
        return null;
    }

    private void a(int n2, int n3, int[] object) {
        if ((this.A & 0x20000000) != 0) {
            int n4;
            int[] nArray = object;
            n2 = n3;
            int n5 = 0;
            object = this;
            int n6 = this.j[n5];
            n5 = n6 * 3 + 4;
            int n7 = n6 + 4;
            int n8 = n5 + n7;
            int n9 = n2 * n8;
            int n10 = n9 + n5;
            for (n4 = 0; n4 < n6; ++n4) {
                this.r[n10++] = (byte)(nArray[n4] >>> 24);
                this.r[n9++] = (byte)(nArray[n4] >> 16);
                this.r[n9++] = (byte)(nArray[n4] >> 8);
                this.r[n9++] = (byte)nArray[n4];
            }
            n4 = e.a(null, 0, 4, 0);
            n4 = e.a(this.r, n2 * n8, n5 - 4, n4);
            int n11 = n2 * n8 + n5 - 4;
            this.r[n11++] = (byte)(n4 >>> 24);
            this.r[n11++] = (byte)(n4 >> 16);
            this.r[n11++] = (byte)(n4 >> 8);
            this.r[n11] = (byte)n4;
            n4 = e.a(null, 0, 4, 0);
            n4 = e.a(this.r, n2 * n8 + n5, n7 - 4, n4);
            n11 = (n2 + 1) * n8 - 4;
            this.r[n11++] = (byte)(n4 >>> 24);
            this.r[n11++] = (byte)(n4 >> 16);
            this.r[n11++] = (byte)(n4 >> 8);
            this.r[n11] = (byte)n4;
            return;
        }
        this.a[n2][n3] = object;
    }

    private static boolean a(Graphics graphics, int n2, int n3, int n4, int n5) {
        int n6 = j.a(graphics);
        int n7 = j.b(graphics);
        int n8 = j.c(graphics);
        int n9 = j.d(graphics);
        if (j.b(13)) {
            int n10 = j.o();
            int n11 = j.p();
            n4 = n4 * n10 / 100;
            n5 = n5 * n11 / 100;
        } else if (j.b(15)) {
            return true;
        }
        return n2 + n4 >= n6 && n3 + n5 >= n7 && n2 < n6 + n8 && n3 < n7 + n9;
    }

    final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        this.a(graphics, n2, n3, n4, n5, n6, 0, 0);
    }

    final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n2 = this.p[n2] + n3;
        n3 = this.l[n2] & 0xFF;
        int n9 = n2;
        e e2 = this;
        n7 = e2.n[n9];
        n9 = n2;
        e2 = this;
        int n10 = e2.o[n9];
        n9 = this.p[n2] & 0xF;
        if ((n6 & 1) != 0) {
            n9 = s[n9 & 7] | n9 & 0xFFFFFFF8;
            n7 = -n7;
        }
        if ((n6 & 2) != 0) {
            n9 = t[n9 & 7] | n9 & 0xFFFFFFF8;
            n10 = -n10;
        }
        if ((n6 & 4) != 0) {
            n9 = u[n9 & 7] | n9 & 0xFFFFFFF8;
            n2 = n7;
            n7 = -n10;
            n10 = n2;
        }
        if (j.b(13)) {
            n2 = j.o();
            n6 = j.p();
            n7 = n2 * n7 / 100;
            n10 = n6 * n10 / 100;
        }
        this.a(graphics, n3, n4 + n7, n5 + n10, n9, 0, 0);
    }

    final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        this.a(graphics, n2, n3, n4, n5, 0, 0);
    }

    final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(graphics, n2, n3, n4, n5, n6, n7);
    }

    final void b(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        n8 = this.d(n2);
        if (n8 > 0) {
            block8: for (int i2 = 0; i2 < n8; ++i2) {
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                short s2;
                int n15 = n7;
                int n16 = n6;
                int n17 = n5;
                int n18 = n4;
                int n19 = n3;
                int n20 = i2;
                int n21 = n2;
                Graphics graphics2 = graphics;
                e e2 = this;
                n21 = e2.i[n21] + n20;
                n20 = e2.h[n21] & 0xFF;
                int n22 = e2.g[n21] & 0xFF;
                if ((e2.A & 0x4000) != 0 && (e2.C & 0x10) == 0) {
                    e2.B = e2.i[n21] & 0xFF;
                }
                int n23 = n22;
                if ((n20 & 0x10) == 0 && e2.z >= 0) {
                    n22 = e2.c[e2.z][n22];
                }
                int n24 = 0;
                int n25 = 0;
                if ((n20 & 0x10) == 0) {
                    n24 = e2.f(n22);
                    n25 = e2.g(n22);
                }
                int n26 = n24;
                int n27 = n25;
                int n28 = n21;
                e e3 = e2;
                int n29 = e3.n[n28];
                n28 = n21;
                e3 = e2;
                int n30 = e3.o[n28];
                if ((n20 & 4) != 0) {
                    n21 = n24;
                    n24 = n25;
                    n25 = n21;
                }
                if ((n17 & 1) != 0) {
                    n20 = s[n20 & 7] | n20 & 0xFFFFFFF8;
                    n29 = -n29 - n24;
                }
                if ((n17 & 2) != 0) {
                    n20 = t[n20 & 7] | n20 & 0xFFFFFFF8;
                    n30 = -n30 - n25;
                }
                if ((n17 & 4) != 0) {
                    n20 = u[n20 & 7] | n20 & 0xFFFFFFF8;
                    n21 = n29;
                    n29 = -n30 - n25;
                    n30 = n21;
                }
                if (j.b(13) && x != 1) {
                    n21 = j.o();
                    n17 = j.p();
                    n29 = n21 * n29 / 100;
                    n30 = n17 * n30 / 100;
                }
                n19 += n29;
                n18 += n30;
                if ((n20 & 0x10) != 0) {
                    e2.a(graphics2, n22, n19, n18, n20 & 0xF, n16, n15);
                    continue;
                }
                int n31 = n19;
                int n32 = n18;
                n16 = n27;
                n17 = n26;
                n18 = n20 & 0xF;
                n19 = n32;
                n20 = n31;
                n21 = n23;
                e.b[0] = n17;
                e.b[1] = n16;
                int[] nArray = b;
                n16 = n20;
                n15 = n19;
                if (e2.z >= 0) {
                    n21 = e2.c[e2.z][n21];
                }
                n22 = nArray[0];
                n17 = nArray[1];
                n23 = n22;
                n29 = n17;
                n30 = n23;
                n24 = n29;
                if ((n18 & 4) != 0) {
                    n25 = n23;
                    n23 = n29;
                    n29 = n25;
                }
                if (e2.e(n21) != 0 && graphics2 != null) {
                    graphics2.setColor(e2.v[n21]);
                    if (j.b(13)) {
                        n25 = j.o();
                        n26 = j.p();
                        n23 = n23 * n25 / 100;
                        n29 = n29 * n26 / 100;
                    }
                    switch (e2.s[n21]) {
                        case 2: {
                            if ((e2.v[n21] & 0xFF000000) == -16777216 || (e2.v[n21] & 0xFF000000) == 0) {
                                j.c(graphics2, n20, n19, n23, n29);
                                break;
                            }
                            j.g(e2.v[n21]);
                            j.e(graphics2, n20, n19, n23, n29);
                            break;
                        }
                        case 1: {
                            j.d(graphics2, n20, n19, --n23, --n29);
                            break;
                        }
                        case 3: 
                        case 4: {
                            n25 = e2.j(n21);
                            if (n25 == -1) continue block8;
                            n26 = e2.f[n25];
                            n17 = e2.f[n25 + 1];
                            if ((n18 & 1) != 0) {
                                n26 = 90 - n26;
                            }
                            if ((n18 & 2) != 0) {
                                n26 = -n26;
                                n17 = -n17;
                            }
                            if ((n18 & 4) != 0) {
                                n26 -= 90;
                            }
                            if (e2.s[n21] == 3) {
                                j.b(graphics2, n20, n19, n23, n29, n26, n17);
                                break;
                            }
                            j.a(graphics2, n20, n19, n23, n29, n26, n17);
                            break;
                        }
                        case 6: 
                        case 7: {
                            n25 = e2.j(n21);
                            if (n25 == -1) continue block8;
                            n26 = e2.f[n25];
                            n17 = e2.f[n25 + 1];
                            n27 = e2.f[n25 + 2];
                            int n33 = e2.f[n25 + 3];
                            if ((n18 & 1) != 0) {
                                n26 = -n26;
                                n27 = -n27;
                                n20 += j.e(n26) > j.e(n27) ? j.e(n26) : j.e(n27);
                            }
                            if ((n18 & 2) != 0) {
                                n17 = -n17;
                                n33 = -n33;
                                n19 += j.e(n17) > j.e(n33) ? j.e(n17) : j.e(n33);
                            }
                            if ((n18 & 4) != 0) {
                                int n34 = j.e(n17) > j.e(n33) ? j.e(n17) : j.e(n33);
                                int n35 = n19 - n15;
                                n19 = n15 + (n20 - n16);
                                n20 = n16 - n35 + n34;
                                int n36 = n26;
                                n26 = -n17;
                                n17 = n36;
                                n36 = n27;
                                n27 = -n33;
                                n33 = n36;
                            }
                            if (e2.s[n21] == 6) {
                                j.b(graphics2, n20, n19, n20 + n26, n19 + n17);
                                j.b(graphics2, n20 + n26, n19 + n17, n20 + n27, n19 + n33);
                                j.b(graphics2, n20, n19, n20 + n27, n19 + n33);
                                break;
                            }
                            j.c(graphics2, n20, n19, n20 + n26, n19 + n17, n20 + n27, n19 + n33);
                            break;
                        }
                        case 8: {
                            n25 = n20;
                            n26 = n20 + n23;
                            n17 = n19;
                            n27 = n19 + n29;
                            if ((n18 & 1) != 0) {
                                n25 = n26;
                                n26 = n16;
                            }
                            if ((n18 & 2) != 0) {
                                n17 = n27;
                                n27 = n15;
                            }
                            if ((n18 & 4) != 0) {
                                int n37 = n25;
                                n25 = n26;
                                n26 = n37;
                            }
                            j.b(graphics2, n25, n17, n26, n27);
                            break;
                        }
                        case 9: {
                            n25 = e2.j(n21);
                            if (n25 != -1) {
                                n26 = e2.v[n21];
                                n17 = e2.f[n25] & 0xFFFF;
                                n17 |= e2.f[n25 + 1] << 16 & 0xFFFF0000;
                                n27 = e2.f[n25 + 2];
                                n15 = n23;
                                int n38 = n29;
                                if ((n18 & 1) != 0 && n27 < 2) {
                                    int n39 = n26;
                                    n26 = n17;
                                    n17 = n39;
                                }
                                if ((n18 & 2) != 0 && n27 > 1) {
                                    int n40 = n26;
                                    n26 = n17;
                                    n17 = n40;
                                }
                                n27 = n27 == 0 ? 4 : (n27 == 1 ? 8 : (n27 == 2 ? 16 : 32));
                                if ((n18 & 4) != 0) {
                                    if (n27 == 4) {
                                        n27 = 16;
                                    } else if (n27 == 8) {
                                        n27 = 32;
                                    } else if (n27 == 16) {
                                        n27 = 8;
                                    } else if (n27 == 32) {
                                        n27 = 4;
                                    }
                                }
                                j.a(graphics2, n20, n19, n15, n38, n26, n17, n27);
                            } else {
                                break;
                            }
                        }
                    }
                    continue;
                }
                if (x == 1) {
                    if ((n18 & 4) != 0) {
                        n25 = n23;
                        n23 = n29;
                        n29 = n25;
                    }
                    if (e2.e(n21) == 5) {
                        n20 -= n23 >> 1;
                        n19 -= n29 >> 1;
                    }
                    if (n20 < E) {
                        E = n20;
                    }
                    if (n19 < F) {
                        F = n19;
                    }
                    if (n20 + n23 > G) {
                        G = n20 + n23;
                    }
                    if (n19 + n29 <= H) continue;
                    H = n19 + n29;
                    continue;
                }
                if (n23 <= 0 || n29 <= 0) continue;
                if (j.a(graphics2)) {
                    boolean bl = e.a(graphics2, n20, n19, n23, n29);
                    n25 = bl ? 1 : 0;
                    if (!bl) continue;
                }
                int[] nArray2 = null;
                Image image = null;
                if ((e2.A & 0x20000000) != 0) {
                    if ((n18 & 4) != 0) {
                        n27 = n23;
                        n23 = n29;
                        n29 = n27;
                    }
                    if ((e2.A & 0x20000000) != 0) {
                        if ((e2.C & 1) != 0) {
                            if (e2.b == null || e2.b[e2.B] == null) {
                                e2.a(e2.B, 0, 0, 0);
                            }
                            s2 = 0;
                            n14 = 0;
                            n13 = 0;
                            n12 = n29;
                            n11 = n23;
                            n10 = n19;
                            n9 = n20;
                            int[] nArray3 = e2.b[e2.B][0];
                            e3 = e2;
                            if (nArray3 != null) {
                                j.a(graphics2, e2.b[e2.B][0], 0, n23, n20, n19, n23, n29, e2.j, e2.k, 0);
                            }
                        } else {
                            if (e2.a == null || e2.a[e2.B] == null) {
                                e2.a(e2.B, 0, 0, 0);
                            }
                            n27 = 0;
                            short s3 = 0;
                            if ((e2.A & 0x20) != 0) {
                                n27 = e2.b[n21];
                                s3 = e2.c[n21];
                            }
                            n16 = e2.h(n21);
                            e3 = e2;
                            n15 = e3.B;
                            image = e2.a[n15][n16];
                            if (j.i && j.n() != 0) {
                                n15 = e2.j ? 1 : 0;
                                int[] nArray4 = e.a(null);
                                j.a(image, nArray4, 0, n23, n27, (int)s3, n23, n29);
                                int[] nArray5 = j.a(graphics2, nArray4, n20, n19, n30, n24, n18, n15 != 0, e2.k);
                                if (nArray5 == null) continue;
                                n23 = j.bE;
                                n29 = j.bF;
                                n18 = 0;
                                n30 = n23;
                                n24 = n29;
                                Image image2 = j.a(nArray5, n23, n29, n15 != 0);
                                graphics2.drawImage(image2, n20, n19, 0);
                            } else {
                                s2 = s3;
                                n14 = n27;
                                n13 = r[n18 & 7];
                                n12 = n29;
                                n11 = n23;
                                n10 = n19;
                                n9 = n20;
                                Image image3 = image;
                                e3 = e2;
                                if (image3 != null) {
                                    graphics2.drawRegion(image, n27, (int)s3, n23, n29, r[n18 & 7], n20, n19, 0);
                                }
                            }
                        }
                    }
                }
                if ((e2.A & 0x1000008) == 0) continue;
                if (e2.a != null && e2.a[e2.B] != null) {
                    image = e2.a[e2.B][n21];
                }
                if (e2.b != null && e2.b[e2.B] != null) {
                    nArray2 = e2.b[e2.B][n21];
                }
                n27 = e2.j ? 1 : 0;
                if ((e2.C & 1) != 0) {
                    if (nArray2 == null) {
                        nArray2 = e2.b(n21);
                    }
                    if (j.i && j.n() != 0) {
                        if ((nArray2 = j.a(graphics2, nArray2, n20, n19, n30, n24, n18, n27 != 0, e2.k)) == null) continue;
                        n27 = j.j ? 1 : 0;
                        n23 = j.bE;
                        n29 = j.bF;
                        Image image4 = j.a(nArray2, n23, n29, n27 != 0);
                        graphics2.drawImage(image4, n20, n19, 0);
                        continue;
                    }
                    s2 = 0;
                    n14 = 0;
                    n13 = n18;
                    n12 = n29;
                    n11 = n23;
                    n10 = n19;
                    n9 = n20;
                    int[] nArray6 = nArray2;
                    e3 = e2;
                    if (!(nArray6 != null)) continue;
                    j.a(graphics2, nArray2, 0, n30, n20, n19, n30, n24, n27 != 0, n27 != 0, n18, e2.I, true);
                    continue;
                }
                if (image == null) {
                    int[] nArray7 = nArray2;
                    if (nArray2 == null) {
                        nArray7 = e2.b(n21);
                    }
                    if (nArray7 == null) continue;
                    if (j.i && j.n() != 0) {
                        if ((nArray7 = j.a(graphics2, nArray7, n20, n19, n30, n24, n18, n27 != 0, e2.k)) == null) continue;
                        n27 = j.j ? 1 : 0;
                        n23 = j.bE;
                        n29 = j.bF;
                        Image image5 = j.a(nArray7, n23, n29, n27 != 0);
                        graphics2.drawImage(image5, n20, n19, 0);
                        continue;
                    }
                    if (e2.g >= 0) {
                        if (e2.a == null) {
                            e2.a = new Image[e2.b][];
                            for (int i3 = 0; i3 < e2.b; ++i3) {
                                e2.a[i3] = new Image[e2.y];
                            }
                        }
                        image = (n18 & 4) != 0 ? j.a(nArray7, n29, n23, e2.j) : j.a(nArray7, n23, n29, e2.j);
                        e2.a(n21, image);
                        s2 = 0;
                        n14 = 0;
                        n13 = r[n18 & 7];
                        n12 = n29;
                        n11 = n23;
                        n10 = n19;
                        n9 = n20;
                        Image image6 = image;
                        e3 = e2;
                        if (!(image6 != null)) continue;
                        if (r[n18 & 7] == 0) {
                            graphics2.drawImage(image, n20, n19, 0);
                            continue;
                        }
                        if ((n18 & 4) != 0) {
                            graphics2.drawRegion(image, 0, 0, n29, n23, r[n18 & 7], n20, n19, 0);
                            continue;
                        }
                        graphics2.drawRegion(image, 0, 0, n23, n29, r[n18 & 7], n20, n19, 0);
                        continue;
                    }
                    j.a(graphics2, nArray7, 0, n30, n20, n19, n30, n24, n27 != 0, n27 != 0, n18);
                    continue;
                }
                if (j.i && j.n() != 0) {
                    int[] nArray8 = j.a(graphics2, image, n20, n19, n30, n24, n18, n27 != 0, e2.k);
                    if (nArray8 == null) continue;
                    n27 = j.j ? 1 : 0;
                    n23 = j.bE;
                    n29 = j.bF;
                    Image image7 = j.a(nArray8, n23, n29, n27 != 0);
                    graphics2.drawImage(image7, n20, n19, 0);
                    continue;
                }
                n23 = n22;
                n29 = n17;
                e2.a(n21, image);
                s2 = 0;
                n14 = 0;
                n13 = r[n18 & 7];
                n12 = n29;
                n11 = n23;
                n10 = n19;
                n9 = n20;
                Image image8 = image;
                e3 = e2;
                if (!(image8 != null)) continue;
                if (r[n18 & 7] == 0) {
                    graphics2.drawImage(image, n20, n19, 0);
                    continue;
                }
                graphics2.drawRegion(image, 0, 0, n23, n29, r[n18 & 7], n20, n19, 0);
            }
        }
    }

    final void a(int n2, int n3, int n4, int n5) {
        int n6;
        this.h(n2);
        if (this.y == 0) {
            return;
        }
        if (n4 == -1) {
            n4 = this.y - 1;
        }
        if ((this.A & 0x1000008) != 0) {
            if (n5 >= 0) {
                for (n3 = 0; n3 <= n4; ++n3) {
                    if ((this.C & 1) != 0) {
                        this.b[n2][n3] = this.b[n5][n3];
                        continue;
                    }
                    this.a[n2][n3] = this.a[n5][n3];
                }
            } else {
                n3 = this.B;
                this.B = n2;
                if (l) {
                    System.gc();
                }
                for (n5 = 0; n5 <= n4; ++n5) {
                    int n7;
                    int[] nArray;
                    if (this.e(n5) != 0) continue;
                    int n8 = this.f(n5);
                    n6 = this.g(n5);
                    if (n8 <= 0 || n6 <= 0 || (nArray = this.b(n5)) == null) continue;
                    if (j.i && j.n() != 0) {
                        n7 = this.j;
                        nArray = j.a(null, nArray, 0, 0, n8, n6, 0, n7 != 0, this.k, false);
                        n8 = j.bG;
                        n6 = j.bH;
                    }
                    int n9 = n5;
                    int n10 = n2;
                    n7 = n6;
                    int n11 = n8;
                    int[] nArray2 = nArray;
                    e e2 = this;
                    int n12 = n11 * n7;
                    if ((e2.C & 1) != 0) {
                        if (e2.b[n10][n9] == null || e2.b[n10][n9].length != n12) {
                            e2.b[n10][n9] = new int[n12];
                        }
                        System.arraycopy(nArray2, 0, e2.b[n10][n9], 0, n12);
                        continue;
                    }
                    boolean bl = false;
                    for (int i2 = 0; i2 < n12; ++i2) {
                        if ((nArray2[i2] & 0xFF000000) == -16777216) continue;
                        bl = true;
                        break;
                    }
                    e2.a[n10][n9] = j.a(nArray2, n11, n7, bl);
                }
                if (l) {
                    System.gc();
                }
                this.B = n3;
            }
        }
        if ((this.A & 0x20000000) != 0) {
            try {
                if ((this.C & 1) != 0) {
                    if (this.b[n2] == null) {
                        this.b[n2] = new int[1][];
                    }
                } else if (this.a[n2] == null) {
                    this.a[n2] = (this.A & 0x40000000) != 0 ? new Image[this.a] : new Image[1];
                }
                n6 = 0;
                e e3 = this;
                byte[] byArray = e3.q;
                if ((this.A & 0x40000000) != 0) {
                    for (n4 = 0; n4 < this.a; ++n4) {
                        n6 = n4;
                        e e4 = this;
                        n5 = e4.j[n6] * 3 + 4;
                        n6 = n4;
                        e4 = this;
                        int n13 = e4.j[n6] + 4;
                        System.arraycopy(this.b[n4], n2 * (n5 + n13), this.a[n4], 41, n5);
                        System.arraycopy(this.b[n4], n2 * (n5 + n13) + n5, this.a[n4], n5 + 41 + 8, n13);
                    }
                } else {
                    n6 = 0;
                    e3 = this;
                    n4 = e3.j[n6] * 3 + 4;
                    n6 = 0;
                    e3 = this;
                    n5 = e3.j[n6] + 4;
                    System.arraycopy(this.r, n2 * (n4 + n5), byArray, 41, n4);
                    System.arraycopy(this.r, n2 * (n4 + n5) + n4, byArray, n4 + 41 + 8, n5);
                }
                if ((this.C & 1) != 0) {
                    this.b[n2][0] = new int[byArray.length];
                    System.arraycopy(byArray, 0, this.b[n2][0], 0, byArray.length);
                } else if ((this.A & 0x40000000) != 0) {
                    for (n4 = 0; n4 < this.a; ++n4) {
                        this.a[n2][n4] = j.a(this.a[n4], 0, this.a[n4].length);
                    }
                } else {
                    this.a[n2][0] = j.a(byArray, 0, byArray.length);
                }
            }
            catch (Exception exception) {}
        }
        if (l) {
            System.gc();
        }
    }

    private void h(int n2) {
        if ((this.C & 1) != 0) {
            if (this.b == null) {
                this.b = new int[this.b][][];
            }
            if (this.b[n2] == null) {
                this.b[n2] = new int[this.y][];
                return;
            }
        } else {
            if (this.a == null) {
                this.a = new Image[this.b][];
            }
            if (this.a[n2] == null) {
                this.a[n2] = new Image[this.y];
            }
        }
    }

    final void c() {
        if ((this.C & 1) != 0) {
            if (this.b != null) {
                for (int i2 = 0; i2 < this.b.length; ++i2) {
                    if (this.b[i2] == null) continue;
                    for (int i3 = 0; i3 < this.b[i2].length; ++i3) {
                        this.b[i2][i3] = null;
                    }
                    this.b[i2] = null;
                }
                this.b = null;
                return;
            }
        } else if (this.a != null) {
            for (int i4 = 0; i4 < this.a.length; ++i4) {
                this.a[i4] = null;
            }
            this.a = null;
        }
    }

    private int j(int n2) {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.length; i2 += 2) {
                if (this.g[i2] != n2) continue;
                return this.g[i2 + 1];
            }
        }
        return -1;
    }

    private static int a(byte[] byArray, int n2, int n3, int n4) {
        n4 ^= 0xFFFFFFFF;
        while (n3-- != 0) {
            n4 = c[(n4 ^ byArray[n2++]) & 0xFF] ^ n4 >>> 8;
        }
        return ~n4;
    }

    static void a(int n2) {
        a = new short[n2][];
        a = new e[n2][];
        d = new int[n2];
        e = new int[n2];
    }

    static void a(int n2, int n3) {
        e.e[n2] = n3;
        e.a[n2] = new short[n3];
        e.a[n2] = new e[n3];
        for (n3 = 0; n3 < a[n2].length; ++n3) {
            e.a[n2][n3] = -1;
        }
    }

    static void b(int n2) {
        e.a[n2] = null;
        e.a[n2] = null;
        e.d[n2] = 0;
        e.e[n2] = 0;
    }

    final void c(int n2) {
        this.g = n2;
        if ((this.C & 1) != 0) {
            if (this.b == null) {
                this.b = new int[this.b][][];
                for (n2 = 0; n2 < this.b; ++n2) {
                    this.b[n2] = new int[this.y][];
                }
                return;
            }
        } else if (this.a == null) {
            this.a = new Image[this.b][];
            for (n2 = 0; n2 < this.b; ++n2) {
                this.a[n2] = new Image[this.y];
            }
        }
    }

    private final void a(int n2, Object object) {
        block10: {
            e e2;
            e e3;
            block12: {
                block11: {
                    boolean bl = false;
                    e3 = this;
                    if (e3.g < 0) break block10;
                    if ((e3.C & 1) == 0) break block11;
                    if (e3.b[e3.B][n2] != null) {
                        return;
                    }
                    break block12;
                }
                if (e3.a[e3.B][n2] != null) break block10;
            }
            int n3 = d[e3.g];
            short s2 = a[e3.g][n3];
            int n4 = s2 >> 10;
            int n5 = s2 & 0x3FF;
            if (s2 >= 0 && (e2 = a[e3.g][n3]) != null) {
                if ((e3.C & 1) != 0) {
                    e2.b[n4][n5] = null;
                } else {
                    e2.a[n4][n5] = null;
                }
            }
            e.a[e3.g][n3] = s2 = (short)((n2 & 0x3FF) + (e3.B << 10));
            e.a[e3.g][n3] = e3;
            e.d[e3.g] = (d[e3.g] + 1) % e[e3.g];
            if ((e3.C & 1) != 0) {
                if (e3.b[e3.B][n2] == null || e3.b[e3.B][n2].length != 0) {
                    e3.b[e3.B][n2] = new int[0];
                }
                System.arraycopy((int[])object, 0, e3.b[e3.B][n2], 0, 0);
                return;
            }
            e3.a[e3.B][n2] = (Image)object;
        }
    }

    final void d() {
    }

    private int[] b(int n2) {
        if (this.a(n2)) {
            int n3;
            int n4 = n3 = this.h(n2);
            n3 = n2;
            e e2 = this;
            if (this.a(n4, e2.q, this.i(n2), this.f(n2), this.g(n2))) {
                return a;
            }
        }
        return null;
    }

    private boolean a(int n2, byte[] byArray, int n3, int n4, int n5) {
        block23: {
            int n6;
            Object object;
            Object object2;
            int n7;
            block29: {
                block28: {
                    block27: {
                        block26: {
                            block25: {
                                block24: {
                                    block22: {
                                        n7 = 0;
                                        n4 *= n5;
                                        if (a == null) {
                                            a = new int[100000];
                                        }
                                        object2 = null;
                                        object2 = this;
                                        int[] nArray = (int[])this.a(n2, ((e)object2).B);
                                        object2 = nArray;
                                        if (nArray == null) {
                                            return false;
                                        }
                                        object = false;
                                        if (this.b != 25840) break block22;
                                        while (n7 < n4) {
                                            int n8 = byArray[n3++] & 0xFF;
                                            object = object2[n8 & this.k[n2]];
                                            n8 >>= this.l[n2];
                                            while (n8-- >= 0) {
                                                e.a[n7++] = object;
                                            }
                                        }
                                        break block23;
                                    }
                                    if (this.b != 10225) break block24;
                                    while (n7 < n4) {
                                        int n9;
                                        if ((n9 = byArray[n3++] & 0xFF) > 127) {
                                            int n10 = byArray[n3++] & 0xFF;
                                            object = object2[n10];
                                            n9 -= 128;
                                            while (n9-- > 0) {
                                                e.a[n7++] = object;
                                            }
                                            continue;
                                        }
                                        e.a[n7++] = (int)object2[n9];
                                    }
                                    break block23;
                                }
                                if (this.b != 22258) break block25;
                                --n3;
                                --n7;
                                --n4;
                                while (n7 < n4) {
                                    int n11;
                                    if ((n11 = byArray[++n3]) < 0) {
                                        n11 += 128;
                                        do {
                                            e.a[++n7] = (int)object2[byArray[++n3] & 0xFF];
                                        } while (--n11 > 0);
                                        continue;
                                    }
                                    object = object2[byArray[++n3] & 0xFF];
                                    do {
                                        e.a[++n7] = object;
                                    } while (--n11 > 0);
                                }
                                break block23;
                            }
                            if (this.b != 5632) break block26;
                            n4 += (n4 & 1) == 0 ? 0 : 2;
                            n4 >>= 1;
                            while (--n4 >= 0) {
                                byte by = byArray[n3++];
                                e.a[n7++] = (int)object2[by >> 4 & 0xF];
                                e.a[n7++] = (int)object2[by & 0xF];
                            }
                            break block23;
                        }
                        if (this.b != 1024) break block27;
                        n4 += (n4 & 3) == 0 ? 0 : 4;
                        n4 >>= 2;
                        while (--n4 >= 0) {
                            byte by = byArray[n3++];
                            e.a[n7++] = (int)object2[by >> 6 & 3];
                            e.a[n7++] = (int)object2[by >> 4 & 3];
                            e.a[n7++] = (int)object2[by >> 2 & 3];
                            e.a[n7++] = (int)object2[by & 3];
                        }
                        break block23;
                    }
                    if (this.b != 512) break block28;
                    n4 += (n4 & 7) == 0 ? 0 : 8;
                    n4 >>= 3;
                    while (--n4 >= 0) {
                        byte by = byArray[n3++];
                        e.a[n7++] = (int)object2[by >> 7 & 1];
                        e.a[n7++] = (int)object2[by >> 6 & 1];
                        e.a[n7++] = (int)object2[by >> 5 & 1];
                        e.a[n7++] = (int)object2[by >> 4 & 1];
                        e.a[n7++] = (int)object2[by >> 3 & 1];
                        e.a[n7++] = (int)object2[by >> 2 & 1];
                        e.a[n7++] = (int)object2[by >> 1 & 1];
                        e.a[n7++] = (int)object2[by & 1];
                    }
                    break block23;
                }
                if (this.b != 22018) break block29;
                while (--n4 >= 0) {
                    e.a[n7++] = (int)object2[byArray[n3++] & 0xFF];
                }
                break block23;
            }
            if (this.b != -23978) break block23;
            while (n7 < n4) {
                if ((n6 = byArray[n3++] & 0xFF) > 127) {
                    n6 -= 128;
                    while (n6-- > 0) {
                        e.a[n7++] = (int)object2[byArray[n3++] & 0xFF];
                    }
                    continue;
                }
                object = object2[byArray[n3++] & 0xFF];
                while (n6-- > 0) {
                    e.a[n7++] = object;
                }
            }
            n7 = 0;
            while (n7 < n4) {
                if ((n6 = byArray[n3++] & 0xFF) == 254) {
                    int n12 = byArray[n3++] & 0xFF;
                    n6 = byArray[n3++] & 0xFF;
                    while (n12-- > 0) {
                        e.a[n7] = n6 << 24 | a[n7] & 0xFFFFFF;
                        ++n7;
                    }
                    continue;
                }
                e.a[n7] = n6 << 24 | a[n7] & 0xFFFFFF;
                ++n7;
            }
        }
        return true;
    }

    static final int a() {
        return a;
    }

    final void a(short[] sArray) {
        int n2;
        this.a = sArray[0];
        this.b = new short[this.a][];
        int n3 = 1;
        for (n2 = 0; n2 < this.a; ++n2) {
            this.b[n2] = new short[2];
            this.b[n2][0] = sArray[n3++];
            this.b[n2][1] = sArray[n3++];
        }
        n2 = n3;
        while (n2 < sArray.length) {
            n3 = sArray[n2++];
            int n4 = sArray[n2++];
            short[] sArray2 = new short[(n4 << 1) + 2];
            short[] sArray3 = sArray2;
            sArray2[0] = this.b[n3][0];
            sArray3[1] = this.b[n3][1];
            for (int i2 = 0; i2 < n4; ++i2) {
                sArray3[(i2 << 1) + 2] = sArray[n2++];
                sArray3[(i2 << 1) + 3] = sArray[n2++];
            }
            this.b[n3] = sArray3;
        }
        v1.q = -this.g(0, 0);
        int n5 = this.g(0, 1);
        this.l = this.q + n5;
        e e2 = this;
        this.m = e2.g(0, 2) - e2.g(0, 1);
        e2 = this;
        this.o = e2.f(e2.k(32), 0);
    }

    private int k(int n2) {
        int n3;
        if (this.b == null) {
            return 0;
        }
        int n4 = n2 % this.a;
        if (this.b[n4][0] == n2) {
            return this.b[n4][1];
        }
        int n5 = this.b[n4].length;
        for (n3 = 2; n3 < n5 && this.b[n4][n3] != n2; n3 += 2) {
        }
        if (n3 >= n5) {
            return 1;
        }
        return this.b[n4][n3 + 1];
    }

    final int b() {
        if (this.r >= 0) {
            return this.m * this.r >> 8;
        }
        return this.m;
    }

    final int c() {
        if (this.r >= 0) {
            return this.l * this.r >> 8;
        }
        return this.l;
    }

    final int d() {
        if (this.r >= 0) {
            return this.o * this.r >> 8;
        }
        return this.o;
    }

    private int h() {
        if (this.r >= 0) {
            return this.n * this.r >> 8;
        }
        return this.n;
    }

    final void d(int n2) {
        this.n = 1;
    }

    final int e() {
        if (this.r >= 0) {
            return this.l * this.r >> 8;
        }
        return this.l;
    }

    private static final int a(short[] sArray, int n2) {
        n2 = (n2 << 1) + 1;
        return sArray[n2];
    }

    private static final int b(short[] sArray, int n2) {
        n2 = (n2 << 1) + 2;
        return sArray[n2];
    }

    final short[] a(String string, int n2, int n3) {
        return this.a(string, n2, false);
    }

    final short[] a(String string, int n2, boolean bl) {
        if (a == null) {
            a = new short[100];
        }
        int n3 = string.length();
        short s2 = 0;
        int n4 = 1;
        short s3 = 0;
        boolean bl2 = this.h;
        boolean bl3 = false;
        short s4 = 0;
        boolean bl4 = this.h;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = string.charAt(i2);
            if (n5 == 32 || n5 == a) {
                if (n5 == 32) {
                    s2 = (short)(s2 + (short)this.d());
                }
                s3 = (short)i2;
                bl2 = bl4;
                bl3 = true;
                s4 = 0;
                if (s2 <= n2 || bl) continue;
                bl3 = false;
                for (n5 = (int)s3; n5 >= 0 && (string.charAt(n5) == ' ' || string.charAt(n5) == a); --n5) {
                    if (string.charAt(n5) != ' ') continue;
                    s2 = (short)(s2 - (short)this.d());
                }
                while (s3 < n3 && (string.charAt(s3) == ' ' || string.charAt(s3) == a)) {
                    s3 = (short)(s3 + 1);
                }
                s3 = (short)(s3 - 1);
                i2 = s3;
                bl4 = bl2;
                int n6 = n4;
                n4 = (short)(n4 + 1);
                e.a[n6] = (short)(s3 + 1);
                int n7 = n4;
                n4 = (short)(n4 + 1);
                e.a[n7] = s2;
                s2 = 0;
                continue;
            }
            if (n5 == 92) {
                if ((n5 = string.charAt(++i2)) != 94) continue;
                bl4 = !bl4;
                continue;
            }
            if (n5 == 10) {
                int n8 = n4;
                n4 = (short)(n4 + 1);
                e.a[n8] = (short)i2;
                int n9 = n4;
                n4 = (short)(n4 + 1);
                e.a[n9] = s2;
                s2 = 0;
                s4 = 0;
                continue;
            }
            if (n5 < 32) {
                if (n5 == 1) {
                    ++i2;
                    continue;
                }
                if (n5 != 2) continue;
                n5 = string.charAt(++i2);
            } else {
                n5 = this.k(n5);
            }
            if (n5 > this.g()) {
                n5 = 0;
            }
            n5 = this.l(n5) + this.h();
            if (bl4) {
                ++n5;
            }
            s4 = (short)(s4 + (short)n5);
            if ((s2 = (short)(s2 + (short)n5)) <= n2) continue;
            boolean bl5 = bl || !bl3;
            if (bl5) {
                s2 = (short)(s2 - (short)n5);
                s3 = (short)(i2 - 1);
            }
            bl3 = false;
            for (i2 = (int)s3; i2 >= 0 && (string.charAt(i2) == ' ' || string.charAt(i2) == a); --i2) {
                if (string.charAt(i2) != ' ') continue;
                s2 = (short)(s2 - (short)this.d());
            }
            if (bl5) {
                bl2 = bl4;
                s4 = 0;
            }
            int n10 = n4;
            n4 = (short)(n4 + 1);
            e.a[n10] = (short)(s3 + 1);
            int n11 = n4;
            n4 = (short)(n4 + 1);
            e.a[n11] = (short)(s2 - s4);
            s2 = 0;
            i2 = s3;
            bl4 = bl2;
        }
        int n12 = n4;
        n4 = (short)(n4 + 1);
        e.a[n12] = (short)n3;
        int n13 = n4;
        n4 = (short)(n4 + 1);
        e.a[n13] = s2;
        e.a[0] = (short)(n4 / 2);
        return a;
    }

    final String a(String string, int n2) {
        String string2 = "";
        Object object = 0;
        boolean bl = false;
        int n3 = n2;
        String string3 = string;
        Object object2 = this;
        object2 = ((e)object2).a(string3, n3, false);
        for (int i2 = 0; i2 < object2[0]; ++i2) {
            if (object != 0 && (object >= string.length() || string.charAt((int)object) != '\n')) {
                string2 = string2 + "\n";
            }
            string2 = string2 + string.substring((int)object, (int)object2[(i2 << 1) + 1]);
            object = object2[(i2 << 1) + 1];
        }
        return string2;
    }

    final void a(Graphics graphics, String string, short[] sArray, int n2, int n3, int n4, int n5, int n6) {
        this.a(graphics, string, sArray, n2, n3, n4, n5, n6, -1, false);
    }

    final void a(Graphics graphics, String string, short[] sArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(graphics, string, sArray, n2, n3, n4, n5, n6, n7, false);
    }

    private void a(Graphics graphics, String string, short[] sArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean n8) {
        int n9 = sArray[0];
        int n10 = this.e();
        if (n5 == -1) {
            n5 = n9;
        }
        if (n4 + n5 > n9) {
            n5 = n9 - n4;
        }
        n10 = this.b() + n10;
        if ((n6 & 0x20) != 0) {
            n3 -= n10 * (n5 - 1);
        } else if ((n6 & 2) != 0) {
            n3 -= n10 * (n5 - 1) >> 1;
        }
        j = this.B;
        if (n7 >= 0) {
            u = n4 > 0 ? e.a(sArray, n4 - 1) : 0;
            u = u + n7;
        }
        n7 = j.b(graphics);
        int n11 = n7 + j.d(graphics);
        n7 -= n10;
        n11 += n10;
        int n12 = 0;
        if (n8 != 0) {
            for (n8 = n9 - 1; n8 >= n4 && n12 <= n5 - 1; --n8, ++n12) {
                s = n8 > 0 ? e.a(sArray, n8 - 1) : 0;
                t = e.a(sArray, n8);
                if (s < string.length() && string.charAt(s) == '\n') {
                    ++s;
                }
                int n13 = n2;
                int n14 = n3 + n12 * n10;
                if (n14 < n7) continue;
                if (n14 > n11) break;
                if ((n6 & 0x2B) != 0) {
                    if (this.r >= 0) {
                        if ((n6 & 8) != 0) {
                            n13 = n2 - (e.b(sArray, n8) * this.r >> 8);
                        } else if ((n6 & 1) != 0) {
                            n13 = n2 - (e.b(sArray, n8) * this.r >> 9);
                        }
                    } else if ((n6 & 8) != 0) {
                        n13 = n2 - e.b(sArray, n8);
                    } else if ((n6 & 1) != 0) {
                        n13 = n2 - (e.b(sArray, n8) >> 1);
                    }
                    if ((n6 & 0x20) != 0) {
                        n14 -= this.e();
                    } else if ((n6 & 2) != 0) {
                        n14 -= this.e() >> 1;
                    }
                }
                this.a(graphics, string, n13, n14, 0, false);
            }
        } else {
            for (n8 = n4; n8 < n9 && n12 <= n5 - 1; ++n8, ++n12) {
                s = n8 > 0 ? e.a(sArray, n8 - 1) : 0;
                t = e.a(sArray, n8);
                if (s < string.length() && string.charAt(s) == '\n') {
                    ++s;
                }
                int n15 = n2;
                int n16 = n3 + n12 * n10;
                if (n16 < n7) continue;
                if (n16 <= n11) {
                    if ((n6 & 0x2B) != 0) {
                        if (this.r >= 0) {
                            if ((n6 & 8) != 0) {
                                n15 = n2 - (e.b(sArray, n8) * this.r >> 8);
                            } else if ((n6 & 1) != 0) {
                                n15 = n2 - (e.b(sArray, n8) * this.r >> 9);
                            }
                        } else if ((n6 & 8) != 0) {
                            n15 = n2 - e.b(sArray, n8);
                        } else if ((n6 & 1) != 0) {
                            n15 = n2 - (e.b(sArray, n8) >> 1);
                        }
                        if ((n6 & 0x20) != 0) {
                            n16 -= this.e();
                        } else if ((n6 & 2) != 0) {
                            n16 -= this.e() >> 1;
                        }
                    }
                    this.a(graphics, string, n15, n16, 0, false);
                    continue;
                }
                break;
            }
        }
        s = -1;
        t = -1;
        u = -1;
        this.B = j;
    }

    final void a(String string) {
        this.a(string, null);
    }

    private void a(String string, char[] cArray) {
        int n2;
        if (string == null && cArray == null) {
            return;
        }
        a = 0;
        k = this.e();
        int n3 = 0;
        boolean bl = string != null;
        int n4 = n2 = s >= 0 ? s : 0;
        int n5 = bl ? (t >= 0 ? t : string.length()) : (t >= 0 ? t : cArray.length);
        boolean bl2 = this.h;
        while (n2 < n5) {
            block13: {
                int n6;
                int n7;
                block15: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    block14: {
                                        block12: {
                                            n7 = bl ? string.charAt(n2) : cArray[n2];
                                            if (n7 != 92) break block12;
                                            if ((bl ? string.charAt(n2) : cArray[++n2]) == '^') {
                                                bl2 = !bl2;
                                            }
                                            break block13;
                                        }
                                        if (n7 <= 32) break block14;
                                        n6 = this.k(n7);
                                        break block15;
                                    }
                                    if (n7 != 32 && n7 != a) break block16;
                                    if (n7 == 32) {
                                        n3 += this.d();
                                    }
                                    break block13;
                                }
                                if (n7 != 32) break block17;
                                n3 += this.d();
                                break block13;
                            }
                            if (n7 != 10) break block18;
                            if (n3 > a) {
                                a = n3;
                            }
                            n3 = 0;
                            k += this.b() + this.e();
                            break block13;
                        }
                        if (n7 != 1) break block19;
                        ++n2;
                        break block13;
                    }
                    if (n7 != 2) break block13;
                    ++n2;
                    n6 = bl ? (int)string.charAt(n2) : cArray[n2];
                }
                n7 = n6;
                n3 += this.l(n7) + this.h();
                if (bl2) {
                    ++n3;
                }
            }
            ++n2;
        }
        if (n3 > a) {
            a = n3;
        }
        if (a > 0) {
            a -= this.h();
        }
    }

    final void a(Graphics graphics, String string, int n2, int n3, int n4) {
        this.a(graphics, string, n2, n3, n4, true);
    }

    private void a(Graphics graphics, String string, int n2, int n3, int n4, boolean bl) {
        boolean bl2 = true;
        e e2 = null;
        e2 = this;
        if (string != null) {
            int n5;
            int n6;
            n3 = e2.r >= 0 ? (n3 += e2.q * e2.r >> 8) : (n3 += e2.q);
            boolean bl3 = string != null;
            e2.a(string, null);
            if ((n4 & 0x2B) != 0) {
                if ((n4 & 8) != 0) {
                    n2 -= a;
                } else if ((n4 & 1) != 0) {
                    n2 -= a >> 1;
                }
                if ((n4 & 0x20) != 0) {
                    n3 -= k;
                } else if ((n4 & 2) != 0) {
                    n3 -= k >> 1;
                }
            }
            n4 = n2;
            if (bl) {
                j = e2.B;
            }
            int n7 = n6 = s >= 0 ? s : 0;
            if (bl3) {
                n5 = t >= 0 ? t : string.length();
            } else {
                int n8 = n5 = t >= 0 ? t : (null).length;
            }
            if (u >= 0 && n5 > u) {
                n5 = u;
            }
            for (int i2 = n6; i2 < n5; ++i2) {
                int n9;
                int n10;
                int n11 = bl3 ? string.charAt(i2) : null[i2];
                if (n11 == 92) {
                    char c2 = bl3 ? string.charAt(i2) : null[++i2];
                    n6 = c2;
                    if (c2 == '_') {
                        e2.g = !e2.g;
                        continue;
                    }
                    if (n6 == 94) {
                        e2.h = !e2.h;
                        continue;
                    }
                    n11 = n6 & 0xFF;
                    e2.e(n11 - 48);
                    continue;
                }
                if (n11 == a) continue;
                if (n11 > 32) {
                    n10 = e2.k(n11);
                } else {
                    if (n11 == 32) {
                        if (e2.g) {
                            n9 = e2.k(95);
                            n6 = n4 + (e2.d() - e2.l(n9) >> 1);
                            e2.a(graphics, n9, n6, n3, 0);
                        }
                        n4 += e2.d();
                        continue;
                    }
                    if (n11 == 10) {
                        n4 = n2;
                        n3 += e2.b() + e2.e();
                        continue;
                    }
                    if (n11 == 1) {
                        char c3 = bl3 ? string.charAt(i2) : null[++i2];
                        n6 = c3;
                        if (c3 < e2.b) {
                            e2.e(n6);
                        }
                        if (n6 != 255) continue;
                        e2.B = j;
                        continue;
                    }
                    if (n11 != 2) continue;
                    ++i2;
                    n10 = bl3 ? (int)string.charAt(i2) : null[i2];
                }
                n11 = n10;
                e2.a(graphics, n11, n4, n3, 0);
                if (e2.g) {
                    n9 = e2.k(95);
                    n6 = n4 + (e2.l(n11) - e2.l(n9) >> 1);
                    e2.a(graphics, n9, n6, n3, 0);
                }
                if (e2.h) {
                    e2.a(graphics, n11, ++n4, n3, 0);
                }
                n4 += e2.l(n11) + e2.h();
            }
            if (bl) {
                e2.B = j;
            }
        }
    }

    final void b(Graphics graphics, String string, int n2, int n3, int n4) {
        int n5 = string.length();
        boolean bl = false;
        e e2 = this;
        int n6 = 2;
        for (int i2 = 0; i2 < n5; ++i2) {
            if (string.charAt(i2) != '\n') continue;
            ++n6;
        }
        int[] nArray = new int[n6];
        int n7 = n5;
        int[] nArray2 = nArray;
        n5 = 10;
        int n8 = n7;
        n6 = 0;
        String string2 = string;
        int n9 = 0;
        nArray2[0] = n6 - 1;
        while (n6 < n8) {
            if (string2.charAt(n6) == '\n') {
                nArray2[++n9] = n6;
            }
            ++n6;
        }
        nArray2[++n9] = n8;
        n6 = n9;
        int n10 = e2.b() + e2.e();
        if ((n4 & 0x20) != 0) {
            n3 -= n10 * (n6 - 1);
        } else if ((n4 & 2) != 0) {
            n3 -= n10 * (n6 - 1) >> 1;
        }
        for (n8 = 0; n8 < n6; ++n8) {
            s = nArray[n8] + 1;
            t = nArray[n8 + 1];
            e2.a(graphics, string, n2, n3 + n8 * n10, n4, false);
        }
        s = -1;
        t = -1;
    }

    private final int l(int n2) {
        if (this.r >= 0) {
            return this.f(n2, 0) * this.r >> 8;
        }
        return this.f(n2, 0);
    }

    final void e(int n2) {
        if (n2 < this.b && n2 >= 0) {
            this.B = n2;
            return;
        }
    }

    final int f() {
        return this.B;
    }

    final void b(int n2, int n3) {
        int n4 = this.k;
        int n5 = this.j;
        boolean bl = false;
        e e2 = this;
        int[] nArray = (int[])e2.a(0, n2);
        int n6 = nArray.length;
        if (n4 != 0) {
            for (n5 = n6 - 1; n5 >= 0; --n5) {
                n4 = nArray[n5] >>> 24;
                n4 = n4 * n3 >> 8;
                n4 = (n4 & 0xFF) << 24;
                nArray[n5] = n4 | nArray[n5] & 0xFFFFFF;
            }
        } else if (n5 != 0) {
            n3 = (n3 & 0xFF) << 24;
            for (n5 = n6 - 1; n5 >= 0; --n5) {
                if ((nArray[n5] & 0xFFFFFF) == 0xFF00FF || nArray[n5] >> 24 == 0) continue;
                nArray[n5] = n3 | nArray[n5] & 0xFFFFFF;
            }
        } else {
            n3 = (n3 & 0xFF) << 24;
            for (n5 = n6 - 1; n5 >= 0; --n5) {
                nArray[n5] = n3 | nArray[n5] & 0xFFFFFF;
            }
        }
        if ((e2.A & 0x20000000) != 0) {
            e2.a(0, n2, nArray);
        }
    }

    final void f(int n2) {
        int n3 = this.b - 1;
        boolean bl = false;
        e e2 = this;
        this.j = true;
        e2.k = true;
        int[] nArray = (int[])e2.a(0, n2);
        int[] nArray2 = (int[])e2.a(0, n3);
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if ((nArray[i2] & 0xFFFFFF) == 0xFF00FF || nArray[i2] >> 24 == 0) continue;
            int n4 = i2;
            nArray[n4] = nArray[n4] & 0xFFFFFF;
            int n5 = i2;
            nArray[n5] = nArray[n5] | (nArray2[i2] & 0xFF0000) << 8;
        }
        if ((e2.A & 0x20000000) != 0) {
            e2.a(0, n2, nArray);
        }
    }

    private static int a(byte[] byArray, int n2, short[] sArray, int n3, int n4, boolean bl) {
        for (n3 = 0; n3 < n4; ++n3) {
            sArray[n3] = bl ? (short)byArray[n2++] : (short)((byArray[n2++] & 0xFF) + ((byArray[n2++] & 0xFF) << 8));
        }
        return n2;
    }

    static final int[] a(int[] nArray, int n2, int n3, int n4) {
        int[] nArray2 = nArray;
        nArray = null;
        nArray = nArray2;
        if ((n4 & 7) == 0) {
            return nArray;
        }
        int n5 = n3;
        n5 = n2;
        int[] nArray3 = nArray;
        nArray3 = e.a(nArray);
        int n6 = 0;
        int n7 = 0;
        switch (n4 & 7) {
            case 1: {
                n6 = n2 * n3;
                n7 = n2 * (n3 - 1);
                int n8 = n3;
                while (--n8 >= 0) {
                    n4 = n2;
                    while (--n4 >= 0) {
                        nArray3[--n6] = nArray[n7++];
                    }
                    n7 -= n2 << 1;
                }
                break;
            }
            case 2: {
                n6 = (n3 - 1) * n2;
                int n9 = n3;
                while (--n9 >= 0) {
                    System.arraycopy(nArray, n7, nArray3, n6, n2);
                    n6 -= n2;
                    n7 += n2;
                }
                break;
            }
            case 3: {
                n7 = n2 * n3 - 1;
                while (n7 >= 0) {
                    nArray3[n6++] = nArray[n7--];
                }
                break;
            }
            case 4: {
                n6 = n2 * n3;
                int n10 = n3;
                while (--n10 >= 0) {
                    n7 = n10;
                    n4 = n2;
                    while (--n4 >= 0) {
                        nArray3[--n6] = nArray[n7];
                        n7 += n3;
                    }
                }
                break;
            }
            case 5: {
                n6 = n2 * n3;
                int n11 = n3;
                while (--n11 >= 0) {
                    n7 = n3 - 1 - n11;
                    n4 = n2;
                    while (--n4 >= 0) {
                        nArray3[--n6] = nArray[n7];
                        n7 += n3;
                    }
                }
                break;
            }
            case 6: {
                n6 = n2 * n3;
                int n12 = n6 - 1;
                int n13 = n3;
                while (--n13 >= 0) {
                    n7 = n12--;
                    n4 = n2;
                    while (--n4 >= 0) {
                        nArray3[--n6] = nArray[n7];
                        n7 -= n3;
                    }
                }
                break;
            }
            case 7: {
                n6 = n2 * n3;
                int n14 = n6 - n3;
                int n15 = n3;
                while (--n15 >= 0) {
                    n7 = n14++;
                    n4 = n2;
                    while (--n4 >= 0) {
                        nArray3[--n6] = nArray[n7];
                        n7 -= n3;
                    }
                }
                break;
            }
        }
        return nArray3;
    }

    static final int[] a(int[] nArray, int n2, int n3) {
        nArray = e.a(nArray);
        return nArray;
    }

    static {
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2 = i2;
            for (int i3 = 8; i3 > 0; --i3) {
                if ((n2 & 1) == 1) {
                    n2 = n2 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n2 >>>= 1;
            }
            e.c[i2] = n2;
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
        a = (char)124;
        m = false;
        n = false;
        J = -1;
        K = -1;
    }
}

