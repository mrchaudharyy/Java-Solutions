package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example1.violation;

// BAD: This design violates LSP
public interface Bike {

    void turnOnEngine();

    void turnOffEngine();

    void accelerate();

    void applyBrakes();
}