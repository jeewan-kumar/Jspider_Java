//Design a method that is used to print the last digit of a given number.
/* 
 class Q2_Activity_3{
 	public static void main(String[] args) {
 		m1();
 	}
 	public static void m1(){

 		int i=787878;
 		int last=i%10;
 		System.out.println("last digit number "+last);
 	}
 }
*/
 class Q2_Activity_3{
 	public static void main(String[] args) {
 		int i=787878;
 		m1(i);
 	}
 	public static void m1(int i){
 		int last=i%10;
 		System.out.println("last digit number "+last);
 	}
 }