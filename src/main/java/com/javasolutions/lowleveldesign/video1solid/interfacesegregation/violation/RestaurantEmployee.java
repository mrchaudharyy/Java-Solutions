package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.violation;

// BAD: This class violates ISP
// This is a fat interface
// One large interface forcing all implementers to define unused methods
public interface RestaurantEmployee {

    void prepareFood();

    void decideMenu();

    void serveFoodAndDrinks();

    void takeOrder();

    void cleanTheKitchen();
}
