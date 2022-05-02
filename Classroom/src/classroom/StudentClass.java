/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class StudentClass {
    private int Id;
    private String name;
    private double gpa;

    public StudentClass(int Id, String name, double gpa) {
        this.Id = Id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentClass{" + "Id=" + Id + ", name=" + name + ", gpa=" + gpa + '}';
    }
    
    
}
