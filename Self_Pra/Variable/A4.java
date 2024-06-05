public class A4 {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x); //10
        A4 a = new A4();
        a.m1();
    }
    public void m1() {
        System.out.println(x);//10
    }
}
