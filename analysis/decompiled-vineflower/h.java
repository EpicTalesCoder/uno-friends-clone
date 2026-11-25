public final class h {
   private static String a;
   private static int a = -1;
   private static int b = 0;
   private static int[] a = new int[20];
   private static Object[][] a = new Object[20][];
   private static final char[] a = new char[]{
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      '+',
      '/'
   };
   private static int[] b = new int[128];

   public static void a(String var0, String var1, String var2, boolean var3, String var4) {
      var4 = "leaderboard";
      if (!"leaderboard".equals(a)) {
         String[] var5 = new String[]{var4};
         a(1, var5);
         a = var4;
      } else {
         a(1, null);
      }

      String[] var6 = new String[]{var0, var1, var2, "" + var3, null};
      a(28, var6);
   }

   private static void a(int var0, Object[] var1) {
      a[b] = var0;
      a[b++] = var1;
      if (a == -1) {
         a = a[0];
      }
   }

   static {
      char[] var10000 = new char[]{' '};

      for (int var0 = 0; var0 < b.length; var0++) {
         b[var0] = -1;
      }

      int var1 = 0;

      while (var1 < a.length) {
         b[a[var1]] = var1++;
      }
   }
}
