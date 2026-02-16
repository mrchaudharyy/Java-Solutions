package com.javasolutions.lowleveldesign.video1solid.interfacesegregation.solution;

// GOOD: This class follows ISP
// Now classes only implement what they actually need - Clean implementations
public class Chef implements ChefTasks {

    @Override
    public void prepareFood() {
        System.out.println("Preparing food...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding menu...");
    }
}
