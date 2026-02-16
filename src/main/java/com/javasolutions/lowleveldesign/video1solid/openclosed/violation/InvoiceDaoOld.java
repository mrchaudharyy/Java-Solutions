package com.javasolutions.lowleveldesign.video1solid.openclosed.violation;


import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;

// Responsibility: Managing Database Operations only
public class InvoiceDaoOld {

    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}