package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.parkinglot;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.Vehicle;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Ticket;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}


