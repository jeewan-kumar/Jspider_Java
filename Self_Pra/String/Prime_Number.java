public class Prime_Number {
    public static void main(String[] args) {
        int start = 2; // Start of the range
        int end = 50; // End of the range

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }       
}
