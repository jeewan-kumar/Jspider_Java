//wajp to obtain the product of odd digit present in the given no.

import java.util.Scanner;
/*
public class Q3 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long l1 = scr.nextLong();

        long l2 = 1;

        while (l1 > 0) {
            long l3 = l1 % 10;
            if (l3 % 2 != 0) {
                l2 *= l3;
            }
            l1 /= 10;
        }

        System.out.println("Product of odd digits: " + l2);
    }
}

public class Q3 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long l1 = scr.nextLong();

        long l2 = 1;

        for( ; l1>0; l1/=10){
            long l3 = l1 % 10;
            if (l3 % 2 != 0) {
                l2 *= l3;
            }           
        }
        System.out.println("Product of odd digits: " + l2);
    }
}
*/
class Q3{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);

		System.out.print("Enter you number :- ");
		long l1=scr.nextInt();

		long l2=1;

		do{
			long l3 = l1 % 10;
            if (l3 % 2 != 0) {
                l2 *= l3;
            }
            l1 /= 10;

		}while(l1>0);
		System.out.println("Product of odd digits: " + l2);
	}
}