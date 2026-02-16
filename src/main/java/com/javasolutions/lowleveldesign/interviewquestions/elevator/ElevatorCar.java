package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import com.javasolutions.lowleveldesign.interviewquestions.elevator.enums.ElevatorDirection;

public class ElevatorCar {

    int id;
    int currentFloor;
    int nextFloorStoppage;
    ElevatorDirection movingDirection;
    Door door;

    public ElevatorCar(int id) {
        this.id = id;
        currentFloor = 0;
        movingDirection = ElevatorDirection.IDLE;
        door = new Door();
    }

    public void showDisplay() {
        System.out.println("elevator:" + id + " Current floor: " + currentFloor + " going: " + movingDirection);
    }

    public void moveElevator(int destinationFloor) {
        //this is dump object, so if command has come, to go particular direction and particular floor, it just move
        //no matter what its current state and floor.

        this.nextFloorStoppage = destinationFloor;
        if (this.currentFloor == nextFloorStoppage) {
            door.openDoor(id);
            return;
        }

        int startFloor = this.currentFloor;
        door.closeDoor(id);
        if (nextFloorStoppage >= currentFloor) {
            movingDirection = ElevatorDirection.UP;
            showDisplay();
            //+1 i am doing bcoz, floor start from 0,1,2.... so if anyone goes from 1st floor to 2nd, so only 1 floor
            //lift has to move, not 2.
            for (int i = startFloor + 1; i <= nextFloorStoppage; i++) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {

                }
                setCurrentFloor(i);
                showDisplay();
            }
        } else {
            movingDirection = ElevatorDirection.DOWN;

            showDisplay();
            for (int i = startFloor - 1; i >= nextFloorStoppage; i--) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {

                }
                setCurrentFloor(i);
                showDisplay();
            }
        }
        door.openDoor(id);
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}

