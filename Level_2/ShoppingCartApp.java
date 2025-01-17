/*
Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or 
removing items and calculating the total cost.

*/
import java.util.Scanner;
//class to store object of this type
class ItemCart {
    String itemName;
    double price;
    int quantity;
    //constucter to assign
    public ItemCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    //cart item store
    public static ItemCart[] cartItems = new ItemCart[10]; 
    static int itemCount = 0;

    // Add an item to the cart
    public  void addItem(String itemName, double price, int quantity) {
        if (itemCount >= cartItems.length) {
            System.out.println("Cart is full; we cannot add this item.");
            return;
        }
        //store the values
        cartItems[itemCount++] = new ItemCart(itemName, price, quantity);
        System.out.println("Item added successfully.");
    }

    //Remove an item from the cart by name
    public  void removeItem(String itemName) {
        boolean itemFound = false;

        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equalsIgnoreCase(itemName)) {
                // Shift the remaining items to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; 
                itemCount--;
                itemFound = true;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!itemFound) {
            System.out.println("Item '" + itemName + "' not found in the cart.");
        }
    }

    // Display the total cost of all items in the cart
    public  void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotal();
        }
        System.out.println("Total cost of all items in the cart: "+ totalCost);
    }

    // Display the items in the cart
    public  void displayCart() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cartItems[i].itemName+" " +cartItems[i].price+" "+ cartItems[i].quantity);
            }
        }
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) { 
        ShoppingCart sc=new ShoppingCart();
        sc.addItem("Laptop", 1000, 1);
        sc.addItem("Smartphone", 700, 2);

        // Display cart contents
        sc.displayCart();

        // Display total cost
        sc.displayTotalCost();

        // Remove an item
        sc.removeItem("Laptop");

        // Display cart contents after removal
        sc.displayCart();

        // Display total cost after removal
        sc.displayTotalCost();
    }
}
