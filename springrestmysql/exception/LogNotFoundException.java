package com.mycompany.springrestmysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LogNotFoundException extends RuntimeException {

    public LogNotFoundException(Long id) {
        super("Could not find patient " + id);
    }
    
   
}
