/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
*/
import java.util.Scanner;
class Item{
    String itemCode;
    String itemName;
    double price;

    //Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //method to display items details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    //method to calculate costing
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class TrackInventoryOfItems{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter item code: ");
        String itemCode = input.nextLine();

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter item price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        //creating item object of Item class
        Item item = new Item(itemCode, itemName, price);

        //calling method displayItemsDetails
        item.displayItemDetails();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: " + totalCost);
        input.close();
    }
}