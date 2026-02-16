package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.roboticgame.issue;

// Client Code - Robotic game creating robots
public class Demo {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        // Create 5L Humanoid robots
        for (int i = 0; i < 500000; i++) {
            Sprites humanoidSprite = new Sprites();
            Robot humanoidRobotObject = new Robot(x + i, y + i, "HUMANOID", humanoidSprite);
        }
        // Create 50L Robotic Dog robots
        for (int i = 0; i < 500000; i++) {
            Sprites roboticDogSprite = new Sprites();
            Robot roboticDogObject = new Robot(x + i, y + i, "ROBOTIC_DOGS", roboticDogSprite);
        }
        // A total of 10L robots created will result in 10L Sprite objects created
        // which will consume a lot of memory.
    }
}