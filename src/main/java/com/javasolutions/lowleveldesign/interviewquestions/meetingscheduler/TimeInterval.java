package com.javasolutions.lowleveldesign.interviewquestions.meetingscheduler;

import java.time.LocalDateTime;

public class TimeInterval {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public TimeInterval(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public boolean overlapsWith(TimeInterval newInterval) {
        // if the current interval ends before the new interval starts - valid: overlaps? false
        // if the current interval starts after the new interval ends - valid: overlaps? false
        return !this.endTime.isBefore(newInterval.startTime) &&
                !this.startTime.isAfter(newInterval.endTime);
    }
}