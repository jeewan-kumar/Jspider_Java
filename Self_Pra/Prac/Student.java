class Student {
	private String sName;
	private int sRoll;

	Student (String sName, int sRoll) {
	this.sName = sName;
	this.sRoll = sRoll;
	}

	public static void main(String[] args) {
	Student s = new Student("jeewan",123);
	System.out.println(s.sName);
	}
	
	public void getsName(int sRoll) {
		if(this.sRoll == sRoll) {
			System.out.println(sName);
		} else {
			System.out.println("enter the valid roll number");
		}
		
	}

	public void setsName (String sName, int sRoll) {
	if(this.sRoll == sRoll) {
			this.sName = sName;
			System.out.println("name update");
		} else {
			System.out.println("enter the valid roll number");
		}
		
	}	
}
	
