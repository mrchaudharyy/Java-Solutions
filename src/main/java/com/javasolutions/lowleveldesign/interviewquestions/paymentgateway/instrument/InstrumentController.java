package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.instrument;

import java.util.List;

public class InstrumentController {

    InstrumentServiceFactory instrumentControllerFactory;

    public InstrumentController() {
        this.instrumentControllerFactory = new InstrumentServiceFactory();
    }

    public InstrumentDO addInstrument(InstrumentDO instrument) {
        InstrumentService instrumentController = instrumentControllerFactory.getInstrumentService(instrument.instrumentType);
        return instrumentController.addInstrument(instrument);
    }

    public List<InstrumentDO> getAllInstruments(int userID) {
        InstrumentService bankInstrumentController = instrumentControllerFactory.
                getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentController = instrumentControllerFactory.
                getInstrumentService(InstrumentType.CARD);
        List<InstrumentDO> instrumentDOList = bankInstrumentController.getInstrumentsByUserID(userID);
        instrumentDOList.addAll(cardInstrumentController.getInstrumentsByUserID(userID));
        return instrumentDOList;
    }

    public InstrumentDO getInstrumentByID(int userID, int instrumentID) {
        List<InstrumentDO> instrumentDOList = getAllInstruments(userID);

        for (InstrumentDO instrumentDO : instrumentDOList) {
            if (instrumentDO.getInstrumentID() == instrumentID) {
                return instrumentDO;
            }
        }
        return null;
    }
}
