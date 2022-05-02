/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BalanceAccount;

/**
 *
 * @author S542408
 */
public class withdrawRunnable implements Runnable {
    private static int DELAY = 10;
    private BankAccount account;
    private double amount;
    private int count;
    
     public withdrawRunnable(BankAccount account, double amount, int count){
        this.account = account;
        this.amount = amount;
        this.count = count;
       
    }
     
    public void run()
    {
        try {
            account.withdraw(amount);
            Thread.sleep(DELAY);
        }
        catch(Exception e) {}
        }
    }

