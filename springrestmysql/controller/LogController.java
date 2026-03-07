package com.mycompany.springrestmysql.controller;

import com.mycompany.springrestmysql.dto.CreateLog;
import com.mycompany.springrestmysql.model.Log;
import com.mycompany.springrestmysql.service.LogService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.mycompany.springrestmysql.dto.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.mycompany.springrestmysql.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/log")
public class LogController {

    private final LogService logService;
     LocalDateTime now = LocalDateTime.now();
   private static final Logger logger = LogManager.getLogger(LogController.class);

    LogController(LogService logService) {
        this.logService =logService;
    }
    
    
    
      @Autowired
    private LogRepository logRepository;

    @GetMapping("/Log")
    public List<Log> getLogs() {
        return logService.getLogs();
    }
    
    
   
    
    @GetMapping("/Log/by-name")
    public List<Log> findByFirstName(@RequestParam String firstName) {
        // This is a simple derived query method
        return logRepository.findByFirstName(firstName); 
      //  return null;
    }


    @GetMapping("/Log/{id}")
    public Log getLog(@PathVariable Long id) {
        return logService.getLog(id);
    }
    
    @PostMapping("/Log")
    @ResponseStatus(HttpStatus.CREATED)
    public Log saveLog( @RequestBody CreateLog createPatient) {
        logger.trace("hang tengah masukkan log");
        Log log = new Log();
        log.setFirstName(createPatient.getFirstName());
        log.setLastName(createPatient.getLastName());
        //log.setUpdatedAt(now);
        log.setCreatedAt(now);
        logger.trace("hang tengah masukkan pesakit"+createPatient.getFirstName());
        return logService.saveLog(log);
    }

  
    
 

}
