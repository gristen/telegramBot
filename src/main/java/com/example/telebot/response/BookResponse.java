package com.example.telebot.response;


import com.example.telebot.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookResponse extends BaseResponse{
    public BookResponse(boolean success, String message, BookEntity book){
        super(success, message);
        this.book = book;
    }
    public BookResponse(BookEntity book){super(true,"Book data");}
    private BookEntity book;
}
