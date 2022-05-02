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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Employee emp = new  ContractEmployee("Aby", "Bob");
//        System.out.println(emp);
//        System.out.println(emp.calcSalary()); 
        
        Employee emp1 = new SalariedEmployee("Anu", "Tej");
        System.out.println(emp1);
        System.out.println(emp1.calcSalary()); 
  }
    
}