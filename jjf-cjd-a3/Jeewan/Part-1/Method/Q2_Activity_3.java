// Create a method which accepts int float argument and return nothing.
class Q2_Activity_3{
	public static void acceptIntFloat(int i, float f){
		System.out.println("Integer Number - "+i);
		System.out.println("Float Number - "+f);
	}
	public static void main(String[] args) {
		int i=42;
		float f=3.14f;

		acceptIntFloat(i,f);
	}
}