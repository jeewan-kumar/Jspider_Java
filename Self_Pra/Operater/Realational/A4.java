public class A4 {
    public static void main(String[] args) {
        Thread a = new Thread();
        Thread a1 = new Thread();
        Thread a2 = a;
        System.out.println(a == a1); //false
        System.out.println(a == a2); //true
    }
}
