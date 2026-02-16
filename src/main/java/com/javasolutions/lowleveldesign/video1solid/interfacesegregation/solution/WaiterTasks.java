package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.solution;

// GOOD: This follows ISP - Multiple focused interfaces following ISP
public interface WaiterTasks {
    void serveFoodAndDrinks();

    void takeOrder();
}