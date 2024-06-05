import java.util.Scanner;

public class Print_Odd_Prime_No_Array {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        System.out.println("Odd prime numbers in the array:");
        printOddPrimes(myArray);
    }

    private static void printOddPrimes(int[] arr) {
        for (int element : arr) {
            if (isPrime(element) && isOdd(element)) {
                System.out.print(element + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
