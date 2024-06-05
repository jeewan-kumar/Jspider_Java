// WAJP finds out the largest amount of two numbers.
/*
class Largest_Amount
{
	public static void main (String[] args)
	{
		int a=30, b=20;

		System.out.println(a>b?"A = "+a+" is the larger number":"B = "+b+" is the larger number");
	}
}

//output = A = 30 is the larger number.

class Largest_Amount
{
	public static void main (String[] args)
	{
		int a=20, b=30;
		String s=a>b?"A = "+a+" is the larger number.":"B = "+b+" is the larger number.";
		
		System.out.println(s);
	}
}		*/

// output = B = 30 is the larger number.

import java.util.Scanner;

class Positive_NotPositive 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of first number: ");
        	int a = scanner.nextInt();

		System.out.print("Enter any types of second number: ");
        	int b = scanner.nextInt();

		String s=a>b?"A = "+a+" is the larger number.":"B = "+b+" is the larger number.";
		
		System.out.println(s);
	}
}

/* output - Enter any type of first number: (depending on the user)
	    Enter any type of second number: (depending on the user)*/