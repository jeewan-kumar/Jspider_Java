// create a method which accepts no argument and return int.
/*
class Q1_Activity_2{
	public static void main(String[] args) {
		
		Q1_Activity_2 q=new Q1_Activity_2();

		int i=q.m1();

		System.out.println("Result - "+i);
	}
	public int m1(){
		int i=50;

		return i;
	}
}
*/
class Q1_Activity_2{
	double d=3.75;
	public static void main(String[] args) {
		
		Q1_Activity_2 q=new Q1_Activity_2();

		//double d=3.75;
		int i=q.m1();

		System.out.println("Result - "+i);
	}
	public int m1(){

		int i=(int)d;

		return i;
	}
}
