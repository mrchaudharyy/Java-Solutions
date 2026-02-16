package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.problem;

// Bloated Element class with multiple operations
public class SuiteHotelRoom {
    private String roomNumber;
    private String numberOfRooms;

    public SuiteHotelRoom(String roomNumber, String numberOfRooms) {
        this.roomNumber = roomNumber;
        this.numberOfRooms = numberOfRooms;
    }

    public void clean() {
        System.out.println("Housekeeping: Cleaning suite " +
                roomNumber + " with " +
                numberOfRooms + " rooms (90 minutes)");
    }

    public void deliverRoomService(String orderDetails) {
        System.out.println("Room Service: VIP delivery of " + orderDetails +
                " to suite " + roomNumber +
                " with full dining setup");
    }

    public double calculatePrice() {
        System.out.println("Pricing: Suite " + roomNumber +
                " - Rs. 2000/night");
        return 500.0;
    }

    // many more operations can come over the time
}
