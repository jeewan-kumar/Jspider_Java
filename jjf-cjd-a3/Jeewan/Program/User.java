class User {

	String userid;
	int pas;
	String bio;
	User(String userid, int pas, String bio){
		this.userid=userid;
		this.pas=pas;
		this.bio=bio;

		System.out.println("Account is created");
	}
	public static void main(String[] args) {
		
		User s1=new User("jeewan",1234,"hi jeewan");

		System.out.println(s1.userid);
		System.out.println(s1.pas);
		System.out.println(s1.bio);
	}

}