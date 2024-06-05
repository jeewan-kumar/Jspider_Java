import java.util.Scanner;

public class How_Many_No_Inside_The_Array {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the size of index: ");
        int i = scr.nextInt();

        int[] n = new int[i];

        int i1 = 0;
        for (int value : n) {
            System.out.print("Index value [" + i1 + "]: ");
            n[i1] = scr.nextInt();
            i1++;
        }
       
        System.out.println("Prime numbers in the array:");
        printPrimes(n);
        int primeCount = countPrimes(n);
        System.out.println("\nNumber of prime numbers in the array: " + primeCount);
    }

    private static void printPrimes(int[] i) {
        for (int element : i) {
            if (isPrime(element)) {
                System.out.print(element + " ");
            }
        }
    }
    private static int countPrimes(int[] i) {
        int primeCount = 0;
        for (int element : i) {
            if (isPrime(element)) {
                primeCount++;
            }
        }
        return primeCount;
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
}
