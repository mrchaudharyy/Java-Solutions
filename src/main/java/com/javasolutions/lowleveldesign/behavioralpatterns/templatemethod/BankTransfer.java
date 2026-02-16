package com.javasolutions.lowleveldesign.behavioralpatterns.templatemethod;

// Concrete class
public class BankTransfer extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("[+] Specific Validation Logic for Bank Transfer");
    }

    @Override
    public void debitAmount() {
        System.out.println("[+] Specific Debit Amount Logic for Bank Transfer");
    }

    @Override
    public void calculateFees() {
        System.out.println("[+] Specific Fee Calculation Logic for Bank Transfer. 0% Fees is applied.");
    }

    @Override
    public void creditAmount() {
        System.out.println("[+] Specific Credit Amount Logic for Bank Transfer. Full amount is credited.");
    }

}
