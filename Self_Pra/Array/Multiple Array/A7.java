public class A7 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        
        // a[0]= new int[4][3];
        // System.out.println(a); // incompatible types: int[][] cannot be converted to int[] 

        // a[0] = 10;
        // System.out.println(a); //incompatible types: int cannot be converted to int[]

        a[0] = new int[5];
        System.out.println(a);//[[I@4617c264
    }
}
