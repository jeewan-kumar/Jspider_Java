class Q2_While_Loop{
	public static void main(String[] args) {
		int i=1;
		while(i<=4){
			int j=1;
			while(j<=4){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
/* Output - 
			1111
			2222
			3333
			4444
*/