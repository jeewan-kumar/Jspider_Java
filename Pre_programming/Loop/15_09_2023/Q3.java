// wajp to print palindrome numbers from 100 to 500.

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 100 to 500:");

        for (int num = 100; num <= 500; num++) {
            int originalNum = num;
            int reversedNum = 0;
            int tempNum = num;

            while (tempNum > 0) {
                int digit = tempNum % 10;
                reversedNum = reversedNum * 10 + digit;
                tempNum /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}
