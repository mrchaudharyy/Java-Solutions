package com.javasolutions.lowleveldesign.video1solid.openclosed.violation;


import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;

// Responsibility: Managing Database Operations and File Operations
// BAD: This class violates OCP - needs modification for every new kind of save function
public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }

    // BAD: This design violates OCP
    // Every time we add a new save function, we need to modify existing InvoiceDao class
    public void saveToFile() {
        // Save into the file
        System.out.println("Saving to file...");
    }
}