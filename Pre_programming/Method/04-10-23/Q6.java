public class Q6 {
    public static void main(String[] args) {
        display(5);
        display(3);
    }

    static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
