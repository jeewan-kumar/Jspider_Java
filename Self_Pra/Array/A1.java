public class A1 {
    public static void main(String[] args) {
         int i[] = new int[5];
         System.out.println(i);//[I@5acf9800
         System.out.println(i.getClass().getName());//[I

         double d[] = new double[5];
         System.out.println(d);//[D@4617c264
         System.out.println(d.getClass().getName());//[D

         short s[] = new short[5];
         System.out.println(s);//[S@36baf30c
         System.out.println(s.getClass().getName());//[S

         byte b[] = new byte[5];
         System.out.println(b);//[B@7a81197d
         System.out.println(b.getClass().getName());//[B

         boolean b1[] = new boolean[5];
         System.out.println(b1);//[Z@5ca881b5
         System.out.println(b1.getClass().getName());//[Z
    }
}
