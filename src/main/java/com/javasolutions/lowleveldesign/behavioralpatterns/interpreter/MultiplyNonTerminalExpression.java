package com.javasolutions.lowleveldesign.behavioralpatterns.interpreter;

// Non-terminal Expression - represents multiplication
public class MultiplyNonTerminalExpression implements AbstractExpression {
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
