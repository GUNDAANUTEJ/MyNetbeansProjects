/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author S542408
 */
public interface Payable {
    public static final double FULL_SALARY = 750; 
    public static final double TAX_RATE =12 ;
    
    public abstract double calcSalary() ;
    public abstract double calcTax() ;
    public abstract double calcSalaryAfterTaxes() ;
}
