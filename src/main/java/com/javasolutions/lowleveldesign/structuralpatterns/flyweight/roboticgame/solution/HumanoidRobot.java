package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.roboticgame.solution;

// Concrete Flyweight (Class) - implements the Flyweight interface and stores intrinsic state.
public class HumanoidRobot implements IRobot {
    // intrinsic data - shared data - common to all objects
    private final String type; // humanoid or robotic dog
    private final Sprites body; //small 2d bitmap (graphic element)

    HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the humanoid sprites object
        // and X and Y coordinate to render the image.
        System.out.println("Displaying " + type + " at " + x + ", " + y);
    }
}
