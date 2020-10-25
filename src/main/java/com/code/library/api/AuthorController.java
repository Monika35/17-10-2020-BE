package com.code.library.api;

import com.code.library.domain.Author;
import com.code.library.service.AuthorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
