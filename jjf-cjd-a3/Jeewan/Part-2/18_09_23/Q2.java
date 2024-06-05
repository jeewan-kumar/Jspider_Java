
class Q2{
	public static void main(String[] args) {
		m1(10);
		m2(10);
		m3(10);
		m4(10);	
	}
	public static void m1(int n){
		System.out.println("");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

		public static void m2(int n){
			System.out.println("");
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	public static void m3(int n){
			System.out.println("");
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n-i+1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		

		public static void m4(int n){
			System.out.println("");
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print(" ");
				}
				for(int j=i;j<=n;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

/*
class Q2{
	public static void main(String[] args) {
		m1(10);		
	}
	
	}
}

class Q2{
	public static void main(String[] args) {
		m1(10);		
	}
	
	}
}

class Q2{
	public static void main(String[] args) {
		m1(10);		
	}
	
	}
}
*/