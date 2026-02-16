package com.javasolutions.lowleveldesign.creationalpatterns.factory;

// Step 2: Concrete Product classes
public class Square implements Shape {

    @Override
    public void computeArea() {
        System.out.println("Inside Square::computeArea() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
