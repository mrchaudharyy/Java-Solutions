package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example2.solution;

public class Car extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
