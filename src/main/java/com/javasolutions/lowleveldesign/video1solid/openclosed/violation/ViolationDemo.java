package com.javasolutions.lowleveldesign.video1solid.openclosed.violation;


import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;
import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Marker;

// Usage example - showing the problem
public class ViolationDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
        invoice.calculateTotal();

        InvoiceDao databaseFileSave = new InvoiceDao(invoice);
        databaseFileSave.saveToDB(); // Save to DB
        databaseFileSave.saveToFile(); // Save to File

        // Problem: If we want to add a new function like saveToMongoDB(),
        // we need to modify InvoiceDao and all its derived classes(if exists)
        // This violates the "closed for modification" part of OCP
    }
}
