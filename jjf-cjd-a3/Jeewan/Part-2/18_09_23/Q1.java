


import java.util.*;

class Q1{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);

		System.out.print("Enter your Collage name :- ");
		String s=scr.nextLine();

		System.out.print("Enter your name :- ");
		String s1=scr.nextLine();

		System.out.print("Enter your Roll no. :- ");
		int i=scr.nextInt();

		System.out.print("Enter your Phone name :- ");
		long l=scr.nextLong();

		System.out.print("Enter your percentage name :- ");
		double d=scr.nextDouble();

		System.out.print("Enter your Section :- ");
		char ch=scr.next().charAt(0);
/*
		System.out.print("Enter your Degree name :- ");
		String s3=scr.next();

		System.out.print("Enter your Stream name :- ");
		String s4=scr.next(); */

		System.out.print("Enter your Degree name :- ");
		String s3=scr.nextLine();
		s3=scr.nextLine();

		System.out.print("Enter your Stream name :- ");
		String s4=scr.nextLine();

		System.out.println("your Collage name :- "+s);
		System.out.println("your name :- "+s1);
		System.out.println("your Roll no. name :- "+i);
		System.out.println("your phone n0. :- "+l);
		System.out.println("your percentage :- "+d);
		System.out.println("your sectionn :- "+ch);
		System.out.println("your Degree :- "+s3);
		System.out.println("your stream :- "+s4);

	}
}