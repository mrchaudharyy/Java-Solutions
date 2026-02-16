package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.wordprocessor.issue;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Word Processor: Issue Demo");
        // Data: "Hello World"
        // Total 11 characters
        // h = 1 time
        // e = 1 time
        // l = 3 times
        // o = 2 times
        // w = 1 time
        // r = 1 time
        // d = 1 time
        // ' ' = 1 time

        // Create 11 character objects
        java.lang.Character object1 = new java.lang.Character('H', "Arial", 10, 0, 0);
        java.lang.Character object2 = new java.lang.Character('e', "Arial", 10, 0, 1);
        java.lang.Character object3 = new java.lang.Character('l', "Arial", 10, 0, 2);
        java.lang.Character object4 = new java.lang.Character('l', "Arial", 10, 0, 3);
        java.lang.Character object5 = new java.lang.Character('o', "Arial", 10, 0, 4);
        java.lang.Character object6 = new java.lang.Character(' ', "Arial", 10, 0, 5);
        java.lang.Character object7 = new java.lang.Character('W', "Arial", 10, 0, 6);
        java.lang.Character object8 = new java.lang.Character('o', "Arial", 10, 0, 7);
        java.lang.Character object9 = new java.lang.Character('r', "Arial", 10, 0, 8);
        java.lang.Character object10 = new java.lang.Character('l', "Arial", 10, 0, 9);
        java.lang.Character object11 = new java.lang.Character('d', "Arial", 10, 0, 10);
    }
}