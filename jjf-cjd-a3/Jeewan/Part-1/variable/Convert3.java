//5. WAJP to store char type data(‘A’) inside the short and int type variable and print it.

class Convert3
	{
		public static void main(String[] args)
		{
			char ch='A';
			short s=(short)ch;
			int i=(int)ch;
			

			System.out.println("Char_value - "+ch);
			System.out.println("Short_value - "+s);
			System.out.println("Int_value - "+i);
		}
	}

/* output -
		Char_value - A
		Short_value - 65
		Int_value - 65
*/