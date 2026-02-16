package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.LookupStrategy;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;

import java.util.List;

public class RandomLookupStrategy implements ParkingSpotLookupStrategy {

    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for (ParkingSpot spot : spots) {
            if (spot.isSpotFree()) {
                return spot;
            }
        }
        return null;
    }
}


