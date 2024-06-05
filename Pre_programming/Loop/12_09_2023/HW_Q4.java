/* 
wajp form below requirment.
req 1: take the minimum limit from the user.
req 2: take the mixlimit from the user.
req 3: as user which multiplication table he wants to print take that number from the user .
req 4: print the output in formt [ 5x5=25].
*/

import java.util.*;

class HW_Q1{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);

		System.out.print("Enter you minimum limit :- ");
		int i=scr.nextInt();

		System.out.print("Enter you Miximum limit :- ");
		int i1=scr.nextInt();

		System.out.print("Which multiplication table do you want to print :- ");
        int table = scr.nextInt();

        for (int j = i; j <= i1; j++) {

        System.out.println("["+table+"X"+j+"="+(table*j)+"]");

        }		
	}
}