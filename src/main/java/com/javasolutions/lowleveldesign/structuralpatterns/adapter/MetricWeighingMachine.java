package com.javasolutions.lowleveldesign.structuralpatterns.adapter;

// Client - Metric Weighing Machine
public class MetricWeighingMachine {
    public static void main(String[] args) {
        System.out.println("======= Adapter Design Pattern ======");

        // ImperialWeighingMachine - // Existing weighing machine is used to weigh the baby in pounds
        double weighingScaleReading = 25.0; // say the baby's weight is 25 pounds
        ImperialWeighingMachineImpl imperialWeighingMachine = new ImperialWeighingMachineImpl(weighingScaleReading);

        // Adapter to convert to KG
        WeighingMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(imperialWeighingMachine);

        // Client gets weight in Kilograms
        System.out.println("Weight in KG: " + weightMachineAdapter.getWeightInKg());
    }
}
