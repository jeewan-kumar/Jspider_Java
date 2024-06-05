//WAJP to check number is even
import java.util.*;

class Test2{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("*****Welcome your MovieHouse*****");
		System.out.println("***Popular Cities***");
		System.out.println("Select you cities number");
		System.out.println("1: Mumbai");
		System.out.println("2: Delhi-NCR");
		System.out.println("3: Bengaluru");
		System.out.println("4: Hyderabad");
		System.out.println("5: Ahmedabad");
		System.out.println("6: Chandigarh");
		System.out.println("7: Chennai");
		System.out.println("8: Pune");

		System.out.print("Choose your citie number :- ");
		int i=scr.nextInt();

		if(i==1){
			System.out.println(" Mumbai");
			System.out.println("Select you cities name ");
			System.out.println("1: Mumbai");
			System.out.println("2: Mumbai 1");
			System.out.println("3: Mumbai 2");
			System.out.println("4: Mumbai 3");
			System.out.println("5: Mumbai 4");
			System.out.println("6: Mumbai 5");
			System.out.println("7: Mumbai 6");
			System.out.println("8: Mumbai 7");
			System.out.print("Choose your citie number :- ");
			int i1=scr.nextInt();

			if(i1==1){
				System.out.println("omg");
			}
			else if(i1==2){
				System.out.println("gadar");
			}
		
			else if(i1==3){
				System.out.println("pathan");
			}
		}
		else if(i==2){
			System.out.println("Delhi-NCR");
			System.out.println(" Mumbai");
			System.out.println("Select you cities name ");
			System.out.println("1: Delhi-NCR");
			System.out.println("2: Delhi-NCR 1");
			System.out.println("3: Delhi-NCR 2");
			System.out.println("4: Delhi-NCR 3");
			System.out.println("5: Delhi-NCR 4");
			System.out.println("6: Delhi-NCR 5");
			System.out.println("7: Delhi-NCR 6");
			System.out.println("8: Delhi-NCR 7");
			System.out.print("Choose your citie number :- ");
			int i3=scr.nextInt();1
		}
			
		else if(i==3)
			System.out.println("Bengaluru");
		else if(i==4)
			System.out.println("Hyderabad ");
		else if(i==5)
			System.out.println("Ahmedabad ");
	}
}

// output - 7 is an Odd Number.