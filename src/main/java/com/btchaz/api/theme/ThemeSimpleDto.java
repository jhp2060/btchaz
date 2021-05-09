package com.btchaz.api.theme;

import com.btchaz.api.booking.BookingSimpleDto;
import com.btchaz.api.store.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

@Getter
@NoArgsConstructor
public class ThemeSimpleDto {
    private String name;
    private String genre;
    public ThemeSimpleDto(Theme t) {
        this.name = t.getName();
        this.genre = t.getGenre().toString();
    }
}
