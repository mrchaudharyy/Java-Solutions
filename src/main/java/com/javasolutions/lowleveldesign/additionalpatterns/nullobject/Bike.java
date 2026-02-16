package com.javasolutions.lowleveldesign.additionalpatterns.nullobject;

public class Bike extends Vehicle {
    private String model;
    private String color;
    private int seatingCapacity;
    private int fuelTankCapacity;
    private boolean isAvailableForTestDrive;

    public Bike(String model, String color, int fuelTankCapacity) {
        this.model = model;
        this.color = color;
        this.fuelTankCapacity = fuelTankCapacity;
        this.isAvailableForTestDrive = false;
        this.seatingCapacity = 2;
    }

    @Override
    public void start() {
        System.out.println("Bike is started and moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public boolean isAvailableForTestDrive() {
        return isAvailableForTestDrive;
    }
}