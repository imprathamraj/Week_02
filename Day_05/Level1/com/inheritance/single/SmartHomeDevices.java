// Sample Problem 2: Smart Home Devices
// Description: Create a hierarchy for a smart home system where Device
// is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.
// Goal: Understand single inheritance by adding specific attributes to a subclass,
// keeping the superclass general. -->

package com.inheritance.single;
//superclass
class Device {
    private String deviceId;
    private String status;  

    // Constructor to initialize Device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    
    //getting the device value
    public String getDeviceId() {
        return deviceId;
    }


    public String getStatus() {
        return status;
    }


    // Displaying status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor to initialize Thermostat details
    public Thermostat(String deviceId, String status, double temperatureSetting) {
         // Call the constructor of the superclass (Device)
        super(deviceId, status); 
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() 
    @Override
    public void displayStatus() {
        // Call the superclass method to display device details
        super.displayStatus();  
        System.out.println("Temperature Setting: " + temperatureSetting + "*C");
    }
}

public class SmartHomeDevices{
    public static void main(String[] args) {
        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat("123wxyz", "ON", 22.5);

        // Displaying the status of the thermostat
        System.out.println("Thermostat Status:");
        thermostat.displayStatus();
    }

}
