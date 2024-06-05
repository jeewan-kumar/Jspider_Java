// WAJP to perform add of three number, perfor the operation store the result in sum variable and print it.

import java.util.*;

class Q4{
    public static void main(String[] args) {
        
        Scanner scr=new Scanner(System.in);

        System.out.println("Enter your first number - ");
        int a=scr.nextInt();

        System.out.println("Enter your second number - ");
        int b=scr.nextInt();

        System.out.println("Enter your third number - ");
        int c=scr.nextInt();

        int sum=a+b+c;

        System.out.println("The sum of " + a + ", " + b + ", and " + c + " is: " + sum);
        
    }
}