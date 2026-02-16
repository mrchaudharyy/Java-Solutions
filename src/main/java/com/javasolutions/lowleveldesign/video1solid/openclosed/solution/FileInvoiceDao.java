package com.javasolutions.lowleveldesign.video1solid.openclosed.solution;

import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;

// Concrete implementation for FileInvoiceDao
// NEW File Save Operation: An extension without modification!
public class FileInvoiceDao implements InvoiceDao {

    Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // Save into the file the invoice
        System.out.println("Saving to file...");
    }
}
