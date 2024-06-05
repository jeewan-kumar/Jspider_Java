/*WAJP creates a character variable store the integer and double inside it and prints it. */

class WideningExample3
		{
			public static void main (String [] args)
			{
				char ch='A';
				int i=ch; //widening
				double d=ch;
				System.out.println("Char_value - "+ch);
				System.out.println("Int_value - "+i);
				System.out.println("Double_value - "+d);
			}
		}
/* Output – 	Char_value – A		
	       	Int_value - 65 
		Double_value – 65.0 */	
