package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.Patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

import org.springframework.data.domain.Page;

public interface PatientService {

    List<Patient> getPatients();

    Patient getPatient(Long id);
    
    List<Patient> findByFirstName(String firstName);

    Patient savePatient(Patient patient);

    void deletePatient(Patient patient);
   
     Page<Patient> findPatientsPaginatedAndSorted(Pageable pageable);

   
}
