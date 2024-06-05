//7. WAJP stores the int value into the double, float, long, int, char, short, and byte type variables.

class Variable
	{
		public static void main(String[] args)
		{
			double d=6598786;
			float f=(float)d;
			long l=(long)d;
			int i=(int)d;
			char ch=(char)d;
			short s=(short)d;
			byte b=(byte)d;
			
			System.out.println("Double_Value - "+d);
			System.out.println("Float_Value - "+f);
			System.out.println("Long_Value - "+l);
			System.out.println("Int_Value - "+i);
			System.out.println("Char_Value - "+ch);
			System.out.println("Short_Value - "+s);
			System.out.println("Byte_Value - "+b);			
			
		}
	}

/* output -
		Double_Value - 6598786.0
		Float_Value - 6598786.0
		Long_Value - 6598786
		Int_Value - 6598786
		Char_Value - ?
		Short_Value - -20350
		Byte_Value - -126
*/