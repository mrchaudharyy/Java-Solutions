package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.LookupStrategy;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {

    ParkingSpot selectSpot(List<ParkingSpot> spots);
}


