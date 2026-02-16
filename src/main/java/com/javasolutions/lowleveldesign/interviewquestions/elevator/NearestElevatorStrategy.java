package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import com.javasolutions.lowleveldesign.interviewquestions.elevator.enums.ElevatorDirection;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy {

    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers,
                                             int requestFloor,
                                             ElevatorDirection direction) {

        ElevatorController best = null;
        int minDistance = Integer.MAX_VALUE;

        //1. Pick the one which is going in same direction and minimum distance from the destination
        for (ElevatorController controller : controllers) {
            int nextFloorStoppage = controller.elevatorCar.nextFloorStoppage;

            // Good candidate if moving same direction & not passed requested floor
            boolean isSameDirectionCandidate =
                    controller.elevatorCar.movingDirection == direction &&
                            ((direction == ElevatorDirection.UP && nextFloorStoppage <= requestFloor) ||
                                    (direction == ElevatorDirection.DOWN && nextFloorStoppage >= requestFloor));

            int dist = Math.abs(nextFloorStoppage - requestFloor);

            if (isSameDirectionCandidate && dist < minDistance) {
                minDistance = dist;
                best = controller;
            }
        }

        // fallback: if not able to choose, pick the idle one
        if (best == null) {
            for (ElevatorController controller : controllers) {
                if (controller.elevatorCar.movingDirection == ElevatorDirection.IDLE) {
                    best = controller;
                    break;
                }
            }

            //reached here means, no list is going in same direction and no lift is IDLE too, then pick any lift
            if (best == null) {
                best = controllers.get(0);
            }
        }
        return best;
    }
}
