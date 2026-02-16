package com.javasolutions.lowleveldesign.creationalpatterns.factory.factorymethod;

import com.javasolutions.lowleveldesign.creationalpatterns.factory.Shape;
import com.javasolutions.lowleveldesign.creationalpatterns.factory.ShapeType;

// Step 5: Client code demonstration
public class FactoryMethodDemo {

    public static void main(String[] args) {
        System.out.println("======= Factory Method Design Pattern ======");

        // set the type you want
        ShapeType shapeType = ShapeType.SQUARE;
        // get the shape
        Shape shape = getShapeInstance(shapeType);
        // perform operations
        shape.draw();
        shape.computeArea();
    }

    private static Shape getShapeInstance(ShapeType shapeType) {
        Shape shape = null;
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case CIRCLE:
                ShapeFactory circleCreator = new CircleCreator();
                shape = circleCreator.createShape();
                break;
            case RECTANGLE:
                ShapeFactory rectangleCreator = new RectangleCreator();
                shape = rectangleCreator.createShape();
                break;
            case SQUARE:
                ShapeFactory squareCreator = new SquareCreator();
                shape = squareCreator.createShape();
                break;
            default:
                throw new IllegalStateException("ShapeType doesn't exist.");
        }
        return shape;
    }
}
