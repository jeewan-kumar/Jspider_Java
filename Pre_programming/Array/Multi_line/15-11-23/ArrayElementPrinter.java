import java.util.Scanner;

public class ArrayElementPrinter {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        printArrayElements(myArray);
    }

    private static void printArrayElements(int[] arr) {
        System.out.println("Elements in the array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
