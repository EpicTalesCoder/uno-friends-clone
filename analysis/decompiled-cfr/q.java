/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class q
implements c,
d {
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
    public static boolean c;
    private int s;
    public boolean d;
    p a;
    private e a;
    public boolean e;
    private int t = -1;
    private int u;
    public int m;
    public static int n;
    private static int[] a;
    private static int[] b;
    public static q[] a;
    private static int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;

    public final void a(boolean bl, int n2, int n3, n n4) {
        block47: {
            block48: {
                int n5;
                block49: {
                    block46: {
                        this.e = true;
                        if (this.e) {
                            ++n;
                        }
                        this.u = n2;
                        c c2 = n4;
                        Object object = this;
                        int n6 = ((n)c2).d;
                        if (n6 == 5) {
                            if (((q)object).a()) {
                                ((q)object).o = (c.e_ - h >> 1) + a[v % 5];
                                ((q)object).p = (c.f_ - i >> 1) + b[v % 5];
                                ((q)object).s = v % 5;
                                ((q)object).d = true;
                                ++v;
                            } else {
                                ((q)object).o = c.e_ - h >> 1;
                                ((q)object).p = c.f_ - i >> 1;
                                ((q)object).d = true;
                                ((q)object).s = 5;
                            }
                        } else {
                            int n7;
                            int n8;
                            n n9 = c2;
                            int n10 = n9.a;
                            int n11 = ((n)c2).a.d;
                            if (n6 == 0) {
                                n8 = n10 > 5 ? (a.p == 0 ? h + 135 + 6 * (n10 - 5) : h + 108 + 6 * (n10 - 5)) : (a.p == 0 ? h + n10 * 27 : h + 27 * (n10 - 1));
                                n7 = c.e_ - n8 >> 1;
                                if (n7 + n8 > 600) {
                                    n7 = 600 - n8;
                                }
                            } else {
                                n8 = n10 > 5 ? h + (j << 2) + k * (n10 - 5) : h + j * (n10 - 1);
                                n7 = n6 == 2 ? (c.e_ + n8 >> 1) - h : (n6 == 1 ? c.f_ - n8 - 20 >> 1 : (c.f_ + n8 - 20 >> 1) - h);
                            }
                            c2 = ((n)c2).a;
                            while (c2 != null) {
                                if (((q)c2).c == ((q)object).c) {
                                    switch (n6) {
                                        case 0: {
                                            ((q)object).o = n7;
                                            ((q)object).p = c.f_ - i;
                                            break;
                                        }
                                        case 1: {
                                            ((q)object).o = -12;
                                            ((q)object).p = n7;
                                            break;
                                        }
                                        case 2: {
                                            ((q)object).o = n7;
                                            ((q)object).p = -12;
                                            break;
                                        }
                                        case 3: {
                                            ((q)object).o = c.e_ - i + 12;
                                            ((q)object).p = n7;
                                        }
                                    }
                                    break;
                                }
                                c2 = ((q)c2).b;
                                if (c2 == null) continue;
                                if (n6 == 0 && ((q)c2).c == n11 + 1 && a.p == 0) {
                                    n7 += 40;
                                    continue;
                                }
                                if (n6 == 0 || n6 == 1) {
                                    n7 += ((q)c2).a(n11, n10, n6 == 0);
                                    continue;
                                }
                                n7 -= ((q)c2).a(n11, n10, n6 == 0);
                            }
                        }
                        if (((q)object).u != 0) {
                            ((q)object).q = (((q)object).o - ((q)object).f) % ((q)object).u == 0 ? (((q)object).o - ((q)object).f) / ((q)object).u : (((q)object).o - ((q)object).f) / (((q)object).u - 1);
                            ((q)object).r = (((q)object).p - ((q)object).g) % ((q)object).u == 0 ? (((q)object).p - ((q)object).g) / ((q)object).u : (((q)object).p - ((q)object).g) / (((q)object).u - 1);
                            ((q)object).w = ((q)object).o < ((q)object).f ? ((q)object).o : ((q)object).f;
                            ((q)object).x = ((q)object).p < ((q)object).g ? ((q)object).p : ((q)object).g;
                            ((q)object).y = (((q)object).o > ((q)object).f ? ((q)object).o : ((q)object).f) + i;
                            ((q)object).z = (((q)object).p > ((q)object).g ? ((q)object).p : ((q)object).g) + i;
                            if (n == 1) {
                                A = ((q)object).w;
                                B = ((q)object).x;
                                C = ((q)object).y;
                                D = ((q)object).z;
                            } else {
                                int[] nArray = a.a(((q)object).w, ((q)object).x, ((q)object).y, ((q)object).z, A, B, C, D);
                                object = nArray;
                                A = nArray[0];
                                B = (int)object[1];
                                C = (int)object[2];
                                D = (int)object[3];
                            }
                        }
                        n5 = n4.d;
                        this.a.a(a.a[55]);
                        if (n3 != 4) break block46;
                        if (n5 != 0) break block47;
                        this.a.a(a.a[57]);
                        this.t = this.b + 5;
                        this.t = 5;
                        break block48;
                    }
                    if (n5 != 5) break block49;
                    this.a.a(a.a[57]);
                    if (n3 == 0) break block47;
                    this.t = 0 + (n3 - 1);
                    break block48;
                }
                if (n3 == 0) {
                    this.a.a(a.a[57]);
                    switch (n5) {
                        case 1: {
                            this.t = 4;
                            break;
                        }
                        case 2: {
                            this.t = 4;
                            break;
                        }
                        case 3: {
                            this.t = 4;
                            break;
                        }
                    }
                } else if (n5 == 0) {
                    this.a.a(a.a[57]);
                    switch (n3) {
                        case 1: {
                            this.t = 5;
                            break;
                        }
                        case 2: {
                            this.t = this.b + 5;
                            this.t = 5;
                            break;
                        }
                        case 3: {
                            this.t = this.b + 5;
                            this.t = 5;
                            break;
                        }
                    }
                } else if (n3 == 1 && n5 == 2) {
                    this.t = 8;
                } else if (n3 == 2 && n5 == 1) {
                    this.t = 10;
                } else if (n3 == 2 && n5 == 3) {
                    this.t = 11;
                } else if (n3 == 3 && n5 == 2) {
                    this.t = 12;
                } else if (n3 == 1 && n5 == 3) {
                    this.t = 9;
                } else if (n3 == 3 && n5 == 1) {
                    this.t = 13;
                }
            }
            this.a.b(this.t, 1);
            this.a.a(this.b);
        }
    }

    public final void a(int n2, boolean bl) {
        int n3 = n2;
        q q2 = this;
        if (!(q2.a != 13 && q2.a != 14 || q2.b == 0 || n3 != 0 && n3 != 4)) {
            q2.b = 0;
        }
        if (n3 == 0) {
            if (q2.b != 0) {
                q2.a.e(q2.b - 1);
            }
        } else if (n3 == 5) {
            if (q2.b != 0) {
                q2.a.e(q2.b - 1);
            }
        } else {
            q2.a.e(0);
        }
        q2 = j.b;
        this.a.a(this.f, this.g);
        if (!bl) {
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
        if (n2 == 0 && (this.a.a().equals(a.a[56]) || this.a.a().equals(a.a[54]))) {
            int n4 = n3 = a.b(39) > 0 ? 1 : 0;
            if (this.e != 1 && n3 != 0) {
                a.a[70].a(j.b, 0, this.f, this.g, 0);
            }
        }
        if (this.a && n2 == 0 && (this.a.a().equals(a.a[56]) || this.a.a().equals(a.a[54]))) {
            a.a[186].a(j.b, 23, this.f, this.g, 0);
        }
        if (this.a && n2 != 0 && this.a.a().equals(a.a[80])) {
            if (n2 == 1) {
                a.a[186].a(j.b, 25, this.f, this.g, 0);
            } else if (n2 == 2) {
                a.a[186].a(j.b, 26, this.f, this.g, 0);
            }
            if (n2 == 3) {
                a.a[186].a(j.b, 27, this.f, this.g, 0);
            }
        }
        if (!bl) {
            j.b = q2;
        }
    }

    public final void b(int n2, boolean bl) {
        if (this.a.a().equals(a.a[56])) {
            a.a[34].a(j.b, 4, this.f, this.g, 0);
        }
        this.a(n2, true);
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1, int var2_2, int var3_3) {
        if (this.e) {
            if (a.b.a() >= 0 && o.c) {
                return;
            }
            if (this.m > 0) {
                --this.m;
                return;
            }
            if (this.a.a() == this.t && this.a.a()) {
                this.t = -1;
                this.a(var1_1);
            }
            --this.u;
            if (this.u <= 0) {
                this.e = false;
                if (var1_1 >= 0 && var1_1 <= 3) {
                    if (var1_1 != 0) {
                        a.a[a.a((int)var1_1)] = true;
                    }
                    a.a = (byte)var1_1;
                }
                if (--q.n == 0) {
                    a.e = true;
                    q.A = c.bA;
                    q.B = c.bB;
                    q.C = c.bA;
                    q.D = c.bB;
                    a.e(2);
                }
                this.q = 0;
                this.r = 0;
                this.u = 0;
                if (this == a.a) {
                    a.a = null;
                }
                this.a(var1_1);
                if (this == a.b.b) {
                    a.a(this.a, this.b);
                    if (q.a[this.s] != null) {
                        q.a[this.s].d = false;
                    }
                    q.a[this.s] = this;
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
        switch (var1_1) {
            case 0: {
                if (var1_1 == 0 && o.l <= 0) {
                    if (!(this.l != 0 && this.l != 1 || a.bu == -1 || a.bv == -1 || a.bv + 20 >= c.f_ - q.i / 3 || a.bv - q.i + 20 >= c.f_ - q.i || a.bu - q.h + 20 < 150 || a.bu - q.h + 20 + q.h > 498 || a.bv - q.i + 20 < 220 || var3_3 != this.c || a.p != 0 || a.a(10, 26) || a.a(10, 25) || a.a(10, 24) || a.a() <= 5 && a.a() >= -5 && a.b() <= 5 && a.b() >= -5)) {
                        this.l = 3;
                        this.a(a.bw - q.h + 20, a.bx - q.i + 20);
                        break;
                    }
                    if (this.l == 3) {
                        if (this.g < c.f_ - q.i) {
                            q.c = true;
                        }
                        if (a.bv + 20 >= c.f_ - q.i / 3 && q.c && Math.abs(a.bu - q.h + 20 - this.o) <= q.h) {
                            q.b = false;
                            this.l = 1;
                            q.c = false;
                            this.a(this.f, c.f_ - q.i);
                            break;
                        }
                        if (a.bu != -1 && a.bv != -1) {
                            q.b = false;
                            var3_3 = 0;
                            if (a.bu - q.h + 20 >= 150 && a.bu - q.h + 20 + q.h <= 498 && a.bv - q.i + 20 + 100 >= 220) {
                                this.a(a.bw - q.h + 20, a.bx - q.i + 20);
                            }
                            if (a.bu - q.h + 20 < 150) {
                                this.a(150, this.g);
                                this.a(150, a.bx - q.i + 20);
                                var3_3 = 1;
                            }
                            if (a.bu - q.h + 20 + q.h > 498) {
                                this.a(508 - q.h - 10, a.bx - q.i + 20);
                                var3_3 = 1;
                            }
                            if (a.bv - q.i + 20 >= 235) break;
                            if (var3_3 != 0) {
                                this.a(this.f, 235);
                                break;
                            }
                            this.a(a.bw - q.h + 20, 235);
                            break;
                        }
                    }
                }
                if (!a.f) {
                    if (q.b) {
                        if (var3_3 == this.c) {
                            if (this.g > c.f_ - q.i - q.j) {
                                this.a(this.f, this.g - q.j / 2);
                                a.e = true;
                            }
                            if (this.g <= c.f_ - q.i - q.j) {
                                this.a(this.f, c.f_ - q.i - q.j);
                            }
                        } else {
                            var3_3 = c.f_ - q.i - ((q.i >> 2) - Math.abs(c.bA - (this.f + (q.h >> 1))) >> 2);
                            if (this.g < var3_3) {
                                this.a(this.f, this.g + q.j / 2);
                                a.e = true;
                            }
                            if (this.g >= var3_3) {
                                this.a(this.f, var3_3);
                            }
                        }
                        if (this.f < var2_2) {
                            this.f += 27;
                            a.e = true;
                        } else if (this.f > var2_2) {
                            this.f -= 27;
                            a.e = true;
                        }
                        if (j.e(this.f - var2_2) >= 27) break;
                        this.a(var2_2, this.g);
                        break;
                    }
                    if (var3_3 == this.c) {
                        this.a(var2_2, c.f_ - q.i - q.j);
                        break;
                    }
                    this.a(var2_2, c.f_ - q.i);
                    this.b(var1_1);
                    break;
                }
                if (!(a.a[a.p].b != var1_1 || a.a[a.p].i || a.a[a.p].d || a.a[a.p].g || a.a[a.p].c)) {
                    if (q.b) {
                        if (var3_3 == this.c) {
                            if (this.g > c.f_ - q.i - q.j) {
                                this.a(this.f, this.g - q.j / 2);
                            }
                            if (this.g <= c.f_ - q.i - q.j) {
                                this.a(this.f, c.f_ - q.i - q.j);
                            }
                        } else {
                            if (this.g < c.f_ - q.i) {
                                this.a(this.f, this.g + q.j / 2);
                            }
                            if (this.g >= c.f_ - q.i) {
                                this.a(this.f, c.f_ - q.i);
                            }
                        }
                        if (this.f < var2_2) {
                            this.f += 27;
                        } else if (this.f > var2_2) {
                            this.f -= 27;
                        }
                        if (j.e(this.f - var2_2) < 27) {
                            this.a(var2_2, this.g);
                        }
                        this.b(var1_1);
                        if (a.d[a.p] != 1) break;
                        this.a(this.f, this.g + (c.bB >> 1));
                        break;
                    }
                    if (var3_3 == this.c) {
                        this.a(var2_2, c.f_ - q.i - q.j);
                    } else {
                        this.a(var2_2, c.f_ - q.i);
                    }
                    this.b(var1_1);
                    if (a.d[a.p] != 1) break;
                    this.a(this.f, this.g + (c.bB >> 1));
                    break;
                }
                this.a(var2_2, c.f_ - q.i);
                this.b(var1_1);
                if (a.d[a.a(var1_1)] != 1) break;
                this.a(this.f, this.g + (c.bB >> 1));
                break;
            }
            case 1: {
                this.a(-12, var2_2);
                this.b(var1_1);
                ** GOTO lbl168
            }
            case 2: {
                this.a(var2_2, -12);
                this.b(var1_1);
                ** GOTO lbl168
            }
            case 3: {
                this.a(c.e_ + 12, var2_2);
                this.b(var1_1);
                ** GOTO lbl168
            }
            case 4: {
                v0 = new int[4];
                var3_4 = v0;
                v0[0] = a.a(10, 19, 2);
                var3_4[1] = a.a(10, 19, 3);
                var3_4[2] = a.a(10, 19, 5);
                var3_4[3] = a.a(10, 19, 6);
                this.a(var3_4[0] + (var3_4[2] >> 1), var3_4[1] + (var3_4[3] >> 1));
                ** GOTO lbl168
            }
            case 5: {
                if (this.o != 0 && this.p != 0 && this.a()) {
                    this.a(this.o, this.p);
                } else {
                    this.a(c.e_ - q.h >> 1, c.f_ - q.i >> 1);
                }
lbl168:
                // 6 sources

                this.a(var1_1);
            }
        }
        if (this.a != null) {
            this.a.b(j.a_);
        }
    }

    private void b(int n2) {
        switch (n2) {
            case 0: {
                n2 = a.a(10, 1, 3) - ((i >> 1) - Math.abs(c.bA - (this.f + (h >> 1))) >> 2);
                if (o.a == 3) {
                    // empty if block
                }
                this.a(this.f, n2);
                return;
            }
            case 1: {
                n2 = a.a(10, 2, 2) - (Math.abs(c.bB - this.g) >> 2) - 12;
                if (a.p != a.a(1)) {
                    n2 -= h / 3;
                }
                this.a(n2, this.g);
                return;
            }
            case 2: {
                n2 = a.a(10, 3, 3) - (Math.abs(c.bA - this.f) >> 2) - 12;
                if (a.p != a.a(2)) {
                    n2 -= i / 3;
                }
                this.a(this.f, n2);
                return;
            }
            case 3: {
                n2 = a.a(10, 4, 2) + i + (Math.abs(c.bB - this.g) >> 2) + 12;
                if (a.p != a.a(3)) {
                    n2 += h / 3;
                }
                this.a(n2, this.g);
            }
        }
    }

    public final void a(int n2) {
        if (this.e && this.t >= 0 && !this.a.a()) {
            return;
        }
        if (n2 == 0 && (a.a[a.p].b != 0 || a.a[a.p].a == 0)) {
            if (this.b == 0) {
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
        } else if (n2 == 5) {
            if (this.b == 0) {
                this.a = a.a[54];
                if (this.a != null && this.a == null) {
                    this.a = new p(this.a, this.f, this.g);
                }
                this.a.a(this.a);
                this.a.b(this.a - 13, -1);
            } else if (a.b.b == this || a.b.b == this.b && this.b != null && a.b.b.e || this.e) {
                this.a = a.a[56];
                if (this.a != null && this.a == null) {
                    this.a = new p(this.a, this.f, this.g);
                }
                this.a.a(this.a);
                this.a.b(this.a, -1);
            } else {
                this.a = a.a[81];
                if (this.a != null && this.a == null) {
                    this.a = new p(this.a, this.f, this.g);
                }
                this.a.a(this.a);
                this.a.b(this.d, -1);
            }
        } else if (n2 == 4) {
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
            } else if (a.a[a.p] != null && a.a[a.p].k) {
                if (!(a.m != 1 || a.a[a.p].i || a.a[a.p].c || a.a[a.p].d || a.a[a.p].g || a.a != null || a.a[a.p].f != 0)) {
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
            } else {
                this.a.b(0, -1);
                if (a.a != null) {
                    a.a.b(-1, -1);
                }
            }
            int[] nArray = new int[4];
            a.a[23].a(nArray, 0, (int)a.a(10, 19, 2), (int)a.a(10, 19, 3), 0);
            if (a.a(nArray[0], nArray[1], nArray[2] - nArray[0], nArray[3] - nArray[1]) && a.a[a.p].a == 0 && a.k != 2 && a.a[a.p].k && a.b() && a.m != 6 && a.m != 2 && a.h != 2) {
                this.a.b(2, -1);
            }
        } else {
            this.a = a.a[a.a];
            if (this.a != null && this.a == null) {
                this.a = new p(this.a, this.f, this.g);
            }
            this.a.a(this.a);
            n2 *= 15;
            if ((n2 += this.d) < 0) {
                n2 += 60;
            } else if (n2 >= 60) {
                n2 -= 60;
            }
            this.a.b(n2 + 2, -1);
        }
        if (h == 0 || i == 0) {
            h = a.a[56].b(0);
            i = a.a[56].c(0);
            j = h / 3;
            k = j >> 2;
        }
    }

    public final void a(int n2, int n3) {
        this.f = n2;
        this.g = n3;
        this.a.a(this.f, this.g);
    }

    private static int a(boolean bl) {
        if (bl) {
            return 27;
        }
        return j;
    }

    private static int b(boolean bl) {
        if (bl) {
            return 6;
        }
        return k;
    }

    public final int a(int n2, int n3, boolean bl) {
        int n4 = n3 - 1 - n2 > 2 && n2 > 2 ? (this.c <= n2 && this.c + 2 > n2 ? q.a(bl) : (this.c > n2 && n2 + 2 >= this.c ? q.a(bl) : q.b(bl))) : (n2 <= 2 ? (this.c < 5 ? q.a(bl) : q.b(bl)) : (this.c > n3 - 5 ? q.a(bl) : q.b(bl)));
        return n4;
    }

    public final boolean a() {
        return this.a <= 9;
    }

    public final void a() {
        switch (this.a) {
            case 10: 
            case 11: 
            case 12: {
                this.a = j.b(0, 10);
                return;
            }
            case 13: 
            case 14: {
                this.a = 0 + j.b(0, 6);
                this.b = 1 + j.b(0, 4);
            }
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

    static {
        c = false;
        n = 0;
        a = new int[]{-9, -3, 7, 12, 2};
        b = new int[]{-10, 3, -14, -3, -7};
        a = new q[6];
        A = c.bA;
        B = c.bB;
        C = c.bA;
        D = c.bB;
    }
}

