// Create a game method which accepts no and rerurn nothing.
class Q5_Activity_1{
	public static void game(){
		System.out.println("Welcome to the game");
		System.out.println("Start running");
		
		int a=1;

		if(a==1)
			System.out.println("Your chose first. you win");
		else if(a==2)
			System.out.println("Your chose Second. you lose");
		else
			System.out.println("Invalid choice. The game is over.");	
		
	}
	public static void main(String[] args) {
		game();
	}
 
}