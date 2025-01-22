package Day_04_Level_02;

import java.util.ArrayList;

class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

}

class Library{
    private ArrayList<Book>books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }



}


public class LibraryAndBooks {
    public static void main(String[] args) {
        Book b1=new Book("Power of mind","sam");
        Book b2=new Book("play Game","will");
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to libraries
        library1.addBook(b1);
        library2.addBook(b2);

        // Displaying books in each library
        System.out.println("Books in Library 1:");
        library1.displayBooks();

        System.out.println("\nBooks in Library 2:");
        library2.displayBooks();



    }
}
