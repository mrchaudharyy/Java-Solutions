package com.javasolutions.lowleveldesign.interviewquestions.couponappln.product;

public class Item3 extends Product {

    public Item3(String name, double price, ProductType type) {
        super(name, price, type);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
