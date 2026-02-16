package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService {

    public CardService() {
        super();
    }

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        // card specific logic here

        CardInstrument cardInstrument = new CardInstrument();
        cardInstrument.instrumentID = new Random().nextInt(100 - 10) + 10;
        cardInstrument.cardNumber = instrumentDO.cardNumber;
        cardInstrument.cvv = instrumentDO.cvvNumber;
        cardInstrument.instrumentType = InstrumentType.CARD;
        cardInstrument.userID = instrumentDO.userID;
        List<Instrument> userInstrumentsList = userVsInstruments.get(cardInstrument.userID);
        if (userInstrumentsList == null) {
            userInstrumentsList = new ArrayList<>();
            userVsInstruments.put(cardInstrument.userID, userInstrumentsList);
        }
        userInstrumentsList.add(cardInstrument);
        return mapBankInstrumentToInstrumentDO((CardInstrument) cardInstrument);
    }

    private InstrumentDO mapBankInstrumentToInstrumentDO(CardInstrument cardInstrument) {
        InstrumentDO instrumentDOObj = new InstrumentDO();
        instrumentDOObj.instrumentType = cardInstrument.instrumentType;
        instrumentDOObj.instrumentID = cardInstrument.instrumentID;
        instrumentDOObj.cardNumber = cardInstrument.cardNumber;
        instrumentDOObj.cvvNumber = cardInstrument.cvv;
        instrumentDOObj.userID = cardInstrument.userID;
        return instrumentDOObj;
    }

    public List<InstrumentDO> getInstrumentsByUserID(int userID) {
        List<Instrument> userInstruments = userVsInstruments.get(userID);
        List<InstrumentDO> userInstrumentsFetched = new ArrayList<>();
        for (Instrument instrument : userInstruments) {
            if (instrument.getInstrumentType() == InstrumentType.CARD)
                userInstrumentsFetched.add(mapBankInstrumentToInstrumentDO((CardInstrument) instrument));
        }
        return userInstrumentsFetched;
    }
}
