// Create a method which accetpts no argument and return char.
/*
class Q3_Activity_2{
	public static void main(String[] args) {

		Q3_Activity_2 q=new Q3_Activity_2();

		char ch=q.m1();

		System.out.println("Result = "+ch);

	}
	public char m1(){
		char ch='G';
		return ch;
	}
}
*/
class Q3_Activity_2{
	int i=65;
	public static void main(String[] args) {

		Q3_Activity_2 q=new Q3_Activity_2();

		char ch=q.m1();

		System.out.println("Result = "+ch);

	}
	public char m1(){
		char ch=(char)i;
		return ch;
	}
}