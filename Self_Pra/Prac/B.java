public class B {
    public static void main(String[] args) {
        // int n = 5; // You can change this value to adjust the size of the pattern

        // // Loop through rows
        // for (int i = 1; i <= n; i++) {
        //     // Loop through columns
        //     for (int j = 1; j <= n; j++) {
        //         // Print the minimum of the distances to the boundary
        //         System.out.print(Math.min(Math.min(i, j), Math.min(n - i + 1, n - j + 1)));
                
        //         // Print a space after each number (adjust spacing based on your preference)
        //         System.out.print(" ");
        //     }

        //     // Move to the next line for the next row
        //     System.out.println();
        // }
        int n = 5; // You can change this value to adjust the size of the pattern

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                // Determine the minimum distance to the boundary
                int minDistance = i;
                if (j < minDistance) {
                    minDistance = j;
                }
                if (n - i + 1 < minDistance) {
                    minDistance = n - i + 1;
                }
                if (n - j + 1 < minDistance) {
                    minDistance = n - j + 1;
                }
                
                // Print the minimum distance
                System.out.print(minDistance);

                // Print a space after each number (adjust spacing based on your preference)
                System.out.print(" ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
