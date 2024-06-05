// WAJP to read integer data, decimal data, string data, character data, with respect to and object laptop. 

import java.util.*;

class Q6{
    public static void main(String[] args) {
        
        Scanner scr=new Scanner(System.in);

        System.out.print("Enter the serial number: ");
        int serialNumber = scr.nextInt();

        System.out.print("Enter the price: ");
        double price = scr.nextDouble();

        System.out.print("Enter the brand: ");
        char brand = scr.next().charAt(0);

        System.out.print("Enter the condition (New or Used): ");
        String condition = scr.next();

        System.out.println("\n*****Laptop Information*****");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Condition: " + condition);
    }
}