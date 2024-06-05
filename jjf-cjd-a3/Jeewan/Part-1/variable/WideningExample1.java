//WAJP creates a byte variable stores the integer inside it and prints it.

class WideningExample1
		{
			public static void main (String [] args)
			{
				byte a=5;
				int d=a; //widening
				System.out.println("Byte_value - "+a);
				System.out.println("Int_value - "+d);
			}
		}
/* Output – Byte_value - 5
	       	Int_value – 5    */
