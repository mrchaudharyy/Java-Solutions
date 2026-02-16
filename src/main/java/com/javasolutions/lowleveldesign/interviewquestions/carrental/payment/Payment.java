package com.javasolutions.lowleveldesign.interviewquestions.carrental.payment;

import java.util.Date;

public class Payment {

    private final int paymentId;
    private final int billId;
    private final double amountPaid;
    private final PaymentMode paymentMode;
    private final Date paymentDate;

    public Payment(int paymentId,
                   int billId,
                   double amountPaid,
                   PaymentMode paymentMode,
                   Date paymentDate) {

        this.paymentId = paymentId;
        this.billId = billId;
        this.amountPaid = amountPaid;
        this.paymentMode = paymentMode;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getBillId() {
        return billId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}
