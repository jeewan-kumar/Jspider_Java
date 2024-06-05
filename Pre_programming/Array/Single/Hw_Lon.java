import java.util.Scanner;

public class Hw_Lon {
    public static void main(String[] args) {
        System.out.println("***Start***");

        Scanner scr = new Scanner(System.in);
        

        System.out.print("Enter your index size: ");
        int n = scr.nextInt();
        long i[] = new long[n];

        //creat index value 
        for(int j=0; j<=i.length-1;j++){
            System.out.print("Enter the value forindex ["+j+"]: ");
            i[j]= scr.nextLong();
        }

        // reference variables
        System.out.println("Reference variables for Int: "+i);

        //Access each element by the references
        System.out.println("***Access each element by the references***");
        System.out.println("Index 1: "+i[1]);
        System.out.println("Index 0: "+i[0]);
        
        //for loop forward
        System.out.println("***for loop forward***");
        for(int j=0; j<=i.length-1;j++){
            System.out.println("Index ["+j+"] value: "+i[j]);
        }

        //for loop backward
        System.out.println("***for loop backward***");
        for(int j=i.length-1; j>=0;j--){
            System.out.println("Index ["+j+"] value: "+i[j]);
        }
        
        //while loop forward
        System.out.println("***while loop forward***");
        int w=0;
        while (w<=i.length-1) {
            System.out.println("Index ["+w+"] value: "+i[w]);
            w++;
        }

        //while loop backward
        System.out.println("***while loop backward***");
        int w1=i.length-1;
        while (w1>=0) {
            System.out.println("Index ["+w1+"] value: "+i[w1]);
            w1--;
        }

        //do while loop forward
        System.out.println("***do while loop forward***");
        int d=0;
        do {
            System.out.println("Index ["+d+"] value: "+i[d]);
            d++;
        }while (d<=i.length-1);

        //do while loop backward
        System.out.println("***do while loop backward***");
        int d1=i.length-1;
        do {
            System.out.println("Index ["+d1+"] value: "+i[d1]);
            d1--;
        }while (d1>=0);

        //for each loop
        System.out.println("***For each loop***");
        for(long f:i){
            System.out.println(f);
        }

        System.out.println("****End the prgram****");        
    }
    
}
