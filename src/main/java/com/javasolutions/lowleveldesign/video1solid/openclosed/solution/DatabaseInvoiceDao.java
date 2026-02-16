package com.javasolutions.lowleveldesign.video1solid.openclosed.solution;

import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;

// Concrete implementation for DatabaseInvoiceDao
public class DatabaseInvoiceDao implements InvoiceDao {
    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}
