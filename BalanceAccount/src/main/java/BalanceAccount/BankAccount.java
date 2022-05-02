/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BalanceAccount;

import java.util.concurrent.locks.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S542408
 */
public class BankAccount  
{
      private double balance;
      private Lock balanceChangeLock;
      private Condition sufficientFundsCondition;
       

        public BankAccount() 
        {
    
        balance = 0;
        balanceChangeLock = new ReentrantLock();
        sufficientFundsCondition =  balanceChangeLock.newCondition();
        
        }
        public double get(double balance) 
        {
             return balance;
        } 
        public void set(double balance) 
        {
            this.balance = balance ;
        }
        
public void deposit(double amount)
{

        balanceChangeLock.lock();
    try {
        System.out.println("Depositing: " + amount);
        double newBalance = balance + amount ;
        System.out.println("New balance is "+ newBalance);
        balance = newBalance;
        sufficientFundsCondition.signalAll();
    }  finally {
        //sufficientFundsCondition.signalAll();
        balanceChangeLock.unlock();
    }
}
public void withdraw(double amount) throws InterruptedException
{
    
    
    try 
    {
        while(balance < amount)
        {
            sufficientFundsCondition.await();
        }
System.out.println("withdrawing: "+ amount);
        double newBalance = balance  - amount ;
        System.out. println();
    }
             
    finally 
    {
      
        balanceChangeLock.unlock();
    }
}
}
