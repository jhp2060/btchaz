package com.btchaz.api.region;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RegionRepository extends MongoRepository<Region, Long> {
    public Region findByName(String name);
    @Override Optional<Region> findById(Long id);
}
