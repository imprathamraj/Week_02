/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes. */

package com.inheritance.assistedproblems;

//superclass
class Animal{
    //Fields
    protected String name;
    protected int age;

    //constructor
    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Method
    public void makeSound(){
        System.out.println(name + " is of " + age + " animal Make Sound");
    }
}
//sub class Dog
class Dog extends Animal{
    //Constructor for Dog class
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is of " + age + " years and says bhaow bhaow");
    }
}
//sub class Cat
class Cat extends Animal{
    //constructor for Cat class
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " is of " + age + " years and says meow meow");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        //Creating object of class Dog and Cat
        Animal dog = new Dog("Tommy", 4);
        Animal cat = new Cat("Softy",3);

        //calling method
        dog.makeSound();
        cat.makeSound();
    }
}