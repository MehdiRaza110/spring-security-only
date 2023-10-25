package com.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BlogAPIException extends RuntimeException {

        public BlogAPIException(String message){
            super(message);
        }

}
