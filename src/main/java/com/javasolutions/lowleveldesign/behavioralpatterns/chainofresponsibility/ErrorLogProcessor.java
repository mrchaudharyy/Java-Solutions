package com.javasolutions.lowleveldesign.behavioralpatterns.chainofresponsibility;

// Concrete handler for ERROR level
public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
