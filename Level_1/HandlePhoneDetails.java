/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
*/
import java.util.Scanner;
class MobilePhone{
    String brand;
    String model;
    double price;

    //constructor
    MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayPhoneDetails(){
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
    }
}
public class HandlePhoneDetails{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter brand name : ");
        String brand = input.nextLine();

        System.out.println("Enter model name : ");
        String model = input.nextLine();

        System.out.println("Enter price  : ");
        double price = input.nextInt();

        MobilePhone obj = new MobilePhone(brand, model, price);
        obj.displayPhoneDetails();
    }
}