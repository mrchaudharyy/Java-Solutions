package com.javasolutions.lowleveldesign.interviewquestions.parking_lot.pricing;

import com.javasolutions.lowleveldesign.interviewquestions.parking_lot.Ticket;

public class CostComputation {

    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket) {
        ;

        return pricingStrategy.calculate(ticket);
    }
}

