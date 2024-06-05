// Create a sleep method which accepts no and return nothing.
class Q4_Activity_1{
	public static void sleep(){
		int i=4;

		switch(i){
		case 1:
			System.out.println("Getting ready to sleep");
			break;
		case 2:
			System.out.println("Climbing into bed");
			break;
		case 3:
			System.out.println("Drifting off to sleep");
			break;
		default:
			System.out.println("Enjoy a peaceful night's sleep.");
			break;		
	}
	public static void main(String[] args) {
		sleep();
	}
}
