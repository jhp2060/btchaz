package com.btchaz.api.theme;

import com.btchaz.api.booking.Booking;
import com.btchaz.api.store.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Theme {
    public enum Genre {
        Unknown,
        Horror,
        Adult,
        Adventure,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    private String name;
    private Genre genre;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;

    @OneToMany(
            mappedBy = "theme",   // the member variable of Booking
            cascade = CascadeType.ALL
    )
    private List<Booking> bookings;
}
