//Q5. WAJP TO PRINT EVEN FIBBONACCI SERIES WITH LIMIT 10.

public class Q5 {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0, b = 1;

        System.out.println("Even Fibonacci Series:");

        for (int count = 0; count < limit; ) {
            int nextFibonacci = a + b;

            if (nextFibonacci % 2 == 0) {
                System.out.print(nextFibonacci + " ");
                count++;
            }

            a = b;
            b = nextFibonacci;
        }
    }
}
