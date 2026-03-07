package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.Log;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import org.springframework.data.domain.Page;

public interface LogService {

    List<Log> getLogs();

    Log getLog(Long id);
    
    List<Log> findByFirstName(String firstName);
    
    Log saveLog(Log log);



   
}
