import java.util.*;
public class Month2{
	public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your Month number :- ");
		int i=scr.nextInt();
		
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
			System.out.println("31 Days");
		}
		else if (i==2) {
			System.out.println("28 ya 29 Days");
		}
		else if(i==4||i==6||i==9||i==11) {
			System.out.println("30 Days");
		}
		else
		{
			System.out.println("Not eligible month number");
		}
	}
}