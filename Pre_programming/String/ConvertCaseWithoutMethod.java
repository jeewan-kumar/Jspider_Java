import java.util.Scanner;

public class ConvertCaseWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String convertedString = convertToLowerCaseWithoutMethod(inputString);

        System.out.println("Converted string: " + convertedString);

    }

    private static String convertToLowerCaseWithoutMethod(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
    
                charArray[i] = (char) (charArray[i] + ('a' - 'A'));
            }
        }

        return new String(charArray);
    }
}
