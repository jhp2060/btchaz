package com.btchaz.api.theme;

import com.btchaz.api.booking.Booking;
import com.btchaz.api.store.Store;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Document(collection = "themes")
public class Theme {
    public enum Genre {
        Unknown,
        Horror,
        Adult,
        Adventure,
    }
    @Id
    private String id;
    private String name;
    private Genre genre;
    @DBRef
    private Store store;
    @DBRef
    private Collection<Booking> bookings;
}
