/*class Divisable{
	public static void main(String[] args) {
			int a=17;
			if(a%4==0 && a%8==0)
				System.out.print(a+" is the divisiable by 4 and 8.");
			else
				System.out.print(a+" is the not dividable by 4 and 8.");
		}	
}*/


import java.util.*;

public class Divisable{
	public static void main(String[] args){
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your any type of number :- ");
		int i=scr.nextInt();

		if(i%4==0 && i%8==0)
			System.out.print(i+" is the divisiable by 4 and 8.");
		else
			System.out.print(i+" is the not divisiable by 4 and 8.");
	}
}
