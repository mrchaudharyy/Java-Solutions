package com.javasolutions.lowleveldesign.interviewquestions.elevator;


public class InternalButton {

    private final ElevatorController controller;

    public InternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    public void pressButton(int destinationFloor) {
        //we can also remove teh Internal dispatcher from mid, but generally say for validation, controller and
        //similar code flow like external button, its good have

        InternalDispatcher.getInstance()
                .submitInternalRequest(destinationFloor, controller);
    }
}