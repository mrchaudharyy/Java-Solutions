package com.javasolutions.lowleveldesign.structuralpatterns.bridge.problem;

// Client
public class Demo {
    public static void main(String[] args) {
        System.out.println("======= Bridge Design Pattern - Problem Demo ======");
        LivingThings dog = new Dog();
        dog.breathe();
        LivingThings fish = new Fish();
        fish.breathe();
        LivingThings whale = new Whale();
        whale.breathe();
        LivingThings tree = new Tree();
        tree.breathe();
    }
}
