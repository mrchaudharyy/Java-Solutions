package com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.ScoreUpdater;


import com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
