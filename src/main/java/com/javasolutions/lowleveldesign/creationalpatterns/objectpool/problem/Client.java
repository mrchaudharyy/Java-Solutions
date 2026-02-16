package com.javasolutions.lowleveldesign.creationalpatterns.objectpool.problem;

import com.javasolutions.lowleveldesign.creationalpatterns.objectpool.resource.DBConnection;

// Client - Object Pool Problem Demo
public class Client {
    public static void main(String[] args) {
        // Creating a DBConnectionPoolManager
        DBConnectionPoolManager poolManager = new DBConnectionPoolManager();

        // Creating 6 DBConnections (MAX_POOL_SIZE is 6)
        DBConnection dbConnection1 = poolManager.getDBConnection();
        DBConnection dbConnection2 = poolManager.getDBConnection();
        DBConnection dbConnection3 = poolManager.getDBConnection();
        DBConnection dbConnection4 = poolManager.getDBConnection();
        DBConnection dbConnection5 = poolManager.getDBConnection();
        DBConnection dbConnection6 = poolManager.getDBConnection();

        // 7th DBConnection will not be created as the pool is full (returns null)
        DBConnection nullDBConnection = poolManager.getDBConnection();
        System.out.println(nullDBConnection == null ? "DBConnection is null as POOL is full." : "DBConnection is not null");
        poolManager.releaseDBConnection(dbConnection6); // Releasing a DBConnection
        DBConnection dbConnection = poolManager.getDBConnection(); // Reusing the released DBConnection

        // ****** Issues with this code ******
        // What happens if another client tries to create a new DBConnectionPoolManager?
        DBConnectionPoolManager poolManager2 = new DBConnectionPoolManager();
        // more connections added to the pool that exceeds the MAX_POOL_SIZE
        System.out.println("====== Same Instance? ======");
        System.out.println(poolManager == poolManager2 ? "Same instance of DBConnectionPoolManager" : "Different instances of " +
                "DBConnectionPoolManager");

    }
}
