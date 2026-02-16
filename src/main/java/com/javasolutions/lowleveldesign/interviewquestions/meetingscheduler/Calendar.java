package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// User has their Calendar for the day
// A meeting room has its Calendar for the day
public class Calendar {

    private Map<TimeInterval, Meeting> meetings;

    public Calendar() {
        this.meetings = new HashMap<>();
    }

    public void addMeeting(Meeting meeting) {
        this.meetings.put(meeting.getTimeInterval(), meeting);
    }

    public void removeMeeting(Meeting meeting) {
        this.meetings.remove(meeting.getTimeInterval());
    }

    public Meeting getMeeting(TimeInterval timeInterval) {
        return this.meetings.get(timeInterval);
    }

    public List<Meeting> getMeetings() {
        return new ArrayList<>(this.meetings.values());
    }

    public void setMeetings(Map<TimeInterval, Meeting> meetings) {
        this.meetings = meetings;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Meeting m : meetings.values())
            builder.append(m.toString().concat("\n"));
        return builder.toString();
    }
}
