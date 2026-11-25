/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class r
implements c,
d {
    public n a;
    public int a;
    public int b;
    public int c;
    private boolean q;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int d;
    public int e;
    public int f;
    public boolean k;
    public boolean l;
    private boolean r;
    public int g;
    public int h;
    public int i;
    public boolean[] a = new boolean[5];
    public int j = 0;
    public int k = -1;
    public boolean m;
    public int l = 0;
    public int m = 0;
    public int n;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean o;
    static final int[] a = new int[]{0, 40, 100};
    static final int[] b = new int[]{50, 30, 0};
    static final int[] c = new int[]{50, 80, 100};
    private static int[] e;
    private static int[] f;
    static final int[] d;
    private static int[] g;
    private static int[] h;
    private static int[] i;
    private static int[] j;
    public static boolean p;

    public final int a() {
        c c2;
        int n2 = 0;
        if (c2.b != 0) {
            c2 = c2.a.a;
            while (c2 != null) {
                ++n2;
                c2 = ((q)c2).b;
            }
        } else {
            c2 = c2.a;
            n2 = ((n)c2).a;
        }
        return n2;
    }

    public final void a() {
        if (a.a[a.a(this.b)].a() != 11) {
            a.a[a.a(this.b)].d(a.b[a.a(this.b)]);
        }
        this.q = false;
        this.a(a.n, a.o);
        q.b = false;
        a.a[this.b] = true;
        o.e = false;
    }

    public final void b() {
        ++a.e;
        if (a.a[a.a(this.b)].a() != 11) {
            a.a[a.a(this.b)].d(4);
        }
        r r2 = this;
        if (r2.m > 0) {
            --r2.m;
            if (r2.m == 0) {
                n n2 = r2.a;
                q q2 = n2.a;
                while (q2 != null) {
                    q2.c();
                    q2.a(n2.d);
                    q2 = q2.b;
                }
                a.d(r2.b, 1);
            }
        }
        this.q = true;
        this.r = true;
        this.l = false;
        this.i = false;
        this.j = false;
        this.k = false;
        if (!o.b()) {
            this.b = false;
        }
        this.e = -1;
        this.a(a.n, a.o);
        if (a.f) {
            a.b = true;
        } else {
            a.a[this.b] = true;
        }
        if (this.b == 0) {
            if (o.a != 3) {
                a.a(29, false);
            }
            if (o.b()) {
                o.f = false;
            }
            if (o.b() && !o.e && !this.b) {
                a.b(32, 0, true);
                a.a(32, 1, false);
            }
        } else if (o.b() && !o.f) {
            a.b(32, 0, true);
        }
        if (this.l > 0) {
            --this.l;
            if (this.l == 0 && a.a[this.b].a() == 18 + this.b) {
                a.a[this.b].b(-1, -1);
            }
        }
    }

    public final q a(int n2) {
        q q2 = this.a.a(0);
        for (int i2 = 0; i2 < n2; ++i2) {
            q2 = r.a(this.a, i2);
            if (o.a == 3 || this.a != 0 || a.m == 0) continue;
            ++a.d;
        }
        n n3 = this.a;
        boolean bl = this.a = n3.a < 2;
        if (n2 >= 2) {
            a.b(this.b, n2);
            if (this.b == 0 && this.d == -1) {
                this.b(this.a.a(0));
            }
        }
        this.a.b();
        if (n2 == 1) {
            a.a[this.c].a(20, false);
        }
        return q2;
    }

    public final void c() {
        q q2;
        boolean bl;
        int n2 = 0;
        do {
            q2 = r.a(this.a, n2);
            if (o.a != 3 && this.a == 0) {
                ++a.d;
            }
            ++n2;
        } while (!(bl = n.a(q2.a, a.n) || q2.b == a.o || q2.a == 13 || q2.a == 14));
        n n3 = this.a;
        boolean bl2 = this.a = n3.a < 2;
        if (n2 >= 1 && this.b == 0 && this.d == -1) {
            this.b(this.a.a(0));
        }
        this.a.b();
        a.a[this.b] = true;
    }

    private static q a(n n2, int n3) {
        int n4 = a.a(false);
        q q2 = a.a.a(n4);
        int n5 = q2.b;
        int n6 = q2.a;
        n n7 = n2;
        n7.d(n6, n5, false);
        int n8 = n2.c;
        n.a(a.a, n4, n2, n8);
        if (a.m != 0) {
            q2.m = n3 * 7 + 1;
        }
        if (a.d) {
            q2.a(true, 6, a.a.d, n2);
        } else {
            q2.a(true, 7, a.a.d, n2);
        }
        a.a = q2;
        if (a.a.a == null) {
            a.f();
        }
        return q2;
    }

    public final int a(int n2, int n3) {
        int n4;
        int n5;
        this.i = 0;
        boolean bl = this.h = !this.a.b(n3, 0, false);
        if (o.a() && (this.d || this.g)) {
            if (this.d) {
                this.d = false;
                this.a.a(12, 0, true);
            } else if (this.g) {
                this.g = false;
                this.a.a(14, 0, true);
            }
            return this.a.c;
        }
        if (o.g()) {
            o.b();
            this.a.d(a.n, a.o, true);
            return this.a.c;
        }
        int n6 = o.d();
        int n7 = o.d();
        n n8 = a.a[n6].a;
        int n9 = n8.a;
        for (n5 = 0; n5 < 3; ++n5) {
            n7 = o.a(n7, o.a);
            n8 = a.a[n7].a;
            if (n8.a >= n9) continue;
            n6 = n7;
        }
        int n10 = n5 = n6 == o.d() && j.b(0, 100) < e[this.n] ? 1 : 0;
        if (o.d() == 0 && j.b(0, 100) < f[this.n]) {
            n5 = 0;
        }
        int n11 = n6 = n6 == o.e() && j.b(0, 100) < e[this.n] ? 1 : 0;
        if (o.e() == 0 && j.b(0, 100) < f[this.n]) {
            n6 = 0;
        }
        int[] nArray = new int[5];
        int[] nArray2 = new int[5];
        int n12 = -1;
        int n13 = 1;
        int n14 = 1;
        q q2 = this.a.a;
        while (q2 != null) {
            if (q2.e > 0) {
                int n15 = q2.b;
                nArray[n15] = nArray[n15] + 1;
            }
            int n16 = q2.b;
            nArray2[n16] = nArray2[n16] + 1;
            q2 = q2.b;
        }
        for (int i2 = 1; i2 < 5; ++i2) {
            if (nArray[i2] >= nArray[n13]) {
                n13 = i2;
            }
            if (nArray2[i2] >= nArray2[n14]) {
                n14 = i2;
            }
            if (nArray[i2] > 0 && n12 == -1) {
                n12 = i2;
                continue;
            }
            if (nArray[i2] <= 0 || nArray2[i2] < nArray2[n12]) continue;
            n12 = i2;
        }
        int[] nArray3 = new int[5];
        int n17 = 1;
        int n18 = -1;
        q2 = a.a[0].a.a;
        while (q2 != null) {
            int n19 = q2.b;
            nArray3[n19] = nArray3[n19] + 1;
            q2 = q2.b;
        }
        for (n4 = 1; n4 < 5; ++n4) {
            if (nArray3[n4] >= nArray3[n17]) {
                n17 = n4;
            }
            if (n18 == -1) {
                if (nArray[n4] <= 0 || nArray3[n4] <= 0) continue;
                n18 = n4;
                continue;
            }
            if (nArray[n4] <= 0 || nArray3[n4] <= nArray3[n18]) continue;
            n18 = n4;
        }
        if (0 == nArray[n13]) {
            n12 = -1;
            n18 = -1;
        }
        int n20 = n4 = j.b(0, 100) < f[this.n] ? 1 : 0;
        if (o.a == 1 && o.g == 0 && a.bq == 0) {
            n4 = 1;
        }
        if (n4 != 0 && n18 != -1) {
            int n21;
            int n22;
            n n23;
            if (n18 == n3 ? this.a.c(n18, 0, true) : n2 != 12 && n2 != 11 && (n23 = this.a).d(n22 = n2, n21 = n18, false)) {
                return this.a.c;
            }
            if (this.a.a(13, 0, false)) {
                this.i = nArray2[n18] > 0 ? n18 : (n14 != -1 ? n14 : j.b(1, 5));
                return this.a.c;
            }
            if (o.d() != 0 && (this.h || j.b(0, 100) < d[this.n]) && this.a.a(14, 0, false)) {
                this.i = nArray2[n18] > 0 ? n18 : (n14 != -1 ? n14 : j.b(1, 5));
                return this.a.c;
            }
        }
        if (n12 == -1) {
            if ((j.b(0, 100) < i[this.n] || !this.a.a(14, 0, false)) && this.a.a(13, 0, false)) {
                this.i = n4 != 0 && j.b(0, 100) < h[this.n] && nArray2[n17] > 0 ? n17 : (n14 != -1 ? n14 : j.b(1, 5));
                return this.a.c;
            }
            if (this.a.a(14, 0, false)) {
                this.i = n4 != 0 && j.b(0, 100) < h[this.n] && nArray2[n17] > 0 ? n17 : (n14 != -1 ? n14 : j.b(1, 5));
                return this.a.c;
            }
        } else if (o.f()) {
            if (j.b(0, 100) < g[this.n]) {
                if (j.b(0, 100) < j[this.n] && this.a.c(n12, 0, true)) {
                    return this.a.c;
                }
                if (this.a.b(n12, 0, true)) {
                    return this.a.c;
                }
            }
            if (j.b(0, 100) < j[this.n] && this.a.c(n3, 0, true)) {
                return this.a.c;
            }
            if (this.a.a(n2, 0, true)) {
                return this.a.c;
            }
            if (this.a.b(n3, 0, true)) {
                return this.a.c;
            }
            if (this.a.a(13, 0, false)) {
                this.i = j.b(0, 100) < g[this.n] ? n14 : j.b(1, 5);
                return this.a.c;
            }
            if (this.a.a(14, 0, false)) {
                this.i = j.b(0, 100) < g[this.n] ? n14 : j.b(1, 5);
                return this.a.c;
            }
        } else {
            if (n5 != 0) {
                if ((this.h || j.b(0, 100) < d[this.n]) && this.a.a(14, 0, false)) {
                    this.i = j.b(0, 100) < g[this.n] ? n14 : j.b(1, 5);
                    return this.a.c;
                }
                n n24 = this.a;
                int n25 = 12;
                int n26 = n12;
                if (n24.d(n25, n26, false) && this.a.a((int)this.a.c).e > 0 && !this.a.a((int)this.a.c).a) {
                    return this.a.c;
                }
                if (this.a.a(12, 0, true)) {
                    return this.a.c;
                }
                n24 = this.a;
                n25 = 11;
                n26 = n12;
                if (n24.d(n25, n26, false) && this.a.a((int)this.a.c).e > 0 && !this.a.a((int)this.a.c).a) {
                    return this.a.c;
                }
                if (this.a.a(11, 0, true)) {
                    return this.a.c;
                }
                n24 = this.a;
                n25 = 10;
                n26 = n12;
                if (n24.d(n25, n26, false) && this.a.a((int)this.a.c).e > 0 && !this.a.a((int)this.a.c).a) {
                    return this.a.c;
                }
                if (this.a.a(10, 0, true)) {
                    return this.a.c;
                }
            }
            if (n6 != 0 && this.a.a(14, 0, false)) {
                n n27 = this.a;
                int n28 = 10;
                int n29 = n12;
                if (n27.d(n28, n29, false) && this.a.a((int)this.a.c).e > 0 && !this.a.a((int)this.a.c).a) {
                    return this.a.c;
                }
                if (this.a.a(10, 0, true)) {
                    return this.a.c;
                }
            }
            if (j.b(0, 100) < g[this.n]) {
                if ((n6 != 0 || j.b(0, 100) < j[this.n]) && this.a.c(n12, 0, true)) {
                    return this.a.c;
                }
                if (this.a.b(n12, 0, true)) {
                    return this.a.c;
                }
            }
            if ((n6 != 0 || j.b(0, 100) < j[this.n]) && this.a.c(n3, 0, true)) {
                return this.a.c;
            }
            if (this.a.b(n3, 0, true)) {
                return this.a.c;
            }
            if (this.a.a(n2, 0, true)) {
                return this.a.c;
            }
            if (this.a.a(13, 0, false)) {
                this.i = j.b(0, 100) < g[this.n] ? n14 : j.b(1, 5);
                return this.a.c;
            }
            if (this.a.a(14, 0, false)) {
                this.i = j.b(0, 100) < g[this.n] ? n14 : j.b(1, 5);
                return this.a.c;
            }
        }
        return -1;
    }

    public final void a(q c2) {
        if (a.f) {
            a.b = true;
        } else {
            a.a[this.b] = true;
        }
        if (a.d) {
            c2.a(true, 4, this.a.d, a.b);
        } else {
            c2.a(true, 7, this.a.d, a.b);
        }
        n n2 = a.b;
        n.a(this.a, this.e, a.b, n2.a);
        a.a = c2;
        switch (c2.a) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                a.a[a.p].a(9, false);
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                a.a[a.p].a(5, false);
            }
        }
        c2 = this;
        int n3 = j.b(a.e[0], a.e[1] + 1);
        ((r)c2).j += n3;
        c2 = this;
        if (((r)c2).k != -1 && ((r)c2).j >= a.e[2 + ((r)c2).k]) {
            ((r)c2).j = 0;
            switch (((r)c2).k) {
                case 1: {
                    c c3 = c2;
                    for (int i2 = 0; i2 < 4; ++i2) {
                        int n4;
                        n n5;
                        if (a.a[i2].a == 2) continue;
                        if (i2 == a.p) {
                            a.a[i2].a(5, false);
                            continue;
                        }
                        if (o.d == 2 && i2 == o.a(a.p)) continue;
                        if (a.a[i2].l > 0) {
                            a.c(i2, 0);
                            a.a[i2].a(14, false);
                            continue;
                        }
                        a.a[i2].d(a.b[((r)c3).b]);
                        a.a[i2].a(12, true);
                        n2 = n5 = a.a[i2].a;
                        int n6 = n5.a / 2;
                        n2 = n5;
                        if (n2.a % 2 == 1) {
                            ++n6;
                        }
                        n n7 = n5;
                        int n8 = n6;
                        n2 = n7;
                        n2 = n7;
                        int n9 = n7.a;
                        int[] nArray = new int[n9];
                        int[] nArray2 = new int[n8];
                        int n10 = 0;
                        for (n4 = 0; n4 < n8; ++n4) {
                            nArray[n4] = 1;
                        }
                        for (n4 = n8; n4 < n9; ++n4) {
                            nArray[n4] = 0;
                        }
                        for (n4 = 0; n4 < n9; ++n4) {
                            n8 = j.b(0, n9);
                            int n11 = j.b(0, n9);
                            int n12 = nArray[n8];
                            nArray[n8] = nArray[n11];
                            nArray[n11] = n12;
                        }
                        for (n4 = 0; n4 < n9; ++n4) {
                            if (nArray[n4] != 1) continue;
                            nArray2[n10] = n4;
                            ++n10;
                        }
                        for (n8 = 0; n8 < n6; ++n8) {
                            q q2 = n5.a(n8);
                            q2.b();
                            q2.a(n5.d);
                        }
                        a.c(i2, 1);
                        a.a[i2].m = 3;
                        a.a = true;
                    }
                    j.a("cPlayer.java:1006:activateFreezePower");
                    a.a(8, false);
                    a.b(1);
                    break;
                }
                case 3: {
                    c c4 = c2;
                    for (int i3 = 0; i3 < 4; ++i3) {
                        if (a.a[i3].a == 2) continue;
                        if (i3 == a.p) {
                            a.a[i3].a(18, false);
                            continue;
                        }
                        if (o.d == 2 && i3 == o.a(a.p)) continue;
                        if (a.a[i3].l > 0) {
                            a.c(i3, 0);
                            a.a[i3].a(14, false);
                            continue;
                        }
                        a.a[i3].a(2);
                        a.c(i3, 3);
                        a.a[i3].d(a.b[((r)c4).b]);
                        a.a[i3].a(7, true);
                    }
                    a.b(3);
                    break;
                }
                case 2: {
                    c c5 = c2;
                    int n13 = a.p;
                    for (int i4 = 0; i4 < 4; ++i4) {
                        if (a.a[i4].a == 2 || i4 == a.p || o.d == 2 && i4 == o.a(a.p)) continue;
                        n n14 = a.a[i4];
                        n2 = n14;
                        n2 = a.a[n13];
                        if (n14.a < n2.a || n13 == a.p) {
                            n13 = i4;
                            continue;
                        }
                        n n15 = a.a[i4];
                        n2 = n15;
                        n2 = a.a[n13];
                        if (n15.a != n2.a || j.b(0, 2) != 0) continue;
                        n13 = i4;
                    }
                    if (n13 != a.p) {
                        if (a.a[n13].l > 0) {
                            a.c(n13, 0);
                            a.a[n13].a(14, false);
                        } else {
                            a.a[n13].a(4);
                            a.c(n13, 2);
                            a.a[n13].d(a.b[((r)c5).b]);
                            a.a[n13].a(28, true);
                        }
                    }
                    a.b(2);
                    break;
                }
                case 4: {
                    for (n3 = 0; n3 < 4; ++n3) {
                        if (a.a[n3].a == 2) continue;
                        if (n3 == a.p) {
                            a.a[n3].a(29, true);
                            continue;
                        }
                        if (o.d == 2 && n3 == o.a(a.p)) continue;
                        if (a.a[n3].l > 0) {
                            a.c(n3, 0);
                            a.a[n3].a(14, false);
                            continue;
                        }
                        n n16 = a.a[n3].a;
                        q q3 = n16.a;
                        while (q3 != null) {
                            if (q3.b()) {
                                q3.a();
                                q3.a(n16.d);
                                break;
                            }
                            q3 = q3.b;
                        }
                        a.c(n3, 4);
                        a.a[n3].a(8, false);
                    }
                    a.b(4);
                    break;
                }
                case 0: {
                    a.a[a.p].l = 2;
                    a.c(a.p, 0);
                    a.b(0);
                    a.a[a.p].a(14, false);
                }
            }
            if (((r)c2).m) {
                ((r)c2).k = j.b(0, 5);
            }
        }
        this.a.b();
        a.a(20, false);
        ++this.g;
        if (o.b()) {
            this.b = false;
        }
    }

    public final void d() {
        if (this.g > this.h) {
            this.h = this.g;
        }
        this.g = 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1, int var2_2) {
        block24: {
            block25: {
                block26: {
                    this.f = 0;
                    this.k = true;
                    var3_5 = this.a.a;
                    while (var3_5 != null) {
                        if (o.g()) {
                            if (n.a(var1_1, var3_5.a) && var3_5.b == var2_2) {
                                ++this.f;
                                var3_5.e = 1;
                                this.k = false;
                            } else {
                                var3_5.e = 0;
                            }
                        } else if (o.a() && (var1_1 == 14 && this.g || var1_1 == 12 && this.d)) {
                            if (n.a(var1_1, var3_5.a) && !this.f && !var3_5.a) {
                                ++this.f;
                                var3_5.e = 1;
                                this.k = false;
                            } else {
                                var3_5.e = 0;
                            }
                        } else if ((n.a(var3_5.a, var1_1) || var3_5.b == var2_2 || var3_5.a == 13 || var3_5.a == 14) && !var3_5.a) {
                            if (this.c || this.d || this.g || !this.q) {
                                var3_5.e = 0;
                            } else {
                                if (!(var3_5.a == 14 && a.l == 0 && this.a.b(var2_2, 0, false) || var3_5.a)) {
                                    ++this.f;
                                    var3_5.e = 1;
                                } else {
                                    var3_5.e = 0;
                                }
                                if (a.i == 0 && var3_5.a != 14 && var3_5.a != 13) {
                                    // empty if block
                                }
                            }
                        } else {
                            var3_5.e = 0;
                        }
                        if (this.b == 0) {
                            var3_5.a(0);
                        }
                        var3_5 = var3_5.b;
                    }
                    if (this.l) {
                        this.k = false;
                    }
                    if (!this.r) break block24;
                    if (this.k) break block25;
                    if (!a.a()) break block26;
                    if (this.d < 0) {
                        this.c(this.a.a(0));
                    }
                    var1_1 = 0;
                    var3_5 = this.a.a;
                    while (var3_5 != null && (var3_5.e == 0 || var3_5.a >= 13)) {
                        ++var1_1;
                        var3_5 = var3_5.b;
                    }
                    if (var1_1 <= 0) ** GOTO lbl-1000
                    var2_3 = this.a;
                    if (var1_1 < var2_3.a) {
                        this.c(this.a.a(var1_1));
                    } else if (this.a.a.a >= 13) {
                        this.c(this.a.a(0));
                    }
                    break block25;
                }
                if (this.d == -1) {
                    var2_4 = this.a;
                    this.c(this.a.a(var2_4.a / 2));
                }
            }
            this.r = false;
        }
    }

    public final void e() {
        if (a.m != 8 || a.h == 4 || a.h == 0) {
            int n2;
            int n3;
            c c2 = c2.a;
            q q2 = ((n)c2).a;
            c c3 = c2;
            int n4 = ((n)c3).a;
            if (((n)c2).d == 0) {
                n3 = n4 > 5 ? (!a.f && !a.a() ? q.h + 135 + 6 * (n4 - 5) : q.h + 108 + 6 * (n4 - 5)) : (!a.f && !a.a() ? q.h + n4 * 27 : q.h + 27 * (n4 - 1));
                n2 = c.e_ - n3 >> 1;
                if (n2 + n3 > 600) {
                    n2 = 600 - n3;
                }
            } else {
                n3 = n4 > 5 ? q.h + (q.j << 2) + q.k * (n4 - 5) : q.h + q.j * (n4 - 1);
                n2 = ((n)c2).d == 2 ? (c.e_ + n3 >> 1) - (q.h >> 1) : (((n)c2).d == 1 ? (c.f_ - n3 >> 1) + (q.h >> 2) : (c.f_ + n3 >> 1) - (q.h >> 2));
            }
            while (q2 != null) {
                if (((n)c2).d == 0) {
                    int cfr_ignored_0 = ((n)c2).a.d;
                    int cfr_ignored_1 = q2.c;
                }
                q2.a(((n)c2).d, n2, ((n)c2).a.d);
                q2 = q2.b;
                if (q2 == null) continue;
                if (((n)c2).d == 0 && q2.c == ((n)c2).a.d + 1) {
                    n2 += 40;
                    continue;
                }
                if (((n)c2).d == 0 || ((n)c2).d == 1) {
                    n2 += q2.a(((n)c2).a.d, n4, ((n)c2).d == 0);
                    continue;
                }
                n2 -= q2.a(((n)c2).a.d, n4, ((n)c2).d == 0);
            }
        }
    }

    public final void a(boolean bl) {
        if (a.m != 8 || a.h == 4 || a.h == 0) {
            this.a.a(bl);
        }
    }

    public final void f() {
        if (a.m != 8 || a.h == 4 || a.h == 0) {
            this.a.a(false);
            this.a.a(true);
        }
    }

    public final void g() {
        a.h();
        a.b[this.b].b(0, 1);
        a.a[a.a(this.b)].d(11);
        a.a[a.a(this.b)].a(11, true);
        if (o.d == 2) {
            a.a[o.a(a.a(this.b))].d(11);
            a.a[o.a(a.a(this.b))].a(11, true);
        }
        a.a[4] = a.a(a.b[this.b]);
        this.a = true;
        a.c(0);
        a.a(28, false);
    }

    public final void b(q q2) {
        this.c(q2);
        q.b = true;
    }

    private void c(q q2) {
        q q3;
        if (q2 == null) {
            this.d = -1;
            q.c = false;
            return;
        }
        if (this.d != -1 && (q3 = this.a.a(this.d)) != null) {
            q3.l = -1;
            q.c = false;
        }
        this.d = this.a.a(q2);
        q2.l = 0;
        q.c = false;
    }

    static {
        int[] nArray = new int[]{20, 70, 100};
        e = new int[]{0, 40, 100};
        f = new int[]{100, 0, 0};
        int[] nArray2 = new int[]{50, 80, 100};
        d = new int[]{60, 50, 30};
        g = new int[]{0, 70, 100};
        h = new int[]{90, 0, 0};
        i = new int[]{60, 30, 10};
        j = new int[]{100, 70, 30};
        p = false;
    }
}

