// Wajp to print even digits present in the given no.

import java.util.Scanner;
/*
public class Q2 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long l = scr.nextLong();

        System.out.print("Even digits in the number: ");
        
        while ( l != 0) {
            long l1 = l % 10;
            if (l1 % 2 == 0) {
                System.out.print(l1 + ",");
            }
            l /= 10;
        }
    }
}
*/
public class Q2 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long l = scr.nextLong();

        System.out.print("Even digits in the number: ");
        
        do {
            long l1 = l % 10;
            if (l1 % 2 == 0) {
                System.out.print(l1 + ",");
            }
            l /= 10;
        }while ( l != 0);
    }
}