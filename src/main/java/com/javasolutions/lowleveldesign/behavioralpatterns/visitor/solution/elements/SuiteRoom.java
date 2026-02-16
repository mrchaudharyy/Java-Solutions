package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.IRoomVisitor;

// Concrete Element - Different room types
public class SuiteRoom implements IRoom {
    private final String roomNumber;
    private final int numberOfRooms;

    public SuiteRoom(String roomNumber, int numberOfRooms) {
        this.roomNumber = roomNumber;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visitSuiteRoom(this);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}