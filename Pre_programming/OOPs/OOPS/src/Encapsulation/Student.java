package Encapsulation;

public class Student {
	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public void getName(int roll) {
		if (this.roll==roll) {
			System.out.println(name);
		} else {
			System.out.println("Enter the valid roll number");
		}
	}
	public void setName(String name, int roll) {
		if(this.roll == roll){
            this.name = name;
            System.out.println("name is update");
            
        } else {
            System.out.println("Enter your valid number");
        }
	}




	public void setRoll(int roll, int new_roll) {
		if(this.roll == roll) {
            this.roll = new_roll;
            System.out.println("roll is update");
        } else {
            System.out.println("invalid roll");
        }
	}

	public static void main(String[] args) {
		Student s = new Student("Jeewan",123);
        System.out.println("Name: "+s.name);
        System.out.println("Roll No.: "+s.roll);
        s.getName(321);
        s.setName("guddu",123);
        s.setRoll(123,321);
        System.out.println("Name: "+s.name);
        System.out.println("Roll No.: "+s.roll);

	}

}
