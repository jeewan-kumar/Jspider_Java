class Q7_Do_While_Loop{
	public static void main(String[] args) {
		int i=1;
		do{
			int j=1;
			do{
				System.out.print(j);
				j++;
			}
			while(j<=3);
			System.out.println();
			i++;
		}
		while(i<=3);
	}
}
/* output -
			123
			123
			123
*/