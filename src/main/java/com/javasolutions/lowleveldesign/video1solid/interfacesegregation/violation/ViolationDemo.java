package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.violation;

// Usage example - showing the problem
public class ViolationDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        // Works fine
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        // These will throw exceptions
        waiter.prepareFood(); // forced implementation
        waiter.decideMenu(); // forced implementation
        waiter.cleanTheKitchen(); // forced implementation
    }
}
