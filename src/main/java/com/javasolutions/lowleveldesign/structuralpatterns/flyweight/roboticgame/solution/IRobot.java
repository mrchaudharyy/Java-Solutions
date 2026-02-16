package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.roboticgame.solution;

// Flyweight (Interface) - for the flyweight object – defines methods that use extrinsic state.
public interface IRobot {
    // CoordinateX and CoordinateY are extrinsic data - unique to each object
    void display(int x, int y);
}

