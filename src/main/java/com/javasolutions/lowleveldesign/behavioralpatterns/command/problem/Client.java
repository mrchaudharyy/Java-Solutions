package com.javasolutions.lowleveldesign.behavioralpatterns.command.problem;

public class Client {
    public static void main(String[] args) {
        System.out.println("##### Command Pattern: Problem Demo #####");

        // Device: Air Conditioner Commands
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(25);
        airConditioner.turnOff();

        // Device: Bulb Commands
        Bulb bulb = new Bulb();
        bulb.turnOn();
        bulb.turnOff();
    }
}
