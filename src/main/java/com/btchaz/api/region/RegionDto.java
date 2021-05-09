package com.btchaz.api.region;

import com.btchaz.api.booking.BookingSimpleDto;
import com.btchaz.api.store.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

@Getter
@NoArgsConstructor
public class RegionDto {
    private String id;
    private String name;
    private Collection<Store> stores;

    public RegionDto(Region r) {

    }

}
