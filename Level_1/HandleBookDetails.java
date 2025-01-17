/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
*/
import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;
    //Constructor
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display book details
    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class HandleBookDetails{
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            //taking input from user
            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter book author: ");
            String author = input.nextLine();

            System.out.print("Enter book price: ");
            double price = input.nextDouble();

            //creating object obj of class Book
            Book obj = new Book(title, author, price);

            //calling method displayBookDetails
            obj.displayBookDetails();

            input.close();
    }
}