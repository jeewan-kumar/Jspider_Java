// WAJP finds out if the number is positive or not positive.

/*class Positive_NotPositive
{
	public static void main (String[] args)
	{
		int a=10;

		System.out.println(a>=0? a+" is the +ve number.":a+" is the -ve number.");
	}
}

// output = 10 is the +ve number.

class Positive_NotPositive
{
	public static void main (String[] args)
	{
		int a=-20;
		String s=a>=0? a+" is the +ve number.":a+" is the -ve number.";
		
		System.out.println(s);
	}
}

// output = 20 is the -ve number.*/

import java.util.Scanner;

class Positive_NotPositive 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of number: ");
        	int a = scanner.nextInt();

		String s=a>=0? a+" is the +ve number.":a+" is the -ve number.";
		
		System.out.println(s);
	}
}

// output - Enter any type of number: (depending on the user)
