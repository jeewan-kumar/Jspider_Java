class Q9_Do_While_Loop{
	public static void main(String[] args) {
		int i=5,k=1;
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
			123
			456
			789
*/