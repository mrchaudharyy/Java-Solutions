package com.javasolutions.lowleveldesign.structuralpatterns.composite.mathexpression;

// Client Code with Composite Pattern
public class MathExpressionEvaluator {
    public static void main(String[] args) {
        System.out.println("======= Composite Design Pattern ======");
        // 2*(1+7) tree structure for evaluation
       /*
                         *
                       /   \
                     2      +
                           / \
                          1   7
        */
        ArithmeticExpression two = new java.lang.Number(2);
        ArithmeticExpression one = new java.lang.Number(1);
        ArithmeticExpression seven = new java.lang.Number(7);

        ArithmeticExpression addExpression = new Expression(one, seven, OperationType.ADD);
        ArithmeticExpression parentExpression = new Expression(two, addExpression, OperationType.MULTIPLY);

        System.out.println(parentExpression.evaluate());
    }
}
