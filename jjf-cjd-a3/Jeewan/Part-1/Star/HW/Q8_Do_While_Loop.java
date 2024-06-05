class Q8_Do_While_Loop{
	public static void main(String[] args) {
		int i=5;
		do{
			int j=1;
			do{
				System.out.print(i);
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
			555
			444
			333
*/