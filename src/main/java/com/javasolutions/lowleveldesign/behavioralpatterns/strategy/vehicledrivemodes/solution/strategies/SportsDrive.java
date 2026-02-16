package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies;

// Concrete strategy for sports drive mode
public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
