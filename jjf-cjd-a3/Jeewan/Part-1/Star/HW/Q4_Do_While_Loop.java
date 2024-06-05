class Q4_Do_While_Loop{
	public static void main(String[] args) {
		int i=1;
		do{
			int j=1;
			do{
				System.out.print(i);
				j++;
			}
			while(j<=3);
			System.out.println();
			i++;
		}
		while(i<=3);
	}
}
/* Output - 
			111
			222
			333
*/