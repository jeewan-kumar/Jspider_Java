class Q5_Do_While_Loop{
	public static void main(String[] args) {
		char i=65;
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
		while(i<=67);
	}
}
/* Output - 
			AAA
			BBB
			CCC
*/