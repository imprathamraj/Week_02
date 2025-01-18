/*Problem 4: Employee Records
Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
*/
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    // Method to display details of the manager
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee employee = new Employee();
        employee.employeeID = 101;
        employee.department = "HR";
        employee.setSalary(50000.0);
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Department: " + employee.department);
        System.out.println("Salary: " + employee.getSalary());

        // Creating an object of Manager
        Manager manager = new Manager();
        manager.employeeID = 102;
        manager.department = "Finance";
        manager.displayDetails();
    }
}
