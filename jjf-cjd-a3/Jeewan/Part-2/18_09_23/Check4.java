class Check4 {
	static int a= demo()+test();
	static String var1;
	static{
		System.out.println("smil1");
		demo();
	}
	public static void main(String[] args) {
		System.out.println("Starts of main");
		var1="Ram";
		demo();
		System.out.println(a);
		System.out.println("Ends of main");
	}
	public static int demo() {
		System.out.println(var1);
		return 5;

	}
	public static int test(){
		System.out.println("I am test");
		return 3;
	}
	static{
		System.out.println("smli2");
		a=1;
	}
}
