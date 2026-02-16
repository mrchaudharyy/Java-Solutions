package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import com.javasolutions.lowleveldesign.interviewquestions.elevator.enums.ElevatorDirection;

import java.util.List;

public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}
