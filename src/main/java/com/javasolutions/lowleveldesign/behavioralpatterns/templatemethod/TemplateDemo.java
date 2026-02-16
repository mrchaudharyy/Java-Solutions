package com.javasolutions.lowleveldesign.behavioralpatterns.templatemethod;

// Client class
public class TemplateDemo {
    public static void main(String[] args) {
        System.out.println("###### Template Method Design Pattern ######");

        // Bank Transfer
        System.out.println("===== Bank Transfer =====");
        PaymentFlow bankTransfer = new BankTransfer();
        bankTransfer.sendMoney(); // Template method
        bankTransfer.logTransaction(); // Common method

        // Merchant Payment
        System.out.println("===== Merchant Payment =====");
        PaymentFlow merchantPayment = new MerchantPayment();
        merchantPayment.sendMoney(); // Template method
        merchantPayment.logTransaction(); // Common method
    }
}
