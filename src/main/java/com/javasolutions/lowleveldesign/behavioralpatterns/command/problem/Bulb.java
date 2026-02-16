package com.javasolutions.lowleveldesign.behavioralpatterns.command.problem;

public class Bulb {
    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb is off");
    }
}
