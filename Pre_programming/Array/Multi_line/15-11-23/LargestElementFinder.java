import java.util.Scanner;

public class LargestElementFinder {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        int largestElement = findLargestElement(myArray);
        System.out.println("Largest element in the array: " + largestElement);
    }

    private static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty. Cannot find the largest element.");
            return Integer.MIN_VALUE; // Return a default value or handle the case accordingly
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
