package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

