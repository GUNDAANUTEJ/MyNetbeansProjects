/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gundaThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

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
        Wallmart objWallmart = new Wallmart();
        ReentrantLock reloc = new ReentrantLock();
        Condition cd = reloc.newCondition();
        Cashier cr1 = new Cashier(reloc, "Anu", objWallmart);
        Cashier cr2 = new Cashier(reloc, "Teja", objWallmart);
        Thread t1 = new Thread(cr1);
        Thread t2 = new Thread(cr2);
        t1.start();
        t2.start();
    }
    
}