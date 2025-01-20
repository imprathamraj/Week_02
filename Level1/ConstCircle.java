/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
*/
class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class ConstCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Uses default constructor
        Circle c2 = new Circle(5.0); // Uses parameterized constructor

        System.out.println("Circle 1 - Radius: " + c1.getRadius() + ", Area: " + c1.calculateArea() + ", Circumference: " + c1.calculateCircumference());
        System.out.println("Circle 2 - Radius: " + c2.getRadius() + ", Area: " + c2.calculateArea() + ", Circumference: " + c2.calculateCircumference());
    }
}
