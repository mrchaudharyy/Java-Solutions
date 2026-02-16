package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 4: Define the Concrete Decorators
public class VeggiesTopping extends ToppingDecorator {

    public VeggiesTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }
}