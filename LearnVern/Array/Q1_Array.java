import java.util.*;

public class Q1_Array{
	public static void main(String [] a){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter the number of integer :- ");
		int n=scr.nextInt();
		int age[]=new int[n];

		System.out.println("Enter " +n+ "integer number :- ");
		for(int i=0;i<age.length;i++){
			age[i]=scr.nextInt();
		}
		System.out.println("Array of integer number :- ");
		for(int i=0; i<age.length;i++){
			System.out.println(age[i]);
		}
	}
}