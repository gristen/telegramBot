package com.example.telebot.response;


import com.example.telebot.entity.AuthorEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorResponse extends BaseResponse {
    public AuthorResponse(Boolean success, String message, AuthorEntity author){
        super(success,message);
        this.author = author;
    }
    public  AuthorResponse(AuthorEntity author){super(true,"Author data");}
    private AuthorEntity author;
}
