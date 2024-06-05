//user inter your marks and print user inpute marks and percentage with grade.

import java.util.Scanner;

public class Print_The_Markes_Percentage {
   public static void main(String[] args) {
    int marks[] = new int[6];
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter your Physic marks : ");
    marks[0]=sc.nextInt();

    System.out.print("Enter your Chemstry marks : ");
    marks[1]=sc.nextInt();

    System.out.print("Enter your Mathematics marks : ");
    marks[2]=sc.nextInt();

    System.out.print("Enter your Hindi marks : ");
    marks[3]=sc.nextInt();

    System.out.print("Enter your English marks : ");
    marks[4]=sc.nextInt();

    int total = (marks[0]+marks[1]+marks[3]+marks[4]+marks[5]);
    int per = (marks[0]+marks[1]+marks[3]+marks[4]+marks[5])/5;

    String grade;
    
    if(per>=90){
        grade="A";
    }
    else if(per>=75){
        grade="B";
    }else if(per>=50){
        grade="C";
    }else {
        grade="D";
    }

    System.out.println("\n*****Result*****");
    System.out.println("Physic : "+marks[0]);
    System.out.println("Chemstry : "+marks[1]);
    System.out.println("Mathematic : "+marks[2]);
    System.out.println("Hindi : "+marks[3]);
    System.out.println("English : "+marks[4]);
    System.out.println("Total marks : "+total);
    System.out.println("Percentage of marks : "+per); 
    System.out.println("Grade : "+grade);   
   } 
}
