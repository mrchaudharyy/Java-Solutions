package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Client - Demonstration
public class Client {
    public static void main(String[] args) {
        System.out.println("##### Command Pattern: Solution Demo #####");

        // Create Receiver
        AirConditioner airConditioner = new AirConditioner();

        // Create Invoker
        RemoteController remoteObj = new RemoteController();

        // Execute Commands
        remoteObj.setCommand(new TurnOnCommand(airConditioner));
        remoteObj.pressButton();
        remoteObj.setCommand(new SetTemperatureCommand(airConditioner, 25));
        remoteObj.pressButton();
        remoteObj.setCommand(new SetTemperatureCommand(airConditioner, 18));
        remoteObj.pressButton();
        remoteObj.setCommand(new TurnOffCommand(airConditioner));
        remoteObj.pressButton();

        // Undo Command
        remoteObj.undo(); // Undo: Turn Off command => AC is now on

        // Undo Command
        remoteObj.undo(); // Undo: Set Temperature Command. AC temperature is now 25°C

        // Undo Command
        remoteObj.undo(); // Undo: Set Temperature Command. AC temperature is now 0°C

        // Undo Command
        remoteObj.undo(); // Undo: Turn On command => AC is now off
    }
}
