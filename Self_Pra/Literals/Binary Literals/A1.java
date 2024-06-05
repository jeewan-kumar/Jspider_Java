public class A1 {
    public static void main(String[] args) {
        double d = 1_23_456.7_8_9;
        System.out.println(d); //123456.789

        d = 123_456.7_8_9;
        System.out.println(d);//123456.789

        d = 123456.789;
        System.out.println(d);//123456.789

        d = 1__23__4_5__6.7__8_9;
        System.out.println(d);//123456.789

        d = 1___234___56.789;
        System.out.println(d);//123456.789
    }
}
