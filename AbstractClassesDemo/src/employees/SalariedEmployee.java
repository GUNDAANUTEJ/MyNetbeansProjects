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
public class SalariedEmployee extends Employee {
    
    private String fName;
    private String lName ;
    public SalariedEmployee(String fName, String lName) {
       super(fName , lName);
    }
     @Override
    public double calcSalary() {
        return 10;
}
}