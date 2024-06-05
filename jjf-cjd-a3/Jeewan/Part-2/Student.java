import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private long phno;
    private int mark;

    Student(String name, int roll, long phno, int mark) {
        this.name = name;
        this.roll = roll;
        this.phno = phno;
        this.mark = mark;
        System.out.println("\nAccount is updated");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Enter student name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int roll1 = scanner.nextInt();
        System.out.print("Enter student phone number: ");
        long phno1 = scanner.nextLong();
        System.out.print("Enter student mark: ");
        int mark1 = scanner.nextInt();

        Student s1 = new Student(name1, roll1, phno1, mark1);

        System.out.println("\nEnter details for Student 2:");
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter student phone number: ");
        long phno2 = scanner.nextLong();
        System.out.print("Enter student mark: ");
        int mark2 = scanner.nextInt();

        Student s2 = new Student(name2, roll2, phno2, mark2);

           
        System.out.println("\nDetails for Student 1:");
        s1.getName();
        s1.getRoll();
        s1.getPhno();
        s1.getMark();

        System.out.println("\nDetails for Student 2:");
        s2.getName();
        s2.getRoll();
        s2.getPhno();
        s2.getMark();
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


	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setPhno(long phno) {
		this.phno = phno;
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
