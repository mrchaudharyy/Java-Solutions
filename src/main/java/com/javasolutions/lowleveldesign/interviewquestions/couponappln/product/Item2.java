package com.javasolutions.lowleveldesign.interviewquestions.couponappln.product;

public class Item2 extends Product {

    public Item2(String name, double price, ProductType type) {
        super(name, price, type);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
