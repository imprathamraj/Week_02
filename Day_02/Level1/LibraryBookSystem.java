/*Library Book System: Create a Book class with attributes title, author, price, and availability.
 Implement a method to borrow a book.*/
 class BookD{
    String title;
    String author;
    double price;
    boolean isAvailability;

    // Default constructor
    public BookD() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailability = true; 
    }

    // Parameterized constructor
    public BookD(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailability = true;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailability) {
            isAvailability = false;
            System.out.println("You have successfully borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailability = true;
        System.out.println("Thank you for returning the book: " + title);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailability ? "Available" : "Unavailable"));
        System.out.println();
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        // Creating a default book
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // Creating a specific book
        BookD book1 = new BookD("Programming Using Java", "R. N. Sons", 1122);
        book1.displayDetails();

        // Borrowing the book
        book1.borrowBook();

        //Availability should now be unavailable
        book1.displayDetails();

        // Trying to borrow the book again shows unavailable
        book1.borrowBook();

        // Returning the book
        book1.returnBook();

        //Availability should be available again
        book1.displayDetails(); 
    }
}
