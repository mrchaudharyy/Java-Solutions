package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example2.violation;

public class Car extends Vehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    public String getSpecifications() {
        return "Car has " + this.getNumberOfWheels() + " wheels and has engine: " + this.hasEngine();
    }
}
