package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.exception.PatientNotFoundException;
import com.mycompany.springrestmysql.exception.PatientFirstNameNotFoundException;


import com.mycompany.springrestmysql.model.Patient;
import com.mycompany.springrestmysql.repository.PatientRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Page;

import org.springframework.util.Assert;

@Service

public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        return (List<Patient>)
            patientRepository.findAll();
    }
    

    @Override
    public Patient getPatient(Long id) {
        


        return patientRepository.findById(id)
            .orElseThrow(()-> new PatientNotFoundException(id));
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
    
        patientRepository.delete(patient);
    }
    
    @Override
    public List<Patient> findByFirstName(String firstName) {
        return (List<Patient>)
            patientRepository.findByFirstName(firstName);
    }
    
    
      public Page<Patient> findPatientsPaginatedAndSorted(Pageable pageable) {
        return patientRepository.findAll(pageable);
    }
    
    
    
}
