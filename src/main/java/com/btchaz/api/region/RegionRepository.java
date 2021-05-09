package com.btchaz.api.region;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionRepository extends MongoRepository<Region, String> {
    public Region findByName(String name);
}
