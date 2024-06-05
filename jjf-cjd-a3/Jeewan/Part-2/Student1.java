import java.util.Scanner;

class Student1 {
    private String name;
    private int roll;
    private long phno;
    private int mark;

    Student1(String name, int roll, long phno, int mark) {
        this.name = name;
        this.roll = roll;
        this.phno = phno;
        this.mark = mark;
        System.out.println("\nAccount is updated");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        Student1[] students = new Student1[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = scanner.next(); 
            
            System.out.print("Enter student roll number: ");
            int roll = scanner.nextInt();

            System.out.print("Enter student phone number: ");
            long phno = scanner.nextLong();

            System.out.print("Enter student mark: ");
            int mark = scanner.nextInt();

            students[i] = new Student1(name, roll, phno, mark);
        }

       
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nDetails for Student " + (i + 1));
            students[i].getName();
            students[i].getRoll();
            students[i].getPhno();
            students[i].getMark();
        }
    }

    
    public void getName() {
        System.out.println("(r) " + name);
    }

    public void getRoll() {
        System.out.println("(r) " + roll);
    }

    public void getPhno() {
        System.out.println(phno);
    }

    public void getMark() {
        System.out.println("(r) " + mark);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("(w) Name updated");
    }

    public void setMark(int mark) {
        this.mark = mark;
        System.out.println("(w) Mark updated");
    }
}
