public class ArmStrong {
    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 10000; // End of the range

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isArmstrongNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sumOfCubesOfDigits = 0;
        int numDigits = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sumOfCubesOfDigits += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sumOfCubesOfDigits == originalNum;
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
