package com.btchaz.api.theme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {
    Theme findByName(String name);
    List<Theme> findByGenre(Theme.Genre genre);
}
