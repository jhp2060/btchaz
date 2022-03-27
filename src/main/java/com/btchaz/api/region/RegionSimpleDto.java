package com.btchaz.api.region;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegionSimpleDto {
    private Long id;
    private String name;

    public RegionSimpleDto(Region r) {
        id = r.getId();
        name = r.getName();
    }

}
