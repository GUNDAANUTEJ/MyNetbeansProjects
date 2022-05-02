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
public class HourlyEmployee extends Employee {

    private double wageRate;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String SSN, double wageRate, int hoursWorked) {
        super(firstName, lastName, SSN);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calcSalary() {
    return wageRate * hoursWorked;
      }

    @Override
    public String getFullName() {
        return super.getFirstName() + " " + super.getLastName();
    }

    @Override
    public String toString() {
        return super.toString() + " $" + calcSalary();
    }
//ToDo write another subclass for hourlyEmployee class(SalaryedEmployee)
}
