package com.btchaz.api.booking;

import com.btchaz.api.store.Store;
import com.btchaz.api.theme.Theme;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BookingSimpleDto {
    private Long id;
    private LocalDateTime dateTime;

    public BookingSimpleDto(Booking b) {
        this.id = b.getId();
        this.dateTime = b.getDateTime();
    }
}
