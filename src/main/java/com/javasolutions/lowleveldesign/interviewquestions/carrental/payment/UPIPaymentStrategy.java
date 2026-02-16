package com.javasolutions.lowleveldesign.interviewquestions.carrental.payment;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.Bill;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class UPIPaymentStrategy implements PaymentStrategy {

    private final AtomicInteger paymentIdGenerator = new AtomicInteger(9000);

    @Override
    public Payment processPayment(Bill bill, double paymentAmount) {

        Payment payment = new Payment(paymentIdGenerator.getAndIncrement(),
                bill.getBillId(), paymentAmount,
                PaymentMode.UPI, new Date());


        //currently assumption is that payment amount is always equals to bill amount
        //no partial scenario
        bill.setBillPaid(true);

        return payment;
    }
}
