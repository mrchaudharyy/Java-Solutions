package com.javasolutions.lowleveldesign.interviewquestions.couponappln;

import com.javasolutions.lowleveldesign.interviewquestions.couponappln.product.*;

public class Demo {

    public static void main(String[] args) {

        System.out.println("\n###### LLD - Coupon Application System Demo ######\n");

        // Create Products
        Product item1 = new Item1("Fan", 1500, ProductType.ELECTRONICS);
        Product item2 = new Item2("Office Chair", 6000, ProductType.FURNITURE);
        Product item3 = new Item3("Omega3-Tabs", 600, ProductType.PHARMACY);
        Product item4 = new Item4("Shirt", 1200, ProductType.CLOTHES);

        // Shopping Cart
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);
        cart.addToCart(item3);
        cart.addToCart(item4);

        // Calculate Total Price
        System.out.println("\n===>>> Total Price after discount: " + cart.getTotalPrice());
    }
}
