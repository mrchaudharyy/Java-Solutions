package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway;

import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument.InstrumentController;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument.InstrumentDO;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument.InstrumentType;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.transaction.Transaction;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.transaction.TransactionController;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.transaction.TransactionDO;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.user.UserController;
import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.user.UserDO;

import java.util.List;

public class PaymentGateway {

    public static void main(String[] args) {

        System.out.println("\nLLD Code - Payment Gateway\n");

        InstrumentController instrumentController = new InstrumentController();
        UserController userController = new UserController();
        TransactionController transactionController = new TransactionController();

        // Add USER1
        UserDO user1 = new UserDO();
        user1.setName("Alice");
        user1.setMail("alice@conceptandcoding.com");
        UserDO user1Details = userController.addUser(user1);

        // Add USER2
        UserDO user2 = new UserDO();
        user2.setName("Bob");
        user2.setMail("bob@conceptandcoding.com");
        UserDO user2Details = userController.addUser(user2);

        // Add Bank to User1
        InstrumentDO bankInstrumentDO = new InstrumentDO();
        bankInstrumentDO.setBankAccountNumber("234324234324324");
        bankInstrumentDO.setInstrumentType(InstrumentType.BANK);
        bankInstrumentDO.setUserID(user1Details.getId());
        bankInstrumentDO.setIfsc("ER3223E");
        InstrumentDO user1BankInstrument = instrumentController.addInstrument(bankInstrumentDO);
        System.out.println("Bank Instrument created for User1: " + user1BankInstrument.getInstrumentID());

        // Add Card to User2
        InstrumentDO cardInstrumentDO = new InstrumentDO();
        cardInstrumentDO.setCardNumber("1230099");
        cardInstrumentDO.setInstrumentType(InstrumentType.CARD);
        cardInstrumentDO.setCvvNumber("0000");
        cardInstrumentDO.setUserID(user2Details.getId());
        InstrumentDO user2CardInstrument = instrumentController.addInstrument(cardInstrumentDO);
        System.out.println("Card Instrument created for User2: " + user2CardInstrument.getInstrumentID());

        // Make Payment
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setTxnID(101);
        transactionDO.setAmount(500);
        transactionDO.setSenderId(user1Details.getId());
        transactionDO.setReceiverId(user2Details.getId());
        transactionDO.setDebitInstrumentId(user1BankInstrument.getInstrumentID());
        transactionDO.setCreditInstrumentId(user2CardInstrument.getInstrumentID());
        transactionController.makePayment(transactionDO);

        // Get all instruments of USER1
        List<InstrumentDO> user1Instruments = instrumentController.getAllInstruments(user1Details.getId());
        for (InstrumentDO instrumentDO : user1Instruments) {
            System.out.println("\nUser1 Name: " + user1Details.getName() +
                    "; UserID: " + instrumentDO.getUserID() +
                    "; InstrumentID: " + instrumentDO.getInstrumentID() +
                    "; InstrumentType: " + instrumentDO.getInstrumentType().name());
        }

        // Get all instruments of USER2
        List<InstrumentDO> user2Instruments = instrumentController.getAllInstruments(user2Details.getId());
        for (InstrumentDO instrumentDO : user2Instruments) {
            System.out.println("User2 Name: " + user2Details.getName() +
                    "; UserID: " + instrumentDO.getUserID() +
                    "; InstrumentID: " + instrumentDO.getInstrumentID() +
                    "; InstrumentType: " + instrumentDO.getInstrumentType().name());
        }

        // Get transaction history of USER1
        List<Transaction> user1TransactionList = transactionController.getTransactionHistory(user1Details.getId());
        for (Transaction txn : user1TransactionList) {
            System.out.println("\nUser1 txnID: " + txn.getTxnID() +
                    "; Amount: " + txn.getAmount() +
                    "; Sender: " + txn.getSenderId() +
                    "; Receiver: " + txn.getReceiverId());
        }

        // Get transaction history of USER2
        List<Transaction> user2TransactionList = transactionController.getTransactionHistory(user2Details.getId());
        for (Transaction txn : user2TransactionList) {
            System.out.println("User2 txnID: " + txn.getTxnID() +
                    "; Amount: " + txn.getAmount() +
                    "; Sender: " + txn.getSenderId() +
                    "; Receiver: " + txn.getReceiverId());
        }
    }
}
