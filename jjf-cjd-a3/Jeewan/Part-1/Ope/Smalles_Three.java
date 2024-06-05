// WAJP finds out whether the smallest amount of 3 numbers is by the help of a conditional operator. 

class Smalles_Three
{
	public static void main (String[] args)
	{
		int a=80, b=60, c=50;

		System.out.println(a<b?(a<c?"A = "+a+" is the smallest number":"C = "+c+" is the smallest number"):(b<c?"B = "+b+" is the smallest number":"C = "+c+" is the smallest number"));
	}
}

//output = A = 30 is the larger number.
/*
class Smalles_Three
{
	public static void main (String[] args)
	{
		int a=50, b=30, c=60;
		int s=(a<b)?(a<c?a:c):(b<c?b:c);
		
		System.out.println("The smallest number is = "+s);
	}
}		

// output = B = 30 is the larger number.

import java.util.Scanner;

class Smalles_Three 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of first number: ");
        	int a = scanner.nextInt();

		System.out.print("Enter any types of second number: ");
        	int b = scanner.nextInt();

		System.out.print("Enter any types of third number: ");
        	int c = scanner.nextInt();

		int s=(a<b)?(a<c?a:c):(b<c?b:c);
		
		System.out.println("The smallest number is ="+s);
	}
}*/

/* output - Enter any type of first number: (depending on the user)
	    Enter any type of second number: (depending on the user)*/