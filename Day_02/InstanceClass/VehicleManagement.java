/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.*/
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000.0; 

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    //static method to update the registration fee for all vehicles
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        // Create vehicle instances
        Vehicle vehicle1 = new Vehicle("Pratham Raj", "Car");
        Vehicle vehicle2 = new Vehicle("Raj Pratham", "Aeroplane");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();


        // Update the registration fee
        Vehicle.updateRegistrationFee(1200.0);

        // Display vehicle details after updating registration fee
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
