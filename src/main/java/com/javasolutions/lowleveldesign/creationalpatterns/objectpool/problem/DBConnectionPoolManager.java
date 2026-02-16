package com.javasolutions.lowleveldesign.creationalpatterns.objectpool.problem;

import com.javasolutions.lowleveldesign.creationalpatterns.objectpool.resource.DBConnection;

import java.util.ArrayList;
import java.util.List;

// Object Pool
public class DBConnectionPoolManager {
    List<DBConnection> freeConnections = new ArrayList<>();
    List<DBConnection> inUseConnections = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;

    public DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnections.add(new DBConnection());
        }
    }

    public DBConnection getDBConnection() {
        DBConnection dbConnection = null;
        if (freeConnections.isEmpty() && inUseConnections.size() < MAX_POOL_SIZE) {
            freeConnections.add(new DBConnection());
            System.out.println("New DBConnection created and added to freeConnections list.");
            System.out.println("freeConnections size: " + freeConnections.size());
            System.out.println("inUseConnections size: " + inUseConnections.size());
        } else if (freeConnections.isEmpty() && inUseConnections.size() >= MAX_POOL_SIZE) {
            System.out.println("Pool is full. Cannot create new DBConnection.");
            return null;
        }
        dbConnection = freeConnections.remove(freeConnections.size() - 1);
        inUseConnections.add(dbConnection);
        System.out.println("DBConnection retrieved from freeConnections list and added to inUseConnections list.");
        System.out.println("freeConnections size: " + freeConnections.size());
        System.out.println("inUseConnections size: " + inUseConnections.size());
        return dbConnection;
    }

    public void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            inUseConnections.remove(dbConnection);
            freeConnections.add(dbConnection);
            System.out.println("DBConnection released from inUseConnections list and added to freeConnections list.");
            System.out.println("freeConnections size: " + freeConnections.size());
            System.out.println("inUseConnections size: " + inUseConnections.size());
        } else {
            System.out.println("DBConnection is null. Cannot release.");
        }
    }
}
