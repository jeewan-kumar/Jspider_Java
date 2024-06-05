class Q9_While_Loop{
	public static void main(String[] args) {
		int i=5,k=1;
		while(i>=3){
			int j=1;
			while(j<=3){
				System.out.print(k);
				k++;
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
/* output -
			123
			456
			789
*/