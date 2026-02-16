package com.javasolutions.lowleveldesign.interviewquestions.carrental;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.Bill;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.BillManager;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.BillingStrategy;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.DailyBillingStrategy;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.payment.*;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.product.Vehicle;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.product.VehicleInventoryManager;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.product.VehicleType;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.reservation.*;

import java.time.LocalDate;
import java.util.List;

public class Store {

    private final int storeId;
    private final Location storeLocation;
    private final VehicleInventoryManager inventory;
    private final ReservationManager reservationManager;

    private final BillManager billManager;
    private final PaymentManager paymentManager;

    public Store(int storeId, Location location) {

        this.storeId = storeId;
        this.storeLocation = location;
        this.inventory = new VehicleInventoryManager();
        this.billManager = new BillManager(new DailyBillingStrategy(inventory)); //default
        this.paymentManager = new PaymentManager(new UPIPaymentStrategy()); //default
        this.reservationManager = new ReservationManager(inventory);
    }

    // ----------------- Search Vehicles --------------------

    public List<Vehicle> getVehicles(VehicleType type, LocalDate from, LocalDate to) {
        return inventory.getAvailableVehicles(type, from, to);
    }

    // ----------------- Create Reservation -----------------
    public Reservation createReservation(int vehicleId, User user, LocalDate from, LocalDate to,
                                         ReservationType type) throws Exception {
        return reservationManager.createReservation(vehicleId, user, from, to, type);
    }

    // ----------------- Update Reservation -----------------

    public void cancelReservation(int reservationId) {
        reservationManager.cancelReservation(reservationId);
    }

    public void startTrip(int reservationId) {
        reservationManager.startTrip(reservationId);
    }

    public void submitVehicle(int reservationId) {
        reservationManager.submitVehicle(reservationId);
    }

    // ----------------- Billing & Payment ------------------

    public Bill generateBill(int reservationId, BillingStrategy billingStrategy) {
        Reservation r = reservationManager.findByID(reservationId)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        billManager.setBillingStrategy(billingStrategy);
        return billManager.generateBill(r);
    }

    public Payment makePayment(Bill bill, PaymentStrategy paymentStrategy, double paymentAmount) {

        paymentManager.setPaymentStrategy(paymentStrategy);
        Payment payment = paymentManager.makePayment(bill, paymentAmount);

        if (!bill.isBillPaid()) {
            throw new RuntimeException("Payment failed");
        }

        // NOW we can safely remove the reservation from the repo
        reservationManager.remove(bill.getReservationId());
        return payment;
    }


    public VehicleInventoryManager getInventory() {
        return inventory;
    }

    public int getStoreId() {
        return storeId;
    }
}