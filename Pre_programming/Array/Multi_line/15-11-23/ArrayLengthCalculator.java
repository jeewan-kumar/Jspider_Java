import java.util.Scanner;

public class ArrayLengthCalculator {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        int arrayLength = getArrayLength(myArray);
        System.out.println("Length of the array: " + arrayLength);
    }

    private static int getArrayLength(int[] arr) {
        return arr.length;
    }
}
