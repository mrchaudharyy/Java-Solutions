package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.problem;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Payment Processor: Problem Demo");
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("credit_card", 100);
        processor.processPayment("paypal", 200);
        processor.processPayment("net_banking", 300);
        processor.processPayment("cash", 400);
    }
}
