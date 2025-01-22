package Day_04_Level_02;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String id;
    private List<Course> courses;  // List of courses a student is enrolled in

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Enroll the student in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);  // Enroll the student in the course (association)
    }

    // View all courses the student is enrolled in
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
        System.out.println();
    }
}

class Course {
    private String courseName;
    private List<Student> students;  // List of students enrolled in the course

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Add a student to the course (association)
    public void addStudent(Student student) {
        students.add(student);
    }

    // View all students enrolled in the course
    public void viewStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

class School {
    private String schoolName;
    private List<Student> students;  // List of students in the school (aggregation)

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    // Add a student to the school (aggregation)
    public void addStudent(Student student) {
        students.add(student);
    }

    // View all students in the school
    public void viewStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();
    }
}

public class SchoolDetails {
    public static void main(String[] args) {
        // Create School
        School school = new School("School");

        // Create Students
        Student student1 = new Student("rahul", "S01");
        Student student2 = new Student("Dev", "S02");
        Student student3 = new Student("deva", "S03");

        // Add students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create Courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Students enroll in courses (Association)
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course3);
        student3.enrollInCourse(course2);
        student3.enrollInCourse(course3);

        // Display School and Student details
        school.viewStudents();

        // View Courses enrolled by students
        student1.viewCourses();
        student2.viewCourses();
        student3.viewCourses();

        // View Students enrolled in each course
        course1.viewStudents();
        course2.viewStudents();
        course3.viewStudents();
    }
}
