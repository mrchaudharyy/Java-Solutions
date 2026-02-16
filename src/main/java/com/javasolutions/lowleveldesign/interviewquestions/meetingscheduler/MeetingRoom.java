package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    private int id;
    private String name;
    private int capacity;
    private List<TimeInterval> bookedSlots;
    private Calendar calendar;

    public MeetingRoom(int id, String name, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.name = name;
        this.bookedSlots = new ArrayList<>();
        this.calendar = new Calendar();
    }

    public void viewCalendar() {
        System.out.println("\n===>>> Displaying Meeting " + this.name + "'s calendar for the day:");
        System.out.println(calendar);
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TimeInterval> getBookedSlots() {
        return bookedSlots;
    }

    public void addBookedSlot(TimeInterval bookedSlot) {
        bookedSlots.add(bookedSlot);
    }

    public void removeBookedSlot(TimeInterval bookedSlot) {
        bookedSlots.remove(bookedSlot);
    }

    public boolean isAvailableFor(TimeInterval interval, int requiredCapacity) {
        if (requiredCapacity > this.capacity) return false;
        for (TimeInterval timeInterval : bookedSlots) if (timeInterval.overlapsWith(interval)) return false;
        return true;
    }

}
