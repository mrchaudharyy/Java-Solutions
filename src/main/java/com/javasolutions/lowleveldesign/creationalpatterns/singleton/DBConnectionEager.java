package com.javasolutions.lowleveldesign.creationalpatterns.singleton;

// 1. Eager Initialization - Singleton
public class DBConnectionEager {

    // The single instance, created immediately
    private static final DBConnectionEager instance = new DBConnectionEager();

    // The private constructor prevents instantiation
    private DBConnectionEager() {
    }

    // Method to return the unique instance of this class
    public static DBConnectionEager getInstance() {
        return instance;
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Eager Initialization - Singleton - " + this);
    }
}
