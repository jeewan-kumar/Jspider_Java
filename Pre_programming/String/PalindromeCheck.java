import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String input) {
 
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleanInput.length() - 1;

        while (start < end) {
            if (cleanInput.charAt(start) != cleanInput.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
