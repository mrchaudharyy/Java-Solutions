package com.javasolutions.lowleveldesign.behavioralpatterns.interpreter;

// Terminal Expression - represents a variable
public class NumberTerminalExpression implements AbstractExpression {
    String stringValue;

    NumberTerminalExpression(String stringVal) {
        this.stringValue = stringVal;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(stringValue);
    }
}