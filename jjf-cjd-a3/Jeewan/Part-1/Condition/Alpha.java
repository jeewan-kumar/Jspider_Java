import java.util.*;
public class Alpha{
	public static void main(String[] args){
		
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter your character number :- ");
		char ch=scr.next().charAt(0);
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			System.out.println(ch+" is a vowel");
		}
		else if(ch=='b'||ch=='B'||ch=='c'||ch=='C'||ch=='d'||c=='D'||ch=='f'||ch=='F'||ch=='g'||ch=='G'||ch=='h'||ch=='H'||ch=='j'||ch=='J'||ch=='k'||ch=='K'||ch=='l'||ch=='L'||ch=='m'||ch=='M'||ch=='n'||ch=='N'||ch=='p'||ch=='P'||ch=='q'||ch=='Q'||ch=='r'||ch=='R'||ch=='s'||ch=='S'||ch=='t'||ch=='T'||ch=='v'||ch=='V'||ch=='w'||ch=='W'||ch=='x'||ch=='x'||ch=='y'||ch=='y'||ch=='z'||ch=='Z') {
			System.out.println(ch+" is a Consonant");
		}
		else
		{
			System.out.println("Not invalid alphabet");
		}
	}
}