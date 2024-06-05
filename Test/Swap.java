// SWAP two number without using thired variable.
class Swap {
	public static void main(String[] args) {
	
		int a = 5, b=6;
	
		b = a+b;
		a = b-a;
		b = b-a;
			
		System.out.println(a);
		System.out.println(b);
	}
}
