/*Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
 */
package com.inheritance.multilevel;

//base class Order
class Order{
    protected int orderId;
    protected String orderDate;

    //constructor for Order class
    protected Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    //method to show current order status
    public void getOrderStatus(){
        System.out.println("Order Id : " + orderId);
        System.out.println("Order date : " + orderDate);
    }
}

//sub class ShippedOrder of Order class
class ShippedOrder extends Order{
    protected int trackingNumber;

    //constructor for ShippedOrder class
    protected ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Traking number " + trackingNumber);
    }    
}
//sub class DeliveredOrder of ShippedOrder class
class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;

    //constructor for DeliveredOrder class
    protected DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery date : " + deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        //object for DeliveredOrder class
        Order order = new DeliveredOrder(1, "24 Jan 2025", 001, "27 Jan 2025");

        //calling method getOrderStatus
        order.getOrderStatus();
    }    
}
