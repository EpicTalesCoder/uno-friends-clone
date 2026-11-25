/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class n
implements c,
d {
    public q a;
    public q b;
    public int a;
    public int b;
    public r a;
    public int c;
    public int d;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    private void a(q q2) {
        if (q2 == null) {
            return;
        }
        if (this.a != null) {
            q2.a = this.b;
            this.b.b = q2;
            this.b = q2;
        } else {
            this.a = this.b = q2;
            q2.b = null;
            q2.a = null;
        }
        ++this.a;
    }

    public final void a(int n2, int n3) {
        q q2 = new q();
        new q().a = n2;
        q2.b = n3;
        q2.a = false;
        q2.d = 0;
        q2.a(this.d);
        this.a(q2);
    }

    public final void a(q q2, int n2) {
        q2.a(this.d);
        if (this.a == 0) {
            this.a(q2);
            return;
        }
        if (n2 <= 0) {
            q2.b = this.a;
            this.a.a = q2;
            this.a = q2;
            ++this.a;
            return;
        }
        if (n2 >= this.a) {
            this.a(q2);
            return;
        }
        q q3 = this.a;
        while (n2 > 1) {
            --n2;
            q3 = q3.b;
        }
        q q4 = q3.b;
        q2.a = q3;
        q3.b = q2;
        q2.b = q4;
        q4.a = q2;
        ++this.a;
    }

    public final q a(int n2) {
        if (c2.a == 0) {
            return null;
        }
        if (n2 <= 0) {
            return c2.a;
        }
        if (n2 >= c2.a) {
            return c2.b;
        }
        c c2 = c2.a;
        while (n2 > 0) {
            c2 = ((q)c2).b;
            --n2;
        }
        return c2;
    }

    public static void a(n n2, int n3, n n4, int n5) {
        q q2 = n2.a(n3);
        if (q2 == null) {
            return;
        }
        if (q2.a == null) {
            if (q2.b == null) {
                n2.a = null;
                n2.b = null;
            } else {
                n2.a = q2.b;
                q2.b.a = null;
                q2.b = null;
            }
        } else if (q2.b == null) {
            q2.a.b = null;
            n2.b = q2.a;
            q2.a = null;
        } else {
            q2.a.b = q2.b;
            q2.b.a = q2.a;
            q2.a = null;
            q2.b = null;
        }
        --n2.a;
        if (n4 == a.b) {
            q2.d = j.b(0, 4);
        }
        q2.a(n4.d);
        if (n4.a == 0) {
            n4.a = q2;
            n4.b = q2;
        } else if (n5 <= 0) {
            q2.b = n4.a;
            n4.a.a = q2;
            n4.a = q2;
        } else if (n5 >= n4.a) {
            q2.a = n4.b;
            n4.b.b = q2;
            n4.b = q2;
        } else {
            q q3 = n4.a;
            while (n5 > 1) {
                --n5;
                q3 = q3.b;
            }
            q q4 = q3.b;
            q2.a = q3;
            q3.b = q2;
            q2.b = q4;
            q4.a = q2;
        }
        ++n4.a;
        n2.a();
        n4.a();
    }

    public final boolean a(int n2, int n3, boolean bl) {
        if (this.a < 0) {
            return false;
        }
        q q2 = this.a(0);
        this.c = 0;
        while (q2 != null) {
            if (bl ? n.a(q2.a, n2) && q2.e > 0 && !q2.a : n.a(q2.a, n2) && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        q2 = this.a;
        this.c = 0;
        while (q2 != null && this.c < 0) {
            if (bl ? n.a(q2.a, n2) && q2.e > 0 && !q2.a : n.a(q2.a, n2) && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        return false;
    }

    public final boolean b(int n2, int n3, boolean bl) {
        if (this.a < 0) {
            return false;
        }
        q q2 = this.a(0);
        this.c = 0;
        while (q2 != null) {
            if (bl ? q2.b == n2 && q2.e > 0 && !q2.a : q2.b == n2 && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        q2 = this.a;
        this.c = 0;
        while (q2 != null && this.c < 0) {
            if (bl ? q2.b == n2 && q2.e > 0 && !q2.a : q2.b == n2 && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        return false;
    }

    public final boolean c(int n2, int n3, boolean bl) {
        if (this.a < 0) {
            return false;
        }
        q q2 = this.a(0);
        this.c = 0;
        while (q2 != null) {
            if (q2.b == n2 && q2.a() && q2.e > 0 && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        q2 = this.a;
        this.c = 0;
        while (q2 != null && this.c < 0) {
            if (q2.b == n2 && q2.a() && q2.e > 0 && !q2.a) {
                return true;
            }
            ++this.c;
            q2 = q2.b;
        }
        return false;
    }

    public final int a(q q2) {
        int n2 = -1;
        c c2 = ((n)c2).a;
        while (c2 != null) {
            ++n2;
            if (c2.equals(q2)) break;
            c2 = ((q)c2).b;
        }
        return n2;
    }

    public static boolean a(int n2, int n3) {
        return n2 == n3;
    }

    public final boolean d(int n2, int n3, boolean bl) {
        this.c = -1;
        q q2 = this.a;
        while (q2 != null) {
            ++this.c;
            if (n.a(q2.a, n2) && (q2.b == n3 || n2 == 13 || n2 == 14)) {
                if (!bl || !q2.a) {
                    return true;
                }
            } else if (q2.b > n3) {
                return false;
            }
            q2 = q2.b;
        }
        ++this.c;
        return false;
    }

    public final void a() {
        c c2 = c2.a;
        int n2 = 0;
        while (c2 != null) {
            ((q)c2).c = n2++;
            c2 = ((q)c2).b;
        }
    }

    public final void b() {
        int n2;
        int n3 = n2 = c2.a >> 1;
        if (n2 < 5) {
            n3 = 5;
        }
        c c2 = c2.a;
        while (c2 != null) {
            ((q)c2).d = (((q)c2).c - n2) * n2 / n3;
            if ((((q)c2).c - n2) * n2 % n3 != 0) {
                ((q)c2).d = ((q)c2).c < n2 ? --((q)c2).d : ++((q)c2).d;
            }
            c2 = ((q)c2).b;
        }
    }

    public final void a(boolean bl) {
        q q2 = this.a;
        while (q2 != null) {
            if (this.d == 0 && this.a.d == q2.c) {
                if (bl) {
                    q2.b(this.d, true);
                }
            } else if (bl) {
                if (this.d == 0 || q2.e) {
                    q2.a(this.d, true);
                }
            } else if (this.d != 0 && !q2.e) {
                q2.a(this.d, false);
            }
            q2 = q2.b;
        }
    }

    public final void c() {
        q q2 = this.a;
        if (q2 == null) {
            return;
        }
        if (this.d == 4) {
            q2.a(this.d, -1, -1);
            q2.a(this.d, false);
            q2.a.b(j.a_);
            return;
        }
        a.e();
        if (this.b != null && this.b.d) {
            this.b.a(this.d, -1, -1);
            if (this.b.equals(this.b) && !this.b.e) {
                this.b.b(this.d, true);
            } else {
                this.b.a(this.d, true);
            }
        }
        a.c = !this.b.e;
    }

    public final void d() {
        q q2 = this.a;
        while (q2 != null) {
            q2.a(this.d);
            q2 = q2.b;
        }
    }

    public final void e() {
        this.b = this.a;
    }
}

