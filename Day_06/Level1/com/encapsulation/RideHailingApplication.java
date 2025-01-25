/* Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
 */

package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    //method to get vehicle details
    public String getVehicleDetails(){
        return "Vehicle id: "+vehicleId + ", Driver Name: "+driverName+", Rate per Km: "+ratePerKm;
    }
    //abstract method to calculate fare
    public abstract double calculateFare(double distance);

}
interface GPS {
    String getCurrentLocation();
  
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS{
    private String currentLocation;
    //constructor to initialize
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    //override to get current location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    //override to get updated location
    @Override
    public void updateLocation(String newLocation) {
    this.currentLocation = newLocation;
    }
    //override to calculate fare
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
class Bike extends Vehicle implements  GPS{
    private String currentLocation;
    //constructor to initialize
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    //override to get current location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    //override to get updated location
    @Override
    public void updateLocation(String newLocation) {
    this.currentLocation= newLocation;
    }
    //override to get fare according to bike
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
class Auto extends Vehicle implements GPS{
    private String currentLocation;
    //constructor to initialize
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }
    //override to get current location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    //override to get updated location
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation= newLocation;
    }
    //override to get fare according to bike
    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
public class RideHailingApplication {
    public static void main(String[] args) {
        // Create a list to store different types of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        // Add vehicles to the list
        vehicles.add(new Car("car1", "Vivek Sahu", 25.0));
        vehicles.add(new Bike("bike121", "Suraj Patel", 30.0));
        vehicles.add(new Auto("auto121", "Pratham Raj", 10.0));

        // Set initial locations using the setter method
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Bhopal");
            }
        }

        // Distance for which fare needs to be calculated
        double distance = 20.0;

        // Iterate through the list of vehicles
        for (Vehicle vehicle : vehicles) {
            // Display vehicle details
            System.out.println(vehicle.getVehicleDetails());

            // Display current location
            if (vehicle instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            }

            // Calculate and display fare
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println("***********************************************************************************");
        }

        // Update location for vehicles
        System.out.println("\n--- Updating Locations ---");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof GPS) {
                ((GPS) vehicle).updateLocation("Indore");
                System.out.println(vehicle.getVehicleDetails() + " -> Updated Location: " + ((GPS) vehicle).getCurrentLocation());
            }
        }
    }
}