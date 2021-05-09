package com.btchaz.api.region;

import com.btchaz.api.store.Store;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Document(collection = "regions")
public class Region {
    @Id
    private String id;
    private String name;
    @DBRef
    private Collection<Store> stores;
}
