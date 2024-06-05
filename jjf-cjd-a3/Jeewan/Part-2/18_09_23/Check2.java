class Check2{
	int x;
	static int y=10;

	public Check2(){
		System.out.println("i am");
	}
	public void m2(){
		System.out.println("m2");
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		m1();
		System.out.println();
		Check2 t=new Check2();

		System.out.println(t.x);
		System.out.println(t.y);
		t.m2();
	}
	public static void m1(){
		System.out.println("From m1");
	}
}