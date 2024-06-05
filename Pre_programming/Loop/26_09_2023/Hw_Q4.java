/*
  *
 ***
*****
*/
/*
class Hw_Q4 {
    public static void main(String[] args) {
        int n = 3; // Set the number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces before the first half of the stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print the first half of the stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
*/
class Hw_Q4 {
    public static void main(String[] args) {
        int n = 3; // Set the number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces before the first half of the stars
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            
            // Print the first half of the stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}