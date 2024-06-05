// Wajp to check IAS eligibility take a user input.

import java.util.*;

class Q1{
    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);
        
        System.out.println("Enter you Age and check eligibil or not - ");
        int i=scr.nextInt();

        if(i>=21 && i<=32)
            System.out.println("you are Eligibile for IAS exam");
        else
            System.out.println("You are Not Eligibile for IAS exam");
        
    }
}