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
public class FullTimeEmployee extends HourlyEmployee {
    private boolean is41kapproved;
            
     private boolean isHealthInsuranceAprooved;

    public FullTimeEmployee(boolean is41kapproved, boolean isHealthInsuranceAprooved, String firstName, String lastName, String SSN, double wageRate, int hoursWorked) {
        super(firstName, lastName, SSN, wageRate, hoursWorked);
        this.is41kapproved = is41kapproved;
        this.isHealthInsuranceAprooved = isHealthInsuranceAprooved;
    }

    FullTimeEmployee() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isIs41kapproved() {
        return is41kapproved;
    }

    public boolean isIsHealthInsuranceAprooved() {
        return isHealthInsuranceAprooved;
    }

    public void setIs41kapproved(boolean is41kapproved) {
        this.is41kapproved = is41kapproved;
    }

    public void setIsHealthInsuranceAprooved(boolean isHealthInsuranceAprooved) {
        this.isHealthInsuranceAprooved = isHealthInsuranceAprooved;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "is41kapproved=" + is41kapproved + ", isHealthInsuranceAprooved=" + isHealthInsuranceAprooved + '}';
    }
            
}
