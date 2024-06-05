/*Wajp findout which roll belog which student where we have five studen as follows;
sandeep, gorave,vishal deepak rahul*/

import java.util.*;
public class Findout{
	public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your studen roll number :- ");
		int i=scr.nextInt();
		
		//int i=4;
		if(i==1) {
			System.out.println("Roll Number - 1, S_Name - Sandeep");
		}
		else if (i==2) {
			System.out.println("Roll Number - 2, S_Name - Gorave");
		}
		else if(i==3) {
			System.out.println("Roll Number - 3, S_Name - Vishal");
		}
		else if(i==4){
			System.out.println("Roll Number - 4, S_Name - Deepak");
		}
		else if(i==5){
			System.out.println("Roll Number - 5, S_Name - Rahul");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
}