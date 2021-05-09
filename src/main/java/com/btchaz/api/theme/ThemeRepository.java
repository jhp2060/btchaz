package com.btchaz.api.theme;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ThemeRepository extends MongoRepository<Theme, String> {
    public Theme findByName(String name);
    public Theme findByGenre(String genre);
}

