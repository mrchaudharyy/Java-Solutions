package com.javasolutions.lowleveldesign.behavioralpatterns.templatemethod;

// Abstract class
public abstract class PaymentFlow {

    // Abstract methods - these methods are implemented by the subclasses.
    public abstract void validateRequest();

    public abstract void debitAmount();

    public abstract void calculateFees();

    public abstract void creditAmount();

    // Template method: which defines the order of steps to execute the task.
    public final void sendMoney() {
        // step 1
        validateRequest();
        // step 2
        debitAmount();
        // step 3
        calculateFees();
        // step 4
        creditAmount();
    }

    // Hook method: which can be overridden by the subclasses.
    protected boolean requiresOTPAuthentication() {
        return false; // Default: authentication not required
    }

    // Common method: All subclasses share this common functionality.
    public void logTransaction() {
        System.out.println("Transaction Completed!");
    }
}