// Create a method which accepts no argument and return float.
/*
class Q5_Activity_2{
	public static void main(String[] args) {

		Q5_Activity_2 q=new Q5_Activity_2();

		float f=q.m1();

		System.out.println("Result = "+f);

	}
	public float m1(){
		float f=3.175f;
		return f;
	}
}
*/
class Q5_Activity_2{
	int i=50;
	public static void main(String[] args) {

		Q5_Activity_2 q=new Q5_Activity_2();

		//int i=50;
		float f=q.m1();

		System.out.println("Result = "+f);

	}
	public float m1(){
		float f=(float)i;
		return f;
	}
}