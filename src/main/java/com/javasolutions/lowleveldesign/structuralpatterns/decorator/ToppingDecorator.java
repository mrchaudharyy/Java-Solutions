package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 3: Define the Abstract Base Decorator
public abstract class ToppingDecorator implements BasePizza {
    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

}
