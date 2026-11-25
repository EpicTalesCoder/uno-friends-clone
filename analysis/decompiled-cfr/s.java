/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s
implements Runnable,
CommandListener {
    private static String a = "2.2";
    private static String b = "IGP-Signature=" + a;
    private static String c = "";
    private static String d;
    private static Font a;
    private static String e;
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static boolean[] a;
    private static int[] a;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static int J;
    private static int K;
    private static int[] b;
    private static byte[][] a;
    private static int L;
    private static byte[] a;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    private static int Q;
    private static Image[] a;
    private static int R;
    private static int[] c;
    private static int S;
    private static int T;
    private static boolean a;
    private static String[] a;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;
    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private static String A;
    private static String B;
    private static String C;
    private static String D;
    private static String E;
    private static String F;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static String G;
    private static String[] b;
    private static String[] c;
    private static String[] d;
    private static String[] e;
    private static int U;
    private static int V;
    private static String[] f;
    private static short[] a;
    private static int W;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static long a;
    private static boolean i;
    private static MIDlet a;
    private static Canvas a;
    private static String H;
    private static boolean j;
    private static CommandListener a;
    private static s a;
    private static boolean k;
    private static String I;
    private static boolean l;
    private static boolean m;
    private static int X;
    private static int Y;
    private static int Z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static Image[] b;
    private static Image[] c;
    private static Image a;
    private static Image b;
    private static Image[] d;
    private static Image c;
    private static Image d;
    private static Image e;
    private static Image f;
    private static Image g;
    private static Image h;
    private static Image i;
    private static Image j;
    private static Image k;
    private static Image l;
    private static Image m;
    private static Image n;
    private static Image[] e;
    private static Image o;
    private static Image p;
    private static Image[][] a;
    private static String[][] a;
    private static int[][] a;
    private static int[][] b;
    private static int[] d;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static int an;
    private static String[] g;
    private static int[] e;
    private static boolean[] b;
    private static int ao;
    private static int ap;
    private static boolean n;
    private static byte a;
    private static byte b;
    private static int aq;
    private static boolean o;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static boolean p;
    private static String J;
    private static String K;
    private static String L;
    private static String M;
    private static String N;
    private static boolean q;
    private static int ax;
    private static int ay;
    private static int az;
    private static int aA;
    private static int aB;
    private static int aC;
    private static Command a;
    private static Command b;
    private static int aD;
    private static boolean r;
    private static boolean s;
    private static int aE;
    private static int aF;
    private static int aG;
    private static int aH;
    private static int aI;
    private static int aJ;
    private static int aK;
    private static Hashtable a;
    private static boolean t;
    private static int aL;
    private static boolean u;
    private static short[] b;

    private static boolean c() {
        s.b();
        try {
            InputStream inputStream = s.a("/dataIGP");
            K = inputStream.read() & 0xFF;
            b = new int[K += (inputStream.read() & 0xFF) << 8];
            int n2 = 0;
            while (n2 < K) {
                s.b[n2] = inputStream.read() & 0xFF;
                int n3 = n2;
                b[n3] = b[n3] + ((inputStream.read() & 0xFF) << 8);
                int n4 = n2;
                b[n4] = b[n4] + ((inputStream.read() & 0xFF) << 16);
                int n5 = n2++;
                b[n5] = b[n5] + ((inputStream.read() & 0xFF) << 24);
            }
            inputStream.close();
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    private static void b() {
        b = null;
        a = null;
        K = 0;
        System.gc();
    }

    private static byte[] a(int n2) {
        if (n2 < 0 || n2 >= K - 1) {
            return null;
        }
        int n3 = b[n2 + 1] - b[n2];
        if (n3 == 0) {
            return null;
        }
        byte[] byArray = null;
        try {
            InputStream inputStream = s.a("/dataIGP");
            inputStream.skip(2 + 4 * K + b[n2]);
            byArray = new byte[n3];
            for (n2 = byArray.length; n2 > 0; n2 -= inputStream.read(byArray)) {
            }
            inputStream.close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    private static int a(byte[] byArray) {
        return (byArray[L++] & 0xFF) + ((byArray[L++] & 0xFF) << 8);
    }

    private static byte[] a(byte[] byArray) {
        int n2 = s.a(byArray);
        byte[] byArray2 = new byte[n2];
        System.arraycopy(byArray, L, byArray2, 0, n2);
        L += n2;
        return byArray2;
    }

    private static Image a(byte[] byArray) {
        byArray = s.a(byArray);
        return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
    }

    private static String a(int n2) {
        return "" + f[n2];
    }

    private static int a(int n2, int n3) {
        if (aL != 0) {
            if (n3 == 0 || n3 == O) {
                int n4 = a[n2 * 6 + n3] & 0xFF;
                n2 = a[n2 * 6 + n3 + 1] & 0xFF;
                n2 = 0 | (n2 & 0xFF) << 8;
                return n2 |= n4 & 0xFF;
            }
            int n5 = a[n2 * 6 + n3] & 0xFF;
            return n5;
        }
        return a[(n2 << 2) + n3] & 0xFF;
    }

    private static void a(int n2, Graphics graphics, int n3, int n4, int n5) {
        s.a(s.a(n2), graphics, az, n3, n4, n5);
    }

    private static void a(String string, Graphics graphics, int n2, int n3, int n4, int n5) {
        s.a(string, graphics, n3, n4, n5);
    }

    private static void a(String string, Graphics graphics, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        char[] cArray = string.toCharArray();
        s.c[0] = 0;
        T = 0;
        int n11 = 0;
        int n12 = string.length();
        int n13 = 0;
        int[] nArray = new int[]{3633, 3636, 3637, 3638, 3639, 3640, 3641, 3642, 3655, 3656, 3657, 3658, 3659, 3660, 3661, 3662};
        if (az <= 176 && e[Z] == 4) {
            n13 += 2;
        }
        for (n10 = 0; n10 < n12; ++n10) {
            char c2 = cArray[n10];
            n9 = n11 < 10 ? 1 : 0;
            boolean bl = c2 == '\n';
            boolean bl2 = c2 == '\\';
            n8 = n10 != n12 - 1 && cArray[n10 + 1] == 'N' ? 1 : 0;
            n7 = n10 != n12 - 1 && cArray[n10 + 1] == 'n' ? 1 : 0;
            n6 = 0;
            for (n5 = 0; n5 < nArray.length; ++n5) {
                if (c2 != nArray[n5]) continue;
                n6 = 1;
                break;
            }
            if (n9 != 0 && (bl || bl2 && (n8 != 0 || n7 != 0))) {
                if (bl2 && (n8 != 0 || n7 != 0)) {
                    ++n10;
                }
                int n14 = n11;
                c[n14] = c[n14] - h;
                if (c[n11] > T) {
                    T = c[n11];
                }
                s.c[++n11] = 0;
                continue;
            }
            if (c2 == '\u0000' || c2 == '\u0001' || n6 != 0) continue;
            int n15 = n11;
            c[n15] = c[n15] + (s.a(c2, P) + h);
        }
        int n16 = n11;
        c[n16] = c[n16] - h;
        if (c[n11] > T) {
            T = c[n11];
        }
        S = (n11 + 1) * M + n11 * (n13 + 0);
        if (!a) {
            n3 += (n13 + 0) * n11 / 2;
            n11 = 0;
            if ((n4 & 0x20) != 0) {
                n3 -= S;
            } else if ((n4 & 2) != 0) {
                n3 -= S >> 1;
            }
            n9 = n2;
            boolean bl = true;
            boolean bl3 = false;
            s.a(graphics, 0, 0, az, aA);
            for (n10 = 0; n10 < n12; ++n10) {
                char c3 = cArray[n10];
                if (bl) {
                    n9 = n2;
                    if ((n4 & 8) != 0) {
                        n9 = n2 - c[n11];
                    } else if ((n4 & 1) != 0) {
                        n9 = n2 - (c[n11] >> 1);
                    }
                    bl = false;
                }
                int n17 = n11 < 10 ? 1 : 0;
                boolean bl4 = c3 == '\n';
                n8 = c3 == '\\' ? 1 : 0;
                n7 = n10 != n12 - 1 && cArray[n10 + 1] == 'N' ? 1 : 0;
                int n18 = n6 = n10 != n12 - 1 && cArray[n10 + 1] == 'n' ? 1 : 0;
                if (n17 != 0 && (bl4 || n8 != 0 && (n7 != 0 || n6 != 0))) {
                    if (n8 != 0 && (n7 != 0 || n6 != 0)) {
                        ++n10;
                    }
                    n3 += M + n13 - 1;
                    ++n11;
                    bl = true;
                    bl3 = true;
                    continue;
                }
                if (bl3) {
                    bl3 = false;
                    n5 = cArray[n10 - 2];
                    if (n5 == 32) {
                        n9 -= s.a(n5, P) + h >> 1;
                    }
                    if (c3 == ' ') {
                        n9 += s.a(c3, P) + h >> 1;
                        continue;
                    }
                }
                s.a(graphics, n9, n3, s.a(c3, P), s.a(c3, Q));
                for (n17 = 0; n17 < nArray.length; ++n17) {
                    if (c3 != nArray[n17]) continue;
                    n9 -= s.a(c3, P) + h;
                    break;
                }
                if (c3 == '\u0e33') {
                    n9 -= s.a(3585, P) / 2;
                }
                if (c3 >= '\u0e01' && c3 <= '\u0e5b') {
                    s.a(graphics, n9, n3, s.a(c3, P), s.a(c3, Q));
                }
                int n19 = n3;
                int n20 = n9;
                n5 = s.a(c3, Q);
                n6 = s.a(c3, P);
                n7 = s.a(c3, O);
                n8 = s.a(c3, 0);
                Image image = a[R];
                Graphics graphics2 = graphics;
                graphics2.drawRegion(image, n8, n7, n6, n5, 0, n20, n19, 20);
                n9 += s.a(c3, P) + h;
            }
            s.a(graphics, 0, 0, az, aA);
            return;
        }
        a = false;
    }

    public static void a(MIDlet object, Canvas canvas, int n2, int n3) {
        MIDlet mIDlet = object;
        object = null;
        object = mIDlet;
        az = n2;
        aA = n3;
        aB = az >> 1;
        aC = aA >> 1;
        d = aA;
        p = aA >= 160;
        e = (aA << 1) / 100;
        f = aA / 2;
        if (2 > az) {
            b = 2;
        }
        if (2 > az) {
            c = 2;
        }
        if (a == null && canvas != null) {
            a = object;
            a = canvas;
            s.c();
            object = b;
            new StringBuffer().append((String)object).append("");
            m = s.d();
            if (m && q) {
                m = false;
            }
            D = null;
            F = null;
            r = null;
            q = null;
            s = null;
            t = null;
            w = null;
            f = null;
            g = null;
            h = null;
            i = null;
            j = null;
            k = null;
            l = null;
            m = null;
            e = null;
            x = null;
            y = null;
            B = null;
            z = null;
            C = null;
            E = null;
            n = null;
            a = null;
            o = null;
            p = null;
            System.gc();
        }
    }

    private static boolean a(String string, int n2) {
        if (string == null) {
            return (n2 & 1) == 0;
        }
        string = string.trim();
        return !((n2 & 1) != 0 && string.length() == 0 || (n2 & 2) != 0 && string.toUpperCase().compareTo("DEL") == 0 || (n2 & 4) != 0 && (string.toUpperCase().compareTo("NO") == 0 || string.toUpperCase().compareTo("0") == 0));
    }

    private static String a(String string, String string2, String string3) {
        String string4 = "";
        try {
            if (string3 != null && string != null && string2 != null) {
                int n2 = string.indexOf(string2 + "=");
                string3 = string3.trim();
                if (n2 >= 0 && string3.length() > 0) {
                    int n3 = string.indexOf(E, n2 += string2.length() + 1);
                    if (n3 < 0) {
                        n3 = string.length();
                    }
                    string4 = string.substring(n2, n3);
                    if ((string4 = string4.trim()).length() == 0 || string4.compareTo("0") == 0 || string4.toUpperCase().compareTo("NO") == 0) {
                        string4 = "";
                    } else if (string4.toUpperCase().compareTo("DEL") != 0 && string2.compareTo("OP") != 0) {
                        int n4 = string3.indexOf(x);
                        string4 = n4 >= 0 ? string3.substring(0, n4) + string4 + string3.substring(n4 + x.length()) : string3;
                    }
                }
            }
        }
        catch (Exception exception) {
            string4 = "";
        }
        return string4;
    }

    private static void a(int n2, String string, int n3, String string2, String string3) {
        try {
            if (c) {
                String string4 = string2;
                string = s.a(a.getAppProperty(string4), string, string3);
            } else {
                String string5 = e + "-" + string;
                string = a.getAppProperty(string5);
            }
            boolean bl = s.a(string, 7);
            if (bl && (string.toUpperCase().compareTo("NO") != 0 || string.toUpperCase().compareTo("0") != 0)) {
                s.b[n2] = true;
                s.g[n2] = string;
                if (b[n2] && n2 != l) {
                    ++ao;
                    s.e[n2] = 4;
                    if (b) {
                        int n4 = n2;
                        g[n4] = g[n4] + z + B + (ao < 10 ? "0" : "") + ao;
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void a(int n2, String[] stringArray, int n3, String string) {
        String string2;
        int n4 = stringArray.length;
        s.a[n2] = new String[n4];
        s.a[n2] = new int[n4];
        s.b[n2] = new int[n4];
        int n5 = 0;
        if (a[0]) {
            return;
        }
        String string3 = "";
        if (c) {
            try {
                string2 = string;
                string = a.getAppProperty(string2);
                if (n2 != 2) {
                    string3 = F;
                } else if (L.length() > 0 && b) {
                    string3 = L + y;
                } else if (L.length() > 0) {
                    string3 = L;
                }
            }
            catch (Exception exception) {}
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            try {
                int n6;
                string2 = "";
                if (n2 != 2 && i2 == n4 - 1) {
                    if (!c) {
                        string2 = a[n2];
                        string2 = a.getAppProperty(string2);
                    } else if (L.length() > 0) {
                        string2 = q;
                        string2 = a.getAppProperty(string2);
                        string2 = s.a(string2, stringArray[i2], L + (b ? y : ""));
                    }
                } else if (c) {
                    string2 = stringArray[i2].compareTo(i) == 0 ? s.a(string, stringArray[i2], F) : (stringArray[i2].compareTo(h) == 0 ? L : s.a(string, stringArray[i2], string3));
                } else {
                    string2 = a[n2] + "-" + stringArray[i2];
                    string2 = a.getAppProperty(string2);
                }
                if (!s.a(string2, 7)) continue;
                s.a[n2][n5] = string2;
                s.a[n2][n5++] = i2;
                s.b[n2][i2] = n6 = n3 - (stringArray.length - 1) + i2;
                continue;
            }
            catch (Exception exception) {}
        }
        if (n5 > 0) {
            s.b[s.m + n2] = true;
            s.d[n2] = n5;
        }
    }

    private static String[] a(byte[] byArray) {
        String[] stringArray = new String[s.a(byArray)];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n2 = s.a(byArray);
            stringArray[i2] = new String(byArray, L, n2);
            L += n2;
        }
        return stringArray;
    }

    private static void c() {
        String[] stringArray;
        Object[] objectArray;
        try {
            int n2;
            boolean bl = s.c();
            if (!bl) {
                l = false;
                return;
            }
            objectArray = s.a(0);
            s.a(objectArray);
            int n3 = s.a(objectArray);
            L += n3;
            n3 = s.a(objectArray);
            L += n3;
            n3 = s.a(objectArray);
            L += n3;
            n3 = s.a(objectArray);
            L += n3;
            n3 = s.a(objectArray);
            G = new String((byte[])objectArray, L, n3);
            L += n3;
            s.a(objectArray);
            s.a(objectArray);
            d = s.a(objectArray) == 1;
            b = s.a(objectArray);
            stringArray = s.a(objectArray);
            c = s.a(objectArray);
            d = s.a(objectArray);
            e = s.a(objectArray);
            for (n2 = 0; n2 < a.length; ++n2) {
                s.a[n2] = s.a(objectArray) == 1;
            }
            try {
                n2 = s.a(objectArray);
                c = new String((byte[])objectArray, L, n2);
                if (c.equals(a + "z")) {
                    aL = 2;
                    O = 2;
                    P = 4;
                    Q = 5;
                }
            }
            catch (Exception exception) {
                l = false;
            }
            s.b();
        }
        catch (Exception exception) {
            l = false;
            return;
        }
        objectArray = stringArray;
        int n4 = (stringArray.length - 1 > 0 ? objectArray.length - 1 : 0) + 4;
        q = ++n4;
        r = q + 1;
        s = r + 1;
        t = s + 1;
        u = t + 1;
        v = u + 1;
        w = v + 1;
        x = w + 1;
        y = x + 1;
        z = y + 1;
        A = z + 1;
        B = A + 1;
        n4 = C = B + 1;
        if (c.length > 1) {
            D = n4 + 1;
            E = D + (c.length - 1);
        } else {
            E = n4 + 1;
        }
        n4 = E;
        if (d.length > 1) {
            F = n4 + 1;
            G = F + (d.length - 1);
        } else {
            G = n4 + 1;
        }
        n4 = G;
        n4 = H = n4 + 1;
        I = H + 1;
        U = stringArray.length;
        e = new Image[U];
        V = U + 1 + 1 + 1 + 1 + (a[0] ? 1 : 0);
        for (n4 = 0; n4 < a.length; ++n4) {
            s.a[n4] = a[n4] ? ++k : --j;
        }
        i = ++k;
        g = new String[V];
        b = new boolean[V];
        e = new int[V];
        for (n4 = 0; n4 < b.length; ++n4) {
            s.b[n4] = false;
        }
        l = U;
        m = l + 1;
        n = m + 1;
        o = n + 1;
        p = o + 1;
        a = new String[3][];
        a = new int[3][];
        b = new int[3][];
        d = new int[3];
        String string = s;
        u = a.getAppProperty(string);
        string = t;
        v = a.getAppProperty(string);
        if (u != null && v.toLowerCase().equals(w.toLowerCase())) {
            N = u;
            q = true;
            l = true;
            return;
        }
        try {
            string = r;
            F = a.getAppProperty(string);
            if (F != null) {
                F = F.trim();
                c = true;
                if (F.indexOf(D) != -1) {
                    b = true;
                }
            }
        }
        catch (Exception exception) {}
        for (n4 = 0; n4 < U; ++n4) {
            s.a(n4, stringArray[n4], 7, n, F);
        }
        try {
            string = m;
            String string2 = a.getAppProperty(string).trim();
            if (s.a(string2, 7)) {
                L = string2;
            }
            string = l;
            J = a.getAppProperty(string);
        }
        catch (Exception exception) {}
        if (!a[0]) {
            if (c) {
                if (s.a(L, 7)) {
                    s.a(U, k, 7, q, L + (b ? y : ""));
                }
            } else {
                string = e + "-" + k;
                String string3 = a.getAppProperty(string);
                if (string3 != null && s.a(a.getAppProperty(string = e + "-" + k), 7)) {
                    s.g[s.l] = string3;
                    s.b[s.l] = true;
                    s.e[s.l] = 5;
                }
            }
        }
        s.a(0, c, E, o);
        s.a(1, d, G, p);
        if (!a[0]) {
            if (c) {
                string = q;
                String string4 = a.getAppProperty(string);
                if (s.a(s.a(string4, "OP", L), 7)) {
                    if (s.a(L, 7)) {
                        s.b[s.o] = true;
                    }
                    s.g[s.o] = L;
                }
            } else if (s.a(L, 7)) {
                s.g[s.o] = L;
                s.b[s.o] = true;
            }
            if (b[o] && b) {
                int n5 = o;
                g[n5] = g[n5] + z + C;
            }
        }
        if (a[0]) {
            try {
                if (s.a(L, 7)) {
                    s.g[s.p] = L;
                    s.b[s.p] = true;
                }
            }
            catch (Exception exception) {}
        }
        if ((an = s.a()) > 0) {
            l = true;
        }
    }

    public static boolean a() {
        return l;
    }

    public static void a(String string, int n2) {
        if (q) {
            d = N;
            s.g();
        } else {
            block12: {
                int n3;
                s.e();
                t = false;
                n2 = 0;
                if (n2 >= 0 && n2 < b.length) {
                    aw = n2 <= b.length ? n2 : 0;
                    K = string;
                    ab = -1;
                    X = 0;
                    aa = -1;
                    Z = 0;
                    ag = 0;
                    ah = 0;
                    c = new int[10];
                    k = true;
                    a = Font.getFont((int)0, (int)0, (int)8);
                    a = 0;
                    b = 0;
                }
                ac = 4 + V;
                for (int i2 = 0; i2 < b.length; ++i2) {
                    if (!b[i2]) continue;
                    n3 = i2;
                    break block12;
                }
                n3 = Z = -1;
            }
            if (j) {
                a.setCommandListener((CommandListener)a);
            }
        }
        g = true;
        h = true;
        string = null;
        try {
            string = RecordStore.openRecordStore((String)"igp19", (boolean)false);
        }
        catch (Exception exception) {
            try {
                string = RecordStore.openRecordStore((String)"igp19", (boolean)true);
            }
            catch (Exception exception2) {}
        }
        try {
            if (string != null) {
                string.closeRecordStore();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a() {
        t = true;
        if (!m) {
            return;
        }
        X = 7;
        d = M;
    }

    public static boolean b() {
        return m;
    }

    private static boolean d() {
        block10: {
            boolean bl = false;
            for (int i2 = 0; i2 < b.length; ++i2) {
                if (!b[i2].equals("SP")) continue;
                bl = true;
            }
            if (!bl) {
                return false;
            }
            try {
                String string = q;
                String string2 = a.getAppProperty(string);
                if (string2 != null && string2.indexOf(j) != -1) {
                    int n2 = string2.indexOf(j) + j.length() + 1;
                    int n3 = n2 + j.length();
                    if (n3 >= string2.length()) {
                        return false;
                    }
                    if (!string2.substring(n2, n3).equals(j)) {
                        return false;
                    }
                    M = L;
                    if (b) {
                        n2 = (M = M + y).indexOf(x);
                        if (n2 >= 0) {
                            M = M.substring(0, n2) + j + M.substring(n2 + x.length());
                        }
                        if (M.length() == 0) {
                            return false;
                        }
                    }
                    break block10;
                }
                string = e + "-" + j;
                M = a.getAppProperty(string);
                return M != null;
            }
            catch (Exception exception) {
                return false;
            }
        }
        return true;
    }

    private static int a() {
        int n2 = 0;
        for (int i2 = 0; i2 < b.length; ++i2) {
            if (!b[i2]) continue;
            ++n2;
        }
        return n2;
    }

    private static void d() {
        if (J == null) {
            return;
        }
        int n2 = J.length();
        if (n2 <= 0) {
            J = null;
            return;
        }
        boolean bl = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 1;
        String string = "";
        ay = 0;
        J = J.toUpperCase();
        char[] cArray = J.toCharArray();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = cArray[i2];
            if (c2 >= ' ' && c2 <= 'z' || c2 == '\u0082' || c2 == '\n') {
                if (c2 == '\n') {
                    bl = true;
                } else if (i2 < n2 - 1 && c2 == '\\' && (cArray[i2 + 1] == 'n' || cArray[i2 + 1] == 'N')) {
                    bl = true;
                    ++i2;
                }
                if (bl) {
                    if (string.length() > 0) {
                        if (++n6 == 3) {
                            string = null;
                            break;
                        }
                        string = string + '\n';
                        if (n4 > ay) {
                            ay = n4;
                        }
                        n4 = 0;
                    } else {
                        string = string + "";
                    }
                    bl = false;
                } else {
                    string = string + c2;
                    n4 += s.a(c2, P);
                    if (c2 == ' ') {
                        n3 = string.length() - 1;
                        n5 = n4;
                    }
                }
                if (n4 < az) continue;
                if (n6 < 3) {
                    if (n3 == i2) {
                        string = string + "\n";
                        n4 = 0;
                    } else if (n3 != 0) {
                        string = string.substring(0, n3) + "\n" + string.substring(n3 + 1, string.length());
                        n4 -= n5;
                        if (n5 > ay) {
                            ay = n5;
                        }
                    } else {
                        string = null;
                        break;
                    }
                    ++n6;
                    continue;
                }
                string = null;
                break;
            }
            string = null;
            break;
        }
        if (string != null && !s.a(string, 7)) {
            string = null;
        }
        J = string;
        ax = n6;
        if (n4 > ay) {
            ay = n4;
        }
        ay += s.a(79, P) << 1;
    }

    private static void a(int n2) {
        byte[] byArray = null;
        L = 0;
        switch (n2) {
            case -1: {
                b = new Image[J];
                c = new Image[V];
                Image[][] imageArrayArray = new Image[3][];
                a = imageArrayArray;
                imageArrayArray[0] = new Image[c.length];
                s.a[1] = new Image[d.length];
                s.a[2] = new Image[e.length];
                return;
            }
            case 0: {
                s.c();
                return;
            }
            case 1: {
                int n3;
                byArray = s.a(n2);
                for (int i2 = 0; i2 < aw; ++i2) {
                    n2 = s.a(byArray);
                    L += n2;
                }
                s.a(byArray);
                n2 = s.a(byArray);
                f = new String[n2];
                byte[] byArray2 = new byte[n2];
                System.arraycopy(byArray, L, byArray2, 0, n2);
                L += n2;
                s.a(byArray);
                int n4 = byArray[L++] & 0xFF | (byArray[L++] & 0xFF) << 8;
                a = new short[n4];
                for (n3 = 0; n3 < n4 - 1; ++n3) {
                    s.a[n3] = (short)((byArray[L++] & 0xFF) + ((byArray[L++] & 0xFF) << 8));
                }
                s.a[n4 - 1] = (short)n2;
                for (n3 = 0; n3 < n4; ++n3) {
                    n2 = n3 == 0 ? 0 : a[n3 - 1] & 0xFFFF;
                    int n5 = (a[n3] & 0xFFFF) - n2;
                    if (n5 == 0) continue;
                    try {
                        s.f[n3] = new String(byArray2, n2, n5, "UTF-8");
                        continue;
                    }
                    catch (Exception exception) {}
                }
                if (!j) break;
                a = new Command(s.a(w), 4, 1);
                b = new Command(s.a(x), 2, 1);
                n2 = 1;
                n2 = 1;
                if (b != null) {
                    a.removeCommand(b);
                }
                if (a != null) {
                    a.removeCommand(a);
                }
                a.addCommand(a);
                a.addCommand(b);
                return;
            }
            case 2: {
                a = new Image[7];
                byArray = s.a(n2);
                byte[] byArray3 = new byte[byArray.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                n2 = s.a(byArray);
                L = 0;
                s.a[0] = s.a(byArray);
                s.a[5] = G.equals("128x") ? s.b(byArray3, 2, n2, 1, 4084831) : s.b(byArray3, 2, n2, 1, 8956605);
                s.a[2] = s.b(byArray3, 2, n2, 1, 0xFF0000);
                int n6 = s.a(byArray);
                n2 = s.a(byArray);
                a = new byte[(n2 + 1) * (4 + aL)];
                n2 = n6 / (6 + aL);
                for (int i3 = 0; i3 < n2; ++i3) {
                    int n7 = s.a(byArray);
                    System.arraycopy(byArray, L, a, n7 *= 4 + aL, 4 + aL);
                    L += 4 + aL;
                }
                M = a[32 * (4 + aL) + Q];
                h = M == 13 ? 0 : -1;
                s.d();
                return;
            }
            case 3: {
                byArray = s.a(n2);
                for (int i4 = 0; i4 < J; ++i4) {
                    if (i4 == 14) {
                        d = new Image[4];
                        byte[] byArray4 = s.a(byArray);
                        s.d[0] = s.a(byArray4, 0, byArray4.length, 0, 0);
                        s.d[1] = s.a(byArray4, 0, byArray4.length, 0, a[0] ? 0xFF7F00 : 13568256);
                        s.d[2] = s.a(byArray4, 0, byArray4.length, 0, 5767410);
                        s.d[3] = s.a(byArray4, 0, byArray4.length, 0, 14588928);
                        s.b[i4] = d[0];
                        continue;
                    }
                    s.b[i4] = s.a(byArray);
                }
                return;
            }
            case 4: {
                for (int i5 = 0; i5 < U; ++i5) {
                    s.c[i5] = s.a(s.a(n2));
                }
                return;
            }
            case 5: {
                byArray = s.a(n2);
                byte[] byArray5 = s.a(byArray);
                int n8 = byArray5.length;
                int n9 = 0;
                byte[] byArray6 = byArray5;
                s.c[s.l] = Image.createImage((byte[])byArray5, (int)n9, (int)n8);
                for (n9 = 0; n9 < aw; ++n9) {
                    s.a(byArray);
                }
                a = s.a(byArray);
                return;
            }
            case 6: 
            case 7: {
                int n10 = (n2 == 6 ? c.length : d.length) - 1;
                int n11 = n2 == 6 ? 0 : 1;
                byArray = s.a(n2);
                for (int i6 = 0; i6 < n10; ++i6) {
                    s.a[n11][i6] = s.a(byArray);
                }
                s.a[n11][i6] = b[11];
                s.c[n2 == 6 ? s.m : s.n] = b[10];
                return;
            }
            case 8: {
                byArray = s.a(n2);
                s.c[s.o] = s.a(byArray);
                if (!b[aw].equals("JP") && !b[aw].equals("DOCOMO") || b != null) break;
                b = s.a(byArray);
                return;
            }
            default: {
                if (n2 == a[0]) {
                    byArray = s.a(n2);
                    s.c[s.p] = s.a(byArray);
                    return;
                }
                if (n2 != i) break;
                s.b();
            }
        }
    }

    private static void b(boolean bl) {
        int n2;
        for (n2 = 0; n2 < a.length; ++n2) {
            if (a[n2] == null) continue;
            for (int i2 = 0; i2 < a[n2].length; ++i2) {
                s.a[n2][i2] = null;
            }
        }
        for (n2 = 0; n2 < c.length; ++n2) {
            s.c[n2] = null;
        }
        a = null;
        b = null;
        if (bl) {
            s.b();
            a = null;
            a = null;
            for (n2 = 0; n2 < J; ++n2) {
                s.b[n2] = null;
            }
            b = null;
            for (n2 = 0; n2 < 4; ++n2) {
                s.d[n2] = null;
            }
            d = null;
            a = null;
            f = null;
            c = null;
            K = null;
            c = null;
            a = null;
            c = null;
            d = null;
            e = null;
            f = null;
            g = null;
            h = null;
            i = null;
            j = null;
            k = null;
            l = null;
            m = null;
            n = null;
            p = null;
            o = null;
            for (n2 = 0; n2 < e.length; ++n2) {
                s.e[n2] = null;
            }
        }
        System.gc();
    }

    public static void a(boolean bl) {
        if (bl) {
            if (X == 0 || X == 2) {
                aa = X;
                X = 5;
            }
            s.e();
            return;
        }
        if (X == 5) {
            X = aa;
            ab = -1;
        }
    }

    private static int a(byte[] byArray, int n2, int n3, String object) {
        object = ((String)object).toCharArray();
        while (n2 < n3 - 4) {
            if ((byArray[n2] & 0xFF) == object[0] && (byArray[n2 + 1] & 0xFF) == object[1] && (byArray[n2 + 2] & 0xFF) == object[2] && (byArray[n2 + 3] & 0xFF) == object[3]) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    private static Image a(byte[] byArray, int n2, int n3, int n4, int n5) {
        int n6;
        int[] nArray = new int[10];
        int[] nArray2 = new int[10];
        int n7 = 0;
        for (n6 = 0; n6 < nArray.length; ++n6) {
            nArray[n6] = -1;
            nArray2[n6] = -1;
        }
        n6 = s.a(byArray, 0, n3, "PLTE");
        int n8 = s.a(byArray, 0, n3, "tRNS");
        Image image = null;
        if (n6 > 0 && n8 > 0) {
            int n9;
            int n10;
            int n11;
            int n12;
            int n13 = (byArray[n6 - 4] << 24 & 0xFF000000) + (byArray[n6 - 3] << 16 & 0xFF0000) + (byArray[n6 - 2] << 8 & 0xFF00) + (byArray[n6 - 1] & 0xFF);
            boolean bl = false;
            for (n12 = 0; n12 < n13 / 3; ++n12) {
                if (byArray[n8 + 4 + n12] == 0) continue;
                n11 = byArray[n6 + 4 + n12 * 3] & 0xFF;
                n10 = byArray[n6 + 4 + n12 * 3 + 1] & 0xFF;
                n9 = byArray[n6 + 4 + n12 * 3 + 2] & 0xFF;
                if (n11 == 255 || n10 == 255 || n9 == 255) {
                    bl = true;
                    break;
                }
                if (n11 != 0 && n10 != 0 && n9 != 0) continue;
                bl = true;
                break;
            }
            if (!bl) {
                n4 = 0 | 1 << 16;
                n4 |= 0x100;
                n4 |= 1;
            }
            for (n12 = 0; n12 < n13 / 3; ++n12) {
                if (byArray[n8 + 4 + n12] == 0 || (byArray[n6 + 4 + n12 * 3] & 0xFF) != (n4 >> 16 & 0xFF & 0xFF) || (byArray[n6 + 4 + n12 * 3 + 1] & 0xFF) != (n4 >> 8 & 0xFF & 0xFF) || (byArray[n6 + 4 + n12 * 3 + 2] & 0xFF) != (n4 & 0xFF)) continue;
                nArray[n7] = n12;
                n11 = s.a(byArray, n6 + 4 + n12 * 3, 3);
                s.a(byArray, n6 + 4 + n12 * 3, 3, n5);
                nArray2[n7] = n11;
                ++n7;
            }
            byte[] byArray2 = new byte[n13 + 4];
            System.arraycopy(byArray, n6, byArray2, 0, n13 + 4);
            long[] lArray = new long[256];
            for (n10 = 0; n10 < 256; ++n10) {
                long l2 = n10;
                for (n9 = 0; n9 < 8; ++n9) {
                    if ((l2 & 1L) == 1L) {
                        l2 = 0xEDB88320L ^ l2 >> 1;
                        continue;
                    }
                    l2 >>= 1;
                }
                lArray[n10] = l2;
            }
            long l3 = 0xFFFFFFFFL;
            for (n10 = 0; n10 < byArray2.length; ++n10) {
                l3 = lArray[(int)(l3 ^ (long)byArray2[n10]) & 0xFF] ^ l3 >> 8;
            }
            n10 = s.a(byArray, n6 + 4 + n13, 4);
            s.a(byArray, n6 + 4 + n13, 4, (int)(l3 ^= 0xFFFFFFFFL));
            System.gc();
            image = Image.createImage((byte[])byArray, (int)0, (int)n3);
            for (n9 = 0; n9 < n7; ++n9) {
                n3 = nArray[n9];
                n4 = nArray2[n9];
                s.a(byArray, n6 + 4 + n3 * 3, 3, n4);
            }
            s.a(byArray, n6 + 4 + n13, 4, n10);
        }
        return image;
    }

    private static void a(byte[] byArray, int n2, int n3, int n4) {
        for (int i2 = n3 - 1; i2 >= 0; --i2) {
            byArray[n2 + n3 - 1 - i2] = (byte)((n4 & 255 << i2 * 8) >> i2 * 8);
        }
    }

    private static int a(byte[] byArray, int n2, int n3) {
        int n4 = 0;
        for (int i2 = n3 - 1; i2 >= 0; --i2) {
            n4 += byArray[n2 + n3 - 1 - i2] << i2 * 8 & 255 << i2 * 8;
        }
        return n4;
    }

    public static boolean a(int n2) {
        if (q) {
            return true;
        }
        if (t) {
            if (!m) {
                return true;
            }
            return X == 4;
        }
        if (!l) {
            return true;
        }
        if (r) {
            r = false;
        } else {
            Y = n2;
        }
        switch (X) {
            case 0: {
                if (ab >= ac) {
                    s.h();
                    X = 1;
                    s.f();
                } else {
                    s.a(ab);
                }
                ++ab;
                break;
            }
            case 1: {
                switch (Y) {
                    case 26: {
                        X = 4;
                        break;
                    }
                    case 23: {
                        if (an <= 1) break;
                        Z = Z == 0 ? V - 1 : --Z;
                        while (!b[Z]) {
                            if (Z == 0) {
                                Z = V - 1;
                                continue;
                            }
                            --Z;
                        }
                        e = true;
                    }
                    case 24: {
                        if (an <= 1) break;
                        if (!e) {
                            Z = Z == V - 1 ? 0 : ++Z;
                            while (!b[Z]) {
                                if (Z == V - 1) {
                                    Z = 0;
                                    continue;
                                }
                                ++Z;
                            }
                            f = true;
                        }
                        ag = 0;
                        ah = 0;
                        s.f();
                        break;
                    }
                    case 32: {
                        if (!o || ah >= ae - 1 || ++ah - ag < af) break;
                        ++ag;
                        break;
                    }
                    case 21: {
                        if (!o || ah <= 0 || --ah - ag >= 0) break;
                        --ag;
                        break;
                    }
                    case 25: 
                    case 27: {
                        X = 6;
                    }
                }
                break;
            }
            case 6: {
                String string = g[Z];
                if (o) {
                    string = a[ad][ah];
                }
                if (string == null || string.length() <= 0) break;
                if (b) {
                    int n3 = string.indexOf(A);
                    string = n3 == -1 ? string + A + b[aw] : string.substring(0, n3) + A + b[aw] + string.substring(n3 + A.length() + 2);
                }
                d = string;
                break;
            }
            case 2: {
                s.b(false);
                n2 = Z;
                ab = e[n2] == 4 ? e[n2] : (n2 == l ? 5 : (n2 == m ? 6 : (n2 == n ? 7 : (n2 == o ? 8 : (n2 == p ? a[0] : -1)))));
                s.a(ab);
                s.h();
                X = 1;
                break;
            }
            case 5: {
                break;
            }
            case 3: {
                switch (Y) {
                    case 26: {
                        X = 1;
                        H = null;
                        break;
                    }
                    case 25: {
                        d = null;
                    }
                }
                break;
            }
            case 4: {
                s.b(true);
                if (j) {
                    a.setCommandListener(a);
                    if (b != null) {
                        a.removeCommand(b);
                        b = null;
                    }
                    if (a != null) {
                        a.removeCommand(a);
                        a = null;
                    }
                }
                k = false;
                return true;
            }
        }
        return false;
    }

    public static void a(int n2, int n3) {
        if ((n2 = s.b(n2, n3)) != 0) {
            Y = n2;
            r = true;
        }
        aD = 0;
        s = false;
    }

    public static void b(int n2, int n3) {
        if ((n2 = s.b(n2, n3)) != 0) {
            aD = n2;
        }
    }

    public static void c(int n2, int n3) {
        Y = 0;
        aD = 0;
        s = false;
        s.b(n2, n3);
    }

    private static int b(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        if (n2 < 0 || n3 < 0) {
            return 0;
        }
        if (X == 0 || !k) {
            return 0;
        }
        if (o) {
            n7 = aA * 5 / 100;
            n7 = n7 + 1 + b[5].getWidth();
            n6 = az / 100;
            n5 = n7 + a[ad][0].getWidth() + n6;
            n4 = n2 > aj + (n6 *= 3) && n2 < aj + al - n6 ? 1 : 0;
            for (n7 = ag; n7 < ag + af; ++n7) {
                if (n4 == 0 || n3 <= aI + am * (n7 - ag) || n3 >= aI + am * (n7 - ag) + am) continue;
                if (ah == n7) {
                    return 25;
                }
                ah = n7;
                return 0;
            }
            if (n4 != 0) {
                int n8 = n4 = n2 > b[12].getWidth() * 3 / 2 + 2 && n2 < az - (b[12].getWidth() * 3 / 2 - 2) ? 1 : 0;
            }
            if (af < ae && n4 != 0) {
                if (ah > 0 && n3 > aJ - (n5 - 2) / 2 && n3 < aJ + (n5 - 2)) {
                    return 21;
                }
                if (ah < ae - 1 && n3 > aK - (n5 - 2) / 2 && n3 < aK + (n5 - 2)) {
                    return 32;
                }
            }
        } else if (n2 > au && n2 < au + as && n3 > av && n3 < av + at) {
            return 27;
        }
        n7 = az - b[7].getWidth();
        n6 = (aA >> 1) - b[7].getHeight();
        n5 = b[7].getHeight() << 1;
        n4 = b[7].getWidth() << 1;
        if (n3 >= n6 && n3 <= n6 + n5) {
            if (n2 >= 0 && n2 <= n4 + 0) {
                return 23;
            }
            if (n2 >= n7 - n4 / 2 && n2 <= n7 + n4) {
                return 24;
            }
        }
        if (j) {
            return 0;
        }
        if (n3 >= aA - b[13].getHeight() && n3 <= aA) {
            if (n2 > b && n2 < b[13].getWidth() + b) {
                return 0;
            }
            if (n2 > az - c - b[13].getWidth() && n2 < az - c) {
                return 26;
            }
        }
        return 0;
    }

    private static void e() {
        Y = 0;
        aD = 0;
        r = true;
        s = false;
        W = 0;
        e = false;
        f = false;
    }

    private static void f() {
        ap = Z;
        ah = 0;
        ae = 0;
        ag = 0;
        o = false;
        boolean bl = n = g[Z] != null && g[Z].length() > 0 && g[Z].compareTo("DEL") != 0;
        if (Z == m) {
            ad = 0;
            o = true;
            n = false;
        }
        if (Z == n) {
            ad = 1;
            o = true;
            n = false;
        }
        if (Z == o || Z == p) {
            n = true;
        }
        ar = y;
        if (e[Z] == 4) {
            ar = z;
        }
        if (o) {
            ae = d[ad];
        }
    }

    public static void a(Graphics graphics) {
        if (q) {
            return;
        }
        if (!l && !t) {
            return;
        }
        if (d != null) {
            s.g();
            return;
        }
        if (t) {
            return;
        }
        s.a(graphics, 0, 0, az, aA);
        switch (X) {
            case 0: {
                graphics.setColor(0);
                graphics.fillRect(0, 0, az, aA);
                int n2 = ac;
                int n3 = ab;
                int n4 = az * 3 / 4;
                int n5 = aC;
                Graphics graphics2 = graphics;
                if (n3 > n2) {
                    n3 = n2;
                }
                int n6 = (az - n4) / 2;
                graphics2.setClip(n6, 0, n4 + 2, aA);
                graphics2.setColor(0xFFFFFF);
                graphics2.drawRect(n6, n5, n4, 6);
                int n7 = (n4 - 2 - 2) * n3 / n2 + 1;
                graphics2.setColor(0xFF0000);
                graphics2.fillRect(n6 + 1 + 1, n5 + 1 + 1, n7, 3);
                if (K == null || K.trim().equals("")) break;
                graphics.setColor(0xFFFFFF);
                graphics.setFont(a);
                graphics.drawString(K, aB, aC - 5, 33);
                return;
            }
            case 1: {
                s.b(graphics);
                if (System.currentTimeMillis() % 1000L <= 500L && aD != 27) break;
                Graphics graphics3 = graphics;
                if (n) {
                    graphics3.setColor(a);
                    int n8 = d[0].getWidth() / 2;
                    au -= n8;
                    as += n8 * 2;
                    ++at;
                    if (a[0]) {
                        graphics3.setColor(0xFF7F00);
                    }
                    if (aD == 27) {
                        graphics3.setColor(14588928);
                        s.a(graphics3, au - 2, av - 2, as + 4, at + 4, 3, true);
                        graphics3.setColor(5767410);
                        s.a(graphics3, au, av, as, at, 2, true);
                    } else {
                        s.a(graphics3, au, av, as, at, 1, true);
                    }
                    R = 0;
                    s.a(ar, graphics3, aB, av + (at >> 1), 3);
                }
                return;
            }
            case 2: {
                int n9 = M;
                graphics.setColor(6324884);
                graphics.fillRect(0, aC - n9 - 5, az, n9 << 1);
                int n10 = R;
                R = 0;
                s.a(I, graphics, aB, aC - n9, 65);
                R = n10;
                return;
            }
            case 5: {
                return;
            }
            case 3: {
                s.b(graphics);
                int n11 = aA * 40 / 100;
                int n12 = az;
                int n13 = -220209185;
                int n14 = aA - (n11 << 1);
                int n15 = n12;
                int n16 = n11;
                int n17 = 0;
                Graphics graphics4 = graphics;
                int[] nArray = new int[n15 * n14];
                for (n17 = 0; n17 < nArray.length; ++n17) {
                    nArray[n17] = n13;
                }
                graphics4.drawRGB(nArray, 0, n15, 0, n16, n15, n14, true);
                graphics.setColor(39423);
                graphics.drawRect(0, n11, n12 - 1, aA - (n11 << 1) - 1);
                graphics.drawRect(1, n11 + 1, n12 - 3, aA - (n11 << 1) - 3);
                s.a(C, graphics, aB, aC, 3);
                s.c(graphics);
            }
        }
    }

    private static void b(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        int n5;
        a = true;
        s.a(ar, null, 0, 0, 3);
        int n6 = s.a(32, P) / 2;
        int n7 = s.a(32, Q) / 3;
        as = T + n6;
        at = S + n7;
        if ((S + at) % 2 != 0) {
            ++at;
        }
        au = aB - as / 2;
        if (e[Z] == 4) {
            av = f - at / 2;
        } else if (Z == l || Z == o || Z == p) {
            av = aA - b[12].getHeight() - aq - at;
        }
        if (a[0] && Z == p) {
            av = aA * 75 / 100;
        }
        graphics.setColor(0xFFFFFF);
        if (a[0]) {
            graphics.setColor(0);
        }
        n7 = 0;
        n6 = 7247016;
        int n8 = 0;
        int n9 = aA;
        n8 = az;
        n6 = 0;
        n7 = 0;
        Graphics graphics2 = graphics;
        if (n9 + 0 > aA) {
            n9 = aA;
        }
        if (n8 + 0 > az) {
            n8 = az;
        }
        for (n5 = 0; n5 < n9 + 0; ++n5) {
            n7 = 0 + n5 * 110 / n9;
            n4 = 0 + n5 * 148 / n9;
            n3 = 0 + n5 * 168 / n9;
            graphics2.setColor(n7, n4, n3);
            graphics2.drawLine(0, n5, 0 + n8, n5);
        }
        s.c(graphics);
        int n10 = aA - b[12].getHeight() - aq;
        if (o) {
            int n11;
            Graphics graphics3 = graphics;
            n7 = e;
            if (p) {
                s.a(graphics3, true);
                n7 += c[Z].getHeight();
            }
            n8 = b[13].getHeight();
            n8 += aq;
            n8 = aA - (n7 += e) - n8;
            n9 = a[ad][a[ad][0]].getHeight();
            n2 = ad;
            n5 = 0;
            for (n4 = 0; n4 < b[ad].length; ++n4) {
                n11 = 1;
                n3 = 0;
                while (s.a(b[n2][n4]).indexOf("\n", n3) != -1) {
                    n3 = s.a(b[n2][n4]).indexOf("\n", n3) + 1;
                    ++n11;
                }
                if (n11 <= n5) continue;
                n5 = n11;
            }
            n2 = Math.max(2, n5);
            n9 = Math.max(n2 * M, n9 + n9 / 4);
            n2 = b[5].getWidth();
            n5 = n8 / n9;
            n4 = n9 * ae + (aA << 1 << 1) / 100;
            if (n4 > n8) {
                n7 += n2 + (n2 >> 1);
                n5 = (n8 -= 2 * (n2 + (n2 >> 1))) / n9;
            }
            n11 = n5;
            if (ae < n5) {
                n11 = ae;
            }
            n7 += (n8 >> 1) - (n11 * n9 >> 1);
            n4 = n9 * n11 + (aA << 1 << 1) / 100;
            af = n11;
            n8 = n7;
            if (n5 < ae) {
                n5 = 0xFFFFFF;
                if (ah > 0) {
                    if (aD == 21) {
                        n5 = 16545540;
                    }
                    s.a(graphics3, aB, n8 - n2, n2, n5, true, false);
                    aJ = n8 - n2;
                }
                n5 = 0xFFFFFF;
                if (ah != ae - 1) {
                    if (aD == 32) {
                        n5 = 16545540;
                    }
                    s.a(graphics3, aB, n8 + af * n9 + n2, n2, n5, true, true);
                    aK = n8 + af * n9;
                }
            }
            n8 = n7 + n9 / 2 + 1;
            al = az - (2 * b[5].getWidth() + b[5].getWidth() / 4 + 8);
            if (az > aA) {
                al -= b[5].getWidth() / 2;
            }
            aj = (az >> 1) - (al >> 1);
            n5 = (az << 1) / 100;
            n2 = aj + n5;
            n5 = n2 + a[ad][0].getWidth() + n5;
            a[ad][0].getWidth();
            graphics3.setColor(0);
            s.a(graphics3, aj - (az << 1) / 100, n7 - (aA << 1) / 100, al + (az << 1 << 1) / 100, n4, 0, true);
            for (n4 = ag; n4 < ag + n11; ++n4) {
                n3 = a[ad][n4];
                s.a(graphics3, a[ad][n3], n2, n8, 6);
                R = 5;
                if (ad == 2 || n3 == b[ad].length - 1) {
                    R = 2;
                }
                s.a(s.a(b[ad][n3]), graphics3, n5, n8, 6);
                n8 += n9;
            }
            ai = ah - ag;
            ak = n7 + n9 * ai;
            am = n9;
            aI = n7;
            graphics3.setColor(16545540);
            graphics3.drawRoundRect(aj, ak, al, am, az * 5 / 100, aA * 5 / 100);
        } else if (Z == p) {
            n7 = az / 2;
            n8 = e;
            s.a(graphics, c[p], n7, n8, 17);
            a = true;
            s.a(q, null, 0, 0, 0);
            c[Z].getHeight();
            if (a[0]) {
                R = 0;
            }
            s.a(s.a(r), graphics, az - (b[4].getWidth() + 8 << 1), az >> 1, aA >> 1, 3);
        } else if (Z == l) {
            n7 = aA >= 128 ? 1 : 0;
            n8 = J != null && J.length() > 0 ? 1 : 0;
            n9 = 0;
            int n12 = n7 = n7 != 0 ? b[10].getHeight() : 0;
            if (p) {
                s.a(graphics, false);
                n9 = 2 * e + n7 + 1;
            }
            if (c[l].getWidth() >= 470) {
                graphics.setColor(0xCCCCCC);
                graphics.fillRect(aB + 14 + 13, n9, 6, 20);
                n9 += 20;
            } else if (c[l].getWidth() > 310) {
                graphics.setColor(0xCCCCCC);
                graphics.fillRect(aB + 14 + 2, n9, 4, 20);
                n9 += 20;
            } else if (c[l].getWidth() > 220) {
                graphics.setColor(0xCCCCCC);
                graphics.fillRect(aB + 14, n9, 3, 20);
                n9 += 20;
            } else if (c[l].getWidth() > 140) {
                graphics.setColor(0xD7D7D7);
                graphics.fillRect(aB + 8, n9, 2, 11);
                n9 += 11;
            } else if (c[l].getWidth() > 100) {
                graphics.setColor(0xCDCDCD);
                graphics.fillRect(aB + 6, n9, 1, 10);
                n9 += 10;
            }
            s.a(graphics, c[l], aB, n9 += c[l].getHeight() - 1, 33);
            s.a(graphics, a, aB + (c[l].getWidth() >> 1) + 1, n9, 40);
            if (n8 != 0) {
                R = 0;
                n2 = n10 - n9;
                n9 = M << 1 > n2 ? (n9 += M / 3) : (n9 += (n2 - M * ax) / 2);
                graphics.setColor(0);
                s.a(graphics, aB - ay / 2, n9 - (aA << 1) / 100, ay, ax * M + (aA << 1 << 1) / 100, 0, true);
                s.a(J, graphics, az, aB, n9, 17);
            }
        } else if (Z == o) {
            if (p) {
                s.a(graphics, false);
            }
            n7 = (d + g) / 2;
            if (d) {
                graphics.drawRegion(c[Z], 0, 0, c[Z].getWidth(), c[Z].getHeight(), 0, aB, n7, 10);
                graphics.drawRegion(c[Z], 0, 0, c[Z].getWidth(), c[Z].getHeight(), 2, aB, n7, 6);
            } else {
                s.a(graphics, c[Z], aB, n7, 3);
            }
            if (b == null) {
                a = true;
                s.a(s.a(ap), null, 0, 0, 0, 0);
                n8 = R;
                R = 0;
                s.a(s.a(ap), graphics, c[Z].getWidth() / 2, aB, n7 -= S / 2, 17);
                R = n8;
            } else {
                s.a(graphics, b, aB, aA / 2, 3);
            }
        } else {
            a = true;
            s.a(s.a(ap), graphics, 0, 0, 0, 0);
            n7 = c[Z].getHeight();
            n8 = 0;
            n2 = az - 4;
            if (T > (n2 -= b[12].getWidth() << 1)) {
                n8 = b[12].getHeight();
            }
            n2 = n7 + S + n8;
            n9 = Math.max(0, aA - n2);
            int n13 = n5 = az <= 176 ? 2 : 0;
            if (S > (M << 1) + n5 && n9 / 3 > (M + n5) / 2) {
                n2 = n7 + (M << 1) + n8;
                n9 = Math.max(0, aA - n2);
            }
            n4 = n9 / 3;
            if (n8 > 0) {
                n8 = aA - b[12].getHeight();
                n2 = n7 + S;
                n9 = Math.max(0, aA - n2);
                if (S > (M << 1) + n5 && n9 / 3 > S - (M + n5 << 1)) {
                    n2 = n7 + (M << 1);
                    n9 = Math.max(0, aA - n2);
                }
                if ((n9 = (n7 = n9 / 3) * 2 + S + c[Z].getHeight()) < n8) {
                    n4 = n7;
                }
            }
            n7 = n8 = n4;
            s.a(graphics, c[Z], aB, n7, 17);
            n8 += c[Z].getHeight();
            n8 = (n8 + n10 - S) / 2;
            if (a[0]) {
                R = 0;
            }
            R = 0;
            s.a(s.a(ap), graphics, 0, aB, n8, 17);
        }
        if (an > 1) {
            n7 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
            n8 = 5;
            n9 = 7;
            if (e || aD == 23) {
                n8 = 4;
                ++W;
            }
            if (f || aD == 24) {
                n9 = 6;
                ++W;
            }
            n2 = n7 + 1 + b[n8].getWidth();
            b[n8].getWidth();
            s.a(graphics, b[n8], n2, aC, 10);
            s.a(graphics, b[n9], az - n2, aC, 6);
            if (W > 4) {
                e = false;
                f = false;
                W = 0;
            }
        }
    }

    private static void a(Graphics graphics, boolean n2) {
        int n3 = az * 3 / 100;
        int n4 = e;
        int n5 = n4 + b[10].getHeight() + e;
        int n6 = az;
        int n7 = aA >= 400 ? 2 : 1;
        s.a(graphics, b[10], n3, n4, 20);
        if (n2 != 0) {
            R = 0;
            s.a(ap, graphics, n6, n5 - e + 3, 40);
        }
        graphics.setColor(10862283);
        for (n2 = 0; n2 < n7; ++n2) {
            graphics.drawLine(0, n5 + n2, n6, n5 + n2);
        }
        g = n5 + n2;
    }

    /*
     * WARNING - void declaration
     */
    private static void a(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        void var6_7;
        int n6;
        int n7 = n6 = var6_7 != false ? -1 : 1;
        if (n4 % 2 == 0) {
            --n4;
        }
        graphics.setColor(16545540);
        s.a(graphics, n2, n3, n2 - (n4 >> 1), n3 + n6 * (n4 >> 1), n2 + (n4 >> 1), n3 + n6 * (n4 >> 1));
        graphics.setColor(n5);
        s.a(graphics, n2, n3 + n6, n2 - (n4 >> 1) + 2, n3 + n6 * (n4 >> 1) - n6, n2 + (n4 >> 1) - 2, n3 + n6 * (n4 >> 1) - n6);
    }

    private static void c(Graphics graphics) {
        if (j) {
            return;
        }
        int n2 = aA - 2;
        int n3 = b;
        int n4 = az - c;
        int n5 = b[9].getHeight();
        d = n2 - n5;
        aq = aA - n2;
        Image image = b[12];
        Image image2 = b[12];
        if (aD == 26) {
            image2 = b[13];
        }
        b = (byte)(b | 2);
        a = (byte)(a | 2);
        if ((b & 1) != 0) {
            s.a(graphics, image, n3, n2, 36);
        }
        if ((b & 2) != 0) {
            s.a(graphics, image2, n4, n2, 40);
        }
        n3 += b[12].getWidth() / 2 - b[9].getWidth() / 2;
        n4 += -b[12].getWidth() / 2 + b[8].getWidth() / 2;
        n2 += -b[12].getHeight() / 2 + b[9].getHeight() / 2;
        if (((a = (byte)(a | 2)) & 1) != 0) {
            s.a(graphics, b[9], n3, n2, 36);
        }
        if ((a & 2) != 0) {
            s.a(graphics, b[8], n4, n2, 40);
        }
    }

    private static Image b(byte[] byArray, int n2, int n3, int n4, int n5) {
        long l2;
        int n6;
        n2 = 0;
        for (n4 = 2; n2 == 0 && n4 < n3 + 2; ++n4) {
            if ((byArray[n4] & 0xFF) != 80 || (byArray[n4 + 1] & 0xFF) != 76 || (byArray[n4 + 2] & 0xFF) != 84 || (byArray[n4 + 3] & 0xFF) != 69) continue;
            n2 = n4;
        }
        n4 = (byArray[n2 - 4] << 24 & 0xFF000000) + (byArray[n2 - 3] << 16 & 0xFF0000) + (byArray[n2 - 2] << 8 & 0xFF00) + (byArray[n2 - 1] & 0xFF);
        byArray[n2 + 4 + 3] = (byte)(n5 >> 16 & 0xFF);
        byArray[n2 + 4 + 3 + 1] = (byte)(n5 >> 8 & 0xFF);
        byArray[n2 + 4 + 3 + 2] = (byte)n5;
        byte[] byArray2 = new byte[n4 + 4];
        System.arraycopy(byArray, n2, byArray2, 0, n4 + 4);
        long[] lArray = new long[256];
        for (n6 = 0; n6 < 256; ++n6) {
            l2 = n6;
            for (int i2 = 0; i2 < 8; ++i2) {
                if ((l2 & 1L) == 1L) {
                    l2 = 0xEDB88320L ^ l2 >> 1;
                    continue;
                }
                l2 >>= 1;
            }
            lArray[n6] = l2;
        }
        l2 = 0xFFFFFFFFL;
        for (n6 = 0; n6 < byArray2.length; ++n6) {
            l2 = lArray[(int)(l2 ^ (long)byArray2[n6]) & 0xFF] ^ l2 >> 8;
        }
        byArray[n2 + 4 + n4] = (byte)(((l2 ^= 0xFFFFFFFFL) & 0xFFFFFFFFFF000000L) >> 24);
        byArray[n2 + 4 + n4 + 1] = (byte)((l2 & 0xFF0000L) >> 16);
        byArray[n2 + 4 + n4 + 2] = (byte)((l2 & 0xFF00L) >> 8);
        byArray[n2 + 4 + n4 + 3] = (byte)(l2 & 0xFFL);
        System.gc();
        n2 = 2;
        return Image.createImage((byte[])byArray, (int)n2, (int)n3);
    }

    private static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        graphics.fillTriangle(n2, n3, n4, n5, n6, n7);
    }

    private static void a(Graphics graphics, Image image, int n2, int n3, int n4) {
        graphics.drawImage(image, n2, n3, n4);
    }

    private static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        n5 = aA >= 176 ? (n5 += 2) : ++n5;
        Image image = d[n6];
        graphics.fillRect(n2 + image.getWidth(), n3, n4 - 2 * image.getWidth(), n5);
        graphics.fillRect(n2, n3 + image.getHeight(), n4, n5 - 2 * image.getHeight() + 1);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 0, n2, n3, 20);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 5, n2 + n4 - image.getWidth(), n3, 20);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 3, n2 + n4 - image.getWidth(), n3 + n5, 36);
        graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), 6, n2, n3 + n5, 36);
    }

    private static void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        n2 = Math.max(n2, 0);
        n3 = Math.max(n3, 0);
        n4 = Math.min(n4, az);
        n5 = Math.min(n5, aA);
        graphics.setClip(n2, n3, n4, n5);
    }

    public final void run() {
    }

    private static boolean e() {
        if (l) {
            if (h) {
                return g;
            }
            try {
                RecordStore recordStore = RecordStore.openRecordStore((String)"igp19", (boolean)false);
                recordStore.closeRecordStore();
                g = true;
            }
            catch (Exception exception) {}
            h = true;
        }
        return g;
    }

    private static void g() {
        if (d != null && d.length() > 0) {
            String string = d;
            d = null;
            try {
                a.platformRequest(string);
                Thread.sleep(200L);
            }
            catch (Exception exception) {}
            if (!t) {
                X = 1;
                return;
            }
            X = 4;
        }
    }

    public static boolean a(Graphics graphics, Image image, int n2, int n3, int n4) {
        if (s.e()) {
            return false;
        }
        if (!l || image == null || graphics == null) {
            return false;
        }
        if (System.currentTimeMillis() - a > 800L) {
            i = !i;
            a = System.currentTimeMillis();
        }
        if (i) {
            s.a(graphics, image, n2, n3, 0);
            return true;
        }
        return true;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (j) {
            if (command == a) {
                s.a(25);
                return;
            }
            if (command == b) {
                s.a(26);
            }
        }
    }

    private static InputStream a(String string) {
        return "a".getClass().getResourceAsStream(string);
    }

    private static void h() {
        int n2 = az - (2 * b[5].getWidth() + b[5].getWidth() / 4 + 8);
        if (az > aA) {
            n2 -= b[5].getWidth() / 2;
        }
        int n3 = (az << 1) / 100;
        b[11].getWidth();
        n2 = n2 - n3 * 2 - b[11].getWidth();
        try {
            for (n3 = 0; n3 < f.length; ++n3) {
                int n4;
                int n5;
                block15: {
                    int n6;
                    block13: {
                        block14: {
                            block12: {
                                if (f[n3] != null && n3 == q - 1 || f[n3] == null || n3 != s && n3 != u && n3 != y && n3 != r && n3 >= q && (n3 < D || n3 >= F + d.length)) continue;
                                n5 = az - 4;
                                int n7 = n4 = n3 == r ? 4 : 3;
                                if (!(c.length > 1 && n3 >= D && n3 < D + c.length || d.length > 1 && n3 >= F && n3 < F + d.length) && n3 != r) break block12;
                                n6 = n2;
                                break block13;
                            }
                            if (n3 != s && n3 != u && n3 != y) break block14;
                            n4 = 2;
                            n6 = az - (b[12].getWidth() << 1);
                            break block13;
                        }
                        if (n3 != q - 1) break block15;
                        n6 = c[o] != null ? c[o].getWidth() >> 1 : az;
                    }
                    n5 = n6;
                }
                int n8 = n5;
                n5 = 1;
                int n9 = n4;
                n4 = n8;
                String string = f[n3];
                String string2 = "";
                int n10 = 0;
                int n11 = 0;
                Object object = "";
                char[] cArray = string.toCharArray();
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    if (cArray[i2] == '\uff0c' || cArray[i2] == '\uff01' || cArray[i2] == '\uff1f' || cArray[i2] == '\uff1b' || cArray[i2] == '\uff1a') {
                        object = (String)object + cArray[i2];
                        object = (String)object + '|';
                        continue;
                    }
                    object = cArray[i2] == '\b' ? (String)object + '|' : (cArray[i2] == '\n' ? (String)object + ' ' : (String)object + cArray[i2]);
                }
                if (b[aw].equals("ZH-TW") && ((String)object).indexOf(124) == -1 && ((String)object).indexOf(32) == -1 && ((String)object).length() > 5) {
                    object = ((String)object).substring(0, ((String)object).length() >> 1) + "|" + ((String)object).substring(((String)object).length() >> 1, ((String)object).length());
                }
                string = object;
                short[] sArray = s.a(string, n4, true);
                object = string.toCharArray();
                for (int i3 = 0; i3 < sArray[0]; ++i3) {
                    if (n10 != 0) {
                        string2 = string2.trim();
                        if (++n11 >= n9) break;
                        string2 = string2 + "\n";
                    }
                    string2 = string2 + string.substring(n10, sArray[(i3 << 1) + 1]);
                    n10 = sArray[(i3 << 1) + 1];
                    if (string.length() == n10 || object[sArray[(i3 << 1) + 1]] != 10) continue;
                    ++n10;
                }
                s.f[n3] = string2;
                s.f[n3] = s.a(f[n3]);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static short[] a(String string, int n2, boolean bl) {
        int n3 = string.length();
        int n4 = 0;
        int n5 = 1;
        int n6 = 0;
        boolean bl2 = false;
        int n7 = 0;
        char[] cArray = string.toCharArray();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n8;
            int n9;
            int n10 = cArray[i2];
            if (n10 == 32) {
                n4 = (short)(n4 + s.a(n10, P));
                n10 = n6;
                n6 = i2;
                bl2 = true;
                n7 = 0;
                if (n6 == n3 - 2 && n4 + s.a(cArray[n6 + 1], P) > n2) {
                    if (n10 != 0) {
                        n6 = n10;
                    }
                    int n11 = n5;
                    n5 = (short)(n5 + 1);
                    s.b[n11] = (short)(n6 + 1);
                    int n12 = n5;
                    n5 = (short)(n5 + 1);
                    s.b[n12] = (short)n4;
                    n4 = 0;
                }
                if ((n9 = n4 > n2 ? 1 : 0) != 0) {
                    bl2 = false;
                    for (n8 = n6; n8 >= 0 && cArray[n8] == ' '; --n8) {
                        n4 = (short)(n4 - s.a(32, P));
                    }
                    n8 = 0;
                    while (n6 < n3 && cArray[n6] == ' ') {
                        n6 = (short)(n6 + 1);
                        ++n8;
                    }
                    if (n8 == 1 && i2 == n3 - 2) {
                        n6 = n10;
                    } else {
                        short s2 = (short)(n6 - 1);
                        n6 = s2;
                        i2 = s2;
                    }
                }
                if (n9 == 0) continue;
                int n13 = n5;
                n5 = (short)(n5 + 1);
                s.b[n13] = (short)(n6 + 1);
                int n14 = n5;
                n5 = (short)(n5 + 1);
                s.b[n14] = (short)n4;
                n4 = 0;
                continue;
            }
            if (n10 == 124) {
                if (!bl) break;
                n4 = (short)(n4 + s.a(n10, P));
                n6 = (short)i2;
                bl2 = true;
                n7 = 0;
                if (n4 <= n2) continue;
                bl2 = false;
                for (n9 = (int)n6; n9 >= 0 && cArray[n9] == ' '; --n9) {
                    n4 = (short)(n4 - s.a(32, P));
                }
                while (n6 < n3 && cArray[n6] == ' ') {
                    n6 = (short)(n6 + 1);
                }
                n6 = n6 - 1;
                i2 = n6;
                int n15 = n5;
                n5 = (short)(n5 + 1);
                s.b[n15] = (short)(n6 + 1);
                int n16 = n5;
                n5 = (short)(n5 + 1);
                s.b[n16] = (short)n4;
                n4 = 0;
                continue;
            }
            if (n10 == 10) {
                int n17 = n5;
                n5 = (short)(n5 + 1);
                s.b[n17] = (short)i2;
                int n18 = n5;
                n5 = (short)(n5 + 1);
                s.b[n18] = n4;
                n4 = 0;
                n7 = 0;
                continue;
            }
            n9 = s.a(n10, P) + h;
            n7 = (short)(n7 + n9);
            short s3 = (short)(n4 + n9);
            n4 = s3;
            if (s3 <= n2 || !bl2) continue;
            bl2 = false;
            for (n8 = n6; n8 >= 0 && cArray[n8] == ' '; --n8) {
                n4 = (short)(n4 - s.a(32, Q));
            }
            int n19 = n5;
            n5 = (short)(n5 + 1);
            s.b[n19] = (short)(n6 + 1);
            int n20 = n5;
            n5 = (short)(n5 + 1);
            s.b[n20] = (short)(n4 - n7);
            n4 = 0;
            i2 = n6;
        }
        if (n4 != 0) {
            int n21 = n5;
            n5 = (short)(n5 + 1);
            s.b[n21] = (short)n3;
            int n22 = n5;
            n5 = (short)(n5 + 1);
            s.b[n22] = n4;
        }
        s.b[0] = (short)(n5 / 2);
        return b;
    }

    private static String a(String string) {
        String string2 = "";
        char[] cArray = string.toCharArray();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (cArray[i2] == '|') continue;
            string2 = string2 + cArray[i2];
        }
        return string2;
    }

    static {
        e = "URL";
        a = 13568256;
        b = 2;
        c = 2;
        g = 0;
        h = 0;
        a = new boolean[1];
        a = new int[1];
        j = -1;
        k = 8;
        f = "WN";
        g = "BS";
        h = "CATALOG";
        i = "GLDT";
        j = "ZVIP";
        k = "PROMO";
        l = "URL-PT";
        m = "URL-OPERATOR";
        J = 15;
        N = 0;
        O = 1;
        P = 2;
        Q = 3;
        a = new String[]{e + "-" + f, e + "-" + g, e};
        n = "IGP-PROMOS";
        o = "IGP-WN";
        p = "IGP-BS";
        q = "IGP-CATEGORIES";
        r = "URL-TEMPLATE-GAME";
        s = "more_games_url";
        t = "more_games_status";
        u = null;
        v = null;
        w = "on";
        x = "XXXX";
        y = "&ctg=" + x;
        z = "&ctg=";
        A = "&lg=";
        B = "SC";
        C = "CCTL";
        D = "ingameads.gameloft.com/redir";
        E = ";";
        d = true;
        b = new String[0];
        g = false;
        h = false;
        a = 0L;
        i = true;
        j = false;
        a = null;
        a = null;
        k = false;
        I = null;
        l = false;
        m = false;
        an = -1;
        ao = 0;
        p = true;
        L = "";
        q = false;
        aD = 0;
        r = false;
        s = false;
        aE = -1;
        aF = -1;
        aG = -1;
        aH = -1;
        a = new Hashtable();
        t = false;
        aL = 0;
        u = false;
        b = new short[50];
    }
}

