/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Threads Concept

package BalanceAccount;

/**
 *
 * @author S542408
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount account = new BankAccount();
        final double AMOUNT  = 100;
        final int REPETITIONS = 1000;
        DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
        withdrawRunnable  w = new withdrawRunnable(account, AMOUNT, REPETITIONS);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();
        
    }
    
}
