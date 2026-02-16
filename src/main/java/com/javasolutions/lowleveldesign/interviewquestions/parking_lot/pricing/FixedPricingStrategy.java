package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Ticket;

public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}

