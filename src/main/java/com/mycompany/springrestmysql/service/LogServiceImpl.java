package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.exception.LogNotFoundException;

import com.mycompany.springrestmysql.model.Log;
import com.mycompany.springrestmysql.repository.LogRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;

import org.springframework.util.Assert;

@Service

public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public List<Log> getLogs() {
        return (List<Log>)
            logRepository.findAll();
    }
    

    @Override
    public Log getLog(Long id) {
        


        return logRepository.findById(id)
            .orElseThrow(()-> new LogNotFoundException(id));
    }


    @Override
    public List<Log> findByFirstName(String firstName) {
        return (List<Log>)
            logRepository.findByFirstName(firstName);
    }
    
     @Override
    public Log saveLog(Log log) {
        return logRepository.save(log);
    }

    
   
    
}
