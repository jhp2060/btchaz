package com.btchaz.api.store;

import com.btchaz.api.theme.Theme;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "stores")
public class Store {
    @Id
    private String id;
    private String name;
    @DBRef
    private Collection<Theme> themes;
}
