//Online Food Delivery System
//Description: Create an online food delivery system:
//Define an abstract class FoodItem with fields like itemName, price, and quantity.
//Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
//Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
//Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
//Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    //constructor tto initialize
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    //abstract method
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    //getter
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Discountable {
    // Apply discount on total price
    void applyDiscount(double discountRate);

    // Get discount-related information
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    private double totalPrice;
    private double discount;
    //constructor to initialize
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }

    //overriding to calculate total price
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    //method to apply discount
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    //overriding to get discount details
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    //overriding to get item details
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price: " + totalPrice;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;
    // Additional charge for non-veg items
    private static final double NON_VEG_SURCHARGE = 50;

    //constructor to initialize
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }
    //implementing FodItem and overriding them
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_SURCHARGE) * getQuantity();
    }
    //method to calculate and apply discount
    @Override
    public void applyDiscount(double discountRate) {
        discount = totalPrice * discountRate;
        totalPrice -= discount;
    }
    //method to get discount details
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + ", Final Price: " + totalPrice;
    }
    //method to get item details
    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Total Price (with surcharge): " + totalPrice;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Chole Kulche", 200, 2));
        order.add(new NonVegItem("Chicken Curry", 300, 1));
        order.add(new VegItem("Dosa", 70, 3));
        order.add(new NonVegItem("Mutton", 400, 2));

        // Process the order and apply discounts
        double discountRate = 0.20; // 20% discount
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(discountRate);
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("********************************************************************");
        }
    }
}
