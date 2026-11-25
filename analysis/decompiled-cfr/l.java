/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class l {
    private int b;
    int a;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int[] a = 0;
    private int[] b = 0;
    private int[] c = 0;
    private int[] d = 0;
    private int[] e = 0;
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

    private l(int n2) {
        this.l = n2;
        this.a = new int[n2];
        this.b = new int[n2];
        this.c = new int[n2];
        this.d = new int[n2];
        this.e = new int[n2];
        this.b = n2;
    }

    private l(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, int n25, int n26, int n27, int n28) {
        this(n2);
        l l2 = this;
        this.d = n3;
        n3 = n4;
        l2 = this;
        this.e = n3;
        int n29 = n5;
        int n30 = n6;
        n6 = n8;
        n5 = n7;
        n4 = n30;
        n3 = n29;
        l2 = this;
        l2.f[0] = n3;
        l2.f[1] = n4;
        l2.f[2] = n5;
        l2.f[3] = n6;
        n4 = n10;
        n3 = n9;
        l2 = this;
        this.f = n3;
        l2.g = n4;
        n4 = n12;
        n3 = n11;
        l2 = this;
        this.h = n3;
        l2.i = n4;
        n4 = n14;
        n3 = n13;
        l2 = this;
        this.p = n3;
        l2.q = n4;
        n4 = n16;
        n3 = n15;
        l2 = this;
        this.j = n3;
        l2.k = n4;
        n3 = n17;
        l2 = this;
        this.t = n3 >= 1 ? n3 : 1;
        n6 = n21;
        n5 = n20;
        n4 = n19;
        n3 = n18;
        l2 = this;
        l2.g[0] = n3;
        l2.g[1] = n4;
        l2.g[2] = n5;
        l2.g[3] = n6;
        l2.m = j.c(n3 * 2 + n5) / 2;
        l2.n = j.c(n4 * 2 + n6) / 2;
        n3 = n22;
        l2 = this;
        this.o = n3;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        n3 = 0;
        l2 = this;
        l2.h[0] = n3;
        l2.h[1] = n4;
        l2.h[2] = n5;
        l2.h[3] = n6;
        n3 = 0;
        l2 = this;
        this.r = n3;
        n3 = 0;
        l2 = this;
        this.s = n3;
    }

    public final void a() {
        int n2 = this.b;
        new StringBuffer().append(" param error: _iNumberOfPartcles (").append(n2).append(") should be less or equal than m_emitter_maxParticles (").append(this.l).append(")");
        this.b = n2;
        this.a = n2;
        this.m = j.c(2 * this.g[0] + this.g[2]) / 2;
        this.n = j.c(2 * this.g[1] + this.g[3]) / 2;
        for (n2 = 0; n2 < this.b; ++n2) {
            this.c[n2] = j.b(this.f, this.g + 1);
            this.d[n2] = j.b(this.h, this.i + 1);
            this.e[n2] = this.d > 0 ? -(n2 * this.d) / this.b : 0;
        }
    }

    public final void a(int n2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this.o != 0) {
            n3 = this.g[0];
            n4 = this.g[1];
            n5 = n3 + this.g[2] - 1;
            n6 = n4 + this.g[3] - 1;
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (this.r > 0) {
            n7 = this.h[0];
            n8 = this.h[1];
            n9 = n7 + this.h[2] - 1;
            n10 = n8 + this.h[3] - 1;
        }
        this.a = 0;
        this.c = 0;
        for (int i2 = 0; i2 < this.b; ++i2) {
            int n11 = i2;
            l l2 = this;
            new StringBuffer().append(" param error _iParticleIdx (").append(n11).append(") should be less than number of particles (").append(l2.b).append(")");
            if (l2.e[n11] >= l2.e) continue;
            ++this.a;
            int n12 = this.a(i2);
            boolean bl = this.b(i2);
            if (n12 == 0) {
                ++this.c;
            } else {
                int n13;
                int n14;
                int n15;
                int n16;
                int n17;
                int n18;
                int n19;
                n12 = j.d(this.a[i2]);
                int n20 = j.d(this.b[i2]);
                int n21 = i2;
                this.a[n21] = this.a[n21] + (int)((long)(this.c[i2] * n2) / 1000L);
                int n22 = i2;
                this.b[n22] = this.b[n22] + (int)((long)(this.d[i2] * n2) / 1000L);
                int n23 = this.a[i2];
                int n24 = n19 = this.b[i2];
                n11 = n23;
                l2 = this;
                if (l2.o == 0) {
                    n18 = 0;
                } else {
                    n17 = j.d(l2.m - n11);
                    n16 = j.d(l2.n - n24);
                    n18 = j.c(j.b(n17, n16, 30));
                }
                n24 = n15 = n18;
                n11 = n23;
                l2 = this;
                if (l2.o == 0) {
                    n14 = 0;
                } else {
                    n17 = l2.o * (l2.m - n11);
                    n14 = j.d(n17, n24);
                }
                n16 = n14;
                n24 = n15;
                n11 = n19;
                l2 = this;
                if (l2.o == 0) {
                    n13 = 0;
                } else {
                    n17 = l2.o * (l2.n - n11);
                    n13 = j.d(n17, n24);
                }
                n15 = n13;
                n16 = this.p + n16;
                n15 = this.q + n15;
                int n25 = i2;
                this.c[n25] = this.c[n25] + (int)((long)(n16 * n2) / 1000L);
                int n26 = i2;
                this.d[n26] = this.d[n26] + (int)((long)(n15 * n2) / 1000L);
                if (this.j > 0) {
                    int n27 = this.c[i2] < -this.j ? -this.j : (this.c[i2] = this.c[i2] > this.j ? this.j : this.c[i2]);
                }
                if (this.k > 0) {
                    int n28 = this.d[i2] < -this.k ? -this.k : (this.d[i2] = this.d[i2] > this.k ? this.k : this.d[i2]);
                }
                if (this.t > 1) {
                    n15 = this.t - 1;
                    this.c[i2] = this.c[i2] * n15 / this.t;
                    this.d[i2] = this.d[i2] * n15 / this.t;
                }
                n15 = j.d(n23);
                n23 = j.d(n19);
                if (this.o != 0) {
                    n19 = n6;
                    n16 = n5;
                    n17 = n4;
                    n24 = n3;
                    n11 = n23;
                    int n29 = n15;
                    if (n29 >= n24 && n29 <= n16 && n11 >= n17 && n11 <= n19) {
                        this.e[i2] = this.e;
                    }
                }
                if (this.r > 0) {
                    n19 = 0;
                    if (n15 < n7) {
                        n19 = 1;
                        if (j.e(this.c[i2]) <= this.s || n12 == n7) {
                            n15 = n7;
                            this.c[i2] = 0;
                        } else {
                            this.c[i2] = -this.c[i2];
                            n15 = n7;
                        }
                    } else if (n15 > n9) {
                        n19 = 1;
                        if (j.e(this.c[i2]) <= this.s || n12 == n9) {
                            n15 = n9;
                            this.c[i2] = 0;
                        } else {
                            this.c[i2] = -this.c[i2];
                            n15 = n9;
                        }
                    }
                    if (n23 < n8) {
                        n19 = 1;
                        if (j.e(this.d[i2]) <= this.s || n20 == n8) {
                            n23 = n8;
                            this.d[i2] = 0;
                        } else {
                            this.d[i2] = -this.d[i2];
                            n23 = n8;
                        }
                    } else if (n23 > n10) {
                        n19 = 1;
                        if (j.e(this.d[i2]) <= this.s || n20 == n10) {
                            n23 = n10;
                            this.d[i2] = 0;
                        } else {
                            this.d[i2] = -this.d[i2];
                            n23 = n10;
                        }
                    }
                    if (n19 != 0) {
                        int n30 = i2;
                        this.c[n30] = this.c[n30] / this.r;
                        int n31 = i2;
                        this.d[n31] = this.d[n31] / this.r;
                        this.a[i2] = j.c(n15);
                        this.b[i2] = j.c(n23);
                    }
                }
            }
            int n32 = i2;
            this.e[n32] = this.e[n32] + n2;
            if (!bl || this.b(i2)) continue;
            this.a[i2] = j.c(this.f[0] + j.b(0, this.f[2]));
            this.b[i2] = j.c(this.f[1] + j.b(0, this.f[3]));
        }
    }

    public final void a(Graphics graphics, e e2, int n2, int n3, int n4, boolean bl) {
        this.a(graphics, e2, n2, 0, 0, false, b.c);
    }

    public final void a(Graphics graphics, e e2, int n2, int n3, int n4, boolean bl, int n5) {
        int n6 = 0;
        while (true) {
            l l2 = this;
            if (n6 >= l2.b) break;
            if (this.a(n6)) {
                int n7 = n6;
                l2 = this;
                new StringBuffer().append(" param error _iParticleIdx (").append(n7).append(") should be less than number of particles (").append(l2.b).append(")");
                int n8 = j.d(l2.a[n7]) + n3;
                n7 = n6;
                l2 = this;
                new StringBuffer().append(" param error _iParticleIdx (").append(n7).append(") should be less than number of particles (").append(l2.b).append(")");
                int n9 = j.d(l2.b[n7]) + n4;
                n7 = n6;
                l2 = this;
                new StringBuffer().append(" param error _iParticleIdx (").append(n7).append(") should be less than number of particles (").append(l2.b).append(")");
                int n10 = l2.e[n7];
                n10 = l.a(e2, n2, n10, n5, bl ? 1 : -1);
                if (n10 >= 0) {
                    e2.a(graphics, n2, n10, n8, n9, 0);
                } else {
                    this.e[n6] = this.e;
                }
            }
            ++n6;
        }
    }

    public final int a() {
        return this.a;
    }

    private boolean a(int n2) {
        new StringBuffer().append(" param error _iParticleIdx (").append(n2).append(") should be less than number of particles (").append(this.b).append(")");
        return this.e[n2] > 0 && this.e[n2] < this.e;
    }

    private boolean b(int n2) {
        new StringBuffer().append(" param error _iParticleIdx (").append(n2).append(") should be less than number of particles (").append(this.b).append(")");
        return this.e[n2] <= 0;
    }

    private static int a(e e2, int n2, int n3, int n4, int n5) {
        int n6;
        n3 /= n4;
        n4 = 0;
        for (n6 = 0; n6 < e2.a(n2); ++n6) {
            n4 += e2.a(n2, n6);
        }
        if (n5 > 0 && n3 / n4 >= n5) {
            return -1;
        }
        n6 = n3 % n4;
        n3 = -1;
        while ((n6 -= e2.a(n2, ++n3)) >= 0) {
        }
        return n3;
    }

    public static l a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17) {
        int n18 = n2;
        n2 = 0;
        n2 = 0;
        n2 = 0;
        n2 = 0;
        n2 = 0;
        n16 = -1;
        n14 = 0;
        n2 = n18;
        l l2 = new l(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return l2;
    }
}

