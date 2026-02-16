package com.javasolutions.lowleveldesign.creationalpatterns.factory.factorymethod;

import com.javasolutions.lowleveldesign.creationalpatterns.factory.Rectangle;
import com.javasolutions.lowleveldesign.creationalpatterns.factory.Shape;

// Step 4: Concrete Creator classes
public class RectangleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
