//Create a method which accetps int,int,float,double,and return nothing.
class Q4_Activity_3{
	public static void acceptValue(int i,int in,float f, double d){
		System.out.println("Integer Number - "+i);
		System.out.println("Integer Number - "+in);
		System.out.println("Float Number - "+f);
		System.out.println("Double Number - "+d);
	}
	public static void main(String[] args) {
		int i=42;
		int in=10;
		float f=3.14f;
		double d=2.787079;

		acceptValue(i,in,f,d);
	}
}