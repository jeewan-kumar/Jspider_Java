//Wajp Read a sting from the user print how many characters are there
import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in);
       
       System.out.print("Enter a string : ");
        String s = scr.nextLine();

        int i = s.length();

        System.out.println("Number of character: "+i);

    }
}