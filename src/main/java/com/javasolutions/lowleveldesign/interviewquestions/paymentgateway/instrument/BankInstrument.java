package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument;

public class BankInstrument extends Instrument {

    String bankAccountNumber;
    String ifscCode;

    public BankInstrument() {
    }

    public BankInstrument(int instrumentId, int userID, InstrumentType type, String bankAccountNumber, String ifscCode) {
        super(instrumentId, userID, type);
        this.bankAccountNumber = bankAccountNumber;
        this.ifscCode = ifscCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}
