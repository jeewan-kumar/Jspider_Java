/*
  *
 **
***
 **
  *
*/

class Hw_Q6 {
    public static void main(String[] args) {
        int n = 3; // Set the number of rows

        // Loop for the upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // Loop to print spaces before the stars
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print a space
            }
            // Loop to print the stars based on the current row number
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Move to the next line after each row
        }

        // Loop for the lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Loop to print spaces before the stars
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print a space
            }
            // Loop to print the stars based on the current row number
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print an asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
