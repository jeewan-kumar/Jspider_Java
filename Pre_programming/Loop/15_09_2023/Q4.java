// wajp to obtain even digits present in the given number or check wheather the numbe is divisible by 2 and 4.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is divisible by 2 and 4
        if (num % 2 == 0 && num % 4 == 0) {
            System.out.println(num + " is divisible by both 2 and 4.");
        } else {
            System.out.println(num + " is not divisible by both 2 and 4.");
        }

        // Obtain and print even digits
        System.out.print("Even digits in " + num + ": ");
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            num /= 10;
        }
        System.out.println(); // Move to the next line for clarity
    }
}
