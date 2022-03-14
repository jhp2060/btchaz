package com.btchaz.api.booking;

import com.btchaz.api.theme.Theme;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    private LocalDateTime dateTime;
    private boolean isOpen;

    @ManyToOne
    @JoinColumn(name="theme_id")
    private Theme theme;
}