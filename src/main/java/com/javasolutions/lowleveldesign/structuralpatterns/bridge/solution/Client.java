package com.javasolutions.lowleveldesign.structuralpatterns.bridge.solution;

// Client Usage
public class Client {
    public static void main(String[] args) {
        System.out.println("======= Bridge Design Pattern - Solution Demo ======");

        LivingThings dog = new Dog(new LungBreathing());
        LivingThings fish = new Fish(new GillBreathing());
        LivingThings tree = new Tree(new Photosynthesis());

        dog.breathe();
        fish.breathe();
        tree.breathe();
    }
}
