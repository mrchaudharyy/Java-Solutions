package com.javasolutions.lowleveldesign.structuralpatterns.facade;

// Subsystem A: Inventory
public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true; // assume it's always in stock
    }
}
