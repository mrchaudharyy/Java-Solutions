package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 3: Concrete Products for Luxury Car Family
public class LuxuryCarExterior implements CarExterior {
    @Override
    public void addExteriorComponents() {
        System.out.println("Adding luxurious exterior components for Luxury Car.");
    }
}
