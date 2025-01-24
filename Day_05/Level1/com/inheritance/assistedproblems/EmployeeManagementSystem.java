/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods. */

package com.inheritance.assistedproblems;
//super class Employee
class Employee{
    protected String empName;
    protected int empId;
    protected double empSalary;

    //constructor
    protected Employee(String empName, int empId, double empSalary ){
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }
    //method to diaplay details
    public void displayDetails(){
        System.out.println("Employee name : " + empName);
        System.out.println("Employee id : " + empId);
        System.out.println("Employee salary : " + empSalary);
    }
}
//sub class Manager
class Manager extends Employee{
    protected int teamSize;

    //constructor for Manager class
    public Manager(String empName, int empId, double empSalary, int teamSize){
        super(empName, empId, empSalary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Manager name : " + empName);
        System.out.println("Manager id : " + empId);
        System.out.println("Manager salary : " + empSalary);
        System.out.println("Manager team size* : " + teamSize);
    }
}
//sub class Developer
class Developer extends Employee{
    protected String programmingLanguage;

    //constructor for Developer class
    public Developer(String empName, int empId, double empSalary, String programmingLanguage){
        super(empName, empId, empSalary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        System.out.println("Developer name : " + empName);
        System.out.println("Developer id : " + empId);
        System.out.println("Developer salary : " + empSalary);
        System.out.println("Developer programming language* : " + programmingLanguage);
    }
}
//sub class Intern
class Intern extends Employee{
    protected int internshipDuration;
    //constructor for Intern class
    public Intern(String empName, int empId, double empSalary, int internshipDuration){
        super(empName, empId, empSalary);
        this.internshipDuration = internshipDuration;
    }
    @Override
    public void displayDetails(){
        System.out.println("Intern name : " + empName);
        System.out.println("Intern id : " + empId);
        System.out.println("Intern salary : " + empSalary);
        System.out.println("Internship duration : " + internshipDuration);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args){
        //creating objects
        Employee manager = new Manager("Pratham Raj", 016, 425000, 15);
        Employee developer = new Developer("Suraj Kumar Patel", 230, 575000, "Java");
        Employee intern = new Intern("Rishika Bisht", 053, 400000, 5);
        
        //calling method
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}