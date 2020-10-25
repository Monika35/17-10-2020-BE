package com.code.library.service;

import com.code.library.domain.Book;
import com.code.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

//    private final BookWithAuthorRepository bookWithAuthorRepository;
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) { this.bookRepository = bookRepository; }

    public List<Book> getAll() {
        System.out.println("List All Books");
        return bookRepository.findAll();
    }

    public Book addBook(Book book)  {
        return bookRepository.save(book);
    }


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
