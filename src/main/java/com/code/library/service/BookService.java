//package com.code.library.service;
//
//import com.code.library.domain.Book;
//import com.code.library.domain.BookWithAuthor;
//import com.code.library.domain.Type;
//import com.code.library.dto.BookRequest;
//import com.code.library.repository.BookRepository;
//import com.code.library.repository.BookWithAuthorRepository;
//import com.code.library.repository.TypeRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BookService {
//
//    private final BookWithAuthorRepository bookWithAuthorRepository;
//    private final BookRepository bookRepository;
//    private final TypeRepository typeRepository;
//
//    public BookService(BookWithAuthorRepository bookWithAuthorRepository, BookRepository bookRepository, TypeRepository typeRepository) {
//        this.bookWithAuthorRepository = bookWithAuthorRepository;
//        this.bookRepository = bookRepository;
//        this.typeRepository = typeRepository;
//    }
//
//    public List<BookWithAuthor> getBookWithAuthors() {
//        return this.bookWithAuthorRepository.findAll();
//    }
//
////    public Optional<BookWithAuthor> findById(String id){
////        return bookWithAuthorRepository.findById(id);
////    }
//
//    public Book findById(Long id) {
//        return bookRepository.getById(id);
//    }
//
//    public void delete(Long id) {
//        Book book = findById(id);
//        bookRepository.delete(book);
//    }
//
//    public void addBook(BookRequest bookRequest) {
//        Type type=typeRepository.findByName(bookRequest.getTypeName());
//        bookRepository.save(new Book(bookRequest.getName(),type));
//    }
//
//}
