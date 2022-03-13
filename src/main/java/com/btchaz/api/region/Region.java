package com.btchaz.api.region;

import com.btchaz.api.store.Store;
import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "store"
    )
    private Collection<Store> stores;
}
