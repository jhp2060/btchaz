package com.btchaz.api.theme;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ThemeRepository extends MongoRepository<Theme, String> {
    public Theme findByName(String name);
    public List<Theme> findByGenre(Theme.Genre genre);
}

