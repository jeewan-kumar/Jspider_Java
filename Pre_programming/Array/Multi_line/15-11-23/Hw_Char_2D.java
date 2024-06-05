import java.util.Scanner;

public class Hw_Char_2D {
    public static void main(String[] args) {
        System.out.println("***Start***");

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scr.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scr.nextInt();

        char[][] matrix = new char[rows][columns];

        // create matrix values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value for index [" + i + "][" + j + "]: ");
                matrix[i][j] = scr.next().charAt(0);
            }
        }

        // Access each element by the references
        System.out.println("***Access each element by the references***");
        System.out.println("Index [1][1]: " + matrix[1][1]);
        System.out.println("Index [0][0]: " + matrix[0][0]);

        // for loop forward
        System.out.println("***for loop forward***");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Index [" + i + "][" + j + "] value: " + matrix[i][j]);
            }
        }

        // for loop backward
        System.out.println("***for loop backward***");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 0; j--) {
                System.out.println("Index [" + i + "][" + j + "] value: " + matrix[i][j]);
            }
        }

        // for each loop
        System.out.println("***For each loop***");
        for (char[] row : matrix) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("****End the program****");
    }
}
