class Student {
	String name;
	int roll;
	long pho;
	double per;

	Student(String name, int roll, long pho, double per){
		this.name=name;
		this.roll=roll;
		this.pho=pho;
		this.per=per;

		System.out.println("Account is updated\n");
	}

	public static void main(String[] args) {
		Student s1=new Student("Jeewan",9955,7870794231l,77.7);

		s1.getName();
		s1.getRoll();
		s1.getPho();
		s1.getPer();

		s1.setName("Guddu");
		s1.setRoll(7870);
		s1.setPho(9955446348l);
		s1.setPer(85.85);

		s1.getName();
		s1.getRoll();
		s1.getPho();
		s1.getPer();

		Student s2=new Student("Sachin",7654,9955000253l,78.7);

		s2.getName();
		s2.getRoll();
		s2.getPho();
		s2.getPer();

		s2.setName("Gorave");
		s2.setRoll(7870);
		s2.setPho(9955447870l);
		s2.setPer(80.86);

		s2.getName();
		s2.getRoll();
		s2.getPho();
		s2.getPer();
	}

	public void getName(){
		System.out.println(name);
	}

	public void getRoll(){
		System.out.println(roll);
	}

	public void getPho(){
		System.out.println(pho);
	}

	public void getPer(){
		System.out.println(per);
	}

	public void setName(String name){
		this.name=name;
		System.out.println("Name updated");
	}

	public void setRoll(int roll){
		this.roll=roll;
		System.out.println("Roll no updated");
	}

	public void setPho(long pho){
		this.pho=pho;
		System.out.println("Pho. no updated");
	}

	public void setPer(double per){
		this.per=per;
		System.out.println("Per updated");
	}
}

