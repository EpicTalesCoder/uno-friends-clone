final class k {
   k a;
   k[] a;
   int a;
   int[] a;

   static k a(int var0) {
      k var14 = new k();
      j.f(1);
      var14.a = new int[1];
      var14.a = j.d();
      var14.a[0] = var14.a;
      var14.a = new k[var14.a];

      for (int var2 = 0; var2 < var14.a; var2++) {
         k var1;
         (var1 = new k()).a = var14;
         var14.a[var2] = var1;
         var1.a = new int[4];
         var1.a[0] = j.e();
         var1.a = j.d();
         var1.a[2] = j.e();
         var1.a[1] = var1.a;
         var1.a = new k[var1.a];
         int var6 = 0;

         for (int var3 = 0; var3 < var1.a; var3++) {
            k var9 = var14;
            k var7 = new k();
            var1.a[var3] = var7;
            var7.a = var1;
            int var8;
            switch (var8 = j.d()) {
               case 3:
                  var7.a = new int[4];
                  var7.a[0] = var8;
                  var7.a[1] = j.d();
                  var7.a[2] = j.e();
                  var7.a[3] = j.e();
                  var8 = var7.a[3];
                  break;
               default:
                  var8 = 0;
            }

            var7.a = var8;
            var7.a = new k[var7.a];

            for (int var4 = 0; var4 < var8; var4++) {
               k var10;
               (var10 = new k()).a = var7;
               var10.a = new int[2];
               var10.a[0] = j.e();
               var10.a = j.d();
               var10.a[1] = var10.a;
               var10.a = new k[var10.a];
               var7.a[var4] = var10;
               if (var10.a[0] > var6) {
                  var6 = var10.a[0];
               }

               for (int var5 = 0; var5 < var10.a; var5++) {
                  k var11;
                  (var11 = new k()).a = var10;
                  var11.a = new int[2];
                  int var12 = j.d();
                  var11.a = 0;
                  var10.a[var5] = var11;
                  var11.a[1] = 0;
                  switch (var12) {
                     case 41:
                        var11.a = new int[5];
                        var11.a[0] = var12;
                        var11.a[1] = (short)j.e();
                        var11.a[2] = (short)j.e();
                        var11.a[3] = 0;
                        var11.a[4] = 0;
                        if (var9 != var14) {
                           int var13 = j.c(var11.a.a[0] - var9.a.a[0]);
                           var9.a[3] = j.d(j.c(var11.a[1] - var9.a[1]), var13);
                           var9.a[4] = j.d(j.c(var11.a[2] - var9.a[2]), var13);
                        }

                        var9 = var11;
                        break;
                     case 42:
                        var11.a = new int[2];
                        var11.a[1] = j.d();
                        break;
                     case 43:
                        var11.a = new int[2];
                        var11.a[1] = j.f();
                        break;
                     case 44:
                        var11.a = new int[2];
                        var11.a[1] = j.f();
                        break;
                     case 105:
                        var11.a = new int[2];
                        var11.a[1] = (byte)j.d();
                        break;
                     case 106:
                        var11.a = new int[3];
                        var11.a[1] = (short)j.e();
                        var11.a[2] = (short)j.e();
                  }

                  var11.a[0] = var12;
               }
            }
         }

         var1.a[3] = var6;
      }

      return var14;
   }

   public final void a(int[][] var1, int var2) {
      k var3 = this.a[var2];
      var1[0][0] = 0;
      var1[0][1] = var2;

      for (int var4 = 1; var4 < var3.a + 1; var4++) {
         var1[var4][0] = 0;
         var1[var4][1] = 0;
         var1[var4][2] = var3.a[var4 - 1].a[2];
         if (var3.a[var4 - 1].a == 0) {
            var1[var4][3] = -1;
         } else {
            var1[var4][3] = 0;
         }

         var1[var4][6] = 0;
      }
   }
}
