public class A6 {
    static int x = 10;
    int y = 20;
    public static void main(String[] args) {
        A6 a = new A6();
        a.x =888;
        a.y=999;
        A6 a1 = new A6();
        System.out.println(a1.x+" "+a1.y);// 888  20
    }
}
