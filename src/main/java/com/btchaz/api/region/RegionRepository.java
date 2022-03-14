package com.btchaz.api.region;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
    Region findByName(String name);
    @Override Optional<Region> findById(Long id);
}
