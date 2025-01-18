/*Problem 2: Book Library System
Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
 */

class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    // Method to display details of the eBook
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating an object of Book
        Book book = new Book();
        book.ISBN = "123-456-789";
        book.title = "Java Programming";
        book.setAuthor("John Doe");
        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.getAuthor());

        // Creating an object of EBook
        EBook ebook = new EBook();
        ebook.ISBN = "987-654-321";
        ebook.title = "Advanced Java";
        ebook.displayDetails();
    }
}