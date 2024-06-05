import java.util.Scanner;

public class Rotate60Right {
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

        // Rotate 60 degrees to the right
        int[][] rotatedMatrix = rotate60Right(matrix);

        // Display the rotated matrix
        System.out.println("Matrix after 60-degree Right Rotation:");
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

    // Method to rotate a matrix 60 degrees to the right
    private static int[][] rotate60Right(int[][] matrix) {
        // Rotation by 60 degrees is a bit complex and involves shear operations.
        // The implementation depends on the specific requirements.
        // Below is a simplified example that might not produce the correct result for all cases.

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] rotatedMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int newColumn = j + (int) Math.round(i * Math.tan(Math.toRadians(60)));
                int newRow = i;
                if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < columns) {
                    rotatedMatrix[newRow][newColumn] = matrix[i][j];
                }
            }
        }

        return rotatedMatrix;
    }
}
