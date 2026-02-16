package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Meeting {

    private String meetingId;
    private String subject;
    private TimeInterval timeInterval;
    private User organizer;
    private MeetingRoom meetingRoom;
    private Map<User, ParticipantResponse> attendees;

    public Meeting(String meetingId, String subject, TimeInterval timeInterval, User organizer, Map<User, ParticipantResponse> attendees, MeetingRoom meetingRoom) {
        this.meetingId = meetingId;
        this.subject = subject;
        this.timeInterval = timeInterval;
        this.organizer = organizer;
        this.attendees = attendees;
        this.meetingRoom = meetingRoom;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public Map<User, ParticipantResponse> getAttendees() {
        return attendees;
    }

    public void setAttendees(Map<User, ParticipantResponse> attendees) {
        this.attendees = attendees;
    }

    public List<User> getAcceptedParticipants() {
        List<User> acceptedAttendees = new ArrayList<>();
        for (Map.Entry<User, ParticipantResponse> entry : attendees.entrySet()) {
            if (entry.getValue() == ParticipantResponse.ACCEPTED) acceptedAttendees.add(entry.getKey());
        }
        return acceptedAttendees;
    }

    public List<User> getDeclinedParticipants() {
        List<User> declinedAttendees = new ArrayList<>();
        for (Map.Entry<User, ParticipantResponse> entry : attendees.entrySet()) {
            if (entry.getValue() == ParticipantResponse.DECLINED) declinedAttendees.add(entry.getKey());
        }
        return declinedAttendees;
    }

    public List<User> getTentativeParticipants() {
        List<User> tentativeAttendees = new ArrayList<>();
        for (Map.Entry<User, ParticipantResponse> entry : attendees.entrySet()) {
            if (entry.getValue() == ParticipantResponse.TENTATIVE) tentativeAttendees.add(entry.getKey());
        }
        return tentativeAttendees;
    }

    @Override
    public String toString() {
        return "Meeting [meetingId=" + meetingId + ", subject=" + subject + ", organizer=" + organizer.getName() + ", meetingRoom=" + meetingRoom.getName() + "]";
    }

}
