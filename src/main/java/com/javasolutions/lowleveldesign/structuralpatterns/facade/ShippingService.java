package com.javasolutions.lowleveldesign.structuralpatterns.facade;

// Subsystem C: Shipping
public class ShippingService {
    public void shipProduct(String productId) {
        System.out.println("Shipping product: " + productId);
    }
}