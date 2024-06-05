/*
*****
 ***
  *
*/

class Hw_Q5 {
    public static void main(String[] args) {
        // Set the number of rows
        int n = 3; 

        // Outer loop for the number of rows
        for (int i = 0; i < n; i++) { 
        	// Loop to print spaces before the stars
            for (int j = 0; j < i; j++) { 
                System.out.print(" ");
            }
            // Loop to print the stars
            for (int k = 0; k < 2 * (n - i) - 1; k++) { 
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println(); 
        }
    }
}
