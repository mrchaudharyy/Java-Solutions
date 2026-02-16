package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.vehicledrivemodes.problem;

public class Vehicle {

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Normal");
    }
}
