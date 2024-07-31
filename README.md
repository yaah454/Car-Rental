# Car-Rental
A simple car rental management system built in Java, designed to handle car rentals and returns for a rental agency. 
# Car Rental System

## Overview

This project is a simple Car Rental System implemented in Java using Object-Oriented Programming (OOP) principles. It includes classes for managing cars, customers, and rental transactions.

## Classes

### 1. Car

Represents a car in the rental system. Key attributes include make, model, year, and rental status.

**Methods:**
- `Car(String make, String model, int year)`: Constructor to initialize a car.
- `rent()`: Marks the car as rented.
- `returnCar()`: Marks the car as returned.
- Getters for `make`, `model`, `year`, and `isRented`.

### 2. Customer

Represents a customer of the rental service.

**Methods:**
- `Customer(String name, String email)`: Constructor to initialize a customer.
- Getters for `name` and `email`.

### 3. RentalAgency

Manages the cars and customers, and handles rental transactions.

**Methods:**
- `RentalAgency(String name)`: Constructor to initialize the rental agency.
- `addCar(Car car)`: Adds a car to the agency's fleet.
- `rentCar(Car car, Customer customer)`: Rents a car to a customer.
- `returnCar(Car car)`: Returns a rented car.
- `displayAvailableCars()`: Displays the list of available cars.

## How to Run

1. Compile all the Java files.
2. Run the `Main` class to start the application.

## Future Improvements

- Add more attributes and methods to handle advanced rental scenarios.
- Implement a database for persistent data storage.
- Introduce a user interface.

## License

This project is licensed under the MIT License.
