package com.javasolutions.lowleveldesign.structuralpatterns.facade;

// Facade hides complexity and provides a simple unified interface
public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;
    private final NotificationService notification;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
    }

    // Simplified method for clients
    public void placeOrder(String productId, String paymentMethod) {

        // The following steps are hidden from the client and need to be executed in a specific order
        System.out.println("Placing order for product: " + productId);

        // Step 1: Check stock
        if (!inventory.checkStock(productId)) {
            System.out.println("Product out of stock!");
            return;
        }

        // Step 2: Make payment
        if (!payment.makePayment(paymentMethod)) {
            System.out.println("Payment failed!");
            return;
        }

        // Step 3: Ship product
        shipping.shipProduct(productId);

        // Step 4: Send confirmation
        notification.sendConfirmation(productId);

        System.out.println("Order placed successfully!");
    }
}
