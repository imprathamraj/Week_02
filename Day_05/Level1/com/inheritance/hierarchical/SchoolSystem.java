/*Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics. */

package com.inheritance.hierarchical;
// defineing the parent class 
class Person {
  String name;
  int age;
  String role;

  // constructor of the parent class
  Person(String name, int age, String role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }

  // display method to display the name age role
  void displayRole() {
    System.out.println("Role : " + role);
    System.out.println("name of the " + role + " : " + name);
    System.out.println("Age of the " + role + " : " + age);

  }

}

// Teacher class extends the properties of parent class
class Teacher extends Person {
  String subject;

  // constructor of Teacher class used to intialize the value
  Teacher(String name, int age, String role, String subject) {
    super(name, age, role);
    this.subject = subject;
  }

  // displaying details of Teacher
  void displayRole() {
    super.displayRole();

    System.out.println("Subject of the Teacher : " + subject);
    System.out.println("----------------------------------");
  }

}

// Student class extends the properties of parent class
class Student extends Person {
  String grade;

  // constructor of Student class used to intialize the value
  Student(String name, int age, String role, String grade) {
    super(name, age, role);
    this.grade = grade;
  }

  // displayRole method to display the data of student
  void displayRole() {
    super.displayRole();
    System.out.println("Grade of the Student : " + grade);
    System.out.println("----------------------------------");
  }

}

// Staff class extends the properties of parent class
class Staff extends Person {
  String department;

  // constructor
  Staff(String name, int age, String role, String department) {
    super(name, age, role);
    this.department = department;
  }

  // displaying the detail of staff member
  void displayRole() {
    super.displayRole();
    System.out.println("Department : " + department);
    System.out.println("----------------------------------");
  }

}

// Main class
public class SchoolSystem {
  public static void main(String[] args) {

    // objects of classes
    Teacher teacher = new Teacher("suraj", 35, "Teacher", "Mathematics");
    Student student = new Student("vivek", 16, "student", "10th Grade");
    Staff staff = new Staff("pratham", 40, "staff", "Administration");

    // displaying details
    teacher.displayRole();
    student.displayRole();
    staff.displayRole();
  }
}
