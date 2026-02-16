package com.javasolutions.lowleveldesign.creationalpatterns.singleton;

// 4. Double Locking Singleton
public class DBConnectionDoubleLocking {

    // Double Locking Singleton instance variable
    private static DBConnectionDoubleLocking instance = null;

    // Private constructor
    private DBConnectionDoubleLocking() {
    }

    // Thread Safe Method to return the unique instance of this class
    public static DBConnectionDoubleLocking getInstance() {
        if (instance == null) { // First check
            synchronized (DBConnectionDoubleLocking.class) {
                if (instance == null) { // Second check
                    instance = new DBConnectionDoubleLocking();
                }
            }
        }
        return instance;
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Double Locking Singleton - " + this);
    }
}
