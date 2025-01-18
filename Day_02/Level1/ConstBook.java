/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
 */
/* Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors. */
class Book {
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        title = "Book 1";
        author = "Author 1";
        price = 100.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Displaying the details of the book
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class ConstBook {
    public static void main(String[] args) {
        //Creating objects of the Book class
        Book b1 = new Book();
        Book b2 = new Book("Book 2", "Author 2", 200.0);
        
        //Displaying the details of the book
        System.out.println("Details of Book 1:");
        b1.display();
        System.out.println("\nDetails of Book 2:");
        b2.display();
    }
}