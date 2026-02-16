package com.javasolutions.lowleveldesign.interviewquestions.elevator;

public class InternalDispatcher {

    private static InternalDispatcher INSTANCE = new InternalDispatcher();

    private InternalDispatcher() {
    }

    public static InternalDispatcher getInstance() {
        return INSTANCE;
    }

    // elevatorController is known based on button press origin
    public void submitInternalRequest(int destinationFloor, ElevatorController controller) {
        controller.submitRequest(destinationFloor);
    }
}