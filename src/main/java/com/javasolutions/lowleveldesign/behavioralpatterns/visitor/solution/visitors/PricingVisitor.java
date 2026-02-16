package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.DeluxeRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.StandardRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.SuiteRoom;

// Pricing visitor - demonstrates adding new operations easily
public class PricingVisitor implements IRoomVisitor {
    private double totalRevenue = 0;

    @Override
    public void visitStandardRoom(StandardRoom room) {
        double price = 1000.0;
        totalRevenue += price;
        System.out.println("Pricing: Standard room " + room.getRoomNumber() +
                " - Rs." + price + "/night");
    }

    @Override
    public void visitDeluxeRoom(DeluxeRoom room) {
        double price = 2000.0;
        totalRevenue += price;
        System.out.println("Pricing: Deluxe room " + room.getRoomNumber() +
                " - Rs." + price + "/night");
    }

    @Override
    public void visitSuiteRoom(SuiteRoom room) {
        double price = 5000.0;
        totalRevenue += price;
        System.out.println("Pricing: Suite " + room.getRoomNumber() +
                " - Rs." + price + "/night");
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}