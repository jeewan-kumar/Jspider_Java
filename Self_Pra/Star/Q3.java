public class Q3 {

    public static void main(String[] args) {

        printPattern(1);
    }

    private static void printPattern(int n) {

        if (n > 5) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

        printPattern(n + 1);
    }
}
