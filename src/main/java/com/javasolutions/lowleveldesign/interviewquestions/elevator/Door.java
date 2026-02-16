package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import com.javasolutions.lowleveldesign.interviewquestions.elevator.enums.DoorState;

public class Door {
    private DoorState doorState;

    Door() {
        doorState = DoorState.DOOR_CLOSED;
    }

    public void openDoor(int id) {
        doorState = DoorState.DOOR_OPEN;
        System.out.println("Opening the Elevator door of elevator:" + id);
    }

    public void closeDoor(int id) {
        doorState = DoorState.DOOR_CLOSED;
        System.out.println("Closing the Elevator door of elevator:" + id);
    }

}
