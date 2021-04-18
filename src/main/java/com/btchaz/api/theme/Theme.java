package com.btchaz.api.theme;

import com.btchaz.api.booking.Booking;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "themes")
public class Theme {
    enum Genre {
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
    private Collection<Booking> bookings;
}
