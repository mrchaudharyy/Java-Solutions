package com.javasolutions.lowleveldesign.interviewquestions.atm.AmountWithdrawal;

import com.javasolutions.lowleveldesign.interviewquestions.atm.ATMRoomComponents.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {

    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if (required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else if (required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required - atm.getNoOfFiveHundredNotes()) * 500;
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }
}
