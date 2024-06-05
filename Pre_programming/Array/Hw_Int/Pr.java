package Hw_Int;

public class Pr {
            public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            System.out.println("Prime numbers in the array:");
            printPrimes(myArray);
    
            int primeCount = countPrimes(myArray);
    
            System.out.println("Number of prime numbers in the array: " + primeCount);
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
    
        private static void printPrimes(int[] arr) {
            for (int element : arr) {
                if (isPrime(element)) {
                    System.out.println(element);
                }
            }
        }
    
        private static int countPrimes(int[] arr) {
            int count = 0;
            for (int element : arr) {
                if (isPrime(element)) {
                    count++;
                }
            }
            return count;
        } 
    
}
