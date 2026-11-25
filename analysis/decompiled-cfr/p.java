/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class p
implements Runnable {
    int a;
    int b;
    int c;
    e a;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean a;
    private int i;
    private static int j = 62;
    private int k;
    private static final int l = 1;
    private static int m;
    private static int n;
    private static boolean b;
    private static byte[][] a;
    private static int[] a;
    private static boolean c;
    private static Player[] a;
    private static Player[] b;
    private static int[] b;
    private static int[] c;
    private static int[] d;
    private static int[] e;
    private static int[] f;
    private static int[] g;
    private static int[] h;
    private static int[] i;
    private static int[] j;

    p() {
        this.a();
    }

    p(e e2, int n2, int n3) {
        this.a();
        this.a = n2;
        this.b = n3;
        this.a(e2);
    }

    final void a() {
        this.a = 0;
        this.b = 0;
        this.d = -1;
        this.e = 0;
        this.a = null;
        this.c = 0;
        this.f = 0;
        this.h = 1;
        this.k = -1;
        this.a = true;
        this.i = -1;
    }

    final void a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    final e a() {
        return this.a;
    }

    final void a(e e2) {
        this.a = e2;
        if (e2 != null) {
            this.b(-1, -1);
            return;
        }
        this.d = -1;
    }

    final void a(int n2, int n3, boolean bl) {
        this.b(n2, -1);
    }

    final void b(int n2, int n3) {
        int n4 = -1;
        p p2 = this;
        if (p2.a || n2 != p2.d) {
            int n5;
            p2.d = n2;
            p2.g = j;
            p p3 = p2;
            if (p3.d < 0) {
                n5 = -1;
            } else {
                int n6;
                int n7 = p3.e();
                for (n6 = 0; n6 > n7; n6 -= n7) {
                }
                p3.e = n6;
                p3.f = 0;
                n5 = n6;
            }
            p2.h = n3 - 1;
            p2.a = false;
        }
    }

    final int a() {
        return this.d;
    }

    final void b() {
        this.e = j.b(0, this.e());
        this.f = 0;
    }

    final int b() {
        return this.e;
    }

    final int c() {
        if (this.a == null || this.d == -1) {
            return -1;
        }
        return this.a.c(this.d, this.e);
    }

    final void a(int n2) {
        this.k = n2;
    }

    final int d() {
        return this.k;
    }

    private int e() {
        int n2 = 1;
        if (this.d >= 0) {
            if (n2 != 0) {
                return this.a.a(this.d);
            }
            n2 = 0;
            for (int i2 = 0; i2 < this.a.a(this.d); ++i2) {
                n2 += this.a.a(this.d, i2);
            }
            return n2;
        }
        return -1;
    }

    final int[] a() {
        return this.a.a(this.d, this.e, null, 0, -1);
    }

    final boolean a() {
        if (this.d < 0) {
            return true;
        }
        if (this.h < 0) {
            return false;
        }
        return this.a;
    }

    final void c() {
        if (this.d < 0) {
            return;
        }
        if (this.i != -1 && this.i != 100) {
            j.h(13);
            j.j(this.i);
        }
        if (this.k != -1) {
            int n2 = this.a.f();
            this.a.e(this.k);
            this.a.a(j.b, this.d, this.e, this.a, this.b, this.c, 0, 0);
            this.a.e(n2);
        } else {
            this.a.a(j.b, this.d, this.e, this.a, this.b, this.c, 0, 0);
        }
        j.p();
    }

    final void b(int n2) {
        if (this.a || this.d < 0) {
            return;
        }
        p p2 = this;
        int n3 = p2.d >= 0 ? p2.a.a(p2.d, p2.e) * p2.g : 0;
        if (n3 == 0) {
            return;
        }
        if (this.f >= n3) {
            this.f -= n3;
            if (this.e < this.a.a(this.d) - 1) {
                ++this.e;
            } else if (this.h == 0) {
                this.a = true;
            } else {
                if (this.h > 0) {
                    --this.h;
                }
                this.e = 0;
            }
        }
        this.f += n2;
    }

    private static final int c(int n2) {
        while (n2 >= 7) {
            n2 -= 7;
        }
        while (n2 < 0) {
            n2 += 7;
        }
        return n2;
    }

    private static final int a(int n2, int n3) {
        return n2 * 7 * 5 + n3 * 5;
    }

    private static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        if (!b) {
            return;
        }
        int n9 = h[n2];
        int n10 = i[n2];
        n9 = p.c(n9 + n10);
        for (int i2 = 0; i2 < n10; ++i2) {
            n8 = p.c(n9 - i2 - 1);
            if (g[n8 = p.a(n2, n8)] != n3 || (n3 == 3 || n3 == 1) && g[n8 + 2] < n5) continue;
            p.g[n8] = 0;
        }
        n8 = p.a(n2, n9);
        p.g[n8] = n3;
        p.g[n8 + 1] = n4;
        p.g[n8 + 2] = n5;
        p.g[n8 + 3] = n6;
        p.g[n8 + 4] = n7;
        int n11 = n2;
        i[n11] = i[n11] + 1;
    }

    private static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        p.a(n2, n3, n4, n5, n6, n7);
    }

    private static void a(int n2, int[] nArray) {
        nArray[5] = i[n2];
        if (i[n2] > 0) {
            int n3 = p.a(n2, h[n2]);
            System.arraycopy(g, n3, nArray, 0, 5);
            p.h[n2] = p.c(h[n2] + 1);
            int n4 = n2;
            i[n4] = i[n4] - 1;
        }
    }

    static void c(int n2) {
        a = new Player[l];
        b = new Player[31];
        b = new int[l];
        c = new int[l];
        d = new int[l];
        e = new int[l];
        f = new int[l];
        g = new int[l * 7 * 5];
        h = new int[l];
        i = new int[l];
        j = new int[6];
        for (n2 = 0; n2 < l; ++n2) {
            p.b[n2] = -1;
            p.h[n2] = 0;
            p.i[n2] = 0;
        }
        n = 31;
        a = new byte[31][];
        a = new int[n];
        m = 100;
        b = true;
    }

    static final void a(String string, int n2) {
        boolean bl = true;
        bl = true;
        Object object = string;
        if (b && n2 >= 0) {
            j.b((String)object);
            byte[] byArray = j.a(n2);
            object = byArray;
            boolean bl2 = true;
            boolean bl3 = true;
            int n3 = n2;
            n2 = j.bD;
            byte[] byArray2 = byArray;
            if (b) {
                if (byArray2 == null || byArray2.length <= 0) {
                    return;
                }
                p.a[n3] = byArray2;
                p.a[n3] = n2;
                if (bl3) {
                    p.b[n3] = Manager.createPlayer((InputStream)new ByteArrayInputStream(a[n3]), (String)j.c(a[n3]));
                    p.a[n3] = null;
                }
            }
        }
    }

    static boolean a(int n2) {
        if (a != null && n2 < a.length && a[n2] != null) {
            return true;
        }
        return b != null && n2 < b.length && b[n2] != null;
    }

    static final void d(int n2) {
        p.b(n2, 2, -1, -1, -1, -1);
    }

    static void a(int n2, int n3, int n4, int n5, int n6) {
        if (n3 < 0 || n5 == 0) {
            return;
        }
        p.b(n2, 3, n3, n6, n5, n4);
    }

    private static void a(int n2, int n3, int n4) {
        if (d[n2] == 2 && c[n2] < n4) {
            return;
        }
        if (b[n2] == n3 && d[n2] != 0) {
            return;
        }
        n4 = b[n2];
        p.f(n2);
        int n5 = n3;
        Player player = null;
        p.a[n2] = player = b[n5];
        if (a[n2] == null) {
            if (a[n3] == null) {
                return;
            }
            p.a[n2] = Manager.createPlayer((InputStream)new ByteArrayInputStream(a[n3]), (String)j.c(a[n3]));
        }
        if (a[n2] == null) {
            return;
        }
        a[n2].realize();
        a[n2].prefetch();
        p.d[n2] = 1;
        p.b[n2] = n3;
        if (n4 >= 0 && n4 < n) {
            int n6;
            n5 = n4;
            if ((!b ? -1 : (n5 < 0 || n5 >= n || b == null || b[n5] == null ? -1 : (n6 = b[n5].getState()))) == 400) {
                b[n4].stop();
            }
        }
    }

    static void e(int n2) {
        if (!b) {
            return;
        }
        m = 100;
        try {
            for (n2 = 0; n2 < l; ++n2) {
                int n3 = e[n2];
                n3 = n2;
                if (b && a[n3] != null) continue;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static void d() {
        if (b) {
            for (int i2 = 0; i2 < l; ++i2) {
                int[] nArray = j;
                int n2 = i2;
                p.a(n2, nArray);
                if (j[5] <= 0) continue;
                if (d[i2] == 2) {
                    try {
                        n2 = p.b(i2) ? 1 : 0;
                    }
                    catch (Exception exception) {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        p.d[i2] = 1;
                    }
                }
                while (j[5] > 0) {
                    try {
                        switch (j[0]) {
                            case 1: {
                                p.a(i2, j[1], j[2]);
                                break;
                            }
                            case 2: {
                                p.f(i2);
                                break;
                            }
                            case 3: {
                                int n3 = j[3];
                                int n4 = j[4];
                                int n5 = j[2];
                                int n6 = j[1];
                                n2 = i2;
                                if (!j.h) {
                                    p.a(n2, n6, n5);
                                    if (!j.h && d[n2] == 1) {
                                        if (a[n2] == null) break;
                                        if (n4 == 0) {
                                            a[n2].setLoopCount(-1);
                                        } else {
                                            a[n2].setLoopCount(n4);
                                        }
                                        a[n2].start();
                                        p.d[n2] = 2;
                                        p.e[n2] = n3;
                                        p.f[n2] = n4;
                                        p.c[n2] = n5;
                                        p.b[n2] = n6;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                n2 = i2;
                                if (a[n2] != null) {
                                    a[n2].stop();
                                    p.d[n2] = 1;
                                }
                                break;
                            }
                            case 5: {
                                n2 = i2;
                                if (d[n2] == 2 && a[n2] != null) {
                                    a[n2].stop();
                                    p.d[n2] = 3;
                                }
                                break;
                            }
                            case 6: {
                                n2 = i2;
                                if (d[n2] == 3 && a[n2] != null) {
                                    a[n2].start();
                                    p.d[n2] = 2;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    catch (Exception exception) {}
                    nArray = j;
                    n2 = i2;
                    p.a(n2, nArray);
                }
            }
        }
    }

    public final void run() {
    }

    protected static boolean b(int n2) {
        if (!b) {
            return false;
        }
        if (n2 >= l || a[n2] == null) {
            return false;
        }
        boolean bl = true;
        if (a[n2].getState() != 400) {
            bl = false;
        }
        return bl;
    }

    private static void f(int n2) {
        if (!b) {
            return;
        }
        if (a[n2] != null) {
            a[n2].stop();
            a[n2].deallocate();
            int n3 = b[n2];
            if (n3 < 0 || b[n3] == null) {
                a[n2].close();
            }
            p.a[n2] = null;
        }
        p.d[n2] = 0;
        p.b[n2] = -1;
    }

    static void e() {
        int n2 = 0;
        while (n2 < l) {
            int n3 = n2++;
            int n4 = n3;
            n4 = 4;
            n4 = n3;
            p.b(n3, 4, -1, -1, -1, -1);
        }
        p.d();
    }

    static void f() {
        try {
            p.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean a(int n2, int n3) {
        return (null[15] & n3) != 0;
    }

    static final int a(int n2) {
        return (int)null[13];
    }

    static final int b(int n2) {
        if (p.a(0, 8)) {
            return (int)(null[6] - null[1] - null[14]);
        }
        return (int)null[14];
    }

    static {
        c = false;
    }
}

