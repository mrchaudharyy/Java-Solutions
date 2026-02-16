package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.util.List;
import java.util.Map;

public class MeetingScheduler {
    private List<MeetingRoom> allMeetingRooms;

    public MeetingScheduler(List<MeetingRoom> rooms) {
        this.allMeetingRooms = rooms;
    }

    public Meeting scheduleMeeting(User organiser, Map<User, ParticipantResponse> participants, String subject, TimeInterval timeInterval) {
        // Check for available meeting rooms with available time slots
        MeetingRoom room = checkForAvailableRooms(participants.size(), timeInterval);
        if (room == null) {
            System.out.println("===>>> No available meeting room");
            return null;
        }
        System.out.println("\n===>>> Available meeting room found");
        // Create meeting
        Meeting meeting = new Meeting(getMeetingId(), subject, timeInterval, organiser, participants, room);

        // Add meeting to participants(both organiser and participants) calendar
        organiser.getCalendar().addMeeting(meeting);
        for (User user : participants.keySet()) {
            user.getCalendar().addMeeting(meeting);
        }
        // Add meeting to meeting room calendar
        bookSlot(room, meeting);

        // Notify participants
        notifyParticipantsWithInvites(meeting);
        simulateUserResponsesForInvites(meeting);
        System.out.println("[+] Meeting scheduled successfully!!");

        return meeting;
    }

    public void cancelMeeting(Meeting meeting) {
        System.out.println("\n===>>> Cancelling meeting: " + meeting.getMeetingId() + " - " + meeting.getSubject());
        releaseSlot(meeting.getMeetingRoom(), meeting);

        // Notify participants
        notifyParticipantsAboutMeetingCancellation(meeting);
    }

    private void simulateUserResponsesForInvites(Meeting meeting) {
        for (User user : meeting.getAttendees().keySet()) {
            user.respondToInvitation(user, meeting, ParticipantResponse.ACCEPTED);
        }
    }

    private String getMeetingId() {
        String str = String.valueOf(System.currentTimeMillis());
        return "MTS-" + str.substring(9, 13);
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        this.allMeetingRooms.add(meetingRoom);
    }

    public void removeMeetingRoom(MeetingRoom meetingRoom) {
        this.allMeetingRooms.remove(meetingRoom);
    }

    private void notifyParticipantsWithInvites(Meeting meeting) {
        Notification notification = new Notification(1, "Meeting Invitation: " + meeting.getSubject());
        meeting.getOrganizer().getCalendar().addMeeting(meeting);
        for (User user : meeting.getAttendees().keySet()) {
            user.getCalendar().addMeeting(meeting);
            notification.sendMeetingInviteNotification(user, meeting);
        }
    }

    private void notifyParticipantsAboutMeetingCancellation(Meeting meeting) {
        // Send notification and Remove meeting from participants calendar from accepted participants calendar
        Notification notification = new Notification(2, "Meeting Cancelled: " + meeting.getMeetingId() + " - " + meeting.getSubject());
        meeting.getOrganizer().getCalendar().removeMeeting(meeting);
        for (User user : meeting.getAcceptedParticipants()) {
            user.getCalendar().removeMeeting(meeting);
            notification.sendCancelMeetingNotification(user, meeting);
        }
    }

    public void bookSlot(MeetingRoom room, Meeting meeting) {
        room.addBookedSlot(meeting.getTimeInterval());
        room.getCalendar().addMeeting(meeting);
    }

    public void releaseSlot(MeetingRoom room, Meeting meeting) {
        room.removeBookedSlot(meeting.getTimeInterval());
        room.getCalendar().removeMeeting(meeting);
    }

    public MeetingRoom checkForAvailableRooms(int capacity, TimeInterval interval) {
        for (MeetingRoom room : allMeetingRooms) if (room.isAvailableFor(interval, capacity)) return room;
        return null;
    }
}
