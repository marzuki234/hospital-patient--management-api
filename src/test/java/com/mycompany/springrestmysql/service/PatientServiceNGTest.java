/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.Patient;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class PatientServiceNGTest {
    
    public PatientServiceNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPatients method, of class PatientService.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        PatientService instance = new PatientServiceImpl();
        List expResult = null;
        List result = instance.getPatients();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientService.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Long id = null;
        PatientService instance = new PatientServiceImpl();
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(result, expResult);
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
        List expResult = null;
        List result = instance.findByFirstName(firstName);
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        Page expResult = null;
        Page result = instance.findPatientsPaginatedAndSorted(pageable);
        assertEquals(result, expResult);
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
