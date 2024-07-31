package com.mycompany.carrental;
/**
 *
 * @author Pr0xy
 */
import java.util.Scanner;

public class CarRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency agency = new RentalAgency("Best Car Rentals");

        // Add a car to the agency
        System.out.println("Enter the details of the car to add:");
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        
        Car car = new Car(make, model, year);
        agency.addCar(car);

        // Input customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, email);

        // Rent and return the car
        System.out.print("Do you want to rent the car? (yes/no): ");
        String rentChoice = scanner.nextLine();
        if (rentChoice.equalsIgnoreCase("yes")) {
            agency.rentCar(car, customer);
            System.out.println("Car rented successfully.");
        }

        System.out.print("Do you want to return the car? (yes/no): ");
        String returnChoice = scanner.nextLine();
        if (returnChoice.equalsIgnoreCase("yes")) {
            agency.returnCar(car);
            System.out.println("Car returned successfully.");
        }

        // Display available cars
        System.out.println("Available cars:");
        agency.displayAvailableCars();

        scanner.close();
    }
}
