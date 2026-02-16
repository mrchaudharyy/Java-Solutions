package com.javasolutions.lowleveldesign.structuralpatterns.bridge.problem;

public class Whale extends LivingThings {

    // Breathing Process is tightly coupled to the LivingThings(abstraction)
    @Override
    public void breathe() {
        System.out.println("Whale: Breathes through lungs; Lives in water; Respiratory system: 2 lungs");
        System.out.println("Breathing Process: Inhales Oxygen from the water and Exhales Carbon Dioxide");
    }
}
