/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the
 rental details and calculate total cost.*/
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRatePerDay;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
        this.rentalRatePerDay = 50.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double rentalRatePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * rentalRatePerDay;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate Per Day: $" + rentalRatePerDay);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Car Rental:");
        defaultRental.displayRentalDetails();

        // Using the parameterized constructor
        CarRental customRental = new CarRental("vivek sahu", "BMW", 10, 100.0);
        System.out.println("Custom Car Rental:");
        customRental.displayRentalDetails();

        // Modifying rental details using setter methods
        customRental.setCustomerName("Suraj");
        customRental.setCarModel("Auto");
        customRental.setRentalDays(22);
        customRental.setRentalRatePerDay(150);

        System.out.println("Updated Car Rental:");
        customRental.displayRentalDetails();
    }
}
