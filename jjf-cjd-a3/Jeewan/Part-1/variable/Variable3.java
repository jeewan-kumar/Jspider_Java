//8. WAJP stores the int value into the byte, short, char, int, long, float, and double-type variable.

class Variable
	{
		public static void main(String[] args)
		{
			byte b=65;
			short s=b;
			char ch=(char)b;
			int i=b;
			long l=b;
			float f=b;
			double d=b;
			
			System.out.println("Byte_Value - "+b);
			System.out.println("Short_Value - "+s);
			System.out.println("Char_Value - "+ch);
			System.out.println("Int_Value - "+i);
			System.out.println("Long_Value - "+l);
			System.out.println("Float_Value - "+f);
			System.out.println("Double_Value - "+d);
			
		}
	}
/*
output -
	Byte_Value - 65
	Short_Value - 65
	Char_Value - A
	Int_Value - 65
	Long_Value - 65
	Float_Value - 65.0
	Double_Value - 65.0
*/