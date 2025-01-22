import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;          
    private double pricePerUnit;  
    private double quantity;      

    // Constructor
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Calculate total price for this product
    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    // Get product details
    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }
}

// Class representing a Customer
class Customer {
    private String name;              
    private List<Product> products;   

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Add a product to the customer's list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get all purchased products
    public List<Product> getProducts() {
        return products;
    }

    // Get the customer's name
    public String getName() {
        return name;
    }
}

// Class for bill generation
class BillGenerator {
    // Calculate and generate the total bill for a customer
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice(); 
        }
        return total;
    }
}

// Main class to simulate the system
public class GroceryStoreBillGenerationApplication {
    public static void main(String[] args) {
        // Create a customer
        Customer alice = new Customer("Alice");

        // Add products purchased by the customer
        alice.addProduct(new Product("Apples", 3.0, 2.0)); 
        alice.addProduct(new Product("Milk", 2.0, 1.0));  

        // Generate the bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(alice);

        // Display the bill
        System.out.println("Customer: " + alice.getName());
        System.out.println("Purchased Products:");
        for (Product product : alice.getProducts()) {
            System.out.println("- " + product.getName() + ": " + product.getQuantity() + 
                " units at $" + product.getPricePerUnit() + " each");
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}