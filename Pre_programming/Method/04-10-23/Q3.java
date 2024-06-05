public class Q3 {
    public static void main(String[] args) {
        m1(7);
    }

    static void m1(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
