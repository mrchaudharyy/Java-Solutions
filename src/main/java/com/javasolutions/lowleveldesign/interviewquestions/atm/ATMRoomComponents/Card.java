package com.javasolutions.lowleveldesign.interviewquestions.atm.ATMRoomComponents;

public class Card {

    static int PIN_NUMBER = 112211;
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    private UserBankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin) {
        return pin == PIN_NUMBER;
    }

    public int getBankBalance() {
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount) {
        bankAccount.withdrawalBalance(amount);
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}