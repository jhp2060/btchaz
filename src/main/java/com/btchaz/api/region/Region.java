package com.btchaz.api.region;

import com.btchaz.api.store.Store;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "region" // the member variable of Store
    )
    private Collection<Store> stores;
}
