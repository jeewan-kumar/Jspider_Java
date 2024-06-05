
class User1 {

	String userid;
	int pas;
	String bio;
	User1(String userid, int pas, String bio){
		this.userid=userid;
		this.pas=pas;
		this.bio=bio;

		System.out.println("Account is updated\n");
	}
	public static void main(String[] args) {
		
		User1 s1=new User1("jeewan",1234,"hi jeewan");

		System.out.println(s1.userid);
		System.out.println(s1.pas);
		System.out.println(s1.bio);

		System.out.println(" \n");

		s1.userid="Guddu";
		s1.pas=321;
		s1.bio="hii guddu";

		System.out.println(s1.userid);
		System.out.println(s1.pas);
		System.out.println(s1.bio);
	}

}