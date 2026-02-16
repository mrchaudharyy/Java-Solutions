package com.javasolutions.lowleveldesign.interviewquestions.elevator;

import java.util.ArrayList;
import java.util.List;

public class Building {

    List<Floor> floors = new ArrayList<>();

    public Building(int totalFloors, ExternalDispatcher dispatcher) {
        for (int i = 1; i <= totalFloors; i++) {
            floors.add(new Floor(i, dispatcher));
        }
    }

    public Floor getFloor(int floor) {
        return floors.get(floor - 1);
    }
}
