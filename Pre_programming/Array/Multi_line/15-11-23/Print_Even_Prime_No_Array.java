import java.util.Scanner;

public class Print_Even_Prime_No_Array {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scr.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            myArray[i] = scr.nextInt();
        }

        System.out.println("Even prime numbers in the array:");
        printEvenPrimes(myArray);
    }

    private static void printEvenPrimes(int[] arr) {
        for (int element : arr) {
            if (isPrime(element) && isEven(element)) {
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

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
}