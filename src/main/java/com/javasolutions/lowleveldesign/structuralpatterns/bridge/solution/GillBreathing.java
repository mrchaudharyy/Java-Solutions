package com.javasolutions.lowleveldesign.structuralpatterns.bridge.solution;

// Step 2: Concrete Implementor (various breathing processes)
public class GillBreathing implements BreathingProcess {
    @Override
    public void breathe() {
        System.out.println("Breathing through gills.");
    }
}
