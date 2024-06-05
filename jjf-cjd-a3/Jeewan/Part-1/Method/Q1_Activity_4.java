// Create a method which accepts int argument and return int.

class Q1_Activity_4{
	int a=3,b=4;
	public static void main(String[] args) {
		
		Q1_Activity_4 q=new Q1_Activity_4();

		int i=q.m1();

		System.out.println("Result - "+i);
	}
	public int m1(){

		int i=a+b;

		return i;
	}
}
