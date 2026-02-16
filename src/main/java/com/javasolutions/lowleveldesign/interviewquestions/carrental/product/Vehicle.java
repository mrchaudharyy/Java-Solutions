package com.javasolutions.lowleveldesign.interviewquestions.carrental.product;

public class Vehicle {

    private final int vehicleID;
    private final String vehicleNumber;
    private final VehicleType vehicleType;
    private double dailyRentalCost;
    private volatile VehicleStatus vehicleStatus;

    /* we can add more properties like below if required
        private String companyName;
        private String modelName;
        private int kmDriven;
        private int average;
        private int cc;
        private int noOfSeat;
    */

    // --------- Constructors ---------
    public Vehicle(int vehicleID, String vehicleNumber, VehicleType vehicleType) {
        this.vehicleID = vehicleID;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.vehicleStatus = VehicleStatus.AVAILABLE;
    }


    // --------- Getters ---------

    public int getVehicleID() {
        return vehicleID;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public double getDailyRentalCost() {
        return dailyRentalCost;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // --------- Setters ---------

    public void setDailyRentalCost(double dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }


    public void setStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}