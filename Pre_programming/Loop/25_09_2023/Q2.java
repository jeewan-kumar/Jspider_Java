/*
*  *  *
*     *
*  *  *
*/
/*
public class Q2 {
    public static void main(String[] args) {
        int n = 3; // Adjust n for the size of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

*/

public class Q2 {
    public static void main(String[] args) {
        int n = 4; // Adjust n for the size of the pattern
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