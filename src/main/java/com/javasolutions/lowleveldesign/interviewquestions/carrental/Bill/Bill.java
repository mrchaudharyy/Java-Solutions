package com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill;


public class Bill {

    private int billId;
    private int reservationId;
    private double totalBillAmount;
    private boolean billPaid;

    public Bill(int billId, int reservationId, double totalBillAmount) {
        this.billId = billId;
        this.reservationId = reservationId;
        this.totalBillAmount = totalBillAmount;
        this.billPaid = false;
    }

    // ----------------- Getters / Setters -----------------

    public int getBillId() {
        return billId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public boolean isBillPaid() {
        return billPaid;
    }

    public void setBillPaid(boolean billPaid) {
        this.billPaid = billPaid;
    }
}