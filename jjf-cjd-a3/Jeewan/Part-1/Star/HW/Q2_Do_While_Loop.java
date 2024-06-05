class Q2_Do_While_Loop{
	public static void main(String[] args) {
		int i=1;
		do{
			int j=1;
			do{
				System.out.print(j);
				j++;
			}
			while(j<=4);
			System.out.println();
			i++;
		}
		while(i<=4);
	}
}
/* Output - 
			1111
			2222
			3333
			4444
*/