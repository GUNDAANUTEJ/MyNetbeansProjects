/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
public class AccountNGTest {
    
    public AccountNGTest() {
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
     * Test of getAccountNumber method, of class Account.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        long expResult = 4567890123L;
        long result = account.getAccountNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccountNumber method, of class Account.
     */
    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        long accountNumber = 0L;
        Account instance = null;
        instance.setAccountNumber(accountNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Account.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        Customer expResult = c1;
        Customer result = account.getCustomer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCustomer method, of class Account.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Account instance = null;
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
         System.out.println("getBalance");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        double expResult = 0.0;
        double result = account.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 0.0;
        Account instance = null;
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransaction method, of class Account.
     */
    @Test
    public void testGetTransaction() {
        System.out.println("getTransactions");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        ArrayList<Transaction> expResult = new ArrayList<Transaction>();
        ArrayList<Transaction> result = account.getTransaction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTransaction method, of class Account.
     */
    @Test
    public void testSetTransaction() {
        System.out.println("setTransaction");
        ArrayList<Transaction> transaction = null;
        Account instance = null;
        instance.setTransaction(transaction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasLimitedWithdrawals method, of class Account.
     */
    @Test
    public void testIsHasLimitedWithdrawals() {
        System.out.println("isHasLimitedWithdrawals");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        boolean expResult = true;
        boolean result = account.isHasLimitedWithdrawals();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHasLimitedWithdrawals method, of class Account.
     */
    @Test
    public void testSetHasLimitedWithdrawals() {
        System.out.println("setHasLimitedWithdrawals");
        boolean hasLimitedWithdrawals = false;
        Account instance = null;
        instance.setHasLimitedWithdrawals(hasLimitedWithdrawals);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateStatement method, of class Account.
     */
    @Test
    public void testGenerateStatement() {
        System.out.println("generateStatement");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account instance = new Account(4567890123L, c1, true);
        String expResult = "Name:  Stark, Anthony\n"
                + "Date of Birth:02/22/1982\n"
                + "\nAccount Number: +4567890123\n"
                + "\nAccount Information:	Interest rate:  "
                + "%\nTransaction Limit For Withdrawal:No Limit "
                + "\n-------------------------------------------------------------------------------"
                + "\nTransaction Type"
                + "      "
                + "Transaction Time    "
                + "Amount    "
                + "Additional Charges    "
                + "Status\n"
                + "----------------------------------\n"
                + "currentBal:0.0 "
                + "Interest: $0.00";
        String result = instance.generateStatement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNoofWithdrawals method, of class Account.
     */
    @Test
    public void testGetNoofWithdrawals() {
         System.out.println("getNoofWithdrawals");
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account account = new Account(4567890123L, c1, true);
        int expResult = 0;
        int result = account.getNoofWithdrawals();
        assertEquals(expResult, result);
    }

    /**
     * Test of makeTransaction method, of class Account.
     */
    @Test
    public void testMakeTransaction() {
        System.out.println("makeTransaction");
        LocalDateTime tranTime = LocalDateTime.of(2019, 9, 02, 8, 42, 02);
        Transaction transaction = new Transaction("DEPOSIT", 1000.00, tranTime);
        Customer c1 = new Customer("02/22/1982", "Anthony", "Stark");
        Account instance = new Account(4567890123L, c1, true);
        String expResult = "Transaction Successful";
        String result = instance.makeTransaction(transaction);
        assertEquals(expResult, result);
    }
    
}
