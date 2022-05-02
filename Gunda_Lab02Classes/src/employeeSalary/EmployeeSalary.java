/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
/**
 * Creating class regarding salary of an Employees.
 */
public class EmployeeSalary {

    /**
     * HourlyRate for an employee.
     */
    private double hourlyRate;

    /**
     * InsuranceRate for an employee.
     */
    private double insuranceRate;

    /**
     * TaxRate for an Employee.
     */
    private double taxRate;

    /**
     * PfRate for an Employee.
     */
    private double pfRate;

    /**
     * HOURS of an Employee.
     */
    private final int HOURS = 40;

    /**
     * Constructor for an EmployeeSalary
    *
     */
    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double pfRate) {
        /**
         * @param hourlyRate
         * @param insuranceRate
         * @param taxRate
         * @param pfRate
     *
         */
        this.hourlyRate = hourlyRate;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
        this.pfRate = pfRate;
    }

    /**
     * Constructor of EmployeeSalary
     */
    public EmployeeSalary() {
    }

    /**
     * Getter method for hourlyRate
     *
     * @return hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Getter method for insuranceRate
     *
     * @return insuranceRate
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * Getter method for taxRate
     *
     * @return taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Getter method for pfRate
     *
     * @return pfRate
     */
    public double getPfRate() {
        return pfRate;
    }

    /**
     * Getter method the HOURS
     *
     * @return HOURS
     */
    public int getHOURS() {
        return HOURS;
    }

    /**
     * Setter method for hourlyRate
     *
     * @param hourlyRate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Setter method for insuranceRate
     *
     * @param insuranceRate
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /**
     * Setter method for taxRate of the employee
     *
     * @param taxRate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Setter method for pfRate
     *
     * @param pfRate
     */
    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }

    /**
     * Calculating monthly salary calcMonthlySalary()
     *
     * @return calcMonthlySalary
     */
    public double calcMonthlySalary() {
        return 4 * HOURS * hourlyRate;
    }

    /**
     * Calculating monthly insurance calcMonthlyInsurance
     *
     * @return calcMonthlyInsurance
     */
    public double calcMonthlyInsurance() {
        return this.calcMonthlySalary() * (insuranceRate) / 100;
    }

    /**
     * Calculating monthly pf Amount calcMonthlyPfAmount
     *
     * @return calcMonthlyPfAmount
     */
    public double calcMonthlyPfAmount() {
        return this.calcMonthlySalary() * (pfRate) / 100;
    }

    /**
     * Calculating Annual gross salary calcAnnualGrossSalary
     *
     * @return calcAnnualGrossSalary
     */
    public double calcAnnualGrossSalary(double bonus) {
        return bonus + (this.calcMonthlySalary() * 12);
    }

    /**
     * Calculating Annual Net Pay
     *
     * @return calcAnnualNetPay
     */
    public double calcAnnualNetPay(double bonus) {
        return this.calcAnnualGrossSalary(bonus) - (this.calcAnnualGrossSalary(bonus) * taxRate / 100) - (this.calcMonthlyInsurance() * 12) - (this.calcMonthlyPfAmount() * 12);
    }

    /**
     * toString method
     *
     * @return values
     */
    public String toString() {
        return "hourlyRate: " + hourlyRate + "," + " insuranceRate: " + insuranceRate + "," + " taxRate: " + taxRate + "," + " pfRate: " + pfRate + "," + " HOURS: " + HOURS;
    }

}
