package com.javasolutions.lowleveldesign.interviewquestions.carrental.reservation;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.User;
import com.javasolutions.lowleveldesign.interviewquestions.carrental.product.VehicleInventoryManager;

import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ReservationManager {

    private final VehicleInventoryManager inventory;
    private final ReservationRepository reservationRepository;

    private final AtomicInteger reservationIdGenerator = new AtomicInteger(20000);

    public ReservationManager(VehicleInventoryManager inventory) {
        this.inventory = inventory;
        this.reservationRepository = new ReservationRepository();
        this.inventory.setReservationRepository(this.reservationRepository);

    }

    // ----------------- Get Reservation -----------------
    public Optional<Reservation> findByID(int reservationId) {

        return reservationRepository.findById(reservationId);
    }


    // ----------------- Create Reservation -----------------

    public Reservation createReservation(int vehicleId, User user,
                                         LocalDate from,
                                         LocalDate to,
                                         ReservationType type) throws Exception {

        int reservationId = reservationIdGenerator.getAndIncrement();
        boolean reserved = inventory.reserve(vehicleId, reservationId, from, to);

        if (!reserved) {
            throw new RuntimeException("Vehicle not available for selected dates");
        }

        Reservation reservation = new Reservation(reservationId, vehicleId,
                user.getUserId(), from, to, type);

        reservationRepository.save(reservation);
        return reservation;
    }

    // ----------------- Cancel -----------------------------

    public void cancelReservation(int reservationId) {

        Optional<Reservation> opt = reservationRepository.findById(reservationId);
        if (!opt.isPresent()) {
            throw new RuntimeException("Reservation not found");
        }

        Reservation r = opt.get();
        r.setReservationStatus(ReservationStatus.CANCELLED);

        inventory.release(
                r.getVehicleId(),
                r.getReservationId());

        reservationRepository.remove(reservationId);
    }

    // ----------------- Start Trip -------------------------

    public void startTrip(int reservationId) {
        Reservation r = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        r.setReservationStatus(ReservationStatus.IN_USE);
    }

    // ----------------- Submit Vehicle ---------------------

    public void submitVehicle(int reservationId) {

        Reservation r = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        r.setReservationStatus(ReservationStatus.COMPLETED);

        inventory.release(
                r.getVehicleId(),
                r.getReservationId()
        );
    }

    // ----------------- remove reservation ---------------------
    public void remove(int reservationId) {
        reservationRepository.remove(reservationId);
    }


}
