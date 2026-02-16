package com.javasolutions.lowleveldesign.behavioralpatterns.state.vendingmachinestates.impl;

import com.javasolutions.lowleveldesign.behavioralpatterns.state.context.Item;
import com.javasolutions.lowleveldesign.behavioralpatterns.state.context.VendingMachine;
import com.javasolutions.lowleveldesign.behavioralpatterns.state.vendingmachinestates.State;

import java.util.ArrayList;

public class IdleState extends State {

    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
