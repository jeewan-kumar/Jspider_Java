import java.util.Scanner;

public class ThirdIndexValuePrinter {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        int valueAtThirdIndex = getValueAtThirdIndex(myArray);
        System.out.println("Value at the third index: " + valueAtThirdIndex);
    }

    private static int getValueAtThirdIndex(int[] arr) {
        if (arr.length >= 3) {
            return arr[2];  // Assuming 0-based indexing
        } else {
            System.out.println("Array size is less than 3. Cannot retrieve value at the third index.");
            return -1;  // Return a default value or handle the case accordingly
        }
    }
}
