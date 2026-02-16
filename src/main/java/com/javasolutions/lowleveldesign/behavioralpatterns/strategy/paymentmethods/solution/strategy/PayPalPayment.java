package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy;

// Concrete strategy - for PayPal payment
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }
}
