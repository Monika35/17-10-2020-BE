package com.code.library.service;

import com.code.library.domain.Author;
import com.code.library.domain.Book;
import com.code.library.domain.Genre;
import com.code.library.dto.AuthorRequest;
import com.code.library.dto.BookRequest;
import com.code.library.dto.GenreRequest;
import com.code.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookService {

//    private final BookWithAuthorRepository bookWithAuthorRepository;
    private final BookRepository bookRepository;

    private AuthorService authorService;
    private GenreService genreService;

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Autowired
    public void setGenreService(GenreService genreService) {
        this.genreService = genreService;
    }

    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    public List<Book> getAll() {
        System.out.println("List All Books");
        return bookRepository.findAll();
    }

    public Book addBook(BookRequest bookReq)  {
        Book book = new Book(bookReq.getTitle(), bookReq.getIsbn(), bookReq.getDescription(), bookReq.getImg());

        Set<Author> authors = new HashSet<>();
        for (AuthorRequest a : bookReq.getAuthors()) {
            Author author = authorService.getOrCreateAuthor(a.getName());
            authors.add(author);
        }
        book.setAuthors(authors);

        Set<Genre> genres = new HashSet<>();
        for (GenreRequest g: bookReq.getGenres()) {
            Genre genre = genreService.getOrCreateGenre(g.getName());
            genres.add(genre);
        }
        book.setGenres(genres);

        return bookRepository.save(book);
    }

    public Book getBook(Integer bookId) {
        return bookRepository.getById(bookId);
    }

//    public List<Book> allBooks() {
//        return bookRepository.allBooks();
//    }


//    private final TypeRepository typeRepository;

//    public BookService(BookWithAuthorRepository bookWithAuthorRepository, BookRepository bookRepository, TypeRepository typeRepository) {
//        this.bookWithAuthorRepository = bookWithAuthorRepository;
//        this.bookRepository = bookRepository;
//        this.typeRepository = typeRepository;
//    }

//    public List<BookWithAuthor> getBookWithAuthors() {
//        return this.bookWithAuthorRepository.findAll();
//    }

//    public Optional<BookWithAuthor> findById(String id){
//        return bookWithAuthorRepository.findById(id);
//    }

//    public Book findById(Long id) {
//        return bookRepository.getById(id);
//    }

//    public void delete(Long id) {
//        Book book = findById(id);
//        bookRepository.delete(book);
//    }
//
//    public void addBook(BookRequest bookRequest) {
//        Type type=typeRepository.findByName(bookRequest.getTypeName());
//        bookRepository.save(new Book(bookRequest.getTitle(),type));
//    }

}
