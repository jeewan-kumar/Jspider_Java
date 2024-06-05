class Q5_While_Loop{
	public static void main(String[] args) {
		char i=65;
		while(i<=67){
			int j=1;
			while(j<=3){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
/* Output - 
			AAA
			BBB
			CCC
*/