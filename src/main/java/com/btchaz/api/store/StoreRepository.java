package com.btchaz.api.store;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String> {
    public Store findByName(String name);
}
