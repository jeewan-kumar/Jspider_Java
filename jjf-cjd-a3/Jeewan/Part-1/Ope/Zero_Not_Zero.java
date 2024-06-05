// WAJP finds out whether the number is zero or not.

/*class Zero_Not_Zero
{
	public static void main (String[] args)
	{
		int a=10;

		System.out.println(a==0?"A = "+a+" is zero number.":"A = "+a+" is not a zero number.");
	}
}

// output - A 10 is not a zero number.

class Zero_Not_Zero
{
	public static void main (String[] args)
	{
		int a=0;
		String s=a==0?"A = "+a+" is zero number.":"A = "+a+" is not a zero number.";
		
		System.out.println(s);
	}
}

// output - A = 0 is the zero number.*/

import java.util.Scanner;

class Zero_Not_Zero 
{
    public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter any types of number: ");
        	int a = scanner.nextInt();

		String s=a==0?"A = "+a+" is zero number.":"A = "+a+" is not a zero number.";
		
		System.out.println(s);
	}
}

// output - Enter any type of number: (depending on the user)