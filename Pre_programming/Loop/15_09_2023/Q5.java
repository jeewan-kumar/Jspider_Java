// wajp to print the non palindrome number form 50 to 10.

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Non-palindrome numbers from 50 to 10:");

        for (int num = 50; num >= 10; num--) {
            int originalNum = num;
            int reversedNum = 0;

            while (num > 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum != reversedNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}
