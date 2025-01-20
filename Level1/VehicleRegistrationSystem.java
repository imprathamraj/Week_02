/*Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details*/
class Vehicle {
    // Static variable
    private static double registrationFee = 5000.0;

    // Instance variables
    private final String registrationNumber; 
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this'
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    public static void setRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display details
    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj; 
            System.out.println("Vehicle Registration Details:");
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The provided object is not an instance of the Vehicle class.");
        } 
        System.out.println();
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle car = new Vehicle("MH12AB1234", "Vivek", "Car");
        Vehicle aeroplane = new Vehicle("MH14CD5678", "Suraj", "Aeroplane");

        // Display initial details
        car.displayDetails(car);
        aeroplane.displayDetails(aeroplane);

        // Modify and display details
        System.out.println("\nUpdating vehicle details...");
        car.setOwnerName("Vivek Kumar Sahu");
        car.setVehicleType("SUV");
        car.displayDetails(car);

        // Update registration fee
        System.out.println("\nUpdating registration fee...");
        Vehicle.setRegistrationFee(6000.0);

        // Display updated details
        System.out.println("\nUpdated Vehicle Details:");
        car.displayDetails(car);
        aeroplane.displayDetails(aeroplane);
    }
}
