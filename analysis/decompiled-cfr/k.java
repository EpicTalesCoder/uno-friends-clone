/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class k {
    k a;
    k[] a;
    int a;
    int[] a;

    k() {
    }

    static k a(int n2) {
        k k2 = new k();
        j.f(1);
        k2.a = new int[1];
        k2.a[0] = k2.a = j.d();
        k2.a = new k[k2.a];
        for (int i2 = 0; i2 < k2.a; ++i2) {
            k k3 = new k();
            new k().a = k2;
            k2.a[i2] = k3;
            k3.a = new int[4];
            k3.a[0] = j.e();
            k3.a = j.d();
            k3.a[2] = j.e();
            k3.a[1] = k3.a;
            k3.a = new k[k3.a];
            int n3 = 0;
            for (int i3 = 0; i3 < k3.a; ++i3) {
                k k4;
                k k5 = k2;
                k3.a[i3] = k4 = new k();
                k4.a = k3;
                int n4 = j.d();
                switch (n4) {
                    case 3: {
                        k4.a = new int[4];
                        k4.a[0] = n4;
                        k4.a[1] = j.d();
                        k4.a[2] = j.e();
                        k4.a[3] = j.e();
                        n4 = k4.a[3];
                        break;
                    }
                    default: {
                        n4 = 0;
                    }
                }
                k4.a = n4;
                k4.a = new k[k4.a];
                for (int i4 = 0; i4 < n4; ++i4) {
                    k k6 = new k();
                    new k().a = k4;
                    k6.a = new int[2];
                    k6.a[0] = j.e();
                    k6.a[1] = k6.a = j.d();
                    k6.a = new k[k6.a];
                    k4.a[i4] = k6;
                    if (k6.a[0] > n3) {
                        n3 = k6.a[0];
                    }
                    for (int i5 = 0; i5 < k6.a; ++i5) {
                        k k7 = new k();
                        new k().a = k6;
                        k7.a = new int[2];
                        int n5 = j.d();
                        k7.a = 0;
                        k6.a[i5] = k7;
                        k7.a[1] = 0;
                        switch (n5) {
                            case 41: {
                                k7.a = new int[5];
                                k7.a[0] = n5;
                                k7.a[1] = (short)j.e();
                                k7.a[2] = (short)j.e();
                                k7.a[3] = 0;
                                k7.a[4] = 0;
                                if (k5 != k2) {
                                    int n6 = j.c(k7.a.a[0] - k5.a.a[0]);
                                    k5.a[3] = j.d(j.c(k7.a[1] - k5.a[1]), n6);
                                    k5.a[4] = j.d(j.c(k7.a[2] - k5.a[2]), n6);
                                }
                                k5 = k7;
                                break;
                            }
                            case 42: {
                                k7.a = new int[2];
                                k7.a[1] = j.d();
                                break;
                            }
                            case 43: {
                                k7.a = new int[2];
                                k7.a[1] = j.f();
                                break;
                            }
                            case 44: {
                                k7.a = new int[2];
                                k7.a[1] = j.f();
                                break;
                            }
                            case 105: {
                                k7.a = new int[2];
                                k7.a[1] = (byte)j.d();
                                break;
                            }
                            case 106: {
                                k7.a = new int[3];
                                k7.a[1] = (short)j.e();
                                k7.a[2] = (short)j.e();
                            }
                        }
                        k7.a[0] = n5;
                    }
                }
            }
            k3.a[3] = n3;
        }
        return k2;
    }

    public final void a(int[][] nArray, int n2) {
        k k2 = this.a[n2];
        nArray[0][0] = 0;
        nArray[0][1] = n2;
        for (int i2 = 1; i2 < k2.a + 1; ++i2) {
            nArray[i2][0] = 0;
            nArray[i2][1] = 0;
            nArray[i2][2] = k2.a[i2 - 1].a[2];
            nArray[i2][3] = k2.a[i2 - 1].a == 0 ? -1 : 0;
            nArray[i2][6] = 0;
        }
    }
}

