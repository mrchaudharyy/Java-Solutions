package com.javasolutions.lowleveldesign.creationalpatterns.factory.factorymethod;


import com.javasolutions.lowleveldesign.creationalpatterns.factory.Shape;

// Step 3: Abstract Creator class
public abstract class ShapeFactory {

    // Factory method - to be implemented by subclasses
    public abstract Shape createShape();

}