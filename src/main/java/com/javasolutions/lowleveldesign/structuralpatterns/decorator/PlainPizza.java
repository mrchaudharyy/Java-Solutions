package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 2: Define the Concrete Component
class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}