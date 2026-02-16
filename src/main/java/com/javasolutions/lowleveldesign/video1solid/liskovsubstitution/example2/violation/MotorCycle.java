package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example2.violation;

public class MotorCycle extends Vehicle {

    public String getSpecifications() {
        return "MotorCycle has " + this.getNumberOfWheels() + " wheels and has engine: " + this.hasEngine();
    }
}
