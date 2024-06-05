class Q10_Do_While_Loop{
	public static void main(String[] args) {
		int i=5;
		char k=65;
		do{
			int j=1;
			do{
				System.out.print(k);
				k++;
				j++;
			}
			while(j<=3);
			System.out.println();
			i--;
		}
		while(i>=3);
	}
}
/* output -
			ABC
			DEF
			GHI
*/