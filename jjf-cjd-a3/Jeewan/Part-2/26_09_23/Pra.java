
class Pra {

	String userid;
	int pas;
	String bio;
	Pra(String userid, int pas, String bio){
		this.userid=userid;
		this.pas=pas;
		this.bio=bio;

		System.out.println("Account is updated\n");
	}

	public void setBio(String bio){
		this.bio=bio;
		System.out.println("bio is updated");
	}

	public void setUserid(String userid){
		this.userid=userid;
		System.out.println("userid updated");
	}

	public void setPas(int pas){
		this.pas=pas;
		System.out.println("password updated");
	}

	public void getBio(){
		System.out.println(bio);
	}

	public void getPas(){
		System.out.println(pas);
	}

	public void getUserid(){
		System.out.println(userid);
	}

	public static void main(String[] args) {
		
		Pra s1=new Pra("jeewan",1234,"hi jeewan");

		s1.getUserid();
		s1.getPas();
		s1.getBio();

		s1.setUserid("guddu");
		s1.setPas(4321);
		s1.setBio("Hii guddu");

		s1.getUserid();
		s1.getPas();
		s1.getBio();

	}
}