package com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.Team;

import com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.Inning.BallDetails;
import com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.Inning.OverDetails;
import com.javasolutions.lowleveldesign.interviewquestions.cricbuzz.Team.Player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail) {

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
