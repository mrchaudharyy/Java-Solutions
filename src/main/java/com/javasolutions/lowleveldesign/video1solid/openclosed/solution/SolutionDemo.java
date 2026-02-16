package com.javasolutions.lowleveldesign.video1solid.openclosed.solution;

import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Invoice;
import com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution.Marker;

// Usage demonstrating OCP compliance
public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
        invoice.calculateTotal();

        InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save(); // Save to DB

        InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save(); // Save to File

        // The system is:
        // - OPEN for extension (new save functions can be added)
        // - CLOSED for modification (existing code remains unchanged)
    }
}

