//wajp Read a string from the user print the number of character of the string without using lenth().

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scr.nextLine();

        int i=0;

        for(char c:s.toCharArray()) {
            i++;
        }
        System.out.println("Number of charactes: "+i);
    }
}
