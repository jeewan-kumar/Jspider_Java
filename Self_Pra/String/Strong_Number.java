public class Strong_Number {
    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 10000; // End of the range

        System.out.println("Strong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isStrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorialOfDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorialOfDigits += factorial(digit);
            num /= 10;
        }

        return sumOfFactorialOfDigits == originalNum;
    }

    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
