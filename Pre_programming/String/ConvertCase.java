import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String convertedString = convertToLowerCase(inputString);

        System.out.println("Converted LowerCase string: " + convertedString);

    }

    private static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }
}
