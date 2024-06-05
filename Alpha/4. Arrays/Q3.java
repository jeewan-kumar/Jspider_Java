// add,sub,mul,divide, percentage 

import java.util.*;
public class Q3 { 
    public static void main(String[] args) {
        int num[] = new int[2];
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your first number : ");
        num[0] = sc.nextInt();

        System.out.print("Enter your second number : ");
        num[1] = sc.nextInt();

        int add = num[0]+num[1];
        int sub = num[0]-num[1];
        int mul = num[0]*num[1];
        int div = num[0]/num[1];

        System.out.println("Addition : "+add);
        System.out.println("Multiplication : "+mul);
        System.out.println("Subtraction : "+sub);
        System.out.println("Division : "+div);
    }    
}
