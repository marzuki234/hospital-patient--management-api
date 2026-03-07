package com.mycompany.springrestmysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PatientFirstNameNotFoundException extends RuntimeException {

    public PatientFirstNameNotFoundException(String id) {
        super("Could not find patient " + id);
    }
    
     
}
