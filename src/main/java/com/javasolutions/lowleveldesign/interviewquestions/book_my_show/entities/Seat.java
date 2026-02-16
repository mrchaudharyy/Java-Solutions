package com.javasolutions.lowleveldesign.interviewquestions.book_my_show.entities;

import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.enums.SeatCategory;

public class Seat {

    private final int seatId;
    private final SeatCategory category;

    public Seat(int seatId, SeatCategory category) {
        this.seatId = seatId;
        this.category = category;
    }

    public int getSeatId() {
        return seatId;
    }
}


