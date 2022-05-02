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
public abstract class GraduateAssistant implements Payable {
    private String Name ;
    private String lName ;

    public GraduateAssistant(String Name, String lName) {
        this.Name = Name;
        this.lName = lName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "GraduateAssistant{" + "Name=" + Name + ", lName=" + lName + '}';
    }
    public abstract String getInitials() ;
}
