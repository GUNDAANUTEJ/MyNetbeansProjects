/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author S542408
 */
public class Testtest {

   
 
        public static double bonus( int electronicScore, double writtenScore) {
         return  (10/100)*(electronicScore+writtenScore)*2  ;
                }
        
         public static void main(String[] args) {
             
             double val = bonus(13,12);
             System.out.println(Math.round(val*100)/100);
         }
    
}
    

