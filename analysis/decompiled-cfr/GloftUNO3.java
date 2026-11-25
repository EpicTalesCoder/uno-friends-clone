/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GloftUNO3
extends MIDlet {
    private static a a;
    public static GloftUNO3 a;

    public GloftUNO3() {
        a = this;
    }

    public final void startApp() {
        if (a == null) {
            a = new a((Object)this, null);
            a.i();
            j.a = Display.getDisplay((MIDlet)this);
            j.a.setCurrent((Displayable)a);
        }
        a.b();
    }

    public final void pauseApp() {
        a.a();
    }

    public final void destroyApp(boolean bl) {
        if (a != null) {
            j.j();
        }
    }
}

