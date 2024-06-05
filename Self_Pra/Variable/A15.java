public class A15 {
    int[] x;
    public static void main(String[] args) {
        A15 a = new A15();
        System.out.println(a.x);//null
        System.out.println(a.x[0]); //java.lang.NullPointerException: Cannot load from int array because "<local1>.x" is null
    }
}
