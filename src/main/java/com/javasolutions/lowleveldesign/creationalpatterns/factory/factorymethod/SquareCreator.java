package com.javasolutions.lowleveldesign.creationalpatterns.factory.factorymethod;


import com.javasolutions.lowleveldesign.creationalpatterns.factory.Shape;
import com.javasolutions.lowleveldesign.creationalpatterns.factory.Square;

// Step 4: Concrete Creator classes
public class SquareCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }
}
