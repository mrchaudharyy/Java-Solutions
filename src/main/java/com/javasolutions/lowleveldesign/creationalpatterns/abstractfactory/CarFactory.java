package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 4: Abstract Factory interface
public interface CarFactory {

    // Factory methods
    CarInterior createInterior();

    CarExterior createExterior();

    // Template method that uses all factory methods
    default void produceCompleteVehicle() {

        System.out.println("Starting complete vehicle production...");

        // Create all components
        CarInterior interior = createInterior();
        CarExterior exterior = createExterior();

        // Assemble the vehicle
        interior.addInteriorComponents();
        exterior.addExteriorComponents();

        System.out.println("Vehicle production completed!");
    }
}

