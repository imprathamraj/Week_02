// Sample Problem 1: Restaurant Management System with Hybrid Inheritance
// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses.
// Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface,
// each providing a unique implementation of performDuties().
// Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to 
//the same objects.

package com.inheritance.hybrid;
// Superclass
class Person {
    private String name;
    private int id;
    
    // Constructor to initialize
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters for name and id
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

// Worker Interface
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println(getName() + " is cooking.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving food.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating Chef and Waiter objects
        Chef chef = new Chef("Vivek", 1);
        Waiter waiter = new Waiter("Alisha", 2);
        
        // Performing duties
        chef.performDuties();
        waiter.performDuties();
    }
}
