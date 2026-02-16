package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 3: Concrete Products for Luxury Car Family
public class LuxuryCarInterior implements CarInterior {
    @Override
    public void addInteriorComponents() {
        System.out.println("Adding luxurious interior components for Luxury Car.");
    }
}
