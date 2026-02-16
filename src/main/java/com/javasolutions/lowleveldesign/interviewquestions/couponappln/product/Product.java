package com.javasolutions.lowleveldesign.interviewquestions.couponappln.product;

public abstract class Product {

    String name;
    double originalPrice;
    ProductType type;

    public Product(String name, double price, ProductType type) {
        this.name = name;
        this.originalPrice = price;
        this.type = type;
    }

    public abstract double getPrice();

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}