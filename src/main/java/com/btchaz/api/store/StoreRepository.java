package com.btchaz.api.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoreRepository extends JpaRepository<Store, Long> {
    public Store findByName(String name);
    @Override  Optional<Store> findById(Long id);
}
