import java.util.Scanner;

public class SmallestElementFinder {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        int smallestElement = findSmallestElement(myArray);
        System.out.println("Smallest element in the array: " + smallestElement);
    }

    private static int findSmallestElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty. Cannot find the smallest element.");
            return Integer.MAX_VALUE; // Return a default value or handle the case accordingly
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
