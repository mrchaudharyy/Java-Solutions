package com.javasolutions.lowleveldesign.structuralpatterns.bridge.problem;

public class Dog extends LivingThings {

    // Breathing Process is tightly coupled to the LivingThings(abstraction)
    @Override
    public void breathe() {
        System.out.println("Dog: Breathes through its nose; Lives on land; Respiratory system: 2 lungs");
        System.out.println("Breathing Process: Inhales Oxygen from the air and Exhales Carbon Dioxide.");
    }
}
