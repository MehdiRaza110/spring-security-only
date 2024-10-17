package com.spring_boot_security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BlogAPIException extends RuntimeException {

    public BlogAPIException(String message){
        super(message);
    }

}
