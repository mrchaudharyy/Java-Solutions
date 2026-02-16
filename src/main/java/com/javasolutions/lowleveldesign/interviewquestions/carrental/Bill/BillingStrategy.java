package com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.reservation.Reservation;

public interface BillingStrategy {

    Bill generateBill(Reservation reservation);
}
