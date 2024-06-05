/*
*  *  *
0  1  0
*  *  *
0  1  0
*  *  *
*/
/*
public class Q4 {
    public static void main(String[] args) {
        int n = 5; // Adjust n for the size of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 || i == 2 || i == 4)) {
                    System.out.print("* ");
                } else {
                	if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }                    
                }
            }
            System.out.println();
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        int n = 5; // Adjust n for the number of rows

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
*/

public class Q4 {
    public static void main(String[] args) {
        int n = 5; // Adjust n for the size of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                if ((i == 1 || i == 3 || i == 5)) {
                    System.out.print("* ");
                } else {
                	if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}