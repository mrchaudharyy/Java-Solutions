package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import com.javasolutions.lowleveldesign.interviewquestions.elevator.enums.ElevatorDirection;

public class ExternalButton {

    private final ExternalDispatcher dispatcher;

    public ExternalButton(ExternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    // this direction of external button is only helpful in selecting the correct elevator
    public void pressButton(int floor, ElevatorDirection direction) {
        dispatcher.submitExternalRequest(floor, direction);
    }
}

