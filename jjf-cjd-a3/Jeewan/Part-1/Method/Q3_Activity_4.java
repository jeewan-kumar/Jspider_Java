// Create a method which accepts boolean float double and return char.

class Q3_Activity_4{

	boolean b=true;
	float f=3.14f;
	double d=47.4747;

	public static void main(String[] args) {
		
		Q3_Activity_4 q=new Q3_Activity_4();

	/*	boolean b=true;
		float f=3.14f;
		double d=47.4747; */

		char ch=q.m1();

		System.out.println("Result - "+ch);
	}
	public char m1(){

		char ch;

		if(b){
			ch = 'T';
		}else{
			ch = 'F';
		}

		return ch;
	}
}