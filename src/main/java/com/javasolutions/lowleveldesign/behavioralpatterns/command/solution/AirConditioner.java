package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Receiver - The AC Device that performs actual operations
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

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Air conditioner temperature set to " + temperature + "°C");
    }

}
