//Wajp to check weather the given no is 0 or 1;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scr.nextInt();

        if (number == 0) {
            System.out.println("The number is 0.");
        } else if (number == 1) {
            System.out.println("The number is 1.");
        } else {
            System.out.println("The number is neither 0 nor 1.");
        }
    }
}
