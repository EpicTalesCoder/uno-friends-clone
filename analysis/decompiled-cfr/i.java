/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
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
    int[] a;
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
    private p a = new int[33];
    private static i c;

    i() {
    }

    static void a(int n2) {
        if ((c[n2] & 1) == 0) {
            i i2 = a[n2];
            while (i2 != null) {
                i i3 = i2.a;
                i2.c();
                i2 = i3;
            }
        }
    }

    static void b(int n2) {
        if ((c[n2] & 4) == 0) {
            i i2 = a[n2];
            while (i2 != null) {
                i2.d();
                i2 = i2.a;
            }
        }
    }

    static void a() {
        for (int i2 = 1; i2 < 8; ++i2) {
            i.c(i2);
        }
    }

    static void c(int n2) {
        while (a[n2] != null) {
            a[n2].b();
        }
    }

    final void b() {
        if (this.p == -1) {
            return;
        }
        if (this.b != null) {
            this.b.a = this.a;
        } else {
            i.a[this.p] = this.a;
        }
        if (this.a != null) {
            this.a.b = this.b;
        } else {
            i.b[this.p] = this.b;
        }
        this.p = -1;
        this.a = null;
        this.b = null;
    }

    public final void a(int n2, int[] nArray) {
        this.a = n2;
        switch (this.a) {
            case 42: {
                this.b = new int[45];
                this.b[41] = 1;
                this.b[44] = 0;
                this.b[41] = 1;
                this.b[42] = 0;
                this.b[43] = 0;
                this.b[40] = 0;
                this.b[39] = -4;
                this.n = nArray[0];
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
                for (n2 = 0; n2 < this.a.length; ++n2) {
                    this.a[n2] = new p();
                }
                boolean bl = false;
                k k2 = a.a;
                int[][] nArray2 = new int[18][9];
                k2.a(nArray2, 0);
                this.a = nArray2;
                return;
            }
            case 22: {
                this.b = nArray[0];
                this.c = nArray[1];
                this.q = nArray[2];
                this.b = new int[7];
                e e2 = a.a[nArray[3]];
                this.w = j.b(0, e2.b - 1);
                int n3 = j.b(nArray[4], nArray[5] + 1);
                this.a = new p(e2, this.b, this.c);
                this.a.b(n3, -1);
                this.a.b();
                return;
            }
        }
        this.a = n2;
    }

    final void c() {
        if (this.a != null) {
            this.a.b(j.a_);
        }
        switch (this.a) {
            case 42: {
                i i2 = this;
                this.h = 0;
                while (i2.i - m.a >= 0) {
                    i2.i -= m.a;
                    ++i2.h;
                }
                i2.i += j.a_;
                this.k();
                return;
            }
            case 43: {
                if (this.b[3] > 0 && this.b[7] > 0) {
                    if (this.a.a()) {
                        this.b();
                    }
                } else if (this.b[4] > 0) {
                    this.t += j.a_;
                    if (this.t > this.b[4]) {
                        this.b();
                    }
                }
                if (this.b[8] != 0) {
                    i i3 = this;
                    this.d = i3.b - p.a(0);
                    i3.e = i3.c - p.b(0);
                    this.d += this.r;
                    this.e += this.s;
                }
                if (this.b[3] > 0) {
                    this.a.a(this.d, this.e);
                }
                return;
            }
            case 22: {
                this.b[6] = this.b[6] + j.a_;
                if (this.b[6] > 1200) {
                    this.b();
                    return;
                }
                int n2 = j.c(this.b[6]) / 1200;
                j.a(this.b[0], this.b[1], this.b[4], this.b[5], this.b[2], this.b[3], n2);
                this.b = j.d_;
                this.c = j.bC;
                this.a.a().e(this.w);
                this.a.a(this.b, this.c);
            }
        }
    }

    public final void d() {
        switch (this.a) {
            case 42: {
                if (this.f != -1) {
                    for (int i2 = 0; i2 < this.g; ++i2) {
                        Object object = this.a[i2];
                        int[] nArray = this.a[i2 + 1];
                        ((p)object).a(this.d + nArray[7], this.e + nArray[8]);
                        if ((((p)object).c & 0x800000) != 0) continue;
                        if (i2 == this.d[5] && this.b[37] >= 0) {
                            int[] nArray2 = new int[]{0, 0};
                            int[] nArray3 = new int[]{0, 0};
                            int[] nArray4 = this.a[this.d[2]].a();
                            int[] nArray5 = a.a[96 + this.b[37]].a(0);
                            nArray = this.a[this.d[2] + 1];
                            int[] nArray6 = new int[]{0, 0, 0, 0};
                            int[] nArray7 = new int[]{0, 0, 0, 0};
                            nArray6[0] = j.i();
                            nArray6[1] = j.j();
                            nArray6[2] = j.k();
                            nArray6[3] = j.l();
                            if (this.a()) {
                                nArray4[0] = -nArray4[0];
                                nArray5[0] = -nArray5[0];
                                nArray7[0] = nArray6[0];
                                nArray7[1] = this.e + nArray4[1] + nArray[8] + nArray5[1];
                                nArray7[2] = this.d + nArray4[0] + nArray[7] + nArray5[0] - nArray7[0];
                                nArray7[3] = nArray6[1] + nArray6[3] - nArray7[1];
                            } else {
                                nArray7[0] = this.d + nArray4[0] + nArray[7] + nArray5[0];
                                nArray7[1] = this.e + nArray4[1] + nArray[8] + nArray5[1];
                                nArray7[2] = nArray6[0] + nArray6[2] - nArray7[0];
                                nArray7[3] = nArray6[1] + nArray6[3] - nArray7[1];
                            }
                            j.a(nArray7[0], nArray7[1], nArray7[2], nArray7[3]);
                            ((p)object).c();
                            j.a(nArray6[0], nArray6[1], nArray6[2], nArray6[3]);
                        } else {
                            ((p)object).c();
                        }
                        if (i2 == this.d[4] && this.b[35] >= 0) {
                            object = this.a[this.d[4]].a();
                            nArray = this.a[this.d[4] + 1];
                            new StringBuffer().append("CreatureDrawAccesories(): no marker for current frame for petID .").append(this.n);
                            int n2 = 0;
                            if (this.a()) {
                                n2 = 1;
                                object[0] = -object[0];
                            }
                            a.a[84 + this.b[35]].e(this.b[36]);
                            a.a[84 + this.b[35]].a(j.b, 0, this.d + object[0] + nArray[7], this.e + object[1] + nArray[8], n2);
                        }
                        if (i2 != this.d[5] || this.b[37] < 0) continue;
                        object = this.a[this.d[2]].a();
                        nArray = this.a[this.d[2] + 1];
                        new StringBuffer().append("CreatureDrawAccesories(): no marker for current frame for petID .").append(this.n);
                        int n3 = 0;
                        if (this.a()) {
                            n3 = 1;
                            object[0] = -object[0];
                        }
                        a.a[96 + this.b[37]].e(this.b[38]);
                        a.a[96 + this.b[37]].a(j.b, 0, this.d + object[0] + nArray[7], this.e + object[1] + nArray[8], n3);
                    }
                }
                return;
            }
            case 43: {
                if (this.b[3] > 0) {
                    this.a.a(this.d, this.e);
                    this.a.c();
                    break;
                }
                e e2 = a.a[this.b[0]];
                e2.a(j.b, this.b[1], this.d, this.e, 0);
                return;
            }
            case 22: {
                int n4 = j.c(this.b[6]) / 1200;
                j.h(13);
                int n5 = 200 - j.d(n4 * 100);
                n4 = 255 - j.d(n4 * 255);
                j.a(13, 1, n5);
                j.a(13, 2, n4);
                this.a.c();
                j.a(13, 2, 100);
                j.p();
            }
        }
    }

    public final void e() {
        i i2 = this;
        i2.a[0] = 0;
        i2.a[1] = 1;
        i2.a[2] = 2;
        i2.a[3] = 3;
        i2.a[4] = 4;
        i2.a[5] = 5;
        i2.a[6] = 6;
        i2.a[7] = 7;
        i2.a[8] = 8;
        i2.a[9] = 9;
        i2.a[10] = 10;
        i2.a[11] = 11;
        i2.a[12] = 12;
        i2.a[13] = 13;
        i2.a[14] = 14;
        i2.a[15] = 15;
        i2.a[18] = 18;
        i2.a[20] = 20;
        i2.a[21] = 21;
        i2.a[22] = 22;
        i2.a[23] = 23;
        i2.a[24] = 24;
        i2.a[25] = 25;
        i2.a[26] = 26;
        i2.a[27] = 27;
        i2.a[28] = 28;
        i2.a[29] = 29;
        i2.a[30] = 30;
        i2.a[31] = 32;
        i2.a[32] = 31;
        this.a(this.a[1], true);
        this.f();
    }

    private void k() {
        try {
            for (int i2 = 0; i2 < this.h; ++i2) {
                this.b();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d(int n2) {
        this.o = n2;
    }

    public final int a() {
        return this.o;
    }

    private int b() {
        try {
            if (this.f == -1) {
                return -1;
            }
            k k2 = a.a.a[this.f];
            int n2 = this.a[0][0];
            for (int i2 = 0; i2 < k2.a; ++i2) {
                int[] nArray = this.a[i2 + 1];
                int[] nArray2 = nArray;
                nArray[4] = j.c(nArray2[4], nArray2[0]);
                nArray2[5] = j.c(nArray2[5], nArray2[1]);
                nArray2[7] = this.b[41] * j.d(nArray2[4]);
                nArray2[8] = j.d(nArray2[5]);
                if (nArray2[3] != -1 && n2 == k2.a[i2].a[nArray2[3]].a[0]) {
                    k k3 = k2.a[i2].a[nArray2[3]];
                    block38: for (int i3 = 0; i3 < k3.a; ++i3) {
                        k k4 = k3.a[i3];
                        switch (k4.a[0]) {
                            case 42: {
                                if ((nArray2[6] & 1) != 0) continue block38;
                                this.a[i2].a(k4.a[1], -1, false);
                                continue block38;
                            }
                            case 41: {
                                nArray2[7] = this.b[41] * k4.a[1];
                                nArray2[8] = k4.a[2];
                                nArray2[0] = k4.a[3];
                                nArray2[1] = k4.a[4];
                                nArray2[4] = j.c(k4.a[1]);
                                nArray2[5] = j.c(k4.a[2]);
                                continue block38;
                            }
                            case 43: {
                                this.a[i2].c |= k4.a[1];
                                if (this.b[41] != -1 || (k4.a[1] & 1) == 0) continue block38;
                                this.a[i2].c ^= 1;
                                continue block38;
                            }
                            case 44: {
                                this.a[i2].c &= ~k4.a[1];
                                if (this.b[41] != -1 || (k4.a[1] & 1) == 0) continue block38;
                                this.a[i2].c ^= 1;
                                continue block38;
                            }
                            case 106: {
                                this.j = k4.a[1];
                                this.k = k4.a[2];
                                this.m = 0;
                                continue block38;
                            }
                            case 105: {
                                int n3;
                                if (k4.a[1] == -1) continue block38;
                                if (this.d[k4.a[1]] != -1) {
                                    this.a[i2].a(this.a[this.d[k4.a[1]]].d());
                                }
                                this.d[k4.a[1]] = i2;
                                switch (k4.a[1]) {
                                    case 0: {
                                        n3 = 109;
                                        nArray2[6] = nArray2[6] | 1;
                                        break;
                                    }
                                    case 1: {
                                        n3 = 152;
                                        break;
                                    }
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: {
                                        n3 = 109;
                                        break;
                                    }
                                    case 10: 
                                    case 11: {
                                        n3 = 151;
                                        break;
                                    }
                                    case 5: {
                                        n3 = 129 + this.b[11];
                                        break;
                                    }
                                    case 4: {
                                        n3 = 110 + this.b[7];
                                        break;
                                    }
                                    case 3: {
                                        n3 = 153 + this.b[9];
                                        break;
                                    }
                                    case 2: {
                                        n3 = 152;
                                        nArray2[6] = nArray2[6] | 1;
                                        break;
                                    }
                                    case 12: {
                                        n3 = 160 + this.b[25];
                                        break;
                                    }
                                    case 13: {
                                        n3 = 160 + this.b[27];
                                        break;
                                    }
                                    case 14: {
                                        n3 = 160 + this.b[29];
                                        break;
                                    }
                                    case 15: {
                                        n3 = 160 + this.b[31];
                                        break;
                                    }
                                    case 16: {
                                        n3 = 160 + this.b[33];
                                        break;
                                    }
                                    default: {
                                        n3 = 152;
                                    }
                                }
                                if (a.a[n3] != this.a[i2].a()) {
                                    this.a[i2].a(a.a[n3]);
                                    this.a[i2].a(0, -1, false);
                                }
                                this.a[i2].c = this.b[41] == -1 ? 1 : 0;
                            }
                        }
                    }
                    nArray2[3] = nArray2[3] < k2.a[i2].a - 1 ? nArray2[3] + 1 : 0;
                }
                this.a[i2].b(j.a_);
            }
            if (n2 == 0) {
                this.f();
            }
            if (n2 >= k2.a[3]) {
                n2 = 0;
                i i4 = this;
                switch (i4.m) {
                    case 0: {
                        i4.m = 1;
                        i4.a(i4.j, true);
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        i4.m = 3;
                        i i5 = i4;
                        switch (i5.b[43]) {
                            case 1: {
                                if (i5.m != 3) break;
                                i5.a(false);
                                i5.b = i5.t;
                                i5.b[43] = 0;
                            }
                        }
                        i4.a(i4.l, true);
                        break;
                    }
                    case -1: 
                    case 3: {
                        switch (i4.b[43]) {
                            case 0: {
                                i4.a(i4.o, false);
                            }
                        }
                    }
                }
            }
            this.a[0][0] = ++n2;
            return n2;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            throw exception;
        }
    }

    final void a(int[] nArray) {
        boolean bl;
        i i2 = this;
        if (i2.f == -1) {
            bl = true;
        } else {
            k k2 = a.a.a[i2.f];
            int n2 = i2.a[0][0];
            bl = n2 >= k2.a[3];
        }
        if (bl) {
            int n3;
            int n4 = j.b(0, nArray.length);
            v1.o = n3 = this.a[nArray[n4]];
        }
    }

    private void l() {
        for (int i2 = 0; i2 < this.g; ++i2) {
            this.a[i2].c ^= 1;
        }
        this.k();
    }

    public final void a(boolean bl) {
        if (bl) {
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

    public final void a(int n2, boolean n3) {
        switch (this.m) {
            case -1: 
            case 3: {
                i i2 = this;
                this.j = -1;
                i2.k = -1;
                i2.l = -1;
                i2.m = -1;
                break;
            }
            default: {
                if (n2 == this.j || n2 == this.k) break;
                this.l = n2;
                n2 = this.k;
                this.m = 2;
            }
        }
        if (this.f != n2 || n3 != 0) {
            this.f = n2;
            this.g = a.a.a[this.f].a;
            for (n3 = 0; n3 < this.g; ++n3) {
                this.a[n3].a();
            }
            a.a.a(this.a, n2);
            this.h = 1;
            this.k();
        }
    }

    public final void f() {
        int n2 = this.a[this.d[4]].a();
        this.a[this.d[4]].a(a.a[110 + this.b[7]]);
        this.a[this.d[4]].a(n2, -1, false);
        this.a[this.d[4]].a(this.b[8]);
        n2 = this.a[this.d[3]].a();
        this.a[this.d[3]].a(a.a[153 + this.b[9]]);
        this.a[this.d[3]].a(n2, -1, false);
        this.a[this.d[3]].a(this.b[10]);
        n2 = this.a[this.d[5]].a();
        this.a[this.d[5]].a(a.a[129 + this.b[11]]);
        this.a[this.d[5]].a(n2, -1, false);
        this.a[this.d[5]].a(this.b[12]);
        n2 = this.a[this.d[12]].a();
        this.a[this.d[12]].a(a.a[160 + this.b[25]]);
        this.a[this.d[12]].a(n2, -1, false);
        this.a[this.d[12]].a(this.b[26]);
        n2 = this.a[this.d[13]].a();
        this.a[this.d[13]].a(a.a[160 + this.b[27]]);
        this.a[this.d[13]].a(n2, -1, false);
        this.a[this.d[13]].a(this.b[28]);
        n2 = this.a[this.d[14]].a();
        this.a[this.d[14]].a(a.a[160 + this.b[29]]);
        this.a[this.d[14]].a(n2, -1, false);
        this.a[this.d[14]].a(this.b[30]);
        n2 = this.a[this.d[15]].a();
        this.a[this.d[15]].a(a.a[160 + this.b[31]]);
        this.a[this.d[15]].a(n2, -1, false);
        this.a[this.d[15]].a(this.b[32]);
        n2 = this.a[this.d[16]].a();
        this.a[this.d[16]].a(a.a[160 + this.b[33]]);
        this.a[this.d[16]].a(n2, -1, false);
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
        this.b[1] = a.b(a.t);
        this.b[2] = a.b(a.u);
        this.b[3] = a.b(a.v);
        this.b[4] = a.b(a.w);
        this.b[5] = a.b(a.x);
        this.b[6] = a.b(a.y);
        this.b[7] = a.b(a.z);
        this.b[8] = a.b(a.A);
        this.b[9] = a.b(a.B);
        this.b[10] = a.b(a.C);
        this.b[11] = a.b(a.D);
        this.b[12] = a.b(a.E);
        this.b[13] = a.b(a.F);
        this.b[14] = a.b(a.G);
        this.b[15] = a.b(a.H);
        this.b[16] = a.b(a.I);
        this.b[17] = a.b(a.J);
        this.b[18] = a.b(a.K);
        this.b[19] = a.b(a.L);
        this.b[20] = a.b(a.M);
        this.b[21] = a.b(a.N);
        this.b[22] = a.b(a.O);
        this.b[23] = a.b(a.P);
        this.b[24] = a.b(a.Q);
        this.b[25] = a.b(a.R);
        this.b[26] = a.b(a.S);
        this.b[27] = a.b(a.T);
        this.b[28] = a.b(a.U);
        this.b[29] = a.b(a.V);
        this.b[30] = a.b(a.W);
        this.b[31] = a.b(a.X);
        this.b[32] = a.b(a.Y);
        this.b[33] = a.b(a.Z);
        this.b[34] = a.b(a.aa);
        this.b[35] = a.b(a.ab);
        this.b[36] = a.b(a.ac);
        this.b[37] = a.b(a.ad);
        this.b[38] = a.b(a.ae);
        this.b[44] = a.b(a.af);
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
        if (a.f[38] == 0 && a.f[39] == 0 && a.f[40] == 0 && a.f[41] == 0 && a.f[44] == 0 && a.f[45] == 0 && a.f[46] == 0 && a.f[47] == 0 && a.f[48] == 0 && a.f[49] == 0 && a.f[62] == 0 && a.f[63] == 0 && a.f[64] == 0 && a.f[65] == 0 && a.f[66] == 0 && a.f[67] == 0 && a.f[68] == 0 && a.f[69] == 0 && a.f[70] == 0 && a.f[71] == 0 && a.f[72] == 0 && a.f[73] == 0 && a.f[74] == 0 && a.f[75] == 0) {
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

    public final void a(int n2, int n3, int n4) {
        switch (n2) {
            case 0: {
                this.b[3] = n3;
                this.b[4] = n4;
                if (this.b[44] == 0) {
                    a.f[2] = n3;
                    a.f[3] = n4;
                    return;
                }
                a.f[40] = n3;
                a.f[41] = n4;
                return;
            }
            case 1: {
                this.b[5] = n3;
                this.b[6] = n4;
                if (this.b[44] == 0) {
                    a.f[4] = n3;
                    a.f[5] = n4;
                    return;
                }
                a.f[42] = n3;
                a.f[43] = n4;
                return;
            }
            case 5: {
                this.b[11] = n3;
                this.b[12] = n4;
                if (this.b[44] == 0) {
                    a.f[10] = n3;
                    a.f[11] = n4;
                    return;
                }
                a.f[48] = n3;
                a.f[49] = n4;
                return;
            }
            case 4: {
                this.b[7] = n3;
                this.b[8] = n4;
                if (this.b[44] == 0) {
                    a.f[6] = n3;
                    a.f[7] = n4;
                    return;
                }
                a.f[44] = n3;
                a.f[45] = n4;
                return;
            }
            case 3: {
                this.b[9] = n3;
                this.b[10] = n4;
                if (this.b[44] == 0) {
                    a.f[8] = n3;
                    a.f[9] = n4;
                    return;
                }
                a.f[46] = n3;
                a.f[47] = n4;
                return;
            }
            case 2: {
                this.b[1] = n3;
                this.b[2] = n4;
                if (this.b[44] == 0) {
                    a.f[0] = n3;
                    a.f[1] = n4;
                    return;
                }
                a.f[38] = n3;
                a.f[39] = n4;
                return;
            }
            case 6: {
                this.b[13] = n3;
                this.b[14] = n4;
                if (this.b[44] == 0) {
                    a.f[12] = n3;
                    a.f[13] = n4;
                    return;
                }
                a.f[50] = n3;
                a.f[51] = n4;
                return;
            }
            case 7: {
                this.b[15] = n3;
                this.b[16] = n4;
                if (this.b[44] == 0) {
                    a.f[14] = n3;
                    a.f[15] = n4;
                    return;
                }
                a.f[52] = n3;
                a.f[53] = n4;
                return;
            }
            case 8: {
                this.b[17] = n3;
                this.b[18] = n4;
                if (this.b[44] == 0) {
                    a.f[16] = n3;
                    a.f[17] = n4;
                    return;
                }
                a.f[54] = n3;
                a.f[55] = n4;
                return;
            }
            case 9: {
                this.b[19] = n3;
                this.b[20] = n4;
                if (this.b[44] == 0) {
                    a.f[18] = n3;
                    a.f[19] = n4;
                    return;
                }
                a.f[56] = n3;
                a.f[57] = n4;
                return;
            }
            case 10: {
                this.b[21] = n3;
                this.b[22] = n4;
                if (this.b[44] == 0) {
                    a.f[20] = n3;
                    a.f[21] = n4;
                    return;
                }
                a.f[58] = n3;
                a.f[59] = n4;
                return;
            }
            case 11: {
                this.b[23] = n3;
                this.b[24] = n4;
                if (this.b[44] == 0) {
                    a.f[22] = n3;
                    a.f[23] = n4;
                    return;
                }
                a.f[60] = n3;
                a.f[61] = n4;
                return;
            }
            case 12: {
                this.b[25] = n3;
                this.b[26] = n4;
                if (this.b[44] == 0) {
                    a.f[24] = n3;
                    a.f[25] = n4;
                    return;
                }
                a.f[62] = n3;
                a.f[63] = n4;
                return;
            }
            case 13: {
                this.b[27] = n3;
                this.b[28] = n4;
                if (this.b[44] == 0) {
                    a.f[26] = n3;
                    a.f[27] = n4;
                    return;
                }
                a.f[64] = n3;
                a.f[65] = n4;
                return;
            }
            case 14: {
                this.b[29] = n3;
                this.b[30] = n4;
                if (this.b[44] == 0) {
                    a.f[28] = n3;
                    a.f[29] = n4;
                    return;
                }
                a.f[66] = n3;
                a.f[67] = n4;
                return;
            }
            case 15: {
                this.b[31] = n3;
                this.b[32] = n4;
                if (this.b[44] == 0) {
                    a.f[30] = n3;
                    a.f[31] = n4;
                    return;
                }
                a.f[68] = n3;
                a.f[69] = n4;
                return;
            }
            case 16: {
                this.b[33] = n3;
                this.b[34] = n4;
                if (this.b[44] == 0) {
                    a.f[32] = n3;
                    a.f[33] = n4;
                    return;
                }
                a.f[70] = n3;
                a.f[71] = n4;
                return;
            }
            case 18: {
                this.b[37] = n3;
                this.b[38] = n4;
                if (this.b[44] == 0) {
                    a.f[36] = n3;
                    a.f[37] = n4;
                    return;
                }
                a.f[74] = n3;
                a.f[75] = n4;
                return;
            }
            case 17: {
                this.b[35] = n3;
                this.b[36] = n4;
                if (this.b[44] == 0) {
                    a.f[34] = n3;
                    a.f[35] = n4;
                    return;
                }
                a.f[72] = n3;
                a.f[73] = n4;
            }
        }
    }

    public final int[] a() {
        int[] nArray = new int[2];
        int[] nArray2 = nArray;
        nArray[0] = 0;
        nArray2[1] = this.b[4];
        return nArray2;
    }

    public final int[] a(int n2) {
        int[] nArray = new int[2];
        switch (n2) {
            case 0: {
                nArray[0] = this.b[3];
                nArray[1] = this.b[4];
                break;
            }
            case 1: {
                nArray[0] = this.b[5];
                nArray[1] = this.b[6];
                break;
            }
            case 5: {
                nArray[0] = this.b[11];
                nArray[1] = this.b[12];
                break;
            }
            case 4: {
                nArray[0] = this.b[7];
                nArray[1] = this.b[8];
                break;
            }
            case 3: {
                nArray[0] = this.b[9];
                nArray[1] = this.b[10];
                break;
            }
            case 2: {
                nArray[0] = this.b[1];
                nArray[1] = this.b[2];
                break;
            }
            case 6: {
                nArray[0] = this.b[13];
                nArray[1] = this.b[14];
                break;
            }
            case 7: {
                nArray[0] = this.b[15];
                nArray[1] = this.b[16];
                break;
            }
            case 8: {
                nArray[0] = this.b[17];
                nArray[1] = this.b[18];
                break;
            }
            case 9: {
                nArray[0] = this.b[19];
                nArray[1] = this.b[20];
                break;
            }
            case 10: {
                nArray[0] = this.b[21];
                nArray[1] = this.b[22];
                break;
            }
            case 11: {
                nArray[0] = this.b[23];
                nArray[1] = this.b[24];
                break;
            }
            case 12: {
                nArray[0] = this.b[25];
                nArray[1] = this.b[26];
                break;
            }
            case 13: {
                nArray[0] = this.b[27];
                nArray[1] = this.b[28];
                break;
            }
            case 14: {
                nArray[0] = this.b[29];
                nArray[1] = this.b[30];
                break;
            }
            case 15: {
                nArray[0] = this.b[31];
                nArray[1] = this.b[32];
                break;
            }
            case 16: {
                nArray[0] = this.b[33];
                nArray[1] = this.b[34];
                break;
            }
            case 17: {
                nArray[0] = this.b[35];
                nArray[1] = this.b[36];
                break;
            }
            case 18: {
                nArray[0] = this.b[37];
                nArray[1] = this.b[38];
            }
        }
        j.a("cActor_Creature.h:3004:Creature_GetPart() ret: " + nArray[0] + ", " + nArray[1]);
        return nArray;
    }

    public final void j() {
        Object object = this;
        if (((i)object).b[44] == 0) {
            a.f[0] = ((i)object).b[1];
            a.f[1] = ((i)object).b[2];
            a.f[2] = ((i)object).b[3];
            a.f[3] = ((i)object).b[4];
            a.f[4] = ((i)object).b[5];
            a.f[5] = ((i)object).b[6];
            a.f[6] = ((i)object).b[7];
            a.f[7] = ((i)object).b[8];
            a.f[8] = ((i)object).b[9];
            a.f[9] = ((i)object).b[10];
            a.f[10] = ((i)object).b[11];
            a.f[11] = ((i)object).b[12];
            a.f[12] = ((i)object).b[13];
            a.f[13] = ((i)object).b[14];
            a.f[14] = ((i)object).b[15];
            a.f[15] = ((i)object).b[16];
            a.f[16] = ((i)object).b[17];
            a.f[17] = ((i)object).b[18];
            a.f[18] = ((i)object).b[19];
            a.f[19] = ((i)object).b[20];
            a.f[20] = ((i)object).b[21];
            a.f[21] = ((i)object).b[22];
            a.f[22] = ((i)object).b[23];
            a.f[23] = ((i)object).b[24];
            a.f[24] = ((i)object).b[25];
            a.f[25] = ((i)object).b[26];
            a.f[26] = ((i)object).b[27];
            a.f[27] = ((i)object).b[28];
            a.f[28] = ((i)object).b[29];
            a.f[29] = ((i)object).b[30];
            a.f[30] = ((i)object).b[31];
            a.f[31] = ((i)object).b[32];
            a.f[32] = ((i)object).b[33];
            a.f[33] = ((i)object).b[34];
            a.f[34] = ((i)object).b[35];
            a.f[35] = ((i)object).b[36];
            a.f[36] = ((i)object).b[37];
            a.f[37] = ((i)object).b[38];
        } else {
            a.f[38] = ((i)object).b[1];
            a.f[39] = ((i)object).b[2];
            a.f[40] = ((i)object).b[3];
            a.f[41] = ((i)object).b[4];
            a.f[42] = ((i)object).b[5];
            a.f[43] = ((i)object).b[6];
            a.f[44] = ((i)object).b[7];
            a.f[45] = ((i)object).b[8];
            a.f[46] = ((i)object).b[9];
            a.f[47] = ((i)object).b[10];
            a.f[48] = ((i)object).b[11];
            a.f[49] = ((i)object).b[12];
            a.f[50] = ((i)object).b[13];
            a.f[51] = ((i)object).b[14];
            a.f[52] = ((i)object).b[15];
            a.f[53] = ((i)object).b[16];
            a.f[54] = ((i)object).b[17];
            a.f[55] = ((i)object).b[18];
            a.f[56] = ((i)object).b[19];
            a.f[57] = ((i)object).b[20];
            a.f[58] = ((i)object).b[21];
            a.f[59] = ((i)object).b[22];
            a.f[60] = ((i)object).b[23];
            a.f[61] = ((i)object).b[24];
            a.f[62] = ((i)object).b[25];
            a.f[63] = ((i)object).b[26];
            a.f[64] = ((i)object).b[27];
            a.f[65] = ((i)object).b[28];
            a.f[66] = ((i)object).b[29];
            a.f[67] = ((i)object).b[30];
            a.f[68] = ((i)object).b[31];
            a.f[69] = ((i)object).b[32];
            a.f[70] = ((i)object).b[33];
            a.f[71] = ((i)object).b[34];
            a.f[72] = ((i)object).b[35];
            a.f[73] = ((i)object).b[36];
            a.f[74] = ((i)object).b[37];
            a.f[75] = ((i)object).b[38];
        }
        ((i)object).i();
        this.b[44] = this.b[44] == 0 ? 1 : 0;
        object = this;
        if (((i)object).b[44] == 0) {
            ((i)object).b[1] = a.f[0];
            ((i)object).b[2] = a.f[1];
            ((i)object).b[3] = a.f[2];
            ((i)object).b[4] = a.f[3];
            ((i)object).b[5] = a.f[4];
            ((i)object).b[6] = a.f[5];
            ((i)object).b[7] = a.f[6];
            ((i)object).b[8] = a.f[7];
            ((i)object).b[9] = a.f[8];
            ((i)object).b[10] = a.f[9];
            ((i)object).b[11] = a.f[10];
            ((i)object).b[12] = a.f[11];
            ((i)object).b[13] = a.f[12];
            ((i)object).b[14] = a.f[13];
            ((i)object).b[15] = a.f[14];
            ((i)object).b[16] = a.f[15];
            ((i)object).b[17] = a.f[16];
            ((i)object).b[18] = a.f[17];
            ((i)object).b[19] = a.f[18];
            ((i)object).b[20] = a.f[19];
            ((i)object).b[21] = a.f[20];
            ((i)object).b[22] = a.f[21];
            ((i)object).b[23] = a.f[22];
            ((i)object).b[24] = a.f[23];
            ((i)object).b[25] = a.f[24];
            ((i)object).b[26] = a.f[25];
            ((i)object).b[27] = a.f[26];
            ((i)object).b[28] = a.f[27];
            ((i)object).b[29] = a.f[28];
            ((i)object).b[30] = a.f[29];
            ((i)object).b[31] = a.f[30];
            ((i)object).b[32] = a.f[31];
            ((i)object).b[33] = a.f[32];
            ((i)object).b[34] = a.f[33];
            ((i)object).b[35] = a.f[34];
            ((i)object).b[36] = a.f[35];
            ((i)object).b[37] = a.f[36];
            ((i)object).b[38] = a.f[37];
        } else {
            ((i)object).b[1] = a.f[38];
            ((i)object).b[2] = a.f[39];
            ((i)object).b[3] = a.f[40];
            ((i)object).b[4] = a.f[41];
            ((i)object).b[5] = a.f[42];
            ((i)object).b[6] = a.f[43];
            ((i)object).b[7] = a.f[44];
            ((i)object).b[8] = a.f[45];
            ((i)object).b[9] = a.f[46];
            ((i)object).b[10] = a.f[47];
            ((i)object).b[11] = a.f[48];
            ((i)object).b[12] = a.f[49];
            ((i)object).b[13] = a.f[50];
            ((i)object).b[14] = a.f[51];
            ((i)object).b[15] = a.f[52];
            ((i)object).b[16] = a.f[53];
            ((i)object).b[17] = a.f[54];
            ((i)object).b[18] = a.f[55];
            ((i)object).b[19] = a.f[56];
            ((i)object).b[20] = a.f[57];
            ((i)object).b[21] = a.f[58];
            ((i)object).b[22] = a.f[59];
            ((i)object).b[23] = a.f[60];
            ((i)object).b[24] = a.f[61];
            ((i)object).b[25] = a.f[62];
            ((i)object).b[26] = a.f[63];
            ((i)object).b[27] = a.f[64];
            ((i)object).b[28] = a.f[65];
            ((i)object).b[29] = a.f[66];
            ((i)object).b[30] = a.f[67];
            ((i)object).b[31] = a.f[68];
            ((i)object).b[32] = a.f[69];
            ((i)object).b[33] = a.f[70];
            ((i)object).b[34] = a.f[71];
            ((i)object).b[35] = a.f[72];
            ((i)object).b[36] = a.f[73];
            ((i)object).b[37] = a.f[74];
            ((i)object).b[38] = a.f[75];
        }
        ((i)object).f();
        if (this.b[44] == 0) {
            a.c(61, 17, true);
            a.c(61, 18, false);
        } else {
            a.c(61, 17, false);
            a.c(61, 18, true);
        }
        object = this.a(18);
        a.g(0, a.a(0, (int)object[0], (int)object[1]));
        object = this.a(17);
        a.g(1, a.a(1, (int)object[0], (int)object[1]));
        object = this.a(12);
        a.g(2, a.a(2, (int)object[0], (int)object[1]));
        object = this.a(5);
        a.g(3, a.a(3, (int)object[0], (int)object[1]));
        object = this.a(4);
        a.g(5, a.a(5, (int)object[0], (int)object[1]));
        object = this.a(3);
        a.g(6, a.a(6, (int)object[0], (int)object[1]));
        object = this.a();
        a.g(4, a.a(4, (int)object[0], (int)object[1]));
        a.g(7, a.a(7, a.br, 0));
        this.i();
    }

    public static i a(int n2, int n3, int n4, int n5, int n6, boolean bl, int n7, int n8, int n9, boolean bl2, int n10, int n11, boolean bl3, boolean bl4, int n12, boolean bl5) {
        n4 = n7;
        Object var2_3 = null;
        n7 = n4;
        int n13 = 43;
        i i2 = new i();
        new i().a = 43;
        i2.a(43, null);
        if (n7 > -1) {
            n8 = n7;
            i i3 = i2;
            if (i3.p != n8) {
                i3.p = n8;
                i i4 = i3;
                i3.u = i4.q;
                i i5 = null;
                i i6 = a[n8];
                while (i6 != null) {
                    i4 = i6;
                    if (i3.u <= i4.q) break;
                    i5 = i6;
                    i6 = i6.a;
                }
                i3.b = i5;
                i3.a = i6;
                if (i5 == null) {
                    i.a[n8] = i3;
                } else {
                    i5.a = i3;
                }
                if (i6 != null) {
                    i6.b = i3;
                } else {
                    i.b[n8] = i3;
                }
            }
        }
        c = i2;
        i2.b = n2;
        i.c.c = n3;
        i.c.q = 10;
        i.c.t = bl ? 1 : 0;
        i.c.b = new int[9];
        i.c.b[2] = 0;
        i.c.b[1] = n6;
        i.c.b[0] = n5;
        i.c.b[3] = bl ? 1 : 0;
        i.c.b[4] = -1;
        i.c.b[5] = 0;
        i.c.b[6] = -1;
        i.c.b[7] = bl4 ? 1 : 0;
        i.c.b[8] = 0;
        if (i.c.b[3] > 0) {
            i.c.a = new p(a.a[n5], i.c.b, i.c.c);
            i.c.a.b(n6, 1);
        }
        i.c.r = 0;
        i.c.s = 0;
        i.c.d = i.c.b;
        i.c.e = i.c.c;
        i.c.d += i.c.r;
        i.c.e += i.c.s;
        return c;
    }
}

