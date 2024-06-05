class Q9_For_Loop
{
	public static void main(String[] args) 
	{
		int k=1;
		for(int i=5;i>=3;i--)
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
			123
			456
			789
*/