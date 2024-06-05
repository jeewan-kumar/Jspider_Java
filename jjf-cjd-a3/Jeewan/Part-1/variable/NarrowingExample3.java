/*WAJP creates an integer variable store the character and double inside it and prints it.*/

class NarrowingExample3
		{
			public static void main (String [] args)
			{
				int i=65;
				char ch=(char)i;//widening
				double d=(double)ch;
				System.out.println("Char_value - "+ch);
				System.out.println("Int_value - "+i);
				System.out.println("Double_value - "+d);
			}
		}
/* Output – 	Char_value – A		
	       	Int_value - 65 
		Double_value – 65.0 */	
