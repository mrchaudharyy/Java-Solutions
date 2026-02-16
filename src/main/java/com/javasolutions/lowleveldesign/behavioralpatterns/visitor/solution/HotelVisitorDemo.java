package com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution;

import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.DeluxeRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.IRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.StandardRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.elements.SuiteRoom;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.HousekeepingVisitor;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.IRoomVisitor;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.PricingVisitor;
import com.javasolutions.lowleveldesign.behavioralpatterns.visitor.solution.visitors.RoomServiceVisitor;

// Usage
public class HotelVisitorDemo {
    public static void main(String[] args) {
        System.out.println("\n###### Visitor Design Pattern Demo ######");

        // Create different room types(elements) - Standard, Deluxe, Suite
        IRoom[] rooms = {
                new StandardRoom("101"),
                new DeluxeRoom("201", true),
                new SuiteRoom("301", 3),
                new StandardRoom("102"),
                new DeluxeRoom("202", false)
        };

        // Calling Visitors on elements
        System.out.println("\n==> Housekeeping Service");
        IRoomVisitor housekeeping = new HousekeepingVisitor();
        for (IRoom room : rooms) {
            room.accept(housekeeping);
        }

        System.out.println("\n==> Room Service");
        IRoomVisitor roomService = new RoomServiceVisitor("Breakfast");
        rooms[0].accept(roomService);  // Deliver to standard room
        rooms[1].accept(roomService);  // Deliver to deluxe room
        rooms[2].accept(roomService);  // Deliver to suite

        System.out.println("\n==> Revenue Calculation");
        PricingVisitor pricing = new PricingVisitor();
        for (IRoom room : rooms) {
            room.accept(pricing);
        }
        System.out.println("Total Revenue: Rs." + pricing.getTotalRevenue());
    }
}