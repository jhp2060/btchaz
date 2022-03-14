package com.btchaz.api.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findByName(String name);
    @Override  Optional<Store> findById(Long id);
}
