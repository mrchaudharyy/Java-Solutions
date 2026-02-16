package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        System.out.println("\n###### LLD Code - Meeting Scheduler Demo ######");

        // Create Rooms
        MeetingRoom room1 = new MeetingRoom(1, "Room 1", 4);
        MeetingRoom room2 = new MeetingRoom(2, "Room 2", 8);
        MeetingRoom room3 = new MeetingRoom(3, "Room 3", 12);
        List<MeetingRoom> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // Create Users
        User user1 = new User("User 1", "user1@example.com", ParticipantType.ORGANIZER);
        Map<User, ParticipantResponse> participantsM1 = new HashMap<>();
        User user2 = new User("User 2", "user2@example.com", ParticipantType.ATTENDEE);
        User user3 = new User("User 3", "user3@example.com", ParticipantType.ATTENDEE);
        User user4 = new User("User 4", "user4@example.com", ParticipantType.ATTENDEE);
        User user5 = new User("User 5", "user5@example.com", ParticipantType.ATTENDEE);
        User user6 = new User("User 6", "user6@example.com", ParticipantType.ATTENDEE);
        User user7 = new User("User 7", "user7@example.com", ParticipantType.ATTENDEE);
        participantsM1.put(user2, ParticipantResponse.NOT_RESPONDED);
        participantsM1.put(user3, ParticipantResponse.NOT_RESPONDED);

        // Create Meeting Scheduler
        MeetingScheduler meetingScheduler = new MeetingScheduler(rooms);

        // Schedule Meeting
        LocalDateTime startTime = LocalDateTime.of(2022, 1, 22, 10, 0);
        LocalDateTime endTime = LocalDateTime.of(2022, 1, 22, 11, 0);
        Meeting meeting1 = meetingScheduler.scheduleMeeting(user1, participantsM1, "Meeting 1-Requirement Planning", new TimeInterval(startTime, endTime));

        Map<User, ParticipantResponse> participantsM2 = new HashMap<>();
        participantsM2.put(user4, ParticipantResponse.NOT_RESPONDED);
        participantsM2.put(user5, ParticipantResponse.NOT_RESPONDED);
        participantsM2.put(user6, ParticipantResponse.NOT_RESPONDED);
        participantsM2.put(user7, ParticipantResponse.NOT_RESPONDED);

        Meeting meeting2 = meetingScheduler.scheduleMeeting(user3, participantsM2, "Meeting 2-Effort Planning", new TimeInterval(startTime, endTime));

        // User's Calendar
        user1.viewCalendar();
        user3.viewCalendar();

        // Meeting Room's Calendar
        meeting1.getMeetingRoom().viewCalendar();
        meeting2.getMeetingRoom().viewCalendar();

        // Cancel Meeting
        meetingScheduler.cancelMeeting(meeting1);
        meetingScheduler.cancelMeeting(meeting2);

        // User's Calendar - empty
        user1.viewCalendar();
        user3.viewCalendar();

        // Meeting Room's Calendar - empty
        meeting1.getMeetingRoom().viewCalendar();
        meeting2.getMeetingRoom().viewCalendar();

    }
}
