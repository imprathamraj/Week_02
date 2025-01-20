/*Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
 */
public class BookDetail {
  public static void main(String[] args) {
    Book b1 = new Book("Let us c ", "Yashwant kantekar", 123);
    // Displaying the Details
    if (b1 instanceof Book) {
      b1.displaydetail();
    }

  }
}

class Book {
  String tittle;
  String author;
  final int isbn;
  static String libraryName = "Learn to unlearn";

  // constructor to intialize variable value
  Book(String tittle, String author, int isbn) {
    this.tittle = tittle;
    this.author = author;
    this.isbn = isbn;

  }

  // static method to print the library name5
  static void displayLibraryName() {
    System.out.println("Library name  : " + libraryName);
  }

  // method to display the detail of the student
  public void displaydetail() {
    System.out.println("Tittle of book : " + tittle);
    System.out.println("Author name : " + author);
    System.out.println("Isbn no : " + isbn);
    displayLibraryName();
  }

}
