package com.javasolutions.lowleveldesign.creationalpatterns.abstractfactory;

// Step 2: Concrete Products for Economy Car Family
public class EconomyCarExterior implements CarExterior {
    @Override
    public void addExteriorComponents() {
        System.out.println("Adding basic exterior components for Economy Car.");
    }
}
