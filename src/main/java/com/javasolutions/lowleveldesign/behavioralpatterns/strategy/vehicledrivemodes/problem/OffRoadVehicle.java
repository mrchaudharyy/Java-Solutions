package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.vehicledrivemodes.problem;

public class OffRoadVehicle extends Vehicle {

    // Overriding the drive method to provide specific behavior
    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Sports"); // code duplication
        // As sports drive mode is not available in the parent class, we need to override it and implement
        // the specific behavior for all new vehicle types that require sports drive mode
    }

}
