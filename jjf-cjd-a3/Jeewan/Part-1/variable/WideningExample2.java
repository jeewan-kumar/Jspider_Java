//WAJP creates an integer variable store the double inside it and prints it.

class WideningExample2
		{
			public static void main (String [] args)
			{
				int a=5;
				double d=a; //widening
				System.out.println("Int_value - "+a);
				System.out.println("Double_value - "+d);
			}
		}
/* Output – Int_value - 5
	      	 Double_value - 5.0 */
