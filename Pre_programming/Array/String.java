import java.util.Scanner;
public class String {
    public static void main(String[] args) {
        System.out.println("***Start***");

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scr.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scr.nextInt();
        scr.nextLine(); // consume the newline left by scr.nextInt()

        String[][] matrix = new String[rows][columns];

        // create matrix values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value for index [" + i + "][" + j + "]: ");
                matrix[i][j] = scr.nextLine();
            }
        }
        // for each loop
        System.out.println("***For each loop***");
        for (String[] row : matrix) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}