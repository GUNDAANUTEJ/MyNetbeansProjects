/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Customer {
      private String dob;
    private String firstName;
    private String lastName;

    public Customer(String dob, String firstName, String lastName) {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
 
    /**
     *  get dob
     * @return     
     */ 
    public String getDob() {
        return dob;
    }
    
    /**
     * set Dob
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
     /**
     * get first name
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }
      
     /**
     * set first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get last name
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name:" + lastName + ", " + firstName + "\nDate of Birth: " + dob;
    }

}
