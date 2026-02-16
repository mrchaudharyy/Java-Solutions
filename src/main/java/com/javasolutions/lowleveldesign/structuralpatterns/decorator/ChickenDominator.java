package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 2: Define the Concrete Component
public class ChickenDominator implements BasePizza {
    @Override
    public String getDescription() {
        return "Chicken Dominator Pizza";
    }

    @Override
    public double getCost() {
        return 500.0;
    }
}
