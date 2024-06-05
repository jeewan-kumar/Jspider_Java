/*
*  *  *
&  &  &
@  @  @
*/

public class Q5 {
    public static void main(String[] args) {
        int n = 3; // Adjust n for the number of rows
        char s1 = '*'; // First symbol
        char s2 = '&'; // Second symbol
        char s3 = '@'; // Third symbol

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print(s1 + " ");
                } else if (i == 1) {
                    System.out.print(s2 + " ");
                } else {
                    System.out.print(s3 + " ");
                }
            }
            System.out.println();
        }
    }
}
