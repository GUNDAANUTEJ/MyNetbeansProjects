/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author S542408
 */
public class TransactionNGTest {
    
    public TransactionNGTest() {
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
     * Test of getAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testGetAdditionalCharges() {
        System.out.println("getAdditionalCharges");
        Transaction instance = null;
        double expResult = 0.0;
        double result = instance.getAdditionalCharges();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testSetAdditionalCharges() {
        System.out.println("setAdditionalCharges");
        double additionalCharges = 0.0;
        Transaction instance = null;
        instance.setAdditionalCharges(additionalCharges);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = null;
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Transaction.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        Transaction instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Transaction.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Transaction instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Transaction.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Transaction instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionTime method, of class Transaction.
     */
    @Test
    public void testGetTransactionTime() {
        System.out.println("getTransactionTime");
        Transaction instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTransactionTime();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransactionTime method, of class Transaction.
     */
    @Test
    public void testSetTransactionTime() {
        System.out.println("setTransactionTime");
        LocalDateTime transactionTime = null;
        Transaction instance = null;
        instance.setTransactionTime(transactionTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionType method, of class Transaction.
     */
    @Test
    public void testGetTransactionType() {
        System.out.println("getTransactionType");
        Transaction instance = null;
        String expResult = "";
        String result = instance.getTransactionType();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransactionType method, of class Transaction.
     */
    @Test
    public void testSetTransactionType() {
        System.out.println("setTransactionType");
        String transactionType = "";
        Transaction instance = null;
        instance.setTransactionType(transactionType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaction instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
