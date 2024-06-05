// Create a method which accepts int,long,float,double,char,string and return nothing.
class Q5_Activity_3{
	public static void acceptValue(int i, long l, float f, double d, char ch,String s){
		System.out.println("Integer type value - "+i);
		System.out.println("Long type value - "+l);
		System.out.println("Float type value - "+f);
		System.out.println("Double type value - "+d);
		System.out.println("Character type value - "+ch);
		System.out.println("String type value - "+s);
	}
	public static void main(String[] args) {
		int i=42;
		long l=9955446348l;
		float f=3.14f;
		double d=2.787079;
		char ch='j';
		String s="Jeewan Kumar";

		acceptValue(i,l,f,d,ch,s);
	}
}