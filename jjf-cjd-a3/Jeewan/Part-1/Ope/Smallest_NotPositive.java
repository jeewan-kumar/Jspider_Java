// WAJP finds out the smallest amount of two numbers.

/*
class Smallest_Amount
{
	public static void main (String[] args)
	{
		int a=30, b=20;

		System.out.println(a<b?"A = "+a+" is the smallest number":"B = "+b+" is the smallest number");
	}
}

//output - B = 20 is the smallest number.

class Smallest_Amount
{
	public static void main (String[] args)
	{
		int a=20, b=30;
		String s=a>b?"A = "+a+" is the smallest number.":"B = "+b+" is the smallest number.";
		
		System.out.println(s);
	}
}		*/

// output - A = 20 is the smallest number.

import java.util.Scanner;

class Smallest_NotPositive 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of first number: ");
        	int a = scanner.nextInt();

		System.out.print("Enter any types of second number: ");
        	int b = scanner.nextInt();

		String s=a>b?"A = "+a+" is the smallest number.":"B = "+b+" is the smallest number.";
		
		System.out.println(s);
	}
}

/* output - Enter any type of first number: (depending on the user)
	    Enter any type of second number: (depending on the user)*/