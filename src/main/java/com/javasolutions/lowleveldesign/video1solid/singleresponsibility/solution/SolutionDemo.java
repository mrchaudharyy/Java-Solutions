package com.javasolutions.lowleveldesign.video1solid.singleresponsibility.solution;

// Usage example showing how all classes work together
public class SolutionDemo {
    public static void main(String[] args) {
        // create the service objects
        Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        // use the services
        invoice.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.print();
    }
}
