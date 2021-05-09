package com.btchaz.api.theme;

import com.btchaz.api.booking.Booking;
import com.btchaz.api.booking.BookingSimpleDto;
import com.btchaz.api.store.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class ThemeDto {
    private String id;
    private String name;
    private String genre;
    private String storeName;
    private String storeId;
    private LocalDate bookingDate;
    private Collection<BookingSimpleDto> bookings;
    public ThemeDto(Theme t,
                    LocalDate d,
                    Collection<Booking> bs) {
        this.id = t.getId();
        this.name = t.getName();
        this.genre = t.getGenre().toString();
        Store s = t.getStore();
        this.storeName = s.getName();
        this.storeId = s.getId();
        this.bookingDate = d;
        this.bookings = bs.stream().map(
                BookingSimpleDto::new
        ).collect(Collectors.toList());
    }


}
