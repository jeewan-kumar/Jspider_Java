import java.util.Scanner;

public class ConvertToUpperCaseWithoutMethod {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String convertedString = convertToUpperCaseWithoutMethod(inputString);

        System.out.println("Converted string: " + convertedString);

        scanner.close();
    }

    private static String convertToUpperCaseWithoutMethod(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - ('a' - 'A'));
            }
        }

        return new String(charArray);
    }
}
