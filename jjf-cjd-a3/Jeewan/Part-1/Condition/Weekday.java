/*
Wajp to read day number from the user and print the equivalent day name .
*/

import java.util.*;
public class Weekday{
	public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your Weekday number :- ");
		int i=scr.nextInt();
		
		if(i==1) {
			System.out.println("Monday");
		}
		else if (i==2) {
			System.out.println("Tuesday");
		}
		else if(i==3) {
			System.out.println("Wednesday");
		}
		else if(i==4){
			System.out.println("Thrusday");
		}
		else if(i==5){
			System.out.println("Friday");
		}
		else if(i==6){
			System.out.println("Saturday");
		}
		else if(i==7){
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Not eligible weekday number");
		}
	}
}