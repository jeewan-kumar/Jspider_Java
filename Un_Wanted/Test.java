import java.util.*;
public class Test
{ 
	public static void main(String []args){
		Scanner scr = new Scanner(System.in);
		//int x = 5; int y = 10; 
		System.out.print("Enter your first number :- ");
		int x=scr.nextInt();

		System.out.print("Enter your Second number :- ");
		int y=scr.nextInt();

		if (x < y) 
			System.out.println("x is less than y"); 
		else if (x > y) 
			System.out.println("x is greater than y"); 
		else System.out.println("x is equal to y"); 
	} 
}