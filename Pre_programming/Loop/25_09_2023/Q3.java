/*
1 2 3
A B C
4 5 6
D E F
*/
public class Q3 {
    public static void main(String[] args) {
        int n = 4; // Adjust n for the size of the pattern
        int count = 1;
        char letter = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + " ");
                    count++;
                } else {
                    System.out.print(letter + " ");
                    letter++;
                }
            }
            System.out.println();
        }
    }
}
