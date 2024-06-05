import java.util.Scanner;

public class Rotate180Right {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][columns];

        // Input values for the matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Rotate 180 degrees to the right
        int[][] rotatedMatrix = rotate180Right(matrix);

        // Display the rotated matrix
        System.out.println("Matrix after 180-degree Right Rotation:");
        displayMatrix(rotatedMatrix);
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Method to rotate a matrix 180 degrees to the right
    private static int[][] rotate180Right(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] rotatedMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedMatrix[i][j] = matrix[rows - 1 - i][columns - 1 - j];
            }
        }

        return rotatedMatrix;
    }
}
