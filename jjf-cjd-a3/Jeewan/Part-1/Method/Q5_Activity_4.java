// Create a method which accepts int,long,float,double,char, String and return float.

class Q5_Activity_4{
	int i=10;
	long l=9955446348l;
	float f=3.14f;
	double d=47.4747;
	char ch='G';
	String s="Jeewan";

	public static void main(String[] args) {
		
		Q5_Activity_4 q=new Q5_Activity_4();

	/*	int i=10;
		long l=9955446348l;
		float f=3.14f;
		double d=47.4747;
		char ch='G';*/

		float f1=q.m1(10,9955446348l,3.14f,47.476,'j',"jeewan");

		System.out.println("Result - "+f1);
	}
	public float m1(int i,long l,float f,double d,char ch, String s){

		float f1=3.75f;

		return f1;
	}
}