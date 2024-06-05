public class A17 {
    static int[] x;
    public static void main(String[] args) {
        // A17 a = new A17();
        System.out.println(x);//null
        System.out.println(x[0]);//java.lang.NullPointerException: Cannot load from int array because "A17.x" is null
    }
}
