// Create a drive method which accepts no argument and return nothing.

class Q2_Activity_1{
	public static void drive(){
		int i=1;

		switch(i){
		case 1:
			System.out.println("Start the car");
			break;
		case 2:
			System.out.println("Pressing the gas pedal");
			break;
		case 3:
			System.out.println("Driving forward");
			break;
		default:
			System.out.println("Reached the destination.");
			break;

		}		
	}
	public static void main(String[] args) {
		drive();
	}
}