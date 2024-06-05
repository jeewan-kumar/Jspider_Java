/* 
Wajp to simple calculater -
ask user which arthimatic opertion he wants to perform 
opertion +, -, *, /,%, 
*/

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.print("Enter the first number: ");
        double num1 = scr.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scr.nextDouble();

        System.out.print("Enter the arithmetic operation (+, -, *, /, %): ");
        char option = scr.next().charAt(0);

        double result;

        switch (option) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
