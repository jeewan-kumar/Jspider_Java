//Wajp count how many spaces is ther inside string.

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scr.nextLine();

        int i = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                i++;
            }
        }

        System.out.println("Number of spaces: " + i);
    }    
}
