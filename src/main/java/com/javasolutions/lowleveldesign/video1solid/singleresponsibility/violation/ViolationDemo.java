package com.javasolutions.lowleveldesign.video1solid.singleresponsibility.violation;

// Usage example
public class ViolationDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}
