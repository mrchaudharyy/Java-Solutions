package com.javasolutions.lowleveldesign.behavioralpatterns.state.vendingmachinestates.impl;

import com.javasolutions.lowleveldesign.behavioralpatterns.state.context.Item;
import com.javasolutions.lowleveldesign.behavioralpatterns.state.context.VendingMachine;
import com.javasolutions.lowleveldesign.behavioralpatterns.state.vendingmachinestates.State;

public class DispenseState extends State {

    DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }
}

