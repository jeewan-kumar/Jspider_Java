//Q3. WAJP TO PRINT THE FIBBONACCI SERIES WITH LIMIT 10.

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
