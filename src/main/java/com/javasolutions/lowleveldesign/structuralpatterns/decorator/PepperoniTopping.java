package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 4: Define the Concrete Decorators
public class PepperoniTopping extends ToppingDecorator {

    public PepperoniTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}