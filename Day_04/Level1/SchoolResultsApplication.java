import java.util.ArrayList;
class Subject {
    private String name; 
    private double score; 

    // Constructor
    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

// Class representing a Student
class Student {
    private String name; // Student name
    private int id; // Student ID
    private ArrayList<Subject> subjects; 

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>();
    }

    // Add a subject
    public void addSubject(String subjectName, double score) {
        subjects.add(new Subject(subjectName, score));
    }

    // Get all subjects
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    // Get student's name
    public String getName() {
        return name;
    }
}

// Class for Grade Calculation
class GradeCalculator {
    // Method to calculate the final grade
    public double calculateGrade(Student student) {
        ArrayList<Subject> subjects = student.getSubjects();
        double totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore(); // Sum up all scores
        }
        return totalScore / subjects.size(); // Return the average score
    }
}

// Main class to simulate the process
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a Student
        Student john = new Student("John", 1);

        // Add subjects and their scores
        john.addSubject("Maths", 90);
        john.addSubject("Science", 85);

        // Calculate grades
        GradeCalculator gradeCalculator = new GradeCalculator();
        double finalGrade = gradeCalculator.calculateGrade(john);

        // Output the final grade
        System.out.println("Final Grade for " + john.getName() + ": " + finalGrade);
    }
}