import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (n): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (k): ");
        double power = scanner.nextInt();

        double result = 1;

        if (power >= 0) {
        for (int i = 0; i < power; i++) {
                result *= base;
            }
            
        } else {
            System.out.println("power should be a non-negative integer.");
            return;
        }
        System.out.println(base + "^" + power + " = " + result);
    }
}
