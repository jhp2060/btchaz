package com.btchaz.api.booking;

import com.btchaz.api.store.Store;
import com.btchaz.api.theme.Theme;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BookingDto {
    private Long id;
    private LocalDateTime dateTime;
    private boolean isOpen;
    private String themeName;
    private String themeGenre;
    private String storeName;
    private Long storeId;

    public BookingDto(Booking b) {
        this.id = b.getId();
        this.dateTime = b.getDateTime();
        this.isOpen = b.isOpen();
        Theme t = b.getTheme();
        Store s = t.getStore();
        this.themeName = t.getName();
        this.themeGenre =t.getGenre().toString();
        this.storeName = s.getName();
        this.storeId = s.getId();
    }
}
