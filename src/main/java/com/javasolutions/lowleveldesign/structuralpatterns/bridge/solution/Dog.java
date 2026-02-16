package com.javasolutions.lowleveldesign.structuralpatterns.bridge.solution;

//Step 4: Refined Abstractions (Concrete LivingThings)
public class Dog extends LivingThings {

    public Dog(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breathe() {
        System.out.print("Dog: ");
        breathingProcess.breathe(); // Operation implemented by Implementor - defines the "HOW"
    }
}
