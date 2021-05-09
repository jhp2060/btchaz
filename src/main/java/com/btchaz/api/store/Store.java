package com.btchaz.api.store;

import com.btchaz.api.region.Region;
import com.btchaz.api.theme.Theme;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Getter
@Document(collection = "stores")
public class Store {
    @Id
    private String id;
    private String name;
    private String siteURI;
    @DBRef
    private Region region;
    @DBRef
    private Collection<Theme> themes;
}
