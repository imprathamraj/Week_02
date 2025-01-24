/*Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system. */
package com.inheritance.multilevel;

//base class
class Course{
    protected String courseName;
    protected int courseDuration;

    //constructor for Course class
    public Course(String courseName, int courseDuration){
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    // Method to display course details
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + courseDuration + " hours");
    }
}

//subclass
class OnlineCourse extends Course{
    protected String platform;
    protected String isRecorded;

    //constructor for OnlineCourse class
    public OnlineCourse(String courseName, int courseDuration, String platform, String isRecorded){
        super(courseName, courseDuration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform : " + platform);
        System.out.println("Is course recorded : " + isRecorded);
    }
}

//subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse{
    protected double fee;
    protected double discount;

    //constructor for PaidOnlineCourse class
    public PaidOnlineCourse(String courseName, int courseDuration, String platform, String isRecorded, double fee, double discount){
        super(courseName, courseDuration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Fee : " + fee);
        System.out.println("Discount : " + discount);
        System.out.println("Discounted fee : " + discountedFee);
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        //creating object for PaidOnlineCourse class
        Course c = new PaidOnlineCourse("JAVA FULLSTACK", 02, "YouTube", "Yes", 2999, 15);

        //calling method
        c.displayInfo();
    }
}
