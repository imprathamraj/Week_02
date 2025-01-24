// Sample Problem 1: Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
package com.inheritance.single;
//super class
class Book{
    private String title; 
    private int publicationYear;
    //constructer to initialize
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    } 
    //method displayInfo() to show details of the book and its author
    void displayInfo(){
    
        System.out.println("Book title is: " + title);
        System.out.println("Book publication year is: " + publicationYear);
    }

    //getter method
    public String getTitle() {
        return title;
    }
    public int getPublicationYear() {
        return publicationYear;
    }  
    
}
//sub class inherits Book parent class
class Author extends Book{
    private String name;
    private String bio;
    // Constructor to initialize Author details along with Book details
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  
        this.name = name;
        this.bio = bio;
    }
    
    //method displayInfo() to show details of the book and its author
    @Override
    void displayInfo(){
        super.displayInfo(); 
        System.out.println("author name is: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Author author1 = new Author("Avatar", 2024, "Unique", "Love to coding");

        // Displaying details of the book and its author
        System.out.println("Book and Author Details:");
        author1.displayInfo();
    }
}