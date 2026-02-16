package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.DeluxeRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.StandardRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.SuiteRoom;

// Concrete Visitor - demonstrates adding new operations easily
public class HousekeepingVisitor implements IRoomVisitor {
    @Override
    public void visitStandardRoom(StandardRoom room) {
        System.out.println("Housekeeping: Cleaning standard room " +
                room.getRoomNumber() + " (30 minutes)");
    }

    @Override
    public void visitDeluxeRoom(DeluxeRoom room) {
        System.out.println("Housekeeping: Cleaning deluxe room " +
                room.getRoomNumber() +
                (room.hasJacuzzi() ? " including jacuzzi" : "") +
                " (45 minutes)");
    }

    @Override
    public void visitSuiteRoom(SuiteRoom room) {
        System.out.println("Housekeeping: Cleaning suite " +
                room.getRoomNumber() + " with " +
                room.getNumberOfRooms() + " rooms (90 minutes)");
    }
}