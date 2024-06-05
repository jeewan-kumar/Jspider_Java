//create a method which accepts no argument and return boolean.
/*
class Q2_Activity_2{
	public static void main(String[] args) {

		Q2_Activity_2 q=new Q2_Activity_2();

		boolean b=q.m1();

		System.out.println("Result = "+b);

	}
	public boolean m1(){
		boolean b=true;
		return b;
	}
}
*/
class Q2_Activity_2{
	int i=10;
	public static void main(String[] args) {
		
		Q2_Activity_2 q=new Q2_Activity_2();

		//int i=10;
		boolean b=q.m1();

		System.out.println("Result - "+b);
	}
	public boolean m1(){

		boolean b=i%2==0;

		return b;
	}
}
