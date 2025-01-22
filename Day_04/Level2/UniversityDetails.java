package Day_04_Level_02;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private String facultyId;

    public Faculty(String name, String facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    // Method to view Faculty details
    public void viewFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println();
    }
}

class Department {
    private String deptName;
    private List<Faculty> facultyMembers;

    public Department(String deptName) {
        this.deptName = deptName;
        this.facultyMembers = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    // Method to add faculty to the department (Aggregation)
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        System.out.println(faculty.getName() + " added to " + deptName + " department.");
    }

    // Method to view all faculties in the department
    public void viewFacultyInDepartment() {
        System.out.println("Faculty members in " + deptName + " Department:");
        for (Faculty faculty : facultyMembers) {
            faculty.viewFacultyDetails();
        }
    }
}

class University {
    private String universityName;
    private List<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    // Method to add departments to the university (Composition)
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println(department.getDeptName() + " department added to " + universityName);
    }

    // Method to view all departments in the university
    public void viewDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDeptName());
        }
        System.out.println();
    }

    // Method to delete the university (also deletes all departments)
    public void deleteUniversity() {
        departments.clear();
        System.out.println("All departments have been deleted from " + universityName + " university.");
    }
}

public class UniversityDetails {
    public static void main(String[] args) {
        // Create Faculty members
        Faculty faculty1 = new Faculty("Dr. Rajesh", "F001");
        Faculty faculty2 = new Faculty("Dr. sanjay", "F002");
        Faculty faculty3 = new Faculty("Dr. sachin", "F003");

        // Create Departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mechanical Engineering");

        // Add Faculty to departments (Aggregation)
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept2.addFaculty(faculty3);

        // Create University
        University university = new University("TIT College");

        // Add Departments to the University (Composition)
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // View Departments and Faculty
        university.viewDepartments();
        dept1.viewFacultyInDepartment();
        dept2.viewFacultyInDepartment();

        // Delete the university, which also deletes all departments (Composition)
        university.deleteUniversity();

        // Attempt to view departments after deletion
        university.viewDepartments();
    }
}
