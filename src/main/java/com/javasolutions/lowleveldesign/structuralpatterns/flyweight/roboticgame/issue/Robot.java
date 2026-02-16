package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.roboticgame.issue;

// Robot class - Used to create Humanoid and Robotic Dog robots
public class Robot {
    // extrinsic data
    int coordinateX;
    int coordinateY;
    // intrinsic data
    String type;
    Sprites body; // heavy-weight object - 2D bitmap image

    Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }
    // getters and setters
}
