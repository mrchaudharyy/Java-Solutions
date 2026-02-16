package com.javasolutions.lowleveldesign.creationalpatterns.singleton.dclbugfix;

// Singleton - Double Checked Locking - Fix Demo
public class DBConnectionDoubleCheckedLockFix {

    // volatile keyword is used to ensure that the value of the variable
    // is fetched from the memory every time.
    private static volatile DBConnectionDoubleCheckedLockFix connectionObj = null;

    int portNumber;

    private DBConnectionDoubleCheckedLockFix(int portNumberValue) {
        portNumber = portNumberValue;
    }

    // Thread Safe Method to return the unique instance of this class
    public static DBConnectionDoubleCheckedLockFix getConnectionObj(int portNumberValue) {
        if (connectionObj == null) {
            synchronized (DBConnectionDoubleCheckedLockFix.class) {
                if (connectionObj == null) {
                    connectionObj = new DBConnectionDoubleCheckedLockFix(portNumberValue);
                }
            }
        }
        return connectionObj;
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Singleton - Double Checked Locking - Fix - " + this);
    }
}
