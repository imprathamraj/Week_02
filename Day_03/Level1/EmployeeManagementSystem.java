/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
*/ 
class Employee{
    //static variable
    static String companyName="Capge"; 
    static int totalEmployees = 0;

    //final variable
    private final int employeeID; 
    private String name;
    private String designation;

    //constructer to store data
    public Employee(int employeeID, String name, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation; 
        totalEmployees++;
    } 

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails(Object obj) {
        // Use 'instanceof' to check the object's type
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj; // Typecast to Employee
            System.out.println("Employee Details:");
            System.out.println("ID: " + emp.employeeID);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
            System.out.println("Company: " + companyName);
            System.out.println();
        } else {
            System.out.println("The provided object is not an instance of Employee.");
            System.out.println();
        }
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "vivek sahu", "analyst");

        Employee emp2= new Employee(201,"suraj patel","senior analyst"); 
        //check total employees
        Employee.displayTotalEmployees(); 
        //display the details of employee
        emp1.displayDetails(emp1);
        emp2.displayDetails(emp2);

        //check detail of non employee 
        String str="emp3"; 
        emp1.displayDetails(str);

    }
}