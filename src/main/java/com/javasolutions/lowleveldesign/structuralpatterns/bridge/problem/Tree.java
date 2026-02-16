package com.javasolutions.lowleveldesign.structuralpatterns.bridge.problem;

public class Tree extends LivingThings {

    // Breathing Process is tightly coupled to the LivingThings(abstraction)
    @Override
    public void breathe() {
        System.out.println("Tree: Breathes through leaves; Lives on land; Respiratory system: Leaves");
        System.out.println("Breathing Process: Inhales Carbon Dioxide and Exhales Oxygen as a result of photosynthesis.");
    }
}