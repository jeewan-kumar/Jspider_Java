// wajp for below requirement first requirement check the given no is divisible by 3 and 5 if it is true print "Hy". Requerirment second check the given no is divisible by 4 and 8. if it is true "Hello". reguirement third check the no is even or odd if it is even print chek the no is divisible by 8 or not if true print "good by".
/*
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Hy");
        }

        if (number % 4 == 0 && number % 8 == 0) {
            System.out.println("Hello");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even."); 
                if (number % 8 == 0) {
                    System.out.println(number + " is divisible by 4.");
                } else {
                    System.out.println(number + " is not divisible by 4. \n good bye");
                    }
        } else {
            System.out.println(number + " is odd.");
                if (number % 8 == 0) {
                    System.out.println(number + " is divisible by 4.");
                } else {
                    System.out.println(number + " is not divisible by 4. \n good bye");
                }
            }
    }
}
*/

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5, so it's 'Hy'.");
        } else if (number % 4 == 0 && number % 8 == 0) {
            System.out.println("The number is divisible by 4 and 8, so it's 'Hello'.");
        } else if (number % 2 == 0) {
            if (number % 8 == 0) {
                System.out.println("The number is even and divisible by 8, so it's 'Good Morning'.");
            } else {
                System.out.println("The number is even but not divisible by 8, so it's 'Good bye'.");
            }
        } else {
            if (number % 8 == 0) {
                System.out.println("The number is odd but divisible by 8, so it's 'Good bye'.");
            } else {
                System.out.println("The number is odd and not divisible by 8, so it's 'Good bye'.");
            }
        }
    }
}
