package com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility;

// Low-level module - concrete implementation
public class BluetoothKeyboard implements Keyboard {
    private final String connectionType;
    private final String company;
    private final String modelVersion;
    private final String color;

    public BluetoothKeyboard(String connectionType, String company, String modelVersion, String color) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelVersion = modelVersion;
        this.color = color;
    }

    public void getSpecifications() {
        System.out.println("===> Bluetooth Keyboard");
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Company: " + company);
        System.out.println("Model Version: " + modelVersion);
        System.out.println("Color: " + color);
    }
}
