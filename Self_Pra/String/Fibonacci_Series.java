public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0, second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }        
}
