package com.javasolutions.lowleveldesign.interviewquestions.book_my_show.controllers;

import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.entities.Booking;
import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.entities.Show;
import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.entities.User;
import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.service.BookingService;

import java.util.List;
import java.util.UUID;

public class BookingController {

    private final BookingService bookingService;

    public BookingController() {
        this.bookingService = new BookingService();
    }

    public Booking createBooking(User user, Show show, List<Integer> seats) {
        Booking booking = bookingService.book(user, show, seats);
        return booking;
    }

    public Booking getBooking(UUID bookingId) {
        return bookingService.getBooking(bookingId);
    }

    public List<Booking> getBookingsForUser(User user) {
        return bookingService.getBookingsForUser(user);
    }
}
