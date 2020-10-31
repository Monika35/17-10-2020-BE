package com.code.library.dto;

public class ItemRequest {
    private Integer bookId;

    public ItemRequest() {}

    public ItemRequest(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}
