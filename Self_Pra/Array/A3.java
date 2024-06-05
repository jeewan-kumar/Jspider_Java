public class A3 {
    public static void main(String[] args) {
        // int[] x = new int[2147483647];
        // System.out.println(x); //java.lang.OutOfMemoryError: Requested array size exceeds VM limit

        int[] x1 = new int[2147483648];
        System.out.println(x1);// integer number too large
    }
}
