class Product {
    String productName;
    double price; 
    static int totalProducts = 0; 

    // Constructor to initialize product with default values
    Product() {
        this.productName = "unknown";
        this.price = 0;
        totalProducts++; 
    }

    // Constructor to initialize product with specific values
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
    }

    // static method to display the total number of products created
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Create product instances
        Product product1 = new Product("Chocolate", 50);
        Product product2 = new Product("Mango", 300);
        
        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display total products created
        Product.displayTotalProducts();
    }
}
