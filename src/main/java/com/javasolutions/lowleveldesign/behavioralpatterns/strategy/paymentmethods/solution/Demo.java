package com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution;

import com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy.CreditCardPayment;
import com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy.PayPalPayment;
import com.javasolutions.lowleveldesign.behavioralpatterns.strategy.paymentmethods.solution.strategy.UPIPayment;

// Client code - to simulate payment processing
public class Demo {
    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Payment Processor ######");

        // Create a shopping cart and set payment strategy
        ShoppingCart cart = new ShoppingCart();

        // Choosing payment behavior at runtime
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);
        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        cart.checkout(200.0);
        cart.setPaymentStrategy(new UPIPayment("9988776655@ybl"));
        cart.checkout(300.0);
        // Adding another payment method(crypto) is as simple as adding a new strategy class
        // No need to modify existing code - good design
        // cart.setPaymentStrategy(new CryptoPayment("BTC"));
        // cart.checkout(400.0);
    }
}
