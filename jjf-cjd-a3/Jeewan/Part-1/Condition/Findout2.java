/*Wajp findout which roll belog which student. 
where we have five studen as follows;
sandeep, gorave,vishal, deepak, rahul*/

import java.util.*;
public class Findout2{
	public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your studen roll number :- ");
		int i=scr.nextInt();
		
		//int i=4;
		switch(i)
		{
		case 1: {
			System.out.println("Roll Number - 1, S_Name - Sandeep");
			}break;
		case 2: {
				System.out.println("Roll Number - 2, S_Name - Gorave");
			}break;
		case 3: {
				System.out.println("Roll Number - 3, S_Name - Vishal");
			}break;
		case 4: {
				System.out.println("Roll Number - 4, S_Name - Deepak");
			}break;
		case 5: {
				System.out.println("Roll Number - 5, S_Name - Rahul");
			}break;
		default :
			{
				System.out.println("Not eligible");
			}break;
		}
		
	}
}