package com.javasolutions.lowleveldesign.behavioralpatterns.chainofresponsibility;

// Concrete handler for DEBUG level
public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
