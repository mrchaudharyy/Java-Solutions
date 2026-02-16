package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument;

public class CardInstrument extends Instrument {

    String cardNumber;
    String cvv;

    public CardInstrument() {
    }

    public CardInstrument(int instrumentId, int userID, InstrumentType type, String cardNumber, String cvv) {
        super(instrumentId, userID, type);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
