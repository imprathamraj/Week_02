/*
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
*/
import java.util.Scanner;

class MovieTicket {
    // Fields
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0; // Unassigned initially
        this.price = 0.0;    // Default price is set to 0
    }

    // Creating method to book a ticket
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Creating method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber == 0) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the movie name: ");
        String movieName = input.nextLine();

        // Creating an instance of MovieTicket
        MovieTicket ticket = new MovieTicket(movieName);

        // Displaying menu for user
        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Booking a ticket
                    System.out.print("Enter seat number: ");
                    int seatNumber = input.nextInt();
                    System.out.print("Enter ticket price: ");
                    double price = input.nextDouble();
                    ticket.bookTicket(seatNumber, price);
                    break;
                case 2:
                    // Displaying ticket details
                    ticket.displayTicketDetails();
                    break;
                case 3:
                    // Exiting the program
                    System.out.println("Exiting the system. Thank you!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
