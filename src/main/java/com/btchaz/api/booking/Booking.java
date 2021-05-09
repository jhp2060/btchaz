package com.btchaz.api.booking;

import com.btchaz.api.theme.Theme;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Getter
@Document(collection = "bookings")
public class Booking {
    @Id
    private String id;
    private LocalDateTime dateTime;
    private boolean isOpen;
    @DBRef
    private Theme theme;
}
