package Hw_Int;
import java.util.Scanner;

public class Prime {
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
        int primeCount = countPrimes(i[j]);
       //for loop forward
       System.out.println("***for loop forward***");
       for(int j=0; j<=i.length-1;j++){
           prim(i[j]);
       }
       

      
    }   
     public static void prim(int i){
        int fact=0;
        for(int n=1;n<=i;n++){
            if(i%n==0){
                fact++;
            }
        }
        System.out.println(fact);
        if(fact ==2){
            System.out.println(i);
        }
    }
    private static int countPrimes(int[] arr) {
        int count = 0;
        for (int element : i) {
            if (prim(element)) {
                count++;
            }
        }
        return count;
    }
}

