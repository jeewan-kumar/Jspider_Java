import java.util.*;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int marks[] = new int[length];

        // Input values for the array
        System.out.println("Enter " + length + " values for the array:");
        for (int i = 0; i < length; i++) {
            marks[i] = scanner.nextInt();
        }

        System.out.println("Original Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        update(marks);

        System.out.println("Updated Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        scanner.close();
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
