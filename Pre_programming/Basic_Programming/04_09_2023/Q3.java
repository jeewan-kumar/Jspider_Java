// WAJP to print the ASCII value of the character. which user have given during executine.

import java.util.*;

class Q3{
    public static void main(String[] args) {
        
        Scanner scr=new Scanner(System.in);

        System.out.println("Enter your Character - ");
        char ch=scr.next().charAt(0);

        int i=(int)ch;

        System.out.println("The ASCII value of '" + ch + "' is: " +i);
        
    }
}