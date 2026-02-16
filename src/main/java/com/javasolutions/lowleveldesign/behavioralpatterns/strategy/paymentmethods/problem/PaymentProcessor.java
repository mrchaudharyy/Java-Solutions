package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.problem;

// A simple payment processor class - bloated with payment logic
public class PaymentProcessor {
    public void processPayment(String type, double amount) {
        switch (type) {
            case "credit_card" -> {
                // x lines of credit card logic
                System.out.println("Paid $" + amount + " using credit card");
            }
            case "paypal" -> {
                // y lines of PayPal logic
                System.out.println("Paid $" + amount + " using PayPal");
            }
            case "net_banking" -> {
                // z lines of bank transfer logic
                System.out.println("Paid $" + amount + " using bank transfer");
            }
            case "cash" -> {
                // 10 lines of cash on delivery logic
                System.out.println("Paid $" + amount + " using cash");
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        // Adding another payment method(crypto) requires modifying this class
        // This keeps growing with each new payment method
        // bad design
    }
}
