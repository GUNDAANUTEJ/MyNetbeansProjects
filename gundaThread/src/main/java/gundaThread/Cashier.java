/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gundaThread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author S542408
 */
public class Cashier implements Runnable {
    
    Wallmart objWallmart = new Wallmart();
    String name;
    ReentrantLock reloc;
    Condition cd;
    public Cashier(ReentrantLock reloc, String name, Wallmart objWallmart){
        this.reloc = reloc;
        this.name = name;
        this.objWallmart = objWallmart;
    }
    @Override
    public void run() {
        boolean isLock = reloc.tryLock();
        if(isLock) {
        } else {  
        reloc.lock();
        }
        try{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of items for " + name + ":");
        int length = scnr.nextInt();
        String[] items = new String[length];
        double[] price = new double[length];
        for(int i = 0; i < length; i++) 
        {
         System.out.println("Enter the name of item number for "+ name + " " +
                    (i + 1) +": ");
        items[i] = scnr.next();
        System.out.println("Enter the price of "+ items[i] +" for " + name + " :");
        price[i] = scnr.nextDouble();
        }
        objWallmart.totalPrice(items, price);
        }catch(Exception e) {    
        }
            finally{
                reloc.unlock();
  }  
 }
}
