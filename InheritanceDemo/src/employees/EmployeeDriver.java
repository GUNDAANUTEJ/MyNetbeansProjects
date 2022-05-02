/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anu","Tej","123-456-789");
        System.out.println(emp1);
        
        HourlyEmployee hrsEmp = new HourlyEmployee("Mani", "Deep", "345-678-901", 9, 10);
        System.out.println(hrsEmp);
        
       // emp1 = hrsEmp ; // assignning a subcls instance in super cls.
        //super cls instance  -- polymorphism substitution
        // hrsEmp = emp1 ;   // illegal
        Employee emp2 = new  HourlyEmployee("anuii", "Dedfweep", "355-678-901", 8, 9);
        System.out.println(emp2.toString());
        
            }
    
}
