public class Palindrome {
    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 1000; // End of the range

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
