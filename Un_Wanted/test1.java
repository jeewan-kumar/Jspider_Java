import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice; // Changed the variable name from 'i' to 'choice'

        
            System.out.println("***WELCOME TO THE RESTAURANT***");
            System.out.println("***MENU ITEMS ARE:***");
            System.out.println("1::Breakfast");
            System.out.println("2::Fast Food");
            System.out.println("3::Lunch");
            System.out.println("4::Dinner");
            System.out.println("5::Snacks"); // Corrected item name
            System.out.println("6::Ice Creams");
            System.out.println("7::CHOOSE ANYTHING");
            System.out.println("8::EXIT");

            choice = scan.nextInt(); // Corrected the variable name from 'i' to 'choice'

            switch (choice) {
                case 1:
                    displayBreakfast(); // Corrected method name
                    break;
                case 2:
                    displayFastFood(); // Corrected method name
                    break;
                case 3:
                    displayLunch();
                    break;
                case 4:
                    displayDinner();
                    break;
                case 5:
                    displaySnacks(); // Corrected method name
                    break;
                case 6:
                    displayIceCreams();
                    break;
                case 7:
                    System.out.println("CHOOSE ANYTHING ELSE"); // Corrected message
                    break;
                case 8:
                    System.out.println("***THANKS FOR VISITING***");
                    break;
                default:
                    System.out.println("Invalid number, please try again");
            }

    }
}
