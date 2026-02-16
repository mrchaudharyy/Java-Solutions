package com.javasolutions.lowleveldesign.structuralpatterns.adapter;

// Concrete Adapter converts pounds → kg
public class WeightMachineAdapterImpl implements WeighingMachineAdapter {

    // Adaptee Reference
    ImperialWeighingMachine imperialWeighingMachine;

    public WeightMachineAdapterImpl(ImperialWeighingMachine weightMachineInPounds) {
        this.imperialWeighingMachine = weightMachineInPounds;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = imperialWeighingMachine.getWeightInPounds();
        // Conversion formula: 1 pound = 0.453592 kg
        return weightInPound * 0.45;
    }
}

