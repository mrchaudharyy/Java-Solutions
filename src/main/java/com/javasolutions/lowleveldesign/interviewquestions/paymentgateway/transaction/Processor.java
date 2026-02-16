package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.transaction;

import com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument.InstrumentDO;

public class Processor {

    public void processPayment(InstrumentDO senderInstrumentDO, InstrumentDO receiverInstrumentDO) {

        // validate sender instrument

        // validate receiver instrument

        // process payment

        // update balance in sender instrument - debit

        // update balance in receiver instrument - credit

    }
}
