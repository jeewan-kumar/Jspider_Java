public class Perfect_Number {
    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 10000; // End of the range

        System.out.println("Perfect numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
