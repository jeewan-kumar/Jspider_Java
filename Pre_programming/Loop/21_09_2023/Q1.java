/*
Q1. WAJP TO OBTAIN THE TIME,SPEED AND DISTANCE TRAVELLED BY THE CAR IF REQIRMENT:
    
    a) Take distance and time from user and find the speed.
    b) Take speed and time from user and find the distance.
    c) Take distance and speed from user and find the time.
    (Note: display result with proper measurment unit)
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("a) Calculate speed");
        System.out.println("b) Calculate distance");
        System.out.println("c) Calculate time");
        char choice = scanner.next().charAt(0);

        if (choice == 'a') {
            System.out.print("Enter the distance (in kilometers): ");
            double distance = scanner.nextDouble();

            System.out.print("Enter the time (in hours): ");
            double time = scanner.nextDouble();

            double speed = distance / time;

            System.out.println("The speed of the car is " + speed + " km/h");
        } else if (choice == 'b') {
            System.out.print("Enter the speed (in km/h): ");
            double speed = scanner.nextDouble();

            System.out.print("Enter the time (in hours): ");
            double time = scanner.nextDouble();

            double distance = speed * time;

            System.out.println("The distance traveled by the car is " + distance + " kilometers");
        } else if (choice == 'c') {
            System.out.print("Enter the distance (in kilometers): ");
            double distance = scanner.nextDouble();

            System.out.print("Enter the speed (in km/h): ");
            double speed = scanner.nextDouble();

            double time = distance / speed;

            System.out.println("The time taken to travel the distance is " + time + " hours");
        } else {
            System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}
