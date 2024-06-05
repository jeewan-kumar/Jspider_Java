class Q6_Do_While_Loop{
	public static void main(String[] args) {
		int i=1;
		do{
			char j=65;
			do{
				System.out.print(j);
				j++;
			}
			while(j<=67);
			System.out.println();
			i++;
		}
		while(i<=3);
	}
}
/* Output - 
			ABC
			ABC
			ABC
*/