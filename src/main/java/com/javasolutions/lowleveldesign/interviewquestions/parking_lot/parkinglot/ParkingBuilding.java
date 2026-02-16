package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.parkinglot;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.Vehicle;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Ticket;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing.CostComputation;

import java.util.List;

public class ParkingBuilding {

    private final List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels,
                           CostComputation costComputation) {
        this.levels = levels;
    }

    Ticket allocate(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.hasAvailability(vehicle.getVehicleType())) {
                ParkingSpot spot = level.park(vehicle.getVehicleType());
                if (spot != null) {
                    Ticket ticket = new Ticket(vehicle, level, spot);
                    System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " spot: " + spot.getSpotId());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    void release(Ticket ticket) {
        ticket.getLevel().unPark(
                ticket.getVehicle().getVehicleType(),
                ticket.getSpot()
        );
    }
}


