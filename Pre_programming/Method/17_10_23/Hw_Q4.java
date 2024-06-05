//Wajp to design a add method which is accepting two int value and  returning sum or both the value access this method from the different class and print the summation of two number.

import java.util.Scanner;

public class Hw_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you first number : ");
        int i = sc.nextInt();
        System.out.print("Enter you second number : ");
        int i1 = sc.nextInt();
        System.out.println("Sum of two number : "+add(i,i1));
    }
    public static int add(int a, int b) {
        return a+b;
    }
}
