package com.javasolutions.lowleveldesign.interviewquestions.parking_lot;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.Vehicle;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.parkinglot.ParkingLevel;

import java.time.LocalDateTime;

public class Ticket {

    private final Vehicle vehicle;
    private final ParkingLevel level;
    private final ParkingSpot spot;
    private final LocalDateTime entryTime;

    public Ticket(Vehicle vehicle,
                  ParkingLevel level,
                  ParkingSpot spot) {
        this.vehicle = vehicle;
        this.level = level;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingLevel getLevel() {
        return level;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}


