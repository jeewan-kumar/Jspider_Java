
//Wajp to check weather the given number is even number or odd number.
/* 
class Check_Even_Odd {
	public static void main(String[] args) {
		int n = 25;
		if (n % 2 == 0)
			System.out.print(n + " is an even number.");
		else
			System.out.print(n + " is an odd number.");
	}
}

*/

import java.util.*;

public class Check_Even_Odd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter your any type of number ;- ");
		int i = scr.nextInt();
		if (i % 2 == 0)
			System.out.print(i + " is an even number.");
		else
			System.out.print(i + " is an odd number.");
	}
}
