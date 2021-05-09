package com.btchaz.api.booking;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;

public interface BookingRepository extends MongoRepository<Booking, String> {
    public Booking findByDateTimeAndOpen (LocalDateTime dt, boolean isOpen);
}
