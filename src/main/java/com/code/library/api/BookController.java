package com.code.library.api;

import com.code.library.domain.BookWithAuthor;
import com.code.library.dto.BookRequest;
import com.code.library.repository.TypeRepository;
import com.code.library.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/books")
@CrossOrigin
public class BookController {
    private final BookService bookService;
    private final TypeRepository typeRespository;

    public BookController(BookService bookService, TypeRepository typeRespository) {
        this.bookService = bookService;
        this.typeRespository = typeRespository;
    }

    @GetMapping(value = "/")
    public List<BookWithAuthor> getBookWithAuthors() {
        return bookService.getBookWithAuthors();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        bookService.delete(id);

        return new ResponseEntity<String>("Book was deleted", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/post")
    public void addBook(@RequestBody BookRequest bookRequest) {
        bookService.addBook(bookRequest);
    }
}
