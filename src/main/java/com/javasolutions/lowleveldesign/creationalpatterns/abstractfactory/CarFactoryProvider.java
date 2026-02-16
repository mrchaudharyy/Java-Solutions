package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

enum CarType {
    ECONOMY, LUXURY, PREMIUM
}

// Step 6: Factory Provider
public class CarFactoryProvider {
    public CarFactory getFactory(CarType type, String brand) {
        switch (type) {
            case ECONOMY:
                return new EconomyCarFactory(brand);
            case PREMIUM:
            case LUXURY:
                return new LuxuryCarFactory(brand);
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}