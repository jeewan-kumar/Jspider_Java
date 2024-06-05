import java.util.Scanner;

public class CountConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int consonantCount = countConsonants(inputString);

        System.out.println("Number of consonants in the string: " + consonantCount);

    }

    private static int countConsonants(String input) {
        String lowerCaseInput = input.toLowerCase();

        int count = 0;
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char currentChar = lowerCaseInput.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z' &&
                currentChar != 'a' && currentChar != 'e' && currentChar != 'i' &&
                currentChar != 'o' && currentChar != 'u') {
                count++;
            }
        }

        return count;
    }
}
