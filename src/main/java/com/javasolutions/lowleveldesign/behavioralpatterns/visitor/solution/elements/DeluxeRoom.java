package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.IRoomVisitor;

// Concrete Element - Different room types
public class DeluxeRoom implements IRoom {
    private final String roomNumber;
    private final boolean hasJacuzzi;

    public DeluxeRoom(String roomNumber, boolean hasJacuzzi) {
        this.roomNumber = roomNumber;
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visitDeluxeRoom(this);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }
}