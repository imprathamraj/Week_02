/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
 */
package com.encapsulation;
//base class Employee
abstract class Employee{
    //private fields of Employee class
    private String employeeId;
    private String name;
    private double baseSalary;

    //abstract method
    public abstract double calculateSalary();

    //returning employee basic details
    public void displayDetails() {
        System.out.println("---- Employee Details -----");
        System.out.println("Id - " + employeeId);
        System.out.println("Name - " + name);
        System.out.println("Base Salary - " + baseSalary);
    }

    //Getter methods
    public String getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    //Setter methods
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

}

//creating interface Department with assignDepartment() and getDepartment() methods
interface Department{
    void assignDepartment(String departmentName);
    void getDepartmentDetails();
}

//child class FullTimeEmployee
class FullTimeEmployee extends Employee implements Department{
    //private field of FullTimeEmployee class
    private String departmentName;

    @java.lang.Override
    public double calculateSalary() {
        return getBaseSalary()+2000;
    }
    @java.lang.Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
    @java.lang.Override
    public void getDepartmentDetails() {
        System.out.println("Assigned department - " +departmentName);
    }
}

//Child class PartTimeEmployee
class PartTimeEmployee extends Employee implements Department{
    //private fields of PartTimeEmployee class
    private double workHours;
    private double fixedSalary;
    private String departmentName;

    //Constructor for PartTimeEmployee class
    public PartTimeEmployee(double workHours, double fixedSalary) {
        this.workHours = workHours;
        this.fixedSalary = fixedSalary;
    }
    @java.lang.Override
    public double calculateSalary() {
        return ( getBaseSalary() + (workHours*fixedSalary) );
    }
    @java.lang.Override
    public void assignDepartment(String departmentName){
        this.departmentName = departmentName;
    }
    @java.lang.Override
    public void getDepartmentDetails(){
        System.out.println("Assigned Department - " + departmentName);
    }

}

//main class EmployeeManagementSystem
public class EmployeeManagementSystem {
    public static void main(String[] args){
        //creating object for FulltimeEmployee class
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();

        //setting values
        fullTimeEmployee.setEmployeeId("116");
        fullTimeEmployee.setName( "Pratham Raj" );
        fullTimeEmployee.setBaseSalary(2000);
        fullTimeEmployee.assignDepartment("Full Time Department");

        //getting values
        fullTimeEmployee.displayDetails();
        fullTimeEmployee.getDepartmentDetails();
        fullTimeEmployee.calculateSalary();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());

        //creating object for PartTimeEmployee class
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(5,1000);

        //setting values
        partTimeEmployee.setEmployeeId("210");
        partTimeEmployee.setName( "Suraj Kumar Patel" );
        partTimeEmployee.setBaseSalary(3000);
        partTimeEmployee.assignDepartment("Part Time Department");

        //getting values
        partTimeEmployee.displayDetails();
        partTimeEmployee.getDepartmentDetails();
        partTimeEmployee.calculateSalary();
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}