/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author S542408
 */
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculator calc = new Calculator(5,0);
        
        try {
            System.out.println(calc.add());
            System.out.println(calc.sub());
            System.out.println(calc.mul());
           
        
        }  
         catch(Exception ex){
            System.out.println(ex+" "+ex.getMessage() );
        }
        
     
        finally{
            System.out.println("Finally always executes");
        }
         System.out.println(calc.div());
        
        
    }
    
}
