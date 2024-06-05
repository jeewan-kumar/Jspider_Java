//WAJP creates an integer variable stores the byte inside it and prints it.

class NarrowingExample1
		{
			public static void main (String [] args)
			{
				int a=5;
				byte b=(byte)a; //widening
				System.out.println("Int_value - "+a);
				System.out.println("Byte_value - "+b);
			}
		}
/* Output – Int_value - 5
	       	Byte_value - 5 */
