// Create a method which accepts int float argument and return boolean.

class Q2_Activity_4{
	int i=5;
	float f=3.14f;
	public static void main(String[] args) {
		
		Q2_Activity_4 q=new Q2_Activity_4();

		boolean b=q.m1();

		System.out.println("Result - "+b);
	}
	public boolean m1(){

		boolean b=i>f;

		return b;
	}
}