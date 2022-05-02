/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author S542408
 */
public class PizzaDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(PizzaCost.LARGE.getPrice());
        for(PizzaCost pizza:PizzaCost.values()){
         System.out.println(pizza+" pizza is of $"+pizza.getPrice());
         }
        
        PizzaCost valueOf = PizzaCost.valueOf("SMALL");
        System.out.println(valueOf.getPrice());
        
        for(PizzaCost pizza:PizzaCost.values()){
         System.out.println(pizza+" pizza is of $"+pizza.getPrice()+" PriceAfterDiscount is: "+pizza.priceAfterDiscount());
         }
        System.out.println("******************");
      for(PizzaCost p:PizzaCost.values()) {
            boolean weekend = PizzaDriver.isWeekend(2021, 3, 14); 
           if(weekend) {
                System.out.println(p+" pizza with discount: "+p.priceAfterDiscount());
           }
           else {
               System.out.println(p+" pizza without discount: "+p.getPrice());
           }
      }
    }
    private static boolean isWeekend(int year, int month, int day) {
        //LocalDate
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek today = date.getDayOfWeek();
        if(today.equals(DayOfWeek.SATURDAY) || today.equals(DayOfWeek.SUNDAY)) {
            return true ;
        }
        else {
             return false ;
        }
        
    }
    
}
