package com.javasolutions.lowleveldesign.structuralpatterns.facade;

// Subsystem B: Payment
public class PaymentService {
    public boolean makePayment(String paymentMethod) {
        System.out.println("Processing payment using: " + paymentMethod);
        return true; // assume payment always succeeds
    }
}