package com.javasolutions.lowleveldesign.structuralpatterns.facade;

// Client Usage
public class ECommerceApp {
    public static void main(String[] args) {
        System.out.println("====== Facade Design Pattern Demo ======");
        // Client interacts with a simple Facade, not with all subsystems.
        OrderFacade orderFacade = new OrderFacade();

        // Place order with one call to Facade
        orderFacade.placeOrder("MacBook Pro", "Credit Card");

        // Place another order with one call to Facade
        orderFacade.placeOrder("Cricket Bat", "UPI");
    }
}
