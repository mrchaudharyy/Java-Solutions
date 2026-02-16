package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example2.solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
        List<EngineVehicle> vehicleList2 = new ArrayList<>();
        vehicleList2.add(new MotorCycle());
        vehicleList2.add(new Car());
        // vehicleList2.add(new Bicycle()); // compile time error - cannot add Bicycle
        for (Vehicle vehicle : vehicleList2) {
            // System.out.println(vehicle.hasEngine()); // compile time error - cannot access hasEngine
        }
    }
}
