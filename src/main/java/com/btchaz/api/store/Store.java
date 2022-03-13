package com.btchaz.api.store;

import com.btchaz.api.region.Region;
import com.btchaz.api.theme.Theme;
import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;
    private String name;
    private String siteURI;

    @ManyToOne
    @JoinColumn(name="region_id")
    private Region region;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "theme"
    )
    private Collection<Theme> themes;
}
