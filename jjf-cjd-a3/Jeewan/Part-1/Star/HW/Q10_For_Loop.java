class Q10_For_Loop
{
	public static void main(String[] args) 
	{
		char k='A';
		for(int i=1;i>=3;i--)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}

/* output -
			ABC
			DEF
			GHI
*/