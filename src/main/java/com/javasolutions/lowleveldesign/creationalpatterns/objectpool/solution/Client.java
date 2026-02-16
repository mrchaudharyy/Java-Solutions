package com.javasolutions.lowleveldesign.creationalpatterns.objectpool.solution;

import com.javasolutions.lowleveldesign.creationalpatterns.objectpool.resource.DBConnection;

// Client - Object Pool Solution Demo
public class Client {
    public static void main(String[] args) {
        System.out.println("======= Object Pool Design Pattern ======");

        // Creating a DBConnectionPoolManager
        DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();

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
        DBConnection dbConnection7 = poolManager.getDBConnection(); // Reusing the released DBConnection

        // ******** Solution Demo **********
        // What happens if another client tries to create a new DBConnectionPoolManager?
        DBConnectionPoolManager poolManager2 = DBConnectionPoolManager.getInstance();
        System.out.println("====== Same Instance? ======");
        System.out.println(poolManager == poolManager2 ? "Same instance of DBConnectionPoolManager" : "Different instances of " +
                "DBConnectionPoolManager");
    }
}
