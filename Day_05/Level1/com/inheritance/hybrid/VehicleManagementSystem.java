// // Sample Problem 2: Vehicle Management System with Hybrid Inheritance
// // Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle
//  are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// // Tasks:
// // Define a superclass Vehicle with attributes like maxSpeed and model.
// // Create an interface Refuelable with a method refuel().
// // Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while 
// ElectricVehicle include a charge() method.
// // Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how
//  Java interfaces allow adding multiple behaviors

package com.inheritance.hybrid;

// Superclass
class Vehicle {
    private int maxSpeed;
    private String model;

    // Constructor to initialize
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Getter methods for maxSpeed and model
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
}

// Refuelable interface
interface Refuelable {
    void refuel();
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        //calling parent class constructer
        super(maxSpeed, model);
    }

    // Charge method for ElectricVehicle
    public void charge() {
        System.out.println("Charging " + getModel() + " done!");
    }
}

// PetrolVehicle subclass
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        //calling parent class constructer
        super(maxSpeed, model);
    }

    // Implementation of refuel method for PetrolVehicle
    public void refuel() {
        System.out.println("Refueling " + getModel() + " done!");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model3");
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota");

        // Charging and refueling
        ev.charge();
        pv.refuel();
    }
}
