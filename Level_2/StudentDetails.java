/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade
 and provide a way to display all information.*/ 
class Student{
    String stuName; 
	int rollNumber;  

	int stuMarks; 
	
	//constructor to save details of studnet
	Student(int rollNumber, String stuName, int stuMarks){
		this.stuName = stuName; 
		this.rollNumber= rollNumber; 
		this.stuMarks = stuMarks;
	}
	
	
        // Method to calculate grade
    public char calculateGrade() {
        if (stuMarks >= 90) {
            return 'A';
        } else if (stuMarks >= 75) {
            return 'B';
        } else if (stuMarks >= 50) {
            return 'C';
        } else {
            return 'F'; // Fail
        }
    }

    // Method to display student's details and grade
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.println("Student Name: " + stuName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + stuMarks);
        System.out.println("Grade: " + grade);
    }
	
}
public class StudentDetails{
    public static void main(String[] args) {
        Student st = new Student(116, "Pratham Raj", 80); 
        st.displayDetails();
    }
}