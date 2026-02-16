package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example2.violation;

import java.util.ArrayList;
import java.util.List;

// Usage example - Violation of Liskov Substitution
public class ViolationDemo {
    public static void main(String[] args) {
        // Happy Flow
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }
        // Add Bicycle - Violation of LSP
        List<Vehicle> vehicleList2 = new ArrayList<>();
        vehicleList2.add(new MotorCycle());
        vehicleList2.add(new Car());
        vehicleList2.add(new Bicycle());
        for (Vehicle vehicle : vehicleList2) {
            System.out.println(vehicle.hasEngine().toString()); // throws NPE
            // Client code will break for Bicycle
        }
    }
}