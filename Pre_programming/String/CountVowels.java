import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);

        System.out.println("Number of vowels in the string: " + vowelCount);

    }

    private static int countVowels(String input) {
        String lowerCaseInput = input.toLowerCase();

        int count = 0;
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char currentChar = lowerCaseInput.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }

        return count;
    }
}
