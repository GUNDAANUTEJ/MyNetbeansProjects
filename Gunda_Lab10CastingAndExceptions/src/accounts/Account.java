/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package accounts;

import interfaces.Operations;
import java.util.ArrayList;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public abstract class Account implements Operations {

    /**
     * Instance variable customer
     */
    public Customer customer;

    /**
     * Instance variable accountNumber
     */
    
    public long accountNumber;

    /**
     * Instance variable balance
     */
    public double balance;

    /**
     * Instance variable transactions
     */
    public ArrayList<Transaction> transactions;

    /**
     * constructor with 2 arguments
     * @param customer Customer details
     * @param accountNumber Account Number
     */
    public Account(Customer customer, long accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }

    /**
     * Gets account number
     * @return account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets Balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets Customer Details
     * @return customer details
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets transactions
     * @return transaction
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Abstract method makeTransaction
     * @param transaction Transaction
     * @return Final balance after making transaction
     * @throws Exception
     */
    
    @Override
    public abstract double makeTransaction(Transaction transaction) throws Exception;

    /**
     * toString
     * @return toString
     */
    @Override
    public String toString() {
        return customer.toString() + "\nAccount Number: " + accountNumber + "\n";
    }

    /**
     * Generates statement
     * @return Statement
     */
    @Override
    public String generateStatement() {
        String s1 = "";
        String s2 = "--------------------------------------------" + "-----------------------------------\n"
                
                + String.format("%-24s", "Transaction Type")
                
                + String.format("%-24s", "Transaction Time")
                
                + String.format("%-16s", "Amount")
                
                + String.format("%-25s", "Additional Charges")
                
                + "Status\n";
        
        for (Transaction t : transactions) {
            s1 = s1 + t.toString() + "\n";
        }
        return s2 + s1 + "--------------"
                
                + "----------------------------------------------"
                
                + "-------------------";
    }

}

