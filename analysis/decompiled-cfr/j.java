/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class j
extends Canvas
implements Runnable {
    public static Graphics b = null;
    private static Graphics a = null;
    private static Graphics c = null;
    static boolean h;
    private static int a;
    private static long a;
    private static int b;
    private static int c;
    static Display a;
    private static boolean a;
    static MIDlet a;
    private static int d;
    private long b;
    private static int e;
    private static Image a;
    private static Graphics d;
    private static boolean b;
    static int a_;
    private static long c;
    static int b_;
    static int c_;
    static j a;
    private static boolean c;
    private static String a;
    private static byte[] a;
    private static byte[] b;
    private static int f;
    private static int g;
    private static Hashtable a;
    private static Hashtable b;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static boolean d;
    private static boolean e;
    private static int m;
    private static int n;
    private static Random a;
    static int d_;
    static int bC;
    private static int[] a;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static InputStream a;
    private static boolean f;
    private static String b;
    private static int u;
    private static int v;
    private static int[] b;
    private static String c;
    private static InputStream b;
    private static int w;
    private static byte[] c;
    private static int x;
    private static int y;
    private static short a;
    static int bD;
    private static boolean g;
    private static byte[][] a;
    private static long d;
    private static int z;
    private static int A;
    private static String d;
    private static int[] c;
    private static byte[][] b;
    private static int[] d;
    private static int[][] a;
    private static RecordStore a;
    private static int B;
    private static int C;
    private static int[] e;
    private static int[][] b;
    private static Image[] a;
    private static boolean k;
    static final boolean i;
    private static boolean l;
    private static int D;
    private static int[][] c;
    static boolean j;
    static int bE;
    static int bF;
    static int bG;
    static int bH;
    private static Image b;
    private static Graphics e;
    private static Image c;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static int L;
    private static int M;
    private static boolean m;
    private static boolean n;
    private static boolean o;

    abstract void c();

    public j(Object object, Object object2) {
        a = this;
        a = -1;
        a = true;
        a = (MIDlet)object;
        a = (Display)object2;
        this.d();
        b = new Hashtable();
        a = new Hashtable<Integer, Integer>();
        a.put(new Integer(48), new Integer(6));
        a.put(new Integer(49), new Integer(7));
        a.put(new Integer(50), new Integer(1));
        a.put(new Integer(51), new Integer(9));
        a.put(new Integer(52), new Integer(3));
        a.put(new Integer(53), new Integer(5));
        a.put(new Integer(54), new Integer(4));
        a.put(new Integer(55), new Integer(13));
        a.put(new Integer(56), new Integer(2));
        a.put(new Integer(57), new Integer(15));
        a.put(new Integer(35), new Integer(17));
        a.put(new Integer(42), new Integer(16));
        a.put(new Integer(-7), new Integer(18));
        a.put(new Integer(-6), new Integer(19));
        a.put(new Integer(-8), new Integer(24));
        b.put(new Integer(-5), new Integer(5));
        b.put(new Integer(-1), new Integer(1));
        b.put(new Integer(-2), new Integer(2));
        b.put(new Integer(-3), new Integer(3));
        b.put(new Integer(-4), new Integer(4));
        this.b = c = System.currentTimeMillis();
    }

    protected final void i() {
        if (a >= 0) {
            return;
        }
        b = 640;
        c = 360;
        a = new byte[h];
        b = new byte[h];
        I = 0;
        long l2 = System.currentTimeMillis();
        if (a == null) {
            a = new Random(l2);
        } else {
            a.setSeed(l2);
        }
        a = 0;
        new Thread(this).start();
    }

    protected void a() {
        if (!h) {
            h = true;
            p.f();
        }
    }

    protected void b() {
        if (h) {
            long l2;
            a = l2 = System.currentTimeMillis();
            c = l2;
            this.b = l2;
            h = false;
            this.d();
            if (!a) {
                this.repaint();
            }
            j.k();
        }
    }

    public void hideNotify() {
        this.a();
    }

    public void showNotify() {
        this.b();
    }

    public void sizeChanged(int n2, int n3) {
        b = n2;
        c = n3;
    }

    private void d() {
        this.setFullScreenMode(true);
        if (a != null && a.getCurrent() != this) {
            a.setCurrent((Displayable)this);
        }
    }

    protected static final void j() {
        a = -1;
    }

    public void run() {
        try {
            this.d();
            a = false;
            while (a >= 0) {
                if (!h) {
                    this.repaint();
                    this.serviceRepaints();
                    long l2 = System.currentTimeMillis();
                    this.b = Math.min(this.b, l2);
                    if (e >= 0) {
                        if (e == 0) {
                            Thread.yield();
                        } else {
                            Thread.sleep(e);
                        }
                    } else {
                        Thread.sleep(Math.max(1L, (long)d - (l2 - this.b)));
                    }
                    this.b = System.currentTimeMillis();
                    continue;
                }
                this.b = Math.min(this.b, System.currentTimeMillis());
                Thread.sleep(1L);
            }
        }
        catch (Exception exception) {
            a = -1;
        }
        a = null;
        b = null;
        a = null;
        System.gc();
        a.notifyDestroyed();
    }

    public void paint(Graphics graphics) {
        c = graphics;
        if (h || a) {
            return;
        }
        a = true;
        for (int i2 = 0; i2 < h; ++i2) {
            j.a[i2] = b[i2];
            if (b[i2] == 0) continue;
            if (b[i2] < 0) {
                j.b[i2] = 0;
                continue;
            }
            if (b[i2] >= 126) continue;
            int n2 = i2;
            b[n2] = (byte)(b[n2] + 1);
            if (i2 < 18) continue;
            int n3 = i2;
            b[n3] = -b[n3];
        }
        if (g > 0) {
            if (g != Integer.MAX_VALUE) {
                g -= a_;
            }
            j.k();
        }
        switch (I) {
            case 0: {
                break;
            }
            case 1: {
                j.b(4);
                break;
            }
            case 2: {
                j.b(0);
            }
        }
        if (m) {
            j.b(1);
            m = false;
        } else if (n) {
            j.b(2);
            n = false;
            o = false;
        } else if (o) {
            j.b(3);
            o = false;
        }
        L = J;
        M = K;
        a = System.currentTimeMillis();
        a_ = (int)(a - c);
        if (a_ < 0) {
            a_ = 0;
        }
        if (a_ > 1000) {
            a_ = 1000;
        }
        c = a;
        b_ += a_;
        ++c_;
        try {
            b = a = graphics;
            this.c();
        }
        catch (Exception exception) {
            a = -1;
        }
        if (Runtime.getRuntime().freeMemory() < (long)20000) {
            System.gc();
        }
        a = false;
        c = null;
    }

    protected void keyPressed(int n2) {
        byte by = j.a(n2);
        if (b == null) {
            return;
        }
        if (b[by] > 0) {
            return;
        }
        if (b[by] < 0) {
            j.b[by] = 0;
        }
        if (b[by] < 126) {
            byte by2 = by;
            b[by2] = (byte)(b[by2] + 1);
        }
    }

    protected void keyReleased(int n2) {
        byte by = j.a(n2);
        if (b == null) {
            return;
        }
        if (b[by] > 0) {
            byte by2 = by;
            b[by2] = -b[by2];
        }
    }

    public static void a(boolean bl, int n2, int n3) {
        Hashtable hashtable = a;
        Integer n4 = new Integer(n2);
        Integer n5 = (Integer)hashtable.get(n4);
        if (n5 != null) {
            hashtable.remove(n4);
        }
        hashtable.put(n4, new Integer(n3));
    }

    private static byte a(int n2) {
        Integer n3 = new Integer(n2);
        if (a == null) {
            return 0;
        }
        Integer n4 = (Integer)a.get(n3);
        if (n4 != null) {
            return n4.byteValue();
        }
        n4 = (Integer)b.get(n3);
        if (n4 != null) {
            return n4.byteValue();
        }
        return 0;
    }

    public static void k() {
        if (a != null && b != null) {
            for (int i2 = 0; i2 < h; ++i2) {
                j.a[i2] = 0;
                j.b[i2] = 0;
            }
        }
    }

    public static int c() {
        int n2 = h;
        while (--n2 >= 0) {
            if (a[n2] >= 0) continue;
            return n2;
        }
        return -1;
    }

    public static boolean a(int n2) {
        return a[n2] < 0;
    }

    static void a(String string) {
    }

    static void a(String string, int n2, int n3) {
        j.e(string);
        a = (int[])j.a(1);
        j.a(0);
        j.l();
    }

    static final int c(int n2) {
        return n2 << 8;
    }

    static final int d(int n2) {
        return n2 + 128 >> 8;
    }

    static int b(int n2, int n3, int n4) {
        n2 = n2 * n2 + n3 * n3;
        n3 = 1;
        for (n4 = 0; n4 < 30; ++n4) {
            n3 = n3 + n2 / n3 >> 1;
        }
        return n3;
    }

    static int b(int n2, int n3) {
        if (n3 != n2) {
            int n4 = a.nextInt();
            if (n4 < 0) {
                n4 = -n4;
            }
            return n2 + n4 % (n3 - n2);
        }
        return n3;
    }

    private static int a(int n2) {
        return n2 * o / 360;
    }

    private static final int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return (n2 * n6 + n3 * 2 * n5 + n4 * n7) / (1 << 16);
    }

    static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n8 * n8;
        int n10 = n - n8;
        int n11 = n10 * n10;
        d_ = j.a(n2, n4, n6, n10 *= n8, n11, n9);
        bC = j.a(n3, n5, n7, n10, n11, n9);
    }

    static final int c(int n2, int n3) {
        return n2 + n3;
    }

    static final int d(int n2, int n3) {
        return (int)(((long)n2 << 8 << 1) / (long)n3 + 1L) >> 1;
    }

    static final int e(int n2) {
        return Math.abs(n2);
    }

    private static void e(String string) {
        if (a != null && string != null && string.compareTo(b) == 0) {
            return;
        }
        w = 1;
        int n2 = 0;
        j.a(string, n2, null, 0);
    }

    private static InputStream a(String string, int n2, byte[] object, int n3) {
        c = string;
        c = null;
        x = 0;
        if (a != null) {
            if (string != null && string.compareTo(b) == 0) {
                if (u == n2) {
                    return a;
                }
                j.e();
            } else {
                j.f();
            }
        }
        if (a == null) {
            try {
                if (n2 > 0) {
                    string = string + "." + n2;
                }
                object = j.b(string);
                u = n2;
                f = ((InputStream)object).markSupported();
                if (n2 == 0) {
                    b = string;
                    v = ((InputStream)object).available();
                    int n4 = ((InputStream)object).read() & 0xFF;
                    a = (short)(n4 += (((InputStream)object).read() & 0xFF) << 8);
                    ((InputStream)object).available();
                    b = new int[n4];
                    for (n3 = 0; n3 < n4; ++n3) {
                        n2 = ((InputStream)object).read() & 0xFF;
                        n2 += (((InputStream)object).read() & 0xFF) << 8;
                        n2 += (((InputStream)object).read() & 0xFF) << 16;
                        j.b[n3] = n2 += (((InputStream)object).read() & 0xFF) << 24;
                    }
                    y = b[0];
                } else {
                    y = 0;
                }
                a = object;
            }
            catch (Throwable throwable) {}
        }
        return a;
    }

    private static void e() {
        try {
            if (a != null) {
                try {
                    a.close();
                }
                catch (Throwable throwable) {}
                a = null;
                b = null;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void f() {
        j.e();
        b = null;
        b = null;
    }

    private static int b(int n2) {
        int n3 = b[n2];
        n2 = b[n2 + 1] - n3 - 1;
        int n4 = 0;
        try {
            while (n3 > v) {
                n3 -= v;
                ++n4;
            }
            int n5 = n4;
            Object object = b;
            object = j.a((String)object, n5, null, 0);
            ((InputStream)object).available();
            if (y > n3) {
                j.e();
                n5 = n4;
                object = b;
                object = j.a((String)object, n5, null, 0);
            }
            ((InputStream)object).skip(n3 - y);
            bD = n4 = (byte)((InputStream)object).read() & 0xFF;
            g = false;
            y = n3 + 1;
        }
        catch (Throwable throwable) {}
        return n2;
    }

    private static byte[] a(String string, int n2, boolean bl) {
        byte[] byArray = null;
        j.e(string);
        try {
            n2 = j.b(n2);
            Object object = a;
            int n3 = ((InputStream)object).available();
            int n4 = 0;
            byArray = new byte[n2];
            while (n2 > 0) {
                int n5 = j.a((InputStream)object, byArray, n4, Math.min(n2, n3));
                n4 += n5;
                y += n5;
                if ((n2 -= n5) != 0 && n5 != -1) {
                    n3 = u + 1;
                    object = string;
                    object = j.a((String)object, n3, null, 0);
                    n3 = ((InputStream)object).available();
                    continue;
                }
                break;
            }
        }
        catch (Throwable throwable) {}
        return byArray;
    }

    private static int a(InputStream inputStream, byte[] byArray, int n2, int n3) {
        try {
            return inputStream.read(byArray, n2, n3);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static InputStream a(String object) {
        object = "".getClass().getResourceAsStream((String)object);
        return object;
    }

    static final void b(String string) {
        j.e(string);
    }

    private static InputStream b(String string) {
        InputStream inputStream = null;
        if (w == 3) {
            inputStream = new ByteArrayInputStream(c, x, c.length - x);
        } else if (w != 2 && w == 1) {
            inputStream = j.a(string);
        }
        return inputStream;
    }

    static final void l() {
        j.f();
        if (w == 3) {
            c = null;
        }
        System.gc();
    }

    static int f(int n2) {
        n2 = j.b(n2);
        int n3 = 0;
        b = a;
        try {
            n3 = a.available();
        }
        catch (Throwable throwable) {}
        if (n2 > n3) {
            n2 = n3;
        }
        return n2;
    }

    static final byte[] a(int n2) {
        return j.a(b, n2, false);
    }

    static int d() {
        int n2 = 0;
        try {
            n2 = b.read();
        }
        catch (Exception exception) {}
        ++y;
        return n2;
    }

    static int e() {
        return j.d() & 0xFF | (j.d() & 0xFF) << 8;
    }

    static int f() {
        return j.d() & 0xFF | (j.d() & 0xFF) << 8 | ((j.d() & 0xFF) << 16 | (j.d() & 0xFF) << 24);
    }

    private static int b(byte[] byArray, int n2, int n3) {
        n2 = 0;
        int n4 = n3;
        try {
            while (n4 > 0) {
                int n5 = b.read(byArray, n2, n4);
                n4 -= n5;
                n2 += n5;
            }
        }
        catch (Exception exception) {}
        y += n3;
        return n3;
    }

    static final Object a(int n2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j.a(n2));
        return j.a(byteArrayInputStream);
    }

    static void c(String string) {
        if (a == null) {
            InputStream inputStream = b;
            b = j.b(string);
            int n2 = j.d();
            a = new byte[n2][];
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = j.d();
                j.a[i2] = new byte[n3];
                j.b(a[i2], 0, n3);
            }
            try {
                b.close();
            }
            catch (Exception exception) {}
            b = inputStream;
        }
    }

    static String c(int n2) {
        if (n2 >= a.length) {
            return "";
        }
        try {
            return new String(a[n2], "UTF-8");
        }
        catch (Exception exception) {
            return "";
        }
    }

    static final void a(Graphics graphics) {
        b = a;
    }

    static final int g() {
        return b;
    }

    static final int h() {
        return c;
    }

    static final void m() {
        System.gc();
    }

    static final void f(int n2) {
        b.setColor(n2);
    }

    static final void a(Graphics graphics, int n2) {
        graphics.setColor(n2);
    }

    private static void a(Graphics graphics, int n2, int n3, int n4) {
        graphics.setColor(n2 << 16 | n3 << 8 | n4);
    }

    static final int i() {
        Graphics graphics = b;
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics.getClipX();
    }

    static final int j() {
        Graphics graphics = b;
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics.getClipY();
    }

    static final int k() {
        Graphics graphics = b;
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics.getClipWidth();
    }

    static final int l() {
        Graphics graphics = b;
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics.getClipHeight();
    }

    static final void a(int n2, int n3, int n4, int n5) {
        j.a(b, n2, n3, n4, n5);
    }

    static final int a(Graphics graphics) {
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics2.getClipX();
    }

    static final int b(Graphics graphics) {
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics2.getClipY();
    }

    static final int c(Graphics graphics) {
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics2.getClipWidth();
    }

    static final int d(Graphics graphics) {
        boolean bl = true;
        Graphics graphics2 = graphics;
        return graphics2.getClipHeight();
    }

    static final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        boolean bl = true;
        Graphics graphics2 = graphics;
        graphics2.setClip(n2, n3, n4, n5);
        graphics2.clipRect(n2, n3, n4, n5);
    }

    static final boolean a(Graphics graphics) {
        return graphics != null;
    }

    static final void b(int n2, int n3, int n4, int n5) {
        j.b(b, n2, n3, n4, n5);
    }

    static final void b(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.drawLine(n2, n3, n4, n5);
    }

    static final void c(int n2, int n3, int n4, int n5) {
        j.c(b, 0, 0, n4, n5);
    }

    static final void c(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.fillRect(n2, n3, n4, n5);
    }

    static final void d(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.drawRect(n2, n3, n4, n5);
    }

    static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        graphics.fillArc(n2, n3, n4, n5, n6, n7);
    }

    static final void b(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        graphics.drawArc(n2, n3, n4, n5, n6, n7);
    }

    static final void c(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        j.b(graphics, n2, n3, n4, n5);
        j.b(graphics, n2, n3, n6, n7);
        j.b(graphics, n6, n7, n4, n5);
        graphics.fillTriangle(n2, n3, n4, n5, n6, n7);
    }

    static final Image a(int[] object, int n2, int n3, boolean bl) {
        Image image = Image.createRGBImage((int[])object, (int)n2, (int)n3, (boolean)true);
        object = image;
        return image;
    }

    static final void a(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        j.a(graphics, nArray, n2, n3, n4, n5, n6, n7, bl, true, 0);
    }

    static final void a(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2, int n8) {
        int n9 = -1;
        Graphics graphics2 = graphics;
        j.a(graphics2, nArray, n2, n3, n4, n5, n6, n7, bl, bl2, n8, -1, true);
    }

    /*
     * WARNING - void declaration
     */
    static final void a(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2, int n8, int n9, boolean bl3) {
        void var10_16;
        if (var10_16 != false) {
            int n10;
            boolean bl4 = false;
            if ((var10_16 & 4) != 0) {
                n10 = n6;
                n6 = n7;
                n7 = n3;
                n3 = n6;
            }
            nArray = e.a(nArray, n6, n7, (int)var10_16);
            if ((var10_16 & 4) != 0) {
                n7 = n10;
            }
        }
        if (graphics == a) {
            void var12_18;
            int n11 = n3;
            void bl4 = var12_18;
            boolean bl5 = bl;
            int n12 = n7;
            n7 = n6;
            n6 = n5;
            n5 = n4;
            n4 = n2 / n3;
            n3 = n2 % n3;
            n2 = n11;
            Graphics graphics2 = graphics;
            j.a(graphics2, b, c, nArray, n2, n3, n4, n5, n6, n7, n12, bl5);
            return;
        }
        j.a(graphics, graphics.getClipX() + graphics.getClipWidth(), graphics.getClipY() + graphics.getClipHeight(), nArray, n3, n2 % n3, n2 / n3, n4, n5, n6, n7, bl);
    }

    private static void a(Graphics graphics, int n2, int n3, int[] nArray, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl) {
        int n11 = 0;
        int n12 = 0;
        n11 = graphics.getTranslateX();
        n12 = graphics.getTranslateY();
        graphics.translate(-n11, -n12);
        n5 += n6 * n4;
        if ((n7 += n11) >= n2 || n7 + n9 <= 0 || (n8 += n12) >= n3 || n8 + n10 <= 0) {
            return;
        }
        n6 = j.i();
        int n13 = j.j();
        int n14 = j.k();
        int n15 = j.l();
        if (n6 >= n2 || n6 + n14 <= 0 || n13 >= n3 || n13 + n15 <= 0) {
            return;
        }
        if (n7 <= 0) {
            n5 -= n7;
            n9 += n7;
            n7 = 0;
        }
        if (n7 + n9 >= n2) {
            n9 = n2 - n7;
        }
        if (n8 + n10 >= n3) {
            n10 = n3 - n8;
        }
        if (n8 <= 0) {
            n5 -= n8 * n4;
            n10 += n8;
            n8 = 0;
        }
        if (n5 > 0) {
            int[] nArray2 = e.a(nArray);
            if (nArray2.length < nArray.length - n5) {
                n13 = nArray2.length / n4;
                n14 = n10 / n13 + (n10 % n13 == 0 ? -1 : 0);
                n15 = n4 * n13;
                n2 = n15 - n5 % n4;
                n3 = n8 + n10;
                while (n14-- > 0) {
                    System.arraycopy(nArray, n5, nArray2, 0, n2);
                    graphics.drawRGB(nArray2, 0, n4, n7, n8, n9, n13, bl);
                    n8 += n13;
                    n5 += n15;
                }
                if (n8 + n13 > n3) {
                    n3 = n8 + n13 - n3;
                    n13 -= n3;
                    n2 -= n4 * n3;
                }
                System.arraycopy(nArray, n5, nArray2, 0, n2);
                n10 = n13;
            } else {
                System.arraycopy(nArray, n5, nArray2, 0, nArray.length - n5);
            }
            nArray = nArray2;
            n5 = 0;
        }
        graphics.drawRGB(nArray, n5, n4, n7, n8, n9, n10, bl);
        graphics.translate(n11, n12);
    }

    static void d(int n2) {
        try {
            if (d < a) {
                a.vibrate(n2);
                d = a + 200L;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final Image a(byte[] object, int n2, int n3) {
        Image image = Image.createImage((byte[])object, (int)0, (int)n3);
        object = image;
        n2 = image.getWidth();
        n3 = object.getHeight();
        int n4 = n2 * n3;
        Image image2 = Image.createImage((int)n2, (int)n3);
        Graphics graphics = image2.getGraphics();
        graphics.setColor(0xFF00FF);
        graphics.fillRect(0, 0, n2, n3);
        graphics.drawImage((Image)object, 0, 0, 0);
        object = e.a;
        if (e.a == null || ((byte[])object).length < n4) {
            object = new int[n4];
        }
        j.a(image2, object, 0, n2, 0, 0, n2, n3);
        --n4;
        while (n4 >= 0) {
            if ((object[n4] & 0xFFFFFF) == 0xFF00FF) {
                object[n4] = 0xFF00FF;
            }
            --n4;
        }
        return Image.createRGBImage((int[])object, (int)n2, (int)n3, (boolean)true);
    }

    static final void a(Image image, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        image.getRGB(nArray, n2, n3, n4, n5, n6, n7);
        int n8 = n2 + n6 * n7;
        while (n8-- > n2) {
            if ((nArray[n8] & 0xFFFFFF) != 0xFF00FF) continue;
            nArray[n8] = 0xFF00FF;
        }
    }

    static int a(byte[] byArray, int n2, byte by) {
        byArray[n2++] = by;
        return n2;
    }

    static int a(byte[] byArray, int n2, int n3) {
        byArray[n2++] = (byte)n3;
        byArray[n2++] = (byte)(n3 >>> 8);
        byArray[n2++] = (byte)(n3 >>> 16);
        byArray[n2++] = (byte)(n3 >>> 24);
        return n2;
    }

    static short a(byte[] byArray, int n2) {
        return (short)(byArray[n2++] & 0xFF | (byArray[n2] & 0xFF) << 8);
    }

    static int a(byte[] byArray, int n2) {
        return byArray[n2++] & 0xFF | (byArray[n2++] & 0xFF) << 8 | (byArray[n2++] & 0xFF) << 16 | (byArray[n2] & 0xFF) << 24;
    }

    private static Object a(InputStream inputStream) {
        Object[] objectArray = null;
        try {
            int n2 = j.a(inputStream);
            int n3 = n2 >> 4;
            int n4 = n2 & 7;
            n2 = (n2 & 8) != 0 ? j.b(inputStream) : j.a(inputStream);
            switch (n4) {
                case 0: {
                    byte[] byArray = new byte[n2];
                    for (n3 = 0; n3 < n2; ++n3) {
                        byArray[n3] = (byte)j.a(inputStream);
                    }
                    objectArray = byArray;
                    break;
                }
                case 1: {
                    short[] sArray = new short[n2];
                    if (n3 == 0) {
                        for (n3 = 0; n3 < n2; ++n3) {
                            sArray[n3] = (byte)j.a(inputStream);
                        }
                    } else {
                        for (n3 = 0; n3 < n2; ++n3) {
                            sArray[n3] = (short)j.b(inputStream);
                        }
                    }
                    objectArray = sArray;
                    break;
                }
                case 2: {
                    int[] nArray = new int[n2];
                    if (n3 == 0) {
                        for (n3 = 0; n3 < n2; ++n3) {
                            nArray[n3] = (byte)j.a(inputStream);
                        }
                    } else if (n3 == 1) {
                        for (n3 = 0; n3 < n2; ++n3) {
                            nArray[n3] = (short)j.b(inputStream);
                        }
                    } else {
                        for (n3 = 0; n3 < n2; ++n3) {
                            nArray[n3] = j.c(inputStream);
                        }
                    }
                    objectArray = nArray;
                    break;
                }
                default: {
                    Object[] objectArray2;
                    switch (n4 &= 3) {
                        case 0: {
                            Object object;
                            if (n3 == 2) {
                                object = new byte[n2][];
                                objectArray2 = (Object[])object;
                                break;
                            }
                            byte[][][] byArrayArray = new byte[n2][][];
                            object = byArrayArray;
                            objectArray2 = (Object[])byArrayArray;
                            break;
                        }
                        case 1: {
                            Object object;
                            if (n3 == 2) {
                                short[][] sArrayArray = new short[n2][];
                                object = sArrayArray;
                                objectArray2 = (Object[])sArrayArray;
                                break;
                            }
                            short[][][] sArrayArray = new short[n2][][];
                            object = sArrayArray;
                            objectArray2 = (Object[])sArrayArray;
                            break;
                        }
                        default: {
                            Object object;
                            if (n3 == 2) {
                                int[][] nArrayArray = new int[n2][];
                                object = nArrayArray;
                                objectArray2 = (Object[])nArrayArray;
                                break;
                            }
                            int[][][] nArrayArray = new int[n2][][];
                            object = nArrayArray;
                            objectArray2 = (Object[])nArrayArray;
                        }
                    }
                    for (int i2 = 0; i2 < n2; ++i2) {
                        objectArray2[i2] = j.a(inputStream);
                    }
                    objectArray = objectArray2;
                    break;
                }
            }
        }
        catch (Exception exception) {}
        return objectArray;
    }

    private static int a(InputStream inputStream) {
        int n2 = inputStream.read();
        if (n2 >= 0) {
            ++A;
        }
        return n2;
    }

    private static int b(InputStream inputStream) {
        return j.a(inputStream) & 0xFF | (j.a(inputStream) & 0xFF) << 8;
    }

    private static int c(InputStream inputStream) {
        return j.a(inputStream) & 0xFF | (j.a(inputStream) & 0xFF) << 8 | ((j.a(inputStream) & 0xFF) << 16 | (j.a(inputStream) & 0xFF) << 24);
    }

    private static int b(InputStream inputStream, byte[] byArray, int n2, int n3) {
        n2 = 0;
        int n4 = n3;
        try {
            while (n4 > 0) {
                int n5 = inputStream.read(byArray, n2, n4);
                n4 -= n5;
                n2 += n5;
            }
        }
        catch (Exception exception) {}
        A += n3;
        return n3;
    }

    private static byte[] a(int[] nArray, boolean n2, byte[] byArray) {
        int n3 = nArray.length << 2;
        if (n2 != 0) {
            n2 = nArray[nArray.length - 1];
            if (n2 > n3) {
                return null;
            }
            n3 = n2;
        }
        byArray = new byte[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            byArray[n2] = (byte)(nArray[n2 >>> 2] >>> ((n2 & 3) << 3));
        }
        return byArray;
    }

    private static int[] a(byte[] byArray, boolean n2, int[] nArray) {
        int n3;
        int n4 = n3 = (byArray.length & 3) == 0 ? byArray.length >>> 2 : (byArray.length >>> 2) + 1;
        if (n2 != 0) {
            int[] nArray2 = new int[n3 + 1];
            nArray = nArray2;
            nArray2[n3] = byArray.length;
        } else {
            nArray = new int[n3];
        }
        n3 = byArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            int n5 = n2 >>> 2;
            nArray[n5] = nArray[n5] | (0xFF & byArray[n2]) << ((n2 & 3) << 3);
        }
        return nArray;
    }

    private static int d(InputStream inputStream) {
        int n2 = 0;
        try {
            n2 = j.a(inputStream);
            j.d[n2] = j.c(inputStream);
            if (d[n2] > 2048) {
                j.d[n2] = 2048;
            }
            j.a[n2] = new int[d[n2] + 1];
            for (int i2 = 1; i2 < d[n2] + 1; ++i2) {
                j.a[n2][i2] = j.c(inputStream);
            }
            j.b[n2] = new byte[a[n2][d[n2]]];
            j.b(inputStream, b[n2], 0, b[n2].length);
        }
        catch (Exception exception) {}
        return n2;
    }

    static void a(String string, int n2) {
        int n3;
        j.a(n2);
        if (c == null) {
            c = new int[32];
            for (n3 = 0; n3 < 32; ++n3) {
                j.c[n3] = -1;
            }
            b = new byte[32][];
            a = new int[32][];
            d = new int[32];
        }
        j.e(string);
        j.c[n2] = n3 = j.d(new ByteArrayInputStream(j.a(n2)));
        j.l();
    }

    static final void d(String string) {
        d = string;
    }

    static String d(int n2) {
        int n3 = n2 >> 11;
        n2 &= 0x7FF;
        try {
            int n4 = a[n3][n2 + 1] - a[n3][n2];
            if (n4 == 0) {
                return null;
            }
            return new String(b[n3], a[n3][n2], n4, d);
        }
        catch (Exception exception) {
            return null;
        }
    }

    static final int m() {
        if (d == null) {
            String string = "No strings loaded!";
            return 0;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < 32; ++i2) {
            n2 += d[i2];
        }
        return n2;
    }

    static void n() {
        for (int i2 = 0; i2 < 32; ++i2) {
            j.a(i2);
        }
    }

    private static void a(int n2) {
        if (c != null) {
            int n3 = c[n2];
            if (n3 == -1) {
                return;
            }
            j.a[n3] = null;
            j.b[n3] = null;
            j.d[n3] = 0;
            j.c[n2] = -1;
        }
    }

    static String a(int n2, int n3, String string) {
        if (n2 < 1000) {
            return "" + n2;
        }
        String string2 = "";
        switch (n3) {
            case 0: 
            case 7: 
            case 8: 
            case 9: 
            case 15: 
            case 17: {
                string2 = ",";
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 16: {
                string2 = ".";
                break;
            }
            case 12: 
            case 13: {
                string2 = string;
                break;
            }
            case 2: 
            case 4: 
            case 6: 
            case 10: {
                if (n2 < 10000) break;
                string2 = string;
                break;
            }
            case 11: 
            case 14: {
                if (n2 < 10000) break;
                string2 = ".";
                break;
            }
            default: {
                return "" + n2;
            }
        }
        String string3 = "";
        int n4 = n2 % 1000 < 0 ? -(n2 % 1000) : n2 % 1000;
        n2 /= 1000;
        while (n4 != 0 || n2 != 0) {
            string3 = n4 < 10 ? "00" + (n4 < 0 ? -n4 : n4) + string3 : (n4 < 100 ? "0" + (n4 < 0 ? -n4 : n4) + string3 : (n4 < 0 ? -n4 : n4) + string3);
            n4 = n2 % 1000;
            if ((n2 /= 1000) != 0) {
                string3 = string2 + string3;
                continue;
            }
            if (n4 == 0) continue;
            string3 = n4 + string2 + string3;
            n4 = 0;
        }
        return string3;
    }

    private static void g() {
        if (a == null) {
            return;
        }
        try {
            a.closeRecordStore();
        }
        catch (RecordStoreException recordStoreException) {}
        a = null;
    }

    private static void f(String string) {
        a = RecordStore.openRecordStore((String)string, (boolean)true);
    }

    static byte[] a(String string) {
        String string2 = "";
        byte[] byArray = null;
        if (!"".equals(string2) && string2 != null) {
            byArray = string2.getBytes();
        }
        string2 = byArray;
        return j.a(string, (byte[])string2);
    }

    private static byte[] a(String object, byte[] objectArray) {
        Object object2 = null;
        try {
            j.f((String)object);
            if (a.getNumRecords() > 0) {
                object2 = a.getRecord(1);
            }
        }
        catch (RecordStoreException recordStoreException) {
            object2 = null;
        }
        if (objectArray != null) {
            Object object3;
            object = object2;
            if (object2 == null || ((Object)object).length == 0) {
                object3 = object;
            } else {
                int[] nArray = j.a((byte[])object, false, null);
                objectArray = j.a(objectArray, false, null);
                object = nArray;
                int n2 = nArray.length - 1;
                if (n2 >= 1) {
                    if (objectArray.length < 4) {
                        int[] nArray2 = new int[4];
                        System.arraycopy(objectArray, 0, nArray2, 0, objectArray.length);
                        objectArray = nArray2;
                    }
                    Object object4 = object[0];
                    int n3 = -1640531527;
                    Object object42 = 6 + 52 / (n2 + 1);
                    for (int i2 = object42 * n3; i2 != 0; i2 -= n3) {
                        reference var4_7;
                        int n4;
                        int n5 = i2 >>> 2 & 3;
                        for (n4 = n2; n4 > 0; --n4) {
                            object42 = object[n4 - 1];
                            Object object5 = object;
                            int n6 = n4;
                            reference v5 = object5[n6] - ((object42 >>> 5 ^ var4_7 << 2) + (var4_7 >>> 3 ^ object42 << 4) ^ (i2 ^ var4_7) + (objectArray[n4 & 3 ^ n5] ^ object42));
                            object5[n6] = v5;
                            var4_7 = v5;
                        }
                        object42 = object[n2];
                        Object object6 = object;
                        reference v7 = object6[0] - ((object42 >>> 5 ^ var4_7 << 2) + (var4_7 >>> 3 ^ object42 << 4) ^ (i2 ^ var4_7) + (objectArray[n4 & 3 ^ n5] ^ object42));
                        object6[0] = v7;
                        var4_7 = v7;
                    }
                }
                object3 = j.a((int[])object, true, null);
            }
            object2 = object3;
        }
        j.g();
        return object2;
    }

    static void a(String string, byte[] byArray) {
        String string2 = "";
        Object object = null;
        if (!"".equals(string2) && string2 != null) {
            object = string2.getBytes();
        }
        string2 = object;
        object = string2;
        int n2 = byArray.length;
        boolean bl = false;
        String string3 = string;
        j.a(string, byArray, 0, n2, object);
    }

    private static void a(String string, byte[] objectArray, int n2, int n3, byte[] byArray) {
        if (byArray != null) {
            byte[] byArray2;
            Object[] objectArray2 = byArray;
            if (objectArray.length == 0) {
                byArray2 = objectArray;
            } else {
                int[] nArray = j.a(objectArray, true, null);
                objectArray2 = j.a(objectArray2, false, null);
                objectArray = nArray;
                int n4 = nArray.length - 1;
                if (n4 >= 1) {
                    if (objectArray2.length < 4) {
                        int[] nArray2 = new int[4];
                        System.arraycopy(objectArray2, 0, nArray2, 0, objectArray2.length);
                        objectArray2 = nArray2;
                    }
                    int n5 = objectArray[n4];
                    int n6 = -1640531527;
                    int n7 = 0;
                    int n8 = 6 + 52 / (n4 + 1);
                    while (n8-- > 0) {
                        byte by;
                        int n9;
                        int n10 = (n7 += n6) >>> 2 & 3;
                        for (n9 = 0; n9 < n4; ++n9) {
                            by = objectArray[n9 + 1];
                            int n11 = n9;
                            int n12 = objectArray[n11] + ((n5 >>> 5 ^ by << 2) + (by >>> 3 ^ n5 << 4) ^ (n7 ^ by) + (objectArray2[n9 & 3 ^ n10] ^ n5));
                            objectArray[n11] = n12;
                            n5 = n12;
                        }
                        by = objectArray[0];
                        int n13 = n4;
                        int n14 = objectArray[n13] + ((n5 >>> 5 ^ by << 2) + (by >>> 3 ^ n5 << 4) ^ (n7 ^ by) + (objectArray2[n9 & 3 ^ n10] ^ n5));
                        objectArray[n13] = n14;
                        n5 = n14;
                    }
                }
                byArray2 = j.a((int[])objectArray, false, null);
            }
            objectArray = byArray2;
            n3 = byArray2.length;
        }
        try {
            j.f(string);
            if (a.getNumRecords() > 0) {
                a.setRecord(1, objectArray, n2, n3);
            } else {
                a.addRecord(objectArray, n2, n3);
            }
        }
        catch (RecordStoreException recordStoreException) {}
        j.g();
    }

    static void g(int n2) {
        int n3;
        int n4;
        int n5;
        block5: {
            if (e == null) {
                e = new int[1];
                b = new int[1][];
                a = new Image[1];
            }
            n5 = n2;
            for (n4 = 0; n4 < e.length; ++n4) {
                if (e[n4] != n5) continue;
                n3 = n4;
                break block5;
            }
            n3 = n5 = -1;
        }
        if (n3 == -1 || a == null) {
            C = C + 1;
            n5 = 0;
            j.e[n5] = n2;
            j.b[n5] = e.a;
            if (b[n5] == null) {
                j.b[n5] = new int[1600];
            }
            n4 = 1600;
            while (n4 > 0) {
                j.b[n5][--n4] = n2;
            }
            j.a[n5] = j.a(b[n5], 40, 40, true);
        }
        C = n5;
    }

    static void e(Graphics graphics, int n2, int n3, int n4, int n5) {
        int n6 = j.a(graphics);
        int n7 = j.b(graphics);
        int n8 = j.c(graphics);
        int n9 = j.d(graphics);
        int n10 = n2 > n6 ? n2 : n6;
        int n11 = n3 > n7 ? n3 : n7;
        n4 = (n2 + n4 < n6 + n8 ? n2 + n4 : n6 + n8) - n10;
        n5 = (n3 + n5 < n7 + n9 ? n3 + n5 : n7 + n9) - n11;
        if (n4 <= 0 || n5 <= 0) {
            return;
        }
        j.a(graphics, n10, n11, n4, n5);
        n4 += n10;
        n5 += n11;
        for (n2 = n10; n2 < n4; n2 += 40) {
            for (n3 = n11; n3 < n5; n3 += 40) {
                n10 = 20;
                int n12 = n3;
                int n13 = n2;
                Image image = a[C];
                Graphics graphics2 = graphics;
                boolean bl = true;
                int n14 = 20;
                Graphics graphics3 = graphics2;
                try {
                    graphics3.drawImage(image, n13, n12, n14);
                    continue;
                }
                catch (Exception exception) {}
            }
        }
        j.a(graphics, n6, n7, n8, n9);
    }

    private static final void b(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        j.a(graphics, nArray, 0, n3, n4, n5, n6, n7, bl);
    }

    static final void o() {
        D = 0;
        G = b;
        H = c;
        int[][] nArrayArray = new int[18][];
        c = nArrayArray;
        nArrayArray[13] = new int[5];
        int n2 = 13;
        switch (13) {
            case 0: {
                break;
            }
            case 1: {
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                break;
            }
            case 12: {
                break;
            }
            case 13: {
                j.c[13][1] = 100;
                j.c[13][2] = -1;
                j.c[13][0] = -1;
                j.c[13][3] = 100;
                j.c[13][4] = 100;
                break;
            }
            case 16: {
                j.c[16][0] = 0;
            }
        }
        E = 0;
        l = true;
    }

    static final void h(int n2) {
        int n3 = n2;
        n2 = 0;
        n2 = n3;
        D |= 1 << n2;
        if ((1 << n2 & 0x9FF) != 0) {
            D &= 0xFFFFF600;
        }
        if ((1 << n2 & 0x1F) != 0) {
            E |= 1 << n2;
        }
    }

    static final void i(int n2) {
        int n3 = n2;
        n2 = 0;
        n2 = n3;
        D &= ~(1 << n2);
        if ((1 << n2 & 0x1F) != 0) {
            E &= ~(1 << n2);
        }
    }

    static final boolean b(int n2) {
        return (D & 1 << n2) != 0;
    }

    static final int n() {
        return D & 0x3F7E0;
    }

    static final void p() {
        D &= 0xFFFC081F;
    }

    static final void a(int n2, int n3, int n4) {
        j.c[n2][n3] = n4;
    }

    static final int o() {
        int n2 = 1;
        int n3 = 13;
        if ((n3 = c[n3][n2]) != 100) {
            return n3;
        }
        n2 = 3;
        n3 = 13;
        return c[n3][n2];
    }

    static final int p() {
        int n2 = 1;
        int n3 = 13;
        if ((n3 = c[n3][n2]) != 100) {
            return n3;
        }
        n2 = 4;
        n3 = 13;
        return c[n3][n2];
    }

    static final void j(int n2) {
        j.a(13, 1, n2);
        j.a(13, 3, n2);
        j.a(13, 4, n2);
    }

    private static final boolean a(boolean bl, int n2) {
        if (n2 == 1) {
            return false;
        }
        if (n2 == 2) {
            return true;
        }
        return bl;
    }

    static final int[] a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        int[] nArray = e.a(null);
        j.a(image, nArray, 0, n4, 0, 0, n4, n5);
        return j.a(graphics, nArray, n2, n3, n4, n5, n6, bl, bl2);
    }

    static final int[] a(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        return j.a(graphics, nArray, n2, n3, n4, n5, n6, bl, bl2, true);
    }

    static final int[] a(Graphics graphics, int[] nArray, int n2, int n3, int n4, int n5, int n6, boolean n7, boolean n8, boolean n9) {
        j = n7;
        bE = n4;
        bF = n5;
        bG = n4;
        bH = n5;
        if ((D & 0x5600) != 0) {
            if ((n6 & 4) != 0) {
                bE = n5;
                bF = n4;
                n4 = bE;
                n5 = bF;
            }
            nArray = e.a(nArray, n4, n5, n6);
        }
        int[] nArray2 = e.a(nArray, n4, n5);
        if ((D & 0x2000) != 0) {
            n8 = j.a(n8 != 0, c[13][0]) ? 1 : 0;
            int n10 = n9;
            int n11 = n6;
            int n12 = n8;
            boolean bl = n7;
            n9 = c[13][2];
            n8 = j.p();
            n7 = j.o();
            n6 = n5;
            n5 = n4;
            n4 = n3;
            n3 = n2;
            int[] nArray3 = nArray2;
            int n13 = 0;
            int n14 = n11 & 0xFFFFFFFE;
            if ((n11 & 4) != 0) {
                n14 = n11;
                n11 = 0;
            }
            if (n14 != 0) {
                if ((n14 & 4) != 0) {
                    bE = n6;
                    bF = n5;
                    n5 = bE;
                    n6 = bF;
                }
                nArray = e.a(nArray, n5, n6, n14);
                nArray3 = e.a(nArray, n5, n6);
            }
            n7 = n5 * n7 / 100 + (n5 * n7 % 100 != 0 ? 1 : 0);
            n8 = n6 * n8 / 100 + (n6 * n8 % 100 != 0 ? 1 : 0);
            bG = n7;
            bH = n8;
            if (n7 <= 0 || n8 <= 0) {
                return null;
            }
            n14 = (n5 << 8) / n7;
            int n15 = (n6 << 8) / n8;
            boolean bl2 = false;
            Graphics graphics2 = graphics;
            n6 = graphics2.getClipX();
            boolean bl3 = false;
            Graphics graphics3 = graphics;
            int n16 = graphics3.getClipY();
            boolean bl4 = false;
            Graphics graphics4 = graphics;
            int n17 = graphics4.getClipWidth();
            boolean bl5 = false;
            Graphics graphics5 = graphics;
            int n18 = graphics5.getClipHeight();
            int n19 = n7;
            int n20 = 0;
            int n21 = n7;
            int n22 = 0;
            if (n3 < n6) {
                if ((n7 -= n6 - n3) <= 0) {
                    return null;
                }
                n20 = n6 - n3;
                n3 = n6;
            }
            if (n4 < n16) {
                if ((n8 -= n16 - n4) <= 0) {
                    return null;
                }
                n22 = n16 - n4;
                n4 = n16;
            }
            if (n3 + n7 > n6 + n17) {
                n7 = n6 + n17 - n3;
                if (n7 <= 0) {
                    return null;
                }
                n21 = n20 + n7;
            }
            if (n4 + n8 > n16 + n18 && (n8 = n16 + n18 - n4) <= 0) {
                return null;
            }
            n16 = nArray3.length / n7;
            if (n16 <= 0) {
                return null;
            }
            n17 = n16;
            n18 = n4;
            if (n9 < 0) {
                int n23 = n16 * n7;
                if ((n11 & 1) != 0) {
                    n11 = (n19 - n21) * n14;
                    n12 = n14;
                } else {
                    n11 = (n21 - 1) * n14;
                    n12 = -n14;
                }
                n17 = n8 - n8 / n16 * n16;
                if (n17 == 0) {
                    n17 = n16;
                }
                n14 = n17;
                n13 = n17 * n7;
                n18 = n4 + n8 - n17;
                n19 = n8;
                n22 = (n19 + n22) * n15;
                while (--n19 >= 0) {
                    n6 = (((n22 -= n15) >> 8) * n5 << 8) + n11;
                    int n24 = n21;
                    while (--n24 >= n20) {
                        nArray3[--n13] = nArray[n6 >> 8];
                        n6 += n12;
                    }
                    if (--n17 != 0) continue;
                    if (n10 != 0) {
                        j.b(graphics, nArray3, 0, n7, n3, n18, n7, n14, bl);
                    }
                    n14 = n16;
                    n18 -= n16;
                    n17 = n16;
                    n13 = n23;
                }
            } else {
                int n25;
                if ((n11 & 1) != 0) {
                    n25 = (n19 - n20 - 1) * n14;
                    n11 = -n14;
                } else {
                    n25 = n20 * n14;
                    n11 = n14;
                }
                if (n12 == 0 && !bl) {
                    n9 = (n9 & 0xFF) << 24;
                    n12 = 0;
                    n14 = n22 * n15;
                    while (n12 < n8) {
                        n4 = (n14 >> 8) * n5;
                        n19 = 0;
                        n22 = n25;
                        while (n19 < n7) {
                            n6 = n4 + (n22 >> 8);
                            nArray3[n13++] = n9 | nArray[n6] & 0xFFFFFF;
                            ++n19;
                            n22 += n11;
                        }
                        if (--n17 == 0) {
                            if (n10 != 0) {
                                j.b(graphics, nArray3, 0, n7, n3, n18, n7, n16, true);
                            }
                            n18 += n16;
                            n17 = n16;
                            n13 = 0;
                        }
                        ++n12;
                        n14 += n15;
                    }
                } else if (n12 == 0 && bl) {
                    n9 = (n9 & 0xFF) << 24;
                    n12 = 0;
                    n14 = n22 * n15;
                    while (n12 < n8) {
                        n4 = (n14 >> 8) * n5;
                        n19 = 0;
                        n22 = n25;
                        while (n19 < n7) {
                            n6 = n4 + (n22 >> 8);
                            int n26 = nArray[n6] & 0xFFFFFF;
                            nArray3[n13++] = n26 != 0xFF00FF && n26 != 0 ? n9 | n26 : 0;
                            ++n19;
                            n22 += n11;
                        }
                        if (--n17 == 0) {
                            if (n10 != 0) {
                                j.b(graphics, nArray3, 0, n7, n3, n18, n7, n16, true);
                            }
                            n18 += n16;
                            n17 = n16;
                            n13 = 0;
                        }
                        ++n12;
                        n14 += n15;
                    }
                } else {
                    n12 = 0;
                    n14 = n22 * n15;
                    while (n12 < n8) {
                        n4 = (n14 >> 8) * n5;
                        n19 = 0;
                        n22 = n25;
                        while (n19 < n7) {
                            n6 = n4 + (n22 >> 8);
                            int n27 = nArray[n6] >>> 24;
                            n27 = n27 * n9 >> 8;
                            n27 = (n27 & 0xFF & 0xFF) << 24;
                            nArray3[n13++] = n27 | nArray[n6] & 0xFFFFFF;
                            ++n19;
                            n22 += n11;
                        }
                        if (--n17 == 0) {
                            if (n10 != 0) {
                                j.b(graphics, nArray3, 0, n7, n3, n18, n7, n16, true);
                            }
                            n18 += n16;
                            n17 = n16;
                            n13 = 0;
                        }
                        ++n12;
                        n14 += n15;
                    }
                }
                if (n10 != 0 && n17 != n16) {
                    j.b(graphics, nArray3, 0, n7, n3, n18, n7, n16 - n17, true);
                }
            }
            if (n10 != 0) {
                return null;
            }
            return nArray3;
        }
        return null;
    }

    static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        j.a(b, n2, n3, n4, n5, n6, n7, n8);
    }

    static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n6 >> 16 & 0xFF;
        int n10 = n6 >> 8 & 0xFF;
        n6 &= 0xFF;
        int n11 = n7 >> 16 & 0xFF;
        int n12 = n7 >> 8 & 0xFF;
        n7 &= 0xFF;
        n11 -= n9;
        n12 -= n10;
        n7 -= n6;
        n4 = n2 + n4 - 1;
        n5 = n3 + n5 - 1;
        n9 <<= 16;
        n10 <<= 16;
        n6 <<= 16;
        if (n8 == 4) {
            n8 = n4 - n2;
            n11 = (n11 << 16) / n8;
            n12 = (n12 << 16) / n8;
            n7 = (n7 << 16) / n8;
            for (n8 = n4; n8 >= n2; --n8) {
                j.a(graphics, n9 >> 16, n10 >> 16, n6 >> 16);
                j.b(graphics, n8, n3, n8, n5);
                n9 += n11;
                n10 += n12;
                n6 += n7;
            }
            return;
        }
        if (n8 == 8) {
            n8 = n4 - n2;
            n11 = (n11 << 16) / n8;
            n12 = (n12 << 16) / n8;
            n7 = (n7 << 16) / n8;
            for (n8 = n2; n8 <= n4; ++n8) {
                j.a(graphics, n9 >> 16, n10 >> 16, n6 >> 16);
                j.b(graphics, n8, n3, n8, n5);
                n9 += n11;
                n10 += n12;
                n6 += n7;
            }
            return;
        }
        if (n8 == 16) {
            n8 = n5 - n3;
            n11 = (n11 << 16) / n8;
            n12 = (n12 << 16) / n8;
            n7 = (n7 << 16) / n8;
            for (n8 = n5; n8 >= n3; --n8) {
                j.a(graphics, n9 >> 16, n10 >> 16, n6 >> 16);
                j.b(graphics, n2, n8, n4, n8);
                n9 += n11;
                n10 += n12;
                n6 += n7;
            }
            return;
        }
        if (n8 == 32) {
            n8 = n5 - n3;
            n11 = (n11 << 16) / n8;
            n12 = (n12 << 16) / n8;
            n7 = (n7 << 16) / n8;
            for (n8 = n3; n8 <= n5; ++n8) {
                j.a(graphics, n9 >> 16, n10 >> 16, n6 >> 16);
                j.b(graphics, n2, n8, n4, n8);
                n9 += n11;
                n10 += n12;
                n6 += n7;
            }
        }
    }

    static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        block9: {
            int n9;
            int[] nArray;
            int n10;
            block8: {
                int n11;
                int n12 = n4;
                n10 = n5;
                if (n8 == 16 || n8 == 32) {
                    n12 = n5;
                    n10 = n4;
                }
                if (n8 == 4 || n8 == 16) {
                    n11 = n6;
                    n6 = n7;
                    n7 = n11;
                }
                n9 = n10 < (nArray = e.a(null)).length / n12 ? n10 : nArray.length / n12;
                int n13 = n6 >>> 24;
                int n14 = n6 >> 16 & 0xFF;
                int n15 = n6 >> 8 & 0xFF;
                int n16 = n6 & 0xFF;
                n11 = n7 >>> 24;
                int n17 = n7 >> 16 & 0xFF;
                int n18 = n7 >> 8 & 0xFF;
                int n19 = (n11 - n13 << 16) / --n12;
                n17 = (n17 - n14 << 16) / n12;
                int n20 = (n18 - n15 << 16) / n12;
                int n21 = ((n7 &= 0xFF) - n16 << 16) / n12;
                ++n12;
                n13 <<= 16;
                n14 <<= 16;
                n15 <<= 16;
                n16 <<= 16;
                if (n8 == 4 || n8 == 8) {
                    n18 = n4;
                    n7 = -(n4 * n9) + 1;
                } else {
                    n18 = 1;
                    n7 = 0;
                }
                n11 = 0;
                for (int i2 = 0; i2 < n12; ++i2) {
                    int n22 = n9;
                    while (--n22 >= 0) {
                        nArray[n11] = n6;
                        n11 += n18;
                    }
                    n6 = (n13 += n19) << 8 & 0xFF000000 | (n14 += n17) & 0xFF0000 | (n15 += n20) >> 8 & 0xFF00 | (n16 += n21) >> 16 & 0xFF;
                    n11 += n7;
                }
                if (n8 != 4 && n8 != 8) break block8;
                while (n10 > 0) {
                    j.a(b, nArray, 0, n4, n2, n3, n4, n9 < n10 ? n9 : n10, true);
                    n3 += n9;
                    n10 -= n9;
                }
                break block9;
            }
            if (n8 != 16 && n8 != 32) break block9;
            while (n10 > 0) {
                j.a(b, nArray, 0, n9, n2, n3, n9 < n10 ? n9 : n10, n5, true);
                n2 += n9;
                n10 -= n9;
            }
        }
    }

    public void addCommand(Command command) {
        super.addCommand(command);
    }

    protected static void Pointer_SetCurrentPointer(int n2) {
    }

    protected static int Pointer_GetNumPointers() {
        return 1;
    }

    private static final void b(int n2) {
        int n3 = n2;
        n2 = 0;
        I = n3;
    }

    protected void pointerReleased(int n2, int n3) {
        boolean bl = false;
        J = n2;
        K = n3;
        n = true;
    }

    protected void pointerPressed(int n2, int n3) {
        boolean bl = false;
        J = n2;
        K = n3;
        m = true;
    }

    protected void pointerDragged(int n2, int n3) {
        boolean bl = false;
        J = n2;
        K = n3;
        o = true;
    }

    static {
        b = 640;
        c = 360;
        d = 40;
        e = -1;
        a = null;
        d = null;
        b = true;
        c = false;
        a = null;
        f = -9999;
        h = 25;
        i = 500;
        j = 5;
        k = 65280;
        l = 0;
        d = false;
        e = true;
        m = -1;
        n = 256;
        o = 256;
        p = j.a(90);
        q = j.a(180);
        r = j.a(270);
        s = j.a(360);
        t = 804;
        z = 0;
        A = 0;
        char[] cArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        d = "UTF-8";
        B = 200;
        k = false;
        i = true;
        l = false;
        D = 0;
        c = null;
        b = null;
        e = null;
        c = null;
        E = 0;
        F = 0;
    }
}

