/*9. WAJP print the statement using datatypes, variable, and keyword
	Class name – employee details
	Employee name – Jeewan
	Employee id – 101
	Phone number – 123456789
	Email id – imjeewankumar@gmail.com
	Address – 1c, sec-17, gurugram
	Department – testing
	Salary – 6lpa
	Attendance -true */

class Employee_Details
	{
	public static void main(String[] args)
		{
		String employee_name,email_id,address,department,salary;
		int employee_id;
		long phone_number;
		boolean attendance;

		employee_name="Jeewan";
		employee_id=101;
		phone_number=123456789l;
		email_id="imjeewankumar@gmail.com";
		address="1c, sec-17, gurugram";
		department="testing";
		salary="6lpa";
		attendance=true;

		System.out.println("Employee Name - "+employee_name);
		System.out.println("Employee id - "+employee_id);
		System.out.println("Phone number - "+phone_number);
		System.out.println("Email id - "+email_id);
		System.out.println("Address - "+address);
		System.out.println("Department - "+department);
		System.out.println("Salary - "+salary);
		System.out.println("Attendance - "+attendance);
		}
	}