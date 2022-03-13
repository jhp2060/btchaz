package com.btchaz.api.booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    public Booking findByDateTimeAndOpen (LocalDateTime dt, boolean isOpen);
}
