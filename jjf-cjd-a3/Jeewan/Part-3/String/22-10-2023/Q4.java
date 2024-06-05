//Wajp count and print how many vowels are there

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);

        System.out.println("Number of vowel characters: " + vowelCount);

    }

    private static int countVowels(String input) {
        String vowels = "AEIOUaeiou";  // Define the vowels
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                count++;
            }
        }

        return count;
    }
}
