/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
*/
import java.util.Scanner;

// Class Definition
class EmployeeDetails {

    // Fields (Attributes)
    private String name;
    private String id;
    private double salary;

    // Constructor
    public EmployeeDetails(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }
}

// Main class for Employee
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.println("Enter employee name : ");
        String name = input.nextLine();

        System.out.println("Enter employee id : ");
        String id = input.nextLine();

        System.out.println("Enter employee salary : ");
        double salary = input.nextDouble();

        // Creating EmployeeDetails object
        EmployeeDetails obj = new EmployeeDetails(name, id, salary);

        // Displaying details of employee
        obj.displayEmployeeDetails();
    }
}
