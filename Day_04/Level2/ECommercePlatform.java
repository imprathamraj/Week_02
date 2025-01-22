package Day_04_Level_02;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void viewProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Order {
    private String orderId;
    private Customers customer;
    private List<Product> products;

    public Order(String orderId, Customers customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product " + product.getName() + " added to the order " + orderId);
    }

    public void viewOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in the Order:");
        for (Product product : products) {
            product.viewProductDetails();
        }
        System.out.println();
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

class Customers {
    private String name;
    private String customerId;

    public Customers(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " has placed an order with Order ID: " + order.getOrderId());
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Smartphone", 800);
        Product product3 = new Product("Headphones", 150);

        // Create Customer
        Customers customer = new Customers("Sachin", "C001");

        // Create Order for Customer
        Order order1 = new Order("O001", customer);

        // Add Products to the Order
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);

        // Customer places the order
        customer.placeOrder(order1);

        // View the order details
        order1.viewOrderDetails();

        // Calculate the total price of the order
        System.out.println("Total Order Price: $" + order1.calculateTotal());
    }
}
