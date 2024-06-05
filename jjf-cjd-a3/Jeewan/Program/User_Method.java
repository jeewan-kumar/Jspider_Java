
class User_Method {

	String userid;
	int pas;
	String bio;
	User_Method(String userid, int pas, String bio){
		this.userid=userid;
		this.pas=pas;
		this.bio=bio;

		System.out.println("Account is updated\n");
	}
	public static void main(String[] args) {
		
		User_Method s1=new User_Method("jeewan",1234,"hi jeewan");
		//System.out.println(u1.bio);
		//getbio(); error

		s1.getuserid();
		s1.getpas();
		s1.getbio();
		
	}
	public void getuserid(){
		String us="Guddu";
		System.out.println("User name - "+us);
	}
	public void getpas(){
		int i=123;
		System.out.println("User pas - "+i);
	}
	public void getbio(){
		String s1="Hii Guddu";
		System.out.println("Bio - "+s1);
	}

}