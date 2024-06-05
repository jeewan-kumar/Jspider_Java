class Emp {
	static String e_Name;
	static String e_Add;
	static int e_Age;
	static long e_Phone;
	String enme;
	int eid;

	public static void main(String[] args) {
		String ch=m1();
		String ch1=m2();
		int i=age();
		long l=pho();

		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(i);
		System.out.println(l);
	}
	public static String m1(){
		String ch="Jeevan kumar";
		return ch;
	}
	public static String m2(){
		String ch1="Srisab pahi hat";
		return ch1;
	}
	public static int age(){
		int i=25;
		return i;
	}
	public static long pho(){
		long l=9955446348l;
		return l;
	}
}