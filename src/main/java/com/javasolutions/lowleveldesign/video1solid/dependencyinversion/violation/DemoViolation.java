package com.javasolutions.lowleveldesign.video1solid.dependencyinversion.violation;

import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.BluetoothKeyboard;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.BluetoothMouse;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.WiredKeyboard;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.WiredMouse;

public class DemoViolation {
    public static void main(String[] args) {

        // create keyboard and mouse objects
        WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
        WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
        BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

        // create macbook
        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
        macBookWithWiredParts.getKeyboard().getSpecifications();
        macBookWithWiredParts.getMouse().getSpecifications();

        // create macbook with bluetooth keyboard and mouse
        // MacBook macBookWithBluetoothParts = new MacBook(bluetoothKeyboard, bluetoothKeyboard);
        // cannot create macbook with bluetooth keyboard and mouse because
        // macbook depends on wired keyboard and mouse - tight coupling - violation of DIP
    }
}

