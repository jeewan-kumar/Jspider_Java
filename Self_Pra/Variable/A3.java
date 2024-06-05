public class A3 {
    static int x = 10;
    public static void main(String[] args) {
        A3 a = new A3();
        System.out.println(a.x);//10
        System.out.println(A3.x);//10
        System.out.println(x);//10    
    }
}
