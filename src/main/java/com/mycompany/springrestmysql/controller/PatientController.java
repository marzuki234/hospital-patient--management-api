package com.mycompany.springrestmysql.controller;

import com.mycompany.springrestmysql.dto.CreatePatient;
import com.mycompany.springrestmysql.model.Patient;
import com.mycompany.springrestmysql.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.mycompany.springrestmysql.dto.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.mycompany.springrestmysql.repository.PatientRepository;
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
import com.mycompany.springrestmysql.controller.LogController;
import com.mycompany.springrestmysql.model.Log;
import com.mycompany.springrestmysql.service.LogService;

@Slf4j
@RestController
@RequestMapping("/api")
public class PatientController {

    
      enum bloodType {
  A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE,
AB_POSITIVE, AB_NEGATIVE, O_POSITIVE, O_NEGATIVE
}
      
    private final PatientService patientService;
     LocalDateTime now = LocalDateTime.now();
   private static final Logger logger = LogManager.getLogger(PatientController.class);

    PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    
    
    
      @Autowired
    private PatientRepository patientRepository;
       @Autowired
    private LogService logService;
      
        @Autowired
    private LogController logController;

    @GetMapping("/pesakit")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }
    
    
   
    
    @GetMapping("/pesakit/by-name")
    public List<Patient> findByFirstName(@RequestParam String firstName) {
        // This is a simple derived query method
        return patientRepository.findByFirstName(firstName); 
      //  return null;
    }
    

    
   @GetMapping("/pesakit/pageAndSortPesakit")
    public ResponseEntity<Page<Patient>> pageAndSortPesakit(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "email") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDirection) {
        //patientService.getPatients()
      
        Sort.Direction direction = Sort.Direction.fromString(sortDirection);
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, sortBy));

        Page<Patient> productPage = patientService.findPatientsPaginatedAndSorted(pageable);
        return ResponseEntity.ok(productPage);
                 


    }
    
   

    @GetMapping("/pesakit/{id}")
    public Patient getPatient(@PathVariable Long id) {
        return patientService.getPatient(id);
    }

    @PostMapping("/pesakit")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient savePatient( @RequestBody CreatePatient createPatient) {
        logger.trace("hang tengah masukkan pesakit");
        Patient patient = new Patient();
        
        if(createPatient.getBloodType().toString().equals(bloodType.A_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.A_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.B_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.B_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.AB_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.AB_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.O_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.O_NEGATIVE.toString())){}
       else{
            log.info("blood type"+createPatient.getBloodType());
         throw new CustomNotFoundException("not valid blood type"+createPatient.getBloodType()+"--"+createPatient.getBloodType());
       }
        
        patient.setFirstName(createPatient.getFirstName());
        patient.setLastName(createPatient.getLastName());
        patient.setDateOfBirth(createPatient.getDateOfBirth());
        patient.setPhoneNumber(createPatient.getPhoneNumber());
        patient.setEmail(createPatient.getEmail());
        patient.setAddress(createPatient.getAddress());
        patient.setEmergencyContact(createPatient.getEmergencyContact());
        patient.setBloodType(createPatient.getBloodType());
        patient.setIsActive(createPatient.getIsActive());
        //patient.setUpdatedAt(now);
        patient.setCreatedAt(now);
        logger.trace("hang tengah masukkan pesakit"+createPatient.getFirstName());
        
         Log log = new Log();
          log.setFirstName("SAVENEWPATIENT");
          log.setLastName(createPatient.toString());
           log.setCreatedAt(now);
           logService.saveLog(log);
         
         
         
        return patientService.savePatient(patient);
    }

    
    @GetMapping("/custom-response")
    public ResponseEntity<CustomResponse> getCustomResponse() {
        // Your logic here to get data
        String message = "Data retrieved successfully";
        boolean success = true;
        String data = "Sample data";

        CustomResponse response = new CustomResponse(message, success, data);

        // Return the custom response with a specific HTTP status code (e.g., OK - 200)
        return new ResponseEntity<>(response, HttpStatus.OK);
        // Alternatively, use static factory methods:
        // return ResponseEntity.ok(response);
    }
    
    
    @PutMapping("/pesakits/{id}")
    //@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED) @Valid
    public Patient updatePatient(@Valid @RequestBody CreatePatient createPatient, @PathVariable Long id) {
        Patient patient = patientService.getPatient(id);
        if (createPatient.getFirstName() == null || createPatient.getFirstName() == "") {
    throw new CustomNotFoundException("first name cannot blank mah!");
}

       if(createPatient.getBloodType().toString().equals(bloodType.A_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.A_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.B_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.B_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.AB_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.AB_NEGATIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.O_POSITIVE.toString())){}
       else if(createPatient.getBloodType().toString().equals(bloodType.O_NEGATIVE.toString())){}
       else{
            log.info("blood type"+createPatient.getBloodType());
         throw new CustomNotFoundException("not valid blood type"+createPatient.getBloodType()+"--"+createPatient.getBloodType());
       }
           
        patient.setFirstName(createPatient.getFirstName());
        patient.setLastName(createPatient.getLastName());
        patient.setDateOfBirth(createPatient.getDateOfBirth());
        patient.setPhoneNumber(createPatient.getPhoneNumber());
        patient.setEmail(createPatient.getEmail());
        patient.setAddress(createPatient.getAddress());
        patient.setEmergencyContact(createPatient.getEmergencyContact());
        patient.setBloodType(createPatient.getBloodType());
        patient.setIsActive(createPatient.getIsActive());
        patient.setUpdatedAt(now);
        //patient.setCreatedAt(now);
   
         logger.warn("hang tengah edit pesakit"+createPatient.getFirstName());
         
           Log log = new Log();
          log.setFirstName("EDITPATIENT");
          log.setLastName(createPatient.toString());
           log.setCreatedAt(now);
           logService.saveLog(log);
                   
                   
        return patientService.savePatient(patient);
        //return new ResponseEntity<>(Patient, HttpStatus.BAD_REQUEST);
       
    }

     @DeleteMapping("/pesakits/{id}")
    public Patient deletePatient(@RequestBody CreatePatient createPatient, @PathVariable Long id) {
        Patient patient = patientService.getPatient(id);
        //patientService.getPatient(id).getAddress();
        
        
         patient.setFirstName(patientService.getPatient(id).getFirstName());
        patient.setLastName(patientService.getPatient(id).getLastName());
        patient.setDateOfBirth(patientService.getPatient(id).getDateOfBirth());
        patient.setPhoneNumber(patientService.getPatient(id).getPhoneNumber());
        patient.setEmail(patientService.getPatient(id).getEmail());
        patient.setAddress(patientService.getPatient(id).getAddress());
        patient.setEmergencyContact(patientService.getPatient(id).getEmergencyContact());
        patient.setBloodType(patientService.getPatient(id).getBloodType());
         logger.trace("hang tengah delete pesakit"+createPatient.getFirstName());
        patient.setUpdatedAt(now);
     
        
        
        
        patient.setIsActive(createPatient.getIsActive());
        
        
        Log log = new Log();
          log.setFirstName("DELETEPATIENT");
          log.setLastName("IDDELETE:"+id.toString());
           log.setCreatedAt(now);
           logService.saveLog(log);
        
        
       return patientService.savePatient(patient);
    }
    /*
    @DeleteMapping("/pesakits/{id}")
    public void deleteUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        userService.deleteUser(user);
    }
*/
}
