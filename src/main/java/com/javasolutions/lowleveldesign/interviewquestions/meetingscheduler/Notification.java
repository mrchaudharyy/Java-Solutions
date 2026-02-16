package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

public class Notification {
    private int notificationId;
    private String message;

    public Notification(int notificationId, String message) {
        this.notificationId = notificationId;
        this.message = message;
    }

    public void sendMeetingInviteNotification(User user, Meeting meeting) {
        System.out.println("[+] Invite Notification sent to " + user.getName() + " for meeting: " + meeting.getSubject());
    }

    public void sendCancelMeetingNotification(User user, Meeting meeting) {
        System.out.println("[+] Cancellation Notification sent to " + user.getName() + " for meeting: " + meeting.getSubject());
    }
}
