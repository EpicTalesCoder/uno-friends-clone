import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftUNO3 extends MIDlet {
   private static a a;
   public static GloftUNO3 a;

   public GloftUNO3() {
      a = this;
   }

   public final void startApp() {
      if (a == null) {
         (a = new a(this, null)).i();
         (j.a = Display.getDisplay(this)).setCurrent(a);
      }

      a.b();
   }

   public final void pauseApp() {
      a.a();
   }

   public final void destroyApp(boolean var1) {
      if (a != null) {
         j.j();
      }
   }
}
