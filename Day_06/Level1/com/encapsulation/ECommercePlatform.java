/* E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product. */

package com.encapsulation;
// Parent class Product
abstract class Product {
    private String productId;
    private String productName;
    private double productPrice;

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Display product details using getter methods
    public void displayDetails() {
        System.out.println("-----Product Detail ------");
        System.out.println("ID - " + getProductId());
        System.out.println("Name - " + getProductName());
        System.out.println("Price - " + getProductPrice());
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    // Setter methods
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}

// Taxable interface
interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

// Electronics class implementing Product and Taxable
class Electronics extends Product implements Taxable {
    private double productTax;
    private double productDiscount;

    public Electronics(double productTax, double productDiscount) {
        this.productTax = productTax;
        this.productDiscount = productDiscount;
    }

    @Override
    public double calculateDiscount() {
        return getProductPrice() * (productDiscount / 100);
    }

    @Override
    public double calculateTax() {
        return getProductPrice() * (productTax / 100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on product: " + calculateTax());
    }

    public double calculateFinalPrice() {
        return getProductPrice() + calculateTax() - calculateDiscount();
    }
}

// Clothing class implementing Product and Taxable
class Clothing extends Product implements Taxable {
    private double productTax;
    private double productDiscount;

    public Clothing(double productTax, double productDiscount) {
        this.productTax = productTax;
        this.productDiscount = productDiscount;
    }

    @Override
    public double calculateDiscount() {
        return getProductPrice() * (productDiscount / 100);
    }

    @Override
    public double calculateTax() {
        return getProductPrice() * (productTax / 100);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on product: " + calculateTax());
    }

    public double calculateFinalPrice() {
        return getProductPrice() + calculateTax() - calculateDiscount();
    }
}

// Groceries class implementing Product
class Groceries extends Product {
    private double productDiscount;

    public Groceries(double productDiscount) {
        this.productDiscount = productDiscount;
    }

    @Override
    public double calculateDiscount() {
        return getProductPrice() * (productDiscount / 100);
    }

    public double calculateFinalPrice() {
        return getProductPrice() - calculateDiscount();
    }
}

// Main class ECommercePlatform
public class ECommercePlatform {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(10, 5);  // 10% tax, 5% discount
        electronics.setProductId("111");
        electronics.setProductName("Television");
        electronics.setProductPrice(1000);

        Clothing clothing = new Clothing(15, 10);  // 15% tax, 10% discount
        clothing.setProductId("112");
        clothing.setProductName("Jeans");
        clothing.setProductPrice(50);

        Groceries groceries = new Groceries(5);  // 5% discount on groceries
        groceries.setProductId("113");
        groceries.setProductName("Apple");
        groceries.setProductPrice(3);

        // Display product details for all items
        electronics.displayDetails();
        System.out.println("Discount: " + electronics.calculateDiscount());
        electronics.getTaxDetails();
        System.out.println("Final Price: " + electronics.calculateFinalPrice());
        System.out.println();

        clothing.displayDetails();
        System.out.println("Discount: " + clothing.calculateDiscount());
        clothing.getTaxDetails();
        System.out.println("Final Price: " + clothing.calculateFinalPrice());
        System.out.println();

        groceries.displayDetails();
        System.out.println("Discount: " + groceries.calculateDiscount());
        System.out.println("Final Price: " + groceries.calculateFinalPrice());
    }
}
