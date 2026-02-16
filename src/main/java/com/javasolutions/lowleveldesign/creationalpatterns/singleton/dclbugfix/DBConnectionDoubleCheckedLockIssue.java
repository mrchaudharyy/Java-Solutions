package com.javasolutions.lowleveldesign.creationalpatterns.singleton.dclbugfix;

// Singleton - Double Checked Locking - Issue Demo
public class DBConnectionDoubleCheckedLockIssue {

    // Double Locking Singleton instance variable
    private static DBConnectionDoubleCheckedLockIssue connectionObj = null;
    int portNumber;

    // Private constructor
    private DBConnectionDoubleCheckedLockIssue(int portNumberValue) {
        portNumber = portNumberValue;
    }

    // Thread Safe Method to return the unique instance of this class
    public static DBConnectionDoubleCheckedLockIssue getConnectionObj() {
        if (connectionObj == null) { // First check
            synchronized (DBConnectionDoubleCheckedLockIssue.class) {
                if (connectionObj == null) { // Second check
                    connectionObj = new DBConnectionDoubleCheckedLockIssue(5567);
                }
            }
        }
        return connectionObj;
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Singleton - Double Checked Locking - Issue - " + this);
    }
}
