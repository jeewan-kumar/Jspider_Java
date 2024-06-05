// Create a run method which accepts no argument and return nothing.
class Q3_Activity_1{
	public static void run(){
		int i=4;

		switch(i){
		case 1:
			System.out.println("Getting ready to run");
			break;
		case 2:
			System.out.println("Start running");
			break;
		case 3:
			System.out.println("Running at a steady pace");
			break;
		default:
			System.out.println("Finished the run");
			break;

		}		
	}
	public static void main(String[] args) {
		run();
	}
}