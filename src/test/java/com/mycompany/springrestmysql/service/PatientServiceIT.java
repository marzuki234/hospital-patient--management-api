/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.Patient;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatientServiceIT {
    
    public PatientServiceIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPatients method, of class PatientService.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        PatientService instance = new PatientServiceImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.getPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientService.
     */
    @Test
    public void testGetPatient() {
        log.info("marzukitest");
        System.out.println("getPatient");
        Long id = null;
        PatientService instance = new PatientServiceImpl();
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByFirstName method, of class PatientService.
     */
    @Test
    public void testFindByFirstName() {
        System.out.println("findByFirstName");
        String firstName = "";
        PatientService instance = new PatientServiceImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.findByFirstName(firstName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePatient method, of class PatientService.
     */
    @Test
    public void testSavePatient() {
        System.out.println("savePatient");
        Patient patient = null;
        PatientService instance = new PatientServiceImpl();
        Patient expResult = null;
        Patient result = instance.savePatient(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientService.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        Patient patient = null;
        PatientService instance = new PatientServiceImpl();
        instance.deletePatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPatientsPaginatedAndSorted method, of class PatientService.
     */
    @Test
    public void testFindPatientsPaginatedAndSorted() {
        System.out.println("findPatientsPaginatedAndSorted");
        Pageable pageable = null;
        PatientService instance = new PatientServiceImpl();
        Page<Patient> expResult = null;
        Page<Patient> result = instance.findPatientsPaginatedAndSorted(pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PatientServiceImpl implements PatientService {

        public List<Patient> getPatients() {
            return null;
        }

        public Patient getPatient(Long id) {
            return null;
        }

        public List<Patient> findByFirstName(String firstName) {
            return null;
        }

        public Patient savePatient(Patient patient) {
            return null;
        }

        public void deletePatient(Patient patient) {
        }

        public Page<Patient> findPatientsPaginatedAndSorted(Pageable pageable) {
            return null;
        }
    }
    
}
