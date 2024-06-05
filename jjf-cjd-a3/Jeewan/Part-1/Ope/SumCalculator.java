import java.util.Scanner;

class SumCalculator {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = ab.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = ab.nextDouble();

        double sum = num1%10;

        System.out.println("Sum: " + sum);

        //scanner.close();
    }
}
