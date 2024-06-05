class Q10_While_Loop{
	public static void main(String[] args) {
		int i=5;
		char k=65;
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
			ABC
			DEF
			GHI
*/