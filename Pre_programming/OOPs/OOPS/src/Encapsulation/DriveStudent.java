package Encapsulation;

public class DriveStudent {
	public static void main(String[] args) {
		 Student s = new Student("Jeewan", 123);
	        // System.out.println(s.name);
	        // System.out.println(s.roll);
	        s.getName(123);
	        s.getName(321);
	        s.setName("guddu",123);
	        s.setRoll(123,321);
	    }
}
