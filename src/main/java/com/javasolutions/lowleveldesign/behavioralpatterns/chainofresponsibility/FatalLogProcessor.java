package com.javasolutions.lowleveldesign.behavioralpatterns.chainofresponsibility;

// Concrete handler for FATAL level
public class FatalLogProcessor extends LogProcessor {
    public FatalLogProcessor(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FATAL: " + message);
    }
}
