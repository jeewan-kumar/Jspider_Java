// WAJP to display student gread with respect to ther markes.

import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student's Grade: " + grade);

    }
}
