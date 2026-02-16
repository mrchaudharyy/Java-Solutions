package com.javasolutions.lowleveldesign.behavioralpatterns.command.problem;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOn() {
        isOn = true;
        System.out.println("Air conditioner is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air conditioner is off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Air conditioner temperature set to " + temperature);
    }
}
