package com.code.library.api;

import com.code.library.domain.Author;
import com.code.library.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/author")
@CrossOrigin
public class AuthorController {

    private final AuthorService authorService;


    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping(value = "/")
    public List<Author> getBookWithAuthors() {
        return authorService.getAll();
    }

}
