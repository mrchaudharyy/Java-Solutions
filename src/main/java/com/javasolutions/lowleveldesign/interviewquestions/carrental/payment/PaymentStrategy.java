package com.javasolutions.lowleveldesign.interviewquestions.carrental.payment;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.Bill;

public interface PaymentStrategy {

    Payment processPayment(Bill bill, double paymentAmount);
}

