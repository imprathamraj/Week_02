/*Problem 2: Online Course Management
Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
*/
class Course{
    private String courseName;
    private int duration; 
    private double fee;
    static String instituteName = "Unknown Institute"; 

    // Constructor to initialize course details
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration: " + this.duration + " months");
        System.out.println("Fee: " + this.fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Getter and Setter methods
    public String getCourseName() {
        return courseName;
    }

    // Getter and Setter methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter and Setter methods
    public int getDuration() {
        return duration;
    }

    // Getter and Setter methods
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getter and Setter methods
    public double getFee() {
        return fee;
    }
    
    // Getter and Setter methods
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Getter and Setter methods
    public static String getInstituteName() {
        return instituteName;
    }

    // Getter and Setter methods
    public static void setInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Create course instances
        Course course1 = new Course("Java Programming", 6, 1500);
        Course course2 = new Course("Web Development", 4, 1200);

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("Unacademy");

        // Display course details after updating institute name
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
