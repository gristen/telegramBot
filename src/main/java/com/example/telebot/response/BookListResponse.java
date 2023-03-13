package com.example.telebot.response;


import com.example.telebot.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BookListResponse extends BaseResponse{
    public BookListResponse(Iterable<BookEntity> data){
        super(true,"Книги");
        this.data = data;
    }
    private Iterable<BookEntity> data;

}
