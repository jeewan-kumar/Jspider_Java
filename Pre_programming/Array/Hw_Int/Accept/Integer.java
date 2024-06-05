package Hw_Int.Accept;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        System.out.println("***Start***");

        Scanner scr = new Scanner(System.in);
        

        System.out.print("Enter your index size: ");
        int n = scr.nextInt();
        int i[] = new int[n];

        //creat index value 
        for(int j=0; j<=i.length-1;j++){
            System.out.print("Enter the value forindex ["+j+"]: ");
            i[j]= scr.nextInt();
        }
        length(i);
    }

    public static int length(int i[]){
       
            return i.length;
       
    }
}
