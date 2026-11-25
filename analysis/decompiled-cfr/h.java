/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h {
    private static String a;
    private static int a;
    private static int b;
    private static int[] a;
    private static Object[][] a;
    private static final char[] a;
    private static int[] b;

    public static void a(String objectArray, String string, String string2, boolean bl, String string3) {
        string3 = "leaderboard";
        if (!"leaderboard".equals(a)) {
            Object[] objectArray2 = new String[]{string3};
            h.a(1, objectArray2);
            a = string3;
        } else {
            h.a(1, null);
        }
        objectArray = new String[]{objectArray, string, string2, "" + bl, null};
        h.a(28, objectArray);
    }

    private static void a(int n2, Object[] objectArray) {
        h.a[h.b] = n2;
        h.a[h.b++] = objectArray;
        if (a == -1) {
            a = a[0];
        }
    }

    static {
        int n2;
        a = -1;
        b = 0;
        a = new int[20];
        a = new Object[20][];
        (new char[1])[0] = 32;
        a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        b = new int[128];
        for (n2 = 0; n2 < b.length; ++n2) {
            h.b[n2] = -1;
        }
        for (n2 = 0; n2 < a.length; ++n2) {
            h.b[h.a[n2]] = n2;
        }
    }
}

