package com.code.library.service;

import com.code.library.domain.Genre;
import com.code.library.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAll() {
        return genreRepository.findAll();
    }

    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public Genre getGenre(int id) {
        return genreRepository.getById(id);
    }

    public Genre getGenreByName(String genreName) {
        return genreRepository.getByName(genreName);
    }
}
