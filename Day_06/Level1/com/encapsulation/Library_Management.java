/*Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/
package com.encapsulation;

// abstract class blueprint for LibraryItem
abstract class LibraryItem {
    int itemId;
    String tittle;
    String author;

    // Constructor
    public LibraryItem(int itemId, String tittle, String author) {
        this.itemId = itemId;
        this.tittle = tittle;
        this.author = author;
    }

    // Defining getter and setter


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // abstract method who,s implementation will be given by extending class
    abstract int getLoanDuration();

    // method to display detail of Items
    void getItemDetails(){
        System.out.println("ItemId : "+itemId);
        System.out.println("Tittle  : "+tittle);
        System.out.println("Author : "+author);
    }
}
// interface class
interface Reservable {
    // Abstract method
   void reserveItem(String browPersonName);
   boolean checkAvailability();
}
// Book class implementing details of LibraryItem
class Book extends LibraryItem implements Reservable{

    // instance variable used for keeping trace whether item is available or niot
   private boolean isAvailable;
   //constructor
   public Book(int itemId, String title, String author) {
       super(itemId, title, author);
       this.isAvailable = true;
   }
   // overriding the  method of abstract class
   @Override
   int getLoanDuration(){
       // here it represent number of days
       return 7;
   }
   // overriding the method of interface
   @Override
   public void reserveItem(String browPersonName){
       if(isAvailable){
           isAvailable=false;
           System.out.println("The person reserved Book : "+browPersonName);
       }
       else{
           System.out.println("Magazine is currently unavailable");
       }
   }
   // overriding the method of interface
   @Override
   public boolean checkAvailability(){
       return isAvailable;
   }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
  //constructor
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }
    // overriding the  method of abstract class
    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be borrowed for 7 days
    }
    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved Magazine : " + browPersonName);
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // constructor
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // overriding the  method of abstract class
    @Override
    public int getLoanDuration() {
        // Dvd borrowed for 2 days
        return 2;
    }

    // overriding the method of interface
    @Override
    public void reserveItem(String browPersonName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The person reserved DVD: " + browPersonName);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }
    // overriding the method of interface
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}


// main class
public class Library_Management {
    public static void main(String[] args) {
        // creating object of each class with referance of abstract class
        LibraryItem book = new Book(1,"Let us c ","Yashvant katenkar");
        LibraryItem magazine = new Magazine(2," Times of India","Pratham Raj");
        LibraryItem dvd = new DVD(3,"Blue ray","Suraj");


        // array for story object of class
        LibraryItem [] library = {book,magazine,dvd};

        // for loop used for iterating over object
        for(LibraryItem libraryItem : library){
            libraryItem.getItemDetails();
            // checking whether a object implements the Reservable interface or not
            if(libraryItem instanceof Reservable){
                Reservable reservable= (Reservable) libraryItem;
                System.out.println("Available : "+reservable.checkAvailability());
                reservable.reserveItem("Suraj");
                System.out.println("Available after reservation : "+reservable.checkAvailability());
            }
            System.out.println("***************************************************");
        }
    }
}
