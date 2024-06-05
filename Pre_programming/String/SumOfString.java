import java.util.Scanner;

public class SumOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int sum = calculateSumOfString(inputString);

        System.out.println("Sum of ASCII values of characters in the string: " + sum);

    }

    private static int calculateSumOfString(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            sum += (int) currentChar;
        }
        return sum;
    }
}
