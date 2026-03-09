/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springrestmysql.service;

import com.mycompany.springrestmysql.model.Log;
import java.util.List;
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
public class LogServiceNGTest {
    
    public LogServiceNGTest() {
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
     * Test of getLogs method, of class LogService.
     */
    @Test
    public void testGetLogs() {
        System.out.println("getLogs");
        LogService instance = new LogServiceImpl();
        List expResult = null;
        List result = instance.getLogs();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLog method, of class LogService.
     */
    @Test
    public void testGetLog() {
        System.out.println("getLog");
        Long id = null;
        LogService instance = new LogServiceImpl();
        Log expResult = null;
        Log result = instance.getLog(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of findByFirstName method, of class LogService.
     */
    @Test
    public void testFindByFirstName() {
        System.out.println("findByFirstName");
        String firstName = "";
        LogService instance = new LogServiceImpl();
        List expResult = null;
        List result = instance.findByFirstName(firstName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveLog method, of class LogService.
     */
    @Test
    public void testSaveLog() {
        System.out.println("saveLog");
        Log log = null;
        LogService instance = new LogServiceImpl();
        Log expResult = null;
        Log result = instance.saveLog(log);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class LogServiceImpl implements LogService {

        public List<Log> getLogs() {
            return null;
        }

        public Log getLog(Long id) {
            return null;
        }

        public List<Log> findByFirstName(String firstName) {
            return null;
        }

        public Log saveLog(Log log) {
            return null;
        }
    }
    
}
