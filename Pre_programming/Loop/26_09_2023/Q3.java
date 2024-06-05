/*
*****
*   *
*   *
*   *
*****
*/

public class Q3 {
    public static void main(String[] args) {
        int n = 5; // Adjust n for the size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}