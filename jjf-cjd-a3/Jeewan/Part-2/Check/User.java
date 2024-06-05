class User {
	private String usname;
	private int pwd;
	private String ifsc;
	private double bal;

	User(String usname, int pwd, String ifsc, double bal){
		this.usname=usname;
		this.pwd=pwd;
		this.ifsc=ifsc;
		this.bal=bal;

		System.out.println("Account is updated\n");
	}
	
	public static void main(String[] args) {
		User s1=new User("dev",9955,"sbin0078",124.52);

		s1.getName();
		s1.setName("deviasis");
		s1.getName();
		s1.getBal();
		s1.setBal(500);
		s1.getBal();
		s1.usname ="hy";
		s1.getName();
		
	}

	public void getName(){
		System.out.println("(r/w)"+usname);
	}

	public void getPwd(){
		System.out.println("(w)"+pwd);
	}

	public void getIFSC(){
		System.out.println("(r)"+ifsc);
	}

	public void getBal(){
		System.out.println("(w/r)"+bal);
	}

	public void setName(String name){
		this.usname=usname;
		System.out.println("(w) Name updated");
	}

	public void setBal(double bal){
		this.bal+=bal;
		System.out.println("(w) bal updated");
	}
}

