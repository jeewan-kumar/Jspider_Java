import java.util.Scanner;

public class Rotate90Left {
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

        // Rotate 90 degrees to the left
        int[][] rotatedMatrix = rotate90Left(matrix);

        // Display the rotated matrix
        System.out.println("Matrix after 90-degree Left Rotation:");
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

    // Method to rotate a matrix 90 degrees to the left
    private static int[][] rotate90Left(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] rotatedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}
