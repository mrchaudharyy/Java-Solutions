package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.vehicledrivemodes.problem;

public class SportsVehicle extends Vehicle {

    // Overriding the drive method to provide specific behavior for sports vehicles
    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Sports");
    }
}
