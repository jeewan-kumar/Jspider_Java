import java.util.Scanner;

public class Accept_an_array_of_integers_and_prints_the_sum_of_all_the_elements {
     public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        printSumOfArray(myArray);
    }

    private static void printSumOfArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }    
}
