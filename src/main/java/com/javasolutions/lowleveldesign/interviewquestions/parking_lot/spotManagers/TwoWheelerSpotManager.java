package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.spotManagers;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.LookupStrategy.ParkingSpotLookupStrategy;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    /*
     1. Maintains a list of Two Wheeler Spots only
     2. Has its own lookup strategy
     3. Has its own lock, to avoid conflicts with other spot managers
     */
    public TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}


