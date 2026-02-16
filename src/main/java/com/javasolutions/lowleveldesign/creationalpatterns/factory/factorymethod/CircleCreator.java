package com.javasolutions.lowleveldesign.creationalpatterns.factory.factorymethod;

import com.javasolutions.lowleveldesign.creationalpatterns.factory.Circle;
import com.javasolutions.lowleveldesign.creationalpatterns.factory.Shape;

// Step 4: Concrete Creator classes
public class CircleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
