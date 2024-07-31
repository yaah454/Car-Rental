/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrental;

/**
 *
 * @author Pr0xy
 */
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Car> cars;
    private final List<Customer> customers;

    public RentalAgency(String name) {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer) {
        if (!car.isRented()) {
            car.rent();
            System.out.println(customer.getName() + " rented " + car.getMake() + " " + car.getModel());
        } else {
            System.out.println(car.getMake() + " " + car.getModel() + " is already rented.");
        }
    }

    public void returnCar(Car car) {
        if (car.isRented()) {
            car.returnCar();
            System.out.println(car.getMake() + " " + car.getModel() + " has been returned.");
        } else {
            System.out.println(car.getMake() + " " + car.getModel() + " was not rented.");
        }
    }

    public void displayAvailableCars() {
        System.out.println("Available cars:");
        for (Car car : cars) {
            if (!car.isRented()) {
                System.out.println(car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")");
            }
        }
    }

    Car findCar(String rentMake, String rentModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
