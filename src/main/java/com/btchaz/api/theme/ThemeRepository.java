package com.btchaz.api.theme;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    public Theme findByName(String name);
    public List<Theme> findByGenre(Theme.Genre genre);
}
