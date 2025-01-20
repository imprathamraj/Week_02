/*Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
*/
import java.util.Scanner;

// Class Product created
class Product {
    // Static variable discount created
    public static double discount = 0.0;
    private static int idCounter = 100;

    public final String productName;
    private final double price;
    private final int quantity;
    public final int productID;

    // Using this keyword to initialize productName, price, and quantity in the constructor
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = idCounter++;
    }

    // Static method updateDiscount created
    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    public static int priceAfterDiscount(double price, double discount) {
        return (int) (price - (price * discount / 100));
    }
    // Validate if product1 is an instance of Product class
    public void display(){
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: " + priceAfterDiscount(this.price, discount));
            System.out.println("Quantity: " + this.quantity);
        }
        else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter the product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

        //Creating an object product1 of the Product class
        Product product1 = new Product(productName, price, quantity);

        //Displaying the product details
        System.out.println("Product details before discount update: " + Product.discount);
        product1.display();

        //Taking input from the user
        System.out.println("Enter the discount percentage: ");
        double discount = sc.nextDouble();

        //Updating the discount percentage
        Product.updateDiscount(discount);

        //Displaying the product details after discount update
        System.out.println("Product details after discount update: " + Product.discount);
        product1.display();
    }
}
