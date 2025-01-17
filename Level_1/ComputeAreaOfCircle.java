/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
*/
import java.util.Scanner;

class AreaOfCircle{
	// Fields
	double radius;
	
	//constructor of AreaOfCircle class
	AreaOfCircle(double radius){
		this.radius = radius;
	}
	
	//method for compute Area Of Cicle
	double computeAreaOfCicle(){
		return Math.PI * Math.pow(radius, 2);
	}

	//method for displaying Area of circle
	public void displayAreaOfCircle(){ 
		double areaOfCircle= computeAreaOfCicle();
		System.out.println("Area of circle : " + areaOfCircle);
	}
}
		
public class ComputeAreaOfCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter radius of circle : ");
		double radius = input.nextDouble();
		
		AreaOfCircle obj = new AreaOfCircle(radius);
		obj.displayAreaOfCircle();
	}
}