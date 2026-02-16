package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy;

// Concrete strategy - for credit card payment
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card ending in "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}
