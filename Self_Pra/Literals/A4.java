public class A4 {
    public static void main(String[] args) {
        double d = 123.456;
        System.out.println(d);

        double da = 0123.456;
        System.out.println(da);

        d = 0x123.567;
        System.out.println(d);// Invalid hex literal number, malformed floating-point literal  
    }
}
