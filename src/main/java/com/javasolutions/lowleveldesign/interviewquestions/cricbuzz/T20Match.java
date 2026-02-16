package com.javasolutions.lowleveldesign.interviewquestions.cricbuzz;

public class T20Match implements MatchType {

    @Override
    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxOverCountBowlers() {
        return 5;
    }


}
