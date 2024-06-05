/*
Q2. WAJP TO FIND THE AREAS(By taking user input):
    a) Find the area of cirlce.
    b) Find the area of triangle.
    c) Find the area of rectangle.
    d) Find the area of square.
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("a) Circle");
        System.out.println("b) Triangle");
        System.out.println("c) Rectangle");
        System.out.println("d) Square");
        char choice = scanner.next().charAt(0);

        if (choice == 'a') {
            System.out.print("Enter the radius of the circle (in meters): ");
            double radius = scanner.nextDouble();

            double area = 3.141592653589793238 * radius * radius;

            System.out.println("The area of the circle is " + area + " square meters");
        } else if (choice == 'b') {
            System.out.print("Enter the base of the triangle (in meters): ");
            double base = scanner.nextDouble();

            System.out.print("Enter the height of the triangle (in meters): ");
            double height = scanner.nextDouble();

            double area = 0.5 * base * height;

            System.out.println("The area of the triangle is " + area + " square meters");
        } else if (choice == 'c') {
            System.out.print("Enter the length of the rectangle (in meters): ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width of the rectangle (in meters): ");
            double width = scanner.nextDouble();

            double area = length * width;

            System.out.println("The area of the rectangle is " + area + " square meters");
        } else if (choice == 'd') {
            System.out.print("Enter the length of the side of the square (in meters): ");
            double side = scanner.nextDouble();

            double area = side * side;

            System.out.println("The area of the square is " + area + " square meters");
        } else {
            System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}
