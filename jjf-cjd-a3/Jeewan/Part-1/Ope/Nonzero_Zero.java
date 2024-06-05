// WAJP finds out whether the number is nonzero or not.

/*class Nonzero_Zero
{
	public static void main (String[] args)
	{
		int a=10;

		System.out.println(a!=0?"A = "+a+" is nonzero number.":"A = "+a+" is a zero number.");
	}
}

// output - A = 10 is nonzero number.

class Nonzero_Zero
{
	public static void main (String[] args)
	{
		int a=0;
		String s=a!=0?"A = "+a+" is nonzero number.":"A = "+a+" is a zero number.";
		
		System.out.println(s);
	}
}

// output - A = 0 is the zero number.*/

import java.util.Scanner;

class Nonzero_Zero 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of number: ");
        	int a = scanner.nextInt();

		String s=a!=0?"A = "+a+" is nonzero number.":"A = "+a+" is a zero number.";
		
		System.out.println(s);
	}
}

// output - Enter any type of number: (depending on the user)