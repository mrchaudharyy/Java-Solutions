package com.javasolutions.lowleveldesign.interviewquestions.parking_lot;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.ParkingSpot;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Entity.Vehicle;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.LookupStrategy.ParkingSpotLookupStrategy;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.LookupStrategy.RandomLookupStrategy;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.enums.VehicleType;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.parkinglot.*;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.payment.CashPayment;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.payment.UPIPayment;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing.CostComputation;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing.FixedPricingStrategy;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.spotManagers.FourWheelerSpotManager;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.spotManagers.ParkingSpotManager;
import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.spotManagers.TwoWheelerSpotManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {

    public static void main(String[] args) {

        ParkingSpotLookupStrategy strategy = new RandomLookupStrategy();

        Map<VehicleType, ParkingSpotManager> levelOneManagers = new HashMap<>();
        levelOneManagers.put(VehicleType.TWO_WHEELER,
                new TwoWheelerSpotManager(List.of(new ParkingSpot("L1-S1"),
                        new ParkingSpot("L1-S2")), strategy));

        levelOneManagers.put(VehicleType.FOUR_WHEELER,
                new FourWheelerSpotManager(List.of(new ParkingSpot("L1-S3")), strategy));

        ParkingLevel level1 = new ParkingLevel(
                1, levelOneManagers
        );

        Map<VehicleType, ParkingSpotManager> levelTwoManagers = new HashMap<>();
        levelTwoManagers.put(VehicleType.TWO_WHEELER,
                new TwoWheelerSpotManager(List.of(new ParkingSpot("L2-S1")), strategy));

        levelTwoManagers.put(VehicleType.FOUR_WHEELER,
                new FourWheelerSpotManager(List.of(new ParkingSpot("L2-S2"),
                        new ParkingSpot("L2-S3")), strategy));


        ParkingLevel level2 = new ParkingLevel(
                2, levelTwoManagers
        );

        ParkingBuilding parkingBuilding =
                new ParkingBuilding(
                        List.of(level1, level2),
                        new CostComputation(new FixedPricingStrategy())
                );

        ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(new CostComputation(new FixedPricingStrategy()))
        );


        Vehicle bike = new Vehicle("BIKE-101", VehicleType.TWO_WHEELER);
        Vehicle car = new Vehicle("CAR-201", VehicleType.FOUR_WHEELER);

        Ticket t1 = parkingLot.vehicleArrives(bike);
        Ticket t2 = parkingLot.vehicleArrives(car);

        parkingLot.vehicleExits(t1, new CashPayment());
        parkingLot.vehicleExits(t2, new UPIPayment());
    }
}
