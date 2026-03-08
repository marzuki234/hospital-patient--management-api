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

/**
 *
 * @author user
 */
public class PatientServiceImplTest {
    
    public PatientServiceImplTest() {
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
     * Test of getPatients method, of class PatientServiceImpl.
     */
    @Test
    public void testGetPatients() {
        //fail("The test case is a prototype.");
        System.out.println("getPatients");
       //System.exit(1);
        PatientServiceImpl instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.getPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientServiceImpl.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Long id = null;
        PatientServiceImpl instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of savePatient method, of class PatientServiceImpl.
     */
    @Test
    public void testSavePatient() {
        System.out.println("savePatient");
        Patient patient = null;
        PatientServiceImpl instance = null;
        Patient expResult = null;
        Patient result = instance.savePatient(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientServiceImpl.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        Patient patient = null;
        PatientServiceImpl instance = null;
        instance.deletePatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByFirstName method, of class PatientServiceImpl.
     */
    @Test
    public void testFindByFirstName() {
        System.out.println("findByFirstName");
        String firstName = "";
        PatientServiceImpl instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.findByFirstName(firstName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPatientsPaginatedAndSorted method, of class PatientServiceImpl.
     */
    @Test
    public void testFindPatientsPaginatedAndSorted() {
        System.out.println("findPatientsPaginatedAndSorted");
        Pageable pageable = null;
        PatientServiceImpl instance = null;
        Page<Patient> expResult = null;
        Page<Patient> result = instance.findPatientsPaginatedAndSorted(pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
