package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Concrete Command
public class SetTemperatureCommand implements ICommand {
    private final AirConditioner ac;
    private final int newTemperature;
    private int previousTemperature;

    public SetTemperatureCommand(AirConditioner ac, int temperature) {
        this.ac = ac;
        this.newTemperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = ac.getTemperature();
        ac.setTemperature(newTemperature);
    }

    @Override
    public void undo() {
        System.out.print("Undo: Set Temperature Command. ");
        ac.setTemperature(previousTemperature);
    }
}
