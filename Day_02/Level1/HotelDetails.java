/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. 
Use default, parameterized, and copy constructors to initialize bookings.*/
class Hotel{
    private String guestName;
    private String roomType;
    private int nights;
    // Default constructor
    public Hotel() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    //paramaterized constructer
    public Hotel(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public Hotel(Hotel other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getter methods
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setter methods
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to calculate the total price 
    public double calculateTotalPrice() {
        double pricePerNight;
        switch (roomType.toLowerCase()) {
            case "deluxe":
                pricePerNight = 150.0;
                break;
            case "suite":
                pricePerNight = 250.0;
                break;
            case "standard":
            default:
                pricePerNight = 100.0;
                break;
        }
        return pricePerNight * nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Price: $" + calculateTotalPrice());
        System.out.println();
    }
       
}

public class HotelDetails{
    public static void main(String[] args) {
        Hotel h1 =new Hotel(); 

        //display detail
        h1.displayBookingDetails();

        //new object to store details
        Hotel h2= new Hotel("vivek", "standard", 2); 
        //display detail
        h2.displayBookingDetails();
        //copy the h2 value to h3 
        Hotel h3 = new Hotel(h2); 

        //set the name according to the getter and setter
        h3.setGuestName("Bhai");
        h3.setNights(5);
        h3.setRoomType("deluxe");

        //display detail
        h3.displayBookingDetails();
    }
}