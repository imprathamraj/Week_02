/*Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
 */
public class StudentDetail {
  public static void main(String[] args) {
    Student s1 = new Student("Suraj", 11, 'B');
    if (s1 instanceof Student) {
      // displaying detail
      System.out.println("Detail of Student : ");
      s1.displayStudentDetail();
    }
    Student s2 = new Student("pratham ", 12, 'A');
    // This control flow showing the total No student get increased When student s2
    // introduced
    if (s2 instanceof Student) {
      // displaying detail
      System.out.println("Detail of Student : ");
      s2.displayStudentDetail();
    }

  }
}

class Student {
  static String universityName = "RGPV";
  static int totalNoStudent = 0;
  final int rollNo;
  String name;
  char grade;

  // constructor for intilizing object values
  Student(String name, int rollNo, char grade) {
    this.name = name;
    this.rollNo = rollNo;
    this.grade = grade;
    totalNoStudent++;
  }

  // this static method is used to display the static varible detail
  static void displayTotalStudents() {
    System.out.println("Total no of student : " + totalNoStudent);
  }

  // This method is used to display the details of student
  void displayStudentDetail() {
    System.out.println("Name of the student : " + name);
    System.out.println("Roll no of student : " + rollNo);
    System.out.println("grade of student : " + grade);
    displayTotalStudents();
  }

}
