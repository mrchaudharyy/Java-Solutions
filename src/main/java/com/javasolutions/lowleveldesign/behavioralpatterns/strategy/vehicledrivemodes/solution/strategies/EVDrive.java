package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies;

// Concrete strategy for electric drive mode
public class EVDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric");
    }
}
