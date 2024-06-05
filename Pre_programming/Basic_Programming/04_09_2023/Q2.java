// WAJP to check wheather the given charter is digit or not.

import java.util.*;

class Q2{
    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);

        System.out.println("Enter your Character - ");
        char i=scr.next().charAt(0);

        if((i>='A' && i<='Z') || (i>='a' && i<='z'))
            System.out.println(i+" is a Character");
        else if(i>='0' && i<='9')
            System.out.println(i+" is a Digit");
        else
        	System.out.println(i+" is a spacel Character");
        
    }
}