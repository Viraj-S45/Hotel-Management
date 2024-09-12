package com.hotel.management.controller;

import com.hotel.management.model.Booking;
import com.hotel.management.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookRoom(@RequestBody Booking booking) {
        return bookingService.bookRoom(booking);
    }

    @PutMapping("/cancel/{id}")
    public void cancelBooking(@PathVariable Long id) {
        bookingService.cancelBooking(id);
    }
}
