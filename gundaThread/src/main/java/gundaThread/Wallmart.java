/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gundaThread;

/**
 *
 * @author S542408
 */
public class Wallmart {
    
    private double total;
    private double count;
    
    public Wallmart() {
        this.total = 0.0;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
    
    
    public synchronized void totalPrice(String[] items, double[] price){
        total = 0;
        for(int i = 0; i < items.length; i++) {
            double newTotal = price[i];
            total += newTotal;
            count++;     
        }
        System.out.println("Total price = "+total);
    }
} 