/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

import java.util.Scanner;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */

/**
 * Driver class and instances for EmployeeSalary.
 */
public class EmployeeSalaryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create new Scanner
        Scanner scan = new Scanner(System.in); 

        //  printing the statements
        System.out.println("Testing the EmployeeSalary class:");

        System.out.println("Enter the hourly pay rate of the Employee: $");

        double hourly = scan.nextDouble();

        System.out.println("Enter the insurance rate of the Employee in percentage: ");

        double insurance = scan.nextDouble();

        System.out.println("Enter the tax rate of the Employee in percentage: ");

        double tax = scan.nextDouble();

        System.out.println("Enter the pf rate of the Employee in percentage: ");

        double provident = scan.nextDouble();

        System.out.println("Enter the bonus of the Employee: ");

        double bonus = scan.nextDouble();

        System.out.println("The details of empSalObj1 object are as follows:");

        /**
         * obj1 values for the EmployeeSalary.
         */
        EmployeeSalary empSalObj1 = new EmployeeSalary(hourly, insurance, tax, provident);

        System.out.println(empSalObj1.toString());

        System.out.println("The monthly salary of the Employee is: $" + empSalObj1.calcMonthlySalary());

        System.out.println("The monthly insurance of the Employee is: $" + empSalObj1.calcMonthlyInsurance());

        System.out.println("The monthly pf of the Employee is: $" + empSalObj1.calcMonthlyPfAmount());

        System.out.println("The annual gross salary of the Employee is: $" + empSalObj1.calcAnnualGrossSalary(bonus));

        System.out.println("The gross annual net pay of the Employee is: $" + empSalObj1.calcAnnualNetPay(bonus));

        System.out.println("**************************************************");

        /**
         * creating object obj2
         */
        EmployeeSalary empSalObj2 = new EmployeeSalary();

        /**
         * printing values
         */
        System.out.println("The details of empSalObj2 object are as follows:");

        System.out.println(empSalObj2.toString());

        System.out.println("The monthly salary of the Employee is: $" + empSalObj2.calcMonthlySalary());

        System.out.println("The monthly insurance of the Employee is: $" + empSalObj2.calcMonthlyInsurance());

        System.out.println("The monthly pf of the Employee is: $" + empSalObj2.calcMonthlyPfAmount());

        System.out.println("The annual gross salary of the Employee is: $" + empSalObj2.calcAnnualGrossSalary(bonus));

        System.out.println("The gross annual net pay of the Employee is: $" + empSalObj2.calcAnnualNetPay(bonus));

        empSalObj2.setHourlyRate(35.0);

        empSalObj2.setInsuranceRate(12.50);

        empSalObj2.setTaxRate(11.45);

        empSalObj2.setPfRate(10.5);

        System.out.println("Enter the new bonus of the Employee: ");

        double bonus2 = scan.nextDouble();

        System.out.println("The details of empSalObj2 object are as follows:");

        System.out.println(empSalObj2.toString());

        System.out.println("The monthly salary of the Employee is: $" + empSalObj2.calcMonthlySalary());

        System.out.println("The monthly insurance of the Employee is: $" + empSalObj2.calcMonthlyInsurance());

        System.out.println("The monthly pf of the Employee is: $" + empSalObj2.calcMonthlyPfAmount());

        System.out.println("The annual gross salary of the Employee is: $" + empSalObj2.calcAnnualGrossSalary(bonus2));

        System.out.println("The gross annual net pay of the Employee is: $" + empSalObj2.calcAnnualNetPay(bonus2));

        
    }

}
