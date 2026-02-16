package com.javasolutions.lowleveldesign.video1solid.dependencyinversion.solution;

import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.BluetoothKeyboard;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.BluetoothMouse;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.WiredKeyboard;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.WiredMouse;

// Usage example - following DIP
public class DemoSolution {
    public static void main(String[] args) {
        // create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // Can easily create macbooks with different combinations of keyboard and mouse

        // create macbook with wired keyboard and mouse
        MacBook macBookWithWiredParts = new MacBook(wiredMouse, wiredKeyboard);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        // create macbook with bluetooth keyboard and mouse
        MacBook macBookWithBluetoothParts = new MacBook(bluetoothMouse, bluetoothKeyboard);
        macBookWithBluetoothParts.getKeyboard().getSpecifications();
        macBookWithBluetoothParts.getMouse().getSpecifications();
    }
}
