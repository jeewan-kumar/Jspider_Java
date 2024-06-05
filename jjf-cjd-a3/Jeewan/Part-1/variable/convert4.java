//6. WAJP to store Boolean type data(true) inside the int type variable and print it.

class Convert4
	{
		public static void main(String[] args)
		{
			boolean b=true;
			int i=(int)b;

			System.out.println("Boolean_value - "+b);
			System.out.println("Int_value - "+i);
		}
	}

/*output -
	convert4.java:8: error: incompatible types: boolean cannot be converted to int
                        int i=(int)b;
                                   ^
	1 error
	error: compilation failed
*/