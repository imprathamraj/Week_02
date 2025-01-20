/* Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members. */

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    // Method to display details of the postgraduate student
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student = new Student();
        student.rollNumber = 1;
        student.name = "John";
        student.setCGPA(8.5);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);
        System.out.println("CGPA: " + student.getCGPA());

        // Creating an object of PostgraduateStudent
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent();
        postgraduateStudent.rollNumber = 2;
        postgraduateStudent.name = "Jane";
        postgraduateStudent.displayDetails();
    }
}
