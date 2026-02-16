package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 5: Concrete Factories
public class LuxuryCarFactory implements CarFactory {
    private final String brand;

    public LuxuryCarFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public CarInterior createInterior() {
        return new LuxuryCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new LuxuryCarExterior();
    }
}
