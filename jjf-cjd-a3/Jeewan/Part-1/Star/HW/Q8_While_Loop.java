class Q8_While_Loop{
	public static void main(String[] args) {
		int i=5;
		while(i>=3){
			int j=1;
			while(j<=3){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
/* output -
			555
			444
			333
*/