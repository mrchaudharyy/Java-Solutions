package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.solution;

// GOOD: This class follows ISP
// Now classes only implement what they actually need - Clean implementations
public class Waiter implements WaiterTasks {
    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }
}
