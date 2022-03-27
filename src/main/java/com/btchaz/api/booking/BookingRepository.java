package com.btchaz.api.booking;

import com.btchaz.api.theme.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByDateTimeAndOpen (LocalDateTime dt, boolean isOpen);
    Booking findByThemeAndOpen(Theme theme, boolean isOpen);
}