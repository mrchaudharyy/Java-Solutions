package com.javasolutions.lowleveldesign.structuralpatterns.bridge.problem;

public class Fish extends LivingThings {

    // Breathing Process is tightly coupled to the LivingThings(abstraction)
    @Override
    public void breathe() {
        System.out.println("Fish: Breathes through gills; Lives in water; Respiratory system: 2 gills");
        System.out.println("Breathing Process: Absorbs Oxygen from the water and releases Carbon Dioxide.");
    }
}
