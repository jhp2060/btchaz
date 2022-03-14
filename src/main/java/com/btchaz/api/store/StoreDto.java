package com.btchaz.api.store;

import com.btchaz.api.theme.Theme;
import com.btchaz.api.theme.ThemeSimpleDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class StoreDto {
    private Long id;
    private String name;
    private String siteURI;
    private Collection<ThemeSimpleDto> themes;
    public StoreDto(Store s, Collection<Theme> ts) {
        this.id = s.getId();
        this.name = s.getName();
        this.siteURI = s.getSiteURI();
        // replaced lambda with method reference
        this.themes = ts.stream().map(
                ThemeSimpleDto::new
        ).collect(Collectors.toList());
    }
}
