package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy;

// Concrete strategy - for UPI payment
public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID " + upiId);
    }
}
