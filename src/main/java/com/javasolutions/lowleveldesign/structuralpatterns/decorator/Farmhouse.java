package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 2: Define the Concrete Component
public class Farmhouse implements BasePizza {
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
