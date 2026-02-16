package com.javasolutions.lowleveldesign.interviewquestions.carrental.reservation;


import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ReservationRepository {

    // reservationId → Reservation
    private final Map<Integer, Reservation> reservations;

    public ReservationRepository() {
        this.reservations = new ConcurrentHashMap<>();
    }

    // Save or update reservation
    public void save(Reservation reservation) {
        reservations.put(reservation.getReservationId(), reservation);
    }

    // Lookup reservation by ID
    public Optional<Reservation> findById(int reservationId) {
        return Optional.ofNullable(reservations.get(reservationId));
    }

    // Delete reservation from repository
    public void remove(int reservationId) {
        reservations.remove(reservationId);
    }

    // Return all reservations (for reporting/debug)
    public Map<Integer, Reservation> getAll() {
        return reservations;
    }
}

