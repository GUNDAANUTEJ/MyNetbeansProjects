/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionsdemo;

/**
 *
 * @author S542408
 */
public class ConditionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=3 ;
         int j=4;
          System.out.println("bit wise and: "+(i&j));
          System.out.println("bit wise or: "+ (i|j));
          
          int amount = 210;
          double taxRate = 0.795;
          double totalAmount = amount + (amount*taxRate/100);
           System.out.println("total amount: "+ totalAmount  );
           Math.round(totalAmount);
            System.out.println(Math.round(totalAmount));
            
            
            
           
           
           
           
    }
    
}
