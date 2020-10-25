package com.code.library.api;

import com.code.library.domain.Genre;
import com.code.library.service.GenreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/genre")
@CrossOrigin
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService) { this.genreService = genreService; }

    @GetMapping(value="/list")
    public List<Genre> listAllGenres() {
        return genreService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/add")
    public Genre addGenre(@RequestBody Genre genre) {
        return genreService.addGenre(genre);
    }

    @GetMapping(path="/{name}")
    public Genre getGenre(@PathVariable String name) {
        return genreService.getGenreByName(name);
    }

}
