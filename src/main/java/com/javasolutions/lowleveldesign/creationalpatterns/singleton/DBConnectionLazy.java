package com.javasolutions.lowleveldesign.creationalpatterns.singleton;

// 2. Lazy Initialization Singleton
public class DBConnectionLazy {

    private static DBConnectionLazy instance = null;

    // The private constructor prevents instantiation
    private DBConnectionLazy() {
    }

    // Singleton Object is created only when it is required
    // This method returns the unique instance of this class
    // Drawback: This implementation is not thread-safe.
    public static DBConnectionLazy getInstance() {
        if (instance == null) {
            instance = new DBConnectionLazy();
        }
        return instance;
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Lazy Initialization - Singleton - " + this);
    }
}
