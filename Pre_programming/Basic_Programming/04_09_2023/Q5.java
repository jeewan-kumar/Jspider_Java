// WAJP to check wheater is the given number is even or odd and divisible by 4 or not.

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even."); 
            if (number % 4 == 0) {
                System.out.println(number + " is divisible by 4.");
            } else {
                System.out.println(number + " is not divisible by 4.");
            }
        } else {
            System.out.println(number + " is odd.");
			if (number % 4 == 0) {
                System.out.println(number + " is divisible by 4.");
            } else {
                System.out.println(number + " is not divisible by 4.");
            }
        }
        

    }
}