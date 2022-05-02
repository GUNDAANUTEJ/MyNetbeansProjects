/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

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

    public String getDob() {
        return dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name:  " + lastName + ", " + firstName + "\n" + "Date of Birth: " + dob;
    }

}

