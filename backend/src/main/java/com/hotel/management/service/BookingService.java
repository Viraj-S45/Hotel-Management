package com.hotel.management.service;

import com.hotel.management.model.Booking;
import com.hotel.management.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookRoom(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id).orElseThrow();
        booking.setStatus("cancelled");
        bookingRepository.save(booking);
    }
}
