// create a method which accepts boolean, float, double and return nothing.
class Q3_Activity_3{
	public static void acceptBooleanFloatDouble(boolean b, float f, double d){
		System.out.println("Boolean Value - "+b);
		System.out.println("Float Number - "+f);
		System.out.println("Double Number - "+d);
	}
	public static void main(String[] args) {
		
		boolean b=true;
		float f=3.14f;
		double d=2.787079;

		acceptBooleanFloatDouble(b,f,d);
	}
}