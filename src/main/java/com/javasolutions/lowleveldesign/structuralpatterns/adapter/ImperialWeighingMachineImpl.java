package com.javasolutions.lowleveldesign.structuralpatterns.adapter;

// Adaptee - Existing Incompatible class
public class ImperialWeighingMachineImpl implements ImperialWeighingMachine {
    double weightInPounds = 0;

    public ImperialWeighingMachineImpl(double weighingScaleReading) {
        this.weightInPounds = weighingScaleReading;
    }

    // Third-party weighing machine (US model) – returns pounds
    @Override
    public double getWeightInPounds() {
        return weightInPounds;
    }
}
