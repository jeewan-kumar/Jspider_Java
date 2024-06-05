import java.util.*;

public class Function_Arguments {
    public static void main(String[] args) {
        int marks[] = {98, 99, 100};

        System.out.println("Original Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        update(marks);

        System.out.println("Updated Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
