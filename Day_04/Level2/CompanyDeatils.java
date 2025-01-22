package Day_04_Level_02;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String id;
    private String designation;

    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void viewEmployeeDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Role: " + designation);
    }
}

class Departments {
    private String dname;
    private List<Employee> employees;  // List of employees within the department

    // When Department is created, employees are created within it
    public Departments(String name) {
        this.dname = name;
        this.employees = new ArrayList<>();
    }

    public String getDname() {
        return dname;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " works in " + getDname() + " Department.");
    }

    public void showDepartmentDetails() {
        System.out.println("All employees in " + getDname() + " Department:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
        System.out.println();
    }
}

class Company {
    private String companyName;
    private List<Departments> departments;  // List of departments in the company

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create and add departments to the company
    public void addDepartment(String departmentName) {
        Departments newDepartment = new Departments(departmentName);
        departments.add(newDepartment);
    }

    public List<Departments> getDepartments() {
        return departments;
    }

    public void showCompanyDetails() {
        System.out.println(companyName + " has the following departments: ");
        for (Departments department : departments) {
            System.out.println(" -" + department.getDname());
        }
        System.out.println();
    }

    public void addEmployeeToDepartment(String departmentName, Employee employee) {
        for (Departments department : departments) {
            if (department.getDname().equals(departmentName)) {
                department.addEmployee(employee);
            }
        }
    }
}

public class CompanyDeatils {
    public static void main(String[] args) {
        Company company = new Company("Capgemini");

        // Adding departments to the company
        company.addDepartment("HR");
        company.addDepartment("Sales");
        company.addDepartment("IT");

        // Show company details with departments
        company.showCompanyDetails();

        // Creating employees
        Employee employee1 = new Employee("Sachin Shukla", "E01", "Software Engineer");
        Employee employee2 = new Employee("Rahul", "E02", "Manager");
        Employee employee3 = new Employee("Aman", "E03", "Senior Analyst");
        Employee employee4 = new Employee("Suraj", "E04", "Intern");
        Employee employee5 = new Employee("Pratham", "E05", "Analyst");

        // Adding employees to specific departments
        company.addEmployeeToDepartment("HR", employee4);
        company.addEmployeeToDepartment("HR", employee2);
        company.addEmployeeToDepartment("Sales", employee5);
        company.addEmployeeToDepartment("Sales", employee1);
        company.addEmployeeToDepartment("IT", employee1);
        company.addEmployeeToDepartment("IT", employee3);

        // Show department details
        for (Departments department : company.getDepartments()) {
            department.showDepartmentDetails();
        }
    }
}
