package com.javasolutions.lowleveldesign.creationalpatterns.factory;

// Step 2: Concrete Product classes
public class Rectangle implements Shape {

    @Override
    public void computeArea() {
        System.out.println("Inside Rectangle::computeArea() method.");
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
