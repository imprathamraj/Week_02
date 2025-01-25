//Vehicle Rental System
//Description: Design a system to manage vehicle rentals:
//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
//Add an abstract method calculateRentalCost(int days).
//Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
//Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
//Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
//Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    //constructor to storage

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //getter
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract double calculateRentalCost(int days);
}
//Insurable interface
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    //constructor to initialize
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //overriding to calculate discount
    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }
    //overriding to get insurance information
    @Override
    public String getInsuranceDetails() {
        return "Policy Number: "+ insurancePolicyNumber;
    }
    //overriding to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        return days*getRentalRate();
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //constructor to initialize
    @Override
    public double calculateRentalCost(int days) {

        return days * getRentalRate();
    }

    // 3% of the rental rate as insurance
    @Override
    public double calculateInsurance() {

        return getRentalRate() * 0.03;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    //constructor to initialize
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    //override to calculate rental cost
    @Override
    public double calculateRentalCost(int days) {
        // Additional $50 per day for maintenance
        return days * getRentalRate() + (days * 50);
    }
    //override to calculate insurance
    @Override
    public double calculateInsurance() {
        // 8% of the rental rate as insurance
        return getRentalRate() * 0.08;
    }
    //overriding to get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 100.0, "CARPOL12345"));
        vehicles.add(new Bike("BIKE456", 50.0, "BIKEPOL67890"));
        vehicles.add(new Truck("TRUCK789", 200.0, "TRUCKPOL54321"));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + vehicle.calculateRentalCost(rentalDays));

            // Polymorphism with Insurable interface
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
                System.out.println("*************************************");
            }
            }

    }

}
