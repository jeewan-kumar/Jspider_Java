// Wajp to count no of digit present in given no.

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long l = scr.nextLong();

        int i = 0;

        while (l != 0) {
            i++;
            l /= 10;
        }

        System.out.println("Number of digits: " + i);

    }
}
