package com.btchaz.api.theme;

import com.btchaz.api.theme.Theme.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeService {
    private ThemeRepository themeRepository;

    public Theme findById(String id) {
        return themeRepository.findById(id).orElseThrow();
    }

    public List<Theme> findByGenre(String g) {
        Genre genre = Genre.valueOf(g);
        return themeRepository.findByGenre(genre);
    }
}
