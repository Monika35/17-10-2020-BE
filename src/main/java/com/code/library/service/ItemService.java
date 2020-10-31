package com.code.library.service;

import com.code.library.domain.Book;
import com.code.library.domain.Item;
import com.code.library.dto.ItemRequest;
import com.code.library.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    private BookService bookService;

    @Autowired
    public ItemRepository getItemRepository() {
        return itemRepository;
    }

    public BookService getBookService() {
        return bookService;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(ItemRequest itemRequest) {
        Book book = bookService.getBook(itemRequest.getBookId());
        Item item = new Item(book);
        return itemRepository.save(item);
    }

    public List<Item> getAll() {
        return itemRepository.findAll();
    }
}
