//Wajp give no is divisible by 3 or 8 or 12

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scr.nextInt();

        if (number % 3 == 0 || number % 8 == 0 || number % 12 == 0) {
            System.out.println("The number is divisible by 3, 8, or 12.");
        } else {
            System.out.println("The number is not divisible by 3, 8, or 12.");
        }

    }
}