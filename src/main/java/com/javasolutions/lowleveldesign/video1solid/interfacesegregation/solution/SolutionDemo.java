package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.solution;

// Usage example - Following ISP
public class SolutionDemo {
    public static void main(String[] args) {
        // Create the objects
        // Now classes only implement what they actually support
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        // Use the objects
        // These work perfectly - no forced implementations
        chef.prepareFood();
        chef.decideMenu();
        // These work perfectly - no forced implementations
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();
    }
}
