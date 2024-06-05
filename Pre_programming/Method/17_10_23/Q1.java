public class Q1 {
    static int x=5;
    public static void main(String[] args) {
        int x=7;
        System.out.println(x);
        System.out.println(Q1.x);
        Q1 a= new Q1();
        System.out.println(a.x);

        x=8;
        System.out.println(x);
        System.out.println(Q1.x);
        System.out.println(a.x);

    }
}