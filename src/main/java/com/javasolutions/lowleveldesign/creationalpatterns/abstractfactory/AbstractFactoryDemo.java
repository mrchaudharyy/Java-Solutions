package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 7: Client Application
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=====Abstract Factory Design Pattern=====");

        // Get Factory Provider
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();

        // Get Economy Car Factory
        CarFactory economyCar = carFactoryProvider.getFactory(CarType.ECONOMY, "Honda");
        economyCar.produceCompleteVehicle();

        // Get Luxury Car Factory
        CarFactory luxuryCar = carFactoryProvider.getFactory(CarType.LUXURY, "Mercedes");
        luxuryCar.produceCompleteVehicle();

        // Get Premium Car Factory
        CarFactory premiumCar = carFactoryProvider.getFactory(CarType.PREMIUM, "Rolls Royce");
        premiumCar.produceCompleteVehicle();
    }
}
