/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class o
implements c,
d {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static boolean a;
    public static boolean b;
    private static int[][] a;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    private static int n;
    static int j;
    public static int k;
    static int l;
    public static int m;
    private static int o;
    private static int p;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;

    o() {
    }

    public static int a(boolean bl) {
        int n2 = 0;
        if (a == 0) {
            n2 = 200;
        } else if (a == 2 || bl) {
            n2 = i == 0 || i == 1 || i == 2 ? a.c[0] * a[i][e] / 100 : (i == 3 ? a[i][e] * a.j : (a.c[3] + a.c[2] + a.c[1]) * a[i][e] / 100);
        } else if (a == 1 && !bl) {
            n2 = -1;
        }
        return n2;
    }

    public static void a(int n2, int n3) {
        int n4;
        a = 1;
        if (n3 >= a.a[n2].length - 1) {
            n3 = 0;
        }
        int[] nArray = a.a[n2][n3];
        e = n4 = nArray[1];
        n4 = nArray[0];
        if (n4 == 3) {
            a.j = 3;
        }
        o.b(n4);
        int n5 = n3;
        n4 = n2;
        int[] nArray2 = a.a[n4][n5];
        n5 = 4;
        if (nArray2[2] == -1) {
            --n5;
        }
        if (nArray2[3] == -1) {
            --n5;
        }
        if (nArray2[4] == -1) {
            --n5;
        }
        f = n5;
        j = nArray[5] != 0 ? 1 : 0;
        a.l = 1;
        a.i = nArray[7] != 0 ? 1 : 0;
        a.k = nArray[9];
        g = n2;
        b = n3;
        h = 0;
        if (o.e() || i == 2) {
            a.c = 250;
        }
        a.a[0] = a.a(a.s);
        a.a[0] = a.a[0].trim();
        a.a[1] = a.a(a.b[nArray[2]][0], 1);
        a.a[2] = a.a(a.b[nArray[3]][0], 1);
        a.a[3] = a.a(a.b[nArray[4]][0], 1);
        if (b == 0) {
            a.d();
        }
    }

    public static void a(int n2) {
        int n3 = n2;
        n2 = 0;
        n2 = n3;
        a = n3;
        a.f = false;
        a.g = false;
        if (a != 1) {
            b = 0;
        }
        if (a == 3) {
            e = 0;
            o.b(0);
            a.c = 250;
            j = 0;
            a.l = 1;
            a.i = 1;
            a.k = 0;
            m = 0;
            a.f = true;
            f = 4;
            j.b(0, 15);
            a.a[0] = a.d[0] == 0 ? a.b(665) : a.b(648);
            j.b(16, 25);
            a.a[1] = a.d[1] == 0 ? a.b(666) : a.b(649);
            j.b(26, 35);
            a.a[2] = a.d[2] == 0 ? a.b(667) : a.b(650);
            j.b(36, 49);
            a.a[3] = a.d[3] == 0 ? a.b(668) : a.b(651);
        }
        if (a == 2 || a == 0) {
            a.a[0] = a.a(a.s);
            a.a[0] = a.a[0].trim();
            f = 4;
            int n4 = n2 = a.a(a.b[a.a[1]][40], 1);
            while (n2 == n4) {
                n4 = a.a(a.b[a.a[2]][40], 2);
            }
            int n5 = n2;
            while (n5 == n4 || n2 == n5) {
                n5 = a.a(a.b[a.a[3]][40], 3);
            }
            j.a("cRules.java:469:iCharacterID[WEST]:" + a.a[1]);
            a.a[1] = a.b(n2 + 68);
            j.a("cRules.java:472:iCharacterID[NORTH]:" + a.a[2]);
            a.a[2] = a.b(n4 + 68);
            j.a("cRules.java:475:iCharacterID[EAST]:" + a.a[3]);
            a.a[3] = a.b(n5 + 68);
        }
        if (a != 1 || b == 0) {
            a.d();
        }
        c = 0;
    }

    public static int a() {
        return a;
    }

    public static void b(int n2) {
        i = n2;
        if (i == 1) {
            f = 2;
        }
    }

    public static void a(int n2, boolean bl) {
        n |= n2;
    }

    public static void a() {
        n = 0;
    }

    public static boolean a() {
        return j == 1;
    }

    public static boolean a(n n2, int n3) {
        return o.a() && n2.a(n3, 0, true);
    }

    public static boolean b() {
        return m == 1;
    }

    public static boolean c() {
        if (i == 1) {
            return true;
        }
        return f == 2;
    }

    public static int b() {
        int n2 = 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            if (a.a[i2].a != 2) continue;
            --n2;
        }
        return n2;
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

    public static void c(int n2) {
        a.a(10, false);
        a.b.b(-1, -1);
        a.b.b(0, 1);
        a.b.a(0);
        if (n2 == 0) {
            a.b.a(c.bA, c.f_ * 3 / 4);
        } else if (n2 == 1) {
            a.b.a((c.e_ << 1) / 5, c.bB);
        } else if (n2 == 2) {
            a.b.a(c.bA, c.f_ / 4);
        } else if (n2 == 3) {
            a.b.a(c.e_ * 3 / 5, c.bB);
        }
        a.a[0] = a.a(a.b);
        c = false;
    }

    public static boolean a(int n2) {
        int n3;
        if (!o.b()) {
            return false;
        }
        o = n3 = n2;
        int n4 = o.a(n2, a);
        while (n4 != n2) {
            if (a.a[n4].d(a.n, a.o, true) && (a.n < 10 || n4 == 0)) {
                p = n3 = n4;
                d = true;
                if (n4 != 0) {
                    o.c(n4);
                } else {
                    a.e(153, 1);
                }
                return true;
            }
            n4 = o.a(n4, a);
        }
        if (a.a[n2].d(a.n, a.o, true) && (a.n < 10 || n2 == 0)) {
            p = n3 = n2;
            d = true;
            if (n4 != 0) {
                o.c(n2);
            } else {
                a.e(153, 1);
            }
            return true;
        }
        return false;
    }

    public static boolean g() {
        return d;
    }

    public static void b() {
        d = false;
        int n2 = -1;
        o = -1;
        n2 = -1;
        p = -1;
    }

    public static int d() {
        return o.a(a.p, a);
    }

    public static int a(int n2, boolean bl) {
        n2 = bl ? (n2 + 1) % 4 : (n2 + 4 - 1) % 4;
        if (a.a[n2].a == 2) {
            n2 = o.a(n2, bl);
        }
        return n2;
    }

    public static int e() {
        return o.b(a.p, a);
    }

    private static int b(int n2, boolean bl) {
        n2 = !bl ? (n2 + 1) % 4 : (n2 + 4 - 1) % 4;
        if (a.a[n2].a == 2) {
            n2 = o.b(n2, bl);
        }
        return n2;
    }

    public static void a(int n2, r r2) {
        l = 50;
        r2.e = true;
        r2.b(r2.a.a(0));
        n n3 = r2.a;
        r2.a(a.n, a.o);
        int n4 = 0;
        while (true) {
            c c2 = n3;
            if (n4 >= c2.a) break;
            c2 = n3.a(n4);
            if (d) {
                if (n.a(((q)c2).a, a.b.b.a) && ((q)c2).b == a.b.b.b) {
                    r2.b(r2.a.a(((q)c2).c));
                }
            } else if (n.a(((q)c2).a, a.b.b.a)) {
                r2.b(r2.a.a(((q)c2).c));
            }
            ++n4;
        }
    }

    public static void a(r r2) {
        l = 0;
        r2.e = false;
    }

    public static void a(r r2, boolean bl) {
        r2.f = bl;
    }

    public static void b(r r2) {
        if (--l <= 0) {
            boolean bl;
            if (d) {
                if (a.b.b.a()) {
                    a.q = 10;
                    a.a[a.p].a();
                    a.p = o.a(o, a);
                    o.b();
                    a.a[a.p].b();
                } else if (a.b.b.a == 11) {
                    a.q = 10;
                    a.a[a.p].a();
                    a.p = o.a(o, a);
                    o.b();
                    a.a[a.p].b();
                    a.a[a.p].c = true;
                } else if (a.b.b.a == 10) {
                    a = !a;
                    a.q = 10;
                    if (o.b() == 2) {
                        b = true;
                    } else {
                        a.a[a.p].a();
                        a.p = o.a(o, a);
                        o.b();
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
                    a.p = o.a(o, a);
                    o.b();
                    a.a[a.p].b();
                    a.a[a.p].d = true;
                    a.a(a.b, 2);
                } else if (a.b.b.a == 13) {
                    a.a[a.p].a();
                    a.p = o;
                    a.a[a.p].b();
                    o.b();
                    a.a(4);
                    a.a[a.p].i = true;
                    a.a[a.p].k = false;
                } else if (a.b.b.a == 14) {
                    a.a[a.p].a();
                    a.p = o;
                    a.a[a.p].b();
                    o.b();
                    a.a(4);
                    a.a(a.b, 2);
                    a.a[o.a((int)a.p, (boolean)o.a)].g = true;
                    a.a[o.a(a.p, a)].a(14, -1);
                    a.a[a.p].i = true;
                    a.a[a.p].k = false;
                }
                o.b();
                o.a(r2);
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
            o.a(r2);
            v0.f = bl = true;
        }
    }

    public static int a(int n2) {
        return (n2 + 2) % 4;
    }

    static {
        d = 0;
        e = 0;
        a = true;
        b = false;
        a = new int[][]{{50, 100, 150}, {50, 100, 150}, {50, 100, 150}, {100, 150, 200}, {20, 50, 80}};
        int[] nArray = new int[]{-1, -1, 1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1};
        int[][] nArrayArray = new int[][]{{0, 1, -1, 0, 0}, {0, 4, -1, 0, 1}, {0, 10, -1, 0, 2}, {1, 4, -1, 0, 3}, {1, 10, -1, 0, 4}, {2, 15, -1, 0, 5}, {3, 10, -1, 0, 6}, {4, 1, 2, 0, 7}, {5, 1, -1, 0, 8}, {6, 5, -1, 0, 9}, {7, 5, -1, 0, 10}, {8, 5, -1, 0, 11}, {9, 4, -1, 0, 12}, {10, 1, -1, 0, 13}, {11, 1, -1, 0, 14}, {12, 1, -1, 0, 15}, {13, 1, -1, 0, 16}, {14, 1, -1, 0, 17}, {15, 1, -1, 0, 18}, {16, 1, -1, 0, 19}, {17, 1, -1, 0, 20}, {18, 1, -1, 0, 21}, {19, 8, -1, 0, 22}, {20, 1, -1, 0, 23}, {21, 20, -1, 0, 24}, {22, 300, -1, 0, 25}, {23, 5000, -1, 0, 26}, {24, 1, -1, 0, 27}, {25, 3, -1, 0, 28}, {26, 1, -1, 0, 29}, {27, 5, -1, 1, 1}, {27, 10, -1, 1, 2}, {27, 15, 0, 1, 3}, {27, 15, 1, 1, 4}, {27, 15, 2, 1, 5}, {28, -1, -1, 2, -1}, {29, -1, -1, 3, -1}, {-1, -1, -1, 4, -1}};
        i = 0;
        j = 0;
        k = -1;
        l = 0;
        m = 0;
        o = -1;
        p = -1;
        c = false;
        d = false;
        e = false;
        f = false;
    }
}

