/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
 */
package com.inheritance.assistedproblems;
//super class Vehicle
class  Vehicle{
    protected int maxSpeed;
    protected String fuelType;

    //constructor for Vehicle class
    protected Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //method to display info
    public void displayInfo(){
        System.out.println("Max speed : " + maxSpeed + " Fuel type : " + fuelType);
    }

}
//sub class car
class Car extends Vehicle{
    protected int seatCapacity;

    //constructor for Car class
    protected Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Car - Seat capacity : " + seatCapacity);
        super.displayInfo();
    }
}
// Subclass: Truck
class Truck extends Vehicle {
    private double loadCapacity; // In tons

    // Constructor for Truck class
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck -  Load Capacity: " + loadCapacity + " tons");
        super.displayInfo();
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor for Motorcycle class
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle -  Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        super.displayInfo();
    }
}
public class VehicleandTransportSystem {
    public static void main(String[] args) {

        //creating objects of each class
        Vehicle car = new Car(120,"Petrol", 4);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", false);

        //array to store obj
        Vehicle[] vehicles = {car, truck, motorcycle};

        //using for loop to call method displayinfo for each object
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
