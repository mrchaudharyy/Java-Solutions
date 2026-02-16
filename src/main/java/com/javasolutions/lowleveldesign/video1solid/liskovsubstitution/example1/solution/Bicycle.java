package com.javasolutions.lowleveldesign.video1solid.liskovsubstitution.example1.solution;

// GOOD: Following LSP
// Subclass of Bike - implements all Bike class behavior
// As Bicycles do not have engines, we need not implement Engine interface
public class Bicycle extends Bike {

    String brand;
    Boolean hasGears;
    int speed;

    public Bicycle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }
}