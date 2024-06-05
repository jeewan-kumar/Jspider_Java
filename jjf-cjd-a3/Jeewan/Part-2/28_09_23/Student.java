class Student {
	private String name;
	private int roll;	
	private long phno;	
	private int mark;

	Student(String name, int roll, long phno, int mark) {
		this.name=name;
		this.roll=roll;
		this.phno=phno;
		this.mark=mark;
		System.out.println("\nAccount is updated");
	}

	public static void main(String[] args) {
		Student s1=new Student("Jeewan",9955,7870794231l,255);
		
		s1.getName();
		s1.getRoll();
		s1.getPhno();
		s1.getMark();	

		s1.setName("guddu");
		s1.setMark(400);

		s1.getName();
		s1.getRoll();
		s1.getPhno();
		s1.getMark();	

		Student s2=new Student("Sachin",7870,9955446348l,350);
		
		s2.getName();
		s2.getRoll();
		s2.getPhno();
		s2.getMark();	

		s2.setName("Harsh");
		s2.setMark(300);

		s2.getName();
		s2.getRoll();
		s2.getPhno();
		s2.getMark();	
	}

	public void getName() {
		System.out.println("(r) "+name);
	}

	public void getRoll() {
		System.out.println("(r) "+roll);
	}

	public void getPhno() {
		System.out.println(phno);
	}

	public void getMark() {
		System.out.println("(r) "+mark);
	}

	public void setName(String name){
		this.name=name;
		System.out.println("(w) Name updated");
	}

	public void setMark(int mark){
		this.mark=mark;
		System.out.println("(w) mark updated");
	}
}