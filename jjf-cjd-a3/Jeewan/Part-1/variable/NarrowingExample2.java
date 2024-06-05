//WAJP creates a double variable store the integer inside it and prints it.

class NarrowingExample2
		{
			public static void main (String [] args)
			{
				double d=5;
				int i=(int)d; //widening
				System.out.println("Double_value - "+d);
				System.out.println("Integer_value - "+i);
			}
		}
/* Output – Double_value – 5.0
	       	Integer_value – 5     */
