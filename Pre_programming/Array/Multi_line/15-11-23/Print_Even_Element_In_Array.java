import java.util.Scanner;

public class Print_Even_Element_In_Array {
     public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        System.out.println("Even elements in the array:");
        printEvenElements(myArray);
    }

    private static void printEvenElements(int[] arr) {
        for (int element : arr) {
            if (isOdd(element)) {
                System.out.print(element + " ");
            }
        }
    }

    private static boolean isOdd(int number) {
        return number % 2 == 0;
    }
}
