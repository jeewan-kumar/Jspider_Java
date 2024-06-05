class Q1_While_Loop{
	public static void main(String[] args) {
		int i=1;
		while(i<=3){
			int j=1;
			while(j<=3){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
/* Output - 
			123
			123
			123
*/