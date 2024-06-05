import java.util.Scanner;

public class ConvertToUpperCase {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String convertedString = convertToUpperCaseWithMethod(inputString);

        System.out.println("Converted string: " + convertedString);

        scanner.close();
    }

    private static String convertToUpperCaseWithMethod(String input) {
        return input.toUpperCase();
    }
}
