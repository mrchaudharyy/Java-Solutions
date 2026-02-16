package com.javasolutions.lowleveldesign.creationalpatterns.singleton;

// Test Singleton Implementation
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("======= Singleton Design Pattern ======");

        System.out.println("====== Testing Eager Initialization ======");
        // SingletonObject obj = new SingletonObject(); --> Compilation error
        // Get the unique instance of SingletonObject
        DBConnectionEager eager1 = DBConnectionEager.getInstance();
        DBConnectionEager eager2 = DBConnectionEager.getInstance();
        // Display the message
        eager1.displayMessage();
        eager2.displayMessage();
        // Check if the instances are the same
        System.out.println("Same instance? " + (eager1 == eager2)); // true

        System.out.println("====== Testing Lazy Initialization ======");
        // Get the unique instance of SingletonObject
        DBConnectionLazy lazy1 = DBConnectionLazy.getInstance();
        DBConnectionLazy lazy2 = DBConnectionLazy.getInstance();
        // Display the message
        lazy1.displayMessage();
        lazy2.displayMessage();
        // Check if the instances are the same
        System.out.println("Same instance? " + (lazy1 == lazy2)); // true

        System.out.println("====== Testing Thread Safe ======");
        // Get the unique instance of SingletonObject
        DBConnectionThreadSafe threadSafe1 = DBConnectionThreadSafe.getInstance();
        DBConnectionThreadSafe threadSafe2 = DBConnectionThreadSafe.getInstance();
        // Display the message
        threadSafe1.displayMessage();
        threadSafe2.displayMessage();
        // Check if the instances are the same
        System.out.println("Same instance? " + (threadSafe1 == threadSafe2)); // true

        System.out.println("====== Testing Double Locking ======");
        // Get the unique instance of SingletonObject
        DBConnectionDoubleLocking doubleLocking1 = DBConnectionDoubleLocking.getInstance();
        DBConnectionDoubleLocking doubleLocking2 = DBConnectionDoubleLocking.getInstance();
        // Display the message
        doubleLocking1.displayMessage();
        doubleLocking2.displayMessage();
        // Check if the instances are the same
        System.out.println("Same instance? " + (doubleLocking1 == doubleLocking2)); // true

    }
}
