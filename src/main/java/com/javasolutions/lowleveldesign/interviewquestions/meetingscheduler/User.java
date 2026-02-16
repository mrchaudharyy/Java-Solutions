package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

public class User {
    private String name;
    private String email;
    private Calendar calendar;
    private ParticipantType participantType;

    public User(String name, String email, ParticipantType participantType) {
        this.name = name;
        this.email = email;
        this.calendar = new Calendar();
        this.participantType = participantType;
    }

    public void viewCalendar() {
        System.out.println("\n===>>> Displaying " + this.name + "'s calendar for the day:");
        System.out.println(calendar);
    }

    public void respondToInvitation(User participant, Meeting meeting, ParticipantResponse response) {
        meeting.getAttendees().put(participant, response);
        System.out.println("[+] " + participant.getName() + " responded: " + response);
        // Update User calendar based on response
        if (response == ParticipantResponse.DECLINED) {
            this.calendar.removeMeeting(meeting);
        } else if (response == ParticipantResponse.ACCEPTED) {
            this.calendar.addMeeting(meeting);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public ParticipantType getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantType participantType) {
        this.participantType = participantType;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", calendar=" + calendar + ", participantType=" + participantType + "]";
    }
}
