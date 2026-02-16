package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Concrete Commands
public class TurnOnCommand implements ICommand {
    private final AirConditioner ac;
    private boolean previousState;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        previousState = ac.isOn();
        ac.turnOn();
    }

    @Override
    public void undo() {
        System.out.print("Undo: Turn On command. ");
        if (!previousState) {
            ac.turnOff();
        }
    }
}
