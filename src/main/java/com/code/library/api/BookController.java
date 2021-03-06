package com.code.library.api;

import com.code.library.domain.Book;
import com.code.library.dto.BookRequest;
import com.code.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/api/books")
@CrossOrigin
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value="/list")
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/add")
    public Book addBook(@RequestBody BookRequest book) {
        return bookService.addBook(book);
    }

    @GetMapping(path="/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.getBook(Integer.parseInt(id));
    }

//    @GetMapping(value = "/")
//    public List<BookWithAuthor> getBookWithAuthors() {
//        return bookService.getBookWithAuthors();
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
//        bookService.delete(id);
//
//        return new ResponseEntity<String>("Book was deleted", HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/post")
//    public void addBook(@RequestBody BookRequest bookRequest) {
//        bookService.addBook(bookRequest);
//    }
}
