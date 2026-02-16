package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 2: Define the Concrete Component
public class TandooriPaneerDelight implements BasePizza {
    @Override
    public String getDescription() {
        return "Tandoori Paneer Delight Pizza";
    }

    @Override
    public double getCost() {
        return 400.0;
    }
}
