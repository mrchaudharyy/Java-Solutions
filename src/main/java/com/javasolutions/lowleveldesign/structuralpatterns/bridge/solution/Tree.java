package com.javasolutions.lowleveldesign.structuralpatterns.bridge.solution;

// Step 4: Refined Abstractions (Concrete LivingThings)
public class Tree extends LivingThings {
    public Tree(BreathingProcess breathingProcess) {
        super(breathingProcess);
    }

    @Override
    public void breathe() {
        System.out.print("Tree: ");
        breathingProcess.breathe(); // Operation implemented by Implementor - defines the "HOW"
    }
}
