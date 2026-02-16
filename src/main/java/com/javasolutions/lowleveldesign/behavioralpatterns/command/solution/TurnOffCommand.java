package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Concrete Command
public class TurnOffCommand implements ICommand {
    private final AirConditioner ac;
    private boolean previousState;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        previousState = ac.isOn();
        ac.turnOff();
    }

    @Override
    public void undo() {
        System.out.print("Undo: Turn Off command. ");
        if (previousState) {
            ac.turnOn();
        }
    }
}
