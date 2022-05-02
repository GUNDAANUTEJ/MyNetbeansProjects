/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scandemo;

/**
 *
 * @author S542408
 */
public class ScanDEMO {
    
      private int foodId ;
      private double foodCost;
      private String foodName ;
       
      public ScanDEMO(int foodId, double foodCost, String foodName) {
          this.foodId = foodId;
          this.foodCost = foodCost;
          this.foodName = foodName;
      }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        
        ScanDEMO item1 = new ScanDEMO(213, 340.5, "biryani" );
        
        
        
       
      
    }
    
}
